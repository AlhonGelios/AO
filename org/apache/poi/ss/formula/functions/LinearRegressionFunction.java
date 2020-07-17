package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed2ArgFunction;
import org.apache.poi.ss.formula.functions.LookupUtils;

public final class LinearRegressionFunction extends Fixed2ArgFunction {

   public LinearRegressionFunction.FUNCTION function;


   public LinearRegressionFunction(LinearRegressionFunction.FUNCTION function) {
      this.function = function;
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      double result;
      try {
         LookupUtils.ValueVector e = createValueVector(arg0);
         LookupUtils.ValueVector vvX = createValueVector(arg1);
         int size = vvX.getSize();
         if(size == 0 || e.getSize() != size) {
            return ErrorEval.NA;
         }

         result = this.evaluateInternal(vvX, e, size);
      } catch (EvaluationException var10) {
         return var10.getErrorEval();
      }

      return (ValueEval)(!Double.isNaN(result) && !Double.isInfinite(result)?new NumberEval(result):ErrorEval.NUM_ERROR);
   }

   private double evaluateInternal(LookupUtils.ValueVector x, LookupUtils.ValueVector y, int size) throws EvaluationException {
      ErrorEval firstXerr = null;
      ErrorEval firstYerr = null;
      boolean accumlatedSome = false;
      double sumx = 0.0D;
      double sumy = 0.0D;

      for(int xbar = 0; xbar < size; ++xbar) {
         ValueEval vx = x.getItem(xbar);
         ValueEval ybar = y.getItem(xbar);
         if(vx instanceof ErrorEval && firstXerr == null) {
            firstXerr = (ErrorEval)vx;
         } else if(ybar instanceof ErrorEval && firstYerr == null) {
            firstYerr = (ErrorEval)ybar;
         } else if(vx instanceof NumberEval && ybar instanceof NumberEval) {
            accumlatedSome = true;
            NumberEval nx = (NumberEval)vx;
            NumberEval xxbar = (NumberEval)ybar;
            sumx += nx.getNumberValue();
            sumy += xxbar.getNumberValue();
         }
      }

      double var25 = sumx / (double)size;
      double var26 = sumy / (double)size;
      double var27 = 0.0D;
      double xybar = 0.0D;

      for(int beta1 = 0; beta1 < size; ++beta1) {
         ValueEval vx1 = x.getItem(beta1);
         ValueEval beta0 = y.getItem(beta1);
         if(vx1 instanceof ErrorEval && firstXerr == null) {
            firstXerr = (ErrorEval)vx1;
         } else if(beta0 instanceof ErrorEval && firstYerr == null) {
            firstYerr = (ErrorEval)beta0;
         } else if(vx1 instanceof NumberEval && beta0 instanceof NumberEval) {
            NumberEval nx1 = (NumberEval)vx1;
            NumberEval ny = (NumberEval)beta0;
            var27 += (nx1.getNumberValue() - var25) * (nx1.getNumberValue() - var25);
            xybar += (nx1.getNumberValue() - var25) * (ny.getNumberValue() - var26);
         }
      }

      double var28 = xybar / var27;
      double var24 = var26 - var28 * var25;
      if(firstXerr != null) {
         throw new EvaluationException(firstXerr);
      } else if(firstYerr != null) {
         throw new EvaluationException(firstYerr);
      } else if(!accumlatedSome) {
         throw new EvaluationException(ErrorEval.DIV_ZERO);
      } else if(this.function == LinearRegressionFunction.FUNCTION.INTERCEPT) {
         return var24;
      } else {
         return var28;
      }
   }

   private static LookupUtils.ValueVector createValueVector(ValueEval arg) throws EvaluationException {
      if(arg instanceof ErrorEval) {
         throw new EvaluationException((ErrorEval)arg);
      } else {
         return (LookupUtils.ValueVector)(arg instanceof TwoDEval?new LinearRegressionFunction.AreaValueArray((TwoDEval)arg):(arg instanceof RefEval?new LinearRegressionFunction.RefValueArray((RefEval)arg):new LinearRegressionFunction.SingleCellValueArray(arg)));
      }
   }

   private static final class RefValueArray extends LinearRegressionFunction.ValueArray {

      private final RefEval _ref;
      private final int _width;


      public RefValueArray(RefEval ref) {
         super(ref.getNumberOfSheets());
         this._ref = ref;
         this._width = ref.getNumberOfSheets();
      }

      protected ValueEval getItemInternal(int index) {
         int sIx = index % this._width + this._ref.getFirstSheetIndex();
         return this._ref.getInnerValueEval(sIx);
      }
   }

   public static enum FUNCTION {

      INTERCEPT("INTERCEPT", 0),
      SLOPE("SLOPE", 1);
      // $FF: synthetic field
      private static final LinearRegressionFunction.FUNCTION[] $VALUES = new LinearRegressionFunction.FUNCTION[]{INTERCEPT, SLOPE};


      private FUNCTION(String var1, int var2) {}

   }

   private static final class SingleCellValueArray extends LinearRegressionFunction.ValueArray {

      private final ValueEval _value;


      public SingleCellValueArray(ValueEval value) {
         super(1);
         this._value = value;
      }

      protected ValueEval getItemInternal(int index) {
         return this._value;
      }
   }

   private static final class AreaValueArray extends LinearRegressionFunction.ValueArray {

      private final TwoDEval _ae;
      private final int _width;


      public AreaValueArray(TwoDEval ae) {
         super(ae.getWidth() * ae.getHeight());
         this._ae = ae;
         this._width = ae.getWidth();
      }

      protected ValueEval getItemInternal(int index) {
         int rowIx = index / this._width;
         int colIx = index % this._width;
         return this._ae.getValue(rowIx, colIx);
      }
   }

   private abstract static class ValueArray implements LookupUtils.ValueVector {

      private final int _size;


      protected ValueArray(int size) {
         this._size = size;
      }

      public ValueEval getItem(int index) {
         if(index >= 0 && index <= this._size) {
            return this.getItemInternal(index);
         } else {
            throw new IllegalArgumentException("Specified index " + index + " is outside range (0.." + (this._size - 1) + ")");
         }
      }

      protected abstract ValueEval getItemInternal(int var1);

      public final int getSize() {
         return this._size;
      }
   }
}
