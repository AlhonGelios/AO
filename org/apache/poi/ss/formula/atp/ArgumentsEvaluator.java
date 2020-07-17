package org.apache.poi.ss.formula.atp;

import java.util.ArrayList;
import java.util.Calendar;
import org.apache.poi.ss.formula.atp.DateParser;
import org.apache.poi.ss.formula.eval.AreaEvalBase;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.usermodel.DateUtil;

final class ArgumentsEvaluator {

   public static final ArgumentsEvaluator instance = new ArgumentsEvaluator();


   public double evaluateDateArg(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval ve = OperandResolver.getSingleValue(arg, srcCellRow, (short)srcCellCol);
      if(ve instanceof StringEval) {
         String strVal = ((StringEval)ve).getStringValue();
         Double dVal = OperandResolver.parseDouble(strVal);
         if(dVal != null) {
            return dVal.doubleValue();
         } else {
            Calendar date = DateParser.parseDate(strVal);
            return DateUtil.getExcelDate(date, false);
         }
      } else {
         return OperandResolver.coerceValueToDouble(ve);
      }
   }

   public double[] evaluateDatesArg(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      if(arg == null) {
         return new double[0];
      } else if(arg instanceof StringEval) {
         return new double[]{this.evaluateDateArg(arg, srcCellRow, srcCellCol)};
      } else if(!(arg instanceof AreaEvalBase)) {
         return new double[]{OperandResolver.coerceValueToDouble(arg)};
      } else {
         ArrayList valuesList = new ArrayList();
         AreaEvalBase area = (AreaEvalBase)arg;

         int i;
         for(int values = area.getFirstRow(); values <= area.getLastRow(); ++values) {
            for(i = area.getFirstColumn(); i <= area.getLastColumn(); ++i) {
               valuesList.add(Double.valueOf(this.evaluateDateArg(area.getAbsoluteValue(values, i), values, i)));
            }
         }

         double[] var8 = new double[valuesList.size()];

         for(i = 0; i < valuesList.size(); ++i) {
            var8[i] = ((Double)valuesList.get(i)).doubleValue();
         }

         return var8;
      }
   }

   public double evaluateNumberArg(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      return arg == null?0.0D:OperandResolver.coerceValueToDouble(arg);
   }

}
