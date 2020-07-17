package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;

public final class ConcatPtg extends ValueOperatorPtg {

   public static final byte sid = 8;
   private static final String CONCAT = "&";
   public static final ValueOperatorPtg instance = new ConcatPtg();


   protected byte getSid() {
      return (byte)8;
   }

   public int getNumberOfOperands() {
      return 2;
   }

   public String toFormulaString(String[] operands) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(operands[0]);
      buffer.append("&");
      buffer.append(operands[1]);
      return buffer.toString();
   }

}
