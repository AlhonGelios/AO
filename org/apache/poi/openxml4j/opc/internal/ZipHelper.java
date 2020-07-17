package org.apache.poi.openxml4j.opc.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.openxml4j.exceptions.OLE2NotOfficeXmlFileException;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.ZipPackage;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.poifs.common.POIFSConstants;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndian;

public final class ZipHelper {

   private static final String FORWARD_SLASH = "/";
   public static final int READ_WRITE_FILE_BUFFER_SIZE = 8192;


   public static ZipEntry getCorePropertiesZipEntry(ZipPackage pkg) {
      PackageRelationship corePropsRel = pkg.getRelationshipsByType("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties").getRelationship(0);
      return corePropsRel == null?null:new ZipEntry(corePropsRel.getTargetURI().getPath());
   }

   public static ZipEntry getContentTypeZipEntry(ZipPackage pkg) {
      Enumeration entries = pkg.getZipArchive().getEntries();

      ZipEntry entry;
      do {
         if(!entries.hasMoreElements()) {
            return null;
         }

         entry = (ZipEntry)entries.nextElement();
      } while(!entry.getName().equals("[Content_Types].xml"));

      return entry;
   }

   public static String getOPCNameFromZipItemName(String zipItemName) {
      if(zipItemName == null) {
         throw new IllegalArgumentException("zipItemName");
      } else {
         return zipItemName.startsWith("/")?zipItemName:"/" + zipItemName;
      }
   }

   public static String getZipItemNameFromOPCName(String opcItemName) {
      if(opcItemName == null) {
         throw new IllegalArgumentException("opcItemName");
      } else {
         String retVal;
         for(retVal = opcItemName; retVal.startsWith("/"); retVal = retVal.substring(1)) {
            ;
         }

         return retVal;
      }
   }

   public static URI getZipURIFromOPCName(String opcItemName) {
      if(opcItemName == null) {
         throw new IllegalArgumentException("opcItemName");
      } else {
         String retVal;
         for(retVal = opcItemName; retVal.startsWith("/"); retVal = retVal.substring(1)) {
            ;
         }

         try {
            return new URI(retVal);
         } catch (URISyntaxException var3) {
            return null;
         }
      }
   }

   public static void verifyZipHeader(InputStream stream) throws NotOfficeXmlFileException, IOException {
      byte[] data = new byte[8];
      IOUtils.readFully(stream, data);
      long signature = LittleEndian.getLong(data);
      if(signature == -2226271756974174256L) {
         throw new OLE2NotOfficeXmlFileException("The supplied data appears to be in the OLE2 Format. You are calling the part of POI that deals with OOXML (Office Open XML) Documents. You need to call a different part of POI to process this data (eg HSSF instead of XSSF)");
      } else {
         byte[] RAW_XML_FILE_HEADER = POIFSConstants.RAW_XML_FILE_HEADER;
         if(data[0] == RAW_XML_FILE_HEADER[0] && data[1] == RAW_XML_FILE_HEADER[1] && data[2] == RAW_XML_FILE_HEADER[2] && data[3] == RAW_XML_FILE_HEADER[3] && data[4] == RAW_XML_FILE_HEADER[4]) {
            throw new NotOfficeXmlFileException("The supplied data appears to be a raw XML file. Formats such as Office 2003 XML are not supported");
         } else {
            if(stream instanceof PushbackInputStream) {
               ((PushbackInputStream)stream).unread(data);
            } else if(stream.markSupported()) {
               stream.reset();
            } else if(stream instanceof FileInputStream) {
               ;
            }

         }
      }
   }

   private static InputStream prepareToCheckHeader(InputStream stream) {
      if(stream instanceof PushbackInputStream) {
         return stream;
      } else if(stream.markSupported()) {
         stream.mark(8);
         return stream;
      } else {
         return new PushbackInputStream(stream, 8);
      }
   }

   public static ZipSecureFile.ThresholdInputStream openZipStream(InputStream stream) throws IOException {
      InputStream checkedStream = prepareToCheckHeader(stream);
      verifyZipHeader(checkedStream);
      ZipInputStream zis = new ZipInputStream(checkedStream);
      return ZipSecureFile.addThreshold(zis);
   }

   public static ZipFile openZipFile(File file) throws IOException, NotOfficeXmlFileException {
      if(!file.exists()) {
         throw new FileNotFoundException("File does not exist");
      } else if(file.isDirectory()) {
         throw new IOException("File is a directory");
      } else {
         FileInputStream input = new FileInputStream(file);

         try {
            verifyZipHeader(input);
         } finally {
            input.close();
         }

         return new ZipSecureFile(file);
      }
   }

   public static ZipFile openZipFile(String path) throws IOException {
      return openZipFile(new File(path));
   }
}
