package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;

public class CTAxDataSourceImpl extends XmlComplexContentImpl implements CTAxDataSource {

   private static final QName MULTILVLSTRREF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "multiLvlStrRef");
   private static final QName NUMREF$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numRef");
   private static final QName NUMLIT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numLit");
   private static final QName STRREF$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
   private static final QName STRLIT$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strLit");


   public CTAxDataSourceImpl(SchemaType var1) {
      super(var1);
   }

   public CTMultiLvlStrRef getMultiLvlStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLvlStrRef var2 = null;
         var2 = (CTMultiLvlStrRef)this.get_store().find_element_user(MULTILVLSTRREF$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMultiLvlStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MULTILVLSTRREF$0) != 0;
      }
   }

   public void setMultiLvlStrRef(CTMultiLvlStrRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLvlStrRef var3 = null;
         var3 = (CTMultiLvlStrRef)this.get_store().find_element_user(MULTILVLSTRREF$0, 0);
         if(var3 == null) {
            var3 = (CTMultiLvlStrRef)this.get_store().add_element_user(MULTILVLSTRREF$0);
         }

         var3.set(var1);
      }
   }

   public CTMultiLvlStrRef addNewMultiLvlStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLvlStrRef var2 = null;
         var2 = (CTMultiLvlStrRef)this.get_store().add_element_user(MULTILVLSTRREF$0);
         return var2;
      }
   }

   public void unsetMultiLvlStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MULTILVLSTRREF$0, 0);
      }
   }

   public CTNumRef getNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var2 = null;
         var2 = (CTNumRef)this.get_store().find_element_user(NUMREF$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMREF$2) != 0;
      }
   }

   public void setNumRef(CTNumRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var3 = null;
         var3 = (CTNumRef)this.get_store().find_element_user(NUMREF$2, 0);
         if(var3 == null) {
            var3 = (CTNumRef)this.get_store().add_element_user(NUMREF$2);
         }

         var3.set(var1);
      }
   }

   public CTNumRef addNewNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var2 = null;
         var2 = (CTNumRef)this.get_store().add_element_user(NUMREF$2);
         return var2;
      }
   }

   public void unsetNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMREF$2, 0);
      }
   }

   public CTNumData getNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().find_element_user(NUMLIT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMLIT$4) != 0;
      }
   }

   public void setNumLit(CTNumData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var3 = null;
         var3 = (CTNumData)this.get_store().find_element_user(NUMLIT$4, 0);
         if(var3 == null) {
            var3 = (CTNumData)this.get_store().add_element_user(NUMLIT$4);
         }

         var3.set(var1);
      }
   }

   public CTNumData addNewNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().add_element_user(NUMLIT$4);
         return var2;
      }
   }

   public void unsetNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMLIT$4, 0);
      }
   }

   public CTStrRef getStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var2 = null;
         var2 = (CTStrRef)this.get_store().find_element_user(STRREF$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRREF$6) != 0;
      }
   }

   public void setStrRef(CTStrRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var3 = null;
         var3 = (CTStrRef)this.get_store().find_element_user(STRREF$6, 0);
         if(var3 == null) {
            var3 = (CTStrRef)this.get_store().add_element_user(STRREF$6);
         }

         var3.set(var1);
      }
   }

   public CTStrRef addNewStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var2 = null;
         var2 = (CTStrRef)this.get_store().add_element_user(STRREF$6);
         return var2;
      }
   }

   public void unsetStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRREF$6, 0);
      }
   }

   public CTStrData getStrLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrData var2 = null;
         var2 = (CTStrData)this.get_store().find_element_user(STRLIT$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStrLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRLIT$8) != 0;
      }
   }

   public void setStrLit(CTStrData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrData var3 = null;
         var3 = (CTStrData)this.get_store().find_element_user(STRLIT$8, 0);
         if(var3 == null) {
            var3 = (CTStrData)this.get_store().add_element_user(STRLIT$8);
         }

         var3.set(var1);
      }
   }

   public CTStrData addNewStrLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrData var2 = null;
         var2 = (CTStrData)this.get_store().add_element_user(STRLIT$8);
         return var2;
      }
   }

   public void unsetStrLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRLIT$8, 0);
      }
   }

}
