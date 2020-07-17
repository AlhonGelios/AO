package org.apache.poi.ss.formula.atp;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

final class RandBetween implements FreeRefFunction {

   public static final FreeRefFunction instance = new RandBetween();


   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      if(args.length != 2) {
         return ErrorEval.VALUE_INVALID;
      } else {
         double bottom;
         double top;
         try {
            bottom = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex()));
            top = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(args[1], ec.getRowIndex(), ec.getColumnIndex()));
            if(bottom > top) {
               return ErrorEval.NUM_ERROR;
            }
         } catch (EvaluationException var8) {
            return ErrorEval.VALUE_INVALID;
         }

         bottom = Math.ceil(bottom);
         top = Math.floor(top);
         if(bottom > top) {
            top = bottom;
         }

         return new NumberEval(bottom + (double)((int)(Math.random() * (top - bottom + 1.0D))));
      }
   }

}
