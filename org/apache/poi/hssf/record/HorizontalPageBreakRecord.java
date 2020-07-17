package org.apache.poi.hssf.record;

import java.util.Iterator;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.hssf.record.RecordInputStream;

public final class HorizontalPageBreakRecord extends PageBreakRecord implements Cloneable {

   public static final short sid = 27;


   public HorizontalPageBreakRecord() {}

   public HorizontalPageBreakRecord(RecordInputStream in) {
      super(in);
   }

   public short getSid() {
      return (short)27;
   }

   public PageBreakRecord clone() {
      HorizontalPageBreakRecord result = new HorizontalPageBreakRecord();
      Iterator iterator = this.getBreaksIterator();

      while(iterator.hasNext()) {
         PageBreakRecord.Break original = (PageBreakRecord.Break)iterator.next();
         result.addBreak(original.main, original.subFrom, original.subTo);
      }

      return result;
   }
}
