package org.apache.poi.ss.usermodel;

import java.util.Locale;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Color;

public abstract class ExtendedColor implements Color {

   protected void setColor(java.awt.Color clr) {
      this.setRGB(new byte[]{(byte)clr.getRed(), (byte)clr.getGreen(), (byte)clr.getBlue()});
   }

   public abstract boolean isAuto();

   public abstract boolean isIndexed();

   public abstract boolean isRGB();

   public abstract boolean isThemed();

   public abstract short getIndex();

   public abstract int getTheme();

   public abstract byte[] getRGB();

   public abstract byte[] getARGB();

   protected abstract byte[] getStoredRBG();

   public abstract void setRGB(byte[] var1);

   protected byte[] getRGBOrARGB() {
      if(this.isIndexed() && this.getIndex() > 0) {
         short indexNum = this.getIndex();
         HSSFColor indexed = (HSSFColor)HSSFColor.getIndexHash().get(Integer.valueOf(indexNum));
         if(indexed != null) {
            byte[] rgb = new byte[]{(byte)indexed.getTriplet()[0], (byte)indexed.getTriplet()[1], (byte)indexed.getTriplet()[2]};
            return rgb;
         }
      }

      return this.getStoredRBG();
   }

   public byte[] getRGBWithTint() {
      byte[] rgb = this.getStoredRBG();
      if(rgb != null) {
         if(rgb.length == 4) {
            byte[] tint = new byte[3];
            System.arraycopy(rgb, 1, tint, 0, 3);
            rgb = tint;
         }

         double var5 = this.getTint();

         for(int i = 0; i < rgb.length; ++i) {
            rgb[i] = applyTint(rgb[i] & 255, var5);
         }
      }

      return rgb;
   }

   public String getARGBHex() {
      byte[] rgb = this.getARGB();
      if(rgb == null) {
         return null;
      } else {
         StringBuilder sb = new StringBuilder();
         byte[] arr$ = rgb;
         int len$ = rgb.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            byte c = arr$[i$];
            int i = c & 255;
            String cs = Integer.toHexString(i);
            if(cs.length() == 1) {
               sb.append('0');
            }

            sb.append(cs);
         }

         return sb.toString().toUpperCase(Locale.ROOT);
      }
   }

   public void setARGBHex(String argb) {
      if(argb.length() != 6 && argb.length() != 8) {
         throw new IllegalArgumentException("Must be of the form 112233 or FFEEDDCC");
      } else {
         byte[] rgb = new byte[argb.length() / 2];

         for(int i = 0; i < rgb.length; ++i) {
            String part = argb.substring(i * 2, (i + 1) * 2);
            rgb[i] = (byte)Integer.parseInt(part, 16);
         }

         this.setRGB(rgb);
      }
   }

   private static byte applyTint(int lum, double tint) {
      return tint > 0.0D?(byte)((int)((double)lum * (1.0D - tint) + (255.0D - 255.0D * (1.0D - tint)))):(tint < 0.0D?(byte)((int)((double)lum * (1.0D + tint))):(byte)lum);
   }

   public abstract double getTint();

   public abstract void setTint(double var1);
}
