package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;

public class CTCommentImpl extends XmlComplexContentImpl implements CTComment {

   private static final QName TEXT$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "text");
   private static final QName REF$2 = new QName("", "ref");
   private static final QName AUTHORID$4 = new QName("", "authorId");
   private static final QName GUID$6 = new QName("", "guid");


   public CTCommentImpl(SchemaType var1) {
      super(var1);
   }

   public CTRst getText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var2 = null;
         var2 = (CTRst)this.get_store().find_element_user(TEXT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setText(CTRst var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var3 = null;
         var3 = (CTRst)this.get_store().find_element_user(TEXT$0, 0);
         if(var3 == null) {
            var3 = (CTRst)this.get_store().add_element_user(TEXT$0);
         }

         var3.set(var1);
      }
   }

   public CTRst addNewText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var2 = null;
         var2 = (CTRst)this.get_store().add_element_user(TEXT$0);
         return var2;
      }
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$2);
         return var2;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$2);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$2);
         }

         var3.set(var1);
      }
   }

   public long getAuthorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTHORID$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetAuthorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTHORID$4);
         return var2;
      }
   }

   public void setAuthorId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(AUTHORID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(AUTHORID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetAuthorId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTHORID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(AUTHORID$4);
         }

         var3.set(var1);
      }
   }

   public String getGuid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GUID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGuid xgetGuid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var2 = null;
         var2 = (STGuid)this.get_store().find_attribute_user(GUID$6);
         return var2;
      }
   }

   public boolean isSetGuid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GUID$6) != null;
      }
   }

   public void setGuid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GUID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GUID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetGuid(STGuid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var3 = null;
         var3 = (STGuid)this.get_store().find_attribute_user(GUID$6);
         if(var3 == null) {
            var3 = (STGuid)this.get_store().add_attribute_user(GUID$6);
         }

         var3.set(var1);
      }
   }

   public void unsetGuid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GUID$6);
      }
   }

}
