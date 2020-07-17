package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;

public class CTTableColImpl extends XmlComplexContentImpl implements CTTableCol {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName W$2 = new QName("", "w");


   public CTTableColImpl(SchemaType var1) {
      super(var1);
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public long getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_attribute_user(W$2);
         return var2;
      }
   }

   public void setW(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(W$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(W$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetW(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_attribute_user(W$2);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_attribute_user(W$2);
         }

         var3.set(var1);
      }
   }

}
