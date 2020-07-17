package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint;

public class CTTextSpacingImpl extends XmlComplexContentImpl implements CTTextSpacing {

   private static final QName SPCPCT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcPct");
   private static final QName SPCPTS$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcPts");


   public CTTextSpacingImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextSpacingPercent getSpcPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPercent var2 = null;
         var2 = (CTTextSpacingPercent)this.get_store().find_element_user(SPCPCT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpcPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPCPCT$0) != 0;
      }
   }

   public void setSpcPct(CTTextSpacingPercent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPercent var3 = null;
         var3 = (CTTextSpacingPercent)this.get_store().find_element_user(SPCPCT$0, 0);
         if(var3 == null) {
            var3 = (CTTextSpacingPercent)this.get_store().add_element_user(SPCPCT$0);
         }

         var3.set(var1);
      }
   }

   public CTTextSpacingPercent addNewSpcPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPercent var2 = null;
         var2 = (CTTextSpacingPercent)this.get_store().add_element_user(SPCPCT$0);
         return var2;
      }
   }

   public void unsetSpcPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPCPCT$0, 0);
      }
   }

   public CTTextSpacingPoint getSpcPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPoint var2 = null;
         var2 = (CTTextSpacingPoint)this.get_store().find_element_user(SPCPTS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpcPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPCPTS$2) != 0;
      }
   }

   public void setSpcPts(CTTextSpacingPoint var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPoint var3 = null;
         var3 = (CTTextSpacingPoint)this.get_store().find_element_user(SPCPTS$2, 0);
         if(var3 == null) {
            var3 = (CTTextSpacingPoint)this.get_store().add_element_user(SPCPTS$2);
         }

         var3.set(var1);
      }
   }

   public CTTextSpacingPoint addNewSpcPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacingPoint var2 = null;
         var2 = (CTTextSpacingPoint)this.get_store().add_element_user(SPCPTS$2);
         return var2;
      }
   }

   public void unsetSpcPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPCPTS$2, 0);
      }
   }

}
