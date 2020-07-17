package org.apache.poi.hssf.usermodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.apache.poi.hssf.model.HSSFFormulaParser;
import org.apache.poi.hssf.record.DVRecord;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.FormulaRenderer;
import org.apache.poi.ss.formula.FormulaRenderingWorkbook;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.NumberPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.StringPtg;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.LocaleUtil;

public class DVConstraint implements DataValidationConstraint {

   private final int _validationType;
   private int _operator;
   private String[] _explicitListValues;
   private String _formula1;
   private String _formula2;
   private Double _value1;
   private Double _value2;


   private DVConstraint(int validationType, int comparisonOperator, String formulaA, String formulaB, Double value1, Double value2, String[] excplicitListValues) {
      this._validationType = validationType;
      this._operator = comparisonOperator;
      this._formula1 = formulaA;
      this._formula2 = formulaB;
      this._value1 = value1;
      this._value2 = value2;
      this._explicitListValues = excplicitListValues == null?null:(String[])excplicitListValues.clone();
   }

   private DVConstraint(String listFormula, String[] excplicitListValues) {
      this(3, 0, listFormula, (String)null, (Double)null, (Double)null, excplicitListValues);
   }

   public static DVConstraint createNumericConstraint(int validationType, int comparisonOperator, String expr1, String expr2) {
      switch(validationType) {
      case 0:
         if(expr1 != null || expr2 != null) {
            throw new IllegalArgumentException("expr1 and expr2 must be null for validation type \'any\'");
         }
         break;
      case 1:
      case 2:
      case 6:
         if(expr1 == null) {
            throw new IllegalArgumentException("expr1 must be supplied");
         }

         DataValidationConstraint.OperatorType.validateSecondArg(comparisonOperator, expr2);
         break;
      case 3:
      case 4:
      case 5:
      default:
         throw new IllegalArgumentException("Validation Type (" + validationType + ") not supported with this method");
      }

      String formula1 = getFormulaFromTextExpression(expr1);
      Double value1 = formula1 == null?convertNumber(expr1):null;
      String formula2 = getFormulaFromTextExpression(expr2);
      Double value2 = formula2 == null?convertNumber(expr2):null;
      return new DVConstraint(validationType, comparisonOperator, formula1, formula2, value1, value2, (String[])null);
   }

   public static DVConstraint createFormulaListConstraint(String listFormula) {
      return new DVConstraint(listFormula, (String[])null);
   }

   public static DVConstraint createExplicitListConstraint(String[] explicitListValues) {
      return new DVConstraint((String)null, explicitListValues);
   }

   public static DVConstraint createTimeConstraint(int comparisonOperator, String expr1, String expr2) {
      if(expr1 == null) {
         throw new IllegalArgumentException("expr1 must be supplied");
      } else {
         DataValidationConstraint.OperatorType.validateSecondArg(comparisonOperator, expr1);
         String formula1 = getFormulaFromTextExpression(expr1);
         Double value1 = formula1 == null?convertTime(expr1):null;
         String formula2 = getFormulaFromTextExpression(expr2);
         Double value2 = formula2 == null?convertTime(expr2):null;
         return new DVConstraint(5, comparisonOperator, formula1, formula2, value1, value2, (String[])null);
      }
   }

   public static DVConstraint createDateConstraint(int comparisonOperator, String expr1, String expr2, String dateFormat) {
      if(expr1 == null) {
         throw new IllegalArgumentException("expr1 must be supplied");
      } else {
         DataValidationConstraint.OperatorType.validateSecondArg(comparisonOperator, expr2);
         SimpleDateFormat df = null;
         if(dateFormat != null) {
            df = new SimpleDateFormat(dateFormat, LocaleUtil.getUserLocale());
            df.setTimeZone(LocaleUtil.getUserTimeZone());
         }

         String formula1 = getFormulaFromTextExpression(expr1);
         Double value1 = formula1 == null?convertDate(expr1, df):null;
         String formula2 = getFormulaFromTextExpression(expr2);
         Double value2 = formula2 == null?convertDate(expr2, df):null;
         return new DVConstraint(4, comparisonOperator, formula1, formula2, value1, value2, (String[])null);
      }
   }

