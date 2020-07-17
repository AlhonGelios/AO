package org.apache.poi.hssf.model;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherDggRecord;

public class DrawingManager2 {

   EscherDggRecord dgg;
   List drawingGroups = new ArrayList();


   public DrawingManager2(EscherDggRecord dgg) {
      this.dgg = dgg;
   }

   public void clearDrawingGroups() {
      this.drawingGroups.clear();
   }

   public EscherDgRecord createDgRecord() {
      EscherDgRecord dg = new EscherDgRecord();
      dg.setRecordId((short)-4088);
      short dgId = this.findNewDrawingGroupId();
      dg.setOptions((short)(dgId << 4));
      dg.setNumShapes(0);
      dg.setLastMSOSPID(-1);
      this.drawingGroups.add(dg);
      this.dgg.addCluster(dgId, 0);
      this.dgg.setDrawingsSaved(this.dgg.getDrawingsSaved() + 1);
      return dg;
   }

   public int allocateShapeId(short drawingGroupId) {
      EscherDgRecord dg = this.getDrawingGroup(drawingGroupId);
      return this.allocateShapeId(drawingGroupId, dg);
   }

   public int allocateShapeId(short drawingGroupId, EscherDgRecord dg) {
      this.dgg.setNumShapesSaved(this.dgg.getNumShapesSaved() + 1);

      int result;
      for(result = 0; result < this.dgg.getFileIdClusters().length; ++result) {
         EscherDggRecord.FileIdCluster c = this.dgg.getFileIdClusters()[result];
         if(c.getDrawingGroupId() == drawingGroupId && c.getNumShapeIdsUsed() != 1024) {
            int result1 = c.getNumShapeIdsUsed() + 1024 * (result + 1);
            c.incrementShapeId();
            dg.setNumShapes(dg.getNumShapes() + 1);
            dg.setLastMSOSPID(result1);
            if(result1 >= this.dgg.getShapeIdMax()) {
               this.dgg.setShapeIdMax(result1 + 1);
            }

            return result1;
         }
      }

      this.dgg.addCluster(drawingGroupId, 0);
      this.dgg.getFileIdClusters()[this.dgg.getFileIdClusters().length - 1].incrementShapeId();
      dg.setNumShapes(dg.getNumShapes() + 1);
      result = 1024 * this.dgg.getFileIdClusters().length;
      dg.setLastMSOSPID(result);
      if(result >= this.dgg.getShapeIdMax()) {
         this.dgg.setShapeIdMax(result + 1);
      }

      return result;
   }

   public short findNewDrawingGroupId() {
      short dgId;
      for(dgId = 1; this.drawingGroupExists(dgId); ++dgId) {
         ;
      }

      return dgId;
   }

   EscherDgRecord getDrawingGroup(int drawingGroupId) {
      return (EscherDgRecord)this.drawingGroups.get(drawingGroupId - 1);
   }

   boolean drawingGroupExists(short dgId) {
      for(int i = 0; i < this.dgg.getFileIdClusters().length; ++i) {
         if(this.dgg.getFileIdClusters()[i].getDrawingGroupId() == dgId) {
            return true;
         }
      }

      return false;
   }

   int findFreeSPIDBlock() {
      int max = this.dgg.getShapeIdMax();
      int next = (max / 1024 + 1) * 1024;
      return next;
   }

   public EscherDggRecord getDgg() {
      return this.dgg;
   }

   public void incrementDrawingsSaved() {
      this.dgg.setDrawingsSaved(this.dgg.getDrawingsSaved() + 1);
   }
}
