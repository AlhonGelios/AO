package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTAdjustHandleListImpl.1AhPolarList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTAdjustHandleListImpl.1AhXYList;

public class CTAdjustHandleListImpl extends XmlComplexContentImpl implements CTAdjustHandleList {

   private static final QName AHXY$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahXY");
   private static final QName AHPOLAR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahPolar");


   public CTAdjustHandleListImpl(SchemaType var1) {
      super(var1);
   }

   public List getAhXYList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AhXYList(this);
      }
   }

   public CTXYAdjustHandle[] getAhXYArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AHXY$0, var2);
         CTXYAdjustHandle[] var3 = new CTXYAdjustHandle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTXYAdjustHandle getAhXYArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXYAdjustHandle var3 = null;
         var3 = (CTXYAdjustHandle)this.get_store().find_element_user(AHXY$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAhXYArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AHXY$0);
      }
   }

   public void setAhXYArray(CTXYAdjustHandle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AHXY$0);
      }
   }

   public void setAhXYArray(int var1, CTXYAdjustHandle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXYAdjustHandle var4 = null;
         var4 = (CTXYAdjustHandle)this.get_store().find_element_user(AHXY$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTXYAdjustHandle insertNewAhXY(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXYAdjustHandle var3 = null;
         var3 = (CTXYAdjustHandle)this.get_store().insert_element_user(AHXY$0, var1);
         return var3;
      }
   }

   public CTXYAdjustHandle addNewAhXY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXYAdjustHandle var2 = null;
         var2 = (CTXYAdjustHandle)this.get_store().add_element_user(AHXY$0);
         return var2;
      }
   }

   public void removeAhXY(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AHXY$0, var1);
      }
   }

   public List getAhPolarList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AhPolarList(this);
      }
   }

   public CTPolarAdjustHandle[] getAhPolarArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AHPOLAR$2, var2);
         CTPolarAdjustHandle[] var3 = new CTPolarAdjustHandle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPolarAdjustHandle getAhPolarArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolarAdjustHandle var3 = null;
         var3 = (CTPolarAdjustHandle)this.get_store().find_element_user(AHPOLAR$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAhPolarArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AHPOLAR$2);
      }
   }

   public void setAhPolarArray(CTPolarAdjustHandle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AHPOLAR$2);
      }
   }

   public void setAhPolarArray(int var1, CTPolarAdjustHandle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolarAdjustHandle var4 = null;
         var4 = (CTPolarAdjustHandle)this.get_store().find_element_user(AHPOLAR$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPolarAdjustHandle insertNewAhPolar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolarAdjustHandle var3 = null;
         var3 = (CTPolarAdjustHandle)this.get_store().insert_element_user(AHPOLAR$2, var1);
         return var3;
      }
   }

   public CTPolarAdjustHandle addNewAhPolar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolarAdjustHandle var2 = null;
         var2 = (CTPolarAdjustHandle)this.get_store().add_element_user(AHPOLAR$2);
         return var2;
      }
   }

   public void removeAhPolar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AHPOLAR$2, var1);
      }
   }

}
