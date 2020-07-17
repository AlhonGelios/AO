package org.apache.poi.hssf.model;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherDggRecord;

@Deprecated
public class DrawingManager {

   EscherDggRecord dgg;
   Map dgMap = new HashMap();


   public DrawingManager(EscherDggRecord dgg) {
      this.dgg = dgg;
   }

   public EscherDgRecord createDgRecord() {
      EscherDgRecord dg = new EscherDgRecord();
      dg.setRecordId((short)-4088);
      short dgId = this.findNewDrawingGroupId();
      dg.setOptions((short)(dgId << 4));
      dg.setNumShapes(0);
      dg.setLastMSOSPID(-1);
      this.dgg.addCluster(dgId, 0);
      this.dgg.setDrawingsSaved(this.dgg.getDrawingsSaved() + 1);
      this.dgMap.put(Short.valueOf(dgId), dg);
      return dg;
   }

   public int allocateShapeId(short drawingGroupId) {
      EscherDgRecord dg = (EscherDgRecord)this.dgMap.get(Short.valueOf(drawingGroupId));
      int lastShapeId = dg.getLastMSOSPID();
      int newShapeId = 0;
      if(lastShapeId % 1024 == 1023) {
         newShapeId = this.findFreeSPIDBlock();
         this.dgg.addCluster(drawingGroupId, 1);
      } else {
         for(int i = 0; i < this.dgg.getFileIdClusters().length; ++i) {
            EscherDggRecord.FileIdCluster c = this.dgg.getFileIdClusters()[i];
            if(c.getDrawingGroupId() == drawingGroupId && c.getNumShapeIdsUsed() != 1024) {
               c.incrementShapeId();
            }

            if(dg.getLastMSOSPID() == -1) {
               newShapeId = this.findFreeSPIDBlock();
            } else {
               newShapeId = dg.getLastMSOSPID() + 1;
            }
         }
      }

      this.dgg.setNumShapesSaved(this.dgg.getNumShapesSaved() + 1);
      if(newShapeId >= this.dgg.getShapeIdMax()) {
         this.dgg.setShapeIdMax(newShapeId + 1);
      }

      dg.setLastMSOSPID(newShapeId);
      dg.incrementShapeCount();
      return newShapeId;
   }

   short findNewDrawingGroupId() {
      short dgId;
      for(dgId = 1; this.drawingGroupExists(dgId); ++dgId) {
         ;
      }

      return dgId;
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
}
