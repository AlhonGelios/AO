package org.apache.poi.ss.formula.atp;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.NumericFunction;

final class MRound implements FreeRefFunction {

   public static final FreeRefFunction instance = new MRound();


   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      if(args.length != 2) {
         return ErrorEval.VALUE_INVALID;
      } else {
         try {
            double number = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex()));
            double multiple = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(args[1], ec.getRowIndex(), ec.getColumnIndex()));
            double result;
            if(multiple == 0.0D) {
               result = 0.0D;
            } else {
               if(number * multiple < 0.0D) {
                  throw new EvaluationException(ErrorEval.NUM_ERROR);
               }

               result = multiple * (double)Math.round(number / multiple);
            }

            NumericFunction.checkValue(result);
            return new NumberEval(result);
         } catch (EvaluationException var10) {
            return var10.getErrorEval();
         }
      }
   }

}
