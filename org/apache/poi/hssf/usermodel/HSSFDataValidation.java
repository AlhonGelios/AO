package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.record.DVRecord;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;

public final class HSSFDataValidation implements DataValidation {

   private String _prompt_title;
   private String _prompt_text;
   private String _error_title;
   private String _error_text;
   private int _errorStyle = 0;
   private boolean _emptyCellAllowed = true;
   private boolean _suppress_dropdown_arrow = false;
   private boolean _showPromptBox = true;
   private boolean _showErrorBox = true;
   private CellRangeAddressList _regions;
   private DVConstraint _constraint;


   public HSSFDataValidation(CellRangeAddressList regions, DataValidationConstraint constraint) {
      this._regions = regions;
      this._constraint = (DVConstraint)constraint;
   }

   public DataValidationConstraint getValidationConstraint() {
      return this._constraint;
   }

   public DVConstraint getConstraint() {
      return this._constraint;
   }

   public CellRangeAddressList getRegions() {
      return this._regions;
   }

   public void setErrorStyle(int error_style) {
      this._errorStyle = error_style;
   }

   public int getErrorStyle() {
      return this._errorStyle;
   }

   public void setEmptyCellAllowed(boolean allowed) {
      this._emptyCellAllowed = allowed;
   }

   public boolean getEmptyCellAllowed() {
      return this._emptyCellAllowed;
   }

   public void setSuppressDropDownArrow(boolean suppress) {
      this._suppress_dropdown_arrow = suppress;
   }

   public boolean getSuppressDropDownArrow() {
      return this._constraint.getValidationType() == 3?this._suppress_dropdown_arrow:false;
   }

   public void setShowPromptBox(boolean show) {
      this._showPromptBox = show;
   }

   public boolean getShowPromptBox() {
      return this._showPromptBox;
   }

   public void setShowErrorBox(boolean show) {
      this._showErrorBox = show;
   }

   public boolean getShowErrorBox() {
      return this._showErrorBox;
   }

   public void createPromptBox(String title, String text) {
      this._prompt_title = title;
      this._prompt_text = text;
      this.setShowPromptBox(true);
   }

   public String getPromptBoxTitle() {
      return this._prompt_title;
   }

   public String getPromptBoxText() {
      return this._prompt_text;
   }

   public void createErrorBox(String title, String text) {
      this._error_title = title;
      this._error_text = text;
      this.setShowErrorBox(true);
   }

   public String getErrorBoxTitle() {
      return this._error_title;
   }

   public String getErrorBoxText() {
      return this._error_text;
   }

   public DVRecord createDVRecord(HSSFSheet sheet) {
      DVConstraint.FormulaPair fp = this._constraint.createFormulas(sheet);
      return new DVRecord(this._constraint.getValidationType(), this._constraint.getOperator(), this._errorStyle, this._emptyCellAllowed, this.getSuppressDropDownArrow(), this._constraint.getValidationType() == 3 && this._constraint.getExplicitListValues() != null, this._showPromptBox, this._prompt_title, this._prompt_text, this._showErrorBox, this._error_title, this._error_text, fp.getFormula1(), fp.getFormula2(), this._regions);
   }
}
