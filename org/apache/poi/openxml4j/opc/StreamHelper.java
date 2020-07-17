package org.apache.poi.openxml4j.opc;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public final class StreamHelper {

   private static final TransformerFactory transformerFactory = TransformerFactory.newInstance();


   private static synchronized Transformer getIdentityTransformer() throws TransformerException {
      return transformerFactory.newTransformer();
   }

   public static boolean saveXmlInStream(Document xmlContent, final OutputStream outStream) {
      try {
         Transformer e = getIdentityTransformer();
         DOMSource xmlSource = new DOMSource(xmlContent);
         StreamResult outputTarget = new StreamResult(new FilterOutputStream(outStream) {
            public void write(byte[] b, int off, int len) throws IOException {
               this.out.write(b, off, len);
            }
            public void close() throws IOException {
               this.out.flush();
            }
         });
         e.setOutputProperty("encoding", "UTF-8");
         e.setOutputProperty("indent", "yes");
         e.setOutputProperty("standalone", "yes");
         e.transform(xmlSource, outputTarget);
         return true;
      } catch (TransformerException var5) {
         return false;
      }
   }

   public static boolean copyStream(InputStream inStream, OutputStream outStream) {
      try {
         byte[] e = new byte[1024];

         int bytesRead;
         while((bytesRead = inStream.read(e)) >= 0) {
            outStream.write(e, 0, bytesRead);
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

}
