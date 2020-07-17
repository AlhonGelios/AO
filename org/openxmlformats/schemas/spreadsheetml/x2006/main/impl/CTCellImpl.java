package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTCellImpl extends XmlComplexContentImpl implements CTCell {

   private static final QName F$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "f");
   private static final QName V$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v");
   private static final QName IS$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "is");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName R$8 = new QName("", "r");
   private static final QName S$10 = new QName("", "s");
   private static final QName T$12 = new QName("", "t");
   private static final QName CM$14 = new QName("", "cm");
   private static final QName VM$16 = new QName("", "vm");
   private static final QName PH$18 = new QName("", "ph");


   public CTCellImpl(SchemaType var1) {
      super(var1);
   }

   public CTCellFormula getF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellFormula var2 = null;
         var2 = (CTCellFormula)this.get_store().find_element_user(F$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(F$0) != 0;
      }
   }

   public void setF(CTCellFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellFormula var3 = null;
         var3 = (CTCellFormula)this.get_store().find_element_user(F$0, 0);
         if(var3 == null) {
            var3 = (CTCellFormula)this.get_store().add_element_user(F$0);
         }

         var3.set(var1);
      }
   }

   public CTCellFormula addNewF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellFormula var2 = null;
         var2 = (CTCellFormula)this.get_store().add_element_user(F$0);
         return var2;
      }
   }

   public void unsetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(F$0, 0);
      }
   }

   public String getV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(V$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(V$2, 0);
         return var2;
      }
   }

   public boolean isSetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(V$2) != 0;
      }
   }

   public void setV(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(V$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(V$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetV(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(V$2, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(V$2);
         }

         var3.set(var1);
      }
   }

   public void unsetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(V$2, 0);
      }
   }

   public CTRst getIs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var2 = null;
         var2 = (CTRst)this.get_store().find_element_user(IS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IS$4) != 0;
      }
   }

   public void setIs(CTRst var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var3 = null;
         var3 = (CTRst)this.get_store().find_element_user(IS$4, 0);
         if(var3 == null) {
            var3 = (CTRst)this.get_store().add_element_user(IS$4);
         }

         var3.set(var1);
      }
   }

   public CTRst addNewIs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRst var2 = null;
         var2 = (CTRst)this.get_store().add_element_user(IS$4);
         return var2;
      }
   }

   public void unsetIs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IS$4, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

   public String getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(R$8);
         return var2;
      }
   }

   public boolean isSetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(R$8) != null;
      }
   }

   public void setR(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetR(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(R$8);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(R$8);
         }

         var3.set(var1);
      }
   }

   public void unsetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(R$8);
      }
   }

   public long getS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(S$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(S$10);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(S$10);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(S$10);
         }

         return var2;
      }
   }

   public boolean isSetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(S$10) != null;
      }
   }

   public void setS(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(S$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(S$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetS(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(S$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(S$10);
         }

         var3.set(var1);
      }
   }

   public void unsetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(S$10);
      }
   }

   public STCellType.Enum getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(T$12);
         }

         return var2 == null?null:(STCellType.Enum)var2.getEnumValue();
      }
   }

   public STCellType xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellType var2 = null;
         var2 = (STCellType)this.get_store().find_attribute_user(T$12);
         if(var2 == null) {
            var2 = (STCellType)this.get_default_attribute_value(T$12);
         }

         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$12) != null;
      }
   }

   public void setT(STCellType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetT(STCellType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellType var3 = null;
         var3 = (STCellType)this.get_store().find_attribute_user(T$12);
         if(var3 == null) {
            var3 = (STCellType)this.get_store().add_attribute_user(T$12);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$12);
      }
   }

   public long getCm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CM$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CM$14);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CM$14);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(CM$14);
         }

         return var2;
      }
   }

   public boolean isSetCm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CM$14) != null;
      }
   }

   public void setCm(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CM$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CM$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCm(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CM$14);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CM$14);
         }

         var3.set(var1);
      }
   }

   public void unsetCm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CM$14);
      }
   }

   public long getVm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VM$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VM$16);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetVm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(VM$16);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(VM$16);
         }

         return var2;
      }
   }

   public boolean isSetVm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VM$16) != null;
      }
   }

   public void setVm(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VM$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VM$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetVm(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(VM$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(VM$16);
         }

         var3.set(var1);
      }
   }

   public void unsetVm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VM$16);
      }
   }

   public boolean getPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PH$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PH$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PH$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PH$18);
         }

         return var2;
      }
   }

   public boolean isSetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PH$18) != null;
      }
   }

   public void setPh(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PH$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PH$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPh(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PH$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PH$18);
         }

         var3.set(var1);
      }
   }

   public void unsetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PH$18);
      }
   }

}
