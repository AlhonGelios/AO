package org.apache.poi.ss.usermodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentFactoryHelper;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkbookFactory {

   public static Workbook create(POIFSFileSystem fs) throws IOException {
      return new HSSFWorkbook(fs);
   }

   public static Workbook create(NPOIFSFileSystem fs) throws IOException {
      try {
         return create(fs, (String)null);
      } catch (InvalidFormatException var2) {
         throw new IOException(var2);
      }
   }

   private static Workbook create(NPOIFSFileSystem fs, String password) throws IOException, InvalidFormatException {
      DirectoryNode root = fs.getRoot();
      if(root.hasEntry("EncryptedPackage")) {
         InputStream stream1 = DocumentFactoryHelper.getDecryptedStream(fs, password);
         OPCPackage pkg = OPCPackage.open(stream1);
         return create(pkg);
      } else {
         if(password != null) {
            Biff8EncryptionKey.setCurrentUserPassword(password);
         }

         HSSFWorkbook stream;
         try {
            stream = new HSSFWorkbook(root, true);
         } finally {
            Biff8EncryptionKey.setCurrentUserPassword((String)null);
         }

         return stream;
      }
   }

   public static Workbook create(OPCPackage pkg) throws IOException {
      return new XSSFWorkbook(pkg);
   }

   public static Workbook create(InputStream inp) throws IOException, InvalidFormatException, EncryptedDocumentException {
      return create(inp, (String)null);
   }

   public static Workbook create(InputStream inp, String password) throws IOException, InvalidFormatException, EncryptedDocumentException {
      if(!((InputStream)inp).markSupported()) {
         inp = new PushbackInputStream((InputStream)inp, 8);
      }

      byte[] header8 = IOUtils.peekFirst8Bytes((InputStream)inp);
      if(NPOIFSFileSystem.hasPOIFSHeader(header8)) {
         NPOIFSFileSystem fs = new NPOIFSFileSystem((InputStream)inp);
         return create(fs, password);
      } else if(DocumentFactoryHelper.hasOOXMLHeader((InputStream)inp)) {
         return new XSSFWorkbook(OPCPackage.open((InputStream)inp));
      } else {
         throw new InvalidFormatException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
      }
   }

   public static Workbook create(File file) throws IOException, InvalidFormatException, EncryptedDocumentException {
      return create(file, (String)null);
   }

   public static Workbook create(File file, String password) throws IOException, InvalidFormatException, EncryptedDocumentException {
      return create(file, password, false);
   }

   public static Workbook create(File file, String password, boolean readOnly) throws IOException, InvalidFormatException, EncryptedDocumentException {
      if(!file.exists()) {
         throw new FileNotFoundException(file.toString());
      } else {
         try {
            NPOIFSFileSystem e = new NPOIFSFileSystem(file, readOnly);

            try {
               return create(e, password);
            } catch (RuntimeException var8) {
               e.close();
               throw var8;
            }
         } catch (OfficeXmlFileException var9) {
            OPCPackage pkg = OPCPackage.open(file, readOnly?PackageAccess.READ:PackageAccess.READ_WRITE);

            try {
               return new XSSFWorkbook(pkg);
            } catch (IOException var6) {
               pkg.revert();
               throw var6;
            } catch (RuntimeException var7) {
               pkg.revert();
               throw var7;
            }
         }
      }
   }
}
