package org.apache.poi.openxml4j.opc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.StreamHelper;
import org.apache.poi.openxml4j.opc.internal.ContentTypeManager;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.w3c.dom.Document;

public class ZipContentTypeManager extends ContentTypeManager {

   private static POILogger logger = POILogFactory.getLogger(ZipContentTypeManager.class);


   public ZipContentTypeManager(InputStream in, OPCPackage pkg) throws InvalidFormatException {
      super(in, pkg);
   }

   public boolean saveImpl(Document content, OutputStream out) {
      ZipOutputStream zos = null;
      if(out instanceof ZipOutputStream) {
         zos = (ZipOutputStream)out;
      } else {
         zos = new ZipOutputStream(out);
      }

      ZipEntry partEntry = new ZipEntry("[Content_Types].xml");

      try {
         zos.putNextEntry(partEntry);
         if(!StreamHelper.saveXmlInStream(content, zos)) {
            return false;
         } else {
            zos.closeEntry();
            return true;
         }
      } catch (IOException var6) {
         logger.log(7, new Object[]{"Cannot write: [Content_Types].xml in Zip !", var6});
         return false;
      }
   }

}
