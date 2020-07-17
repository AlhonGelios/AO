package org.apache.poi.ddf;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import org.apache.poi.ddf.EscherBlipRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class EscherPictBlip extends EscherBlipRecord {

   private static final POILogger log = POILogFactory.getLogger(EscherPictBlip.class);
   public static final short RECORD_ID_EMF = -4070;
   public static final short RECORD_ID_WMF = -4069;
   public static final short RECORD_ID_PICT = -4068;
   private static final int HEADER_SIZE = 8;
   private final byte[] field_1_UID = new byte[16];
   private int field_2_cb;
   private int field_3_rcBounds_x1;
   private int field_3_rcBounds_y1;
   private int field_3_rcBounds_x2;
   private int field_3_rcBounds_y2;
   private int field_4_ptSize_w;
   private int field_4_ptSize_h;
   private int field_5_cbSave;
   private byte field_6_fCompression;
   private byte field_7_fFilter;
   private byte[] raw_pictureData;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesAfterHeader = this.readHeader(data, offset);
      int pos = offset + 8;
      System.arraycopy(data, pos, this.field_1_UID, 0, 16);
      pos += 16;
      this.field_2_cb = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_3_rcBounds_x1 = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_3_rcBounds_y1 = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_3_rcBounds_x2 = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_3_rcBounds_y2 = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_4_ptSize_w = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_4_ptSize_h = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_5_cbSave = LittleEndian.getInt(data, pos);
      pos += 4;
      this.field_6_fCompression = data[pos];
      ++pos;
      this.field_7_fFilter = data[pos];
      ++pos;
      this.raw_pictureData = new byte[this.field_5_cbSave];
      System.arraycopy(data, pos, this.raw_pictureData, 0, this.field_5_cbSave);
      if(this.field_6_fCompression == 0) {
         this.field_pictureData = inflatePictureData(this.raw_pictureData);
      } else {
         this.field_pictureData = this.raw_pictureData;
      }

      return bytesAfterHeader + 8;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      int pos = offset + 2;
      LittleEndian.putShort(data, pos, this.getRecordId());
      pos += 2;
      LittleEndian.putInt(data, 0, this.getRecordSize() - 8);
      pos += 4;
      System.arraycopy(this.field_1_UID, 0, data, pos, 16);
      pos += 16;
      LittleEndian.putInt(data, pos, this.field_2_cb);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_rcBounds_x1);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_rcBounds_y1);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_rcBounds_x2);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_rcBounds_y2);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_4_ptSize_w);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_4_ptSize_h);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_5_cbSave);
      pos += 4;
      data[pos] = this.field_6_fCompression;
      ++pos;
      data[pos] = this.field_7_fFilter;
      ++pos;
      System.arraycopy(this.raw_pictureData, 0, data, pos, this.raw_pictureData.length);
      listener.afterRecordSerialize(offset + this.getRecordSize(), this.getRecordId(), this.getRecordSize(), this);
      return 25 + this.raw_pictureData.length;
   }

   private static byte[] inflatePictureData(byte[] data) {
      try {
         InflaterInputStream e = new InflaterInputStream(new ByteArrayInputStream(data));
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         byte[] buf = new byte[4096];

         int readBytes;
         while((readBytes = e.read(buf)) > 0) {
            out.write(buf, 0, readBytes);
         }

         return out.toByteArray();
      } catch (IOException var5) {
         log.log(3, new Object[]{"Possibly corrupt compression or non-compressed data", var5});
         return data;
      }
   }

   public int getRecordSize() {
      return 58 + this.raw_pictureData.length;
   }

   public byte[] getUID() {
      return this.field_1_UID;
   }

   public void setUID(byte[] uid) {
      if(uid != null && uid.length == 16) {
         System.arraycopy(uid, 0, this.field_1_UID, 0, this.field_1_UID.length);
      } else {
         throw new IllegalArgumentException("uid must be byte[16]");
      }
   }

   public int getUncompressedSize() {
      return this.field_2_cb;
   }

   public void setUncompressedSize(int uncompressedSize) {
      this.field_2_cb = uncompressedSize;
   }

   public Rectangle getBounds() {
      return new Rectangle(this.field_3_rcBounds_x1, this.field_3_rcBounds_y1, this.field_3_rcBounds_x2 - this.field_3_rcBounds_x1, this.field_3_rcBounds_y2 - this.field_3_rcBounds_y1);
   }

   public void setBounds(Rectangle bounds) {
      this.field_3_rcBounds_x1 = bounds.x;
      this.field_3_rcBounds_y1 = bounds.y;
      this.field_3_rcBounds_x2 = bounds.x + bounds.width;
      this.field_3_rcBounds_y2 = bounds.y + bounds.height;
   }

   public Dimension getSizeEMU() {
      return new Dimension(this.field_4_ptSize_w, this.field_4_ptSize_h);
   }

   public void setSizeEMU(Dimension sizeEMU) {
      this.field_4_ptSize_w = sizeEMU.width;
      this.field_4_ptSize_h = sizeEMU.height;
   }

   public int getCompressedSize() {
      return this.field_5_cbSave;
   }

   public void setCompressedSize(int compressedSize) {
      this.field_5_cbSave = compressedSize;
   }

   public boolean isCompressed() {
      return this.field_6_fCompression == 0;
   }

   public void setCompressed(boolean compressed) {
      this.field_6_fCompression = (byte)(compressed?0:-2);
   }

   public String toString() {
      String extraData = HexDump.toHex(this.field_pictureData, 32);
      return this.getClass().getName() + ":" + '\n' + "  RecordId: 0x" + HexDump.toHex(this.getRecordId()) + '\n' + "  Version: 0x" + HexDump.toHex(this.getVersion()) + '\n' + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + '\n' + "  UID: 0x" + HexDump.toHex(this.field_1_UID) + '\n' + "  Uncompressed Size: " + HexDump.toHex(this.field_2_cb) + '\n' + "  Bounds: " + this.getBounds() + '\n' + "  Size in EMU: " + this.getSizeEMU() + '\n' + "  Compressed Size: " + HexDump.toHex(this.field_5_cbSave) + '\n' + "  Compression: " + HexDump.toHex(this.field_6_fCompression) + '\n' + "  Filter: " + HexDump.toHex(this.field_7_fFilter) + '\n' + "  Extra Data:" + '\n' + extraData;
   }

   public String toXml(String tab) {
      String extraData = "";
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<UID>0x").append(HexDump.toHex(this.field_1_UID)).append("</UID>\n").append(tab).append("\t").append("<UncompressedSize>0x").append(HexDump.toHex(this.field_2_cb)).append("</UncompressedSize>\n").append(tab).append("\t").append("<Bounds>").append(this.getBounds()).append("</Bounds>\n").append(tab).append("\t").append("<SizeInEMU>").append(this.getSizeEMU()).append("</SizeInEMU>\n").append(tab).append("\t").append("<CompressedSize>0x").append(HexDump.toHex(this.field_5_cbSave)).append("</CompressedSize>\n").append(tab).append("\t").append("<Compression>0x").append(HexDump.toHex(this.field_6_fCompression)).append("</Compression>\n").append(tab).append("\t").append("<Filter>0x").append(HexDump.toHex(this.field_7_fFilter)).append("</Filter>\n").append(tab).append("\t").append("<ExtraData>").append(extraData).append("</ExtraData>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

}
