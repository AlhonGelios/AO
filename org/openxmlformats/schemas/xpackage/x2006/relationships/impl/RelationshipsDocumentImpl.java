package org.openxmlformats.schemas.xpackage.x2006.relationships.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationships;
import org.openxmlformats.schemas.xpackage.x2006.relationships.RelationshipsDocument;

public class RelationshipsDocumentImpl extends XmlComplexContentImpl implements RelationshipsDocument {

   private static final QName RELATIONSHIPS$0 = new QName("http://schemas.openxmlformats.org/package/2006/relationships", "Relationships");


   public RelationshipsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTRelationships getRelationships() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationships var2 = null;
         var2 = (CTRelationships)this.get_store().find_element_user(RELATIONSHIPS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setRelationships(CTRelationships var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationships var3 = null;
         var3 = (CTRelationships)this.get_store().find_element_user(RELATIONSHIPS$0, 0);
         if(var3 == null) {
            var3 = (CTRelationships)this.get_store().add_element_user(RELATIONSHIPS$0);
         }

         var3.set(var1);
      }
   }

   public CTRelationships addNewRelationships() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationships var2 = null;
         var2 = (CTRelationships)this.get_store().add_element_user(RELATIONSHIPS$0);
         return var2;
      }
   }

}
