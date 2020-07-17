package org.apache.poi.ss.formula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.formula.CellCacheEntry;
import org.apache.poi.ss.formula.CellEvaluationFrame;
import org.apache.poi.ss.formula.EvaluationCache;
import org.apache.poi.ss.formula.FormulaCellCacheEntry;
import org.apache.poi.ss.formula.PlainValueCellCacheEntry;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.ValueEval;

final class EvaluationTracker {

   private final List _evaluationFrames;
   private final Set _currentlyEvaluatingCells;
   private final EvaluationCache _cache;


   public EvaluationTracker(EvaluationCache cache) {
      this._cache = cache;
      this._evaluationFrames = new ArrayList();
      this._currentlyEvaluatingCells = new HashSet();
   }

   public boolean startEvaluate(FormulaCellCacheEntry cce) {
      if(cce == null) {
         throw new IllegalArgumentException("cellLoc must not be null");
      } else if(this._currentlyEvaluatingCells.contains(cce)) {
         return false;
      } else {
         this._currentlyEvaluatingCells.add(cce);
         this._evaluationFrames.add(new CellEvaluationFrame(cce));
         return true;
      }
   }

   public void updateCacheResult(ValueEval result) {
      int nFrames = this._evaluationFrames.size();
      if(nFrames < 1) {
         throw new IllegalStateException("Call to endEvaluate without matching call to startEvaluate");
      } else {
         CellEvaluationFrame frame = (CellEvaluationFrame)this._evaluationFrames.get(nFrames - 1);
         if(result != ErrorEval.CIRCULAR_REF_ERROR || nFrames <= 1) {
            frame.updateFormulaResult(result);
         }
      }
   }

   public void endEvaluate(CellCacheEntry cce) {
      int nFrames = this._evaluationFrames.size();
      if(nFrames < 1) {
         throw new IllegalStateException("Call to endEvaluate without matching call to startEvaluate");
      } else {
         --nFrames;
         CellEvaluationFrame frame = (CellEvaluationFrame)this._evaluationFrames.get(nFrames);
         if(cce != frame.getCCE()) {
            throw new IllegalStateException("Wrong cell specified. ");
         } else {
            this._evaluationFrames.remove(nFrames);
            this._currentlyEvaluatingCells.remove(cce);
         }
      }
   }

   public void acceptFormulaDependency(CellCacheEntry cce) {
      int prevFrameIndex = this._evaluationFrames.size() - 1;
      if(prevFrameIndex >= 0) {
         CellEvaluationFrame consumingFrame = (CellEvaluationFrame)this._evaluationFrames.get(prevFrameIndex);
         consumingFrame.addSensitiveInputCell(cce);
      }

   }

   public void acceptPlainValueDependency(int bookIndex, int sheetIndex, int rowIndex, int columnIndex, ValueEval value) {
      int prevFrameIndex = this._evaluationFrames.size() - 1;
      if(prevFrameIndex >= 0) {
         CellEvaluationFrame consumingFrame = (CellEvaluationFrame)this._evaluationFrames.get(prevFrameIndex);
         if(value == BlankEval.instance) {
            consumingFrame.addUsedBlankCell(bookIndex, sheetIndex, rowIndex, columnIndex);
         } else {
            PlainValueCellCacheEntry cce = this._cache.getPlainValueEntry(bookIndex, sheetIndex, rowIndex, columnIndex, value);
            consumingFrame.addSensitiveInputCell(cce);
         }
      }

   }
}
