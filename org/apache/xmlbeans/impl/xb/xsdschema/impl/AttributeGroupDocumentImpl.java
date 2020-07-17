package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup;

public class AttributeGroupDocumentImpl extends XmlComplexContentImpl implements AttributeGroupDocument {

   private static final QName ATTRIBUTEGROUP$0 = new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");


   public AttributeGroupDocumentImpl(SchemaType sType) {
      super(sType);
   }

   public NamedAttributeGroup getAttributeGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         NamedAttributeGroup target = null;
         target = (NamedAttributeGroup)this.get_store().find_element_user(ATTRIBUTEGROUP$0, 0);
         return target == null?null:target;
      }
   }

   public void setAttributeGroup(NamedAttributeGroup attributeGroup) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         NamedAttributeGroup target = null;
         target = (NamedAttributeGroup)this.get_store().find_element_user(ATTRIBUTEGROUP$0, 0);
         if(target == null) {
            target = (NamedAttributeGroup)this.get_store().add_element_user(ATTRIBUTEGROUP$0);
         }

         target.set(attributeGroup);
      }
   }

   public NamedAttributeGroup addNewAttributeGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         NamedAttributeGroup target = null;
         target = (NamedAttributeGroup)this.get_store().add_element_user(ATTRIBUTEGROUP$0);
         return target;
      }
   }

}
