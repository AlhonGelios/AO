package org.apache.poi.hssf.record;

import java.io.ByteArrayInputStream;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.SubRecord;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.RefPtg;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianInputStream;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.StringUtil;

public final class EmbeddedObjectRefSubRecord extends SubRecord implements Cloneable {

   private static POILogger logger = POILogFactory.getLogger(EmbeddedObjectRefSubRecord.class);
   public static final short sid = 9;
   private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
   private int field_1_unknown_int;
   private Ptg field_2_refPtg;
   private byte[] field_2_unknownFormulaData;
   private boolean field_3_unicode_flag;
   private String field_4_ole_classname;
   private Byte field_4_unknownByte;
   private Integer field_5_stream_id;
   private byte[] field_6_unknown;


   public EmbeddedObjectRefSubRecord() {
      this.field_2_unknownFormulaData = new byte[]{(byte)2, (byte)108, (byte)106, (byte)22, (byte)1};
      this.field_6_unknown = EMPTY_BYTE_ARRAY;
      this.field_4_ole_classname = null;
   }

   public short getSid() {
      return (short)9;
   }

   public EmbeddedObjectRefSubRecord(LittleEndianInput in, int size) {
      short streamIdOffset = in.readShort();
      int remaining = size - 2;
      int dataLenAfterFormula = remaining - streamIdOffset;
      int formulaSize = in.readUShort();
      remaining -= 2;
      this.field_1_unknown_int = in.readInt();
      remaining -= 4;
      byte[] formulaRawBytes = readRawData(in, formulaSize);
      remaining -= formulaSize;
      this.field_2_refPtg = readRefPtg(formulaRawBytes);
      if(this.field_2_refPtg == null) {
         this.field_2_unknownFormulaData = formulaRawBytes;
      } else {
         this.field_2_unknownFormulaData = null;
      }

      byte nUnexpectedPadding;
      int var11;
      if(remaining >= dataLenAfterFormula + 3) {
         nUnexpectedPadding = in.readByte();
         byte stringByteCount = 1;
         if(nUnexpectedPadding != 3) {
            throw new RecordFormatException("Expected byte 0x03 here");
         }

         int nChars = in.readUShort();
         var11 = stringByteCount + 2;
         if(nChars > 0) {
            this.field_3_unicode_flag = (in.readByte() & 1) != 0;
            ++var11;
            if(this.field_3_unicode_flag) {
               this.field_4_ole_classname = StringUtil.readUnicodeLE(in, nChars);
               var11 += nChars * 2;
            } else {
               this.field_4_ole_classname = StringUtil.readCompressedUnicode(in, nChars);
               var11 += nChars;
            }
         } else {
            this.field_4_ole_classname = "";
         }
      } else {
         this.field_4_ole_classname = null;
         var11 = 0;
      }

      remaining -= var11;
      if((var11 + formulaSize) % 2 != 0) {
         nUnexpectedPadding = in.readByte();
         --remaining;
         if(this.field_2_refPtg != null && this.field_4_ole_classname == null) {
            this.field_4_unknownByte = Byte.valueOf((byte)nUnexpectedPadding);
         }
      }

      int var12 = remaining - dataLenAfterFormula;
      if(var12 > 0) {
         logger.log(7, new Object[]{"Discarding " + var12 + " unexpected padding bytes "});
         readRawData(in, var12);
         remaining -= var12;
      }

      if(dataLenAfterFormula >= 4) {
         this.field_5_stream_id = Integer.valueOf(in.readInt());
         remaining -= 4;
      } else {
         this.field_5_stream_id = null;
      }

      this.field_6_unknown = readRawData(in, remaining);
   }

   private static Ptg readRefPtg(byte[] formulaRawBytes) {
      LittleEndianInputStream in = new LittleEndianInputStream(new ByteArrayInputStream(formulaRawBytes));
      byte ptgSid = in.readByte();
      switch(ptgSid) {
      case 36:
         return new RefPtg(in);
      case 37:
         return new AreaPtg(in);
      case 58:
         return new Ref3DPtg(in);
      case 59:
         return new Area3DPtg(in);
      default:
         return null;
      }
   }

   private static byte[] readRawData(LittleEndianInput in, int size) {
      if(size < 0) {
         throw new IllegalArgumentException("Negative size (" + size + ")");
      } else if(size == 0) {
         return EMPTY_BYTE_ARRAY;
      } else {
         byte[] result = new byte[size];
         in.readFully(result);
         return result;
      }
   }

