package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.functions.XYNumericFunction;

public final class Sumx2py2 extends XYNumericFunction {

   private static final XYNumericFunction.Accumulator XSquaredPlusYSquaredAccumulator = new XYNumericFunction.Accumulator() {
      public double accumulate(double x, double y) {
         return x * x + y * y;
      }
   };


   protected XYNumericFunction.Accumulator createAccumulator() {
      return XSquaredPlusYSquaredAccumulator;
   }

}
