package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public final class PercentEval extends Fixed1ArgFunction {

   public static final Function instance = new PercentEval();


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      double d;
      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         d = OperandResolver.coerceValueToDouble(e);
      } catch (EvaluationException var7) {
         return var7.getErrorEval();
      }

      return d == 0.0D?NumberEval.ZERO:new NumberEval(d / 100.0D);
   }

}
