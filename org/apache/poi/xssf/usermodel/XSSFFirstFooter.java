package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.xssf.usermodel.extensions.XSSFHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public class XSSFFirstFooter extends XSSFHeaderFooter implements Footer {

   protected XSSFFirstFooter(CTHeaderFooter headerFooter) {
      super(headerFooter);
      headerFooter.setDifferentFirst(true);
   }

   public String getText() {
      return this.getHeaderFooter().getFirstFooter();
   }

   public void setText(String text) {
      if(text == null) {
         this.getHeaderFooter().unsetFirstFooter();
      } else {
         this.getHeaderFooter().setFirstFooter(text);
      }

   }
}
