package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.LookupUtils;
import org.apache.poi.ss.formula.functions.Var2or3ArgFunction;

public final class Lookup extends Var2or3ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      throw new RuntimeException("Two arg version of LOOKUP not supported yet");
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         TwoDEval aeLookupVector = LookupUtils.resolveTableArrayArg(arg1);
         TwoDEval aeResultVector = LookupUtils.resolveTableArrayArg(arg2);
         LookupUtils.ValueVector lookupVector = createVector(aeLookupVector);
         LookupUtils.ValueVector resultVector = createVector(aeResultVector);
         if(lookupVector.getSize() > resultVector.getSize()) {
            throw new RuntimeException("Lookup vector and result vector of differing sizes not supported yet");
         } else {
            int index = LookupUtils.lookupIndexOfValue(e, lookupVector, true);
            return resultVector.getItem(index);
         }
      } catch (EvaluationException var12) {
         return var12.getErrorEval();
      }
   }

   private static LookupUtils.ValueVector createVector(TwoDEval ae) {
      LookupUtils.ValueVector result = LookupUtils.createVector(ae);
      if(result != null) {
         return result;
      } else {
         throw new RuntimeException("non-vector lookup or result areas not supported yet");
      }
   }
}
