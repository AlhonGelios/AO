package org.apache.poi.xssf.usermodel;

import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType;

public class XSSFDataValidationConstraint implements DataValidationConstraint {

   private static final String LIST_SEPARATOR = ",";
   private static final Pattern LIST_SPLIT_REGEX = Pattern.compile("\\s*,\\s*");
   private static final String QUOTE = "\"";
   private String formula1;
   private String formula2;
   private int validationType = -1;
   private int operator = -1;
   private String[] explicitListOfValues;


   public XSSFDataValidationConstraint(String[] explicitListOfValues) {
      if(explicitListOfValues != null && explicitListOfValues.length != 0) {
         this.validationType = 3;
         this.setExplicitListValues(explicitListOfValues);
         this.validate();
      } else {
         throw new IllegalArgumentException("List validation with explicit values must specify at least one value");
      }
   }

   public XSSFDataValidationConstraint(int validationType, String formula1) {
      this.setFormula1(formula1);
      this.validationType = validationType;
      this.validate();
   }

   public XSSFDataValidationConstraint(int validationType, int operator, String formula1) {
      this.setFormula1(formula1);
      this.validationType = validationType;
      this.operator = operator;
      this.validate();
   }

   public XSSFDataValidationConstraint(int validationType, int operator, String formula1, String formula2) {
      this.setFormula1(formula1);
      this.setFormula2(formula2);
      this.validationType = validationType;
      this.operator = operator;
      this.validate();
      if(3 == validationType && formula1 != null && formula1.startsWith("\"") && formula1.endsWith("\"")) {
         String formulaWithoutQuotes = formula1.substring(1, formula1.length() - 1);
         this.explicitListOfValues = LIST_SPLIT_REGEX.split(formulaWithoutQuotes);
      }

   }

   public String[] getExplicitListValues() {
      return this.explicitListOfValues;
   }

   public String getFormula1() {
      return this.formula1;
   }

   public String getFormula2() {
      return this.formula2;
   }

   public int getOperator() {
      return this.operator;
   }

   public int getValidationType() {
      return this.validationType;
   }

   public void setExplicitListValues(String[] explicitListValues) {
      this.explicitListOfValues = explicitListValues;
      if(this.explicitListOfValues != null && this.explicitListOfValues.length > 0) {
         StringBuilder builder = new StringBuilder("\"");

         for(int i = 0; i < explicitListValues.length; ++i) {
            String string = explicitListValues[i];
            if(builder.length() > 1) {
               builder.append(",");
            }

            builder.append(string);
         }

         builder.append("\"");
         this.setFormula1(builder.toString());
      }

   }

   public void setFormula1(String formula1) {
      this.formula1 = removeLeadingEquals(formula1);
   }

   protected static String removeLeadingEquals(String formula1) {
      return isFormulaEmpty(formula1)?formula1:(formula1.charAt(0) == 61?formula1.substring(1):formula1);
   }

   public void setFormula2(String formula2) {
      this.formula2 = removeLeadingEquals(formula2);
   }

   public void setOperator(int operator) {
      this.operator = operator;
   }

   public void validate() {
      if(this.validationType != 0) {
         if(this.validationType == 3) {
            if(isFormulaEmpty(this.formula1)) {
               throw new IllegalArgumentException("A valid formula or a list of values must be specified for list validation.");
            }
         } else {
            if(isFormulaEmpty(this.formula1)) {
               throw new IllegalArgumentException("Formula is not specified. Formula is required for all validation types except explicit list validation.");
            }

            if(this.validationType != 7) {
               if(this.operator == -1) {
                  throw new IllegalArgumentException("This validation type requires an operator to be specified.");
               }

               if((this.operator == 0 || this.operator == 1) && isFormulaEmpty(this.formula2)) {
                  throw new IllegalArgumentException("Between and not between comparisons require two formulae to be specified.");
               }
            }
         }

      }
   }

   protected static boolean isFormulaEmpty(String formula1) {
      return formula1 == null || formula1.trim().length() == 0;
   }

   public String prettyPrint() {
      StringBuilder builder = new StringBuilder();
      STDataValidationType.Enum vt = (STDataValidationType.Enum)XSSFDataValidation.validationTypeMappings.get(Integer.valueOf(this.validationType));
      STDataValidationOperator.Enum ot = (STDataValidationOperator.Enum)XSSFDataValidation.operatorTypeMappings.get(Integer.valueOf(this.operator));
      builder.append(vt);
      builder.append(' ');
      if(this.validationType != 0) {
         if(this.validationType != 3 && this.validationType != 0 && this.validationType != 7) {
            builder.append(",").append(ot).append(", ");
         }

         if(this.validationType == 3 && this.explicitListOfValues != null) {
            builder.append("\"").append(Arrays.asList(this.explicitListOfValues)).append("\"").append(' ');
         } else {
            builder.append("\"").append(this.formula1).append("\"").append(' ');
         }

         if(this.formula2 != null) {
            builder.append("\"").append(this.formula2).append("\"").append(' ');
         }
      }

      return builder.toString();
   }

}
