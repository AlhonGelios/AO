package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.FormulaCellCacheEntry;
import org.apache.poi.ss.formula.FormulaCellCacheEntrySet;
import org.apache.poi.ss.formula.IEvaluationListener;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;

abstract class CellCacheEntry implements IEvaluationListener.ICacheEntry {

   public static final CellCacheEntry[] EMPTY_ARRAY = new CellCacheEntry[0];
   private final FormulaCellCacheEntrySet _consumingCells = new FormulaCellCacheEntrySet();
   private ValueEval _value;


   protected final void clearValue() {
      this._value = null;
   }

   public final boolean updateValue(ValueEval value) {
      if(value == null) {
         throw new IllegalArgumentException("Did not expect to update to null");
      } else {
         boolean result = !areValuesEqual(this._value, value);
         this._value = value;
         return result;
      }
   }

   public final ValueEval getValue() {
      return this._value;
   }

   private static boolean areValuesEqual(ValueEval a, ValueEval b) {
      if(a == null) {
         return false;
      } else {
         Class cls = a.getClass();
         if(cls != b.getClass()) {
            return false;
         } else if(a == BlankEval.instance) {
            return b == a;
         } else if(cls == NumberEval.class) {
            return ((NumberEval)a).getNumberValue() == ((NumberEval)b).getNumberValue();
         } else if(cls == StringEval.class) {
            return ((StringEval)a).getStringValue().equals(((StringEval)b).getStringValue());
         } else if(cls == BoolEval.class) {
            return ((BoolEval)a).getBooleanValue() == ((BoolEval)b).getBooleanValue();
         } else if(cls == ErrorEval.class) {
            return ((ErrorEval)a).getErrorCode() == ((ErrorEval)b).getErrorCode();
         } else {
            throw new IllegalStateException("Unexpected value class (" + cls.getName() + ")");
         }
      }
   }

   public final void addConsumingCell(FormulaCellCacheEntry cellLoc) {
      this._consumingCells.add(cellLoc);
   }

   public final FormulaCellCacheEntry[] getConsumingCells() {
      return this._consumingCells.toArray();
   }

   public final void clearConsumingCell(FormulaCellCacheEntry cce) {
      if(!this._consumingCells.remove(cce)) {
         throw new IllegalStateException("Specified formula cell is not consumed by this cell");
      }
   }

   public final void recurseClearCachedFormulaResults(IEvaluationListener listener) {
      if(listener == null) {
         this.recurseClearCachedFormulaResults();
      } else {
         listener.onClearCachedValue(this);
         this.recurseClearCachedFormulaResults(listener, 1);
      }

   }

   protected final void recurseClearCachedFormulaResults() {
      FormulaCellCacheEntry[] formulaCells = this.getConsumingCells();

      for(int i = 0; i < formulaCells.length; ++i) {
         FormulaCellCacheEntry fc = formulaCells[i];
         fc.clearFormulaEntry();
         fc.recurseClearCachedFormulaResults();
      }

   }

   protected final void recurseClearCachedFormulaResults(IEvaluationListener listener, int depth) {
      FormulaCellCacheEntry[] formulaCells = this.getConsumingCells();
      listener.sortDependentCachedValues(formulaCells);

      for(int i = 0; i < formulaCells.length; ++i) {
         FormulaCellCacheEntry fc = formulaCells[i];
         listener.onClearDependentCachedValue(fc, depth);
         fc.clearFormulaEntry();
         fc.recurseClearCachedFormulaResults(listener, depth + 1);
      }

   }

}
