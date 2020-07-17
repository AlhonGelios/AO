package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;

public class Code extends Fixed1ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval textArg) {
      ValueEval veText1;
      try {
         veText1 = OperandResolver.getSingleValue(textArg, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var7) {
         return var7.getErrorEval();
      }

      String text = OperandResolver.coerceValueToString(veText1);
      if(text.length() == 0) {
         return ErrorEval.VALUE_INVALID;
      } else {
         char code = text.charAt(0);
         return new StringEval(String.valueOf(code));
      }
   }
}
