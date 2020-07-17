package org.apache.poi.sl.usermodel;

import java.awt.Dimension;
import java.io.IOException;

public interface PictureData {

   String getContentType();

   PictureData.PictureType getType();

   byte[] getData();

   void setData(byte[] var1) throws IOException;

   byte[] getChecksum();

   Dimension getImageDimension();

   Dimension getImageDimensionInPixels();

   public static enum PictureType {

      EMF("EMF", 0, 2, 2, "image/x-emf", ".emf"),
      WMF("WMF", 1, 3, 3, "image/x-wmf", ".wmf"),
      PICT("PICT", 2, 4, 4, "image/pict", ".pict"),
      JPEG("JPEG", 3, 5, 5, "image/jpeg", ".jpg"),
      PNG("PNG", 4, 6, 6, "image/png", ".png"),
      DIB("DIB", 5, 7, 7, "image/dib", ".dib"),
      GIF("GIF", 6, -1, 8, "image/gif", ".gif"),
      TIFF("TIFF", 7, -1, 9, "image/tiff", ".tif"),
      EPS("EPS", 8, -1, 10, "image/x-eps", ".eps"),
      BMP("BMP", 9, -1, 11, "image/x-ms-bmp", ".bmp"),
      WPG("WPG", 10, -1, 12, "image/x-wpg", ".wpg"),
      WDP("WDP", 11, -1, 13, "image/vnd.ms-photo", ".wdp");
      public final int nativeId;
      public final int ooxmlId;
      public final String contentType;
      public final String extension;
      // $FF: synthetic field
      private static final PictureData.PictureType[] $VALUES = new PictureData.PictureType[]{EMF, WMF, PICT, JPEG, PNG, DIB, GIF, TIFF, EPS, BMP, WPG, WDP};


      private PictureType(String var1, int var2, int nativeId, int ooxmlId, String contentType, String extension) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
         this.contentType = contentType;
         this.extension = extension;
      }

      public static PictureData.PictureType forNativeID(int nativeId) {
         PictureData.PictureType[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            PictureData.PictureType ans = arr$[i$];
            if(ans.nativeId == nativeId) {
               return ans;
            }
         }

         return null;
      }

      public static PictureData.PictureType forOoxmlID(int ooxmlId) {
         PictureData.PictureType[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            PictureData.PictureType ans = arr$[i$];
            if(ans.ooxmlId == ooxmlId) {
               return ans;
            }
         }

         return null;
      }

   }
}
