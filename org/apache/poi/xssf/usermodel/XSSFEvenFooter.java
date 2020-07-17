package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.xssf.usermodel.extensions.XSSFHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public class XSSFEvenFooter extends XSSFHeaderFooter implements Footer {

   public XSSFEvenFooter(CTHeaderFooter headerFooter) {
      super(headerFooter);
      headerFooter.setDifferentOddEven(true);
   }

   public String getText() {
      return this.getHeaderFooter().getEvenFooter();
   }

   public void setText(String text) {
      if(text == null) {
         this.getHeaderFooter().unsetEvenFooter();
      } else {
         this.getHeaderFooter().setEvenFooter(text);
      }

   }
}
