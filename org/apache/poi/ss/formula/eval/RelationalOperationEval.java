package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed2ArgFunction;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.util.NumberComparer;

public abstract class RelationalOperationEval extends Fixed2ArgFunction {

   public static final Function EqualEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult == 0;
      }
   };
   public static final Function GreaterEqualEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult >= 0;
      }
   };
   public static final Function GreaterThanEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult > 0;
      }
   };
   public static final Function LessEqualEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult <= 0;
      }
   };
   public static final Function LessThanEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult < 0;
      }
   };
   public static final Function NotEqualEval = new RelationalOperationEval() {
      protected boolean convertComparisonResult(int cmpResult) {
         return cmpResult != 0;
      }
   };


   protected abstract boolean convertComparisonResult(int var1);

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      ValueEval vA;
      ValueEval vB;
      try {
         vA = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         vB = OperandResolver.getSingleValue(arg1, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var9) {
         return var9.getErrorEval();
      }

      int cmpResult = doCompare(vA, vB);
      boolean result = this.convertComparisonResult(cmpResult);
      return BoolEval.valueOf(result);
   }

   private static int doCompare(ValueEval va, ValueEval vb) {
      if(va == BlankEval.instance) {
         return compareBlank(vb);
      } else if(vb == BlankEval.instance) {
         return -compareBlank(va);
      } else if(va instanceof BoolEval) {
         if(vb instanceof BoolEval) {
            BoolEval nA2 = (BoolEval)va;
            BoolEval nB2 = (BoolEval)vb;
            return nA2.getBooleanValue() == nB2.getBooleanValue()?0:(nA2.getBooleanValue()?1:-1);
         } else {
            return 1;
         }
      } else if(vb instanceof BoolEval) {
         return -1;
      } else if(va instanceof StringEval) {
         if(vb instanceof StringEval) {
            StringEval nA1 = (StringEval)va;
            StringEval nB1 = (StringEval)vb;
            return nA1.getStringValue().compareToIgnoreCase(nB1.getStringValue());
         } else {
            return 1;
         }
      } else if(vb instanceof StringEval) {
         return -1;
      } else if(va instanceof NumberEval && vb instanceof NumberEval) {
         NumberEval nA = (NumberEval)va;
         NumberEval nB = (NumberEval)vb;
         return NumberComparer.compare(nA.getNumberValue(), nB.getNumberValue());
      } else {
         throw new IllegalArgumentException("Bad operand types (" + va.getClass().getName() + "), (" + vb.getClass().getName() + ")");
      }
   }

   private static int compareBlank(ValueEval v) {
      if(v == BlankEval.instance) {
         return 0;
      } else if(v instanceof BoolEval) {
         BoolEval se2 = (BoolEval)v;
         return se2.getBooleanValue()?-1:0;
      } else if(v instanceof NumberEval) {
         NumberEval se1 = (NumberEval)v;
         return NumberComparer.compare(0.0D, se1.getNumberValue());
      } else if(v instanceof StringEval) {
         StringEval se = (StringEval)v;
         return se.getStringValue().length() < 1?0:-1;
      } else {
         throw new IllegalArgumentException("bad value class (" + v.getClass().getName() + ")");
      }
   }

}
