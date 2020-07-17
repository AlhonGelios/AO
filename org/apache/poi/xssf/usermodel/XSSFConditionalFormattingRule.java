package org.apache.poi.xssf.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.ConditionType;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFBorderFormatting;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFColorScaleFormatting;
import org.apache.poi.xssf.usermodel.XSSFDataBarFormatting;
import org.apache.poi.xssf.usermodel.XSSFFontFormatting;
import org.apache.poi.xssf.usermodel.XSSFIconMultiStateFormatting;
import org.apache.poi.xssf.usermodel.XSSFPatternFormatting;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfvoType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

public class XSSFConditionalFormattingRule implements ConditionalFormattingRule {

   private final CTCfRule _cfRule;
   private XSSFSheet _sh;
   private static Map typeLookup = new HashMap();


   XSSFConditionalFormattingRule(XSSFSheet sh) {
      this._cfRule = CTCfRule.Factory.newInstance();
      this._sh = sh;
   }

   XSSFConditionalFormattingRule(XSSFSheet sh, CTCfRule cfRule) {
      this._cfRule = cfRule;
      this._sh = sh;
   }

   CTCfRule getCTCfRule() {
      return this._cfRule;
   }

   CTDxf getDxf(boolean create) {
      StylesTable styles = this._sh.getWorkbook().getStylesSource();
      CTDxf dxf = null;
      int dxfId;
      if(styles._getDXfsSize() > 0 && this._cfRule.isSetDxfId()) {
         dxfId = (int)this._cfRule.getDxfId();
         dxf = styles.getDxfAt(dxfId);
      }

      if(create && dxf == null) {
         dxf = CTDxf.Factory.newInstance();
         dxfId = styles.putDxf(dxf);
         this._cfRule.setDxfId((long)(dxfId - 1));
      }

      return dxf;
   }

   public XSSFBorderFormatting createBorderFormatting() {
      CTDxf dxf = this.getDxf(true);
      CTBorder border;
      if(!dxf.isSetBorder()) {
         border = dxf.addNewBorder();
      } else {
         border = dxf.getBorder();
      }

      return new XSSFBorderFormatting(border);
   }

   public XSSFBorderFormatting getBorderFormatting() {
      CTDxf dxf = this.getDxf(false);
      return dxf != null && dxf.isSetBorder()?new XSSFBorderFormatting(dxf.getBorder()):null;
   }

   public XSSFFontFormatting createFontFormatting() {
      CTDxf dxf = this.getDxf(true);
      CTFont font;
      if(!dxf.isSetFont()) {
         font = dxf.addNewFont();
      } else {
         font = dxf.getFont();
      }

      return new XSSFFontFormatting(font);
   }

   public XSSFFontFormatting getFontFormatting() {
      CTDxf dxf = this.getDxf(false);
      return dxf != null && dxf.isSetFont()?new XSSFFontFormatting(dxf.getFont()):null;
   }

   public XSSFPatternFormatting createPatternFormatting() {
      CTDxf dxf = this.getDxf(true);
      CTFill fill;
      if(!dxf.isSetFill()) {
         fill = dxf.addNewFill();
      } else {
         fill = dxf.getFill();
      }

      return new XSSFPatternFormatting(fill);
   }

   public XSSFPatternFormatting getPatternFormatting() {
      CTDxf dxf = this.getDxf(false);
      return dxf != null && dxf.isSetFill()?new XSSFPatternFormatting(dxf.getFill()):null;
   }

