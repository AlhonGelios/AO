package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.STDirection;
import org.openxmlformats.schemas.presentationml.x2006.main.STDirection$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType;

public class CTPlaceholderImpl extends XmlComplexContentImpl implements CTPlaceholder {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName TYPE$2 = new QName("", "type");
   private static final QName ORIENT$4 = new QName("", "orient");
   private static final QName SZ$6 = new QName("", "sz");
   private static final QName IDX$8 = new QName("", "idx");
   private static final QName HASCUSTOMPROMPT$10 = new QName("", "hasCustomPrompt");


   public CTPlaceholderImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public STPlaceholderType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TYPE$2);
         }

         return var2 == null?null:(STPlaceholderType.Enum)var2.getEnumValue();
      }
   }

   public STPlaceholderType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPlaceholderType var2 = null;
         var2 = (STPlaceholderType)this.get_store().find_attribute_user(TYPE$2);
         if(var2 == null) {
            var2 = (STPlaceholderType)this.get_default_attribute_value(TYPE$2);
         }

         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$2) != null;
      }
   }

   public void setType(STPlaceholderType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STPlaceholderType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPlaceholderType var3 = null;
         var3 = (STPlaceholderType)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (STPlaceholderType)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$2);
      }
   }

   public STDirection$Enum getOrient() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIENT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ORIENT$4);
         }

         return var2 == null?null:(STDirection$Enum)var2.getEnumValue();
      }
   }

   public STDirection xgetOrient() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDirection var2 = null;
         var2 = (STDirection)this.get_store().find_attribute_user(ORIENT$4);
         if(var2 == null) {
            var2 = (STDirection)this.get_default_attribute_value(ORIENT$4);
         }

         return var2;
      }
   }

   public boolean isSetOrient() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIENT$4) != null;
      }
   }

   public void setOrient(STDirection$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ORIENT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ORIENT$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOrient(STDirection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDirection var3 = null;
         var3 = (STDirection)this.get_store().find_attribute_user(ORIENT$4);
         if(var3 == null) {
            var3 = (STDirection)this.get_store().add_attribute_user(ORIENT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetOrient() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIENT$4);
      }
   }

   public STPlaceholderSize$Enum getSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SZ$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SZ$6);
         }

         return var2 == null?null:(STPlaceholderSize$Enum)var2.getEnumValue();
      }
   }

   public STPlaceholderSize xgetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPlaceholderSize var2 = null;
         var2 = (STPlaceholderSize)this.get_store().find_attribute_user(SZ$6);
         if(var2 == null) {
            var2 = (STPlaceholderSize)this.get_default_attribute_value(SZ$6);
         }

         return var2;
      }
   }

   public boolean isSetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SZ$6) != null;
      }
   }

   public void setSz(STPlaceholderSize$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SZ$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SZ$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSz(STPlaceholderSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPlaceholderSize var3 = null;
         var3 = (STPlaceholderSize)this.get_store().find_attribute_user(SZ$6);
         if(var3 == null) {
            var3 = (STPlaceholderSize)this.get_store().add_attribute_user(SZ$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SZ$6);
      }
   }

   public long getIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IDX$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(IDX$8);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$8);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(IDX$8);
         }

         return var2;
      }
   }

   public boolean isSetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IDX$8) != null;
      }
   }

   public void setIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(IDX$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(IDX$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIdx(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(IDX$8);
         }

         var3.set(var1);
      }
   }

   public void unsetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IDX$8);
      }
   }

   public boolean getHasCustomPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HASCUSTOMPROMPT$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HASCUSTOMPROMPT$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHasCustomPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HASCUSTOMPROMPT$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HASCUSTOMPROMPT$10);
         }

         return var2;
      }
   }

   public boolean isSetHasCustomPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HASCUSTOMPROMPT$10) != null;
      }
   }

   public void setHasCustomPrompt(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HASCUSTOMPROMPT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HASCUSTOMPROMPT$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHasCustomPrompt(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HASCUSTOMPROMPT$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HASCUSTOMPROMPT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetHasCustomPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HASCUSTOMPROMPT$10);
      }
   }

}
