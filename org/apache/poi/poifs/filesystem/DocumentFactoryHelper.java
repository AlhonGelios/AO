package org.apache.poi.poifs.filesystem;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.GeneralSecurityException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.common.POIFSConstants;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.util.IOUtils;

public class DocumentFactoryHelper {

   public static InputStream getDecryptedStream(final NPOIFSFileSystem fs, String password) throws IOException {
      EncryptionInfo info = new EncryptionInfo(fs);
      Decryptor d = Decryptor.getInstance(info);

      try {
         boolean e = false;
         if(password != null && d.verifyPassword(password)) {
            e = true;
         }

         if(!e && d.verifyPassword("VelvetSweatshop")) {
            e = true;
         }

         if(e) {
            return new FilterInputStream(d.getDataStream(fs.getRoot())) {
               public void close() throws IOException {
                  fs.close();
                  super.close();
               }
            };
         } else if(password != null) {
            throw new EncryptedDocumentException("Password incorrect");
         } else {
            throw new EncryptedDocumentException("The supplied spreadsheet is protected, but no password was supplied");
         }
      } catch (GeneralSecurityException var5) {
         throw new IOException(var5);
      }
   }

   public static boolean hasOOXMLHeader(InputStream inp) throws IOException {
      inp.mark(4);
      byte[] header = new byte[4];
      int bytesRead = IOUtils.readFully(inp, header);
      if(inp instanceof PushbackInputStream) {
         PushbackInputStream pin = (PushbackInputStream)inp;
         pin.unread(header, 0, bytesRead);
      } else {
         inp.reset();
      }

      return bytesRead == 4 && header[0] == POIFSConstants.OOXML_FILE_HEADER[0] && header[1] == POIFSConstants.OOXML_FILE_HEADER[1] && header[2] == POIFSConstants.OOXML_FILE_HEADER[2] && header[3] == POIFSConstants.OOXML_FILE_HEADER[3];
   }
}
