package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.Ptg;

public abstract class OperandPtg extends Ptg implements Cloneable {

   public final boolean isBaseToken() {
      return false;
   }

   public final OperandPtg copy() {
      try {
         return (OperandPtg)this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2);
      }
   }
}
