package org.apache.poi.xslf.usermodel;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;

public class DrawingParagraph {

   private final CTTextParagraph p;


   public DrawingParagraph(CTTextParagraph p) {
      this.p = p;
   }

   public CharSequence getText() {
      StringBuilder text = new StringBuilder();
      XmlCursor c = this.p.newCursor();
      c.selectPath("./*");

      while(c.toNextSelection()) {
         XmlObject o = c.getObject();
         if(o instanceof CTRegularTextRun) {
            CTRegularTextRun txrun = (CTRegularTextRun)o;
            text.append(txrun.getT());
         } else if(o instanceof CTTextLineBreak) {
            text.append('\n');
         }
      }

      c.dispose();
      return text;
   }
}
