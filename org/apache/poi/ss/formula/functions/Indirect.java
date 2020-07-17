package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaParsingWorkbook;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.ptg.Area3DPxg;
import org.apache.poi.ss.usermodel.Table;

public final class Indirect implements FreeRefFunction {

   public static final FreeRefFunction instance = new Indirect();


   public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
      if(args.length < 1) {
         return ErrorEval.VALUE_INVALID;
      } else {
         boolean isA1style;
         String text;
         try {
            ValueEval e = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
            text = OperandResolver.coerceValueToString(e);
            switch(args.length) {
            case 1:
               isA1style = true;
               break;
            case 2:
               isA1style = evaluateBooleanArg(args[1], ec);
               break;
            default:
               return ErrorEval.VALUE_INVALID;
            }
         } catch (EvaluationException var6) {
            return var6.getErrorEval();
         }

         return evaluateIndirect(ec, text, isA1style);
      }
   }

   private static boolean evaluateBooleanArg(ValueEval arg, OperationEvaluationContext ec) throws EvaluationException {
      ValueEval ve = OperandResolver.getSingleValue(arg, ec.getRowIndex(), ec.getColumnIndex());
      return ve != BlankEval.instance && ve != MissingArgEval.instance?OperandResolver.coerceValueToBoolean(ve, false).booleanValue():false;
   }

   private static ValueEval evaluateIndirect(OperationEvaluationContext ec, String text, boolean isA1style) {
      int plingPos = text.lastIndexOf(33);
      String workbookName;
      String sheetName;
      String refText;
      String[] refStrPart1;
      if(plingPos < 0) {
         workbookName = null;
         sheetName = null;
         refText = text;
      } else {
         refStrPart1 = parseWorkbookAndSheetName(text.subSequence(0, plingPos));
         if(refStrPart1 == null) {
            return ErrorEval.REF_INVALID;
         }

         workbookName = refStrPart1[0];
         sheetName = refStrPart1[1];
         refText = text.substring(plingPos + 1);
      }

      if(Table.isStructuredReference.matcher(refText).matches()) {
         refStrPart1 = null;

         Area3DPxg refStrPart12;
         try {
            refStrPart12 = FormulaParser.parseStructuredReference(refText, (FormulaParsingWorkbook)ec.getWorkbook(), ec.getRowIndex());
         } catch (FormulaParseException var10) {
            return ErrorEval.REF_INVALID;
         }

         return ec.getArea3DEval(refStrPart12);
      } else {
         int colonPos = refText.indexOf(58);
         String refStrPart2;
         String refStrPart11;
         if(colonPos < 0) {
            refStrPart11 = refText.trim();
            refStrPart2 = null;
         } else {
            refStrPart11 = refText.substring(0, colonPos).trim();
            refStrPart2 = refText.substring(colonPos + 1).trim();
         }

         return ec.getDynamicReference(workbookName, sheetName, refStrPart11, refStrPart2, isA1style);
      }
   }

   private static String[] parseWorkbookAndSheetName(CharSequence text) {
      int lastIx = text.length() - 1;
      if(lastIx < 0) {
         return null;
      } else if(canTrim(text)) {
         return null;
      } else {
         char firstChar = text.charAt(0);
         if(Character.isWhitespace(firstChar)) {
            return null;
         } else if(firstChar != 39) {
            if(firstChar == 91) {
               int rbPos1 = text.toString().lastIndexOf(93);
               if(rbPos1 < 0) {
                  return null;
               } else {
                  CharSequence wbName1 = text.subSequence(1, rbPos1);
                  if(canTrim(wbName1)) {
                     return null;
                  } else {
                     CharSequence sheetName2 = text.subSequence(rbPos1 + 1, text.length());
                     return canTrim(sheetName2)?null:new String[]{wbName1.toString(), sheetName2.toString()};
                  }
               }
            } else {
               return new String[]{null, text.toString()};
            }
         } else if(text.charAt(lastIx) != 39) {
            return null;
         } else {
            firstChar = text.charAt(1);
            if(Character.isWhitespace(firstChar)) {
               return null;
            } else {
               String rbPos;
               int wbName;
               if(firstChar == 91) {
                  int sheetName = text.toString().lastIndexOf(93);
                  if(sheetName < 0) {
                     return null;
                  }

                  rbPos = unescapeString(text.subSequence(2, sheetName));
                  if(rbPos == null || canTrim(rbPos)) {
                     return null;
                  }

                  wbName = sheetName + 1;
               } else {
                  rbPos = null;
                  wbName = 1;
               }

               String sheetName1 = unescapeString(text.subSequence(wbName, lastIx));
               return sheetName1 == null?null:new String[]{rbPos, sheetName1};
            }
         }
      }
   }

   private static String unescapeString(CharSequence text) {
      int len = text.length();
      StringBuilder sb = new StringBuilder(len);

      for(int i = 0; i < len; ++i) {
         char ch = text.charAt(i);
         if(ch == 39) {
            ++i;
            if(i >= len) {
               return null;
            }

            ch = text.charAt(i);
            if(ch != 39) {
               return null;
            }
         }

         sb.append(ch);
      }

      return sb.toString();
   }

   private static boolean canTrim(CharSequence text) {
      int lastIx = text.length() - 1;
      return lastIx < 0?false:(Character.isWhitespace(text.charAt(0))?true:Character.isWhitespace(text.charAt(lastIx)));
   }

}
