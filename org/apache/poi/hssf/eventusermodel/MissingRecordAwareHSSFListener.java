package org.apache.poi.hssf.eventusermodel;

import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.hssf.eventusermodel.dummyrecord.MissingCellDummyRecord;
import org.apache.poi.hssf.eventusermodel.dummyrecord.MissingRowDummyRecord;
import org.apache.poi.hssf.record.BOFRecord;
import org.apache.poi.hssf.record.CellValueRecordInterface;
import org.apache.poi.hssf.record.MulBlankRecord;
import org.apache.poi.hssf.record.MulRKRecord;
import org.apache.poi.hssf.record.NoteRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordFactory;
import org.apache.poi.hssf.record.RowRecord;
import org.apache.poi.hssf.record.StringRecord;

public final class MissingRecordAwareHSSFListener implements HSSFListener {

   private HSSFListener childListener;
   private int lastRowRow;
   private int lastCellRow;
   private int lastCellColumn;


   public MissingRecordAwareHSSFListener(HSSFListener listener) {
      this.resetCounts();
      this.childListener = listener;
   }

   public void processRecord(Record record) {
      Object expandedRecords = null;
      int thisRow;
      int thisColumn;
      int i$;
      if(record instanceof CellValueRecordInterface) {
         CellValueRecordInterface arr$ = (CellValueRecordInterface)record;
         thisRow = arr$.getRow();
         thisColumn = arr$.getColumn();
      } else {
         if(record instanceof StringRecord) {
            this.childListener.processRecord(record);
            return;
         }

         thisRow = -1;
         thisColumn = -1;
         switch(record.getSid()) {
         case 28:
            NoteRecord nrec = (NoteRecord)record;
            thisRow = nrec.getRow();
            thisColumn = nrec.getColumn();
            break;
         case 189:
            MulRKRecord var15 = (MulRKRecord)record;
            expandedRecords = RecordFactory.convertRKRecords(var15);
            break;
         case 190:
            MulBlankRecord var14 = (MulBlankRecord)record;
            expandedRecords = RecordFactory.convertBlankRecords(var14);
            break;
         case 520:
            RowRecord len$ = (RowRecord)record;
            if(this.lastRowRow + 1 < len$.getRowNumber()) {
               for(i$ = this.lastRowRow + 1; i$ < len$.getRowNumber(); ++i$) {
                  MissingRowDummyRecord r = new MissingRowDummyRecord(i$);
                  this.childListener.processRecord(r);
               }
            }

            this.lastRowRow = len$.getRowNumber();
            this.lastCellColumn = -1;
            break;
         case 1212:
            this.childListener.processRecord(record);
            return;
         case 2057:
            BOFRecord var10 = (BOFRecord)record;
            if(var10.getType() == 5 || var10.getType() == 16) {
               this.resetCounts();
            }
         }
      }

      if(expandedRecords != null && ((Object[])expandedRecords).length > 0) {
         thisRow = ((CellValueRecordInterface)((Object[])expandedRecords)[0]).getRow();
         thisColumn = ((CellValueRecordInterface)((Object[])expandedRecords)[0]).getColumn();
      }

      int var11;
      int var12;
      if(thisRow != this.lastCellRow && thisRow > 0) {
         if(this.lastCellRow == -1) {
            this.lastCellRow = 0;
         }

         for(var11 = this.lastCellRow; var11 < thisRow; ++var11) {
            var12 = -1;
            if(var11 == this.lastCellRow) {
               var12 = this.lastCellColumn;
            }

            this.childListener.processRecord(new LastCellOfRowDummyRecord(var11, var12));
         }
      }

      if(this.lastCellRow != -1 && this.lastCellColumn != -1 && thisRow == -1) {
         this.childListener.processRecord(new LastCellOfRowDummyRecord(this.lastCellRow, this.lastCellColumn));
         this.lastCellRow = -1;
         this.lastCellColumn = -1;
      }

      if(thisRow != this.lastCellRow) {
         this.lastCellColumn = -1;
      }

      if(this.lastCellColumn != thisColumn - 1) {
         for(var11 = this.lastCellColumn + 1; var11 < thisColumn; ++var11) {
            this.childListener.processRecord(new MissingCellDummyRecord(thisRow, var11));
         }
      }

      if(expandedRecords != null && ((Object[])expandedRecords).length > 0) {
         thisColumn = ((CellValueRecordInterface)((Object[])expandedRecords)[((Object[])expandedRecords).length - 1]).getColumn();
      }

      if(thisColumn != -1) {
         this.lastCellColumn = thisColumn;
         this.lastCellRow = thisRow;
      }

      if(expandedRecords != null && ((Object[])expandedRecords).length > 0) {
         Object var13 = expandedRecords;
         var12 = ((Object[])expandedRecords).length;

         for(i$ = 0; i$ < var12; ++i$) {
            Object var16 = ((Object[])var13)[i$];
            this.childListener.processRecord((Record)var16);
         }
      } else {
         this.childListener.processRecord(record);
      }

   }

   private void resetCounts() {
      this.lastRowRow = -1;
      this.lastCellRow = -1;
      this.lastCellColumn = -1;
   }
}
