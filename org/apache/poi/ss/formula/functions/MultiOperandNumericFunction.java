package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.ThreeDEval;
import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;

public abstract class MultiOperandNumericFunction implements Function {

   private final boolean _isReferenceBoolCounted;
   private final boolean _isBlankCounted;
   static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
   private static final int DEFAULT_MAX_NUM_OPERANDS = 30;


   protected MultiOperandNumericFunction(boolean isReferenceBoolCounted, boolean isBlankCounted) {
      this._isReferenceBoolCounted = isReferenceBoolCounted;
      this._isBlankCounted = isBlankCounted;
   }

   public final ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {
      double d;
      try {
         double[] e = this.getNumberArray(args);
         d = this.evaluate(e);
      } catch (EvaluationException var7) {
         return var7.getErrorEval();
      }

      return (ValueEval)(!Double.isNaN(d) && !Double.isInfinite(d)?new NumberEval(d):ErrorEval.NUM_ERROR);
   }

   protected abstract double evaluate(double[] var1) throws EvaluationException;

   protected int getMaxNumOperands() {
      return 30;
   }

   protected final double[] getNumberArray(ValueEval[] operands) throws EvaluationException {
      if(operands.length > this.getMaxNumOperands()) {
         throw EvaluationException.invalidValue();
      } else {
         MultiOperandNumericFunction.DoubleList retval = new MultiOperandNumericFunction.DoubleList();
         int i = 0;

         for(int iSize = operands.length; i < iSize; ++i) {
            this.collectValues(operands[i], retval);
         }

         return retval.toArray();
      }
   }

   public boolean isSubtotalCounted() {
      return true;
   }

   private void collectValues(ValueEval operand, MultiOperandNumericFunction.DoubleList temp) throws EvaluationException {
      int sIx;
      int height;
      int rrIx;
      int rcIx;
      if(operand instanceof ThreeDEval) {
         ThreeDEval var11 = (ThreeDEval)operand;

         for(sIx = var11.getFirstSheetIndex(); sIx <= var11.getLastSheetIndex(); ++sIx) {
            height = var11.getWidth();
            rrIx = var11.getHeight();

            for(rcIx = 0; rcIx < rrIx; ++rcIx) {
               for(int var12 = 0; var12 < height; ++var12) {
                  ValueEval ve1 = var11.getValue(sIx, rcIx, var12);
                  if(this.isSubtotalCounted() || !var11.isSubTotal(rcIx, var12)) {
                     this.collectValue(ve1, true, temp);
                  }
               }
            }
         }

      } else if(operand instanceof TwoDEval) {
         TwoDEval var10 = (TwoDEval)operand;
         sIx = var10.getWidth();
         height = var10.getHeight();

         for(rrIx = 0; rrIx < height; ++rrIx) {
            for(rcIx = 0; rcIx < sIx; ++rcIx) {
               ValueEval ve = var10.getValue(rrIx, rcIx);
               if(this.isSubtotalCounted() || !var10.isSubTotal(rrIx, rcIx)) {
                  this.collectValue(ve, true, temp);
               }
            }
         }

      } else if(!(operand instanceof RefEval)) {
         this.collectValue(operand, false, temp);
      } else {
         RefEval re = (RefEval)operand;

         for(sIx = re.getFirstSheetIndex(); sIx <= re.getLastSheetIndex(); ++sIx) {
            this.collectValue(re.getInnerValueEval(sIx), true, temp);
         }

      }
   }

   private void collectValue(ValueEval ve, boolean isViaReference, MultiOperandNumericFunction.DoubleList temp) throws EvaluationException {
      if(ve == null) {
         throw new IllegalArgumentException("ve must not be null");
      } else if(!(ve instanceof BoolEval)) {
         if(ve instanceof NumericValueEval) {
            NumericValueEval s2 = (NumericValueEval)ve;
            temp.add(s2.getNumberValue());
         } else if(ve instanceof StringValueEval) {
            if(!isViaReference) {
               String s1 = ((StringValueEval)ve).getStringValue();
               Double d = OperandResolver.parseDouble(s1);
               if(d == null) {
                  throw new EvaluationException(ErrorEval.VALUE_INVALID);
               } else {
                  temp.add(d.doubleValue());
               }
            }
         } else if(ve instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval)ve);
         } else if(ve == BlankEval.instance) {
            if(this._isBlankCounted) {
               temp.add(0.0D);
            }

         } else {
            throw new RuntimeException("Invalid ValueEval type passed for conversion: (" + ve.getClass() + ")");
         }
      } else {
         if(!isViaReference || this._isReferenceBoolCounted) {
            BoolEval s = (BoolEval)ve;
            temp.add(s.getNumberValue());
         }

      }
   }


   private static class DoubleList {

      private double[] _array = new double[8];
      private int _count = 0;


      public double[] toArray() {
         if(this._count < 1) {
            return MultiOperandNumericFunction.EMPTY_DOUBLE_ARRAY;
         } else {
            double[] result = new double[this._count];
            System.arraycopy(this._array, 0, result, 0, this._count);
            return result;
         }
      }

      private void ensureCapacity(int reqSize) {
         if(reqSize > this._array.length) {
            int newSize = reqSize * 3 / 2;
            double[] newArr = new double[newSize];
            System.arraycopy(this._array, 0, newArr, 0, this._count);
            this._array = newArr;
         }

      }

      public void add(double value) {
         this.ensureCapacity(this._count + 1);
         this._array[this._count] = value;
         ++this._count;
      }
   }
}
