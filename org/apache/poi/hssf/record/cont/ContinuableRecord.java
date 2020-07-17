package org.apache.poi.hssf.record.cont;

import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.cont.ContinuableRecordOutput;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;

public abstract class ContinuableRecord extends Record {

   protected abstract void serialize(ContinuableRecordOutput var1);

   public final int getRecordSize() {
      ContinuableRecordOutput out = ContinuableRecordOutput.createForCountingOnly();
      this.serialize(out);
      out.terminate();
      return out.getTotalSize();
   }

   public final int serialize(int offset, byte[] data) {
      LittleEndianByteArrayOutputStream leo = new LittleEndianByteArrayOutputStream(data, offset);
      ContinuableRecordOutput out = new ContinuableRecordOutput(leo, this.getSid());
      this.serialize(out);
      out.terminate();
      return out.getTotalSize();
   }
}
