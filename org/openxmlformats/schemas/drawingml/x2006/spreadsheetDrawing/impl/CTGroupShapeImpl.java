package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTGroupShapeImpl.1CxnSpList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTGroupShapeImpl.1GraphicFrameList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTGroupShapeImpl.1GrpSpList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTGroupShapeImpl.1PicList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTGroupShapeImpl.1SpList;

public class CTGroupShapeImpl extends XmlComplexContentImpl implements CTGroupShape {

   private static final QName NVGRPSPPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "nvGrpSpPr");
   private static final QName GRPSPPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSpPr");
   private static final QName SP$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "sp");
   private static final QName GRPSP$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSp");
   private static final QName GRAPHICFRAME$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "graphicFrame");
   private static final QName CXNSP$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cxnSp");
   private static final QName PIC$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "pic");


   public CTGroupShapeImpl(SchemaType var1) {
      super(var1);
   }

   public CTGroupShapeNonVisual getNvGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeNonVisual var2 = null;
         var2 = (CTGroupShapeNonVisual)this.get_store().find_element_user(NVGRPSPPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvGrpSpPr(CTGroupShapeNonVisual var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeNonVisual var3 = null;
         var3 = (CTGroupShapeNonVisual)this.get_store().find_element_user(NVGRPSPPR$0, 0);
         if(var3 == null) {
            var3 = (CTGroupShapeNonVisual)this.get_store().add_element_user(NVGRPSPPR$0);
         }

         var3.set(var1);
      }
   }

   public CTGroupShapeNonVisual addNewNvGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeNonVisual var2 = null;
         var2 = (CTGroupShapeNonVisual)this.get_store().add_element_user(NVGRPSPPR$0);
         return var2;
      }
   }

   public CTGroupShapeProperties getGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeProperties var2 = null;
         var2 = (CTGroupShapeProperties)this.get_store().find_element_user(GRPSPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGrpSpPr(CTGroupShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeProperties var3 = null;
         var3 = (CTGroupShapeProperties)this.get_store().find_element_user(GRPSPPR$2, 0);
         if(var3 == null) {
            var3 = (CTGroupShapeProperties)this.get_store().add_element_user(GRPSPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTGroupShapeProperties addNewGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShapeProperties var2 = null;
         var2 = (CTGroupShapeProperties)this.get_store().add_element_user(GRPSPPR$2);
         return var2;
      }
   }

   public List getSpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SpList(this);
      }
   }

   public CTShape[] getSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SP$4, var2);
         CTShape[] var3 = new CTShape[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTShape getSpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var3 = null;
         var3 = (CTShape)this.get_store().find_element_user(SP$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SP$4);
      }
   }

   public void setSpArray(CTShape[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SP$4);
      }
   }

   public void setSpArray(int var1, CTShape var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var4 = null;
         var4 = (CTShape)this.get_store().find_element_user(SP$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTShape insertNewSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var3 = null;
         var3 = (CTShape)this.get_store().insert_element_user(SP$4, var1);
         return var3;
      }
   }

   public CTShape addNewSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var2 = null;
         var2 = (CTShape)this.get_store().add_element_user(SP$4);
         return var2;
      }
   }

   public void removeSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SP$4, var1);
      }
   }

   public List getGrpSpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GrpSpList(this);
      }
   }

   public CTGroupShape[] getGrpSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRPSP$6, var2);
         CTGroupShape[] var3 = new CTGroupShape[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGroupShape getGrpSpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var3 = null;
         var3 = (CTGroupShape)this.get_store().find_element_user(GRPSP$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGrpSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPSP$6);
      }
   }

   public void setGrpSpArray(CTGroupShape[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRPSP$6);
      }
   }

   public void setGrpSpArray(int var1, CTGroupShape var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var4 = null;
         var4 = (CTGroupShape)this.get_store().find_element_user(GRPSP$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGroupShape insertNewGrpSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var3 = null;
         var3 = (CTGroupShape)this.get_store().insert_element_user(GRPSP$6, var1);
         return var3;
      }
   }

   public CTGroupShape addNewGrpSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var2 = null;
         var2 = (CTGroupShape)this.get_store().add_element_user(GRPSP$6);
         return var2;
      }
   }

   public void removeGrpSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPSP$6, var1);
      }
   }

   public List getGraphicFrameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GraphicFrameList(this);
      }
   }

   public CTGraphicalObjectFrame[] getGraphicFrameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRAPHICFRAME$8, var2);
         CTGraphicalObjectFrame[] var3 = new CTGraphicalObjectFrame[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGraphicalObjectFrame getGraphicFrameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var3 = null;
         var3 = (CTGraphicalObjectFrame)this.get_store().find_element_user(GRAPHICFRAME$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGraphicFrameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRAPHICFRAME$8);
      }
   }

   public void setGraphicFrameArray(CTGraphicalObjectFrame[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRAPHICFRAME$8);
      }
   }

   public void setGraphicFrameArray(int var1, CTGraphicalObjectFrame var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var4 = null;
         var4 = (CTGraphicalObjectFrame)this.get_store().find_element_user(GRAPHICFRAME$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGraphicalObjectFrame insertNewGraphicFrame(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var3 = null;
         var3 = (CTGraphicalObjectFrame)this.get_store().insert_element_user(GRAPHICFRAME$8, var1);
         return var3;
      }
   }

   public CTGraphicalObjectFrame addNewGraphicFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var2 = null;
         var2 = (CTGraphicalObjectFrame)this.get_store().add_element_user(GRAPHICFRAME$8);
         return var2;
      }
   }

   public void removeGraphicFrame(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRAPHICFRAME$8, var1);
      }
   }

   public List getCxnSpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CxnSpList(this);
      }
   }

   public CTConnector[] getCxnSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CXNSP$10, var2);
         CTConnector[] var3 = new CTConnector[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTConnector getCxnSpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var3 = null;
         var3 = (CTConnector)this.get_store().find_element_user(CXNSP$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCxnSpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CXNSP$10);
      }
   }

   public void setCxnSpArray(CTConnector[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CXNSP$10);
      }
   }

   public void setCxnSpArray(int var1, CTConnector var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var4 = null;
         var4 = (CTConnector)this.get_store().find_element_user(CXNSP$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTConnector insertNewCxnSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var3 = null;
         var3 = (CTConnector)this.get_store().insert_element_user(CXNSP$10, var1);
         return var3;
      }
   }

   public CTConnector addNewCxnSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var2 = null;
         var2 = (CTConnector)this.get_store().add_element_user(CXNSP$10);
         return var2;
      }
   }

   public void removeCxnSp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CXNSP$10, var1);
      }
   }

   public List getPicList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PicList(this);
      }
   }

   public CTPicture[] getPicArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PIC$12, var2);
         CTPicture[] var3 = new CTPicture[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPicture getPicArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().find_element_user(PIC$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPicArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIC$12);
      }
   }

   public void setPicArray(CTPicture[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PIC$12);
      }
   }

   public void setPicArray(int var1, CTPicture var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var4 = null;
         var4 = (CTPicture)this.get_store().find_element_user(PIC$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPicture insertNewPic(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().insert_element_user(PIC$12, var1);
         return var3;
      }
   }

   public CTPicture addNewPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().add_element_user(PIC$12);
         return var2;
      }
   }

   public void removePic(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIC$12, var1);
      }
   }

}
