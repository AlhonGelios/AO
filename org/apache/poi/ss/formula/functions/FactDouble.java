package org.apache.poi.ss.formula.functions;

import java.math.BigInteger;
import java.util.HashMap;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

public class FactDouble extends Fixed1ArgFunction implements FreeRefFunction {

   public static final FreeRefFunction instance = new FactDouble();
   static HashMap cache = new HashMap();


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval numberVE) {
      int number;
      try {
         number = OperandResolver.coerceValueToInt(numberVE);
      } catch (EvaluationException var6) {
         return ErrorEval.VALUE_INVALID;
      }

      return (ValueEval)(number < 0?ErrorEval.NUM_ERROR:new NumberEval((double)factorial(number).longValue()));
   }

   public static BigInteger factorial(int n) {
      if(n != 0 && n >= 0) {
         if(cache.containsKey(Integer.valueOf(n))) {
            return (BigInteger)cache.get(Integer.valueOf(n));
         } else {
            BigInteger result = BigInteger.valueOf((long)n).multiply(factorial(n - 2));
            cache.put(Integer.valueOf(n), result);
            return result;
         }
      } else {
         return BigInteger.ONE;
      }
   }

   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      return (ValueEval)(args.length != 1?ErrorEval.VALUE_INVALID:this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0]));
   }

}
