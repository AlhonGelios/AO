package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.OperandPtg;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;

public final class AreaErrPtg extends OperandPtg {

   public static final byte sid = 43;
   private final int unused1;
   private final int unused2;


   public AreaErrPtg() {
      this.unused1 = 0;
      this.unused2 = 0;
   }

   public AreaErrPtg(LittleEndianInput in) {
      this.unused1 = in.readInt();
      this.unused2 = in.readInt();
   }

   public void write(LittleEndianOutput out) {
      out.writeByte(43 + this.getPtgClass());
      out.writeInt(this.unused1);
      out.writeInt(this.unused2);
   }

   public String toFormulaString() {
      return FormulaError.REF.getString();
   }

   public byte getDefaultOperandClass() {
      return (byte)0;
   }

   public int getSize() {
      return 9;
   }
}
