package org.apache.poi.ss.formula.functions;

import java.util.Calendar;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed3ArgFunction;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.util.LocaleUtil;

public final class DateFunc extends Fixed3ArgFunction {

   public static final Function instance = new DateFunc();


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      double result;
      try {
         double e = NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
         double d1 = NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
         double d2 = NumericFunction.singleOperandEvaluate(arg2, srcRowIndex, srcColumnIndex);
         result = evaluate(getYear(e), (int)(d1 - 1.0D), (int)d2);
         NumericFunction.checkValue(result);
      } catch (EvaluationException var14) {
         return var14.getErrorEval();
      }

      return new NumberEval(result);
   }

   private static double evaluate(int year, int month, int pDay) throws EvaluationException {
      if(year < 0) {
         throw new EvaluationException(ErrorEval.VALUE_INVALID);
      } else {
         while(month < 0) {
            --year;
            month += 12;
         }

         if(year == 1900 && month == 1 && pDay == 29) {
            return 60.0D;
         } else {
            int day = pDay;
            if(year == 1900 && (month == 0 && pDay >= 60 || month == 1 && pDay >= 30)) {
               day = pDay - 1;
            }

            Calendar c = LocaleUtil.getLocaleCalendar(year, month, day);
            if(pDay < 0 && c.get(1) == 1900 && month > 1 && c.get(2) < 2) {
               c.add(5, 1);
            }

            boolean use1904windowing = false;
            return DateUtil.getExcelDate(c.getTime(), use1904windowing);
         }
      }
   }

   private static int getYear(double d) {
      int year = (int)d;
      return year < 0?-1:(year < 1900?1900 + year:year);
   }

}
