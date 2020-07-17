package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.extensions.XSSFHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public class XSSFFirstHeader extends XSSFHeaderFooter implements Header {

   protected XSSFFirstHeader(CTHeaderFooter headerFooter) {
      super(headerFooter);
      headerFooter.setDifferentFirst(true);
   }

   public String getText() {
      return this.getHeaderFooter().getFirstHeader();
   }

   public void setText(String text) {
      if(text == null) {
         this.getHeaderFooter().unsetFirstHeader();
      } else {
         this.getHeaderFooter().setFirstHeader(text);
      }

   }
}
