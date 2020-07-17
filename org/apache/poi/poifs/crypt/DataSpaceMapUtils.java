package org.apache.poi.poifs.crypt;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.standard.EncryptionRecord;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSWriterEvent;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.StringUtil;

public class DataSpaceMapUtils {

   public static void addDefaultDataSpace(DirectoryEntry dir) throws IOException {
      DataSpaceMapUtils.DataSpaceMapEntry dsme = new DataSpaceMapUtils.DataSpaceMapEntry(new int[]{0}, new String[]{"EncryptedPackage"}, "StrongEncryptionDataSpace");
      DataSpaceMapUtils.DataSpaceMap dsm = new DataSpaceMapUtils.DataSpaceMap(new DataSpaceMapUtils.DataSpaceMapEntry[]{dsme});
      createEncryptionEntry(dir, "DataSpaces/DataSpaceMap", dsm);
      DataSpaceMapUtils.DataSpaceDefinition dsd = new DataSpaceMapUtils.DataSpaceDefinition(new String[]{"StrongEncryptionTransform"});
      createEncryptionEntry(dir, "DataSpaces/DataSpaceInfo/StrongEncryptionDataSpace", dsd);
      DataSpaceMapUtils.TransformInfoHeader tih = new DataSpaceMapUtils.TransformInfoHeader(1, "{FF9A3F03-56EF-4613-BDD5-5A41C1D07246}", "Microsoft.Container.EncryptionTransform", 1, 0, 1, 0, 1, 0);
      DataSpaceMapUtils.IRMDSTransformInfo irm = new DataSpaceMapUtils.IRMDSTransformInfo(tih, 0, (String)null);
      createEncryptionEntry(dir, "DataSpaces/TransformInfo/StrongEncryptionTransform/Primary", irm);
      DataSpaceMapUtils.DataSpaceVersionInfo dsvi = new DataSpaceMapUtils.DataSpaceVersionInfo("Microsoft.Container.DataSpaces", 1, 0, 1, 0, 1, 0);
      createEncryptionEntry(dir, "DataSpaces/Version", dsvi);
   }

   public static DocumentEntry createEncryptionEntry(DirectoryEntry dir, String path, EncryptionRecord out) throws IOException {
      String[] parts = path.split("/");

      for(int buf = 0; buf < parts.length - 1; ++buf) {
         dir = dir.hasEntry(parts[buf])?(DirectoryEntry)dir.getEntry(parts[buf]):dir.createDirectory(parts[buf]);
      }

      final byte[] var7 = new byte[5000];
      LittleEndianByteArrayOutputStream bos = new LittleEndianByteArrayOutputStream(var7, 0);
      out.write(bos);
      String fileName = parts[parts.length - 1];
      if(dir.hasEntry(fileName)) {
         dir.getEntry(fileName).delete();
      }

      return dir.createDocument(fileName, bos.getWriteIndex(), new POIFSWriterListener() {
         public void processPOIFSWriterEvent(POIFSWriterEvent event) {
            try {
               event.getStream().write(var7, 0, event.getLimit());
            } catch (IOException var3) {
               throw new EncryptedDocumentException(var3);
            }
         }
      });
   }

   public static String readUnicodeLPP4(LittleEndianInput is) {
      int length = is.readInt();
      if(length % 2 != 0) {
         throw new EncryptedDocumentException("UNICODE-LP-P4 structure is a multiple of 4 bytes. If Padding is present, it MUST be exactly 2 bytes long");
      } else {
         String result = StringUtil.readUnicodeLE(is, length / 2);
         if(length % 4 == 2) {
            is.readShort();
         }

         return result;
      }
   }

   public static void writeUnicodeLPP4(LittleEndianOutput os, String string) {
      byte[] buf = StringUtil.getToUnicodeLE(string);
      os.writeInt(buf.length);
      os.write(buf);
      if(buf.length % 4 == 2) {
         os.writeShort(0);
      }

   }

   public static String readUtf8LPP4(LittleEndianInput is) {
      int length = is.readInt();
      if(length != 0 && length != 4) {
         byte[] data = new byte[length];
         is.readFully(data);
         int scratchedBytes = length % 4;
         if(scratchedBytes > 0) {
            for(int i = 0; i < 4 - scratchedBytes; ++i) {
               is.readByte();
            }
         }

         return new String(data, 0, data.length, Charset.forName("UTF-8"));
      } else {
         is.readInt();
         return length == 0?null:"";
      }
   }

