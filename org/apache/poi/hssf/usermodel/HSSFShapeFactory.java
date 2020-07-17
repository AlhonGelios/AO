package org.apache.poi.hssf.usermodel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.ddf.EscherClientDataRecord;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherProperty;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.record.CommonObjectDataSubRecord;
import org.apache.poi.hssf.record.EmbeddedObjectRefSubRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.record.ObjRecord;
import org.apache.poi.hssf.record.SubRecord;
import org.apache.poi.hssf.record.TextObjectRecord;
import org.apache.poi.hssf.usermodel.HSSFCombobox;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFObjectData;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPolygon;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFShapeContainer;
import org.apache.poi.hssf.usermodel.HSSFShapeGroup;
import org.apache.poi.hssf.usermodel.HSSFSimpleShape;
import org.apache.poi.hssf.usermodel.HSSFTextbox;
import org.apache.poi.poifs.filesystem.DirectoryNode;

public class HSSFShapeFactory {

   public static void createShapeTree(EscherContainerRecord container, EscherAggregate agg, HSSFShapeContainer out, DirectoryNode root) {
      if(container.getRecordId() == -4093) {
         ObjRecord shapeToObj = null;
         EscherClientDataRecord objRecord = (EscherClientDataRecord)((EscherContainerRecord)container.getChild(0)).getChildById((short)-4079);
         if(null != objRecord) {
            shapeToObj = (ObjRecord)agg.getShapeToObjMapping().get(objRecord);
         }

         HSSFShapeGroup txtRecord = new HSSFShapeGroup(container, shapeToObj);
         List cmo = container.getChildContainers();

         for(int shape = 0; shape < cmo.size(); ++shape) {
            EscherContainerRecord optRecord = (EscherContainerRecord)cmo.get(shape);
            if(shape != 0) {
               createShapeTree(optRecord, agg, txtRecord, root);
            }
         }

         out.addShape(txtRecord);
      } else if(container.getRecordId() == -4092) {
         Map var11 = agg.getShapeToObjMapping();
         ObjRecord var12 = null;
         TextObjectRecord var13 = null;
         Iterator var14 = container.getChildRecords().iterator();

         while(var14.hasNext()) {
            EscherRecord var17 = (EscherRecord)var14.next();
            switch(var17.getRecordId()) {
            case -4083:
               var13 = (TextObjectRecord)var11.get(var17);
               break;
            case -4079:
               var12 = (ObjRecord)var11.get(var17);
            }
         }

         if(isEmbeddedObject(var12)) {
            HSSFObjectData var16 = new HSSFObjectData(container, var12, root);
            out.addShape(var16);
            return;
         }

         CommonObjectDataSubRecord var15 = (CommonObjectDataSubRecord)var12.getSubRecords().get(0);
         Object var18;
         switch(var15.getObjectType()) {
         case 1:
            var18 = new HSSFSimpleShape(container, var12);
            break;
         case 2:
            var18 = new HSSFSimpleShape(container, var12, var13);
            break;
         case 6:
            var18 = new HSSFTextbox(container, var12, var13);
            break;
         case 8:
            var18 = new HSSFPicture(container, var12);
            break;
         case 20:
            var18 = new HSSFCombobox(container, var12);
            break;
         case 25:
            var18 = new HSSFComment(container, var12, var13, agg.getNoteRecordByObj(var12));
            break;
         case 30:
            EscherOptRecord var19 = (EscherOptRecord)container.getChildById((short)-4085);
            if(var19 == null) {
               var18 = new HSSFSimpleShape(container, var12, var13);
            } else {
               EscherProperty property = var19.lookup(325);
               if(null != property) {
                  var18 = new HSSFPolygon(container, var12, var13);
               } else {
                  var18 = new HSSFSimpleShape(container, var12, var13);
               }
            }
            break;
         default:
            var18 = new HSSFSimpleShape(container, var12, var13);
         }

         out.addShape((HSSFShape)var18);
      }

   }

   private static boolean isEmbeddedObject(ObjRecord obj) {
      Iterator subRecordIter = obj.getSubRecords().iterator();

      SubRecord sub;
      do {
         if(!subRecordIter.hasNext()) {
            return false;
         }

         sub = (SubRecord)subRecordIter.next();
      } while(!(sub instanceof EmbeddedObjectRefSubRecord));

      return true;
   }
}
