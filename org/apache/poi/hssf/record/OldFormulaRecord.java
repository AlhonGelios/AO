package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.FormulaRecord;
import org.apache.poi.hssf.record.OldCellRecord;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.ss.formula.Formula;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.CellType;

public final class OldFormulaRecord extends OldCellRecord {

   public static final short biff2_sid = 6;
   public static final short biff3_sid = 518;
   public static final short biff4_sid = 1030;
   public static final short biff5_sid = 6;
   private FormulaRecord.SpecialCachedValue specialCachedValue;
   private double field_4_value;
   private short field_5_options;
   private Formula field_6_parsed_expr;


   public OldFormulaRecord(RecordInputStream ris) {
      super(ris, ris.getSid() == 6);
      if(this.isBiff2()) {
         this.field_4_value = ris.readDouble();
      } else {
         long expression_len = ris.readLong();
         this.specialCachedValue = FormulaRecord.SpecialCachedValue.create(expression_len);
         if(this.specialCachedValue == null) {
            this.field_4_value = Double.longBitsToDouble(expression_len);
         }
      }

      if(this.isBiff2()) {
         this.field_5_options = (short)ris.readUByte();
      } else {
         this.field_5_options = ris.readShort();
      }

      short expression_len1 = ris.readShort();
      int nBytesAvailable = ris.available();
      this.field_6_parsed_expr = Formula.read(expression_len1, ris, nBytesAvailable);
   }

   public int getCachedResultType() {
      return this.specialCachedValue == null?CellType.NUMERIC.getCode():this.specialCachedValue.getValueType();
   }

   public boolean getCachedBooleanValue() {
      return this.specialCachedValue.getBooleanValue();
   }

   public int getCachedErrorValue() {
      return this.specialCachedValue.getErrorValue();
   }

   public double getValue() {
      return this.field_4_value;
   }

   public short getOptions() {
      return this.field_5_options;
   }

   public Ptg[] getParsedExpression() {
      return this.field_6_parsed_expr.getTokens();
   }

   public Formula getFormula() {
      return this.field_6_parsed_expr;
   }

   protected void appendValueText(StringBuilder sb) {
      sb.append("    .value       = ").append(this.getValue()).append("\n");
   }

   protected String getRecordName() {
      return "Old Formula";
   }
}