   public XSSFDataBarFormatting createDataBarFormatting(XSSFColor color) {
      if(this._cfRule.isSetDataBar() && this._cfRule.getType() == STCfType.DATA_BAR) {
         return this.getDataBarFormatting();
      } else {
         this._cfRule.setType(STCfType.DATA_BAR);
         CTDataBar bar = null;
         if(this._cfRule.isSetDataBar()) {
            bar = this._cfRule.getDataBar();
         } else {
            bar = this._cfRule.addNewDataBar();
         }

         bar.setColor(color.getCTColor());
         CTCfvo min = bar.addNewCfvo();
         min.setType(STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.MIN.name));
         CTCfvo max = bar.addNewCfvo();
         max.setType(STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.MAX.name));
         return new XSSFDataBarFormatting(bar);
      }
   }

   public XSSFDataBarFormatting getDataBarFormatting() {
      if(this._cfRule.isSetDataBar()) {
         CTDataBar bar = this._cfRule.getDataBar();
         return new XSSFDataBarFormatting(bar);
      } else {
         return null;
      }
   }

   public XSSFIconMultiStateFormatting createMultiStateFormatting(IconMultiStateFormatting.IconSet iconSet) {
      if(this._cfRule.isSetIconSet() && this._cfRule.getType() == STCfType.ICON_SET) {
         return this.getMultiStateFormatting();
      } else {
         this._cfRule.setType(STCfType.ICON_SET);
         CTIconSet icons = null;
         if(this._cfRule.isSetIconSet()) {
            icons = this._cfRule.getIconSet();
         } else {
            icons = this._cfRule.addNewIconSet();
         }

         if(iconSet.name != null) {
            STIconSetType.Enum jump = STIconSetType.Enum.forString(iconSet.name);
            icons.setIconSet(jump);
         }

         int var7 = 100 / iconSet.num;
         STCfvoType.Enum type = STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.PERCENT.name);

         for(int i = 0; i < iconSet.num; ++i) {
            CTCfvo cfvo = icons.addNewCfvo();
            cfvo.setType(type);
            cfvo.setVal(Integer.toString(i * var7));
         }

         return new XSSFIconMultiStateFormatting(icons);
      }
   }

   public XSSFIconMultiStateFormatting getMultiStateFormatting() {
      if(this._cfRule.isSetIconSet()) {
         CTIconSet icons = this._cfRule.getIconSet();
         return new XSSFIconMultiStateFormatting(icons);
      } else {
         return null;
      }
   }

   public XSSFColorScaleFormatting createColorScaleFormatting() {
      if(this._cfRule.isSetColorScale() && this._cfRule.getType() == STCfType.COLOR_SCALE) {
         return this.getColorScaleFormatting();
      } else {
         this._cfRule.setType(STCfType.COLOR_SCALE);
         CTColorScale scale = null;
         if(this._cfRule.isSetColorScale()) {
            scale = this._cfRule.getColorScale();
         } else {
            scale = this._cfRule.addNewColorScale();
         }

         if(scale.sizeOfCfvoArray() == 0) {
            CTCfvo cfvo = scale.addNewCfvo();
            cfvo.setType(STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.MIN.name));
            cfvo = scale.addNewCfvo();
            cfvo.setType(STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.PERCENTILE.name));
            cfvo.setVal("50");
            cfvo = scale.addNewCfvo();
            cfvo.setType(STCfvoType.Enum.forString(ConditionalFormattingThreshold.RangeType.MAX.name));

            for(int i = 0; i < 3; ++i) {
               scale.addNewColor();
            }
         }

         return new XSSFColorScaleFormatting(scale);
      }
   }

   public XSSFColorScaleFormatting getColorScaleFormatting() {
      if(this._cfRule.isSetColorScale()) {
         CTColorScale scale = this._cfRule.getColorScale();
         return new XSSFColorScaleFormatting(scale);
      } else {
         return null;
      }
   }

   public ConditionType getConditionType() {
      return (ConditionType)typeLookup.get(this._cfRule.getType());
   }

   public byte getComparisonOperation() {
      STConditionalFormattingOperator.Enum op = this._cfRule.getOperator();
      if(op == null) {
         return (byte)0;
      } else {
         switch(op.intValue()) {
         case 1:
            return (byte)6;
         case 2:
            return (byte)8;
         case 3:
            return (byte)3;
         case 4:
            return (byte)4;
         case 5:
            return (byte)7;
         case 6:
            return (byte)5;
         case 7:
            return (byte)1;
         case 8:
            return (byte)2;
         default:
            return (byte)0;
         }
      }
   }

   public String getFormula1() {
      return this._cfRule.sizeOfFormulaArray() > 0?this._cfRule.getFormulaArray(0):null;
   }

   public String getFormula2() {
      return this._cfRule.sizeOfFormulaArray() == 2?this._cfRule.getFormulaArray(1):null;
   }

   static {
      typeLookup.put(STCfType.CELL_IS, ConditionType.CELL_VALUE_IS);
      typeLookup.put(STCfType.EXPRESSION, ConditionType.FORMULA);
      typeLookup.put(STCfType.COLOR_SCALE, ConditionType.COLOR_SCALE);
      typeLookup.put(STCfType.DATA_BAR, ConditionType.DATA_BAR);
      typeLookup.put(STCfType.ICON_SET, ConditionType.ICON_SET);
      typeLookup.put(STCfType.TOP_10, ConditionType.FILTER);
      typeLookup.put(STCfType.UNIQUE_VALUES, ConditionType.FILTER);
      typeLookup.put(STCfType.DUPLICATE_VALUES, ConditionType.FILTER);
      typeLookup.put(STCfType.CONTAINS_TEXT, ConditionType.FILTER);
      typeLookup.put(STCfType.NOT_CONTAINS_TEXT, ConditionType.FILTER);
      typeLookup.put(STCfType.BEGINS_WITH, ConditionType.FILTER);
      typeLookup.put(STCfType.ENDS_WITH, ConditionType.FILTER);
      typeLookup.put(STCfType.CONTAINS_BLANKS, ConditionType.FILTER);
      typeLookup.put(STCfType.NOT_CONTAINS_BLANKS, ConditionType.FILTER);
      typeLookup.put(STCfType.CONTAINS_ERRORS, ConditionType.FILTER);
      typeLookup.put(STCfType.NOT_CONTAINS_ERRORS, ConditionType.FILTER);
      typeLookup.put(STCfType.TIME_PERIOD, ConditionType.FILTER);
      typeLookup.put(STCfType.ABOVE_AVERAGE, ConditionType.FILTER);
   }
}
