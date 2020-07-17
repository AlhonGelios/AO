package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTLineStyleListImpl.1LnList;

public class CTLineStyleListImpl extends XmlComplexContentImpl implements CTLineStyleList {

   private static final QName LN$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");


   public CTLineStyleListImpl(SchemaType var1) {
      super(var1);
   }

   public List getLnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LnList(this);
      }
   }

   public CTLineProperties[] getLnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LN$0, var2);
         CTLineProperties[] var3 = new CTLineProperties[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLineProperties getLnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LN$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LN$0);
      }
   }

   public void setLnArray(CTLineProperties[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LN$0);
      }
   }

   public void setLnArray(int var1, CTLineProperties var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var4 = null;
         var4 = (CTLineProperties)this.get_store().find_element_user(LN$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLineProperties insertNewLn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().insert_element_user(LN$0, var1);
         return var3;
      }
   }

   public CTLineProperties addNewLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LN$0);
         return var2;
      }
   }

   public void removeLn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LN$0, var1);
      }
   }

}
