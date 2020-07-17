package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;

public final class Choose implements Function {

   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      if(args.length < 2) {
         return ErrorEval.VALUE_INVALID;
      } else {
         try {
            int e = evaluateFirstArg(args[0], srcRowIndex, srcColumnIndex);
            if(e >= 1 && e < args.length) {
               ValueEval result = OperandResolver.getSingleValue(args[e], srcRowIndex, srcColumnIndex);
               return (ValueEval)(result == MissingArgEval.instance?BlankEval.instance:result);
            } else {
               return ErrorEval.VALUE_INVALID;
            }
         } catch (EvaluationException var6) {
            return var6.getErrorEval();
         }
      }
   }

   public static int evaluateFirstArg(ValueEval arg0, int srcRowIndex, int srcColumnIndex) throws EvaluationException {
      ValueEval ev = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
      return OperandResolver.coerceValueToInt(ev);
   }
}
