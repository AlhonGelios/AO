package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob;

public class CTDigSigBlobImpl extends XmlComplexContentImpl implements CTDigSigBlob {

   private static final QName BLOB$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "blob");


   public CTDigSigBlobImpl(SchemaType var1) {
      super(var1);
   }

   public byte[] getBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BLOB$0, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(BLOB$0, 0);
         return var2;
      }
   }

   public void setBlob(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BLOB$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BLOB$0);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetBlob(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(BLOB$0, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(BLOB$0);
         }

         var3.set(var1);
      }
   }

}
