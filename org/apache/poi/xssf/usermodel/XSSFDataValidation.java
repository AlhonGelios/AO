package org.apache.poi.xssf.usermodel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType;

public class XSSFDataValidation implements DataValidation {

   private CTDataValidation ctDdataValidation;
   private XSSFDataValidationConstraint validationConstraint;
   private CellRangeAddressList regions;
   static Map operatorTypeMappings = new HashMap();
   static Map operatorTypeReverseMappings = new HashMap();
   static Map validationTypeMappings = new HashMap();
   static Map validationTypeReverseMappings = new HashMap();
   static Map errorStyleMappings = new HashMap();


   XSSFDataValidation(CellRangeAddressList regions, CTDataValidation ctDataValidation) {
      this(getConstraint(ctDataValidation), regions, ctDataValidation);
   }

   public XSSFDataValidation(XSSFDataValidationConstraint constraint, CellRangeAddressList regions, CTDataValidation ctDataValidation) {
      this.validationConstraint = constraint;
      this.ctDdataValidation = ctDataValidation;
      this.regions = regions;
   }

   CTDataValidation getCtDdataValidation() {
      return this.ctDdataValidation;
   }

   public void createErrorBox(String title, String text) {
      this.ctDdataValidation.setErrorTitle(title);
      this.ctDdataValidation.setError(text);
   }

   public void createPromptBox(String title, String text) {
      this.ctDdataValidation.setPromptTitle(title);
      this.ctDdataValidation.setPrompt(text);
   }

   public boolean getEmptyCellAllowed() {
      return this.ctDdataValidation.getAllowBlank();
   }

   public String getErrorBoxText() {
      return this.ctDdataValidation.getError();
   }

   public String getErrorBoxTitle() {
      return this.ctDdataValidation.getErrorTitle();
   }

   public int getErrorStyle() {
      return this.ctDdataValidation.getErrorStyle().intValue();
   }

   public String getPromptBoxText() {
      return this.ctDdataValidation.getPrompt();
   }

   public String getPromptBoxTitle() {
      return this.ctDdataValidation.getPromptTitle();
   }

   public boolean getShowErrorBox() {
      return this.ctDdataValidation.getShowErrorMessage();
   }

   public boolean getShowPromptBox() {
      return this.ctDdataValidation.getShowInputMessage();
   }

   public boolean getSuppressDropDownArrow() {
      return !this.ctDdataValidation.getShowDropDown();
   }

   public DataValidationConstraint getValidationConstraint() {
      return this.validationConstraint;
   }

   public void setEmptyCellAllowed(boolean allowed) {
      this.ctDdataValidation.setAllowBlank(allowed);
   }

   public void setErrorStyle(int errorStyle) {
      this.ctDdataValidation.setErrorStyle((STDataValidationErrorStyle.Enum)errorStyleMappings.get(Integer.valueOf(errorStyle)));
   }

   public void setShowErrorBox(boolean show) {
      this.ctDdataValidation.setShowErrorMessage(show);
   }

   public void setShowPromptBox(boolean show) {
      this.ctDdataValidation.setShowInputMessage(show);
   }

   public void setSuppressDropDownArrow(boolean suppress) {
      if(this.validationConstraint.getValidationType() == 3) {
         this.ctDdataValidation.setShowDropDown(!suppress);
      }

   }

   public CellRangeAddressList getRegions() {
      return this.regions;
   }

   public String prettyPrint() {
      StringBuilder builder = new StringBuilder();
      CellRangeAddress[] arr$ = this.regions.getCellRangeAddresses();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellRangeAddress address = arr$[i$];
         builder.append(address.formatAsString());
      }

      builder.append(" => ");
      builder.append(this.validationConstraint.prettyPrint());
      return builder.toString();
   }

   private static XSSFDataValidationConstraint getConstraint(CTDataValidation ctDataValidation) {
      XSSFDataValidationConstraint constraint = null;
      String formula1 = ctDataValidation.getFormula1();
      String formula2 = ctDataValidation.getFormula2();
      STDataValidationOperator.Enum operator = ctDataValidation.getOperator();
      STDataValidationType.Enum type = ctDataValidation.getType();
      Integer validationType = (Integer)validationTypeReverseMappings.get(type);
      Integer operatorType = (Integer)operatorTypeReverseMappings.get(operator);
      constraint = new XSSFDataValidationConstraint(validationType.intValue(), operatorType.intValue(), formula1, formula2);
      return constraint;
   }

   static {
      errorStyleMappings.put(Integer.valueOf(2), STDataValidationErrorStyle.INFORMATION);
      errorStyleMappings.put(Integer.valueOf(0), STDataValidationErrorStyle.STOP);
      errorStyleMappings.put(Integer.valueOf(1), STDataValidationErrorStyle.WARNING);
      operatorTypeMappings.put(Integer.valueOf(0), STDataValidationOperator.BETWEEN);
      operatorTypeMappings.put(Integer.valueOf(1), STDataValidationOperator.NOT_BETWEEN);
      operatorTypeMappings.put(Integer.valueOf(2), STDataValidationOperator.EQUAL);
      operatorTypeMappings.put(Integer.valueOf(3), STDataValidationOperator.NOT_EQUAL);
      operatorTypeMappings.put(Integer.valueOf(4), STDataValidationOperator.GREATER_THAN);
      operatorTypeMappings.put(Integer.valueOf(6), STDataValidationOperator.GREATER_THAN_OR_EQUAL);
      operatorTypeMappings.put(Integer.valueOf(5), STDataValidationOperator.LESS_THAN);
      operatorTypeMappings.put(Integer.valueOf(7), STDataValidationOperator.LESS_THAN_OR_EQUAL);
      Iterator i$ = operatorTypeMappings.entrySet().iterator();

      Entry entry;
      while(i$.hasNext()) {
         entry = (Entry)i$.next();
         operatorTypeReverseMappings.put(entry.getValue(), entry.getKey());
      }

      validationTypeMappings.put(Integer.valueOf(7), STDataValidationType.CUSTOM);
      validationTypeMappings.put(Integer.valueOf(4), STDataValidationType.DATE);
      validationTypeMappings.put(Integer.valueOf(2), STDataValidationType.DECIMAL);
      validationTypeMappings.put(Integer.valueOf(3), STDataValidationType.LIST);
      validationTypeMappings.put(Integer.valueOf(0), STDataValidationType.NONE);
      validationTypeMappings.put(Integer.valueOf(6), STDataValidationType.TEXT_LENGTH);
      validationTypeMappings.put(Integer.valueOf(5), STDataValidationType.TIME);
      validationTypeMappings.put(Integer.valueOf(1), STDataValidationType.WHOLE);
      i$ = validationTypeMappings.entrySet().iterator();

      while(i$.hasNext()) {
         entry = (Entry)i$.next();
         validationTypeReverseMappings.put(entry.getValue(), entry.getKey());
      }

   }
}
