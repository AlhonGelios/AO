package org.apache.poi.util;


public class Units {

   public static final int EMU_PER_PIXEL = 9525;
   public static final int EMU_PER_POINT = 12700;
   public static final int EMU_PER_CENTIMETER = 360000;
   public static final int MASTER_DPI = 576;
   public static final int PIXEL_DPI = 96;
   public static final int POINT_DPI = 72;


   public static int toEMU(double points) {
      return (int)Math.rint(12700.0D * points);
   }

   public static int pixelToEMU(int pixels) {
      return pixels * 9525;
   }

   public static double toPoints(long emu) {
      return (double)emu / 12700.0D;
   }

   public static double fixedPointToDouble(int fixedPoint) {
      int i = fixedPoint >> 16;
      int f = fixedPoint & '\uffff';
      return (double)i + (double)f / 65536.0D;
   }

   public static int doubleToFixedPoint(double floatPoint) {
      double fractionalPart = floatPoint % 1.0D;
      double integralPart = floatPoint - fractionalPart;
      int i = (int)Math.floor(integralPart);
      int f = (int)Math.rint(fractionalPart * 65536.0D);
      return i << 16 | f & '\uffff';
   }

   public static double masterToPoints(int masterDPI) {
      double points = (double)masterDPI;
      points *= 72.0D;
      points /= 576.0D;
      return points;
   }

   public static int pointsToMaster(double points) {
      points *= 576.0D;
      points /= 72.0D;
      return (int)Math.rint(points);
   }

   public static int pointsToPixel(double points) {
      points *= 96.0D;
      points /= 72.0D;
      return (int)Math.rint(points);
   }

   public static double pixelToPoints(int pixel) {
      double points = (double)pixel;
      points *= 72.0D;
      points /= 96.0D;
      return points;
   }
}
