package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTNumFmtImpl extends XmlComplexContentImpl implements CTNumFmt {

   private static final QName NUMFMTID$0 = new QName("", "numFmtId");
   private static final QName FORMATCODE$2 = new QName("", "formatCode");


   public CTNumFmtImpl(SchemaType var1) {
      super(var1);
   }

   public long getNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STNumFmtId xgetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var2 = null;
         var2 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$0);
         return var2;
      }
   }

   public void setNumFmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(NUMFMTID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetNumFmtId(STNumFmtId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var3 = null;
         var3 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$0);
         if(var3 == null) {
            var3 = (STNumFmtId)this.get_store().add_attribute_user(NUMFMTID$0);
         }

         var3.set(var1);
      }
   }

   public String getFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATCODE$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(FORMATCODE$2);
         return var2;
      }
   }

   public void setFormatCode(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATCODE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATCODE$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormatCode(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(FORMATCODE$2);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(FORMATCODE$2);
         }

         var3.set(var1);
      }
   }

}
