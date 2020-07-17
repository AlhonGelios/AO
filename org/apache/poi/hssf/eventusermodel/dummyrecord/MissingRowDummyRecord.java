package org.apache.poi.hssf.eventusermodel.dummyrecord;

import org.apache.poi.hssf.eventusermodel.dummyrecord.DummyRecordBase;

public final class MissingRowDummyRecord extends DummyRecordBase {

   private int rowNumber;


   public MissingRowDummyRecord(int rowNumber) {
      this.rowNumber = rowNumber;
   }

   public int getRowNumber() {
      return this.rowNumber;
   }
}
