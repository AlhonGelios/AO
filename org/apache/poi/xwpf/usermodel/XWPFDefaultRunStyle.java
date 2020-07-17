package org.apache.poi.xwpf.usermodel;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

public class XWPFDefaultRunStyle {

   private CTRPr rpr;


   public XWPFDefaultRunStyle(CTRPr rpr) {
      this.rpr = rpr;
   }

   protected CTRPr getRPr() {
      return this.rpr;
   }

   public int getFontSize() {
      return this.rpr.isSetSz()?this.rpr.getSz().getVal().intValue() / 2:-1;
   }
}
