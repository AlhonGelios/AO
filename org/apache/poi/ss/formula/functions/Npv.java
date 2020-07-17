package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.AggregateFunction;
import org.apache.poi.ss.formula.functions.FinanceLib;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.NumericFunction;

public final class Npv implements Function {

   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      int nArgs = args.length;
      if(nArgs < 2) {
         return ErrorEval.VALUE_INVALID;
      } else {
         try {
            double e = NumericFunction.singleOperandEvaluate(args[0], srcRowIndex, srcColumnIndex);
            ValueEval[] vargs = new ValueEval[args.length - 1];
            System.arraycopy(args, 1, vargs, 0, vargs.length);
            double[] values = AggregateFunction.ValueCollector.collectValues(vargs);
            double result = FinanceLib.npv(e, values);
            NumericFunction.checkValue(result);
            return new NumberEval(result);
         } catch (EvaluationException var11) {
            return var11.getErrorEval();
         }
      }
   }
}
