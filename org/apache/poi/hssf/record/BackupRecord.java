package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class BackupRecord extends StandardRecord {

   public static final short sid = 64;
   private short field_1_backup;


   public BackupRecord() {}

   public BackupRecord(RecordInputStream in) {
      this.field_1_backup = in.readShort();
   }

   public void setBackup(short backup) {
      this.field_1_backup = backup;
   }

   public short getBackup() {
      return this.field_1_backup;
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[BACKUP]\n");
      buffer.append("    .backup          = ").append(Integer.toHexString(this.getBackup())).append("\n");
      buffer.append("[/BACKUP]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.getBackup());
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)64;
   }
}
