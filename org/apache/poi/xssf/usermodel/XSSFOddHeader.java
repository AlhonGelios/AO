package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.extensions.XSSFHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;

public class XSSFOddHeader extends XSSFHeaderFooter implements Header {

   protected XSSFOddHeader(CTHeaderFooter headerFooter) {
      super(headerFooter);
   }

   public String getText() {
      return this.getHeaderFooter().getOddHeader();
   }

   public void setText(String text) {
      if(text == null) {
         this.getHeaderFooter().unsetOddHeader();
      } else {
         this.getHeaderFooter().setOddHeader(text);
      }

   }
}
