package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public final class UnaryPlusEval extends Fixed1ArgFunction {

   public static final Function instance = new UnaryPlusEval();


   public ValueEval evaluate(int srcCellRow, int srcCellCol, ValueEval arg0) {
      double d;
      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcCellRow, srcCellCol);
         if(e instanceof StringEval) {
            return e;
         }

         d = OperandResolver.coerceValueToDouble(e);
      } catch (EvaluationException var7) {
         return var7.getErrorEval();
      }

      return new NumberEval(d);
   }

}
