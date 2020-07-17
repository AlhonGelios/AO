package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.office.STInsetMode;
import com.microsoft.schemas.office.office.STTrueFalse;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.vml.CTTextbox;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent;

public class CTTextboxImpl extends XmlComplexContentImpl implements CTTextbox {

   private static final QName TXBXCONTENT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "txbxContent");
   private static final QName ID$2 = new QName("", "id");
   private static final QName STYLE$4 = new QName("", "style");
   private static final QName INSET$6 = new QName("", "inset");
   private static final QName SINGLECLICK$8 = new QName("urn:schemas-microsoft-com:office:office", "singleclick");
   private static final QName INSETMODE$10 = new QName("urn:schemas-microsoft-com:office:office", "insetmode");


   public CTTextboxImpl(SchemaType var1) {
      super(var1);
   }

   public CTTxbxContent getTxbxContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTxbxContent var2 = null;
         var2 = (CTTxbxContent)this.get_store().find_element_user(TXBXCONTENT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxbxContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXBXCONTENT$0) != 0;
      }
   }

   public void setTxbxContent(CTTxbxContent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTxbxContent var3 = null;
         var3 = (CTTxbxContent)this.get_store().find_element_user(TXBXCONTENT$0, 0);
         if(var3 == null) {
            var3 = (CTTxbxContent)this.get_store().add_element_user(TXBXCONTENT$0);
         }

         var3.set(var1);
      }
   }

   public CTTxbxContent addNewTxbxContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTxbxContent var2 = null;
         var2 = (CTTxbxContent)this.get_store().add_element_user(TXBXCONTENT$0);
         return var2;
      }
   }

   public void unsetTxbxContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXBXCONTENT$0, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$2) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$2);
      }
   }

   public String getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STYLE$4);
         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$4) != null;
      }
   }

   public void setStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLE$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STYLE$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STYLE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$4);
      }
   }

   public String getInset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSET$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetInset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(INSET$6);
         return var2;
      }
   }

   public boolean isSetInset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSET$6) != null;
      }
   }

   public void setInset(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSET$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSET$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetInset(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(INSET$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(INSET$6);
         }

         var3.set(var1);
      }
   }

   public void unsetInset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSET$6);
      }
   }

   public STTrueFalse$Enum getSingleclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SINGLECLICK$8);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetSingleclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(SINGLECLICK$8);
         return var2;
      }
   }

   public boolean isSetSingleclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SINGLECLICK$8) != null;
      }
   }

   public void setSingleclick(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SINGLECLICK$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SINGLECLICK$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSingleclick(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(SINGLECLICK$8);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(SINGLECLICK$8);
         }

         var3.set(var1);
      }
   }

   public void unsetSingleclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SINGLECLICK$8);
      }
   }

   public STInsetMode.Enum getInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSETMODE$10);
         }

         return var2 == null?null:(STInsetMode.Enum)var2.getEnumValue();
      }
   }

   public STInsetMode xgetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var2 = null;
         var2 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$10);
         if(var2 == null) {
            var2 = (STInsetMode)this.get_default_attribute_value(INSETMODE$10);
         }

         return var2;
      }
   }

   public boolean isSetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETMODE$10) != null;
      }
   }

   public void setInsetmode(STInsetMode.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETMODE$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetmode(STInsetMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var3 = null;
         var3 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$10);
         if(var3 == null) {
            var3 = (STInsetMode)this.get_store().add_attribute_user(INSETMODE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETMODE$10);
      }
   }

}
