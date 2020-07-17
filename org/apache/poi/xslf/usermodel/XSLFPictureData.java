package org.apache.poi.xslf.usermodel;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.hslf.blip.EMF.NativeHeader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XSLFRelation;

public final class XSLFPictureData extends POIXMLDocumentPart implements PictureData {

   private static final POILogger logger = POILogFactory.getLogger(XSLFPictureData.class);
   private Long checksum;
   private Dimension origSize;
   private int index;


   protected XSLFPictureData() {
      this.checksum = null;
      this.origSize = null;
      this.index = -1;
   }

   public XSLFPictureData(PackagePart part) {
      super(part);
      this.checksum = null;
      this.origSize = null;
      this.index = -1;
   }

   @Deprecated
   public XSLFPictureData(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   public InputStream getInputStream() throws IOException {
      return this.getPackagePart().getInputStream();
   }

   public byte[] getData() {
      try {
         return IOUtils.toByteArray(this.getInputStream());
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

   public byte[] getChecksum() {
      this.cacheProperties();
      byte[] cs = new byte[8];
      LittleEndian.putLong(cs, 0, this.checksum.longValue());
      return cs;
   }

   public Dimension getImageDimension() {
      this.cacheProperties();
      return this.origSize;
   }

   public Dimension getImageDimensionInPixels() {
      Dimension dim = this.getImageDimension();
      return new Dimension(Units.pointsToPixel(dim.getWidth()), Units.pointsToPixel(dim.getHeight()));
   }

   protected void cacheProperties() {
      if(this.origSize == null || this.checksum == null) {
         byte[] data = this.getData();
         this.checksum = Long.valueOf(IOUtils.calculateChecksum(data));
         PictureData.PictureType pt = this.getType();
         if(pt == null) {
            this.origSize = new Dimension(1, 1);
            return;
         }

         switch(XSLFPictureData.NamelessClass242269791.$SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[pt.ordinal()]) {
         case 1:
            this.origSize = (new NativeHeader(data, 0)).getSize();
            break;
         case 2:
            this.origSize = (new org.apache.poi.hslf.blip.WMF.NativeHeader(data, 0)).getSize();
            break;
         case 3:
            this.origSize = (new org.apache.poi.hslf.blip.PICT.NativeHeader(data, 0)).getSize();
            break;
         default:
            BufferedImage img = null;

            try {
               img = ImageIO.read(new ByteArrayInputStream(data));
            } catch (IOException var5) {
               logger.log(5, new Object[]{"Can\'t determine image dimensions", var5});
            }

            this.origSize = img == null?new Dimension(200, 200):new Dimension((int)Units.pixelToPoints(img.getWidth()), (int)Units.pixelToPoints(img.getHeight()));
         }
      }

   }

   protected void prepareForCommit() {}

   public String getContentType() {
      return this.getPackagePart().getContentType();
   }

   public void setData(byte[] data) throws IOException {
      OutputStream os = this.getPackagePart().getOutputStream();
      os.write(data);
      os.close();
      this.checksum = Long.valueOf(IOUtils.calculateChecksum(data));
      this.origSize = null;
   }

   public PictureData.PictureType getType() {
      String ct = this.getContentType();
      return XSLFRelation.IMAGE_EMF.getContentType().equals(ct)?PictureData.PictureType.EMF:(XSLFRelation.IMAGE_WMF.getContentType().equals(ct)?PictureData.PictureType.WMF:(XSLFRelation.IMAGE_PICT.getContentType().equals(ct)?PictureData.PictureType.PICT:(XSLFRelation.IMAGE_JPEG.getContentType().equals(ct)?PictureData.PictureType.JPEG:(XSLFRelation.IMAGE_PNG.getContentType().equals(ct)?PictureData.PictureType.PNG:(XSLFRelation.IMAGE_DIB.getContentType().equals(ct)?PictureData.PictureType.DIB:(XSLFRelation.IMAGE_GIF.getContentType().equals(ct)?PictureData.PictureType.GIF:(XSLFRelation.IMAGE_EPS.getContentType().equals(ct)?PictureData.PictureType.EPS:(XSLFRelation.IMAGE_BMP.getContentType().equals(ct)?PictureData.PictureType.BMP:(XSLFRelation.IMAGE_WPG.getContentType().equals(ct)?PictureData.PictureType.WPG:(XSLFRelation.IMAGE_WDP.getContentType().equals(ct)?PictureData.PictureType.WDP:(XSLFRelation.IMAGE_TIFF.getContentType().equals(ct)?PictureData.PictureType.TIFF:null)))))))))));
   }

   static XSLFRelation getRelationForType(PictureData.PictureType pt) {
      switch(XSLFPictureData.NamelessClass242269791.$SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[pt.ordinal()]) {
      case 1:
         return XSLFRelation.IMAGE_EMF;
      case 2:
         return XSLFRelation.IMAGE_WMF;
      case 3:
         return XSLFRelation.IMAGE_PICT;
      case 4:
         return XSLFRelation.IMAGE_JPEG;
      case 5:
         return XSLFRelation.IMAGE_PNG;
      case 6:
         return XSLFRelation.IMAGE_DIB;
      case 7:
         return XSLFRelation.IMAGE_GIF;
      case 8:
         return XSLFRelation.IMAGE_EPS;
      case 9:
         return XSLFRelation.IMAGE_BMP;
      case 10:
         return XSLFRelation.IMAGE_WPG;
      case 11:
         return XSLFRelation.IMAGE_WDP;
      case 12:
         return XSLFRelation.IMAGE_TIFF;
      default:
         return null;
      }
   }

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int index) {
      this.index = index;
   }


   // $FF: synthetic class
   static class NamelessClass242269791 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType = new int[PictureData.PictureType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.EMF.ordinal()] = 1;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.WMF.ordinal()] = 2;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.PICT.ordinal()] = 3;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.JPEG.ordinal()] = 4;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.PNG.ordinal()] = 5;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.DIB.ordinal()] = 6;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.GIF.ordinal()] = 7;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.EPS.ordinal()] = 8;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.BMP.ordinal()] = 9;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.WPG.ordinal()] = 10;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.WDP.ordinal()] = 11;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$PictureData$PictureType[PictureData.PictureType.TIFF.ordinal()] = 12;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
