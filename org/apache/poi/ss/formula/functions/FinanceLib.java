package org.apache.poi.ss.formula.functions;


public final class FinanceLib {

   public static double fv(double r, double n, double y, double p, boolean t) {
      double retval = 0.0D;
      if(r == 0.0D) {
         retval = -1.0D * (p + n * y);
      } else {
         double r1 = r + 1.0D;
         retval = (1.0D - Math.pow(r1, n)) * (t?r1:1.0D) * y / r - p * Math.pow(r1, n);
      }

      return retval;
   }

   public static double pv(double r, double n, double y, double f, boolean t) {
      double retval = 0.0D;
      if(r == 0.0D) {
         retval = -1.0D * (n * y + f);
      } else {
         double r1 = r + 1.0D;
         retval = ((1.0D - Math.pow(r1, n)) / r * (t?r1:1.0D) * y - f) / Math.pow(r1, n);
      }

      return retval;
   }

   public static double npv(double r, double[] cfs) {
      double npv = 0.0D;
      double r1 = r + 1.0D;
      double trate = r1;
      int i = 0;

      for(int iSize = cfs.length; i < iSize; ++i) {
         npv += cfs[i] / trate;
         trate *= r1;
      }

      return npv;
   }

   public static double pmt(double r, double n, double p, double f, boolean t) {
      double retval = 0.0D;
      if(r == 0.0D) {
         retval = -1.0D * (f + p) / n;
      } else {
         double r1 = r + 1.0D;
         retval = (f + p * Math.pow(r1, n)) * r / ((t?r1:1.0D) * (1.0D - Math.pow(r1, n)));
      }

      return retval;
   }

   public static double nper(double r, double y, double p, double f, boolean t) {
      double retval = 0.0D;
      if(r == 0.0D) {
         retval = -1.0D * (f + p) / y;
      } else {
         double r1 = r + 1.0D;
         double ryr = (t?r1:1.0D) * y / r;
         double a1 = ryr - f < 0.0D?Math.log(f - ryr):Math.log(ryr - f);
         double a2 = ryr - f < 0.0D?Math.log(-p - ryr):Math.log(p + ryr);
         double a3 = Math.log(r1);
         retval = (a1 - a2) / a3;
      }

      return retval;
   }
}
