package org.openxmlformats.schemas.xpackage.x2006.relationships.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationship;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationships;

public class CTRelationshipsImpl extends XmlComplexContentImpl implements CTRelationships {

   private static final QName RELATIONSHIP$0 = new QName("http://schemas.openxmlformats.org/package/2006/relationships", "Relationship");


   public CTRelationshipsImpl(SchemaType var1) {
      super(var1);
   }

   public List getRelationshipList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class RelationshipList extends AbstractList {

            public CTRelationship get(int var1) {
               return CTRelationshipsImpl.this.getRelationshipArray(var1);
            }

            public CTRelationship set(int var1, CTRelationship var2) {
               CTRelationship var3 = CTRelationshipsImpl.this.getRelationshipArray(var1);
               CTRelationshipsImpl.this.setRelationshipArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTRelationship var2) {
               CTRelationshipsImpl.this.insertNewRelationship(var1).set(var2);
            }

            public CTRelationship remove(int var1) {
               CTRelationship var2 = CTRelationshipsImpl.this.getRelationshipArray(var1);
               CTRelationshipsImpl.this.removeRelationship(var1);
               return var2;
            }

            public int size() {
               return CTRelationshipsImpl.this.sizeOfRelationshipArray();
            }
         }

         return new RelationshipList();
      }
   }

   public CTRelationship[] getRelationshipArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RELATIONSHIP$0, var2);
         CTRelationship[] var3 = new CTRelationship[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRelationship getRelationshipArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationship var3 = null;
         var3 = (CTRelationship)this.get_store().find_element_user(RELATIONSHIP$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRelationshipArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RELATIONSHIP$0);
      }
   }

   public void setRelationshipArray(CTRelationship[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RELATIONSHIP$0);
      }
   }

   public void setRelationshipArray(int var1, CTRelationship var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationship var4 = null;
         var4 = (CTRelationship)this.get_store().find_element_user(RELATIONSHIP$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRelationship insertNewRelationship(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationship var3 = null;
         var3 = (CTRelationship)this.get_store().insert_element_user(RELATIONSHIP$0, var1);
         return var3;
      }
   }

   public CTRelationship addNewRelationship() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationship var2 = null;
         var2 = (CTRelationship)this.get_store().add_element_user(RELATIONSHIP$0);
         return var2;
      }
   }

   public void removeRelationship(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RELATIONSHIP$0, var1);
      }
   }

}
