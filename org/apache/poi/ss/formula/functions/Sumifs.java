package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.CountUtils;
import org.apache.poi.ss.formula.functions.Countif;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

public final class Sumifs implements FreeRefFunction {

   public static final FreeRefFunction instance = new Sumifs();


   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      if(args.length >= 3 && args.length % 2 != 0) {
         try {
            AreaEval e = convertRangeArg(args[0]);
            AreaEval[] ae = new AreaEval[(args.length - 1) / 2];
            CountUtils.I_MatchPredicate[] mp = new CountUtils.I_MatchPredicate[ae.length];
            int result = 1;

            for(int k = 0; result < args.length; ++k) {
               ae[k] = convertRangeArg(args[result]);
               mp[k] = Countif.createCriteriaPredicate(args[result + 1], ec.getRowIndex(), ec.getColumnIndex());
               result += 2;
            }

            this.validateCriteriaRanges(ae, e);
            this.validateCriteria(mp);
            double var9 = sumMatchingCells(ae, mp, e);
            return new NumberEval(var9);
         } catch (EvaluationException var8) {
            return var8.getErrorEval();
         }
      } else {
         return ErrorEval.VALUE_INVALID;
      }
   }

   private void validateCriteriaRanges(AreaEval[] criteriaRanges, AreaEval sumRange) throws EvaluationException {
      AreaEval[] arr$ = criteriaRanges;
      int len$ = criteriaRanges.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         AreaEval r = arr$[i$];
         if(r.getHeight() != sumRange.getHeight() || r.getWidth() != sumRange.getWidth()) {
            throw EvaluationException.invalidValue();
         }
      }

   }

   private void validateCriteria(CountUtils.I_MatchPredicate[] criteria) throws EvaluationException {
      CountUtils.I_MatchPredicate[] arr$ = criteria;
      int len$ = criteria.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CountUtils.I_MatchPredicate predicate = arr$[i$];
         if(predicate instanceof Countif.ErrorMatcher) {
            throw new EvaluationException(ErrorEval.valueOf(((Countif.ErrorMatcher)predicate).getValue()));
         }
      }

   }

   private static double sumMatchingCells(AreaEval[] ranges, CountUtils.I_MatchPredicate[] predicates, AreaEval aeSum) {
      int height = aeSum.getHeight();
      int width = aeSum.getWidth();
      double result = 0.0D;

      for(int r = 0; r < height; ++r) {
         int c = 0;

         while(c < width) {
            boolean matches = true;
            int i = 0;

            while(true) {
               if(i < ranges.length) {
                  AreaEval aeRange = ranges[i];
                  CountUtils.I_MatchPredicate mp = predicates[i];
                  if(mp.matches(aeRange.getRelativeValue(r, c))) {
                     ++i;
                     continue;
                  }

                  matches = false;
               }

               if(matches) {
                  result += accumulate(aeSum, r, c);
               }

               ++c;
               break;
            }
         }
      }

      return result;
   }

   private static double accumulate(AreaEval aeSum, int relRowIndex, int relColIndex) {
      ValueEval addend = aeSum.getRelativeValue(relRowIndex, relColIndex);
      return addend instanceof NumberEval?((NumberEval)addend).getNumberValue():0.0D;
   }

   private static AreaEval convertRangeArg(ValueEval eval) throws EvaluationException {
      if(eval instanceof AreaEval) {
         return (AreaEval)eval;
      } else if(eval instanceof RefEval) {
         return ((RefEval)eval).offset(0, 0, 0, 0);
      } else {
         throw new EvaluationException(ErrorEval.VALUE_INVALID);
      }
   }

}
