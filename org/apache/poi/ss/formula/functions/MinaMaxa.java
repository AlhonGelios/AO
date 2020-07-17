package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.MathX;
import org.apache.poi.ss.formula.functions.MultiOperandNumericFunction;

public abstract class MinaMaxa extends MultiOperandNumericFunction {

   public static final Function MAXA = new MinaMaxa() {
      protected double evaluate(double[] values) {
         return values.length > 0?MathX.max(values):0.0D;
      }
   };
   public static final Function MINA = new MinaMaxa() {
      protected double evaluate(double[] values) {
         return values.length > 0?MathX.min(values):0.0D;
      }
   };


   protected MinaMaxa() {
      super(true, true);
   }

}
