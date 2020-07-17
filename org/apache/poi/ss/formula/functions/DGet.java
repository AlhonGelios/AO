package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.IDStarAlgorithm;

public final class DGet implements IDStarAlgorithm {

   private ValueEval result;


   public boolean processMatch(ValueEval eval) {
      if(this.result == null) {
         this.result = eval;
         return true;
      } else {
         this.result = ErrorEval.NUM_ERROR;
         return false;
      }
   }

   public ValueEval getResult() {
      if(this.result == null) {
         return ErrorEval.VALUE_INVALID;
      } else if(this.result instanceof BlankEval) {
         return ErrorEval.VALUE_INVALID;
      } else {
         try {
            return (ValueEval)(OperandResolver.coerceValueToString(OperandResolver.getSingleValue(this.result, 0, 0)).equals("")?ErrorEval.VALUE_INVALID:this.result);
         } catch (EvaluationException var2) {
            return var2.getErrorEval();
         }
      }
   }
}
