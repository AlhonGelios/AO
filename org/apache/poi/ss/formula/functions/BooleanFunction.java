package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed0ArgFunction;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public abstract class BooleanFunction implements Function {

   public static final Function AND = new BooleanFunction() {
      protected boolean getInitialResultValue() {
         return true;
      }
      protected boolean partialEvaluate(boolean cumulativeResult, boolean currentValue) {
         return cumulativeResult && currentValue;
      }
   };
   public static final Function OR = new BooleanFunction() {
      protected boolean getInitialResultValue() {
         return false;
      }
      protected boolean partialEvaluate(boolean cumulativeResult, boolean currentValue) {
         return cumulativeResult || currentValue;
      }
   };
   public static final Function FALSE = new Fixed0ArgFunction() {
      public ValueEval evaluate(int srcRowIndex, int srcColumnIndex) {
         return BoolEval.FALSE;
      }
   };
   public static final Function TRUE = new Fixed0ArgFunction() {
      public ValueEval evaluate(int srcRowIndex, int srcColumnIndex) {
         return BoolEval.TRUE;
      }
   };
   public static final Function NOT = new Fixed1ArgFunction() {
      public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
         boolean boolArgVal;
         try {
            ValueEval e = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
            Boolean b = OperandResolver.coerceValueToBoolean(e, false);
            boolArgVal = b == null?false:b.booleanValue();
         } catch (EvaluationException var7) {
            return var7.getErrorEval();
         }

         return BoolEval.valueOf(!boolArgVal);
      }
   };


   public final ValueEval evaluate(ValueEval[] args, int srcRow, int srcCol) {
      if(args.length < 1) {
         return ErrorEval.VALUE_INVALID;
      } else {
         boolean boolResult;
         try {
            boolResult = this.calculate(args);
         } catch (EvaluationException var6) {
            return var6.getErrorEval();
         }

         return BoolEval.valueOf(boolResult);
      }
   }

   private boolean calculate(ValueEval[] args) throws EvaluationException {
      boolean result = this.getInitialResultValue();
      boolean atleastOneNonBlank = false;
      ValueEval[] arr$ = args;
      int len$ = args.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         ValueEval arg = arr$[i$];
         Boolean tempVe;
         int firstSheetIndex;
         int lastSheetIndex;
         int sIx;
         if(arg instanceof TwoDEval) {
            TwoDEval re = (TwoDEval)arg;
            firstSheetIndex = re.getHeight();
            lastSheetIndex = re.getWidth();

            for(sIx = 0; sIx < firstSheetIndex; ++sIx) {
               for(int ve = 0; ve < lastSheetIndex; ++ve) {
                  ValueEval ve1 = re.getValue(sIx, ve);
                  tempVe = OperandResolver.coerceValueToBoolean(ve1, true);
                  if(tempVe != null) {
                     result = this.partialEvaluate(result, tempVe.booleanValue());
                     atleastOneNonBlank = true;
                  }
               }
            }
         } else if(arg instanceof RefEval) {
            RefEval var15 = (RefEval)arg;
            firstSheetIndex = var15.getFirstSheetIndex();
            lastSheetIndex = var15.getLastSheetIndex();

            for(sIx = firstSheetIndex; sIx <= lastSheetIndex; ++sIx) {
               ValueEval var16 = var15.getInnerValueEval(sIx);
               tempVe = OperandResolver.coerceValueToBoolean(var16, true);
               if(tempVe != null) {
                  result = this.partialEvaluate(result, tempVe.booleanValue());
                  atleastOneNonBlank = true;
               }
            }
         } else {
            if(arg == MissingArgEval.instance) {
               tempVe = null;
            } else {
               tempVe = OperandResolver.coerceValueToBoolean(arg, false);
            }

            if(tempVe != null) {
               result = this.partialEvaluate(result, tempVe.booleanValue());
               atleastOneNonBlank = true;
            }
         }
      }

      if(!atleastOneNonBlank) {
         throw new EvaluationException(ErrorEval.VALUE_INVALID);
      } else {
         return result;
      }
   }

   protected abstract boolean getInitialResultValue();

   protected abstract boolean partialEvaluate(boolean var1, boolean var2);

}
