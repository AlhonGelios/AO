package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingThreshold;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

public class XSSFIconMultiStateFormatting implements IconMultiStateFormatting {

   CTIconSet _iconset;


   XSSFIconMultiStateFormatting(CTIconSet iconset) {
      this._iconset = iconset;
   }

   public IconMultiStateFormatting.IconSet getIconSet() {
      String set = this._iconset.getIconSet().toString();
      return IconMultiStateFormatting.IconSet.byName(set);
   }

   public void setIconSet(IconMultiStateFormatting.IconSet set) {
      STIconSetType.Enum xIconSet = STIconSetType.Enum.forString(set.name);
      this._iconset.setIconSet(xIconSet);
   }

   public boolean isIconOnly() {
      return this._iconset.isSetShowValue()?!this._iconset.getShowValue():false;
   }

   public void setIconOnly(boolean only) {
      this._iconset.setShowValue(!only);
   }

   public boolean isReversed() {
      return this._iconset.isSetReverse()?this._iconset.getReverse():false;
   }

   public void setReversed(boolean reversed) {
      this._iconset.setReverse(reversed);
   }

   public XSSFConditionalFormattingThreshold[] getThresholds() {
      CTCfvo[] cfvos = this._iconset.getCfvoArray();
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

      this._iconset.setCfvoArray(cfvos);
   }

   public XSSFConditionalFormattingThreshold createThreshold() {
      return new XSSFConditionalFormattingThreshold(this._iconset.addNewCfvo());
   }
}
