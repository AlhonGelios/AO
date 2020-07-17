package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.functions.NumericFunction;

public final class Odd extends NumericFunction.OneArg {

   private static final long PARITY_MASK = -2L;


   protected double evaluate(double d) {
      return d == 0.0D?1.0D:(d > 0.0D?(double)calcOdd(d):(double)(-calcOdd(-d)));
   }

   private static long calcOdd(double d) {
      double dpm1 = d + 1.0D;
      long x = (long)dpm1 & -2L;
      return Double.compare((double)x, dpm1) == 0?x - 1L:x + 1L;
   }
}
