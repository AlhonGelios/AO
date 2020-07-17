package org.apache.poi.sl.usermodel;

import java.io.InputStream;
import org.apache.poi.sl.usermodel.ColorStyle;

public interface PaintStyle {

   public interface SolidPaint extends PaintStyle {

      ColorStyle getSolidColor();
   }

   public interface GradientPaint extends PaintStyle {

      double getGradientAngle();

      ColorStyle[] getGradientColors();

      float[] getGradientFractions();

      boolean isRotatedWithShape();

      PaintStyle.GradientPaint.GradientType getGradientType();

      public static enum GradientType {

         linear("linear", 0),
         circular("circular", 1),
         shape("shape", 2);
         // $FF: synthetic field
         private static final PaintStyle.GradientPaint.GradientType[] $VALUES = new PaintStyle.GradientPaint.GradientType[]{linear, circular, shape};


         private GradientType(String var1, int var2) {}

      }
   }

   public interface TexturePaint extends PaintStyle {

      InputStream getImageData();

      String getContentType();

      int getAlpha();
   }
}
