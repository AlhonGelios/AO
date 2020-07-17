package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTComment;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.presentationml.x2006.main.impl.CTCommentListImpl.1CmList;

public class CTCommentListImpl extends XmlComplexContentImpl implements CTCommentList {

   private static final QName CM$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cm");


   public CTCommentListImpl(SchemaType var1) {
      super(var1);
   }

   public List getCmList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CmList(this);
      }
   }

   public CTComment[] getCmArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CM$0, var2);
         CTComment[] var3 = new CTComment[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTComment getCmArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var3 = null;
         var3 = (CTComment)this.get_store().find_element_user(CM$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCmArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CM$0);
      }
   }

   public void setCmArray(CTComment[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CM$0);
      }
   }

   public void setCmArray(int var1, CTComment var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var4 = null;
         var4 = (CTComment)this.get_store().find_element_user(CM$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTComment insertNewCm(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var3 = null;
         var3 = (CTComment)this.get_store().insert_element_user(CM$0, var1);
         return var3;
      }
   }

   public CTComment addNewCm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var2 = null;
         var2 = (CTComment)this.get_store().add_element_user(CM$0);
         return var2;
      }
   }

   public void removeCm(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CM$0, var1);
      }
   }

}
