package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ValueEval;

public interface FreeRefFunction {

   ValueEval evaluate(ValueEval[] var1, OperationEvaluationContext var2);
}
