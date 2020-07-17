package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;

public class CTLocationImpl extends XmlComplexContentImpl implements CTLocation {

   private static final QName REF$0 = new QName("", "ref");
   private static final QName FIRSTHEADERROW$2 = new QName("", "firstHeaderRow");
   private static final QName FIRSTDATAROW$4 = new QName("", "firstDataRow");
   private static final QName FIRSTDATACOL$6 = new QName("", "firstDataCol");
   private static final QName ROWPAGECOUNT$8 = new QName("", "rowPageCount");
   private static final QName COLPAGECOUNT$10 = new QName("", "colPageCount");


   public CTLocationImpl(SchemaType var1) {
      super(var1);
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$0);
         return var2;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$0);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$0);
         }

         var3.set(var1);
      }
   }

   public long getFirstHeaderRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTHEADERROW$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstHeaderRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTHEADERROW$2);
         return var2;
      }
   }

   public void setFirstHeaderRow(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTHEADERROW$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTHEADERROW$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstHeaderRow(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTHEADERROW$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTHEADERROW$2);
         }

         var3.set(var1);
      }
   }

   public long getFirstDataRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTDATAROW$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstDataRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTDATAROW$4);
         return var2;
      }
   }

   public void setFirstDataRow(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTDATAROW$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTDATAROW$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstDataRow(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTDATAROW$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTDATAROW$4);
         }

         var3.set(var1);
      }
   }

   public long getFirstDataCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTDATACOL$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstDataCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTDATACOL$6);
         return var2;
      }
   }

   public void setFirstDataCol(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTDATACOL$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTDATACOL$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstDataCol(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTDATACOL$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTDATACOL$6);
         }

         var3.set(var1);
      }
   }

   public long getRowPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROWPAGECOUNT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ROWPAGECOUNT$8);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetRowPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ROWPAGECOUNT$8);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ROWPAGECOUNT$8);
         }

         return var2;
      }
   }

   public boolean isSetRowPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROWPAGECOUNT$8) != null;
      }
   }

   public void setRowPageCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ROWPAGECOUNT$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ROWPAGECOUNT$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRowPageCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ROWPAGECOUNT$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ROWPAGECOUNT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetRowPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROWPAGECOUNT$8);
      }
   }

   public long getColPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLPAGECOUNT$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COLPAGECOUNT$10);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetColPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COLPAGECOUNT$10);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COLPAGECOUNT$10);
         }

         return var2;
      }
   }

   public boolean isSetColPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLPAGECOUNT$10) != null;
      }
   }

   public void setColPageCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COLPAGECOUNT$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COLPAGECOUNT$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetColPageCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COLPAGECOUNT$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COLPAGECOUNT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetColPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLPAGECOUNT$10);
      }
   }

}
