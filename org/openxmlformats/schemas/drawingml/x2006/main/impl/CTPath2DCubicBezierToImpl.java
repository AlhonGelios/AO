package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DCubicBezierToImpl.1PtList;

public class CTPath2DCubicBezierToImpl extends XmlComplexContentImpl implements CTPath2DCubicBezierTo {

   private static final QName PT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pt");


   public CTPath2DCubicBezierToImpl(SchemaType var1) {
      super(var1);
   }

   public List getPtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PtList(this);
      }
   }

   public CTAdjPoint2D[] getPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PT$0, var2);
         CTAdjPoint2D[] var3 = new CTAdjPoint2D[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAdjPoint2D getPtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var3 = null;
         var3 = (CTAdjPoint2D)this.get_store().find_element_user(PT$0, var1);
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
         return this.get_store().count_elements(PT$0);
      }
   }

   public void setPtArray(CTAdjPoint2D[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PT$0);
      }
   }

   public void setPtArray(int var1, CTAdjPoint2D var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var4 = null;
         var4 = (CTAdjPoint2D)this.get_store().find_element_user(PT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAdjPoint2D insertNewPt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var3 = null;
         var3 = (CTAdjPoint2D)this.get_store().insert_element_user(PT$0, var1);
         return var3;
      }
   }

   public CTAdjPoint2D addNewPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var2 = null;
         var2 = (CTAdjPoint2D)this.get_store().add_element_user(PT$0);
         return var2;
      }
   }

   public void removePt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PT$0, var1);
      }
   }

}
