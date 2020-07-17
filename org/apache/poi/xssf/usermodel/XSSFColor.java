package org.apache.poi.xssf.usermodel;

import java.awt.Color;
import java.util.Arrays;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.util.Internal;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;

public class XSSFColor extends ExtendedColor {

   private final CTColor ctColor;


   public XSSFColor(CTColor color) {
      this.ctColor = color;
   }

   public XSSFColor() {
      this.ctColor = CTColor.Factory.newInstance();
   }

   public XSSFColor(Color clr) {
      this();
      this.setColor(clr);
   }

   public XSSFColor(byte[] rgb) {
      this();
      this.ctColor.setRgb(rgb);
   }

   public XSSFColor(IndexedColors indexedColor) {
      this();
      this.ctColor.setIndexed((long)indexedColor.index);
   }

   public boolean isAuto() {
      return this.ctColor.getAuto();
   }

   public void setAuto(boolean auto) {
      this.ctColor.setAuto(auto);
   }

   public boolean isIndexed() {
      return this.ctColor.isSetIndexed();
   }

   public boolean isRGB() {
      return this.ctColor.isSetRgb();
   }

   public boolean isThemed() {
      return this.ctColor.isSetTheme();
   }

   public boolean hasAlpha() {
      return !this.ctColor.isSetRgb()?false:this.ctColor.getRgb().length == 4;
   }

   public boolean hasTint() {
      return !this.ctColor.isSetTint()?false:this.ctColor.getTint() != 0.0D;
   }

   public short getIndex() {
      return (short)((int)this.ctColor.getIndexed());
   }

   public short getIndexed() {
      return this.getIndex();
   }

   public void setIndexed(int indexed) {
      this.ctColor.setIndexed((long)indexed);
   }

   public byte[] getRGB() {
      byte[] rgb = this.getRGBOrARGB();
      if(rgb == null) {
         return null;
      } else if(rgb.length == 4) {
         byte[] tmp = new byte[3];
         System.arraycopy(rgb, 1, tmp, 0, 3);
         return tmp;
      } else {
         return rgb;
      }
   }

   public byte[] getARGB() {
      byte[] rgb = this.getRGBOrARGB();
      if(rgb == null) {
         return null;
      } else if(rgb.length == 3) {
         byte[] tmp = new byte[4];
         tmp[0] = -1;
         System.arraycopy(rgb, 0, tmp, 1, 3);
         return tmp;
      } else {
         return rgb;
      }
   }

   protected byte[] getStoredRBG() {
      return this.ctColor.getRgb();
   }

   public void setRGB(byte[] rgb) {
      this.ctColor.setRgb(rgb);
   }

   public int getTheme() {
      return (int)this.ctColor.getTheme();
   }

   public void setTheme(int theme) {
      this.ctColor.setTheme((long)theme);
   }

   public double getTint() {
      return this.ctColor.getTint();
   }

   public void setTint(double tint) {
      this.ctColor.setTint(tint);
   }

   @Internal
   public CTColor getCTColor() {
      return this.ctColor;
   }

   public static XSSFColor toXSSFColor(org.apache.poi.ss.usermodel.Color color) {
      if(color != null && !(color instanceof XSSFColor)) {
         throw new IllegalArgumentException("Only XSSFColor objects are supported");
      } else {
         return (XSSFColor)color;
      }
   }

   public int hashCode() {
      return this.ctColor.toString().hashCode();
   }

   private boolean sameIndexed(XSSFColor other) {
      return this.isIndexed() == other.isIndexed()?(this.isIndexed()?this.getIndexed() == other.getIndexed():true):false;
   }

   private boolean sameARGB(XSSFColor other) {
      return this.isRGB() == other.isRGB()?(this.isRGB()?Arrays.equals(this.getARGB(), other.getARGB()):true):false;
   }

   private boolean sameTheme(XSSFColor other) {
      return this.isThemed() == other.isThemed()?(this.isThemed()?this.getTheme() == other.getTheme():true):false;
   }

   private boolean sameTint(XSSFColor other) {
      return this.hasTint() == other.hasTint()?(this.hasTint()?this.getTint() == other.getTint():true):false;
   }

   private boolean sameAuto(XSSFColor other) {
      return this.isAuto() == other.isAuto();
   }

   public boolean equals(Object o) {
      if(!(o instanceof XSSFColor)) {
         return false;
      } else {
         XSSFColor other = (XSSFColor)o;
         return this.sameARGB(other) && this.sameTheme(other) && this.sameIndexed(other) && this.sameTint(other) && this.sameAuto(other);
      }
   }
}
