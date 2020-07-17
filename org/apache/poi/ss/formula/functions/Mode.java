package org.apache.poi.ss.formula.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;

public final class Mode implements Function {

   public static double evaluate(double[] v) throws EvaluationException {
      if(v.length < 2) {
         throw new EvaluationException(ErrorEval.NA);
      } else {
         int[] counts = new int[v.length];
         Arrays.fill(counts, 1);
         int maxv = 0;

         int maxc;
         int i;
         for(int iSize = v.length; maxv < iSize; ++maxv) {
            maxc = maxv + 1;

            for(i = v.length; maxc < i; ++maxc) {
               if(v[maxv] == v[maxc]) {
                  ++counts[maxv];
               }
            }
         }

         double var7 = 0.0D;
         maxc = 0;
         i = 0;

         for(int iSize1 = counts.length; i < iSize1; ++i) {
            if(counts[i] > maxc) {
               var7 = v[i];
               maxc = counts[i];
            }
         }

         if(maxc > 1) {
            return var7;
         } else {
            throw new EvaluationException(ErrorEval.NA);
         }
      }
   }

   public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {
      try {
         ArrayList e = new ArrayList();

         for(int values = 0; values < args.length; ++values) {
            collectValues(args[values], e);
         }

         double[] var10 = new double[e.size()];

         for(int i = 0; i < var10.length; ++i) {
            var10[i] = ((Double)e.get(i)).doubleValue();
         }

         double result = evaluate(var10);
         return new NumberEval(result);
      } catch (EvaluationException var9) {
         return var9.getErrorEval();
      }
   }

   private static void collectValues(ValueEval arg, List temp) throws EvaluationException {
      int firstSheetIndex;
      int lastSheetIndex;
      int sIx;
      if(arg instanceof TwoDEval) {
         TwoDEval var8 = (TwoDEval)arg;
         firstSheetIndex = var8.getWidth();
         lastSheetIndex = var8.getHeight();

         for(sIx = 0; sIx < lastSheetIndex; ++sIx) {
            for(int rcIx = 0; rcIx < firstSheetIndex; ++rcIx) {
               ValueEval ve1 = var8.getValue(sIx, rcIx);
               collectValue(ve1, temp, false);
            }
         }

      } else if(!(arg instanceof RefEval)) {
         collectValue(arg, temp, true);
      } else {
         RefEval re = (RefEval)arg;
         firstSheetIndex = re.getFirstSheetIndex();
         lastSheetIndex = re.getLastSheetIndex();

         for(sIx = firstSheetIndex; sIx <= lastSheetIndex; ++sIx) {
            collectValue(re.getInnerValueEval(sIx), temp, true);
         }

      }
   }

   private static void collectValue(ValueEval arg, List temp, boolean mustBeNumber) throws EvaluationException {
      if(arg instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)arg);
      } else if(arg != BlankEval.instance && !(arg instanceof BoolEval) && !(arg instanceof StringEval)) {
         if(arg instanceof NumberEval) {
            temp.add(new Double(((NumberEval)arg).getNumberValue()));
         } else {
            throw new RuntimeException("Unexpected value type (" + arg.getClass().getName() + ")");
         }
      } else if(mustBeNumber) {
         throw EvaluationException.invalidValue();
      }
   }
}
