package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.STName;

public class CTCommentAuthorImpl extends XmlComplexContentImpl implements CTCommentAuthor {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName ID$2 = new QName("", "id");
   private static final QName NAME$4 = new QName("", "name");
   private static final QName INITIALS$6 = new QName("", "initials");
   private static final QName LASTIDX$8 = new QName("", "lastIdx");
   private static final QName CLRIDX$10 = new QName("", "clrIdx");


   public CTCommentAuthorImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STName xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STName var2 = null;
         var2 = (STName)this.get_store().find_attribute_user(NAME$4);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STName var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STName var3 = null;
         var3 = (STName)this.get_store().find_attribute_user(NAME$4);
         if(var3 == null) {
            var3 = (STName)this.get_store().add_attribute_user(NAME$4);
         }

         var3.set(var1);
      }
   }

   public String getInitials() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INITIALS$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STName xgetInitials() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STName var2 = null;
         var2 = (STName)this.get_store().find_attribute_user(INITIALS$6);
         return var2;
      }
   }

   public void setInitials(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INITIALS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INITIALS$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetInitials(STName var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STName var3 = null;
         var3 = (STName)this.get_store().find_attribute_user(INITIALS$6);
         if(var3 == null) {
            var3 = (STName)this.get_store().add_attribute_user(INITIALS$6);
         }

         var3.set(var1);
      }
   }

   public long getLastIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LASTIDX$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetLastIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(LASTIDX$8);
         return var2;
      }
   }

   public void setLastIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(LASTIDX$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(LASTIDX$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetLastIdx(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(LASTIDX$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(LASTIDX$8);
         }

         var3.set(var1);
      }
   }

   public long getClrIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLRIDX$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetClrIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CLRIDX$10);
         return var2;
      }
   }

   public void setClrIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CLRIDX$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CLRIDX$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetClrIdx(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CLRIDX$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CLRIDX$10);
         }

         var3.set(var1);
      }
   }

}
