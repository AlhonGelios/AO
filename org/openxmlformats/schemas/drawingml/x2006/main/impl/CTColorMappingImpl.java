package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex;

public class CTColorMappingImpl extends XmlComplexContentImpl implements CTColorMapping {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName BG1$2 = new QName("", "bg1");
   private static final QName TX1$4 = new QName("", "tx1");
   private static final QName BG2$6 = new QName("", "bg2");
   private static final QName TX2$8 = new QName("", "tx2");
   private static final QName ACCENT1$10 = new QName("", "accent1");
   private static final QName ACCENT2$12 = new QName("", "accent2");
   private static final QName ACCENT3$14 = new QName("", "accent3");
   private static final QName ACCENT4$16 = new QName("", "accent4");
   private static final QName ACCENT5$18 = new QName("", "accent5");
   private static final QName ACCENT6$20 = new QName("", "accent6");
   private static final QName HLINK$22 = new QName("", "hlink");
   private static final QName FOLHLINK$24 = new QName("", "folHlink");


   public CTColorMappingImpl(SchemaType var1) {
      super(var1);
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public STColorSchemeIndex.Enum getBg1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BG1$2);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetBg1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(BG1$2);
         return var2;
      }
   }

   public void setBg1(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BG1$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BG1$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBg1(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(BG1$2);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(BG1$2);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getTx1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TX1$4);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetTx1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(TX1$4);
         return var2;
      }
   }

   public void setTx1(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TX1$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TX1$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTx1(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(TX1$4);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(TX1$4);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getBg2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BG2$6);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetBg2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(BG2$6);
         return var2;
      }
   }

   public void setBg2(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BG2$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BG2$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBg2(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(BG2$6);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(BG2$6);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getTx2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TX2$8);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetTx2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(TX2$8);
         return var2;
      }
   }

   public void setTx2(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TX2$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TX2$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTx2(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(TX2$8);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(TX2$8);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT1$10);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT1$10);
         return var2;
      }
   }

   public void setAccent1(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT1$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT1$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent1(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT1$10);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT1$10);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT2$12);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT2$12);
         return var2;
      }
   }

   public void setAccent2(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT2$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT2$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent2(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT2$12);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT2$12);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT3$14);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT3$14);
         return var2;
      }
   }

   public void setAccent3(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT3$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT3$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent3(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT3$14);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT3$14);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT4$16);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT4$16);
         return var2;
      }
   }

   public void setAccent4(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT4$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT4$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent4(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT4$16);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT4$16);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent5() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT5$18);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent5() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT5$18);
         return var2;
      }
   }

   public void setAccent5(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT5$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT5$18);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent5(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT5$18);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT5$18);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getAccent6() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACCENT6$20);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetAccent6() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT6$20);
         return var2;
      }
   }

   public void setAccent6(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACCENT6$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACCENT6$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAccent6(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(ACCENT6$20);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(ACCENT6$20);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HLINK$22);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(HLINK$22);
         return var2;
      }
   }

   public void setHlink(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HLINK$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HLINK$22);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHlink(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(HLINK$22);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(HLINK$22);
         }

         var3.set(var1);
      }
   }

   public STColorSchemeIndex.Enum getFolHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FOLHLINK$24);
         return var2 == null?null:(STColorSchemeIndex.Enum)var2.getEnumValue();
      }
   }

   public STColorSchemeIndex xgetFolHlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var2 = null;
         var2 = (STColorSchemeIndex)this.get_store().find_attribute_user(FOLHLINK$24);
         return var2;
      }
   }

   public void setFolHlink(STColorSchemeIndex.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FOLHLINK$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FOLHLINK$24);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFolHlink(STColorSchemeIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorSchemeIndex var3 = null;
         var3 = (STColorSchemeIndex)this.get_store().find_attribute_user(FOLHLINK$24);
         if(var3 == null) {
            var3 = (STColorSchemeIndex)this.get_store().add_attribute_user(FOLHLINK$24);
         }

         var3.set(var1);
      }
   }

}
