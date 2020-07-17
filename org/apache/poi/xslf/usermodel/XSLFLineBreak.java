package org.apache.poi.xslf.usermodel;

import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;

class XSLFLineBreak extends XSLFTextRun {

   private final CTTextCharacterProperties _brProps;


   XSLFLineBreak(CTRegularTextRun r, XSLFTextParagraph p, CTTextCharacterProperties brProps) {
      super(r, p);
      this._brProps = brProps;
   }

   protected CTTextCharacterProperties getRPr(boolean create) {
      return this._brProps;
   }

   public void setText(String text) {
      throw new IllegalStateException("You cannot change text of a line break, it is always \'\\n\'");
   }
}
