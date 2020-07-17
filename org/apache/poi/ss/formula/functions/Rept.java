package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed2ArgFunction;

public class Rept extends Fixed2ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval text, ValueEval number_times) {
      ValueEval veText1;
      try {
         veText1 = OperandResolver.getSingleValue(text, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var13) {
         return var13.getErrorEval();
      }

      String strText1 = OperandResolver.coerceValueToString(veText1);
      double numberOfTime = 0.0D;

      try {
         numberOfTime = OperandResolver.coerceValueToDouble(number_times);
      } catch (EvaluationException var12) {
         return ErrorEval.VALUE_INVALID;
      }

      int numberOfTimeInt = (int)numberOfTime;
      StringBuffer strb = new StringBuffer(strText1.length() * numberOfTimeInt);

      for(int i = 0; i < numberOfTimeInt; ++i) {
         strb.append(strText1);
      }

      return (ValueEval)(strb.toString().length() > 32767?ErrorEval.VALUE_INVALID:new StringEval(strb.toString()));
   }
}
