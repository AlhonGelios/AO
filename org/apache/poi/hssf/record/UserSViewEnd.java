package org.apache.poi.hssf.record;

import java.util.Locale;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class UserSViewEnd extends StandardRecord {

   public static final short sid = 427;
   private byte[] _rawData;


   public UserSViewEnd(byte[] data) {
      this._rawData = data;
   }

   public UserSViewEnd(RecordInputStream in) {
      this._rawData = in.readRemainder();
   }

   public void serialize(LittleEndianOutput out) {
      out.write(this._rawData);
   }

   protected int getDataSize() {
      return this._rawData.length;
   }

   public short getSid() {
      return (short)427;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer();
      sb.append("[").append("USERSVIEWEND").append("] (0x");
      sb.append(Integer.toHexString(427).toUpperCase(Locale.ROOT) + ")\n");
      sb.append("  rawData=").append(HexDump.toHex(this._rawData)).append("\n");
      sb.append("[/").append("USERSVIEWEND").append("]\n");
      return sb.toString();
   }

   public Object clone() {
      return this.cloneViaReserialise();
   }
}
