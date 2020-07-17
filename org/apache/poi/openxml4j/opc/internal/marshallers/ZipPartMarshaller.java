package org.apache.poi.openxml4j.opc.internal.marshallers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.StreamHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.PartMarshaller;
import org.apache.poi.openxml4j.opc.internal.ZipHelper;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public final class ZipPartMarshaller implements PartMarshaller {

   private static POILogger logger = POILogFactory.getLogger(ZipPartMarshaller.class);


   public boolean marshall(PackagePart part, OutputStream os) throws OpenXML4JException {
      if(!(os instanceof ZipOutputStream)) {
         logger.log(7, new Object[]{"Unexpected class " + os.getClass().getName()});
         throw new OpenXML4JException("ZipOutputStream expected !");
      } else if(part.getSize() == 0L && part.getPartName().getName().equals(XSSFRelation.SHARED_STRINGS.getDefaultFileName())) {
         return true;
      } else {
         ZipOutputStream zos = (ZipOutputStream)os;
         ZipEntry partEntry = new ZipEntry(ZipHelper.getZipItemNameFromOPCName(part.getPartName().getURI().getPath()));

         try {
            zos.putNextEntry(partEntry);
            InputStream relationshipPartName = part.getInputStream();
            byte[] buff = new byte[8192];

            while(true) {
               if(relationshipPartName.available() > 0) {
                  int resultRead = relationshipPartName.read(buff);
                  if(resultRead != -1) {
                     zos.write(buff, 0, resultRead);
                     continue;
                  }
               }

               zos.closeEntry();
               break;
            }
         } catch (IOException var8) {
            logger.log(7, new Object[]{"Cannot write: " + part.getPartName() + ": in ZIP", var8});
            return false;
         }

         if(part.hasRelationships()) {
            PackagePartName relationshipPartName1 = PackagingURIHelper.getRelationshipPartName(part.getPartName());
            marshallRelationshipPart(part.getRelationships(), relationshipPartName1, zos);
         }

         return true;
      }
   }

   public static boolean marshallRelationshipPart(PackageRelationshipCollection rels, PackagePartName relPartName, ZipOutputStream zos) {
      Document xmlOutDoc = DocumentHelper.createDocument();
      Element root = xmlOutDoc.createElementNS("http://schemas.openxmlformats.org/package/2006/relationships", "Relationships");
      xmlOutDoc.appendChild(root);
      URI sourcePartURI = PackagingURIHelper.getSourcePartUriFromRelationshipPartUri(relPartName.getURI());

      Element relElem;
      String targetValue;
      for(Iterator ctEntry = rels.iterator(); ctEntry.hasNext(); relElem.setAttribute("Target", targetValue)) {
         PackageRelationship e = (PackageRelationship)ctEntry.next();
         relElem = xmlOutDoc.createElementNS("http://schemas.openxmlformats.org/package/2006/relationships", "Relationship");
         root.appendChild(relElem);
         relElem.setAttribute("Id", e.getId());
         relElem.setAttribute("Type", e.getRelationshipType());
         URI uri = e.getTargetURI();
         if(e.getTargetMode() == TargetMode.EXTERNAL) {
            targetValue = uri.toString();
            relElem.setAttribute("TargetMode", "External");
         } else {
            URI targetURI = e.getTargetURI();
            targetValue = PackagingURIHelper.relativizeURI(sourcePartURI, targetURI, true).toString();
         }
      }

      xmlOutDoc.normalize();
      ZipEntry ctEntry1 = new ZipEntry(ZipHelper.getZipURIFromOPCName(relPartName.getURI().toASCIIString()).getPath());

      try {
         zos.putNextEntry(ctEntry1);
         if(!StreamHelper.saveXmlInStream(xmlOutDoc, zos)) {
            return false;
         } else {
            zos.closeEntry();
            return true;
         }
      } catch (IOException var12) {
         logger.log(7, new Object[]{"Cannot create zip entry " + relPartName, var12});
         return false;
      }
   }

}
