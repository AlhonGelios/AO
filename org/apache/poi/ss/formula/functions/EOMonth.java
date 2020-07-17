package org.apache.poi.ss.formula.functions;

import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.util.LocaleUtil;

public class EOMonth implements FreeRefFunction {

   public static final FreeRefFunction instance = new EOMonth();


   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      if(args.length != 2) {
         return ErrorEval.VALUE_INVALID;
      } else {
         try {
            double e = NumericFunction.singleOperandEvaluate(args[0], ec.getRowIndex(), ec.getColumnIndex());
            int months = (int)NumericFunction.singleOperandEvaluate(args[1], ec.getRowIndex(), ec.getColumnIndex());
            if(e >= 0.0D && e < 1.0D) {
               e = 1.0D;
            }

            Date startDate = DateUtil.getJavaDate(e, false);
            Calendar cal = LocaleUtil.getLocaleCalendar();
            cal.setTime(startDate);
            cal.clear(10);
            cal.set(11, 0);
            cal.clear(12);
            cal.clear(13);
            cal.clear(14);
            cal.add(2, months + 1);
            cal.set(5, 1);
            cal.add(5, -1);
            return new NumberEval(DateUtil.getExcelDate(cal.getTime()));
         } catch (EvaluationException var8) {
            return var8.getErrorEval();
         }
      }
   }

}
