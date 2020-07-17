package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.AggregateFunction;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.NumericFunction;

public final class Irr implements Function {

   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      if(args.length != 0 && args.length <= 2) {
         try {
            double[] e = AggregateFunction.ValueCollector.collectValues(new ValueEval[]{args[0]});
            double guess;
            if(args.length == 2) {
               guess = NumericFunction.singleOperandEvaluate(args[1], srcRowIndex, srcColumnIndex);
            } else {
               guess = 0.1D;
            }

            double result = irr(e, guess);
            NumericFunction.checkValue(result);
            return new NumberEval(result);
         } catch (EvaluationException var9) {
            return var9.getErrorEval();
         }
      } else {
         return ErrorEval.VALUE_INVALID;
      }
   }

   public static double irr(double[] income) {
      return irr(income, 0.1D);
   }

   public static double irr(double[] values, double guess) {
      byte maxIterationCount = 20;
      double absoluteAccuracy = 1.0E-7D;
      double x0 = guess;

      for(int i = 0; i < maxIterationCount; ++i) {
         double fValue = 0.0D;
         double fDerivative = 0.0D;

         for(int k = 0; k < values.length; ++k) {
            fValue += values[k] / Math.pow(1.0D + x0, (double)k);
            fDerivative += (double)(-k) * values[k] / Math.pow(1.0D + x0, (double)(k + 1));
         }

         double x1 = x0 - fValue / fDerivative;
         if(Math.abs(x1 - x0) <= absoluteAccuracy) {
            return x1;
         }

         x0 = x1;
      }

      return Double.NaN;
   }
}
