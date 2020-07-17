package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;

public final class HSSFFont implements Font {

   public static final String FONT_ARIAL = "Arial";
   private FontRecord font;
   private short index;


   protected HSSFFont(short index, FontRecord rec) {
      this.font = rec;
      this.index = index;
   }

   public void setFontName(String name) {
      this.font.setFontName(name);
   }

   public String getFontName() {
      return this.font.getFontName();
   }

   public short getIndex() {
      return this.index;
   }

   public void setFontHeight(short height) {
      this.font.setFontHeight(height);
   }

   public void setFontHeightInPoints(short height) {
      this.font.setFontHeight((short)(height * 20));
   }

   public short getFontHeight() {
      return this.font.getFontHeight();
   }

   public short getFontHeightInPoints() {
      return (short)(this.font.getFontHeight() / 20);
   }

   public void setItalic(boolean italic) {
      this.font.setItalic(italic);
   }

   public boolean getItalic() {
      return this.font.isItalic();
   }

   public void setStrikeout(boolean strikeout) {
      this.font.setStrikeout(strikeout);
   }

   public boolean getStrikeout() {
      return this.font.isStruckout();
   }

   public void setColor(short color) {
      this.font.setColorPaletteIndex(color);
   }

   public short getColor() {
      return this.font.getColorPaletteIndex();
   }

   public HSSFColor getHSSFColor(HSSFWorkbook wb) {
      HSSFPalette pallette = wb.getCustomPalette();
      return pallette.getColor(this.getColor());
   }

   public void setBoldweight(short boldweight) {
      this.font.setBoldWeight(boldweight);
   }

   public void setBold(boolean bold) {
      if(bold) {
         this.font.setBoldWeight((short)700);
      } else {
         this.font.setBoldWeight((short)400);
      }

   }

   public short getBoldweight() {
      return this.font.getBoldWeight();
   }

   public boolean getBold() {
      return this.getBoldweight() == 700;
   }

   public void setTypeOffset(short offset) {
      this.font.setSuperSubScript(offset);
   }

   public short getTypeOffset() {
      return this.font.getSuperSubScript();
   }

   public void setUnderline(byte underline) {
      this.font.setUnderline(underline);
   }

   public byte getUnderline() {
      return this.font.getUnderline();
   }

   public int getCharSet() {
      byte charset = this.font.getCharset();
      return charset >= 0?charset:charset + 256;
   }

   public void setCharSet(int charset) {
      byte cs = (byte)charset;
      if(charset > 127) {
         cs = (byte)(charset - 256);
      }

      this.setCharSet(cs);
   }

   public void setCharSet(byte charset) {
      this.font.setCharset(charset);
   }

   public String toString() {
      return "org.apache.poi.hssf.usermodel.HSSFFont{" + this.font + "}";
   }

   public int hashCode() {
      boolean prime = true;
      byte result = 1;
      int result1 = 31 * result + (this.font == null?0:this.font.hashCode());
      result1 = 31 * result1 + this.index;
      return result1;
   }

   public boolean equals(Object obj) {
      if(this == obj) {
         return true;
      } else if(obj == null) {
         return false;
      } else if(obj instanceof HSSFFont) {
         HSSFFont other = (HSSFFont)obj;
         if(this.font == null) {
            if(other.font != null) {
               return false;
            }
         } else if(!this.font.equals(other.font)) {
            return false;
         }

         return this.index == other.index;
      } else {
         return false;
      }
   }
}
