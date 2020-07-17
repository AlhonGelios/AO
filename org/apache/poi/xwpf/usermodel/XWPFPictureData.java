package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFRelation;

public class XWPFPictureData extends POIXMLDocumentPart {

   protected static final POIXMLRelation[] RELATIONS = new POIXMLRelation[13];
   private Long checksum;


   protected XWPFPictureData() {
      this.checksum = null;
   }

   public XWPFPictureData(PackagePart part) {
      super(part);
      this.checksum = null;
   }

   @Deprecated
   public XWPFPictureData(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   protected void onDocumentRead() throws IOException {
      super.onDocumentRead();
   }

   public byte[] getData() {
      try {
         return IOUtils.toByteArray(this.getPackagePart().getInputStream());
      } catch (IOException var2) {
         throw new POIXMLException(var2);
      }
   }

   public String getFileName() {
      String name = this.getPackagePart().getPartName().getName();
      return name.substring(name.lastIndexOf(47) + 1);
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

   public Long getChecksum() {
      if(this.checksum == null) {
         InputStream is = null;

         byte[] data;
         try {
            is = this.getPackagePart().getInputStream();
            data = IOUtils.toByteArray(is);
         } catch (IOException var10) {
            throw new POIXMLException(var10);
         } finally {
            try {
               if(is != null) {
                  is.close();
               }
            } catch (IOException var11) {
               throw new POIXMLException(var11);
            }

         }

         this.checksum = Long.valueOf(IOUtils.calculateChecksum(data));
      }

      return this.checksum;
   }

   public boolean equals(Object obj) {
      if(obj == this) {
         return true;
      } else if(obj == null) {
         return false;
      } else if(!(obj instanceof XWPFPictureData)) {
         return false;
      } else {
         XWPFPictureData picData = (XWPFPictureData)obj;
         PackagePart foreignPackagePart = picData.getPackagePart();
         PackagePart ownPackagePart = this.getPackagePart();
         if((foreignPackagePart == null || ownPackagePart != null) && (foreignPackagePart != null || ownPackagePart == null)) {
            if(ownPackagePart != null) {
               OPCPackage foreignChecksum = foreignPackagePart.getPackage();
               OPCPackage localChecksum = ownPackagePart.getPackage();
               if(foreignChecksum != null && localChecksum == null || foreignChecksum == null && localChecksum != null) {
                  return false;
               }

               if(localChecksum != null && !localChecksum.equals(foreignChecksum)) {
                  return false;
               }
            }

            Long foreignChecksum1 = picData.getChecksum();
            Long localChecksum1 = this.getChecksum();
            return !localChecksum1.equals(foreignChecksum1)?false:Arrays.equals(this.getData(), picData.getData());
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return this.getChecksum().hashCode();
   }

   protected void prepareForCommit() {}

   static {
      RELATIONS[2] = XWPFRelation.IMAGE_EMF;
      RELATIONS[3] = XWPFRelation.IMAGE_WMF;
      RELATIONS[4] = XWPFRelation.IMAGE_PICT;
      RELATIONS[5] = XWPFRelation.IMAGE_JPEG;
      RELATIONS[6] = XWPFRelation.IMAGE_PNG;
      RELATIONS[7] = XWPFRelation.IMAGE_DIB;
      RELATIONS[8] = XWPFRelation.IMAGE_GIF;
      RELATIONS[9] = XWPFRelation.IMAGE_TIFF;
      RELATIONS[10] = XWPFRelation.IMAGE_EPS;
      RELATIONS[11] = XWPFRelation.IMAGE_BMP;
      RELATIONS[12] = XWPFRelation.IMAGE_WPG;
   }
}
