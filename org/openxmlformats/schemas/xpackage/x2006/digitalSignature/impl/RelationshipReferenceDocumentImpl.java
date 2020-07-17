package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipReference;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.RelationshipReferenceDocument;

public class RelationshipReferenceDocumentImpl extends XmlComplexContentImpl implements RelationshipReferenceDocument {

   private static final QName RELATIONSHIPREFERENCE$0 = new QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "RelationshipReference");


   public RelationshipReferenceDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTRelationshipReference getRelationshipReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationshipReference var2 = null;
         var2 = (CTRelationshipReference)this.get_store().find_element_user(RELATIONSHIPREFERENCE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setRelationshipReference(CTRelationshipReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationshipReference var3 = null;
         var3 = (CTRelationshipReference)this.get_store().find_element_user(RELATIONSHIPREFERENCE$0, 0);
         if(var3 == null) {
            var3 = (CTRelationshipReference)this.get_store().add_element_user(RELATIONSHIPREFERENCE$0);
         }

         var3.set(var1);
      }
   }

   public CTRelationshipReference addNewRelationshipReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelationshipReference var2 = null;
         var2 = (CTRelationshipReference)this.get_store().add_element_user(RELATIONSHIPREFERENCE$0);
         return var2;
      }
   }

}