   public static void writeUtf8LPP4(LittleEndianOutput os, String str) {
      if(str != null && !"".equals(str)) {
         byte[] buf = str.getBytes(Charset.forName("UTF-8"));
         os.writeInt(buf.length);
         os.write(buf);
         int scratchBytes = buf.length % 4;
         if(scratchBytes > 0) {
            for(int i = 0; i < 4 - scratchBytes; ++i) {
               os.writeByte(0);
            }
         }
      } else {
         os.writeInt(str == null?0:4);
         os.writeInt(0);
      }

   }

   public static class DataSpaceMap implements EncryptionRecord {

      DataSpaceMapUtils.DataSpaceMapEntry[] entries;


      public DataSpaceMap(DataSpaceMapUtils.DataSpaceMapEntry[] entries) {
         this.entries = (DataSpaceMapUtils.DataSpaceMapEntry[])entries.clone();
      }

      public DataSpaceMap(LittleEndianInput is) {
         is.readInt();
         int entryCount = is.readInt();
         this.entries = new DataSpaceMapUtils.DataSpaceMapEntry[entryCount];

         for(int i = 0; i < entryCount; ++i) {
            this.entries[i] = new DataSpaceMapUtils.DataSpaceMapEntry(is);
         }

      }

      public void write(LittleEndianByteArrayOutputStream os) {
         os.writeInt(8);
         os.writeInt(this.entries.length);
         DataSpaceMapUtils.DataSpaceMapEntry[] arr$ = this.entries;
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            DataSpaceMapUtils.DataSpaceMapEntry dsme = arr$[i$];
            dsme.write(os);
         }

      }
   }

   public static class DataSpaceDefinition implements EncryptionRecord {

      String[] transformer;


      public DataSpaceDefinition(String[] transformer) {
         this.transformer = (String[])transformer.clone();
      }

      public DataSpaceDefinition(LittleEndianInput is) {
         is.readInt();
         int transformReferenceCount = is.readInt();
         this.transformer = new String[transformReferenceCount];

         for(int i = 0; i < transformReferenceCount; ++i) {
            this.transformer[i] = DataSpaceMapUtils.readUnicodeLPP4(is);
         }

      }

      public void write(LittleEndianByteArrayOutputStream bos) {
         bos.writeInt(8);
         bos.writeInt(this.transformer.length);
         String[] arr$ = this.transformer;
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            String str = arr$[i$];
            DataSpaceMapUtils.writeUnicodeLPP4(bos, str);
         }

      }
   }

   public static class IRMDSTransformInfo implements EncryptionRecord {

      DataSpaceMapUtils.TransformInfoHeader transformInfoHeader;
      int extensibilityHeader;
      String xrMLLicense;


      public IRMDSTransformInfo(DataSpaceMapUtils.TransformInfoHeader transformInfoHeader, int extensibilityHeader, String xrMLLicense) {
         this.transformInfoHeader = transformInfoHeader;
         this.extensibilityHeader = extensibilityHeader;
         this.xrMLLicense = xrMLLicense;
      }

      public IRMDSTransformInfo(LittleEndianInput is) {
         this.transformInfoHeader = new DataSpaceMapUtils.TransformInfoHeader(is);
         this.extensibilityHeader = is.readInt();
         this.xrMLLicense = DataSpaceMapUtils.readUtf8LPP4(is);
      }

      public void write(LittleEndianByteArrayOutputStream bos) {
         this.transformInfoHeader.write(bos);
         bos.writeInt(this.extensibilityHeader);
         DataSpaceMapUtils.writeUtf8LPP4(bos, this.xrMLLicense);
         bos.writeInt(4);
      }
   }

   public static class DataSpaceVersionInfo implements EncryptionRecord {

      String featureIdentifier;
      int readerVersionMajor = 1;
      int readerVersionMinor = 0;
      int updaterVersionMajor = 1;
      int updaterVersionMinor = 0;
      int writerVersionMajor = 1;
      int writerVersionMinor = 0;


      public DataSpaceVersionInfo(LittleEndianInput is) {
         this.featureIdentifier = DataSpaceMapUtils.readUnicodeLPP4(is);
         this.readerVersionMajor = is.readShort();
         this.readerVersionMinor = is.readShort();
         this.updaterVersionMajor = is.readShort();
         this.updaterVersionMinor = is.readShort();
         this.writerVersionMajor = is.readShort();
         this.writerVersionMinor = is.readShort();
      }

      public DataSpaceVersionInfo(String featureIdentifier, int readerVersionMajor, int readerVersionMinor, int updaterVersionMajor, int updaterVersionMinor, int writerVersionMajor, int writerVersionMinor) {
         this.featureIdentifier = featureIdentifier;
         this.readerVersionMajor = readerVersionMajor;
         this.readerVersionMinor = readerVersionMinor;
         this.updaterVersionMajor = updaterVersionMajor;
         this.updaterVersionMinor = updaterVersionMinor;
         this.writerVersionMajor = writerVersionMajor;
         this.writerVersionMinor = writerVersionMinor;
      }

      public void write(LittleEndianByteArrayOutputStream bos) {
         DataSpaceMapUtils.writeUnicodeLPP4(bos, this.featureIdentifier);
         bos.writeShort(this.readerVersionMajor);
         bos.writeShort(this.readerVersionMinor);
         bos.writeShort(this.updaterVersionMajor);
         bos.writeShort(this.updaterVersionMinor);
         bos.writeShort(this.writerVersionMajor);
         bos.writeShort(this.writerVersionMinor);
      }
   }

   public static class TransformInfoHeader implements EncryptionRecord {

      int transformType;
      String transformerId;
      String transformerName;
      int readerVersionMajor = 1;
      int readerVersionMinor = 0;
      int updaterVersionMajor = 1;
      int updaterVersionMinor = 0;
      int writerVersionMajor = 1;
      int writerVersionMinor = 0;


      public TransformInfoHeader(int transformType, String transformerId, String transformerName, int readerVersionMajor, int readerVersionMinor, int updaterVersionMajor, int updaterVersionMinor, int writerVersionMajor, int writerVersionMinor) {
         this.transformType = transformType;
         this.transformerId = transformerId;
         this.transformerName = transformerName;
         this.readerVersionMajor = readerVersionMajor;
         this.readerVersionMinor = readerVersionMinor;
         this.updaterVersionMajor = updaterVersionMajor;
         this.updaterVersionMinor = updaterVersionMinor;
         this.writerVersionMajor = writerVersionMajor;
         this.writerVersionMinor = writerVersionMinor;
      }

      public TransformInfoHeader(LittleEndianInput is) {
         is.readInt();
         this.transformType = is.readInt();
         this.transformerId = DataSpaceMapUtils.readUnicodeLPP4(is);
         this.transformerName = DataSpaceMapUtils.readUnicodeLPP4(is);
         this.readerVersionMajor = is.readShort();
         this.readerVersionMinor = is.readShort();
         this.updaterVersionMajor = is.readShort();
         this.updaterVersionMinor = is.readShort();
         this.writerVersionMajor = is.readShort();
         this.writerVersionMinor = is.readShort();
      }

      public void write(LittleEndianByteArrayOutputStream bos) {
         int start = bos.getWriteIndex();
         LittleEndianOutput sizeOut = bos.createDelayedOutput(4);
         bos.writeInt(this.transformType);
         DataSpaceMapUtils.writeUnicodeLPP4(bos, this.transformerId);
         sizeOut.writeInt(bos.getWriteIndex() - start);
         DataSpaceMapUtils.writeUnicodeLPP4(bos, this.transformerName);
         bos.writeShort(this.readerVersionMajor);
         bos.writeShort(this.readerVersionMinor);
         bos.writeShort(this.updaterVersionMajor);
         bos.writeShort(this.updaterVersionMinor);
         bos.writeShort(this.writerVersionMajor);
         bos.writeShort(this.writerVersionMinor);
      }
   }

   public static class DataSpaceMapEntry implements EncryptionRecord {

      final int[] referenceComponentType;
      final String[] referenceComponent;
      final String dataSpaceName;


      public DataSpaceMapEntry(int[] referenceComponentType, String[] referenceComponent, String dataSpaceName) {
         this.referenceComponentType = (int[])referenceComponentType.clone();
         this.referenceComponent = (String[])referenceComponent.clone();
         this.dataSpaceName = dataSpaceName;
      }

      public DataSpaceMapEntry(LittleEndianInput is) {
         is.readInt();
         int referenceComponentCount = is.readInt();
         this.referenceComponentType = new int[referenceComponentCount];
         this.referenceComponent = new String[referenceComponentCount];

         for(int i = 0; i < referenceComponentCount; ++i) {
            this.referenceComponentType[i] = is.readInt();
            this.referenceComponent[i] = DataSpaceMapUtils.readUnicodeLPP4(is);
         }

         this.dataSpaceName = DataSpaceMapUtils.readUnicodeLPP4(is);
      }

      public void write(LittleEndianByteArrayOutputStream os) {
         int start = os.getWriteIndex();
         LittleEndianOutput sizeOut = os.createDelayedOutput(4);
         os.writeInt(this.referenceComponent.length);

         for(int i = 0; i < this.referenceComponent.length; ++i) {
            os.writeInt(this.referenceComponentType[i]);
            DataSpaceMapUtils.writeUnicodeLPP4(os, this.referenceComponent[i]);
         }

         DataSpaceMapUtils.writeUnicodeLPP4(os, this.dataSpaceName);
         sizeOut.writeInt(os.getWriteIndex() - start);
      }
   }
}
