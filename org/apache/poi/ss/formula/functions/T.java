package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;

public final class T extends Fixed1ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      ValueEval arg = arg0;
      if(arg0 instanceof RefEval) {
         RefEval re = (RefEval)arg0;
         arg = re.getInnerValueEval(re.getFirstSheetIndex());
      } else if(arg0 instanceof AreaEval) {
         arg = ((AreaEval)arg0).getRelativeValue(0, 0);
      }

      return (ValueEval)(arg instanceof StringEval?arg:(arg instanceof ErrorEval?arg:StringEval.EMPTY_INSTANCE));
   }
}
