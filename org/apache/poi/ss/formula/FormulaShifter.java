package org.apache.poi.ss.formula;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.ptg.Area2DPtgBase;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.Area3DPxg;
import org.apache.poi.ss.formula.ptg.AreaErrPtg;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.AreaPtgBase;
import org.apache.poi.ss.formula.ptg.Deleted3DPxg;
import org.apache.poi.ss.formula.ptg.DeletedArea3DPtg;
import org.apache.poi.ss.formula.ptg.DeletedRef3DPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.formula.ptg.RefErrorPtg;
import org.apache.poi.ss.formula.ptg.RefPtg;
import org.apache.poi.ss.formula.ptg.RefPtgBase;

public final class FormulaShifter {

   private final int _externSheetIndex;
   private final String _sheetName;
   private final int _firstMovedIndex;
   private final int _lastMovedIndex;
   private final int _amountToMove;
   private final int _srcSheetIndex;
   private final int _dstSheetIndex;
   private final SpreadsheetVersion _version;
   private final FormulaShifter.ShiftMode _mode;


   private FormulaShifter(int externSheetIndex, String sheetName, int firstMovedIndex, int lastMovedIndex, int amountToMove, FormulaShifter.ShiftMode mode, SpreadsheetVersion version) {
      if(amountToMove == 0) {
         throw new IllegalArgumentException("amountToMove must not be zero");
      } else if(firstMovedIndex > lastMovedIndex) {
         throw new IllegalArgumentException("firstMovedIndex, lastMovedIndex out of order");
      } else {
         this._externSheetIndex = externSheetIndex;
         this._sheetName = sheetName;
         this._firstMovedIndex = firstMovedIndex;
         this._lastMovedIndex = lastMovedIndex;
         this._amountToMove = amountToMove;
         this._mode = mode;
         this._version = version;
         this._srcSheetIndex = this._dstSheetIndex = -1;
      }
   }

   private FormulaShifter(int srcSheetIndex, int dstSheetIndex) {
      this._externSheetIndex = this._firstMovedIndex = this._lastMovedIndex = this._amountToMove = -1;
      this._sheetName = null;
      this._version = null;
      this._srcSheetIndex = srcSheetIndex;
      this._dstSheetIndex = dstSheetIndex;
      this._mode = FormulaShifter.ShiftMode.SheetMove;
   }

   @Deprecated
   public static FormulaShifter createForRowShift(int externSheetIndex, String sheetName, int firstMovedRowIndex, int lastMovedRowIndex, int numberOfRowsToMove) {
      return createForRowShift(externSheetIndex, sheetName, firstMovedRowIndex, lastMovedRowIndex, numberOfRowsToMove, SpreadsheetVersion.EXCEL97);
   }

   public static FormulaShifter createForRowShift(int externSheetIndex, String sheetName, int firstMovedRowIndex, int lastMovedRowIndex, int numberOfRowsToMove, SpreadsheetVersion version) {
      return new FormulaShifter(externSheetIndex, sheetName, firstMovedRowIndex, lastMovedRowIndex, numberOfRowsToMove, FormulaShifter.ShiftMode.RowMove, version);
   }

   public static FormulaShifter createForRowCopy(int externSheetIndex, String sheetName, int firstMovedRowIndex, int lastMovedRowIndex, int numberOfRowsToMove, SpreadsheetVersion version) {
      return new FormulaShifter(externSheetIndex, sheetName, firstMovedRowIndex, lastMovedRowIndex, numberOfRowsToMove, FormulaShifter.ShiftMode.RowCopy, version);
   }

   public static FormulaShifter createForSheetShift(int srcSheetIndex, int dstSheetIndex) {
      return new FormulaShifter(srcSheetIndex, dstSheetIndex);
   }

