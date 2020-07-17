package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFRelation;

public class XSSFPictureData extends POIXMLDocumentPart implements PictureData {

   protected static final POIXMLRelation[] RELATIONS = new POIXMLRelation[13];


   protected XSSFPictureData() {}

   protected XSSFPictureData(PackagePart part) {
      super(part);
   }

   @Deprecated
   protected XSSFPictureData(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   public byte[] getData() {
      try {
         return IOUtils.toByteArray(this.getPackagePart().getInputStream());
      } catch (IOException var2) {
         throw new POIXMLException(var2);
      }
   }

   public String suggestFileExtension() {
      return this.getPackagePart().getPartName().getExtension();
   }

   public int getPictureType() {
      String contentType = this.getPackagePart().getContentType();

      for(int i = 0; i < RELATIONS.length; ++i) {
         if(RELATIONS[i] != null && RELATIONS[i].getContentType().equals(contentType)) {
            return i;
         }
      }

      return 0;
   }

   public String getMimeType() {
      return this.getPackagePart().getContentType();
   }

   protected void prepareForCommit() {}

   static {
      RELATIONS[2] = XSSFRelation.IMAGE_EMF;
      RELATIONS[3] = XSSFRelation.IMAGE_WMF;
      RELATIONS[4] = XSSFRelation.IMAGE_PICT;
      RELATIONS[5] = XSSFRelation.IMAGE_JPEG;
      RELATIONS[6] = XSSFRelation.IMAGE_PNG;
      RELATIONS[7] = XSSFRelation.IMAGE_DIB;
      RELATIONS[8] = XSSFRelation.IMAGE_GIF;
      RELATIONS[9] = XSSFRelation.IMAGE_TIFF;
      RELATIONS[10] = XSSFRelation.IMAGE_EPS;
      RELATIONS[11] = XSSFRelation.IMAGE_BMP;
      RELATIONS[12] = XSSFRelation.IMAGE_WPG;
   }
}
