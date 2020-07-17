package org.apache.poi.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.record.ArrayRecord;
import org.apache.poi.hssf.record.SharedFormulaRecord;
import org.apache.poi.hssf.record.SharedValueRecordBase;
import org.apache.poi.hssf.record.TableRecord;
import org.apache.poi.hssf.record.aggregates.FormulaRecordAggregate;
import org.apache.poi.hssf.util.CellRangeAddress8Bit;
import org.apache.poi.ss.util.CellReference;

public final class SharedValueManager {

   private final List _arrayRecords;
   private final TableRecord[] _tableRecords;
   private final Map _groupsBySharedFormulaRecord;
   private Map _groupsCache;


   public static SharedValueManager createEmpty() {
      return new SharedValueManager(new SharedFormulaRecord[0], new CellReference[0], new ArrayRecord[0], new TableRecord[0]);
   }

   private SharedValueManager(SharedFormulaRecord[] sharedFormulaRecords, CellReference[] firstCells, ArrayRecord[] arrayRecords, TableRecord[] tableRecords) {
      int nShF = sharedFormulaRecords.length;
      if(nShF != firstCells.length) {
         throw new IllegalArgumentException("array sizes don\'t match: " + nShF + "!=" + firstCells.length + ".");
      } else {
         this._arrayRecords = toList(arrayRecords);
         this._tableRecords = tableRecords;
         HashMap m = new HashMap(nShF * 3 / 2);

         for(int i = 0; i < nShF; ++i) {
            SharedFormulaRecord sfr = sharedFormulaRecords[i];
            m.put(sfr, new SharedValueManager.SharedFormulaGroup(sfr, firstCells[i]));
         }

         this._groupsBySharedFormulaRecord = m;
      }
   }

   private static List toList(Object[] zz) {
      ArrayList result = new ArrayList(zz.length);

      for(int i = 0; i < zz.length; ++i) {
         result.add(zz[i]);
      }

      return result;
   }

   public static SharedValueManager create(SharedFormulaRecord[] sharedFormulaRecords, CellReference[] firstCells, ArrayRecord[] arrayRecords, TableRecord[] tableRecords) {
      return sharedFormulaRecords.length + firstCells.length + arrayRecords.length + tableRecords.length < 1?createEmpty():new SharedValueManager(sharedFormulaRecords, firstCells, arrayRecords, tableRecords);
   }

   public SharedFormulaRecord linkSharedFormulaRecord(CellReference firstCell, FormulaRecordAggregate agg) {
      SharedValueManager.SharedFormulaGroup result = this.findFormulaGroupForCell(firstCell);
      if(null == result) {
         throw new RuntimeException("Failed to find a matching shared formula record");
      } else {
         result.add(agg);
         return result.getSFR();
      }
   }

   private SharedValueManager.SharedFormulaGroup findFormulaGroupForCell(CellReference cellRef) {
      if(null == this._groupsCache) {
         this._groupsCache = new HashMap(this._groupsBySharedFormulaRecord.size());
         Iterator sfg = this._groupsBySharedFormulaRecord.values().iterator();

         while(sfg.hasNext()) {
            SharedValueManager.SharedFormulaGroup group = (SharedValueManager.SharedFormulaGroup)sfg.next();
            this._groupsCache.put(this.getKeyForCache(group._firstCell), group);
         }
      }

      SharedValueManager.SharedFormulaGroup sfg1 = (SharedValueManager.SharedFormulaGroup)this._groupsCache.get(this.getKeyForCache(cellRef));
      return sfg1;
   }

   private Integer getKeyForCache(CellReference cellRef) {
      return Integer.valueOf(cellRef.getCol() + 1 << 16 | cellRef.getRow());
   }

