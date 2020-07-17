package org.apache.poi.ss.formula.functions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.poi.ss.util.NumberToTextConverter;

final class MathX {

   public static double round(double n, int p) {
      double retval;
      if(!Double.isNaN(n) && !Double.isInfinite(n)) {
         retval = (new BigDecimal(NumberToTextConverter.toText(n))).setScale(p, RoundingMode.HALF_UP).doubleValue();
      } else {
         retval = Double.NaN;
      }

      return retval;
   }

   public static double roundUp(double n, int p) {
      double retval;
      if(!Double.isNaN(n) && !Double.isInfinite(n)) {
         retval = BigDecimal.valueOf(n).setScale(p, RoundingMode.UP).doubleValue();
      } else {
         retval = Double.NaN;
      }

      return retval;
   }

   public static double roundDown(double n, int p) {
      double retval;
      if(!Double.isNaN(n) && !Double.isInfinite(n)) {
         retval = BigDecimal.valueOf(n).setScale(p, RoundingMode.DOWN).doubleValue();
      } else {
         retval = Double.NaN;
      }

      return retval;
   }

   public static short sign(double d) {
      return (short)(d == 0.0D?0:(d < 0.0D?-1:1));
   }

   public static double average(double[] values) {
      double ave = 0.0D;
      double sum = 0.0D;
      int i = 0;

      for(int iSize = values.length; i < iSize; ++i) {
         sum += values[i];
      }

      ave = sum / (double)values.length;
      return ave;
   }

   public static double sum(double[] values) {
      double sum = 0.0D;
      int i = 0;

      for(int iSize = values.length; i < iSize; ++i) {
         sum += values[i];
      }

      return sum;
   }

   public static double sumsq(double[] values) {
      double sumsq = 0.0D;
      int i = 0;

      for(int iSize = values.length; i < iSize; ++i) {
         sumsq += values[i] * values[i];
      }

      return sumsq;
   }

   public static double product(double[] values) {
      double product = 0.0D;
      if(values != null && values.length > 0) {
         product = 1.0D;
         int i = 0;

         for(int iSize = values.length; i < iSize; ++i) {
            product *= values[i];
         }
      }

      return product;
   }

   public static double min(double[] values) {
      double min = Double.POSITIVE_INFINITY;
      int i = 0;

      for(int iSize = values.length; i < iSize; ++i) {
         min = Math.min(min, values[i]);
      }

      return min;
   }

   public static double max(double[] values) {
      double max = Double.NEGATIVE_INFINITY;
      int i = 0;

      for(int iSize = values.length; i < iSize; ++i) {
         max = Math.max(max, values[i]);
      }

      return max;
   }

   public static double floor(double n, double s) {
      double f;
      if((n >= 0.0D || s <= 0.0D) && (n <= 0.0D || s >= 0.0D) && (s != 0.0D || n == 0.0D)) {
         f = n != 0.0D && s != 0.0D?Math.floor(n / s) * s:0.0D;
      } else {
         f = Double.NaN;
      }

      return f;
   }

   public static double ceiling(double n, double s) {
      double c;
      if((n >= 0.0D || s <= 0.0D) && (n <= 0.0D || s >= 0.0D)) {
         c = n != 0.0D && s != 0.0D?Math.ceil(n / s) * s:0.0D;
      } else {
         c = Double.NaN;
      }

      return c;
   }

   public static double factorial(int n) {
      double d = 1.0D;
      if(n >= 0) {
         if(n <= 170) {
            for(int i = 1; i <= n; ++i) {
               d *= (double)i;
            }
         } else {
            d = Double.POSITIVE_INFINITY;
         }
      } else {
         d = Double.NaN;
      }

      return d;
   }

   public static double mod(double n, double d) {
      double result = 0.0D;
      if(d == 0.0D) {
         result = Double.NaN;
      } else if(sign(n) == sign(d)) {
         result = n % d;
      } else {
         result = (n % d + d) % d;
      }

      return result;
   }

   public static double acosh(double d) {
      return Math.log(Math.sqrt(Math.pow(d, 2.0D) - 1.0D) + d);
   }

   public static double asinh(double d) {
      return Math.log(Math.sqrt(d * d + 1.0D) + d);
   }

   public static double atanh(double d) {
      return Math.log((1.0D + d) / (1.0D - d)) / 2.0D;
   }

   public static double cosh(double d) {
      double ePowX = Math.pow(2.718281828459045D, d);
      double ePowNegX = Math.pow(2.718281828459045D, -d);
      return (ePowX + ePowNegX) / 2.0D;
   }

   public static double sinh(double d) {
      double ePowX = Math.pow(2.718281828459045D, d);
      double ePowNegX = Math.pow(2.718281828459045D, -d);
      return (ePowX - ePowNegX) / 2.0D;
   }

   public static double tanh(double d) {
      double ePowX = Math.pow(2.718281828459045D, d);
      double ePowNegX = Math.pow(2.718281828459045D, -d);
      return (ePowX - ePowNegX) / (ePowX + ePowNegX);
   }

   public static double nChooseK(int n, int k) {
      double d = 1.0D;
      if(n >= 0 && k >= 0 && n >= k) {
         int minnk = Math.min(n - k, k);
         int maxnk = Math.max(n - k, k);

         for(int i = maxnk; i < n; ++i) {
            d *= (double)(i + 1);
         }

         d /= factorial(minnk);
      } else {
         d = Double.NaN;
      }

      return d;
   }
}
