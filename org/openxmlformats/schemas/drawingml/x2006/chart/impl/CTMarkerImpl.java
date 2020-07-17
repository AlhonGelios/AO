package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerSize;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;

public class CTMarkerImpl extends XmlComplexContentImpl implements CTMarker {

   private static final QName SYMBOL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "symbol");
   private static final QName SIZE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "size");
   private static final QName SPPR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTMarkerImpl(SchemaType var1) {
      super(var1);
   }

   public CTMarkerStyle getSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerStyle var2 = null;
         var2 = (CTMarkerStyle)this.get_store().find_element_user(SYMBOL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SYMBOL$0) != 0;
      }
   }

   public void setSymbol(CTMarkerStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerStyle var3 = null;
         var3 = (CTMarkerStyle)this.get_store().find_element_user(SYMBOL$0, 0);
         if(var3 == null) {
            var3 = (CTMarkerStyle)this.get_store().add_element_user(SYMBOL$0);
         }

         var3.set(var1);
      }
   }

   public CTMarkerStyle addNewSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerStyle var2 = null;
         var2 = (CTMarkerStyle)this.get_store().add_element_user(SYMBOL$0);
         return var2;
      }
   }

   public void unsetSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SYMBOL$0, 0);
      }
   }

   public CTMarkerSize getSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerSize var2 = null;
         var2 = (CTMarkerSize)this.get_store().find_element_user(SIZE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIZE$2) != 0;
      }
   }

   public void setSize(CTMarkerSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerSize var3 = null;
         var3 = (CTMarkerSize)this.get_store().find_element_user(SIZE$2, 0);
         if(var3 == null) {
            var3 = (CTMarkerSize)this.get_store().add_element_user(SIZE$2);
         }

         var3.set(var1);
      }
   }

   public CTMarkerSize addNewSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkerSize var2 = null;
         var2 = (CTMarkerSize)this.get_store().add_element_user(SIZE$2);
         return var2;
      }
   }

   public void unsetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIZE$2, 0);
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$4) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$4, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$4);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$4);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$4, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
