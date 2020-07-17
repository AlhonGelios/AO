package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode$Enum;

public class CTCalcPrImpl extends XmlComplexContentImpl implements CTCalcPr {

   private static final QName CALCID$0 = new QName("", "calcId");
   private static final QName CALCMODE$2 = new QName("", "calcMode");
   private static final QName FULLCALCONLOAD$4 = new QName("", "fullCalcOnLoad");
   private static final QName REFMODE$6 = new QName("", "refMode");
   private static final QName ITERATE$8 = new QName("", "iterate");
   private static final QName ITERATECOUNT$10 = new QName("", "iterateCount");
   private static final QName ITERATEDELTA$12 = new QName("", "iterateDelta");
   private static final QName FULLPRECISION$14 = new QName("", "fullPrecision");
   private static final QName CALCCOMPLETED$16 = new QName("", "calcCompleted");
   private static final QName CALCONSAVE$18 = new QName("", "calcOnSave");
   private static final QName CONCURRENTCALC$20 = new QName("", "concurrentCalc");
   private static final QName CONCURRENTMANUALCOUNT$22 = new QName("", "concurrentManualCount");
   private static final QName FORCEFULLCALC$24 = new QName("", "forceFullCalc");


   public CTCalcPrImpl(SchemaType var1) {
      super(var1);
   }

