package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSmartTagPrImpl.1AttrList;

public class CTSmartTagPrImpl extends XmlComplexContentImpl implements CTSmartTagPr {

   private static final QName ATTR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attr");


   public CTSmartTagPrImpl(SchemaType var1) {
      super(var1);
   }

   public List getAttrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttrList(this);
      }
   }

   public CTAttr[] getAttrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTR$0, var2);
         CTAttr[] var3 = new CTAttr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAttr getAttrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAttr var3 = null;
         var3 = (CTAttr)this.get_store().find_element_user(ATTR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTR$0);
      }
   }

   public void setAttrArray(CTAttr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTR$0);
      }
   }

   public void setAttrArray(int var1, CTAttr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAttr var4 = null;
         var4 = (CTAttr)this.get_store().find_element_user(ATTR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAttr insertNewAttr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAttr var3 = null;
         var3 = (CTAttr)this.get_store().insert_element_user(ATTR$0, var1);
         return var3;
      }
   }

   public CTAttr addNewAttr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAttr var2 = null;
         var2 = (CTAttr)this.get_store().add_element_user(ATTR$0);
         return var2;
      }
   }

   public void removeAttr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTR$0, var1);
      }
   }

}
