package org.apache.poi.hssf.model;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.model.RecordOrderer;
import org.apache.poi.hssf.model.RecordStream;
import org.apache.poi.hssf.record.ArrayRecord;
import org.apache.poi.hssf.record.FormulaRecord;
import org.apache.poi.hssf.record.MergeCellsRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.SharedFormulaRecord;
import org.apache.poi.hssf.record.TableRecord;
import org.apache.poi.hssf.record.aggregates.SharedValueManager;
import org.apache.poi.ss.util.CellReference;

public final class RowBlocksReader {

   private final List _plainRecords;
   private final SharedValueManager _sfm;
   private final MergeCellsRecord[] _mergedCellsRecords;


   public RowBlocksReader(RecordStream rs) {
      ArrayList plainRecords = new ArrayList();
      ArrayList shFrmRecords = new ArrayList();
      ArrayList firstCellRefs = new ArrayList();
      ArrayList arrayRecords = new ArrayList();
      ArrayList tableRecords = new ArrayList();
      ArrayList mergeCellRecords = new ArrayList();

      Record sharedFormulaRecs;
      for(Record prevRec = null; !RecordOrderer.isEndOfRowBlock(rs.peekNextSid()); prevRec = sharedFormulaRecs) {
         if(!rs.hasNext()) {
            throw new RuntimeException("Failed to find end of row/cell records");
         }

         sharedFormulaRecs = rs.getNext();
         ArrayList firstCells;
         switch(sharedFormulaRecs.getSid()) {
         case 229:
            firstCells = mergeCellRecords;
            break;
         case 545:
            firstCells = arrayRecords;
            break;
         case 566:
            firstCells = tableRecords;
            break;
         case 1212:
            firstCells = shFrmRecords;
            if(!(prevRec instanceof FormulaRecord)) {
               throw new RuntimeException("Shared formula record should follow a FormulaRecord");
            }

            FormulaRecord arrayRecs = (FormulaRecord)prevRec;
            firstCellRefs.add(new CellReference(arrayRecs.getRow(), arrayRecs.getColumn()));
            break;
         default:
            firstCells = plainRecords;
         }

         firstCells.add(sharedFormulaRecs);
      }

      SharedFormulaRecord[] sharedFormulaRecs1 = new SharedFormulaRecord[shFrmRecords.size()];
      CellReference[] firstCells1 = new CellReference[firstCellRefs.size()];
      ArrayRecord[] arrayRecs1 = new ArrayRecord[arrayRecords.size()];
      TableRecord[] tableRecs = new TableRecord[tableRecords.size()];
      shFrmRecords.toArray(sharedFormulaRecs1);
      firstCellRefs.toArray(firstCells1);
      arrayRecords.toArray(arrayRecs1);
      tableRecords.toArray(tableRecs);
      this._plainRecords = plainRecords;
      this._sfm = SharedValueManager.create(sharedFormulaRecs1, firstCells1, arrayRecs1, tableRecs);
      this._mergedCellsRecords = new MergeCellsRecord[mergeCellRecords.size()];
      mergeCellRecords.toArray(this._mergedCellsRecords);
   }

   public MergeCellsRecord[] getLooseMergedCells() {
      return this._mergedCellsRecords;
   }

   public SharedValueManager getSharedFormulaManager() {
      return this._sfm;
   }

   public RecordStream getPlainRecordStream() {
      return new RecordStream(this._plainRecords, 0);
   }
}