   public long getCalcId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CALCID$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCalcId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CALCID$0);
         return var2;
      }
   }

   public boolean isSetCalcId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CALCID$0) != null;
      }
   }

   public void setCalcId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CALCID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CALCID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCalcId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CALCID$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CALCID$0);
         }

         var3.set(var1);
      }
   }

   public void unsetCalcId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CALCID$0);
      }
   }

   public STCalcMode.Enum getCalcMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CALCMODE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CALCMODE$2);
         }

         return var2 == null?null:(STCalcMode.Enum)var2.getEnumValue();
      }
   }

   public STCalcMode xgetCalcMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCalcMode var2 = null;
         var2 = (STCalcMode)this.get_store().find_attribute_user(CALCMODE$2);
         if(var2 == null) {
            var2 = (STCalcMode)this.get_default_attribute_value(CALCMODE$2);
         }

         return var2;
      }
   }

   public boolean isSetCalcMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CALCMODE$2) != null;
      }
   }

   public void setCalcMode(STCalcMode.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CALCMODE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CALCMODE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCalcMode(STCalcMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCalcMode var3 = null;
         var3 = (STCalcMode)this.get_store().find_attribute_user(CALCMODE$2);
         if(var3 == null) {
            var3 = (STCalcMode)this.get_store().add_attribute_user(CALCMODE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetCalcMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CALCMODE$2);
      }
   }

   public boolean getFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FULLCALCONLOAD$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FULLCALCONLOAD$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FULLCALCONLOAD$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FULLCALCONLOAD$4);
         }

         return var2;
      }
   }

   public boolean isSetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FULLCALCONLOAD$4) != null;
      }
   }

   public void setFullCalcOnLoad(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FULLCALCONLOAD$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FULLCALCONLOAD$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFullCalcOnLoad(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FULLCALCONLOAD$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FULLCALCONLOAD$4);
         }

         var3.set(var1);
      }
   }

   public void unsetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FULLCALCONLOAD$4);
      }
   }

   public STRefMode$Enum getRefMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFMODE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REFMODE$6);
         }

         return var2 == null?null:(STRefMode$Enum)var2.getEnumValue();
      }
   }

   public STRefMode xgetRefMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRefMode var2 = null;
         var2 = (STRefMode)this.get_store().find_attribute_user(REFMODE$6);
         if(var2 == null) {
            var2 = (STRefMode)this.get_default_attribute_value(REFMODE$6);
         }

         return var2;
      }
   }

   public boolean isSetRefMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFMODE$6) != null;
      }
   }

   public void setRefMode(STRefMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFMODE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFMODE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetRefMode(STRefMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRefMode var3 = null;
         var3 = (STRefMode)this.get_store().find_attribute_user(REFMODE$6);
         if(var3 == null) {
            var3 = (STRefMode)this.get_store().add_attribute_user(REFMODE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetRefMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFMODE$6);
      }
   }

   public boolean getIterate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ITERATE$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ITERATE$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIterate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ITERATE$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ITERATE$8);
         }

         return var2;
      }
   }

   public boolean isSetIterate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ITERATE$8) != null;
      }
   }

   public void setIterate(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ITERATE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ITERATE$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIterate(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ITERATE$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ITERATE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetIterate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ITERATE$8);
      }
   }

   public long getIterateCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ITERATECOUNT$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ITERATECOUNT$10);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIterateCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ITERATECOUNT$10);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ITERATECOUNT$10);
         }

         return var2;
      }
   }

   public boolean isSetIterateCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ITERATECOUNT$10) != null;
      }
   }

   public void setIterateCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ITERATECOUNT$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ITERATECOUNT$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIterateCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ITERATECOUNT$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ITERATECOUNT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetIterateCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ITERATECOUNT$10);
      }
   }

   public double getIterateDelta() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ITERATEDELTA$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ITERATEDELTA$12);
         }

         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetIterateDelta() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(ITERATEDELTA$12);
         if(var2 == null) {
            var2 = (XmlDouble)this.get_default_attribute_value(ITERATEDELTA$12);
         }

         return var2;
      }
   }

   public boolean isSetIterateDelta() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ITERATEDELTA$12) != null;
      }
   }

   public void setIterateDelta(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ITERATEDELTA$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ITERATEDELTA$12);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetIterateDelta(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(ITERATEDELTA$12);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(ITERATEDELTA$12);
         }

         var3.set(var1);
      }
   }

   public void unsetIterateDelta() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ITERATEDELTA$12);
      }
   }

   public boolean getFullPrecision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FULLPRECISION$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FULLPRECISION$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFullPrecision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FULLPRECISION$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FULLPRECISION$14);
         }

         return var2;
      }
   }

   public boolean isSetFullPrecision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FULLPRECISION$14) != null;
      }
   }

   public void setFullPrecision(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FULLPRECISION$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FULLPRECISION$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFullPrecision(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FULLPRECISION$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FULLPRECISION$14);
         }

         var3.set(var1);
      }
   }

   public void unsetFullPrecision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FULLPRECISION$14);
      }
   }

   public boolean getCalcCompleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CALCCOMPLETED$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CALCCOMPLETED$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCalcCompleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CALCCOMPLETED$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CALCCOMPLETED$16);
         }

         return var2;
      }
   }

   public boolean isSetCalcCompleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CALCCOMPLETED$16) != null;
      }
   }

   public void setCalcCompleted(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CALCCOMPLETED$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CALCCOMPLETED$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCalcCompleted(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CALCCOMPLETED$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CALCCOMPLETED$16);
         }

         var3.set(var1);
      }
   }

   public void unsetCalcCompleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CALCCOMPLETED$16);
      }
   }

   public boolean getCalcOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CALCONSAVE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CALCONSAVE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCalcOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CALCONSAVE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CALCONSAVE$18);
         }

         return var2;
      }
   }

   public boolean isSetCalcOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CALCONSAVE$18) != null;
      }
   }

   public void setCalcOnSave(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CALCONSAVE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CALCONSAVE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCalcOnSave(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CALCONSAVE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CALCONSAVE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCalcOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CALCONSAVE$18);
      }
   }

   public boolean getConcurrentCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONCURRENTCALC$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONCURRENTCALC$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetConcurrentCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONCURRENTCALC$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONCURRENTCALC$20);
         }

         return var2;
      }
   }

   public boolean isSetConcurrentCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONCURRENTCALC$20) != null;
      }
   }

   public void setConcurrentCalc(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONCURRENTCALC$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONCURRENTCALC$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetConcurrentCalc(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONCURRENTCALC$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONCURRENTCALC$20);
         }

         var3.set(var1);
      }
   }

   public void unsetConcurrentCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONCURRENTCALC$20);
      }
   }

   public long getConcurrentManualCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetConcurrentManualCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
         return var2;
      }
   }

   public boolean isSetConcurrentManualCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22) != null;
      }
   }

   public void setConcurrentManualCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CONCURRENTMANUALCOUNT$22);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetConcurrentManualCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CONCURRENTMANUALCOUNT$22);
         }

         var3.set(var1);
      }
   }

   public void unsetConcurrentManualCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONCURRENTMANUALCOUNT$22);
      }
   }

   public boolean getForceFullCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORCEFULLCALC$24);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetForceFullCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORCEFULLCALC$24);
         return var2;
      }
   }

   public boolean isSetForceFullCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORCEFULLCALC$24) != null;
      }
   }

   public void setForceFullCalc(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORCEFULLCALC$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORCEFULLCALC$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetForceFullCalc(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORCEFULLCALC$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORCEFULLCALC$24);
         }

         var3.set(var1);
      }
   }

   public void unsetForceFullCalc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORCEFULLCALC$24);
      }
   }

}
