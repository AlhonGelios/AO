package org.apache.poi.xslf.model;

import org.apache.poi.xslf.model.ParagraphPropertyFetcher;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;

public abstract class CharacterPropertyFetcher extends ParagraphPropertyFetcher {

   public CharacterPropertyFetcher(int level) {
      super(level);
   }

   public boolean fetch(CTTextParagraphProperties props) {
      return props != null && props.isSetDefRPr()?this.fetch(props.getDefRPr()):false;
   }

   public abstract boolean fetch(CTTextCharacterProperties var1);
}
