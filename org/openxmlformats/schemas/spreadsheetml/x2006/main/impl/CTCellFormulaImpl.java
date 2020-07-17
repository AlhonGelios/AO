package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.JavaStringHolderEx;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;

public class CTCellFormulaImpl extends JavaStringHolderEx implements CTCellFormula {

   private static final QName T$0 = new QName("", "t");
   private static final QName ACA$2 = new QName("", "aca");
   private static final QName REF$4 = new QName("", "ref");
   private static final QName DT2D$6 = new QName("", "dt2D");
   private static final QName DTR$8 = new QName("", "dtr");
   private static final QName DEL1$10 = new QName("", "del1");
   private static final QName DEL2$12 = new QName("", "del2");
   private static final QName R1$14 = new QName("", "r1");
   private static final QName R2$16 = new QName("", "r2");
   private static final QName CA$18 = new QName("", "ca");
   private static final QName SI$20 = new QName("", "si");
   private static final QName BX$22 = new QName("", "bx");


   public CTCellFormulaImpl(SchemaType var1) {
      super(var1, true);
   }

   protected CTCellFormulaImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }

   public STCellFormulaType.Enum getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(T$0);
         }

         return var2 == null?null:(STCellFormulaType.Enum)var2.getEnumValue();
      }
   }

   public STCellFormulaType xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellFormulaType var2 = null;
         var2 = (STCellFormulaType)this.get_store().find_attribute_user(T$0);
         if(var2 == null) {
            var2 = (STCellFormulaType)this.get_default_attribute_value(T$0);
         }

         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$0) != null;
      }
   }

   public void setT(STCellFormulaType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetT(STCellFormulaType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellFormulaType var3 = null;
         var3 = (STCellFormulaType)this.get_store().find_attribute_user(T$0);
         if(var3 == null) {
            var3 = (STCellFormulaType)this.get_store().add_attribute_user(T$0);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$0);
      }
   }

   public boolean getAca() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACA$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ACA$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAca() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ACA$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ACA$2);
         }

         return var2;
      }
   }

   public boolean isSetAca() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACA$2) != null;
      }
   }

   public void setAca(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACA$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACA$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAca(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ACA$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ACA$2);
         }

         var3.set(var1);
      }
   }

   public void unsetAca() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACA$2);
      }
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$4);
         return var2;
      }
   }

   public boolean isSetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REF$4) != null;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$4);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$4);
         }

         var3.set(var1);
      }
   }

   public void unsetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REF$4);
      }
   }

   public boolean getDt2D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DT2D$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DT2D$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDt2D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DT2D$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DT2D$6);
         }

         return var2;
      }
   }

   public boolean isSetDt2D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DT2D$6) != null;
      }
   }

   public void setDt2D(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DT2D$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DT2D$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDt2D(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DT2D$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DT2D$6);
         }

         var3.set(var1);
      }
   }

   public void unsetDt2D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DT2D$6);
      }
   }

   public boolean getDtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DTR$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DTR$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DTR$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DTR$8);
         }

         return var2;
      }
   }

   public boolean isSetDtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DTR$8) != null;
      }
   }

   public void setDtr(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DTR$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DTR$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDtr(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DTR$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DTR$8);
         }

         var3.set(var1);
      }
   }

   public void unsetDtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DTR$8);
      }
   }

   public boolean getDel1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEL1$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DEL1$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDel1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEL1$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DEL1$10);
         }

         return var2;
      }
   }

   public boolean isSetDel1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEL1$10) != null;
      }
   }

   public void setDel1(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEL1$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEL1$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDel1(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEL1$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEL1$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDel1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEL1$10);
      }
   }

   public boolean getDel2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEL2$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DEL2$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDel2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEL2$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DEL2$12);
         }

         return var2;
      }
   }

   public boolean isSetDel2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEL2$12) != null;
      }
   }

   public void setDel2(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEL2$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEL2$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDel2(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEL2$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEL2$12);
         }

         var3.set(var1);
      }
   }

   public void unsetDel2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEL2$12);
      }
   }

   public String getR1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R1$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetR1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(R1$14);
         return var2;
      }
   }

   public boolean isSetR1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(R1$14) != null;
      }
   }

   public void setR1(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R1$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R1$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetR1(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(R1$14);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(R1$14);
         }

         var3.set(var1);
      }
   }

   public void unsetR1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(R1$14);
      }
   }

   public String getR2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R2$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetR2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(R2$16);
         return var2;
      }
   }

   public boolean isSetR2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(R2$16) != null;
      }
   }

   public void setR2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R2$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R2$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetR2(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(R2$16);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(R2$16);
         }

         var3.set(var1);
      }
   }

   public void unsetR2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(R2$16);
      }
   }

   public boolean getCa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CA$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CA$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CA$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CA$18);
         }

         return var2;
      }
   }

   public boolean isSetCa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CA$18) != null;
      }
   }

   public void setCa(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CA$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CA$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCa(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CA$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CA$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CA$18);
      }
   }

   public long getSi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SI$20);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetSi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SI$20);
         return var2;
      }
   }

   public boolean isSetSi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SI$20) != null;
      }
   }

   public void setSi(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SI$20);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SI$20);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetSi(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SI$20);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SI$20);
         }

         var3.set(var1);
      }
   }

   public void unsetSi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SI$20);
      }
   }

   public boolean getBx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BX$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BX$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BX$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BX$22);
         }

         return var2;
      }
   }

   public boolean isSetBx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BX$22) != null;
      }
   }

   public void setBx(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BX$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BX$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBx(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BX$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BX$22);
         }

         var3.set(var1);
      }
   }

   public void unsetBx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BX$22);
      }
   }

}