   private static String getFormulaFromTextExpression(String textExpr) {
      if(textExpr == null) {
         return null;
      } else if(textExpr.length() < 1) {
         throw new IllegalArgumentException("Empty string is not a valid formula/value expression");
      } else {
         return textExpr.charAt(0) == 61?textExpr.substring(1):null;
      }
   }

   private static Double convertNumber(String numberStr) {
      if(numberStr == null) {
         return null;
      } else {
         try {
            return new Double(numberStr);
         } catch (NumberFormatException var2) {
            throw new RuntimeException("The supplied text \'" + numberStr + "\' could not be parsed as a number");
         }
      }
   }

   private static Double convertTime(String timeStr) {
      return timeStr == null?null:new Double(HSSFDateUtil.convertTime(timeStr));
   }

   private static Double convertDate(String dateStr, SimpleDateFormat dateFormat) {
      if(dateStr == null) {
         return null;
      } else {
         Date dateVal;
         if(dateFormat == null) {
            dateVal = HSSFDateUtil.parseYYYYMMDDDate(dateStr);
         } else {
            try {
               dateVal = dateFormat.parse(dateStr);
            } catch (ParseException var4) {
               throw new RuntimeException("Failed to parse date \'" + dateStr + "\' using specified format \'" + dateFormat + "\'", var4);
            }
         }

         return new Double(HSSFDateUtil.getExcelDate(dateVal));
      }
   }

   public static DVConstraint createCustomFormulaConstraint(String formula) {
      if(formula == null) {
         throw new IllegalArgumentException("formula must be supplied");
      } else {
         return new DVConstraint(7, 0, formula, (String)null, (Double)null, (Double)null, (String[])null);
      }
   }

   public int getValidationType() {
      return this._validationType;
   }

   public boolean isListValidationType() {
      return this._validationType == 3;
   }

   public boolean isExplicitList() {
      return this._validationType == 3 && this._explicitListValues != null;
   }

   public int getOperator() {
      return this._operator;
   }

   public void setOperator(int operator) {
      this._operator = operator;
   }

   public String[] getExplicitListValues() {
      return this._explicitListValues;
   }

   public void setExplicitListValues(String[] explicitListValues) {
      if(this._validationType != 3) {
         throw new RuntimeException("Cannot setExplicitListValues on non-list constraint");
      } else {
         this._formula1 = null;
         this._explicitListValues = explicitListValues;
      }
   }

   public String getFormula1() {
      return this._formula1;
   }

   public void setFormula1(String formula1) {
      this._value1 = null;
      this._explicitListValues = null;
      this._formula1 = formula1;
   }

   public String getFormula2() {
      return this._formula2;
   }

   public void setFormula2(String formula2) {
      this._value2 = null;
      this._formula2 = formula2;
   }

   public Double getValue1() {
      return this._value1;
   }

   public void setValue1(double value1) {
      this._formula1 = null;
      this._value1 = new Double(value1);
   }

   public Double getValue2() {
      return this._value2;
   }

   public void setValue2(double value2) {
      this._formula2 = null;
      this._value2 = new Double(value2);
   }

   DVConstraint.FormulaPair createFormulas(HSSFSheet sheet) {
      Ptg[] formula1;
      Ptg[] formula2;
      if(this.isListValidationType()) {
         formula1 = this.createListFormula(sheet);
         formula2 = Ptg.EMPTY_PTG_ARRAY;
      } else {
         formula1 = convertDoubleFormula(this._formula1, this._value1, sheet);
         formula2 = convertDoubleFormula(this._formula2, this._value2, sheet);
      }

      return new DVConstraint.FormulaPair(formula1, formula2);
   }

   private Ptg[] createListFormula(HSSFSheet sheet) {
      if(this._explicitListValues == null) {
         HSSFWorkbook var4 = sheet.getWorkbook();
         return HSSFFormulaParser.parse(this._formula1, var4, FormulaType.DATAVALIDATION_LIST, var4.getSheetIndex((Sheet)sheet));
      } else {
         StringBuffer sb = new StringBuffer(this._explicitListValues.length * 16);

         for(int i = 0; i < this._explicitListValues.length; ++i) {
            if(i > 0) {
               sb.append('\u0000');
            }

            sb.append(this._explicitListValues[i]);
         }

         return new Ptg[]{new StringPtg(sb.toString())};
      }
   }