   private int getStreamIDOffset(int formulaSize) {
      byte result = 6;
      int var4 = result + formulaSize;
      if(this.field_4_ole_classname == null) {
         boolean stringLen = false;
      } else {
         var4 += 3;
         int var5 = this.field_4_ole_classname.length();
         if(var5 > 0) {
            ++var4;
            if(this.field_3_unicode_flag) {
               var4 += var5 * 2;
            } else {
               var4 += var5;
            }
         }
      }

      if(var4 % 2 != 0) {
         ++var4;
      }

      return var4;
   }

   private int getDataSize(int idOffset) {
      int result = 2 + idOffset;
      if(this.field_5_stream_id != null) {
         result += 4;
      }

      return result + this.field_6_unknown.length;
   }

   protected int getDataSize() {
      int formulaSize = this.field_2_refPtg == null?this.field_2_unknownFormulaData.length:this.field_2_refPtg.getSize();
      int idOffset = this.getStreamIDOffset(formulaSize);
      return this.getDataSize(idOffset);
   }

   public void serialize(LittleEndianOutput out) {
      int formulaSize = this.field_2_refPtg == null?this.field_2_unknownFormulaData.length:this.field_2_refPtg.getSize();
      int idOffset = this.getStreamIDOffset(formulaSize);
      int dataSize = this.getDataSize(idOffset);
      out.writeShort(9);
      out.writeShort(dataSize);
      out.writeShort(idOffset);
      out.writeShort(formulaSize);
      out.writeInt(this.field_1_unknown_int);
      byte pos = 12;
      if(this.field_2_refPtg == null) {
         out.write(this.field_2_unknownFormulaData);
      } else {
         this.field_2_refPtg.write(out);
      }

      int var7 = pos + formulaSize;
      if(this.field_4_ole_classname == null) {
         boolean stringLen = false;
      } else {
         out.writeByte(3);
         ++var7;
         int var8 = this.field_4_ole_classname.length();
         out.writeShort(var8);
         var7 += 2;
         if(var8 > 0) {
            out.writeByte(this.field_3_unicode_flag?1:0);
            ++var7;
            if(this.field_3_unicode_flag) {
               StringUtil.putUnicodeLE(this.field_4_ole_classname, out);
               var7 += var8 * 2;
            } else {
               StringUtil.putCompressedUnicode(this.field_4_ole_classname, out);
               var7 += var8;
            }
         }
      }

      switch(idOffset - (var7 - 6)) {
      case 1:
         out.writeByte(this.field_4_unknownByte == null?0:this.field_4_unknownByte.intValue());
         ++var7;
      case 0:
         if(this.field_5_stream_id != null) {
            out.writeInt(this.field_5_stream_id.intValue());
            var7 += 4;
         }

         out.write(this.field_6_unknown);
         return;
      default:
         throw new IllegalStateException("Bad padding calculation (" + idOffset + ", " + var7 + ")");
      }
   }

   public Integer getStreamId() {
      return this.field_5_stream_id;
   }

   public String getOLEClassName() {
      return this.field_4_ole_classname;
   }

   public byte[] getObjectData() {
      return this.field_6_unknown;
   }

   public EmbeddedObjectRefSubRecord clone() {
      return this;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer();
      sb.append("[ftPictFmla]\n");
      sb.append("    .f2unknown     = ").append(HexDump.intToHex(this.field_1_unknown_int)).append("\n");
      if(this.field_2_refPtg == null) {
         sb.append("    .f3unknown     = ").append(HexDump.toHex(this.field_2_unknownFormulaData)).append("\n");
      } else {
         sb.append("    .formula       = ").append(this.field_2_refPtg.toString()).append("\n");
      }

      if(this.field_4_ole_classname != null) {
         sb.append("    .unicodeFlag   = ").append(this.field_3_unicode_flag).append("\n");
         sb.append("    .oleClassname  = ").append(this.field_4_ole_classname).append("\n");
      }

      if(this.field_4_unknownByte != null) {
         sb.append("    .f4unknown   = ").append(HexDump.byteToHex(this.field_4_unknownByte.intValue())).append("\n");
      }

      if(this.field_5_stream_id != null) {
         sb.append("    .streamId      = ").append(HexDump.intToHex(this.field_5_stream_id.intValue())).append("\n");
      }

      if(this.field_6_unknown.length > 0) {
         sb.append("    .f7unknown     = ").append(HexDump.toHex(this.field_6_unknown)).append("\n");
      }

      sb.append("[/ftPictFmla]");
      return sb.toString();
   }

   public void setUnknownFormulaData(byte[] formularData) {
      this.field_2_unknownFormulaData = formularData;
   }

   public void setOleClassname(String oleClassname) {
      this.field_4_ole_classname = oleClassname;
   }

   public void setStorageId(int storageId) {
      this.field_5_stream_id = Integer.valueOf(storageId);
   }

}
