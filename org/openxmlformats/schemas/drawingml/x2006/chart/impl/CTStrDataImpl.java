package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTStrDataImpl.1PtList;

public class CTStrDataImpl extends XmlComplexContentImpl implements CTStrData {

   private static final QName PTCOUNT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ptCount");
   private static final QName PT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pt");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTStrDataImpl(SchemaType var1) {
      super(var1);
   }

   public CTUnsignedInt getPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(PTCOUNT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PTCOUNT$0) != 0;
      }
   }

   public void setPtCount(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(PTCOUNT$0, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(PTCOUNT$0);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(PTCOUNT$0);
         return var2;
      }
   }

   public void unsetPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PTCOUNT$0, 0);
      }
   }

   public List getPtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PtList(this);
      }
   }

   public CTStrVal[] getPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PT$2, var2);
         CTStrVal[] var3 = new CTStrVal[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTStrVal getPtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrVal var3 = null;
         var3 = (CTStrVal)this.get_store().find_element_user(PT$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PT$2);
      }
   }

   public void setPtArray(CTStrVal[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PT$2);
      }
   }

   public void setPtArray(int var1, CTStrVal var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrVal var4 = null;
         var4 = (CTStrVal)this.get_store().find_element_user(PT$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTStrVal insertNewPt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrVal var3 = null;
         var3 = (CTStrVal)this.get_store().insert_element_user(PT$2, var1);
         return var3;
      }
   }

   public CTStrVal addNewPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrVal var2 = null;
         var2 = (CTStrVal)this.get_store().add_element_user(PT$2);
         return var2;
      }
   }

   public void removePt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PT$2, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

}
