package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;

public final class UnaryMinusPtg extends ValueOperatorPtg {

   public static final byte sid = 19;
   private static final String MINUS = "-";
   public static final ValueOperatorPtg instance = new UnaryMinusPtg();


   protected byte getSid() {
      return (byte)19;
   }

   public int getNumberOfOperands() {
      return 1;
   }

   public String toFormulaString(String[] operands) {
      StringBuffer buffer = new StringBuffer();
      buffer.append("-");
      buffer.append(operands[0]);
      return buffer.toString();
   }

}
