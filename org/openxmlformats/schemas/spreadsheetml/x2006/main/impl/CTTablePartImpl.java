package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart;

public class CTTablePartImpl extends XmlComplexContentImpl implements CTTablePart {

   private static final QName ID$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTTablePartImpl(SchemaType var1) {
      super(var1);
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

}
