package org.apache.poi.hssf.record;

import java.io.ByteArrayOutputStream;
import org.apache.poi.hssf.record.CommonObjectDataSubRecord;
import org.apache.poi.hssf.record.EmbeddedObjectRefSubRecord;
import org.apache.poi.hssf.record.EndSubRecord;
import org.apache.poi.hssf.record.FtCblsSubRecord;
import org.apache.poi.hssf.record.FtCfSubRecord;
import org.apache.poi.hssf.record.FtPioGrbitSubRecord;
import org.apache.poi.hssf.record.GroupMarkerSubRecord;
import org.apache.poi.hssf.record.LbsDataSubRecord;
import org.apache.poi.hssf.record.NoteStructureSubRecord;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.LittleEndianOutputStream;

public abstract class SubRecord {

   public static SubRecord createSubRecord(LittleEndianInput in, int cmoOt) {
      int sid = in.readUShort();
      int secondUShort = in.readUShort();
      switch(sid) {
      case 0:
         return new EndSubRecord(in, secondUShort);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 10:
      case 11:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 20:
      default:
         return new SubRecord.UnknownSubRecord(in, sid, secondUShort);
      case 6:
         return new GroupMarkerSubRecord(in, secondUShort);
      case 7:
         return new FtCfSubRecord(in, secondUShort);
      case 8:
         return new FtPioGrbitSubRecord(in, secondUShort);
      case 9:
         return new EmbeddedObjectRefSubRecord(in, secondUShort);
      case 12:
         return new FtCblsSubRecord(in, secondUShort);
      case 13:
         return new NoteStructureSubRecord(in, secondUShort);
      case 19:
         return new LbsDataSubRecord(in, secondUShort, cmoOt);
      case 21:
         return new CommonObjectDataSubRecord(in, secondUShort);
      }
   }

   protected abstract int getDataSize();

   public byte[] serialize() {
      int size = this.getDataSize() + 4;
      ByteArrayOutputStream baos = new ByteArrayOutputStream(size);
      this.serialize(new LittleEndianOutputStream(baos));
      if(baos.size() != size) {
         throw new RuntimeException("write size mismatch");
      } else {
         return baos.toByteArray();
      }
   }

   public abstract void serialize(LittleEndianOutput var1);

   public abstract Object clone();

   public boolean isTerminating() {
      return false;
   }

   private static final class UnknownSubRecord extends SubRecord {

      private final int _sid;
      private final byte[] _data;


      public UnknownSubRecord(LittleEndianInput in, int sid, int size) {
         this._sid = sid;
         byte[] buf = new byte[size];
         in.readFully(buf);
         this._data = buf;
      }

      protected int getDataSize() {
         return this._data.length;
      }

      public void serialize(LittleEndianOutput out) {
         out.writeShort(this._sid);
         out.writeShort(this._data.length);
         out.write(this._data);
      }

      public Object clone() {
         return this;
      }

      public String toString() {
         StringBuffer sb = new StringBuffer(64);
         sb.append(this.getClass().getName()).append(" [");
         sb.append("sid=").append(HexDump.shortToHex(this._sid));
         sb.append(" size=").append(this._data.length);
         sb.append(" : ").append(HexDump.toHex(this._data));
         sb.append("]\n");
         return sb.toString();
      }
   }
}
