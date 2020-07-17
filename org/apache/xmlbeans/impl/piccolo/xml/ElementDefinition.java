package org.apache.xmlbeans.impl.piccolo.xml;

import java.util.HashMap;
import java.util.Map;
import org.apache.xmlbeans.impl.piccolo.util.DuplicateKeyException;
import org.apache.xmlbeans.impl.piccolo.util.IndexedObject;
import org.apache.xmlbeans.impl.piccolo.util.IndexedObjectImpl;
import org.apache.xmlbeans.impl.piccolo.xml.AttributeDefinition;

public final class ElementDefinition {

   String name;
   AttributeDefinition[] attributes;
   Map attributeMap;
   int size;


   public ElementDefinition() {
      this((String)null);
   }

   public ElementDefinition(String name) {
      this.size = 0;
      this.name = name;
      this.attributes = new AttributeDefinition[4];
      this.attributeMap = new HashMap();
      this.size = 0;
   }

   public final String getName() {
      return this.name;
   }

   public final void setName(String name) {
      this.name = name;
   }

   public final AttributeDefinition[] getAttributes() {
      return this.attributes;
   }

   public final int getAttributeCount() {
      return this.size;
   }

   public final IndexedObject getIndexedAttribute(String name) {
      return (IndexedObject)this.attributeMap.get(name);
   }

   public final AttributeDefinition getAttribute(int index) {
      return this.attributes[index];
   }

   public final void addAttribute(AttributeDefinition attrib) throws DuplicateKeyException {
      IndexedObjectImpl newObj = new IndexedObjectImpl(this.size, attrib);
      Object oldObj = this.attributeMap.put(attrib.getQName(), newObj);
      if(oldObj != null) {
         this.attributeMap.put(attrib.getQName(), oldObj);
         throw new DuplicateKeyException("attribute \'" + attrib.getQName() + "\' is already defined for element \'" + this.name + "\'.");
      } else {
         if(this.size >= this.attributes.length) {
            AttributeDefinition[] newAttributes = new AttributeDefinition[this.size * 2];
            System.arraycopy(this.attributes, 0, newAttributes, 0, this.size);
            this.attributes = newAttributes;
         }

         this.attributes[this.size++] = attrib;
      }
   }
}
