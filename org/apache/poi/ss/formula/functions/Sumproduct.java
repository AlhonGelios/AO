package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;

public final class Sumproduct implements Function {

   public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {
      int maxN = args.length;
      if(maxN < 1) {
         return ErrorEval.VALUE_INVALID;
      } else {
         ValueEval firstArg = args[0];

         try {
            if(firstArg instanceof NumericValueEval) {
               return evaluateSingleProduct(args);
            }

            if(firstArg instanceof RefEval) {
               return evaluateSingleProduct(args);
            }

            if(firstArg instanceof TwoDEval) {
               TwoDEval e = (TwoDEval)firstArg;
               if(e.isRow() && e.isColumn()) {
                  return evaluateSingleProduct(args);
               }

               return evaluateAreaSumProduct(args);
            }
         } catch (EvaluationException var7) {
            return var7.getErrorEval();
         }

         throw new RuntimeException("Invalid arg type for SUMPRODUCT: (" + firstArg.getClass().getName() + ")");
      }
   }

   private static ValueEval evaluateSingleProduct(ValueEval[] evalArgs) throws EvaluationException {
      int maxN = evalArgs.length;
      double term = 1.0D;

      for(int n = 0; n < maxN; ++n) {
         double val = getScalarValue(evalArgs[n]);
         term *= val;
      }

      return new NumberEval(term);
   }

   private static double getScalarValue(ValueEval arg) throws EvaluationException {
      ValueEval eval;
      if(arg instanceof RefEval) {
         RefEval ae = (RefEval)arg;
         if(ae.getNumberOfSheets() > 1) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
         }

         eval = ae.getInnerValueEval(ae.getFirstSheetIndex());
      } else {
         eval = arg;
      }

      if(eval == null) {
         throw new RuntimeException("parameter may not be null");
      } else {
         if(eval instanceof AreaEval) {
            AreaEval ae1 = (AreaEval)eval;
            if(!ae1.isColumn() || !ae1.isRow()) {
               throw new EvaluationException(ErrorEval.VALUE_INVALID);
            }

            eval = ae1.getRelativeValue(0, 0);
         }

         return getProductTerm(eval, true);
      }
   }

   private static ValueEval evaluateAreaSumProduct(ValueEval[] evalArgs) throws EvaluationException {
      int maxN = evalArgs.length;
      TwoDEval[] args = new TwoDEval[maxN];

      try {
         System.arraycopy(evalArgs, 0, args, 0, maxN);
      } catch (ArrayStoreException var15) {
         return ErrorEval.VALUE_INVALID;
      }

      TwoDEval firstArg = args[0];
      int height = firstArg.getHeight();
      int width = firstArg.getWidth();
      if(!areasAllSameSize(args, height, width)) {
         for(int var16 = 1; var16 < args.length; ++var16) {
            throwFirstError(args[var16]);
         }

         return ErrorEval.VALUE_INVALID;
      } else {
         double acc = 0.0D;

         for(int rrIx = 0; rrIx < height; ++rrIx) {
            for(int rcIx = 0; rcIx < width; ++rcIx) {
               double term = 1.0D;

               for(int n = 0; n < maxN; ++n) {
                  double val = getProductTerm(args[n].getValue(rrIx, rcIx), false);
                  term *= val;
               }

               acc += term;
            }
         }

         return new NumberEval(acc);
      }
   }

   private static void throwFirstError(TwoDEval areaEval) throws EvaluationException {
      int height = areaEval.getHeight();
      int width = areaEval.getWidth();

      for(int rrIx = 0; rrIx < height; ++rrIx) {
         for(int rcIx = 0; rcIx < width; ++rcIx) {
            ValueEval ve = areaEval.getValue(rrIx, rcIx);
            if(ve instanceof ErrorEval) {
               throw new EvaluationException((ErrorEval)ve);
            }
         }
      }

   }

   private static boolean areasAllSameSize(TwoDEval[] args, int height, int width) {
      for(int i = 0; i < args.length; ++i) {
         TwoDEval areaEval = args[i];
         if(areaEval.getHeight() != height) {
            return false;
         }

         if(areaEval.getWidth() != width) {
            return false;
         }
      }

      return true;
   }

   private static double getProductTerm(ValueEval ve, boolean isScalarProduct) throws EvaluationException {
      if(!(ve instanceof BlankEval) && ve != null) {
         if(ve instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval)ve);
         } else if(ve instanceof StringEval) {
            if(isScalarProduct) {
               throw new EvaluationException(ErrorEval.VALUE_INVALID);
            } else {
               return 0.0D;
            }
         } else if(ve instanceof NumericValueEval) {
            NumericValueEval nve = (NumericValueEval)ve;
            return nve.getNumberValue();
         } else {
            throw new RuntimeException("Unexpected value eval class (" + ve.getClass().getName() + ")");
         }
      } else if(isScalarProduct) {
         throw new EvaluationException(ErrorEval.VALUE_INVALID);
      } else {
         return 0.0D;
      }
   }
}
