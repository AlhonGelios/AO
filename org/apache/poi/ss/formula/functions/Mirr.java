package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.functions.MultiOperandNumericFunction;

public class Mirr extends MultiOperandNumericFunction {

   public Mirr() {
      super(false, false);
   }

   protected int getMaxNumOperands() {
      return 3;
   }

   protected double evaluate(double[] values) throws EvaluationException {
      double financeRate = values[values.length - 1];
      double reinvestRate = values[values.length - 2];
      double[] mirrValues = new double[values.length - 2];
      System.arraycopy(values, 0, mirrValues, 0, mirrValues.length);
      boolean mirrValuesAreAllNegatives = true;
      double[] mirrValuesAreAllPositives = mirrValues;
      int arr$ = mirrValues.length;

      int len$;
      for(len$ = 0; len$ < arr$; ++len$) {
         double i$ = mirrValuesAreAllPositives[len$];
         mirrValuesAreAllNegatives &= i$ < 0.0D;
      }

      if(mirrValuesAreAllNegatives) {
         return -1.0D;
      } else {
         boolean var14 = true;
         double[] var15 = mirrValues;
         len$ = mirrValues.length;

         for(int var16 = 0; var16 < len$; ++var16) {
            double mirrValue = var15[var16];
            var14 &= mirrValue > 0.0D;
         }

         if(var14) {
            throw new EvaluationException(ErrorEval.DIV_ZERO);
         } else {
            return mirr(mirrValues, financeRate, reinvestRate);
         }
      }
   }

   private static double mirr(double[] in, double financeRate, double reinvestRate) {
      double value = 0.0D;
      int numOfYears = in.length - 1;
      double pv = 0.0D;
      double fv = 0.0D;
      int indexN = 0;
      double[] arr$ = in;
      int len$ = in.length;

      double anIn;
      int i$;
      for(i$ = 0; i$ < len$; ++i$) {
         anIn = arr$[i$];
         if(anIn < 0.0D) {
            pv += anIn / Math.pow(1.0D + financeRate + reinvestRate, (double)(indexN++));
         }
      }

      arr$ = in;
      len$ = in.length;

      for(i$ = 0; i$ < len$; ++i$) {
         anIn = arr$[i$];
         if(anIn > 0.0D) {
            fv += anIn * Math.pow(1.0D + financeRate, (double)(numOfYears - indexN++));
         }
      }

      if(fv != 0.0D && pv != 0.0D) {
         value = Math.pow(-fv / pv, 1.0D / (double)numOfYears) - 1.0D;
      }

      return value;
   }
}
