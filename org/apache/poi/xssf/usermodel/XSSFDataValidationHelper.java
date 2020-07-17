package org.apache.poi.xssf.usermodel;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType;

public class XSSFDataValidationHelper implements DataValidationHelper {

   public XSSFDataValidationHelper(XSSFSheet xssfSheet) {}

   public DataValidationConstraint createDateConstraint(int operatorType, String formula1, String formula2, String dateFormat) {
      return new XSSFDataValidationConstraint(4, operatorType, formula1, formula2);
   }

   public DataValidationConstraint createDecimalConstraint(int operatorType, String formula1, String formula2) {
      return new XSSFDataValidationConstraint(2, operatorType, formula1, formula2);
   }

   public DataValidationConstraint createExplicitListConstraint(String[] listOfValues) {
      return new XSSFDataValidationConstraint(listOfValues);
   }

   public DataValidationConstraint createFormulaListConstraint(String listFormula) {
      return new XSSFDataValidationConstraint(3, listFormula);
   }

   public DataValidationConstraint createNumericConstraint(int validationType, int operatorType, String formula1, String formula2) {
      return validationType == 1?this.createIntegerConstraint(operatorType, formula1, formula2):(validationType == 2?this.createDecimalConstraint(operatorType, formula1, formula2):(validationType == 6?this.createTextLengthConstraint(operatorType, formula1, formula2):null));
   }

   public DataValidationConstraint createIntegerConstraint(int operatorType, String formula1, String formula2) {
      return new XSSFDataValidationConstraint(1, operatorType, formula1, formula2);
   }

   public DataValidationConstraint createTextLengthConstraint(int operatorType, String formula1, String formula2) {
      return new XSSFDataValidationConstraint(6, operatorType, formula1, formula2);
   }

   public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) {
      return new XSSFDataValidationConstraint(5, operatorType, formula1, formula2);
   }

   public DataValidationConstraint createCustomConstraint(String formula) {
      return new XSSFDataValidationConstraint(7, formula);
   }

   public DataValidation createValidation(DataValidationConstraint constraint, CellRangeAddressList cellRangeAddressList) {
      XSSFDataValidationConstraint dataValidationConstraint = (XSSFDataValidationConstraint)constraint;
      CTDataValidation newDataValidation = CTDataValidation.Factory.newInstance();
      int validationType = constraint.getValidationType();
      switch(validationType) {
      case 0:
         newDataValidation.setType(STDataValidationType.NONE);
         break;
      case 1:
         newDataValidation.setType(STDataValidationType.WHOLE);
         break;
      case 2:
         newDataValidation.setType(STDataValidationType.DECIMAL);
         break;
      case 3:
         newDataValidation.setType(STDataValidationType.LIST);
         newDataValidation.setFormula1(constraint.getFormula1());
         break;
      case 4:
         newDataValidation.setType(STDataValidationType.DATE);
         break;
      case 5:
         newDataValidation.setType(STDataValidationType.TIME);
         break;
      case 6:
         newDataValidation.setType(STDataValidationType.TEXT_LENGTH);
         break;
      case 7:
         newDataValidation.setType(STDataValidationType.CUSTOM);
         break;
      default:
         newDataValidation.setType(STDataValidationType.NONE);
      }

      if(validationType != 0 && validationType != 3) {
         STDataValidationOperator.Enum cellRangeAddresses = (STDataValidationOperator.Enum)XSSFDataValidation.operatorTypeMappings.get(Integer.valueOf(constraint.getOperator()));
         if(cellRangeAddresses != null) {
            newDataValidation.setOperator(cellRangeAddresses);
         }

         if(constraint.getFormula1() != null) {
            newDataValidation.setFormula1(constraint.getFormula1());
         }

         if(constraint.getFormula2() != null) {
            newDataValidation.setFormula2(constraint.getFormula2());
         }
      }

      CellRangeAddress[] var10 = cellRangeAddressList.getCellRangeAddresses();
      ArrayList sqref = new ArrayList();

      for(int i = 0; i < var10.length; ++i) {
         CellRangeAddress cellRangeAddress = var10[i];
         sqref.add(cellRangeAddress.formatAsString());
      }

      newDataValidation.setSqref(sqref);
      newDataValidation.setAllowBlank(true);
      newDataValidation.setErrorStyle(STDataValidationErrorStyle.STOP);
      return new XSSFDataValidation(dataValidationConstraint, cellRangeAddressList, newDataValidation);
   }
}
