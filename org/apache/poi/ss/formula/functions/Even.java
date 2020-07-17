package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.functions.NumericFunction;

public final class Even extends NumericFunction.OneArg {

   private static final long PARITY_MASK = -2L;


   protected double evaluate(double d) {
      if(d == 0.0D) {
         return 0.0D;
      } else {
         long result;
         if(d > 0.0D) {
            result = calcEven(d);
         } else {
            result = -calcEven(-d);
         }

         return (double)result;
      }
   }

   private static long calcEven(double d) {
      long x = (long)d & -2L;
      return (double)x == d?x:x + 2L;
   }
}
