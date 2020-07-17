package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1BlipFillList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1GradFillList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1GrpFillList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1NoFillList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1PattFillList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFillStyleListImpl.1SolidFillList;

public class CTFillStyleListImpl extends XmlComplexContentImpl implements CTFillStyleList {

   private static final QName NOFILL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");


   public CTFillStyleListImpl(SchemaType var1) {
      super(var1);
   }

   public List getNoFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NoFillList(this);
      }
   }

   public CTNoFillProperties[] getNoFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOFILL$0, var2);
         CTNoFillProperties[] var3 = new CTNoFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNoFillProperties getNoFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNoFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$0);
      }
   }

   public void setNoFillArray(CTNoFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOFILL$0);
      }
   }

   public void setNoFillArray(int var1, CTNoFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var4 = null;
         var4 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNoFillProperties insertNewNoFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().insert_element_user(NOFILL$0, var1);
         return var3;
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$0);
         return var2;
      }
   }

   public void removeNoFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$0, var1);
      }
   }

   public List getSolidFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SolidFillList(this);
      }
   }

   public CTSolidColorFillProperties[] getSolidFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SOLIDFILL$2, var2);
         CTSolidColorFillProperties[] var3 = new CTSolidColorFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSolidColorFillProperties getSolidFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSolidFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$2);
      }
   }

   public void setSolidFillArray(CTSolidColorFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SOLIDFILL$2);
      }
   }

   public void setSolidFillArray(int var1, CTSolidColorFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var4 = null;
         var4 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSolidColorFillProperties insertNewSolidFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().insert_element_user(SOLIDFILL$2, var1);
         return var3;
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$2);
         return var2;
      }
   }

   public void removeSolidFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$2, var1);
      }
   }

   public List getGradFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GradFillList(this);
      }
   }

   public CTGradientFillProperties[] getGradFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRADFILL$4, var2);
         CTGradientFillProperties[] var3 = new CTGradientFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGradientFillProperties getGradFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGradFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$4);
      }
   }

   public void setGradFillArray(CTGradientFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRADFILL$4);
      }
   }

   public void setGradFillArray(int var1, CTGradientFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var4 = null;
         var4 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGradientFillProperties insertNewGradFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().insert_element_user(GRADFILL$4, var1);
         return var3;
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$4);
         return var2;
      }
   }

   public void removeGradFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$4, var1);
      }
   }

   public List getBlipFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BlipFillList(this);
      }
   }

   public CTBlipFillProperties[] getBlipFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BLIPFILL$6, var2);
         CTBlipFillProperties[] var3 = new CTBlipFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBlipFillProperties getBlipFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBlipFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$6);
      }
   }

   public void setBlipFillArray(CTBlipFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BLIPFILL$6);
      }
   }

   public void setBlipFillArray(int var1, CTBlipFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var4 = null;
         var4 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBlipFillProperties insertNewBlipFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().insert_element_user(BLIPFILL$6, var1);
         return var3;
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$6);
         return var2;
      }
   }

   public void removeBlipFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$6, var1);
      }
   }

   public List getPattFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PattFillList(this);
      }
   }

   public CTPatternFillProperties[] getPattFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PATTFILL$8, var2);
         CTPatternFillProperties[] var3 = new CTPatternFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPatternFillProperties getPattFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPattFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$8);
      }
   }

   public void setPattFillArray(CTPatternFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PATTFILL$8);
      }
   }

   public void setPattFillArray(int var1, CTPatternFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var4 = null;
         var4 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPatternFillProperties insertNewPattFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().insert_element_user(PATTFILL$8, var1);
         return var3;
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$8);
         return var2;
      }
   }

   public void removePattFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$8, var1);
      }
   }

   public List getGrpFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GrpFillList(this);
      }
   }

   public CTGroupFillProperties[] getGrpFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRPFILL$10, var2);
         CTGroupFillProperties[] var3 = new CTGroupFillProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGroupFillProperties getGrpFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGrpFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$10);
      }
   }

   public void setGrpFillArray(CTGroupFillProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRPFILL$10);
      }
   }

   public void setGrpFillArray(int var1, CTGroupFillProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var4 = null;
         var4 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGroupFillProperties insertNewGrpFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().insert_element_user(GRPFILL$10, var1);
         return var3;
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$10);
         return var2;
      }
   }

   public void removeGrpFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$10, var1);
      }
   }

}
