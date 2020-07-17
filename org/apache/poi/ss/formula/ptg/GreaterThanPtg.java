package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;

public final class GreaterThanPtg extends ValueOperatorPtg {

   public static final byte sid = 13;
   private static final String GREATERTHAN = ">";
   public static final ValueOperatorPtg instance = new GreaterThanPtg();


   protected byte getSid() {
      return (byte)13;
   }

   public int getNumberOfOperands() {
      return 2;
   }

   public String toFormulaString(String[] operands) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(operands[0]);
      buffer.append(">");
      buffer.append(operands[1]);
      return buffer.toString();
   }

}