   public String toString() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.getClass().getName());
      sb.append(" [");
      sb.append(this._firstMovedIndex);
      sb.append(this._lastMovedIndex);
      sb.append(this._amountToMove);
      return sb.toString();
   }

   public boolean adjustFormula(Ptg[] ptgs, int currentExternSheetIx) {
      boolean refsWereChanged = false;

      for(int i = 0; i < ptgs.length; ++i) {
         Ptg newPtg = this.adjustPtg(ptgs[i], currentExternSheetIx);
         if(newPtg != null) {
            refsWereChanged = true;
            ptgs[i] = newPtg;
         }
      }

      return refsWereChanged;
   }

   private Ptg adjustPtg(Ptg ptg, int currentExternSheetIx) {
      switch(FormulaShifter.NamelessClass1743971871.$SwitchMap$org$apache$poi$ss$formula$FormulaShifter$ShiftMode[this._mode.ordinal()]) {
      case 1:
         return this.adjustPtgDueToRowMove(ptg, currentExternSheetIx);
      case 2:
         return this.adjustPtgDueToRowCopy(ptg);
      case 3:
         return this.adjustPtgDueToSheetMove(ptg);
      default:
         throw new IllegalStateException("Unsupported shift mode: " + this._mode);
      }
   }

   private Ptg adjustPtgDueToRowMove(Ptg ptg, int currentExternSheetIx) {
      if(ptg instanceof RefPtg) {
         if(currentExternSheetIx != this._externSheetIndex) {
            return null;
         } else {
            RefPtg apxg4 = (RefPtg)ptg;
            return this.rowMoveRefPtg(apxg4);
         }
      } else if(ptg instanceof Ref3DPtg) {
         Ref3DPtg apxg3 = (Ref3DPtg)ptg;
         return this._externSheetIndex != apxg3.getExternSheetIndex()?null:this.rowMoveRefPtg(apxg3);
      } else if(ptg instanceof Ref3DPxg) {
         Ref3DPxg apxg2 = (Ref3DPxg)ptg;
         return apxg2.getExternalWorkbookNumber() <= 0 && this._sheetName.equals(apxg2.getSheetName())?this.rowMoveRefPtg(apxg2):null;
      } else if(ptg instanceof Area2DPtgBase) {
         return currentExternSheetIx != this._externSheetIndex?ptg:this.rowMoveAreaPtg((Area2DPtgBase)ptg);
      } else if(ptg instanceof Area3DPtg) {
         Area3DPtg apxg1 = (Area3DPtg)ptg;
         return this._externSheetIndex != apxg1.getExternSheetIndex()?null:this.rowMoveAreaPtg(apxg1);
      } else if(ptg instanceof Area3DPxg) {
         Area3DPxg apxg = (Area3DPxg)ptg;
         return apxg.getExternalWorkbookNumber() <= 0 && this._sheetName.equals(apxg.getSheetName())?this.rowMoveAreaPtg(apxg):null;
      } else {
         return null;
      }
   }

   private Ptg adjustPtgDueToRowCopy(Ptg ptg) {
      if(ptg instanceof RefPtg) {
         RefPtg apxg4 = (RefPtg)ptg;
         return this.rowCopyRefPtg(apxg4);
      } else if(ptg instanceof Ref3DPtg) {
         Ref3DPtg apxg3 = (Ref3DPtg)ptg;
         return this.rowCopyRefPtg(apxg3);
      } else if(ptg instanceof Ref3DPxg) {
         Ref3DPxg apxg2 = (Ref3DPxg)ptg;
         return this.rowCopyRefPtg(apxg2);
      } else if(ptg instanceof Area2DPtgBase) {
         return this.rowCopyAreaPtg((Area2DPtgBase)ptg);
      } else if(ptg instanceof Area3DPtg) {
         Area3DPtg apxg1 = (Area3DPtg)ptg;
         return this.rowCopyAreaPtg(apxg1);
      } else if(ptg instanceof Area3DPxg) {
         Area3DPxg apxg = (Area3DPxg)ptg;
         return this.rowCopyAreaPtg(apxg);
      } else {
         return null;
      }
   }

   private Ptg adjustPtgDueToSheetMove(Ptg ptg) {
      if(ptg instanceof Ref3DPtg) {
         Ref3DPtg ref = (Ref3DPtg)ptg;
         int oldSheetIndex = ref.getExternSheetIndex();
         if(oldSheetIndex < this._srcSheetIndex && oldSheetIndex < this._dstSheetIndex) {
            return null;
         }

         if(oldSheetIndex > this._srcSheetIndex && oldSheetIndex > this._dstSheetIndex) {
            return null;
         }

         if(oldSheetIndex == this._srcSheetIndex) {
            ref.setExternSheetIndex(this._dstSheetIndex);
            return ref;
         }

         if(this._dstSheetIndex < this._srcSheetIndex) {
            ref.setExternSheetIndex(oldSheetIndex + 1);
            return ref;
         }

         if(this._dstSheetIndex > this._srcSheetIndex) {
            ref.setExternSheetIndex(oldSheetIndex - 1);
            return ref;
         }
      }

      return null;
   }

   private Ptg rowMoveRefPtg(RefPtgBase rptg) {
      int refRow = rptg.getRow();
      if(this._firstMovedIndex <= refRow && refRow <= this._lastMovedIndex) {
         rptg.setRow(refRow + this._amountToMove);
         return rptg;
      } else {
         int destFirstRowIndex = this._firstMovedIndex + this._amountToMove;
         int destLastRowIndex = this._lastMovedIndex + this._amountToMove;
         if(destLastRowIndex >= refRow && refRow >= destFirstRowIndex) {
            if(destFirstRowIndex <= refRow && refRow <= destLastRowIndex) {
               return createDeletedRef(rptg);
            } else {
               throw new IllegalStateException("Situation not covered: (" + this._firstMovedIndex + ", " + this._lastMovedIndex + ", " + this._amountToMove + ", " + refRow + ", " + refRow + ")");
            }
         } else {
            return null;
         }
      }
   }

   private Ptg rowMoveAreaPtg(AreaPtgBase aptg) {
      int aFirstRow = aptg.getFirstRow();
      int aLastRow = aptg.getLastRow();
      if(this._firstMovedIndex <= aFirstRow && aLastRow <= this._lastMovedIndex) {
         aptg.setFirstRow(aFirstRow + this._amountToMove);
         aptg.setLastRow(aLastRow + this._amountToMove);
         return aptg;
      } else {
         int destFirstRowIndex = this._firstMovedIndex + this._amountToMove;
         int destLastRowIndex = this._lastMovedIndex + this._amountToMove;
         if(aFirstRow < this._firstMovedIndex && this._lastMovedIndex < aLastRow) {
            if(destFirstRowIndex < aFirstRow && aFirstRow <= destLastRowIndex) {
               aptg.setFirstRow(destLastRowIndex + 1);
               return aptg;
            } else if(destFirstRowIndex <= aLastRow && aLastRow < destLastRowIndex) {
               aptg.setLastRow(destFirstRowIndex - 1);
               return aptg;
            } else {
               return null;
            }
         } else {
            int newLastRowIx;
            int areaRemainingBottomRowIx;
            if(this._firstMovedIndex <= aFirstRow && aFirstRow <= this._lastMovedIndex) {
               if(this._amountToMove < 0) {
                  aptg.setFirstRow(aFirstRow + this._amountToMove);
                  return aptg;
               } else if(destFirstRowIndex > aLastRow) {
                  return null;
               } else {
                  newLastRowIx = aFirstRow + this._amountToMove;
                  if(destLastRowIndex < aLastRow) {
                     aptg.setFirstRow(newLastRowIx);
                     return aptg;
                  } else {
                     areaRemainingBottomRowIx = this._lastMovedIndex + 1;
                     if(destFirstRowIndex > areaRemainingBottomRowIx) {
                        newLastRowIx = areaRemainingBottomRowIx;
                     }

                     aptg.setFirstRow(newLastRowIx);
                     aptg.setLastRow(Math.max(aLastRow, destLastRowIndex));
                     return aptg;
                  }
               }
            } else if(this._firstMovedIndex <= aLastRow && aLastRow <= this._lastMovedIndex) {
               if(this._amountToMove > 0) {
                  aptg.setLastRow(aLastRow + this._amountToMove);
                  return aptg;
               } else if(destLastRowIndex < aFirstRow) {
                  return null;
               } else {
                  newLastRowIx = aLastRow + this._amountToMove;
                  if(destFirstRowIndex > aFirstRow) {
                     aptg.setLastRow(newLastRowIx);
                     return aptg;
                  } else {
                     areaRemainingBottomRowIx = this._firstMovedIndex - 1;
                     if(destLastRowIndex < areaRemainingBottomRowIx) {
                        newLastRowIx = areaRemainingBottomRowIx;
                     }

                     aptg.setFirstRow(Math.min(aFirstRow, destFirstRowIndex));
                     aptg.setLastRow(newLastRowIx);
                     return aptg;
                  }
               }
            } else if(destLastRowIndex >= aFirstRow && aLastRow >= destFirstRowIndex) {
               if(destFirstRowIndex <= aFirstRow && aLastRow <= destLastRowIndex) {
                  return createDeletedRef(aptg);
               } else if(aFirstRow <= destFirstRowIndex && destLastRowIndex <= aLastRow) {
                  return null;
               } else if(destFirstRowIndex < aFirstRow && aFirstRow <= destLastRowIndex) {
                  aptg.setFirstRow(destLastRowIndex + 1);
                  return aptg;
               } else if(destFirstRowIndex <= aLastRow && aLastRow < destLastRowIndex) {
                  aptg.setLastRow(destFirstRowIndex - 1);
                  return aptg;
               } else {
                  throw new IllegalStateException("Situation not covered: (" + this._firstMovedIndex + ", " + this._lastMovedIndex + ", " + this._amountToMove + ", " + aFirstRow + ", " + aLastRow + ")");
               }
            } else {
               return null;
            }
         }
      }
   }

   private Ptg rowCopyRefPtg(RefPtgBase rptg) {
      int refRow = rptg.getRow();
      if(rptg.isRowRelative()) {
         int destRowIndex = this._firstMovedIndex + this._amountToMove;
         if(destRowIndex >= 0 && this._version.getLastRowIndex() >= destRowIndex) {
            rptg.setRow(refRow + this._amountToMove);
            return rptg;
         } else {
            return createDeletedRef(rptg);
         }
      } else {
         return null;
      }
   }

   private Ptg rowCopyAreaPtg(AreaPtgBase aptg) {
      boolean changed = false;
      int aFirstRow = aptg.getFirstRow();
      int aLastRow = aptg.getLastRow();
      int destLastRowIndex;
      if(aptg.isFirstRowRelative()) {
         destLastRowIndex = aFirstRow + this._amountToMove;
         if(destLastRowIndex < 0 || this._version.getLastRowIndex() < destLastRowIndex) {
            return createDeletedRef(aptg);
         }

         aptg.setFirstRow(destLastRowIndex);
         changed = true;
      }

      if(aptg.isLastRowRelative()) {
         destLastRowIndex = aLastRow + this._amountToMove;
         if(destLastRowIndex < 0 || this._version.getLastRowIndex() < destLastRowIndex) {
            return createDeletedRef(aptg);
         }

         aptg.setLastRow(destLastRowIndex);
         changed = true;
      }

      if(changed) {
         aptg.sortTopLeftToBottomRight();
      }

      return changed?aptg:null;
   }

   private static Ptg createDeletedRef(Ptg ptg) {
      if(ptg instanceof RefPtg) {
         return new RefErrorPtg();
      } else if(ptg instanceof Ref3DPtg) {
         Ref3DPtg pxg3 = (Ref3DPtg)ptg;
         return new DeletedRef3DPtg(pxg3.getExternSheetIndex());
      } else if(ptg instanceof AreaPtg) {
         return new AreaErrPtg();
      } else if(ptg instanceof Area3DPtg) {
         Area3DPtg pxg2 = (Area3DPtg)ptg;
         return new DeletedArea3DPtg(pxg2.getExternSheetIndex());
      } else if(ptg instanceof Ref3DPxg) {
         Ref3DPxg pxg1 = (Ref3DPxg)ptg;
         return new Deleted3DPxg(pxg1.getExternalWorkbookNumber(), pxg1.getSheetName());
      } else if(ptg instanceof Area3DPxg) {
         Area3DPxg pxg = (Area3DPxg)ptg;
         return new Deleted3DPxg(pxg.getExternalWorkbookNumber(), pxg.getSheetName());
      } else {
         throw new IllegalArgumentException("Unexpected ref ptg class (" + ptg.getClass().getName() + ")");
      }
   }

   private static enum ShiftMode {

      RowMove("RowMove", 0),
      RowCopy("RowCopy", 1),
      SheetMove("SheetMove", 2);
      // $FF: synthetic field
      private static final FormulaShifter.ShiftMode[] $VALUES = new FormulaShifter.ShiftMode[]{RowMove, RowCopy, SheetMove};


      private ShiftMode(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass1743971871 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$formula$FormulaShifter$ShiftMode = new int[FormulaShifter.ShiftMode.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaShifter$ShiftMode[FormulaShifter.ShiftMode.RowMove.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaShifter$ShiftMode[FormulaShifter.ShiftMode.RowCopy.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaShifter$ShiftMode[FormulaShifter.ShiftMode.SheetMove.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
