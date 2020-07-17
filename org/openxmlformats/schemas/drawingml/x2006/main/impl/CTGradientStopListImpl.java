package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTGradientStopListImpl.1GsList;

public class CTGradientStopListImpl extends XmlComplexContentImpl implements CTGradientStopList {

   private static final QName GS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gs");


   public CTGradientStopListImpl(SchemaType var1) {
      super(var1);
   }

   public List getGsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GsList(this);
      }
   }

   public CTGradientStop[] getGsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GS$0, var2);
         CTGradientStop[] var3 = new CTGradientStop[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGradientStop getGsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStop var3 = null;
         var3 = (CTGradientStop)this.get_store().find_element_user(GS$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GS$0);
      }
   }

   public void setGsArray(CTGradientStop[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GS$0);
      }
   }

   public void setGsArray(int var1, CTGradientStop var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStop var4 = null;
         var4 = (CTGradientStop)this.get_store().find_element_user(GS$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGradientStop insertNewGs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStop var3 = null;
         var3 = (CTGradientStop)this.get_store().insert_element_user(GS$0, var1);
         return var3;
      }
   }

   public CTGradientStop addNewGs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStop var2 = null;
         var2 = (CTGradientStop)this.get_store().add_element_user(GS$0);
         return var2;
      }
   }

   public void removeGs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GS$0, var1);
      }
   }

}