   public SharedValueRecordBase getRecordForFirstCell(FormulaRecordAggregate agg) {
      CellReference firstCell = agg.getFormulaRecord().getFormula().getExpReference();
      if(firstCell == null) {
         return null;
      } else {
         int row = firstCell.getRow();
         short column = firstCell.getCol();
         if(agg.getRow() == row && agg.getColumn() == column) {
            if(!this._groupsBySharedFormulaRecord.isEmpty()) {
               SharedValueManager.SharedFormulaGroup i$ = this.findFormulaGroupForCell(firstCell);
               if(null != i$) {
                  return i$.getSFR();
               }
            }

            TableRecord[] var9 = this._tableRecords;
            int ar = var9.length;

            for(int i$1 = 0; i$1 < ar; ++i$1) {
               TableRecord tr = var9[i$1];
               if(tr.isFirstCell(row, column)) {
                  return tr;
               }
            }

            Iterator var10 = this._arrayRecords.iterator();

            ArrayRecord var11;
            do {
               if(!var10.hasNext()) {
                  return null;
               }

               var11 = (ArrayRecord)var10.next();
            } while(!var11.isFirstCell(row, column));

            return var11;
         } else {
            return null;
         }
      }
   }

   public void unlink(SharedFormulaRecord sharedFormulaRecord) {
      SharedValueManager.SharedFormulaGroup svg = (SharedValueManager.SharedFormulaGroup)this._groupsBySharedFormulaRecord.remove(sharedFormulaRecord);
      if(svg == null) {
         throw new IllegalStateException("Failed to find formulas for shared formula");
      } else {
         this._groupsCache = null;
         svg.unlinkSharedFormulas();
      }
   }

   public void addArrayRecord(ArrayRecord ar) {
      this._arrayRecords.add(ar);
   }

   public CellRangeAddress8Bit removeArrayFormula(int rowIndex, int columnIndex) {
      Iterator ref = this._arrayRecords.iterator();

      ArrayRecord ar;
      do {
         if(!ref.hasNext()) {
            String ref1 = (new CellReference(rowIndex, columnIndex, false, false)).formatAsString();
            throw new IllegalArgumentException("Specified cell " + ref1 + " is not part of an array formula.");
         }

         ar = (ArrayRecord)ref.next();
      } while(!ar.isInRange(rowIndex, columnIndex));

      this._arrayRecords.remove(ar);
      return ar.getRange();
   }

   public ArrayRecord getArrayRecord(int firstRow, int firstColumn) {
      Iterator i$ = this._arrayRecords.iterator();

      ArrayRecord ar;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         ar = (ArrayRecord)i$.next();
      } while(!ar.isFirstCell(firstRow, firstColumn));

      return ar;
   }

   private static final class SharedFormulaGroup {

      private final SharedFormulaRecord _sfr;
      private final FormulaRecordAggregate[] _frAggs;
      private int _numberOfFormulas;
      private final CellReference _firstCell;


      public SharedFormulaGroup(SharedFormulaRecord sfr, CellReference firstCell) {
         if(!sfr.isInRange(firstCell.getRow(), firstCell.getCol())) {
            throw new IllegalArgumentException("First formula cell " + firstCell.formatAsString() + " is not shared formula range " + sfr.getRange().toString() + ".");
         } else {
            this._sfr = sfr;
            this._firstCell = firstCell;
            int width = sfr.getLastColumn() - sfr.getFirstColumn() + 1;
            int height = sfr.getLastRow() - sfr.getFirstRow() + 1;
            this._frAggs = new FormulaRecordAggregate[width * height];
            this._numberOfFormulas = 0;
         }
      }

      public void add(FormulaRecordAggregate agg) {
         if(this._numberOfFormulas == 0 && (this._firstCell.getRow() != agg.getRow() || this._firstCell.getCol() != agg.getColumn())) {
            throw new IllegalStateException("shared formula coding error: " + this._firstCell.getCol() + '/' + this._firstCell.getRow() + " != " + agg.getColumn() + '/' + agg.getRow());
         } else if(this._numberOfFormulas >= this._frAggs.length) {
            throw new RuntimeException("Too many formula records for shared formula group");
         } else {
            this._frAggs[this._numberOfFormulas++] = agg;
         }
      }

      public void unlinkSharedFormulas() {
         for(int i = 0; i < this._numberOfFormulas; ++i) {
            this._frAggs[i].unlinkSharedFormula();
         }

      }

      public SharedFormulaRecord getSFR() {
         return this._sfr;
      }

      public final String toString() {
         StringBuffer sb = new StringBuffer(64);
         sb.append(this.getClass().getName()).append(" [");
         sb.append(this._sfr.getRange().toString());
         sb.append("]");
         return sb.toString();
      }
   }
}
