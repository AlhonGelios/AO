package org.apache.poi.hssf.record;

import java.util.Iterator;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.hssf.record.RecordInputStream;

public final class VerticalPageBreakRecord extends PageBreakRecord {

   public static final short sid = 26;


   public VerticalPageBreakRecord() {}

   public VerticalPageBreakRecord(RecordInputStream in) {
      super(in);
   }

   public short getSid() {
      return (short)26;
   }

   public Object clone() {
      VerticalPageBreakRecord result = new VerticalPageBreakRecord();
      Iterator iterator = this.getBreaksIterator();

      while(iterator.hasNext()) {
         PageBreakRecord.Break original = (PageBreakRecord.Break)iterator.next();
         result.addBreak(original.main, original.subFrom, original.subTo);
      }

      return result;
   }
}
