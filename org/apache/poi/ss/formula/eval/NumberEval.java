package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.formula.ptg.IntPtg;
import org.apache.poi.ss.formula.ptg.NumberPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.util.NumberToTextConverter;

public final class NumberEval implements NumericValueEval, StringValueEval {

   public static final NumberEval ZERO = new NumberEval(0.0D);
   private final double _value;
   private String _stringValue;


   public NumberEval(Ptg ptg) {
      if(ptg == null) {
         throw new IllegalArgumentException("ptg must not be null");
      } else {
         if(ptg instanceof IntPtg) {
            this._value = (double)((IntPtg)ptg).getValue();
         } else {
            if(!(ptg instanceof NumberPtg)) {
               throw new IllegalArgumentException("bad argument type (" + ptg.getClass().getName() + ")");
            }

            this._value = ((NumberPtg)ptg).getValue();
         }

      }
   }

   public NumberEval(double value) {
      this._value = value;
   }

   public double getNumberValue() {
      return this._value;
   }

   public String getStringValue() {
      if(this._stringValue == null) {
         this._stringValue = NumberToTextConverter.toText(this._value);
      }

      return this._stringValue;
   }

   public final String toString() {
      StringBuffer sb = new StringBuffer(64);
      sb.append(this.getClass().getName()).append(" [");
      sb.append(this.getStringValue());
      sb.append("]");
      return sb.toString();
   }

}
