package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.OperationPtg;
import org.apache.poi.util.LittleEndianOutput;

public abstract class ValueOperatorPtg extends OperationPtg {

   public final boolean isBaseToken() {
      return true;
   }

   public final byte getDefaultOperandClass() {
      return (byte)32;
   }

   public void write(LittleEndianOutput out) {
      out.writeByte(this.getSid());
   }

   protected abstract byte getSid();

   public final int getSize() {
      return 1;
   }

   public final String toFormulaString() {
      throw new RuntimeException("toFormulaString(String[] operands) should be used for subclasses of OperationPtgs");
   }
}
