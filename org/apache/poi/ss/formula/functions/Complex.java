package org.apache.poi.ss.formula.functions;

import java.util.Locale;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.Var2or3ArgFunction;

public class Complex extends Var2or3ArgFunction implements FreeRefFunction {

   public static final FreeRefFunction instance = new Complex();
   public static final String DEFAULT_SUFFIX = "i";
   public static final String SUPPORTED_SUFFIX = "j";


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval real_num, ValueEval i_num) {
      return this.evaluate(srcRowIndex, srcColumnIndex, real_num, i_num, new StringEval("i"));
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval real_num, ValueEval i_num, ValueEval suffix) {
      ValueEval veText1;
      try {
         veText1 = OperandResolver.getSingleValue(real_num, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var17) {
         return var17.getErrorEval();
      }

      double realNum = 0.0D;

      try {
         realNum = OperandResolver.coerceValueToDouble(veText1);
      } catch (EvaluationException var16) {
         return ErrorEval.VALUE_INVALID;
      }

      ValueEval veINum;
      try {
         veINum = OperandResolver.getSingleValue(i_num, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var15) {
         return var15.getErrorEval();
      }

      double realINum = 0.0D;

      try {
         realINum = OperandResolver.coerceValueToDouble(veINum);
      } catch (EvaluationException var14) {
         return ErrorEval.VALUE_INVALID;
      }

      String suffixValue = OperandResolver.coerceValueToString(suffix);
      if(suffixValue.length() == 0) {
         suffixValue = "i";
      }

      if(!suffixValue.equals("i".toUpperCase(Locale.ROOT)) && !suffixValue.equals("j".toUpperCase(Locale.ROOT))) {
         if(!suffixValue.equals("i") && !suffixValue.equals("j")) {
            return ErrorEval.VALUE_INVALID;
         } else {
            StringBuffer strb = new StringBuffer("");
            if(realNum != 0.0D) {
               if(this.isDoubleAnInt(realNum)) {
                  strb.append((int)realNum);
               } else {
                  strb.append(realNum);
               }
            }

            if(realINum != 0.0D) {
               if(strb.length() != 0 && realINum > 0.0D) {
                  strb.append("+");
               }

               if(realINum != 1.0D && realINum != -1.0D) {
                  if(this.isDoubleAnInt(realINum)) {
                     strb.append((int)realINum);
                  } else {
                     strb.append(realINum);
                  }
               }

               strb.append(suffixValue);
            }

            return new StringEval(strb.toString());
         }
      } else {
         return ErrorEval.VALUE_INVALID;
      }
   }

   private boolean isDoubleAnInt(double number) {
      return number == Math.floor(number) && !Double.isInfinite(number);
   }

   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      return (ValueEval)(args.length == 2?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0], args[1]):(args.length == 3?this.evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0], args[1], args[2]):ErrorEval.VALUE_INVALID));
   }

}
