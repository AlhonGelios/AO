package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.JavaStringHolderEx;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipReference;

public class CTRelationshipReferenceImpl extends JavaStringHolderEx implements CTRelationshipReference {

   private static final QName SOURCEID$0 = new QName("", "SourceId");


   public CTRelationshipReferenceImpl(SchemaType var1) {
      super(var1, true);
   }

   protected CTRelationshipReferenceImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }

   public String getSourceId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SOURCEID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSourceId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SOURCEID$0);
         return var2;
      }
   }

   public void setSourceId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SOURCEID$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SOURCEID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSourceId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SOURCEID$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SOURCEID$0);
         }

         var3.set(var1);
      }
   }

}
