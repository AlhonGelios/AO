package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.Ref2DPtgBase;
import org.apache.poi.util.LittleEndianInput;

public final class RefNPtg extends Ref2DPtgBase {

   public static final byte sid = 44;


   public RefNPtg(LittleEndianInput in) {
      super(in);
   }

   protected byte getSid() {
      return (byte)44;
   }
}