   private static Ptg[] convertDoubleFormula(String formula, Double value, HSSFSheet sheet) {
      if(formula == null) {
         return value == null?Ptg.EMPTY_PTG_ARRAY:new Ptg[]{new NumberPtg(value.doubleValue())};
      } else if(value != null) {
         throw new IllegalStateException("Both formula and value cannot be present");
      } else {
         HSSFWorkbook wb = sheet.getWorkbook();
         return HSSFFormulaParser.parse(formula, wb, FormulaType.CELL, wb.getSheetIndex((Sheet)sheet));
      }
   }

   static DVConstraint createDVConstraint(DVRecord dvRecord, FormulaRenderingWorkbook book) {
      switch(dvRecord.getDataType()) {
      case 0:
         return new DVConstraint(0, dvRecord.getConditionOperator(), (String)null, (String)null, (Double)null, (Double)null, (String[])null);
      case 1:
      case 2:
      case 4:
      case 5:
      case 6:
         DVConstraint.FormulaValuePair pair1 = toFormulaString(dvRecord.getFormula1(), book);
         DVConstraint.FormulaValuePair pair2 = toFormulaString(dvRecord.getFormula2(), book);
         return new DVConstraint(dvRecord.getDataType(), dvRecord.getConditionOperator(), pair1.formula(), pair2.formula(), pair1.value(), pair2.value(), (String[])null);
      case 3:
         String listFormula;
         if(dvRecord.getListExplicitFormula()) {
            listFormula = toFormulaString(dvRecord.getFormula1(), book).string();
            if(listFormula.startsWith("\"")) {
               listFormula = listFormula.substring(1);
            }

            if(listFormula.endsWith("\"")) {
               listFormula = listFormula.substring(0, listFormula.length() - 1);
            }

            String[] explicitListValues = listFormula.split(Pattern.quote(" "));
            return createExplicitListConstraint(explicitListValues);
         }

         listFormula = toFormulaString(dvRecord.getFormula1(), book).string();
         return createFormulaListConstraint(listFormula);
      case 7:
         return createCustomFormulaConstraint(toFormulaString(dvRecord.getFormula1(), book).string());
      default:
         throw new UnsupportedOperationException("validationType=" + dvRecord.getDataType());
      }
   }

   private static DVConstraint.FormulaValuePair toFormulaString(Ptg[] ptgs, FormulaRenderingWorkbook book) {
      DVConstraint.FormulaValuePair pair = new DVConstraint.FormulaValuePair((DVConstraint.NamelessClass127935509)null);
      if(ptgs != null && ptgs.length > 0) {
         String string = FormulaRenderer.toFormulaString(book, ptgs);
         if(ptgs.length == 1 && ptgs[0].getClass() == NumberPtg.class) {
            pair._value = string;
         } else {
            pair._formula = string;
         }
      }

      return pair;
   }

   static final class FormulaPair {

      private final Ptg[] _formula1;
      private final Ptg[] _formula2;


      FormulaPair(Ptg[] formula1, Ptg[] formula2) {
         this._formula1 = formula1 == null?null:(Ptg[])formula1.clone();
         this._formula2 = formula2 == null?null:(Ptg[])formula2.clone();
      }

      public Ptg[] getFormula1() {
         return this._formula1;
      }

      public Ptg[] getFormula2() {
         return this._formula2;
      }
   }

   // $FF: synthetic class
   static class NamelessClass127935509 {
   }

   private static class FormulaValuePair {

      private String _formula;
      private String _value;


      private FormulaValuePair() {}

      public String formula() {
         return this._formula;
      }

      public Double value() {
         return this._value == null?null:new Double(this._value);
      }

      public String string() {
         return this._formula != null?this._formula:(this._value != null?this._value:null);
      }

      // $FF: synthetic method
      FormulaValuePair(DVConstraint.NamelessClass127935509 x0) {
         this();
      }
   }
}
