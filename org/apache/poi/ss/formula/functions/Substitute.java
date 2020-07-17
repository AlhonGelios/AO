package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.TextFunction;
import org.apache.poi.ss.formula.functions.Var3or4ArgFunction;

public final class Substitute extends Var3or4ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      String result;
      try {
         String e = TextFunction.evaluateStringArg(arg0, srcRowIndex, srcColumnIndex);
         String searchStr = TextFunction.evaluateStringArg(arg1, srcRowIndex, srcColumnIndex);
         String newStr = TextFunction.evaluateStringArg(arg2, srcRowIndex, srcColumnIndex);
         result = replaceAllOccurrences(e, searchStr, newStr);
      } catch (EvaluationException var10) {
         return var10.getErrorEval();
      }

      return new StringEval(result);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2, ValueEval arg3) {
      String result;
      try {
         String e = TextFunction.evaluateStringArg(arg0, srcRowIndex, srcColumnIndex);
         String searchStr = TextFunction.evaluateStringArg(arg1, srcRowIndex, srcColumnIndex);
         String newStr = TextFunction.evaluateStringArg(arg2, srcRowIndex, srcColumnIndex);
         int instanceNumber = TextFunction.evaluateIntArg(arg3, srcRowIndex, srcColumnIndex);
         if(instanceNumber < 1) {
            return ErrorEval.VALUE_INVALID;
         }

         result = replaceOneOccurrence(e, searchStr, newStr, instanceNumber);
      } catch (EvaluationException var12) {
         return var12.getErrorEval();
      }

      return new StringEval(result);
   }

   private static String replaceAllOccurrences(String oldStr, String searchStr, String newStr) {
      StringBuffer sb = new StringBuffer();
      int startIndex = 0;
      boolean nextMatch = true;

      while(true) {
         int nextMatch1 = oldStr.indexOf(searchStr, startIndex);
         if(nextMatch1 < 0) {
            sb.append(oldStr.substring(startIndex));
            return sb.toString();
         }

         sb.append(oldStr.substring(startIndex, nextMatch1));
         sb.append(newStr);
         startIndex = nextMatch1 + searchStr.length();
      }
   }

   private static String replaceOneOccurrence(String oldStr, String searchStr, String newStr, int instanceNumber) {
      if(searchStr.length() < 1) {
         return oldStr;
      } else {
         int startIndex = 0;
         boolean nextMatch = true;
         int count = 0;

         while(true) {
            int var8 = oldStr.indexOf(searchStr, startIndex);
            if(var8 < 0) {
               return oldStr;
            }

            ++count;
            if(count == instanceNumber) {
               StringBuffer sb = new StringBuffer(oldStr.length() + newStr.length());
               sb.append(oldStr.substring(0, var8));
               sb.append(newStr);
               sb.append(oldStr.substring(var8 + searchStr.length()));
               return sb.toString();
            }

            startIndex = var8 + searchStr.length();
         }
      }
   }
}
