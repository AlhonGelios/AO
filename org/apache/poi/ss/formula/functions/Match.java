package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.LookupUtils;
import org.apache.poi.ss.formula.functions.Var2or3ArgFunction;

public final class Match extends Var2or3ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      return eval(srcRowIndex, srcColumnIndex, arg0, arg1, 1.0D);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      double match_type;
      try {
         match_type = evaluateMatchTypeArg(arg2, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var9) {
         return ErrorEval.REF_INVALID;
      }

      return eval(srcRowIndex, srcColumnIndex, arg0, arg1, match_type);
   }

   private static ValueEval eval(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, double match_type) {
      boolean matchExact = match_type == 0.0D;
      boolean findLargestLessThanOrEqual = match_type > 0.0D;

      try {
         ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         LookupUtils.ValueVector lookupRange = evaluateLookupRange(arg1);
         int index = findIndexOfValue(e, lookupRange, matchExact, findLargestLessThanOrEqual);
         return new NumberEval((double)(index + 1));
      } catch (EvaluationException var11) {
         return var11.getErrorEval();
      }
   }

   private static LookupUtils.ValueVector evaluateLookupRange(ValueEval eval) throws EvaluationException {
      if(eval instanceof RefEval) {
         RefEval se2 = (RefEval)eval;
         return (LookupUtils.ValueVector)(se2.getNumberOfSheets() == 1?new Match.SingleValueVector(se2.getInnerValueEval(se2.getFirstSheetIndex())):LookupUtils.createVector(se2));
      } else if(eval instanceof TwoDEval) {
         LookupUtils.ValueVector se1 = LookupUtils.createVector((TwoDEval)eval);
         if(se1 == null) {
            throw new EvaluationException(ErrorEval.NA);
         } else {
            return se1;
         }
      } else if(eval instanceof NumericValueEval) {
         throw new EvaluationException(ErrorEval.NA);
      } else if(eval instanceof StringEval) {
         StringEval se = (StringEval)eval;
         Double d = OperandResolver.parseDouble(se.getStringValue());
         if(d == null) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
         } else {
            throw new EvaluationException(ErrorEval.NA);
         }
      } else {
         throw new RuntimeException("Unexpected eval type (" + eval.getClass().getName() + ")");
      }
   }

   private static double evaluateMatchTypeArg(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval match_type = OperandResolver.getSingleValue(arg, srcCellRow, srcCellCol);
      if(match_type instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)match_type);
      } else if(match_type instanceof NumericValueEval) {
         NumericValueEval se1 = (NumericValueEval)match_type;
         return se1.getNumberValue();
      } else if(match_type instanceof StringEval) {
         StringEval se = (StringEval)match_type;
         Double d = OperandResolver.parseDouble(se.getStringValue());
         if(d == null) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
         } else {
            return d.doubleValue();
         }
      } else {
         throw new RuntimeException("Unexpected match_type type (" + match_type.getClass().getName() + ")");
      }
   }

   private static int findIndexOfValue(ValueEval lookupValue, LookupUtils.ValueVector lookupRange, boolean matchExact, boolean findLargestLessThanOrEqual) throws EvaluationException {
      LookupUtils.LookupValueComparer lookupComparer = createLookupComparer(lookupValue, matchExact);
      int size = lookupRange.getSize();
      int i;
      if(matchExact) {
         for(i = 0; i < size; ++i) {
            if(lookupComparer.compareTo(lookupRange.getItem(i)).isEqual()) {
               return i;
            }
         }

         throw new EvaluationException(ErrorEval.NA);
      } else {
         LookupUtils.CompareResult cmp;
         if(findLargestLessThanOrEqual) {
            for(i = size - 1; i >= 0; --i) {
               cmp = lookupComparer.compareTo(lookupRange.getItem(i));
               if(!cmp.isTypeMismatch() && !cmp.isLessThan()) {
                  return i;
               }
            }

            throw new EvaluationException(ErrorEval.NA);
         } else {
            for(i = 0; i < size; ++i) {
               cmp = lookupComparer.compareTo(lookupRange.getItem(i));
               if(cmp.isEqual()) {
                  return i;
               }

               if(cmp.isGreaterThan()) {
                  if(i < 1) {
                     throw new EvaluationException(ErrorEval.NA);
                  }

                  return i - 1;
               }
            }

            return size - 1;
         }
      }
   }

   private static LookupUtils.LookupValueComparer createLookupComparer(ValueEval lookupValue, boolean matchExact) {
      return LookupUtils.createLookupComparer(lookupValue, matchExact, true);
   }

   private static final class SingleValueVector implements LookupUtils.ValueVector {

      private final ValueEval _value;


      public SingleValueVector(ValueEval value) {
         this._value = value;
      }

      public ValueEval getItem(int index) {
         if(index != 0) {
            throw new RuntimeException("Invalid index (" + index + ") only zero is allowed");
         } else {
            return this._value;
         }
      }

      public int getSize() {
         return 1;
      }
   }
}
