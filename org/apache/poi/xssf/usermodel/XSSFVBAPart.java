package org.apache.poi.xssf.usermodel;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;

public class XSSFVBAPart extends POIXMLDocumentPart {

   protected XSSFVBAPart() {}

   protected XSSFVBAPart(PackagePart part) {
      super(part);
   }

   @Deprecated
   protected XSSFVBAPart(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   protected void prepareForCommit() {}
}
