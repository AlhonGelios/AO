package org.apache.poi.hssf.record.cont;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.util.LittleEndianInput;

public class ContinuableRecordInput implements LittleEndianInput {

   private final RecordInputStream _in;


   public ContinuableRecordInput(RecordInputStream in) {
      this._in = in;
   }

   public int available() {
      return this._in.available();
   }

   public byte readByte() {
      return this._in.readByte();
   }

   public int readUByte() {
      return this._in.readUByte();
   }

   public short readShort() {
      return this._in.readShort();
   }

   public int readUShort() {
      int ch1 = this.readUByte();
      int ch2 = this.readUByte();
      return (ch2 << 8) + (ch1 << 0);
   }

   public int readInt() {
      int ch1 = this._in.readUByte();
      int ch2 = this._in.readUByte();
      int ch3 = this._in.readUByte();
      int ch4 = this._in.readUByte();
      return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0);
   }

   public long readLong() {
      int b0 = this._in.readUByte();
      int b1 = this._in.readUByte();
      int b2 = this._in.readUByte();
      int b3 = this._in.readUByte();
      int b4 = this._in.readUByte();
      int b5 = this._in.readUByte();
      int b6 = this._in.readUByte();
      int b7 = this._in.readUByte();
      return ((long)b7 << 56) + ((long)b6 << 48) + ((long)b5 << 40) + ((long)b4 << 32) + ((long)b3 << 24) + (long)(b2 << 16) + (long)(b1 << 8) + (long)(b0 << 0);
   }

   public double readDouble() {
      return this._in.readDouble();
   }

   public void readFully(byte[] buf) {
      this._in.readFully(buf);
   }

   public void readFully(byte[] buf, int off, int len) {
      this._in.readFully(buf, off, len);
   }
}
