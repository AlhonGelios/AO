package org.apache.poi.poifs.macros;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.RLEDecompressingInputStream;
import org.apache.poi.util.StringUtil;

public class VBAMacroReader implements Closeable {

   protected static final String VBA_PROJECT_OOXML = "vbaProject.bin";
   protected static final String VBA_PROJECT_POIFS = "VBA";
   private NPOIFSFileSystem fs;
   private static final int EOF = -1;
   private static final int VERSION_INDEPENDENT_TERMINATOR = 16;
   private static final int VERSION_DEPENDENT_TERMINATOR = 43;
   private static final int PROJECTVERSION = 9;
   private static final int PROJECTCODEPAGE = 3;
   private static final int STREAMNAME = 26;
   private static final int MODULEOFFSET = 49;
   private static final int MODULETYPE_PROCEDURAL = 33;
   private static final int MODULETYPE_DOCUMENT_CLASS_OR_DESIGNER = 34;
   private static final int PROJECTLCID = 2;


   public VBAMacroReader(InputStream rstream) throws IOException {
      PushbackInputStream stream = new PushbackInputStream(rstream, 8);
      byte[] header8 = IOUtils.peekFirst8Bytes(stream);
      if(NPOIFSFileSystem.hasPOIFSHeader(header8)) {
         this.fs = new NPOIFSFileSystem(stream);
      } else {
         this.openOOXML(stream);
      }

   }

   public VBAMacroReader(File file) throws IOException {
      try {
         this.fs = new NPOIFSFileSystem(file);
      } catch (OfficeXmlFileException var3) {
         this.openOOXML(new FileInputStream(file));
      }

   }

   public VBAMacroReader(NPOIFSFileSystem fs) {
      this.fs = fs;
   }

   private void openOOXML(InputStream zipFile) throws IOException {
      ZipInputStream zis = new ZipInputStream(zipFile);

      ZipEntry zipEntry;
      do {
         if((zipEntry = zis.getNextEntry()) == null) {
            zis.close();
            throw new IllegalArgumentException("No VBA project found");
         }
      } while(!StringUtil.endsWithIgnoreCase(zipEntry.getName(), "vbaProject.bin"));

      try {
         this.fs = new NPOIFSFileSystem(zis);
      } catch (IOException var5) {
         zis.close();
         throw var5;
      }
   }

   public void close() throws IOException {
      this.fs.close();
      this.fs = null;
   }

   public Map readMacros() throws IOException {
      VBAMacroReader.ModuleMap modules = new VBAMacroReader.ModuleMap();
      this.findMacros(this.fs.getRoot(), modules);
      HashMap moduleSources = new HashMap();
      Iterator i$ = modules.entrySet().iterator();

      while(i$.hasNext()) {
         Entry entry = (Entry)i$.next();
         VBAMacroReader.Module module = (VBAMacroReader.Module)entry.getValue();
         if(module.buf != null && module.buf.length > 0) {
            moduleSources.put(entry.getKey(), new String(module.buf, modules.charset));
         }
      }

      return moduleSources;
   }

   protected void findMacros(DirectoryNode dir, VBAMacroReader.ModuleMap modules) throws IOException {
      if("VBA".equalsIgnoreCase(dir.getName())) {
         this.readMacros(dir, modules);
      } else {
         Iterator i$ = dir.iterator();

         while(i$.hasNext()) {
            org.apache.poi.poifs.filesystem.Entry child = (org.apache.poi.poifs.filesystem.Entry)i$.next();
            if(child instanceof DirectoryNode) {
               this.findMacros((DirectoryNode)child, modules);
            }
         }
      }

   }

   private static String readString(InputStream stream, int length, Charset charset) throws IOException {
      byte[] buffer = new byte[length];
      int count = stream.read(buffer);
      return new String(buffer, 0, count, charset);
   }

