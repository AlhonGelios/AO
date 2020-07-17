package org.apache.poi.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageProperties;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.util.IOUtils;

public final class PackageHelper {

   public static OPCPackage open(InputStream is) throws IOException {
      try {
         return OPCPackage.open(is);
      } catch (InvalidFormatException var2) {
         throw new POIXMLException(var2);
      }
   }

   public static OPCPackage clone(OPCPackage pkg, File file) throws OpenXML4JException, IOException {
      String path = file.getAbsolutePath();
      OPCPackage dest = OPCPackage.create(path);
      PackageRelationshipCollection rels = pkg.getRelationships();
      Iterator i$ = rels.iterator();

      while(i$.hasNext()) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         PackagePart part = pkg.getPart(rel);
         if(rel.getRelationshipType().equals("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties")) {
            copyProperties(pkg.getPackageProperties(), dest.getPackageProperties());
         } else {
            dest.addRelationship(part.getPartName(), rel.getTargetMode(), rel.getRelationshipType());
            PackagePart part_tgt = dest.createPart(part.getPartName(), part.getContentType());
            OutputStream out = part_tgt.getOutputStream();
            IOUtils.copy(part.getInputStream(), out);
            out.close();
            if(part.hasRelationships()) {
               copy(pkg, part, dest, part_tgt);
            }
         }
      }

      dest.close();
      (new File(path)).deleteOnExit();
      return OPCPackage.open(path);
   }

   private static void copy(OPCPackage pkg, PackagePart part, OPCPackage tgt, PackagePart part_tgt) throws OpenXML4JException, IOException {
      PackageRelationshipCollection rels = part.getRelationships();
      if(rels != null) {
         Iterator i$ = rels.iterator();

         while(i$.hasNext()) {
            PackageRelationship rel = (PackageRelationship)i$.next();
            if(rel.getTargetMode() == TargetMode.EXTERNAL) {
               part_tgt.addExternalRelationship(rel.getTargetURI().toString(), rel.getRelationshipType(), rel.getId());
            } else {
               URI uri = rel.getTargetURI();
               if(uri.getRawFragment() != null) {
                  part_tgt.addRelationship(uri, rel.getTargetMode(), rel.getRelationshipType(), rel.getId());
               } else {
                  PackagePartName relName = PackagingURIHelper.createPartName(rel.getTargetURI());
                  PackagePart p = pkg.getPart(relName);
                  part_tgt.addRelationship(p.getPartName(), rel.getTargetMode(), rel.getRelationshipType(), rel.getId());
                  if(!tgt.containPart(p.getPartName())) {
                     PackagePart dest = tgt.createPart(p.getPartName(), p.getContentType());
                     OutputStream out = dest.getOutputStream();
                     IOUtils.copy(p.getInputStream(), out);
                     out.close();
                     copy(pkg, p, tgt, dest);
                  }
               }
            }
         }
      }

   }

   private static void copyProperties(PackageProperties src, PackageProperties tgt) {
      tgt.setCategoryProperty((String)src.getCategoryProperty().getValue());
      tgt.setContentStatusProperty((String)src.getContentStatusProperty().getValue());
      tgt.setContentTypeProperty((String)src.getContentTypeProperty().getValue());
      tgt.setCreatorProperty((String)src.getCreatorProperty().getValue());
      tgt.setDescriptionProperty((String)src.getDescriptionProperty().getValue());
      tgt.setIdentifierProperty((String)src.getIdentifierProperty().getValue());
      tgt.setKeywordsProperty((String)src.getKeywordsProperty().getValue());
      tgt.setLanguageProperty((String)src.getLanguageProperty().getValue());
      tgt.setRevisionProperty((String)src.getRevisionProperty().getValue());
      tgt.setSubjectProperty((String)src.getSubjectProperty().getValue());
      tgt.setTitleProperty((String)src.getTitleProperty().getValue());
      tgt.setVersionProperty((String)src.getVersionProperty().getValue());
   }
}
