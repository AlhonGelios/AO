package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.ColorScaleFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingThreshold;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale;

public class XSSFColorScaleFormatting implements ColorScaleFormatting {

   CTColorScale _scale;


   XSSFColorScaleFormatting(CTColorScale scale) {
      this._scale = scale;
   }

   public int getNumControlPoints() {
      return this._scale.sizeOfCfvoArray();
   }

   public void setNumControlPoints(int num) {
      while(num < this._scale.sizeOfCfvoArray()) {
         this._scale.removeCfvo(this._scale.sizeOfCfvoArray() - 1);
         this._scale.removeColor(this._scale.sizeOfColorArray() - 1);
      }

      while(num > this._scale.sizeOfCfvoArray()) {
         this._scale.addNewCfvo();
         this._scale.addNewColor();
      }

   }

   public XSSFColor[] getColors() {
      CTColor[] ctcols = this._scale.getColorArray();
      XSSFColor[] c = new XSSFColor[ctcols.length];

      for(int i = 0; i < ctcols.length; ++i) {
         c[i] = new XSSFColor(ctcols[i]);
      }

      return c;
   }

   public void setColors(Color[] colors) {
      CTColor[] ctcols = new CTColor[colors.length];

      for(int i = 0; i < colors.length; ++i) {
         ctcols[i] = ((XSSFColor)colors[i]).getCTColor();
      }

      this._scale.setColorArray(ctcols);
   }

   public XSSFConditionalFormattingThreshold[] getThresholds() {
      CTCfvo[] cfvos = this._scale.getCfvoArray();
      XSSFConditionalFormattingThreshold[] t = new XSSFConditionalFormattingThreshold[cfvos.length];

      for(int i = 0; i < cfvos.length; ++i) {
         t[i] = new XSSFConditionalFormattingThreshold(cfvos[i]);
      }

      return t;
   }

   public void setThresholds(ConditionalFormattingThreshold[] thresholds) {
      CTCfvo[] cfvos = new CTCfvo[thresholds.length];

      for(int i = 0; i < thresholds.length; ++i) {
         cfvos[i] = ((XSSFConditionalFormattingThreshold)thresholds[i]).getCTCfvo();
      }

      this._scale.setCfvoArray(cfvos);
   }

   public XSSFColor createColor() {
      return new XSSFColor(this._scale.addNewColor());
   }

   public XSSFConditionalFormattingThreshold createThreshold() {
      return new XSSFConditionalFormattingThreshold(this._scale.addNewCfvo());
   }
}
