package org.apache.poi.ss.formula.functions;

import java.util.Locale;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.Var1or2ArgFunction;

public final class Dec2Hex extends Var1or2ArgFunction implements FreeRefFunction {

   public static final FreeRefFunction instance = new Dec2Hex();
   private static final long MIN_VALUE = Long.parseLong("-549755813888");
   private static final long MAX_VALUE = Long.parseLong("549755813887");
   private static final int DEFAULT_PLACES_VALUE = 10;


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval number, ValueEval places) {
      ValueEval veText1;
      try {
         veText1 = OperandResolver.getSingleValue(number, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var13) {
         return var13.getErrorEval();
      }

      String strText1 = OperandResolver.coerceValueToString(veText1);
      Double number1 = OperandResolver.parseDouble(strText1);
      if(number1 == null) {
         return ErrorEval.VALUE_INVALID;
      } else if(number1.longValue() >= MIN_VALUE && number1.longValue() <= MAX_VALUE) {
         int placesNumber = 0;
         if(number1.doubleValue() < 0.0D) {
            placesNumber = 10;
         } else if(places != null) {
            ValueEval hex;
            try {
               hex = OperandResolver.getSingleValue(places, srcRowIndex, srcColumnIndex);
            } catch (EvaluationException var12) {
               return var12.getErrorEval();
            }

            String placesStr = OperandResolver.coerceValueToString(hex);
            Double placesNumberDouble = OperandResolver.parseDouble(placesStr);
            if(placesNumberDouble == null) {
               return ErrorEval.VALUE_INVALID;
            }

            placesNumber = placesNumberDouble.intValue();
            if(placesNumber < 0) {
               return ErrorEval.NUM_ERROR;
            }
         }

         String hex1;
         if(placesNumber != 0) {
            hex1 = String.format(Locale.ROOT, "%0" + placesNumber + "X", new Object[]{Integer.valueOf(number1.intValue())});
         } else {
            hex1 = Long.toHexString(number1.longValue());
         }

         if(number1.doubleValue() < 0.0D) {
            hex1 = "FF" + hex1.substring(2);
         }

         return new StringEval(hex1.toUpperCase(Locale.ROOT));
      } else {
         return ErrorEval.NUM_ERROR;
      }
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      return this.evaluate(srcRowIndex, srcColumnIndex, arg0, (ValueEval)null);
   }

   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      return (ValueEval)(args.length == 1?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0]):(args.length == 2?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0], args[1]):ErrorEval.VALUE_INVALID));
   }

}
