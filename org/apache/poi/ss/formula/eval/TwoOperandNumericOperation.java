package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed2ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public abstract class TwoOperandNumericOperation extends Fixed2ArgFunction {

   public static final Function AddEval = new TwoOperandNumericOperation() {
      protected double evaluate(double d0, double d1) {
         return d0 + d1;
      }
   };
   public static final Function DivideEval = new TwoOperandNumericOperation() {
      protected double evaluate(double d0, double d1) throws EvaluationException {
         if(d1 == 0.0D) {
            throw new EvaluationException(ErrorEval.DIV_ZERO);
         } else {
            return d0 / d1;
         }
      }
   };
   public static final Function MultiplyEval = new TwoOperandNumericOperation() {
      protected double evaluate(double d0, double d1) {
         return d0 * d1;
      }
   };
   public static final Function PowerEval = new TwoOperandNumericOperation() {
      protected double evaluate(double d0, double d1) {
         return Math.pow(d0, d1);
      }
   };
   public static final Function SubtractEval = new TwoOperandNumericOperation.SubtractEvalClass();


   protected final double singleOperandEvaluate(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval ve = OperandResolver.getSingleValue(arg, srcCellRow, srcCellCol);
      return OperandResolver.coerceValueToDouble(ve);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      double result;
      try {
         double e = this.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
         double d1 = this.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
         result = this.evaluate(e, d1);
         if(result == 0.0D && !(this instanceof TwoOperandNumericOperation.SubtractEvalClass)) {
            return NumberEval.ZERO;
         }

         if(Double.isNaN(result) || Double.isInfinite(result)) {
            return ErrorEval.NUM_ERROR;
         }
      } catch (EvaluationException var11) {
         return var11.getErrorEval();
      }

      return new NumberEval(result);
   }

   protected abstract double evaluate(double var1, double var3) throws EvaluationException;


   private static final class SubtractEvalClass extends TwoOperandNumericOperation {

      protected double evaluate(double d0, double d1) {
         return d0 - d1;
      }
   }
}
