package org.apache.poi.hssf.model;

import java.util.List;
import org.apache.poi.hssf.record.DimensionsRecord;
import org.apache.poi.hssf.record.EOFRecord;
import org.apache.poi.hssf.record.GutsRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordBase;
import org.apache.poi.hssf.record.aggregates.ColumnInfoRecordsAggregate;
import org.apache.poi.hssf.record.aggregates.ConditionalFormattingTable;
import org.apache.poi.hssf.record.aggregates.DataValidityTable;
import org.apache.poi.hssf.record.aggregates.MergedCellsTable;
import org.apache.poi.hssf.record.aggregates.PageSettingsBlock;
import org.apache.poi.hssf.record.aggregates.WorksheetProtectionBlock;

final class RecordOrderer {

   public static void addNewSheetRecord(List sheetRecords, RecordBase newRecord) {
      int index = findSheetInsertPos(sheetRecords, newRecord.getClass());
      sheetRecords.add(index, newRecord);
   }

   private static int findSheetInsertPos(List records, Class recClass) {
      if(recClass == DataValidityTable.class) {
         return findDataValidationTableInsertPos(records);
      } else if(recClass == MergedCellsTable.class) {
         return findInsertPosForNewMergedRecordTable(records);
      } else if(recClass == ConditionalFormattingTable.class) {
         return findInsertPosForNewCondFormatTable(records);
      } else if(recClass == GutsRecord.class) {
         return getGutsRecordInsertPos(records);
      } else if(recClass == PageSettingsBlock.class) {
         return getPageBreakRecordInsertPos(records);
      } else if(recClass == WorksheetProtectionBlock.class) {
         return getWorksheetProtectionBlockInsertPos(records);
      } else {
         throw new RuntimeException("Unexpected record class (" + recClass.getName() + ")");
      }
   }

   private static int getWorksheetProtectionBlockInsertPos(List records) {
      int i = getDimensionsIndex(records);

      Object rb;
      do {
         if(i <= 0) {
            throw new IllegalStateException("did not find insert pos for protection block");
         }

         --i;
         rb = records.get(i);
      } while(isProtectionSubsequentRecord(rb));

      return i + 1;
   }

   private static boolean isProtectionSubsequentRecord(Object rb) {
      if(rb instanceof ColumnInfoRecordsAggregate) {
         return true;
      } else {
         if(rb instanceof Record) {
            Record record = (Record)rb;
            switch(record.getSid()) {
            case 85:
            case 144:
               return true;
            }
         }

         return false;
      }
   }

   private static int getPageBreakRecordInsertPos(List records) {
      int dimensionsIndex = getDimensionsIndex(records);
      int i = dimensionsIndex - 1;

      Object rb;
      do {
         if(i <= 0) {
            throw new RuntimeException("Did not find insert point for GUTS");
         }

         --i;
         rb = records.get(i);
      } while(!isPageBreakPriorRecord(rb));

      return i + 1;
   }

   private static boolean isPageBreakPriorRecord(Object rb) {
      if(rb instanceof Record) {
         Record record = (Record)rb;
         switch(record.getSid()) {
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 34:
         case 42:
         case 43:
         case 94:
         case 95:
         case 129:
         case 130:
         case 523:
         case 549:
         case 2057:
            return true;
         }
      }

      return false;
   }

   private static int findInsertPosForNewCondFormatTable(List records) {
      for(int i = records.size() - 2; i >= 0; --i) {
         Object rb = records.get(i);
         if(rb instanceof MergedCellsTable) {
            return i + 1;
         }

         if(!(rb instanceof DataValidityTable)) {
            Record rec = (Record)rb;
            switch(rec.getSid()) {
            case 29:
            case 65:
            case 153:
            case 160:
            case 239:
            case 351:
            case 574:
               return i + 1;
            }
         }
      }

      throw new RuntimeException("Did not find Window2 record");
   }

