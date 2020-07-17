package org.apache.poi.xwpf.usermodel;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;

public class XWPFDefaultParagraphStyle {

   private CTPPr ppr;


   public XWPFDefaultParagraphStyle(CTPPr ppr) {
      this.ppr = ppr;
   }

   protected CTPPr getPPr() {
      return this.ppr;
   }

   public int getSpacingAfter() {
      return this.ppr.isSetSpacing()?this.ppr.getSpacing().getAfter().intValue():-1;
   }
}
