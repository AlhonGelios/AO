package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class DSFRecord extends StandardRecord {

   public static final short sid = 353;
   private static final BitField biff5BookStreamFlag = BitFieldFactory.getInstance(1);
   private int _options;


   private DSFRecord(int options) {
      this._options = options;
   }

   public DSFRecord(boolean isBiff5BookStreamPresent) {
      this(0);
      this._options = biff5BookStreamFlag.setBoolean(0, isBiff5BookStreamPresent);
   }

   public DSFRecord(RecordInputStream in) {
      this(in.readShort());
   }

   public boolean isBiff5BookStreamPresent() {
      return biff5BookStreamFlag.isSet(this._options);
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[DSF]\n");
      buffer.append("    .options = ").append(HexDump.shortToHex(this._options)).append("\n");
      buffer.append("[/DSF]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this._options);
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)353;
   }

}
