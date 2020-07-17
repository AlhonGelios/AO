package org.apache.poi.ss.formula.functions;

import java.util.Calendar;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.usermodel.DateUtil;

public final class WeekdayFunc implements Function {

   public static final Function instance = new WeekdayFunc();


   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      try {
         if(args.length >= 1 && args.length <= 2) {
            ValueEval e = OperandResolver.getSingleValue(args[0], srcRowIndex, srcColumnIndex);
            double serialDate = OperandResolver.coerceValueToDouble(e);
            if(!DateUtil.isValidExcelDate(serialDate)) {
               return ErrorEval.NUM_ERROR;
            } else {
               Calendar date = DateUtil.getJavaCalendar(serialDate, false);
               int weekday = date.get(7);
               int returnOption = 1;
               if(args.length == 2) {
                  ValueEval result = OperandResolver.getSingleValue(args[1], srcRowIndex, srcColumnIndex);
                  if(result == MissingArgEval.instance || result == BlankEval.instance) {
                     return ErrorEval.NUM_ERROR;
                  }

                  returnOption = OperandResolver.coerceValueToInt(result);
                  if(returnOption == 2) {
                     returnOption = 11;
                  }
               }

               double result1;
               if(returnOption == 1) {
                  result1 = (double)weekday;
               } else if(returnOption == 3) {
                  result1 = (double)((weekday + 6 - 1) % 7);
               } else {
                  if(returnOption < 11 || returnOption > 17) {
                     return ErrorEval.NUM_ERROR;
                  }

                  result1 = (double)((weekday + 6 - (returnOption - 10)) % 7 + 1);
               }

               return new NumberEval(result1);
            }
         } else {
            return ErrorEval.VALUE_INVALID;
         }
      } catch (EvaluationException var12) {
         return var12.getErrorEval();
      }
   }

}
