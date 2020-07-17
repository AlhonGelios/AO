package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;

public interface Function4Arg extends Function {

   ValueEval evaluate(int var1, int var2, ValueEval var3, ValueEval var4, ValueEval var5, ValueEval var6);
}
