package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;

public final class PercentPtg extends ValueOperatorPtg {

   public static final int SIZE = 1;
   public static final byte sid = 20;
   private static final String PERCENT = "%";
   public static final ValueOperatorPtg instance = new PercentPtg();


   protected byte getSid() {
      return (byte)20;
   }

   public int getNumberOfOperands() {
      return 1;
   }

   public String toFormulaString(String[] operands) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(operands[0]);
      buffer.append("%");
      return buffer.toString();
   }

}
