package org.apache.poi.hssf.record;

import java.util.Arrays;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.StringUtil;

public class DConRefRecord extends StandardRecord {

   public static final short sid = 81;
   private int firstRow;
   private int lastRow;
   private int firstCol;
   private int lastCol;
   private int charCount;
   private int charType;
   private byte[] path;
   private byte[] _unused;


   public DConRefRecord(byte[] data) {
      byte offset = 0;
      if(LittleEndian.getShort(data, offset) != 81) {
         throw new RecordFormatException("incompatible sid.");
      } else {
         int var4 = offset + 2;
         var4 += 2;
         this.firstRow = LittleEndian.getUShort(data, var4);
         var4 += 2;
         this.lastRow = LittleEndian.getUShort(data, var4);
         var4 += 2;
         this.firstCol = LittleEndian.getUByte(data, var4);
         ++var4;
         this.lastCol = LittleEndian.getUByte(data, var4);
         ++var4;
         this.charCount = LittleEndian.getUShort(data, var4);
         var4 += 2;
         if(this.charCount < 2) {
            throw new RecordFormatException("Character count must be >= 2");
         } else {
            this.charType = LittleEndian.getUByte(data, var4);
            ++var4;
            int byteLength = this.charCount * ((this.charType & 1) + 1);
            this.path = LittleEndian.getByteArray(data, var4, byteLength);
            var4 += byteLength;
            if(this.path[0] == 2) {
               this._unused = LittleEndian.getByteArray(data, var4, this.charType + 1);
            }

         }
      }
   }

   public DConRefRecord(RecordInputStream inStream) {
      if(inStream.getSid() != 81) {
         throw new RecordFormatException("Wrong sid: " + inStream.getSid());
      } else {
         this.firstRow = inStream.readUShort();
         this.lastRow = inStream.readUShort();
         this.firstCol = inStream.readUByte();
         this.lastCol = inStream.readUByte();
         this.charCount = inStream.readUShort();
         this.charType = inStream.readUByte() & 1;
         int byteLength = this.charCount * (this.charType + 1);
         this.path = new byte[byteLength];
         inStream.readFully(this.path);
         if(this.path[0] == 2) {
            this._unused = inStream.readRemainder();
         }

      }
   }

   protected int getDataSize() {
      int sz = 9 + this.path.length;
      if(this.path[0] == 2) {
         sz += this._unused.length;
      }

      return sz;
   }

   protected void serialize(LittleEndianOutput out) {
      out.writeShort(this.firstRow);
      out.writeShort(this.lastRow);
      out.writeByte(this.firstCol);
      out.writeByte(this.lastCol);
      out.writeShort(this.charCount);
      out.writeByte(this.charType);
      out.write(this.path);
      if(this.path[0] == 2) {
         out.write(this._unused);
      }

   }

   public short getSid() {
      return (short)81;
   }

   public int getFirstColumn() {
      return this.firstCol;
   }

   public int getFirstRow() {
      return this.firstRow;
   }

   public int getLastColumn() {
      return this.lastCol;
   }

   public int getLastRow() {
      return this.lastRow;
   }

   public String toString() {
      StringBuilder b = new StringBuilder();
      b.append("[DCONREF]\n");
      b.append("    .ref\n");
      b.append("        .firstrow   = ").append(this.firstRow).append("\n");
      b.append("        .lastrow    = ").append(this.lastRow).append("\n");
      b.append("        .firstcol   = ").append(this.firstCol).append("\n");
      b.append("        .lastcol    = ").append(this.lastCol).append("\n");
      b.append("    .cch            = ").append(this.charCount).append("\n");
      b.append("    .stFile\n");
      b.append("        .h          = ").append(this.charType).append("\n");
      b.append("        .rgb        = ").append(this.getReadablePath()).append("\n");
      b.append("[/DCONREF]\n");
      return b.toString();
   }

   public byte[] getPath() {
      return Arrays.copyOf(this.path, this.path.length);
   }

   public String getReadablePath() {
      if(this.path == null) {
         return null;
      } else {
         int offset;
         for(offset = 1; this.path[offset] < 32 && offset < this.path.length; ++offset) {
            ;
         }

         String out = new String(Arrays.copyOfRange(this.path, offset, this.path.length), StringUtil.UTF8);
         out = out.replaceAll("", "/");
         return out;
      }
   }

   public boolean isExternalRef() {
      return this.path[0] == 1;
   }
}