   private static void readModule(RLEDecompressingInputStream in, String streamName, VBAMacroReader.ModuleMap modules) throws IOException {
      int moduleOffset = in.readInt();
      VBAMacroReader.Module module = (VBAMacroReader.Module)modules.get(streamName);
      if(module == null) {
         module = new VBAMacroReader.Module();
         module.offset = Integer.valueOf(moduleOffset);
         modules.put(streamName, module);
      } else {
         RLEDecompressingInputStream stream = new RLEDecompressingInputStream(new ByteArrayInputStream(module.buf, moduleOffset, module.buf.length - moduleOffset));
         module.read(stream);
         stream.close();
      }

   }

   private static void readModule(DocumentInputStream dis, String name, VBAMacroReader.ModuleMap modules) throws IOException {
      VBAMacroReader.Module module = (VBAMacroReader.Module)modules.get(name);
      if(module == null) {
         module = new VBAMacroReader.Module();
         modules.put(name, module);
         module.read(dis);
      } else {
         if(module.offset == null) {
            throw new IOException("Module offset for \'" + name + "\' was never read.");
         }

         long skippedBytes = dis.skip((long)module.offset.intValue());
         if(skippedBytes != (long)module.offset.intValue()) {
            throw new IOException("tried to skip " + module.offset + " bytes, but actually skipped " + skippedBytes + " bytes");
         }

         RLEDecompressingInputStream stream = new RLEDecompressingInputStream(dis);
         module.read(stream);
         stream.close();
      }

   }

   private static void trySkip(InputStream in, long n) throws IOException {
      long skippedBytes = in.skip(n);
      if(skippedBytes != n) {
         if(skippedBytes < 0L) {
            throw new IOException("Tried skipping " + n + " bytes, but no bytes were skipped. " + "The end of the stream has been reached or the stream is closed.");
         } else {
            throw new IOException("Tried skipping " + n + " bytes, but only " + skippedBytes + " bytes were skipped. " + "This should never happen.");
         }
      }
   }

   protected void readMacros(DirectoryNode macroDir, VBAMacroReader.ModuleMap modules) throws IOException {
      Iterator i$ = macroDir.iterator();

      while(i$.hasNext()) {
         org.apache.poi.poifs.filesystem.Entry entry = (org.apache.poi.poifs.filesystem.Entry)i$.next();
         if(entry instanceof DocumentNode) {
            String name = entry.getName();
            DocumentNode document = (DocumentNode)entry;
            DocumentInputStream dis = new DocumentInputStream(document);

            try {
               if("dir".equalsIgnoreCase(name)) {
                  RLEDecompressingInputStream in = new RLEDecompressingInputStream(dis);
                  String streamName = null;
                  byte recordId = 0;

                  try {
                     while(true) {
                        int recordId1 = in.readShort();
                        if(-1 == recordId1 || 16 == recordId1) {
                           break;
                        }

                        int e = in.readInt();
                        switch(recordId1) {
                        case 3:
                           int codepage = in.readShort();
                           modules.charset = Charset.forName("Cp" + codepage);
                           break;
                        case 9:
                           trySkip(in, 6L);
                           break;
                        case 26:
                           streamName = readString(in, e, modules.charset);
                           break;
                        case 49:
                           readModule(in, streamName, modules);
                           break;
                        default:
                           trySkip(in, (long)e);
                        }
                     }
                  } catch (IOException var21) {
                     throw new IOException("Error occurred while reading macros at section id " + recordId + " (" + HexDump.shortToHex(recordId) + ")", var21);
                  } finally {
                     in.close();
                  }
               } else if(!StringUtil.startsWithIgnoreCase(name, "__SRP") && !StringUtil.startsWithIgnoreCase(name, "_VBA_PROJECT")) {
                  readModule(dis, name, modules);
               }
            } finally {
               dis.close();
            }
         }
      }

   }

   protected static class Module {

      Integer offset;
      byte[] buf;


      void read(InputStream in) throws IOException {
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         IOUtils.copy(in, out);
         out.close();
         this.buf = out.toByteArray();
      }
   }

   protected static class ModuleMap extends HashMap {

      Charset charset = Charset.forName("Cp1252");


   }
}
