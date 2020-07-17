package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function1Arg;

public abstract class Fixed1ArgFunction implements Function1Arg {

   public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      return (ValueEval)(args.length != 1?ErrorEval.VALUE_INVALID:this.evaluate(srcRowIndex, srcColumnIndex, args[0]));
   }
}
