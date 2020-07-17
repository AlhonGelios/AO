package org.apache.poi.hssf.record;

import java.util.Arrays;
import org.apache.poi.hssf.record.CFRuleBase;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.cf.ColorGradientFormatting;
import org.apache.poi.hssf.record.cf.ColorGradientThreshold;
import org.apache.poi.hssf.record.cf.DataBarFormatting;
import org.apache.poi.hssf.record.cf.DataBarThreshold;
import org.apache.poi.hssf.record.cf.IconMultiStateThreshold;
import org.apache.poi.hssf.record.cf.Threshold;
import org.apache.poi.hssf.record.common.ExtendedColor;
import org.apache.poi.hssf.record.common.FtrHeader;
import org.apache.poi.hssf.record.common.FutureRecord;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.formula.Formula;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class CFRule12Record extends CFRuleBase implements FutureRecord, Cloneable {

   public static final short sid = 2170;
   private FtrHeader futureHeader;
   private int ext_formatting_length;
   private byte[] ext_formatting_data;
   private Formula formula_scale;
   private byte ext_opts;
   private int priority;
   private int template_type;
   private byte template_param_length;
   private byte[] template_params;
   private DataBarFormatting data_bar;
   private org.apache.poi.hssf.record.cf.IconMultiStateFormatting multistate;
   private ColorGradientFormatting color_gradient;
   private byte[] filter_data;


   private CFRule12Record(byte conditionType, byte comparisonOperation) {
      super(conditionType, comparisonOperation);
      this.setDefaults();
   }

   private CFRule12Record(byte conditionType, byte comparisonOperation, Ptg[] formula1, Ptg[] formula2, Ptg[] formulaScale) {
      super(conditionType, comparisonOperation, formula1, formula2);
      this.setDefaults();
      this.formula_scale = Formula.create(formulaScale);
   }

   private void setDefaults() {
      this.futureHeader = new FtrHeader();
      this.futureHeader.setRecordType((short)2170);
      this.ext_formatting_length = 0;
      this.ext_formatting_data = new byte[4];
      this.formula_scale = Formula.create(Ptg.EMPTY_PTG_ARRAY);
      this.ext_opts = 0;
      this.priority = 0;
      this.template_type = this.getConditionType();
      this.template_param_length = 16;
      this.template_params = new byte[this.template_param_length];
   }

   public static CFRule12Record create(HSSFSheet sheet, String formulaText) {
      Ptg[] formula1 = parseFormula(formulaText, sheet);
      return new CFRule12Record((byte)2, (byte)0, formula1, (Ptg[])null, (Ptg[])null);
   }

   public static CFRule12Record create(HSSFSheet sheet, byte comparisonOperation, String formulaText1, String formulaText2) {
      Ptg[] formula1 = parseFormula(formulaText1, sheet);
      Ptg[] formula2 = parseFormula(formulaText2, sheet);
      return new CFRule12Record((byte)1, comparisonOperation, formula1, formula2, (Ptg[])null);
   }

   public static CFRule12Record create(HSSFSheet sheet, byte comparisonOperation, String formulaText1, String formulaText2, String formulaTextScale) {
      Ptg[] formula1 = parseFormula(formulaText1, sheet);
      Ptg[] formula2 = parseFormula(formulaText2, sheet);
      Ptg[] formula3 = parseFormula(formulaTextScale, sheet);
      return new CFRule12Record((byte)1, comparisonOperation, formula1, formula2, formula3);
   }

   public static CFRule12Record create(HSSFSheet sheet, ExtendedColor color) {
      CFRule12Record r = new CFRule12Record((byte)4, (byte)0);
      DataBarFormatting dbf = r.createDataBarFormatting();
      dbf.setColor(color);
      dbf.setPercentMin((byte)0);
      dbf.setPercentMax((byte)100);
      DataBarThreshold min = new DataBarThreshold();
      min.setType(ConditionalFormattingThreshold.RangeType.MIN.id);
      dbf.setThresholdMin(min);
      DataBarThreshold max = new DataBarThreshold();
      max.setType(ConditionalFormattingThreshold.RangeType.MAX.id);
      dbf.setThresholdMax(max);
      return r;
   }

   public static CFRule12Record create(HSSFSheet sheet, IconMultiStateFormatting.IconSet iconSet) {
      Threshold[] ts = new Threshold[iconSet.num];

      for(int r = 0; r < ts.length; ++r) {
         ts[r] = new IconMultiStateThreshold();
      }

      CFRule12Record var5 = new CFRule12Record((byte)6, (byte)0);
      org.apache.poi.hssf.record.cf.IconMultiStateFormatting imf = var5.createMultiStateFormatting();
      imf.setIconSet(iconSet);
      imf.setThresholds(ts);
      return var5;
   }

   public static CFRule12Record createColorScale(HSSFSheet sheet) {
      byte numPoints = 3;
      ExtendedColor[] colors = new ExtendedColor[numPoints];
      ColorGradientThreshold[] ts = new ColorGradientThreshold[numPoints];

      for(int r = 0; r < ts.length; ++r) {
         ts[r] = new ColorGradientThreshold();
         colors[r] = new ExtendedColor();
      }

      CFRule12Record var6 = new CFRule12Record((byte)3, (byte)0);
      ColorGradientFormatting cgf = var6.createColorGradientFormatting();
      cgf.setNumControlPoints(numPoints);
      cgf.setThresholds(ts);
      cgf.setColors(colors);
      return var6;
   }

   public CFRule12Record(RecordInputStream in) {
      this.futureHeader = new FtrHeader(in);
      this.setConditionType(in.readByte());
      this.setComparisonOperation(in.readByte());
      int field_3_formula1_len = in.readUShort();
      int field_4_formula2_len = in.readUShort();
      this.ext_formatting_length = in.readInt();
      this.ext_formatting_data = new byte[0];
      int formula_scale_len;
      if(this.ext_formatting_length == 0) {
         in.readUShort();
      } else {
         formula_scale_len = this.readFormatOptions(in);
         if(formula_scale_len < this.ext_formatting_length) {
            this.ext_formatting_data = new byte[this.ext_formatting_length - formula_scale_len];
            in.readFully(this.ext_formatting_data);
         }
      }

      this.setFormula1(Formula.read(field_3_formula1_len, in));
      this.setFormula2(Formula.read(field_4_formula2_len, in));
      formula_scale_len = in.readUShort();
      this.formula_scale = Formula.read(formula_scale_len, in);
      this.ext_opts = in.readByte();
      this.priority = in.readUShort();
      this.template_type = in.readUShort();
      this.template_param_length = in.readByte();
      if(this.template_param_length != 0 && this.template_param_length != 16) {
         logger.log(5, new Object[]{"CF Rule v12 template params length should be 0 or 16, found " + this.template_param_length});
         in.readRemainder();
      } else {
         this.template_params = new byte[this.template_param_length];
         in.readFully(this.template_params);
      }

      byte type = this.getConditionType();
      if(type == 3) {
         this.color_gradient = new ColorGradientFormatting(in);
      } else if(type == 4) {
         this.data_bar = new DataBarFormatting(in);
      } else if(type == 5) {
         this.filter_data = in.readRemainder();
      } else if(type == 6) {
         this.multistate = new org.apache.poi.hssf.record.cf.IconMultiStateFormatting(in);
      }

   }

   public boolean containsDataBarBlock() {
      return this.data_bar != null;
   }

   public DataBarFormatting getDataBarFormatting() {
      return this.data_bar;
   }

   public DataBarFormatting createDataBarFormatting() {
      if(this.data_bar != null) {
         return this.data_bar;
      } else {
         this.setConditionType((byte)4);
         this.data_bar = new DataBarFormatting();
         return this.data_bar;
      }
   }

   public boolean containsMultiStateBlock() {
      return this.multistate != null;
   }

   public org.apache.poi.hssf.record.cf.IconMultiStateFormatting getMultiStateFormatting() {
      return this.multistate;
   }

   public org.apache.poi.hssf.record.cf.IconMultiStateFormatting createMultiStateFormatting() {
      if(this.multistate != null) {
         return this.multistate;
      } else {
         this.setConditionType((byte)6);
         this.multistate = new org.apache.poi.hssf.record.cf.IconMultiStateFormatting();
         return this.multistate;
      }
   }

   public boolean containsColorGradientBlock() {
      return this.color_gradient != null;
   }

   public ColorGradientFormatting getColorGradientFormatting() {
      return this.color_gradient;
   }

   public ColorGradientFormatting createColorGradientFormatting() {
      if(this.color_gradient != null) {
         return this.color_gradient;
      } else {
         this.setConditionType((byte)3);
         this.color_gradient = new ColorGradientFormatting();
         return this.color_gradient;
      }
   }

   public Ptg[] getParsedExpressionScale() {
      return this.formula_scale.getTokens();
   }

   public void setParsedExpressionScale(Ptg[] ptgs) {
      this.formula_scale = Formula.create(ptgs);
   }

   public short getSid() {
      return (short)2170;
   }

   public void serialize(LittleEndianOutput out) {
      this.futureHeader.serialize(out);
      int formula1Len = getFormulaSize(this.getFormula1());
      int formula2Len = getFormulaSize(this.getFormula2());
      out.writeByte(this.getConditionType());
      out.writeByte(this.getComparisonOperation());
      out.writeShort(formula1Len);
      out.writeShort(formula2Len);
      if(this.ext_formatting_length == 0) {
         out.writeInt(0);
         out.writeShort(0);
      } else {
         out.writeInt(this.ext_formatting_length);
         this.serializeFormattingBlock(out);
         out.write(this.ext_formatting_data);
      }

      this.getFormula1().serializeTokens(out);
      this.getFormula2().serializeTokens(out);
      out.writeShort(getFormulaSize(this.formula_scale));
      this.formula_scale.serializeTokens(out);
      out.writeByte(this.ext_opts);
      out.writeShort(this.priority);
      out.writeShort(this.template_type);
      out.writeByte(this.template_param_length);
      out.write(this.template_params);
      byte type = this.getConditionType();
      if(type == 3) {
         this.color_gradient.serialize(out);
      } else if(type == 4) {
         this.data_bar.serialize(out);
      } else if(type == 5) {
         out.write(this.filter_data);
      } else if(type == 6) {
         this.multistate.serialize(out);
      }

   }

   protected int getDataSize() {
      int len = FtrHeader.getDataSize() + 6;
      if(this.ext_formatting_length == 0) {
         len += 6;
      } else {
         len += 4 + this.getFormattingBlockSize() + this.ext_formatting_data.length;
      }

      len += getFormulaSize(this.getFormula1());
      len += getFormulaSize(this.getFormula2());
      len += 2 + getFormulaSize(this.formula_scale);
      len += 6 + this.template_params.length;
      byte type = this.getConditionType();
      if(type == 3) {
         len += this.color_gradient.getDataLength();
      } else if(type == 4) {
         len += this.data_bar.getDataLength();
      } else if(type == 5) {
         len += this.filter_data.length;
      } else if(type == 6) {
         len += this.multistate.getDataLength();
      }

      return len;
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[CFRULE12]\n");
      buffer.append("    .condition_type=").append(this.getConditionType()).append("\n");
      buffer.append("    .dxfn12_length =0x").append(Integer.toHexString(this.ext_formatting_length)).append("\n");
      buffer.append("    .option_flags  =0x").append(Integer.toHexString(this.getOptions())).append("\n");
      if(this.containsFontFormattingBlock()) {
         buffer.append(this._fontFormatting.toString()).append("\n");
      }

      if(this.containsBorderFormattingBlock()) {
         buffer.append(this._borderFormatting.toString()).append("\n");
      }

      if(this.containsPatternFormattingBlock()) {
         buffer.append(this._patternFormatting.toString()).append("\n");
      }

      buffer.append("    .dxfn12_ext=").append(HexDump.toHex(this.ext_formatting_data)).append("\n");
      buffer.append("    .formula_1 =").append(Arrays.toString(this.getFormula1().getTokens())).append("\n");
      buffer.append("    .formula_2 =").append(Arrays.toString(this.getFormula2().getTokens())).append("\n");
      buffer.append("    .formula_S =").append(Arrays.toString(this.formula_scale.getTokens())).append("\n");
      buffer.append("    .ext_opts  =").append(this.ext_opts).append("\n");
      buffer.append("    .priority  =").append(this.priority).append("\n");
      buffer.append("    .template_type  =").append(this.template_type).append("\n");
      buffer.append("    .template_params=").append(HexDump.toHex(this.template_params)).append("\n");
      buffer.append("    .filter_data    =").append(HexDump.toHex(this.filter_data)).append("\n");
      if(this.color_gradient != null) {
         buffer.append(this.color_gradient);
      }

      if(this.multistate != null) {
         buffer.append(this.multistate);
      }

      if(this.data_bar != null) {
         buffer.append(this.data_bar);
      }

      buffer.append("[/CFRULE12]\n");
      return buffer.toString();
   }

   public CFRule12Record clone() {
      CFRule12Record rec = new CFRule12Record(this.getConditionType(), this.getComparisonOperation());
      rec.futureHeader.setAssociatedRange(this.futureHeader.getAssociatedRange().copy());
      super.copyTo(rec);
      rec.ext_formatting_length = this.ext_formatting_length;
      rec.ext_formatting_data = new byte[this.ext_formatting_length];
      System.arraycopy(this.ext_formatting_data, 0, rec.ext_formatting_data, 0, this.ext_formatting_length);
      rec.formula_scale = this.formula_scale.copy();
      rec.ext_opts = this.ext_opts;
      rec.priority = this.priority;
      rec.template_type = this.template_type;
      rec.template_param_length = this.template_param_length;
      rec.template_params = new byte[this.template_param_length];
      System.arraycopy(this.template_params, 0, rec.template_params, 0, this.template_param_length);
      if(this.color_gradient != null) {
         rec.color_gradient = (ColorGradientFormatting)this.color_gradient.clone();
      }

      if(this.multistate != null) {
         rec.multistate = (org.apache.poi.hssf.record.cf.IconMultiStateFormatting)this.multistate.clone();
      }

      if(this.data_bar != null) {
         rec.data_bar = (DataBarFormatting)this.data_bar.clone();
      }

      if(this.filter_data != null) {
         rec.filter_data = new byte[this.filter_data.length];
         System.arraycopy(this.filter_data, 0, rec.filter_data, 0, this.filter_data.length);
      }

      return rec;
   }

   public short getFutureRecordType() {
      return this.futureHeader.getRecordType();
   }

   public FtrHeader getFutureHeader() {
      return this.futureHeader;
   }

   public CellRangeAddress getAssociatedRange() {
      return this.futureHeader.getAssociatedRange();
   }
}
