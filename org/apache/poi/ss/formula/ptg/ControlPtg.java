package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.Ptg;

public abstract class ControlPtg extends Ptg {

   public boolean isBaseToken() {
      return true;
   }

   public final byte getDefaultOperandClass() {
      throw new IllegalStateException("Control tokens are not classified");
   }
}
