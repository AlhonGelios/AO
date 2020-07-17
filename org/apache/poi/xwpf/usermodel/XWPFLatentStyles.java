package org.apache.poi.xwpf.usermodel;

import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException;

public class XWPFLatentStyles {

   protected XWPFStyles styles;
   private CTLatentStyles latentStyles;


   protected XWPFLatentStyles() {}

   protected XWPFLatentStyles(CTLatentStyles latentStyles) {
      this(latentStyles, (XWPFStyles)null);
   }

   protected XWPFLatentStyles(CTLatentStyles latentStyles, XWPFStyles styles) {
      this.latentStyles = latentStyles;
      this.styles = styles;
   }

   public int getNumberOfStyles() {
      return this.latentStyles.sizeOfLsdExceptionArray();
   }

   protected boolean isLatentStyle(String latentStyleID) {
      CTLsdException[] arr$ = this.latentStyles.getLsdExceptionArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTLsdException lsd = arr$[i$];
         if(lsd.getName().equals(latentStyleID)) {
            return true;
         }
      }

      return false;
   }
}
