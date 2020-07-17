package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function0Arg;

public abstract class Fixed0ArgFunction implements Function0Arg {

   public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      return (ValueEval)(args.length != 0?ErrorEval.VALUE_INVALID:this.evaluate(srcRowIndex, srcColumnIndex));
   }
}
