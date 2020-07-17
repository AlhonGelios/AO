package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

public class Bin2Dec extends Fixed1ArgFunction implements FreeRefFunction {

   public static final FreeRefFunction instance = new Bin2Dec();


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval numberVE) {
      String number;
      if(numberVE instanceof RefEval) {
         RefEval unsigned = (RefEval)numberVE;
         number = OperandResolver.coerceValueToString(unsigned.getInnerValueEval(unsigned.getFirstSheetIndex()));
      } else {
         number = OperandResolver.coerceValueToString(numberVE);
      }

      if(number.length() > 10) {
         return ErrorEval.NUM_ERROR;
      } else {
         boolean isPositive;
         String var11;
         if(number.length() < 10) {
            var11 = number;
            isPositive = true;
         } else {
            var11 = number.substring(1);
            isPositive = number.startsWith("0");
         }

         String value;
         try {
            if(isPositive) {
               int e = this.getDecimalValue(var11);
               value = String.valueOf(e);
            } else {
               String var12 = toggleBits(var11);
               int sum = this.getDecimalValue(var12);
               ++sum;
               value = "-" + String.valueOf(sum);
            }
         } catch (NumberFormatException var10) {
            return ErrorEval.NUM_ERROR;
         }

         return new NumberEval((double)Long.parseLong(value));
      }
   }

   private int getDecimalValue(String unsigned) {
      int sum = 0;
      int numBits = unsigned.length();
      int power = numBits - 1;

      for(int i = 0; i < numBits; ++i) {
         int bit = Integer.parseInt(unsigned.substring(i, i + 1));
         int term = (int)((double)bit * Math.pow(2.0D, (double)power));
         sum += term;
         --power;
      }

      return sum;
   }

   private static String toggleBits(String s) {
      long i = Long.parseLong(s, 2);
      long i2 = i ^ (1L << s.length()) - 1L;

      String s2;
      for(s2 = Long.toBinaryString(i2); s2.length() < s.length(); s2 = '0' + s2) {
         ;
      }

      return s2;
   }

   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      return (ValueEval)(args.length != 1?ErrorEval.VALUE_INVALID:this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0]));
   }

}
