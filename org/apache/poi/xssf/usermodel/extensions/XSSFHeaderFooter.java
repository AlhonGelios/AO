package org.apache.poi.xssf.usermodel.extensions;

import org.apache.poi.ss.usermodel.HeaderFooter;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.helpers.HeaderFooterHelper;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public abstract class XSSFHeaderFooter implements HeaderFooter {

   private HeaderFooterHelper helper;
   private CTHeaderFooter headerFooter;
   private boolean stripFields = false;


   public XSSFHeaderFooter(CTHeaderFooter headerFooter) {
      this.headerFooter = headerFooter;
      this.helper = new HeaderFooterHelper();
   }

   @Internal
   public CTHeaderFooter getHeaderFooter() {
      return this.headerFooter;
   }

   public String getValue() {
      String value = this.getText();
      return value == null?"":value;
   }

   public boolean areFieldsStripped() {
      return this.stripFields;
   }

   public void setAreFieldsStripped(boolean stripFields) {
      this.stripFields = stripFields;
   }

   public static String stripFields(String text) {
      return org.apache.poi.hssf.usermodel.HeaderFooter.stripFields(text);
   }

   public abstract String getText();

   protected abstract void setText(String var1);

   public String getCenter() {
      String text = this.helper.getCenterSection(this.getText());
      return this.stripFields?stripFields(text):text;
   }

   public String getLeft() {
      String text = this.helper.getLeftSection(this.getText());
      return this.stripFields?stripFields(text):text;
   }

   public String getRight() {
      String text = this.helper.getRightSection(this.getText());
      return this.stripFields?stripFields(text):text;
   }

   public void setCenter(String newCenter) {
      this.setText(this.helper.setCenterSection(this.getText(), newCenter));
   }

   public void setLeft(String newLeft) {
      this.setText(this.helper.setLeftSection(this.getText(), newLeft));
   }

   public void setRight(String newRight) {
      this.setText(this.helper.setRightSection(this.getText(), newRight));
   }
}
