package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.CountUtils;
import org.apache.poi.ss.formula.functions.Function;

public final class Counta implements Function {

   private final CountUtils.I_MatchPredicate _predicate;
   private static final CountUtils.I_MatchPredicate defaultPredicate = new CountUtils.I_MatchPredicate() {
      public boolean matches(ValueEval valueEval) {
         return valueEval != BlankEval.instance;
      }
   };
   private static final CountUtils.I_MatchPredicate subtotalPredicate = new CountUtils.I_MatchAreaPredicate() {
      public boolean matches(ValueEval valueEval) {
         return Counta.defaultPredicate.matches(valueEval);
      }
      public boolean matches(TwoDEval areEval, int rowIndex, int columnIndex) {
         return !areEval.isSubTotal(rowIndex, columnIndex);
      }
   };


   public Counta() {
      this._predicate = defaultPredicate;
   }

   private Counta(CountUtils.I_MatchPredicate criteriaPredicate) {
      this._predicate = criteriaPredicate;
   }

   public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {
      int nArgs = args.length;
      if(nArgs < 1) {
         return ErrorEval.VALUE_INVALID;
      } else if(nArgs > 30) {
         return ErrorEval.VALUE_INVALID;
      } else {
         int temp = 0;

         for(int i = 0; i < nArgs; ++i) {
            temp += CountUtils.countArg(args[i], this._predicate);
         }

         return new NumberEval((double)temp);
      }
   }

   public static Counta subtotalInstance() {
      return new Counta(subtotalPredicate);
   }

}
