package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.StringValueEval;

public final class BoolEval implements NumericValueEval, StringValueEval {

   private boolean _value;
   public static final BoolEval FALSE = new BoolEval(false);
   public static final BoolEval TRUE = new BoolEval(true);


   public static final BoolEval valueOf(boolean b) {
      return b?TRUE:FALSE;
   }

   private BoolEval(boolean value) {
      this._value = value;
   }

   public boolean getBooleanValue() {
      return this._value;
   }

   public double getNumberValue() {
      return this._value?1.0D:0.0D;
   }

   public String getStringValue() {
      return this._value?"TRUE":"FALSE";
   }

   public String toString() {
      StringBuilder sb = new StringBuilder(64);
      sb.append(this.getClass().getName()).append(" [");
      sb.append(this.getStringValue());
      sb.append("]");
      return sb.toString();
   }

}