   private static int findInsertPosForNewMergedRecordTable(List records) {
      for(int i = records.size() - 2; i >= 0; --i) {
         Object rb = records.get(i);
         if(rb instanceof Record) {
            Record rec = (Record)rb;
            switch(rec.getSid()) {
            case 29:
            case 65:
            case 153:
            case 160:
            case 574:
               return i + 1;
            }
         }
      }

      throw new RuntimeException("Did not find Window2 record");
   }

   private static int findDataValidationTableInsertPos(List records) {
      int i = records.size() - 1;
      if(!(records.get(i) instanceof EOFRecord)) {
         throw new IllegalStateException("Last sheet record should be EOFRecord");
      } else {
         Record rec;
         do {
            if(i <= 0) {
               return 0;
            }

            --i;
            RecordBase rb = (RecordBase)records.get(i);
            if(isDVTPriorRecord(rb)) {
               rec = (Record)records.get(i + 1);
               if(!isDVTSubsequentRecord(rec.getSid())) {
                  throw new IllegalStateException("Unexpected (" + rec.getClass().getName() + ") found after (" + rb.getClass().getName() + ")");
               }

               return i + 1;
            }

            rec = (Record)rb;
         } while(isDVTSubsequentRecord(rec.getSid()));

         throw new IllegalStateException("Unexpected (" + rec.getClass().getName() + ") while looking for DV Table insert pos");
      }
   }

   private static boolean isDVTPriorRecord(RecordBase rb) {
      if(!(rb instanceof MergedCellsTable) && !(rb instanceof ConditionalFormattingTable)) {
         short sid = ((Record)rb).getSid();
         switch(sid) {
         case 29:
         case 65:
         case 153:
         case 160:
         case 239:
         case 351:
         case 440:
         case 442:
         case 574:
         case 2048:
            return true;
         default:
            return false;
         }
      } else {
         return true;
      }
   }

   private static boolean isDVTSubsequentRecord(short sid) {
      switch(sid) {
      case 10:
      case 2146:
      case 2151:
      case 2152:
      case 2248:
         return true;
      default:
         return false;
      }
   }

   private static int getDimensionsIndex(List records) {
      int nRecs = records.size();

      for(int i = 0; i < nRecs; ++i) {
         if(records.get(i) instanceof DimensionsRecord) {
            return i;
         }
      }

      throw new RuntimeException("DimensionsRecord not found");
   }

   private static int getGutsRecordInsertPos(List records) {
      int dimensionsIndex = getDimensionsIndex(records);
      int i = dimensionsIndex - 1;

      RecordBase rb;
      do {
         if(i <= 0) {
            throw new RuntimeException("Did not find insert point for GUTS");
         }

         --i;
         rb = (RecordBase)records.get(i);
      } while(!isGutsPriorRecord(rb));

      return i + 1;
   }

   private static boolean isGutsPriorRecord(RecordBase rb) {
      if(rb instanceof Record) {
         Record record = (Record)rb;
         switch(record.getSid()) {
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 34:
         case 42:
         case 43:
         case 94:
         case 95:
         case 130:
         case 523:
         case 2057:
            return true;
         }
      }

      return false;
   }

   public static boolean isEndOfRowBlock(int sid) {
      switch(sid) {
      case 10:
         throw new RuntimeException("Found EOFRecord before WindowTwoRecord was encountered");
      case 61:
      case 93:
      case 125:
      case 128:
      case 176:
      case 236:
      case 237:
      case 438:
      case 574:
         return true;
      case 434:
         return true;
      default:
         return PageSettingsBlock.isComponentRecord(sid);
      }
   }

   public static boolean isRowBlockRecord(int sid) {
      switch(sid) {
      case 6:
      case 253:
      case 513:
      case 515:
      case 516:
      case 517:
      case 520:
      case 545:
      case 566:
      case 638:
      case 1212:
         return true;
      default:
         return false;
      }
   }
}
