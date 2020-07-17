package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;

public class CTNumFmtImpl extends XmlComplexContentImpl implements CTNumFmt {

   private static final QName FORMATCODE$0 = new QName("", "formatCode");
   private static final QName SOURCELINKED$2 = new QName("", "sourceLinked");


   public CTNumFmtImpl(SchemaType var1) {
      super(var1);
   }

   public String getFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATCODE$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(FORMATCODE$0);
         return var2;
      }
   }

   public void setFormatCode(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATCODE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATCODE$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormatCode(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(FORMATCODE$0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(FORMATCODE$0);
         }

         var3.set(var1);
      }
   }

   public boolean getSourceLinked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SOURCELINKED$2);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSourceLinked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SOURCELINKED$2);
         return var2;
      }
   }

   public boolean isSetSourceLinked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SOURCELINKED$2) != null;
      }
   }

   public void setSourceLinked(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SOURCELINKED$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SOURCELINKED$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSourceLinked(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SOURCELINKED$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SOURCELINKED$2);
         }

         var3.set(var1);
      }
   }

   public void unsetSourceLinked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SOURCELINKED$2);
      }
   }

}
