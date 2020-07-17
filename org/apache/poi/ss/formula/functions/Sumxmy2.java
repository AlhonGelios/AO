package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.functions.XYNumericFunction;

public final class Sumxmy2 extends XYNumericFunction {

   private static final XYNumericFunction.Accumulator XMinusYSquaredAccumulator = new XYNumericFunction.Accumulator() {
      public double accumulate(double x, double y) {
         double xmy = x - y;
         return xmy * xmy;
      }
   };


   protected XYNumericFunction.Accumulator createAccumulator() {
      return XMinusYSquaredAccumulator;
   }

}
