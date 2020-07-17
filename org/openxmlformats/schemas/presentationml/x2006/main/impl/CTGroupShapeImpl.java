package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;

public class CTGroupShapeImpl extends XmlComplexContentImpl implements CTGroupShape {

   private static final QName NVGRPSPPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvGrpSpPr");
   private static final QName GRPSPPR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "grpSpPr");
   private static final QName SP$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sp");
   private static final QName GRPSP$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "grpSp");
   private static final QName GRAPHICFRAME$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "graphicFrame");
   private static final QName CXNSP$10 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cxnSp");
   private static final QName PIC$12 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "pic");
   private static final QName EXTLST$14 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


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
         final class SpList extends AbstractList {

            public CTShape get(int var1) {
               return CTGroupShapeImpl.this.getSpArray(var1);
            }

            public CTShape set(int var1, CTShape var2) {
               CTShape var3 = CTGroupShapeImpl.this.getSpArray(var1);
               CTGroupShapeImpl.this.setSpArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTShape var2) {
               CTGroupShapeImpl.this.insertNewSp(var1).set(var2);
            }

            public CTShape remove(int var1) {
               CTShape var2 = CTGroupShapeImpl.this.getSpArray(var1);
               CTGroupShapeImpl.this.removeSp(var1);
               return var2;
            }

            public int size() {
               return CTGroupShapeImpl.this.sizeOfSpArray();
            }
         }

         return new SpList();
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
         final class GrpSpList extends AbstractList {

            public CTGroupShape get(int var1) {
               return CTGroupShapeImpl.this.getGrpSpArray(var1);
            }

            public CTGroupShape set(int var1, CTGroupShape var2) {
               CTGroupShape var3 = CTGroupShapeImpl.this.getGrpSpArray(var1);
               CTGroupShapeImpl.this.setGrpSpArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTGroupShape var2) {
               CTGroupShapeImpl.this.insertNewGrpSp(var1).set(var2);
            }

            public CTGroupShape remove(int var1) {
               CTGroupShape var2 = CTGroupShapeImpl.this.getGrpSpArray(var1);
               CTGroupShapeImpl.this.removeGrpSp(var1);
               return var2;
            }

            public int size() {
               return CTGroupShapeImpl.this.sizeOfGrpSpArray();
            }
         }

         return new GrpSpList();
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
         final class GraphicFrameList extends AbstractList {

            public CTGraphicalObjectFrame get(int var1) {
               return CTGroupShapeImpl.this.getGraphicFrameArray(var1);
            }

            public CTGraphicalObjectFrame set(int var1, CTGraphicalObjectFrame var2) {
               CTGraphicalObjectFrame var3 = CTGroupShapeImpl.this.getGraphicFrameArray(var1);
               CTGroupShapeImpl.this.setGraphicFrameArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTGraphicalObjectFrame var2) {
               CTGroupShapeImpl.this.insertNewGraphicFrame(var1).set(var2);
            }

            public CTGraphicalObjectFrame remove(int var1) {
               CTGraphicalObjectFrame var2 = CTGroupShapeImpl.this.getGraphicFrameArray(var1);
               CTGroupShapeImpl.this.removeGraphicFrame(var1);
               return var2;
            }

            public int size() {
               return CTGroupShapeImpl.this.sizeOfGraphicFrameArray();
            }
         }

         return new GraphicFrameList();
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
         final class CxnSpList extends AbstractList {

            public CTConnector get(int var1) {
               return CTGroupShapeImpl.this.getCxnSpArray(var1);
            }

            public CTConnector set(int var1, CTConnector var2) {
               CTConnector var3 = CTGroupShapeImpl.this.getCxnSpArray(var1);
               CTGroupShapeImpl.this.setCxnSpArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTConnector var2) {
               CTGroupShapeImpl.this.insertNewCxnSp(var1).set(var2);
            }

            public CTConnector remove(int var1) {
               CTConnector var2 = CTGroupShapeImpl.this.getCxnSpArray(var1);
               CTGroupShapeImpl.this.removeCxnSp(var1);
               return var2;
            }

            public int size() {
               return CTGroupShapeImpl.this.sizeOfCxnSpArray();
            }
         }

         return new CxnSpList();
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
         final class PicList extends AbstractList {

            public CTPicture get(int var1) {
               return CTGroupShapeImpl.this.getPicArray(var1);
            }

            public CTPicture set(int var1, CTPicture var2) {
               CTPicture var3 = CTGroupShapeImpl.this.getPicArray(var1);
               CTGroupShapeImpl.this.setPicArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTPicture var2) {
               CTGroupShapeImpl.this.insertNewPic(var1).set(var2);
            }

            public CTPicture remove(int var1) {
               CTPicture var2 = CTGroupShapeImpl.this.getPicArray(var1);
               CTGroupShapeImpl.this.removePic(var1);
               return var2;
            }

            public int size() {
               return CTGroupShapeImpl.this.sizeOfPicArray();
            }
         }

         return new PicList();
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

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$14) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$14, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$14);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$14, 0);
      }
   }

}
