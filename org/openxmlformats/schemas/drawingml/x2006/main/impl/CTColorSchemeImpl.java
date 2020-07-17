package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTColorSchemeImpl extends XmlComplexContentImpl implements CTColorScheme {

   private static final QName DK1$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "dk1");
   private static final QName LT1$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lt1");
   private static final QName DK2$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "dk2");
   private static final QName LT2$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lt2");
   private static final QName ACCENT1$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent1");
   private static final QName ACCENT2$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent2");
   private static final QName ACCENT3$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent3");
   private static final QName ACCENT4$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent4");
   private static final QName ACCENT5$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent5");
   private static final QName ACCENT6$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent6");
   private static final QName HLINK$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlink");
   private static final QName FOLHLINK$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "folHlink");
   private static final QName EXTLST$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName NAME$26 = new QName("", "name");


   public CTColorSchemeImpl(SchemaType var1) {
      super(var1);
   }

   public CTColor getDk1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(DK1$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDk1(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(DK1$0, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(DK1$0);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewDk1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(DK1$0);
         return var2;
      }
   }

   public CTColor getLt1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(LT1$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLt1(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(LT1$2, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(LT1$2);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewLt1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(LT1$2);
         return var2;
      }
   }

   public CTColor getDk2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(DK2$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDk2(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(DK2$4, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(DK2$4);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewDk2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(DK2$4);
         return var2;
      }
   }

   public CTColor getLt2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(LT2$6, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLt2(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(LT2$6, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(LT2$6);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewLt2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(LT2$6);
         return var2;
      }
   }

   public CTColor getAccent1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT1$8, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent1(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT1$8, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT1$8);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT1$8);
         return var2;
      }
   }

   public CTColor getAccent2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT2$10, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent2(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT2$10, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT2$10);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT2$10);
         return var2;
      }
   }

   public CTColor getAccent3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT3$12, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent3(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT3$12, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT3$12);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT3$12);
         return var2;
      }
   }

   public CTColor getAccent4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT4$14, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent4(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT4$14, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT4$14);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT4$14);
         return var2;
      }
   }

   public CTColor getAccent5() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT5$16, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent5(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT5$16, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT5$16);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent5() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT5$16);
         return var2;
      }
   }

   public CTColor getAccent6() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(ACCENT6$18, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAccent6(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(ACCENT6$18, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(ACCENT6$18);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewAccent6() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(ACCENT6$18);
         return var2;
      }
   }

   public CTColor getHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(HLINK$20, 0);
         return var2 == null?null:var2;
      }
   }

   public void setHlink(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(HLINK$20, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(HLINK$20);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(HLINK$20);
         return var2;
      }
   }

   public CTColor getFolHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(FOLHLINK$22, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFolHlink(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(FOLHLINK$22, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(FOLHLINK$22);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewFolHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(FOLHLINK$22);
         return var2;
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$24) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$24);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$24);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$24, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$26);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$26);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$26);
         }

         var3.set(var1);
      }
   }

}
