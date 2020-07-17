package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;

public class CTNumRefImpl extends XmlComplexContentImpl implements CTNumRef {

   private static final QName F$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "f");
   private static final QName NUMCACHE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numCache");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTNumRefImpl(SchemaType var1) {
      super(var1);
   }

   public String getF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(F$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(F$0, 0);
         return var2;
      }
   }

   public void setF(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(F$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(F$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetF(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(F$0, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(F$0);
         }

         var3.set(var1);
      }
   }

   public CTNumData getNumCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().find_element_user(NUMCACHE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMCACHE$2) != 0;
      }
   }

   public void setNumCache(CTNumData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var3 = null;
         var3 = (CTNumData)this.get_store().find_element_user(NUMCACHE$2, 0);
         if(var3 == null) {
            var3 = (CTNumData)this.get_store().add_element_user(NUMCACHE$2);
         }

         var3.set(var1);
      }
   }

   public CTNumData addNewNumCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().add_element_user(NUMCACHE$2);
         return var2;
      }
   }

   public void unsetNumCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMCACHE$2, 0);
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
