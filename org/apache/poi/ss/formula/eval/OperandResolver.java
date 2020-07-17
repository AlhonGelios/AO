package org.apache.poi.ss.formula.eval;

import java.util.regex.Pattern;
import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.formula.eval.ValueEval;

public final class OperandResolver {

   private static final String Digits = "(\\p{Digit}+)";
   private static final String Exp = "[eE][+-]?(\\p{Digit}+)";
   private static final String fpRegex = "[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?))))[\\x00-\\x20]*";


   public static ValueEval getSingleValue(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval result;
      if(arg instanceof RefEval) {
         result = chooseSingleElementFromRef((RefEval)arg);
      } else if(arg instanceof AreaEval) {
         result = chooseSingleElementFromArea((AreaEval)arg, srcCellRow, srcCellCol);
      } else {
         result = arg;
      }

      if(result instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)result);
      } else {
         return result;
      }
   }

   public static ValueEval chooseSingleElementFromArea(AreaEval ae, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval result = chooseSingleElementFromAreaInternal(ae, srcCellRow, srcCellCol);
      if(result instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)result);
      } else {
         return result;
      }
   }

   private static ValueEval chooseSingleElementFromAreaInternal(AreaEval ae, int srcCellRow, int srcCellCol) throws EvaluationException {
      if(ae.isColumn()) {
         if(ae.isRow()) {
            return ae.getRelativeValue(0, 0);
         } else if(!ae.containsRow(srcCellRow)) {
            throw EvaluationException.invalidValue();
         } else {
            return ae.getAbsoluteValue(srcCellRow, ae.getFirstColumn());
         }
      } else if(!ae.isRow()) {
         if(ae.containsRow(srcCellRow) && ae.containsColumn(srcCellCol)) {
            return ae.getAbsoluteValue(ae.getFirstRow(), ae.getFirstColumn());
         } else {
            throw EvaluationException.invalidValue();
         }
      } else if(!ae.containsColumn(srcCellCol)) {
         throw EvaluationException.invalidValue();
      } else {
         return ae.getAbsoluteValue(ae.getFirstRow(), srcCellCol);
      }
   }

   private static ValueEval chooseSingleElementFromRef(RefEval ref) {
      return ref.getInnerValueEval(ref.getFirstSheetIndex());
   }

   public static int coerceValueToInt(ValueEval ev) throws EvaluationException {
      if(ev == BlankEval.instance) {
         return 0;
      } else {
         double d = coerceValueToDouble(ev);
         return (int)Math.floor(d);
      }
   }

   public static double coerceValueToDouble(ValueEval ev) throws EvaluationException {
      if(ev == BlankEval.instance) {
         return 0.0D;
      } else if(ev instanceof NumericValueEval) {
         return ((NumericValueEval)ev).getNumberValue();
      } else if(ev instanceof StringEval) {
         Double dd = parseDouble(((StringEval)ev).getStringValue());
         if(dd == null) {
            throw EvaluationException.invalidValue();
         } else {
            return dd.doubleValue();
         }
      } else {
         throw new RuntimeException("Unexpected arg eval type (" + ev.getClass().getName() + ")");
      }
   }

   public static Double parseDouble(String pText) {
      if(Pattern.matches("[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?))))[\\x00-\\x20]*", pText)) {
         try {
            return Double.valueOf(Double.parseDouble(pText));
         } catch (NumberFormatException var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static String coerceValueToString(ValueEval ve) {
      if(ve instanceof StringValueEval) {
         StringValueEval sve = (StringValueEval)ve;
         return sve.getStringValue();
      } else if(ve == BlankEval.instance) {
         return "";
      } else {
         throw new IllegalArgumentException("Unexpected eval class (" + ve.getClass().getName() + ")");
      }
   }

   public static Boolean coerceValueToBoolean(ValueEval ve, boolean stringsAreBlanks) throws EvaluationException {
      if(ve != null && ve != BlankEval.instance) {
         if(ve instanceof BoolEval) {
            return Boolean.valueOf(((BoolEval)ve).getBooleanValue());
         } else if(ve == BlankEval.instance) {
            return null;
         } else if(ve instanceof StringEval) {
            if(stringsAreBlanks) {
               return null;
            } else {
               String ne1 = ((StringEval)ve).getStringValue();
               if(ne1.equalsIgnoreCase("true")) {
                  return Boolean.TRUE;
               } else if(ne1.equalsIgnoreCase("false")) {
                  return Boolean.FALSE;
               } else {
                  throw new EvaluationException(ErrorEval.VALUE_INVALID);
               }
            }
         } else if(ve instanceof NumericValueEval) {
            NumericValueEval ne = (NumericValueEval)ve;
            double d = ne.getNumberValue();
            if(Double.isNaN(d)) {
               throw new EvaluationException(ErrorEval.VALUE_INVALID);
            } else {
               return Boolean.valueOf(d != 0.0D);
            }
         } else if(ve instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval)ve);
         } else {
            throw new RuntimeException("Unexpected eval (" + ve.getClass().getName() + ")");
         }
      } else {
         return null;
      }
   }
}
