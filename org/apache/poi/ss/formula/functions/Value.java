package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;

public final class Value extends Fixed1ArgFunction {

   private static final int MIN_DISTANCE_BETWEEN_THOUSANDS_SEPARATOR = 4;
   private static final Double ZERO = new Double(0.0D);


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      ValueEval veText;
      try {
         veText = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var7) {
         return var7.getErrorEval();
      }

      String strText = OperandResolver.coerceValueToString(veText);
      Double result = convertTextToNumber(strText);
      return (ValueEval)(result == null?ErrorEval.VALUE_INVALID:new NumberEval(result.doubleValue()));
   }

   private static Double convertTextToNumber(String strText) {
      boolean foundCurrency = false;
      boolean foundUnaryPlus = false;
      boolean foundUnaryMinus = false;
      boolean foundPercentage = false;
      int len = strText.length();
      int i = 0;

      while(true) {
         if(i < len) {
            char foundDecimalPoint = strText.charAt(i);
            if(!Character.isDigit(foundDecimalPoint) && foundDecimalPoint != 46) {
               switch(foundDecimalPoint) {
               case 32:
                  break;
               case 36:
                  if(foundCurrency) {
                     return null;
                  }

                  foundCurrency = true;
                  break;
               case 43:
                  if(foundUnaryMinus || foundUnaryPlus) {
                     return null;
                  }

                  foundUnaryPlus = true;
                  break;
               case 45:
                  if(foundUnaryMinus || foundUnaryPlus) {
                     return null;
                  }

                  foundUnaryMinus = true;
                  break;
               default:
                  return null;
               }

               ++i;
               continue;
            }
         }

         if(i >= len) {
            if(!foundCurrency && !foundUnaryMinus && !foundUnaryPlus) {
               return ZERO;
            }

            return null;
         }

         boolean var15 = false;
         int lastThousandsSeparatorIndex = -32768;

         StringBuffer sb;
         for(sb = new StringBuffer(len); i < len; ++i) {
            char d = strText.charAt(i);
            if(Character.isDigit(d)) {
               sb.append(d);
            } else {
               switch(d) {
               case 32:
                  String remainingTextTrimmed = strText.substring(i).trim();
                  if(remainingTextTrimmed.equals("%")) {
                     foundPercentage = true;
                  } else if(remainingTextTrimmed.length() > 0) {
                     return null;
                  }
                  break;
               case 37:
                  foundPercentage = true;
                  break;
               case 44:
                  if(var15) {
                     return null;
                  }

                  int result = i - lastThousandsSeparatorIndex;
                  if(result < 4) {
                     return null;
                  }

                  lastThousandsSeparatorIndex = i;
                  break;
               case 46:
                  if(var15) {
                     return null;
                  }

                  if(i - lastThousandsSeparatorIndex < 4) {
                     return null;
                  }

                  var15 = true;
                  sb.append('.');
                  break;
               case 69:
               case 101:
                  if(i - lastThousandsSeparatorIndex < 4) {
                     return null;
                  }

                  sb.append(strText.substring(i));
                  i = len;
                  break;
               default:
                  return null;
               }
            }
         }

         if(!var15 && i - lastThousandsSeparatorIndex < 4) {
            return null;
         }

         double var16;
         try {
            var16 = Double.parseDouble(sb.toString());
         } catch (NumberFormatException var14) {
            return null;
         }

         double var17 = foundUnaryMinus?-var16:var16;
         return Double.valueOf(foundPercentage?var17 / 100.0D:var17);
      }
   }

}
