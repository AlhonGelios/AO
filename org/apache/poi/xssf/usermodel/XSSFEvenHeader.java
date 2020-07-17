package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.extensions.XSSFHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public class XSSFEvenHeader extends XSSFHeaderFooter implements Header {

   public XSSFEvenHeader(CTHeaderFooter headerFooter) {
      super(headerFooter);
      headerFooter.setDifferentOddEven(true);
   }

   public String getText() {
      return this.getHeaderFooter().getEvenHeader();
   }

   public void setText(String text) {
      if(text == null) {
         this.getHeaderFooter().unsetEvenHeader();
      } else {
         this.getHeaderFooter().setEvenHeader(text);
      }

   }
}
