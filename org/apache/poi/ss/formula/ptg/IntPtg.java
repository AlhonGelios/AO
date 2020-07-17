package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ScalarConstantPtg;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;

public final class IntPtg extends ScalarConstantPtg {

   private static final int MIN_VALUE = 0;
   private static final int MAX_VALUE = 65535;
   public static final int SIZE = 3;
   public static final byte sid = 30;
   private final int field_1_value;


   public static boolean isInRange(int i) {
      return i >= 0 && i <= '\uffff';
   }

   public IntPtg(LittleEndianInput in) {
      this(in.readUShort());
   }

   public IntPtg(int value) {
      if(!isInRange(value)) {
         throw new IllegalArgumentException("value is out of range: " + value);
      } else {
         this.field_1_value = value;
      }
   }

   public int getValue() {
      return this.field_1_value;
   }

   public void write(LittleEndianOutput out) {
      out.writeByte(30 + this.getPtgClass());
      out.writeShort(this.getValue());
   }

   public int getSize() {
      return 3;
   }

   public String toFormulaString() {
      return String.valueOf(this.getValue());
   }
}
