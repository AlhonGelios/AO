package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;

public final class EqualPtg extends ValueOperatorPtg {

   public static final byte sid = 11;
   public static final ValueOperatorPtg instance = new EqualPtg();


   protected byte getSid() {
      return (byte)11;
   }

   public int getNumberOfOperands() {
      return 2;
   }

   public String toFormulaString(String[] operands) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(operands[0]);
      buffer.append("=");
      buffer.append(operands[1]);
      return buffer.toString();
   }

}
