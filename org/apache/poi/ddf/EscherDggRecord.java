package org.apache.poi.ddf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.RecordFormatException;

public final class EscherDggRecord extends EscherRecord {

   public static final short RECORD_ID = -4090;
   public static final String RECORD_DESCRIPTION = "MsofbtDgg";
   private int field_1_shapeIdMax;
   private int field_3_numShapesSaved;
   private int field_4_drawingsSaved;
   private EscherDggRecord.FileIdCluster[] field_5_fileIdClusters;
   private int maxDgId;
   private static final Comparator MY_COMP = new Comparator() {
      public int compare(EscherDggRecord.FileIdCluster f1, EscherDggRecord.FileIdCluster f2) {
         return f1.getDrawingGroupId() == f2.getDrawingGroupId()?0:(f1.getDrawingGroupId() < f2.getDrawingGroupId()?-1:1);
      }
   };


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      int pos = offset + 8;
      byte size = 0;
      this.field_1_shapeIdMax = LittleEndian.getInt(data, pos + size);
      int var8 = size + 4;
      var8 += 4;
      this.field_3_numShapesSaved = LittleEndian.getInt(data, pos + var8);
      var8 += 4;
      this.field_4_drawingsSaved = LittleEndian.getInt(data, pos + var8);
      var8 += 4;
      this.field_5_fileIdClusters = new EscherDggRecord.FileIdCluster[(bytesRemaining - var8) / 8];

      for(int i = 0; i < this.field_5_fileIdClusters.length; ++i) {
         this.field_5_fileIdClusters[i] = new EscherDggRecord.FileIdCluster(LittleEndian.getInt(data, pos + var8), LittleEndian.getInt(data, pos + var8 + 4));
         this.maxDgId = Math.max(this.maxDgId, this.field_5_fileIdClusters[i].getDrawingGroupId());
         var8 += 8;
      }

      bytesRemaining -= var8;
      if(bytesRemaining != 0) {
         throw new RecordFormatException("Expecting no remaining data but got " + bytesRemaining + " byte(s).");
      } else {
         return 8 + var8 + bytesRemaining;
      }
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      int pos = offset + 2;
      LittleEndian.putShort(data, pos, this.getRecordId());
      pos += 2;
      int remainingBytes = this.getRecordSize() - 8;
      LittleEndian.putInt(data, pos, remainingBytes);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_1_shapeIdMax);
      pos += 4;
      LittleEndian.putInt(data, pos, this.getNumIdClusters());
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_numShapesSaved);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_4_drawingsSaved);
      pos += 4;

      for(int i = 0; i < this.field_5_fileIdClusters.length; ++i) {
         LittleEndian.putInt(data, pos, this.field_5_fileIdClusters[i].field_1_drawingGroupId);
         pos += 4;
         LittleEndian.putInt(data, pos, this.field_5_fileIdClusters[i].field_2_numShapeIdsUsed);
         pos += 4;
      }

      listener.afterRecordSerialize(pos, this.getRecordId(), this.getRecordSize(), this);
      return this.getRecordSize();
   }

   public int getRecordSize() {
      return 24 + 8 * this.field_5_fileIdClusters.length;
   }

   public short getRecordId() {
      return (short)-4090;
   }

   public String getRecordName() {
      return "Dgg";
   }

   public String toString() {
      StringBuilder field_5_string = new StringBuilder();
      if(this.field_5_fileIdClusters != null) {
         for(int i = 0; i < this.field_5_fileIdClusters.length; ++i) {
            field_5_string.append("  DrawingGroupId").append(i + 1).append(": ");
            field_5_string.append(this.field_5_fileIdClusters[i].field_1_drawingGroupId);
            field_5_string.append('\n');
            field_5_string.append("  NumShapeIdsUsed").append(i + 1).append(": ");
            field_5_string.append(this.field_5_fileIdClusters[i].field_2_numShapeIdsUsed);
            field_5_string.append('\n');
         }
      }

      return this.getClass().getName() + ":" + '\n' + "  RecordId: 0x" + HexDump.toHex((short)-4090) + '\n' + "  Version: 0x" + HexDump.toHex(this.getVersion()) + '\n' + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + '\n' + "  ShapeIdMax: " + this.field_1_shapeIdMax + '\n' + "  NumIdClusters: " + this.getNumIdClusters() + '\n' + "  NumShapesSaved: " + this.field_3_numShapesSaved + '\n' + "  DrawingsSaved: " + this.field_4_drawingsSaved + '\n' + "" + field_5_string.toString();
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<ShapeIdMax>").append(this.field_1_shapeIdMax).append("</ShapeIdMax>\n").append(tab).append("\t").append("<NumIdClusters>").append(this.getNumIdClusters()).append("</NumIdClusters>\n").append(tab).append("\t").append("<NumShapesSaved>").append(this.field_3_numShapesSaved).append("</NumShapesSaved>\n").append(tab).append("\t").append("<DrawingsSaved>").append(this.field_4_drawingsSaved).append("</DrawingsSaved>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   public int getShapeIdMax() {
      return this.field_1_shapeIdMax;
   }

   public void setShapeIdMax(int shapeIdMax) {
      this.field_1_shapeIdMax = shapeIdMax;
   }

   public int getNumIdClusters() {
      return this.field_5_fileIdClusters == null?0:this.field_5_fileIdClusters.length + 1;
   }

   public int getNumShapesSaved() {
      return this.field_3_numShapesSaved;
   }

   public void setNumShapesSaved(int numShapesSaved) {
      this.field_3_numShapesSaved = numShapesSaved;
   }

   public int getDrawingsSaved() {
      return this.field_4_drawingsSaved;
   }

   public void setDrawingsSaved(int drawingsSaved) {
      this.field_4_drawingsSaved = drawingsSaved;
   }

   public int getMaxDrawingGroupId() {
      return this.maxDgId;
   }

   public void setMaxDrawingGroupId(int id) {
      this.maxDgId = id;
   }

   public EscherDggRecord.FileIdCluster[] getFileIdClusters() {
      return this.field_5_fileIdClusters;
   }

   public void setFileIdClusters(EscherDggRecord.FileIdCluster[] fileIdClusters) {
      this.field_5_fileIdClusters = (EscherDggRecord.FileIdCluster[])fileIdClusters.clone();
   }

   public void addCluster(int dgId, int numShapedUsed) {
      this.addCluster(dgId, numShapedUsed, true);
   }

   public void addCluster(int dgId, int numShapedUsed, boolean sort) {
      ArrayList clusters = new ArrayList(Arrays.asList(this.field_5_fileIdClusters));
      clusters.add(new EscherDggRecord.FileIdCluster(dgId, numShapedUsed));
      if(sort) {
         Collections.sort(clusters, MY_COMP);
      }

      this.maxDgId = Math.min(this.maxDgId, dgId);
      this.field_5_fileIdClusters = (EscherDggRecord.FileIdCluster[])clusters.toArray(new EscherDggRecord.FileIdCluster[clusters.size()]);
   }


   public static class FileIdCluster {

      private int field_1_drawingGroupId;
      private int field_2_numShapeIdsUsed;


      public FileIdCluster(int drawingGroupId, int numShapeIdsUsed) {
         this.field_1_drawingGroupId = drawingGroupId;
         this.field_2_numShapeIdsUsed = numShapeIdsUsed;
      }

      public int getDrawingGroupId() {
         return this.field_1_drawingGroupId;
      }

      public int getNumShapeIdsUsed() {
         return this.field_2_numShapeIdsUsed;
      }

      public void incrementShapeId() {
         ++this.field_2_numShapeIdsUsed;
      }
   }
}
