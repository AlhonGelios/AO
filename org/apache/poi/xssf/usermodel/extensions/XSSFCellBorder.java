package org.apache.poi.xssf.usermodel.extensions;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle;

public class XSSFCellBorder {

   private ThemesTable _theme;
   private CTBorder border;


   public XSSFCellBorder(CTBorder border, ThemesTable theme) {
      this(border);
      this._theme = theme;
   }

   public XSSFCellBorder(CTBorder border) {
      this.border = border;
   }

   public XSSFCellBorder() {
      this.border = CTBorder.Factory.newInstance();
   }

   public void setThemesTable(ThemesTable themes) {
      this._theme = themes;
   }

   @Internal
   public CTBorder getCTBorder() {
      return this.border;
   }

   public BorderStyle getBorderStyle(XSSFCellBorder.BorderSide side) {
      CTBorderPr ctBorder = this.getBorder(side);
      STBorderStyle.Enum border = ctBorder == null?STBorderStyle.NONE:ctBorder.getStyle();
      return BorderStyle.values()[border.intValue() - 1];
   }

   public void setBorderStyle(XSSFCellBorder.BorderSide side, BorderStyle style) {
      this.getBorder(side, true).setStyle(STBorderStyle.Enum.forInt(style.ordinal() + 1));
   }

   public XSSFColor getBorderColor(XSSFCellBorder.BorderSide side) {
      CTBorderPr borderPr = this.getBorder(side);
      if(borderPr != null && borderPr.isSetColor()) {
         XSSFColor clr = new XSSFColor(borderPr.getColor());
         if(this._theme != null) {
            this._theme.inheritFromThemeAsRequired(clr);
         }

         return clr;
      } else {
         return null;
      }
   }

   public void setBorderColor(XSSFCellBorder.BorderSide side, XSSFColor color) {
      CTBorderPr borderPr = this.getBorder(side, true);
      if(color == null) {
         borderPr.unsetColor();
      } else {
         borderPr.setColor(color.getCTColor());
      }

   }

   private CTBorderPr getBorder(XSSFCellBorder.BorderSide side) {
      return this.getBorder(side, false);
   }

   private CTBorderPr getBorder(XSSFCellBorder.BorderSide side, boolean ensure) {
      CTBorderPr borderPr;
      switch(XSSFCellBorder.NamelessClass1759371117.$SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[side.ordinal()]) {
      case 1:
         borderPr = this.border.getTop();
         if(ensure && borderPr == null) {
            borderPr = this.border.addNewTop();
         }
         break;
      case 2:
         borderPr = this.border.getRight();
         if(ensure && borderPr == null) {
            borderPr = this.border.addNewRight();
         }
         break;
      case 3:
         borderPr = this.border.getBottom();
         if(ensure && borderPr == null) {
            borderPr = this.border.addNewBottom();
         }
         break;
      case 4:
         borderPr = this.border.getLeft();
         if(ensure && borderPr == null) {
            borderPr = this.border.addNewLeft();
         }
         break;
      default:
         throw new IllegalArgumentException("No suitable side specified for the border");
      }

      return borderPr;
   }

   public int hashCode() {
      return this.border.toString().hashCode();
   }

   public boolean equals(Object o) {
      if(!(o instanceof XSSFCellBorder)) {
         return false;
      } else {
         XSSFCellBorder cf = (XSSFCellBorder)o;
         return this.border.toString().equals(cf.getCTBorder().toString());
      }
   }

   // $FF: synthetic class
   static class NamelessClass1759371117 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide = new int[XSSFCellBorder.BorderSide.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.TOP.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.RIGHT.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.BOTTOM.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.LEFT.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public static enum BorderSide {

      TOP("TOP", 0),
      RIGHT("RIGHT", 1),
      BOTTOM("BOTTOM", 2),
      LEFT("LEFT", 3);
      // $FF: synthetic field
      private static final XSSFCellBorder.BorderSide[] $VALUES = new XSSFCellBorder.BorderSide[]{TOP, RIGHT, BOTTOM, LEFT};


      private BorderSide(String var1, int var2) {}

   }
}
