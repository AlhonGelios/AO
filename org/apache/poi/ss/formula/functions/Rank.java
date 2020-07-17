package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Var2or3ArgFunction;

public class Rank extends Var2or3ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      AreaEval aeRange;
      double result;
      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         result = OperandResolver.coerceValueToDouble(e);
         if(Double.isNaN(result) || Double.isInfinite(result)) {
            throw new EvaluationException(ErrorEval.NUM_ERROR);
         }

         aeRange = convertRangeArg(arg1);
      } catch (EvaluationException var9) {
         return var9.getErrorEval();
      }

      return eval(srcRowIndex, srcColumnIndex, result, aeRange, true);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      boolean order = false;

      AreaEval aeRange;
      double result;
      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         result = OperandResolver.coerceValueToDouble(e);
         if(Double.isNaN(result) || Double.isInfinite(result)) {
            throw new EvaluationException(ErrorEval.NUM_ERROR);
         }

         aeRange = convertRangeArg(arg1);
         e = OperandResolver.getSingleValue(arg2, srcRowIndex, srcColumnIndex);
         int order_value = OperandResolver.coerceValueToInt(e);
         if(order_value == 0) {
            order = true;
         } else {
            if(order_value != 1) {
               throw new EvaluationException(ErrorEval.NUM_ERROR);
            }

            order = false;
         }
      } catch (EvaluationException var12) {
         return var12.getErrorEval();
      }

      return eval(srcRowIndex, srcColumnIndex, result, aeRange, order);
   }

   private static ValueEval eval(int srcRowIndex, int srcColumnIndex, double arg0, AreaEval aeRange, boolean descending_order) {
      int rank = 1;
      int height = aeRange.getHeight();
      int width = aeRange.getWidth();

      for(int r = 0; r < height; ++r) {
         for(int c = 0; c < width; ++c) {
            Double value = getValue(aeRange, r, c);
            if(value != null && (descending_order && value.doubleValue() > arg0 || !descending_order && value.doubleValue() < arg0)) {
               ++rank;
            }
         }
      }

      return new NumberEval((double)rank);
   }

   private static Double getValue(AreaEval aeRange, int relRowIndex, int relColIndex) {
      ValueEval addend = aeRange.getRelativeValue(relRowIndex, relColIndex);
      return addend instanceof NumberEval?Double.valueOf(((NumberEval)addend).getNumberValue()):null;
   }

   private static AreaEval convertRangeArg(ValueEval eval) throws EvaluationException {
      if(eval instanceof AreaEval) {
         return (AreaEval)eval;
      } else if(eval instanceof RefEval) {
         return ((RefEval)eval).offset(0, 0, 0, 0);
      } else {
         throw new EvaluationException(ErrorEval.VALUE_INVALID);
      }
   }
}
