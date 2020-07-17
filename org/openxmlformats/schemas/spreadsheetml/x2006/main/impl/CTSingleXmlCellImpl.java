package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlCellPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;

public class CTSingleXmlCellImpl extends XmlComplexContentImpl implements CTSingleXmlCell {

   private static final QName XMLCELLPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xmlCellPr");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName ID$4 = new QName("", "id");
   private static final QName R$6 = new QName("", "r");
   private static final QName CONNECTIONID$8 = new QName("", "connectionId");


   public CTSingleXmlCellImpl(SchemaType var1) {
      super(var1);
   }

   public CTXmlCellPr getXmlCellPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlCellPr var2 = null;
         var2 = (CTXmlCellPr)this.get_store().find_element_user(XMLCELLPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setXmlCellPr(CTXmlCellPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlCellPr var3 = null;
         var3 = (CTXmlCellPr)this.get_store().find_element_user(XMLCELLPR$0, 0);
         if(var3 == null) {
            var3 = (CTXmlCellPr)this.get_store().add_element_user(XMLCELLPR$0);
         }

         var3.set(var1);
      }
   }

   public CTXmlCellPr addNewXmlCellPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlCellPr var2 = null;
         var2 = (CTXmlCellPr)this.get_store().add_element_user(XMLCELLPR$0);
         return var2;
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public String getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(R$6);
         return var2;
      }
   }

   public void setR(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetR(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(R$6);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(R$6);
         }

         var3.set(var1);
      }
   }

   public long getConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$8);
         return var2;
      }
   }

   public void setConnectionId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CONNECTIONID$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetConnectionId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CONNECTIONID$8);
         }

         var3.set(var1);
      }
   }

}
