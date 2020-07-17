package org.apache.poi.hssf.usermodel;

import org.apache.poi.ddf.EscherBoolProperty;
import org.apache.poi.ddf.EscherClientDataRecord;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.ddf.EscherSpRecord;
import org.apache.poi.hssf.record.CommonObjectDataSubRecord;
import org.apache.poi.hssf.record.EndSubRecord;
import org.apache.poi.hssf.record.FtCblsSubRecord;
import org.apache.poi.hssf.record.LbsDataSubRecord;
import org.apache.poi.hssf.record.ObjRecord;
import org.apache.poi.hssf.record.TextObjectRecord;
import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSimpleShape;
import org.apache.poi.ss.usermodel.ClientAnchor;

public class HSSFCombobox extends HSSFSimpleShape {

   public HSSFCombobox(EscherContainerRecord spContainer, ObjRecord objRecord) {
      super(spContainer, objRecord);
   }

   public HSSFCombobox(HSSFShape parent, HSSFAnchor anchor) {
      super(parent, anchor);
      super.setShapeType(201);
      CommonObjectDataSubRecord cod = (CommonObjectDataSubRecord)this.getObjRecord().getSubRecords().get(0);
      cod.setObjectType((short)20);
   }

   protected TextObjectRecord createTextObjRecord() {
      return null;
   }

   protected EscherContainerRecord createSpContainer() {
      EscherContainerRecord spContainer = new EscherContainerRecord();
      EscherSpRecord sp = new EscherSpRecord();
      EscherOptRecord opt = new EscherOptRecord();
      EscherClientDataRecord clientData = new EscherClientDataRecord();
      spContainer.setRecordId((short)-4092);
      spContainer.setOptions((short)15);
      sp.setRecordId((short)-4086);
      sp.setOptions((short)3218);
      sp.setFlags(2560);
      opt.setRecordId((short)-4085);
      opt.addEscherProperty(new EscherBoolProperty((short)127, 17039620));
      opt.addEscherProperty(new EscherBoolProperty((short)191, 524296));
      opt.addEscherProperty(new EscherBoolProperty((short)511, 524288));
      opt.addEscherProperty(new EscherSimpleProperty((short)959, 131072));
      HSSFClientAnchor userAnchor = (HSSFClientAnchor)this.getAnchor();
      userAnchor.setAnchorType(ClientAnchor.AnchorType.DONT_MOVE_DO_RESIZE);
      EscherRecord anchor = userAnchor.getEscherAnchor();
      clientData.setRecordId((short)-4079);
      clientData.setOptions((short)0);
      spContainer.addChildRecord(sp);
      spContainer.addChildRecord(opt);
      spContainer.addChildRecord(anchor);
      spContainer.addChildRecord(clientData);
      return spContainer;
   }

   protected ObjRecord createObjRecord() {
      ObjRecord obj = new ObjRecord();
      CommonObjectDataSubRecord c = new CommonObjectDataSubRecord();
      c.setObjectType((short)201);
      c.setLocked(true);
      c.setPrintable(false);
      c.setAutofill(true);
      c.setAutoline(false);
      FtCblsSubRecord f = new FtCblsSubRecord();
      LbsDataSubRecord l = LbsDataSubRecord.newAutoFilterInstance();
      EndSubRecord e = new EndSubRecord();
      obj.addSubRecord(c);
      obj.addSubRecord(f);
      obj.addSubRecord(l);
      obj.addSubRecord(e);
      return obj;
   }

   public void setShapeType(int shapeType) {
      throw new IllegalStateException("Shape type can not be changed in " + this.getClass().getSimpleName());
   }
}
