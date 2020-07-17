package org.apache.poi.xwpf.usermodel;

import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;

public class XWPFStyle {

   protected XWPFStyles styles;
   private CTStyle ctStyle;


   public XWPFStyle(CTStyle style) {
      this(style, (XWPFStyles)null);
   }

   public XWPFStyle(CTStyle style, XWPFStyles styles) {
      this.ctStyle = style;
      this.styles = styles;
   }

   public String getStyleId() {
      return this.ctStyle.getStyleId();
   }

   public void setStyleId(String styleId) {
      this.ctStyle.setStyleId(styleId);
   }

   public STStyleType.Enum getType() {
      return this.ctStyle.getType();
   }

   public void setType(STStyleType.Enum type) {
      this.ctStyle.setType(type);
   }

   public void setStyle(CTStyle style) {
      this.ctStyle = style;
   }

   public CTStyle getCTStyle() {
      return this.ctStyle;
   }

   public XWPFStyles getStyles() {
      return this.styles;
   }

   public String getBasisStyleID() {
      return this.ctStyle.getBasedOn() != null?this.ctStyle.getBasedOn().getVal():null;
   }

   public String getLinkStyleID() {
      return this.ctStyle.getLink() != null?this.ctStyle.getLink().getVal():null;
   }

   public String getNextStyleID() {
      return this.ctStyle.getNext() != null?this.ctStyle.getNext().getVal():null;
   }

   public String getName() {
      return this.ctStyle.isSetName()?this.ctStyle.getName().getVal():null;
   }

   public boolean hasSameName(XWPFStyle compStyle) {
      CTStyle ctCompStyle = compStyle.getCTStyle();
      String name = ctCompStyle.getName().getVal();
      return name.equals(this.ctStyle.getName().getVal());
   }
}
