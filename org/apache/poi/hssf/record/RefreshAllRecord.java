package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class RefreshAllRecord extends StandardRecord {

   public static final short sid = 439;
   private static final BitField refreshFlag = BitFieldFactory.getInstance(1);
   private int _options;


   private RefreshAllRecord(int options) {
      this._options = options;
   }

   public RefreshAllRecord(RecordInputStream in) {
      this(in.readUShort());
   }

   public RefreshAllRecord(boolean refreshAll) {
      this(0);
      this.setRefreshAll(refreshAll);
   }

   public void setRefreshAll(boolean refreshAll) {
      this._options = refreshFlag.setBoolean(this._options, refreshAll);
   }

   public boolean getRefreshAll() {
      return refreshFlag.isSet(this._options);
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[REFRESHALL]\n");
      buffer.append("    .options      = ").append(HexDump.shortToHex(this._options)).append("\n");
      buffer.append("[/REFRESHALL]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this._options);
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)439;
   }

   public Object clone() {
      return new RefreshAllRecord(this._options);
   }

}
