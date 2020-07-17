package org.apache.poi.ss.formula.functions;

import java.util.Calendar;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.formula.functions.Var2or3ArgFunction;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.util.LocaleUtil;

public class Days360 extends Var2or3ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      double result;
      try {
         double e = NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
         double d1 = NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
         result = evaluate(e, d1, false);
      } catch (EvaluationException var11) {
         return var11.getErrorEval();
      }

      return new NumberEval(result);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      double result;
      try {
         double e = NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
         double d1 = NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
         ValueEval ve = OperandResolver.getSingleValue(arg2, srcRowIndex, srcColumnIndex);
         Boolean method = OperandResolver.coerceValueToBoolean(ve, false);
         result = evaluate(e, d1, method == null?false:method.booleanValue());
      } catch (EvaluationException var14) {
         return var14.getErrorEval();
      }

      return new NumberEval(result);
   }

   private static double evaluate(double d0, double d1, boolean method) {
      Calendar realStart = getDate(d0);
      Calendar realEnd = getDate(d1);
      int[] startingDate = getStartingDate(realStart, method);
      int[] endingDate = getEndingDate(realEnd, realStart, method);
      return (double)(endingDate[0] * 360 + endingDate[1] * 30 + endingDate[2] - (startingDate[0] * 360 + startingDate[1] * 30 + startingDate[2]));
   }

   private static Calendar getDate(double date) {
      Calendar processedDate = LocaleUtil.getLocaleCalendar();
      processedDate.setTime(DateUtil.getJavaDate(date, false));
      return processedDate;
   }

   private static int[] getStartingDate(Calendar realStart, boolean method) {
      int yyyy = realStart.get(1);
      int mm = realStart.get(2);
      int dd = Math.min(30, realStart.get(5));
      if(!method && isLastDayOfMonth(realStart)) {
         dd = 30;
      }

      return new int[]{yyyy, mm, dd};
   }

   private static int[] getEndingDate(Calendar realEnd, Calendar realStart, boolean method) {
      int yyyy = realEnd.get(1);
      int mm = realEnd.get(2);
      int dd = Math.min(30, realEnd.get(5));
      if(!method && realEnd.get(5) == 31) {
         if(realStart.get(5) < 30) {
            realEnd.set(5, 1);
            realEnd.add(2, 1);
            yyyy = realEnd.get(1);
            mm = realEnd.get(2);
            dd = 1;
         } else {
            dd = 30;
         }
      }

      return new int[]{yyyy, mm, dd};
   }

   private static boolean isLastDayOfMonth(Calendar date) {
      int dayOfMonth = date.get(5);
      int lastDayOfMonth = date.getActualMaximum(5);
      return dayOfMonth == lastDayOfMonth;
   }
}
