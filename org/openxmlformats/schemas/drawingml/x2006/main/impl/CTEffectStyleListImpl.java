package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTEffectStyleListImpl.1EffectStyleList;

public class CTEffectStyleListImpl extends XmlComplexContentImpl implements CTEffectStyleList {

   private static final QName EFFECTSTYLE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectStyle");


   public CTEffectStyleListImpl(SchemaType var1) {
      super(var1);
   }

   public List getEffectStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EffectStyleList(this);
      }
   }

   public CTEffectStyleItem[] getEffectStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EFFECTSTYLE$0, var2);
         CTEffectStyleItem[] var3 = new CTEffectStyleItem[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEffectStyleItem getEffectStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleItem var3 = null;
         var3 = (CTEffectStyleItem)this.get_store().find_element_user(EFFECTSTYLE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEffectStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTSTYLE$0);
      }
   }

   public void setEffectStyleArray(CTEffectStyleItem[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EFFECTSTYLE$0);
      }
   }

   public void setEffectStyleArray(int var1, CTEffectStyleItem var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleItem var4 = null;
         var4 = (CTEffectStyleItem)this.get_store().find_element_user(EFFECTSTYLE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEffectStyleItem insertNewEffectStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleItem var3 = null;
         var3 = (CTEffectStyleItem)this.get_store().insert_element_user(EFFECTSTYLE$0, var1);
         return var3;
      }
   }

   public CTEffectStyleItem addNewEffectStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleItem var2 = null;
         var2 = (CTEffectStyleItem)this.get_store().add_element_user(EFFECTSTYLE$0);
         return var2;
      }
   }

   public void removeEffectStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTSTYLE$0, var1);
      }
   }

}
