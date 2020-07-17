package org.apache.poi.ss.formula.functions;

import java.util.Arrays;

final class StatsLib {

   public static double avedev(double[] v) {
      double r = 0.0D;
      double m = 0.0D;
      double s = 0.0D;
      int i = 0;

      int iSize;
      for(iSize = v.length; i < iSize; ++i) {
         s += v[i];
      }

      m = s / (double)v.length;
      s = 0.0D;
      i = 0;

      for(iSize = v.length; i < iSize; ++i) {
         s += Math.abs(v[i] - m);
      }

      r = s / (double)v.length;
      return r;
   }

   public static double stdev(double[] v) {
      double r = Double.NaN;
      if(v != null && v.length > 1) {
         r = Math.sqrt(devsq(v) / (double)(v.length - 1));
      }

      return r;
   }

   public static double var(double[] v) {
      double r = Double.NaN;
      if(v != null && v.length > 1) {
         r = devsq(v) / (double)(v.length - 1);
      }

      return r;
   }

   public static double varp(double[] v) {
      double r = Double.NaN;
      if(v != null && v.length > 1) {
         r = devsq(v) / (double)v.length;
      }

      return r;
   }

   public static double median(double[] v) {
      double r = Double.NaN;
      if(v != null && v.length >= 1) {
         int n = v.length;
         Arrays.sort(v);
         r = n % 2 == 0?(v[n / 2] + v[n / 2 - 1]) / 2.0D:v[n / 2];
      }

      return r;
   }

   public static double devsq(double[] v) {
      double r = Double.NaN;
      if(v != null && v.length >= 1) {
         double m = 0.0D;
         double s = 0.0D;
         int n = v.length;

         int i;
         for(i = 0; i < n; ++i) {
            s += v[i];
         }

         m = s / (double)n;
         s = 0.0D;

         for(i = 0; i < n; ++i) {
            s += (v[i] - m) * (v[i] - m);
         }

         r = n == 1?0.0D:s;
      }

      return r;
   }

   public static double kthLargest(double[] v, int k) {
      double r = Double.NaN;
      int index = k - 1;
      if(v != null && v.length > index && index >= 0) {
         Arrays.sort(v);
         r = v[v.length - index - 1];
      }

      return r;
   }

   public static double kthSmallest(double[] v, int k) {
      double r = Double.NaN;
      int index = k - 1;
      if(v != null && v.length > index && index >= 0) {
         Arrays.sort(v);
         r = v[index];
      }

      return r;
   }
}
