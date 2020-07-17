package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed2ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public final class IntersectionEval extends Fixed2ArgFunction {

   public static final Function instance = new IntersectionEval();


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      try {
         AreaEval e = evaluateRef(arg0);
         AreaEval reB = evaluateRef(arg1);
         AreaEval result = resolveRange(e, reB);
         return (ValueEval)(result == null?ErrorEval.NULL_INTERSECTION:result);
      } catch (EvaluationException var8) {
         return var8.getErrorEval();
      }
   }

   private static AreaEval resolveRange(AreaEval aeA, AreaEval aeB) {
      int aeAfr = aeA.getFirstRow();
      int aeAfc = aeA.getFirstColumn();
      int aeBlc = aeB.getLastColumn();
      if(aeAfc > aeBlc) {
         return null;
      } else {
         int aeBfc = aeB.getFirstColumn();
         if(aeBfc > aeA.getLastColumn()) {
            return null;
         } else {
            int aeBlr = aeB.getLastRow();
            if(aeAfr > aeBlr) {
               return null;
            } else {
               int aeBfr = aeB.getFirstRow();
               int aeAlr = aeA.getLastRow();
               if(aeBfr > aeAlr) {
                  return null;
               } else {
                  int top = Math.max(aeAfr, aeBfr);
                  int bottom = Math.min(aeAlr, aeBlr);
                  int left = Math.max(aeAfc, aeBfc);
                  int right = Math.min(aeA.getLastColumn(), aeBlc);
                  return aeA.offset(top - aeAfr, bottom - aeAfr, left - aeAfc, right - aeAfc);
               }
            }
         }
      }
   }

   private static AreaEval evaluateRef(ValueEval arg) throws EvaluationException {
      if(arg instanceof AreaEval) {
         return (AreaEval)arg;
      } else if(arg instanceof RefEval) {
         return ((RefEval)arg).offset(0, 0, 0, 0);
      } else if(arg instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)arg);
      } else {
         throw new IllegalArgumentException("Unexpected ref arg class (" + arg.getClass().getName() + ")");
      }
   }

}
