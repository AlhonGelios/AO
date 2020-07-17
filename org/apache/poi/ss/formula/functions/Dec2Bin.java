package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.Var1or2ArgFunction;

public class Dec2Bin extends Var1or2ArgFunction implements FreeRefFunction {

   public static final FreeRefFunction instance = new Dec2Bin();
   private static final long MIN_VALUE = -512L;
   private static final long MAX_VALUE = 511L;
   private static final int DEFAULT_PLACES_VALUE = 10;


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval numberVE, ValueEval placesVE) {
      ValueEval veText1;
      try {
         veText1 = OperandResolver.getSingleValue(numberVE, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var13) {
         return var13.getErrorEval();
      }

      String strText1 = OperandResolver.coerceValueToString(veText1);
      Double number = OperandResolver.parseDouble(strText1);
      if(number == null) {
         return ErrorEval.VALUE_INVALID;
      } else if(number.longValue() >= -512L && number.longValue() <= 511L) {
         int placesNumber;
         if(number.doubleValue() >= 0.0D && placesVE != null) {
            ValueEval binary;
            try {
               binary = OperandResolver.getSingleValue(placesVE, srcRowIndex, srcColumnIndex);
            } catch (EvaluationException var12) {
               return var12.getErrorEval();
            }

            String placesStr = OperandResolver.coerceValueToString(binary);
            Double placesNumberDouble = OperandResolver.parseDouble(placesStr);
            if(placesNumberDouble == null) {
               return ErrorEval.VALUE_INVALID;
            }

            placesNumber = placesNumberDouble.intValue();
            if(placesNumber < 0 || placesNumber == 0) {
               return ErrorEval.NUM_ERROR;
            }
         } else {
            placesNumber = 10;
         }

         String binary1 = Integer.toBinaryString(number.intValue());
         if(binary1.length() > 10) {
            binary1 = binary1.substring(binary1.length() - 10, binary1.length());
         }

         return (ValueEval)(binary1.length() > placesNumber?ErrorEval.NUM_ERROR:new StringEval(binary1));
      } else {
         return ErrorEval.NUM_ERROR;
      }
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval numberVE) {
      return this.evaluate(srcRowIndex, srcColumnIndex, numberVE, (ValueEval)null);
   }

   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      return (ValueEval)(args.length == 1?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0]):(args.length == 2?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0], args[1]):ErrorEval.VALUE_INVALID));
   }

}
