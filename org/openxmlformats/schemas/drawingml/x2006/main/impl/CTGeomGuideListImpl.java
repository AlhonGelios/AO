package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTGeomGuideListImpl.1GdList;

public class CTGeomGuideListImpl extends XmlComplexContentImpl implements CTGeomGuideList {

   private static final QName GD$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gd");


   public CTGeomGuideListImpl(SchemaType var1) {
      super(var1);
   }

   public List getGdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GdList(this);
      }
   }

   public CTGeomGuide[] getGdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GD$0, var2);
         CTGeomGuide[] var3 = new CTGeomGuide[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGeomGuide getGdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuide var3 = null;
         var3 = (CTGeomGuide)this.get_store().find_element_user(GD$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GD$0);
      }
   }

   public void setGdArray(CTGeomGuide[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GD$0);
      }
   }

   public void setGdArray(int var1, CTGeomGuide var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuide var4 = null;
         var4 = (CTGeomGuide)this.get_store().find_element_user(GD$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGeomGuide insertNewGd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuide var3 = null;
         var3 = (CTGeomGuide)this.get_store().insert_element_user(GD$0, var1);
         return var3;
      }
   }

   public CTGeomGuide addNewGd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuide var2 = null;
         var2 = (CTGeomGuide)this.get_store().add_element_user(GD$0);
         return var2;
      }
   }

   public void removeGd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GD$0, var1);
      }
   }

}
