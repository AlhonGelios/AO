package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId;

public class CTNonVisualDrawingPropsImpl extends XmlComplexContentImpl implements CTNonVisualDrawingProps {

   private static final QName HLINKCLICK$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkClick");
   private static final QName HLINKHOVER$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkHover");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName ID$6 = new QName("", "id");
   private static final QName NAME$8 = new QName("", "name");
   private static final QName DESCR$10 = new QName("", "descr");
   private static final QName HIDDEN$12 = new QName("", "hidden");


   public CTNonVisualDrawingPropsImpl(SchemaType var1) {
      super(var1);
   }

   public CTHyperlink getHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().find_element_user(HLINKCLICK$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HLINKCLICK$0) != 0;
      }
   }

   public void setHlinkClick(CTHyperlink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HLINKCLICK$0, 0);
         if(var3 == null) {
            var3 = (CTHyperlink)this.get_store().add_element_user(HLINKCLICK$0);
         }

         var3.set(var1);
      }
   }

   public CTHyperlink addNewHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HLINKCLICK$0);
         return var2;
      }
   }

   public void unsetHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HLINKCLICK$0, 0);
      }
   }

   public CTHyperlink getHlinkHover() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().find_element_user(HLINKHOVER$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHlinkHover() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HLINKHOVER$2) != 0;
      }
   }

   public void setHlinkHover(CTHyperlink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HLINKHOVER$2, 0);
         if(var3 == null) {
            var3 = (CTHyperlink)this.get_store().add_element_user(HLINKHOVER$2);
         }

         var3.set(var1);
      }
   }

   public CTHyperlink addNewHlinkHover() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HLINKHOVER$2);
         return var2;
      }
   }

   public void unsetHlinkHover() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HLINKHOVER$2, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDrawingElementId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDrawingElementId var2 = null;
         var2 = (STDrawingElementId)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(STDrawingElementId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDrawingElementId var3 = null;
         var3 = (STDrawingElementId)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (STDrawingElementId)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$8);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$8);
         }

         var3.set(var1);
      }
   }

   public String getDescr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DESCR$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DESCR$10);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetDescr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(DESCR$10);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(DESCR$10);
         }

         return var2;
      }
   }

   public boolean isSetDescr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DESCR$10) != null;
      }
   }

   public void setDescr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DESCR$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DESCR$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDescr(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(DESCR$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(DESCR$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDescr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DESCR$10);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDDEN$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDDEN$12);
         }

         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$12) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$12);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$12);
      }
   }

}
