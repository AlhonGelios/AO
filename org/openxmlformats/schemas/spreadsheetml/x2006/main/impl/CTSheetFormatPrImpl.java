package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr;

public class CTSheetFormatPrImpl extends XmlComplexContentImpl implements CTSheetFormatPr {

   private static final QName BASECOLWIDTH$0 = new QName("", "baseColWidth");
   private static final QName DEFAULTCOLWIDTH$2 = new QName("", "defaultColWidth");
   private static final QName DEFAULTROWHEIGHT$4 = new QName("", "defaultRowHeight");
   private static final QName CUSTOMHEIGHT$6 = new QName("", "customHeight");
   private static final QName ZEROHEIGHT$8 = new QName("", "zeroHeight");
   private static final QName THICKTOP$10 = new QName("", "thickTop");
   private static final QName THICKBOTTOM$12 = new QName("", "thickBottom");
   private static final QName OUTLINELEVELROW$14 = new QName("", "outlineLevelRow");
   private static final QName OUTLINELEVELCOL$16 = new QName("", "outlineLevelCol");


   public CTSheetFormatPrImpl(SchemaType var1) {
      super(var1);
   }

   public long getBaseColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASECOLWIDTH$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BASECOLWIDTH$0);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetBaseColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(BASECOLWIDTH$0);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(BASECOLWIDTH$0);
         }

         return var2;
      }
   }

   public boolean isSetBaseColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BASECOLWIDTH$0) != null;
      }
   }

   public void setBaseColWidth(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BASECOLWIDTH$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BASECOLWIDTH$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBaseColWidth(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(BASECOLWIDTH$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(BASECOLWIDTH$0);
         }

         var3.set(var1);
      }
   }

   public void unsetBaseColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BASECOLWIDTH$0);
      }
   }

   public double getDefaultColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetDefaultColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
         return var2;
      }
   }

   public boolean isSetDefaultColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTCOLWIDTH$2) != null;
      }
   }

   public void setDefaultColWidth(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTCOLWIDTH$2);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetDefaultColWidth(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(DEFAULTCOLWIDTH$2);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultColWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTCOLWIDTH$2);
      }
   }

   public double getDefaultRowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetDefaultRowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
         return var2;
      }
   }

   public void setDefaultRowHeight(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTROWHEIGHT$4);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetDefaultRowHeight(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(DEFAULTROWHEIGHT$4);
         }

         var3.set(var1);
      }
   }

   public boolean getCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMHEIGHT$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CUSTOMHEIGHT$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMHEIGHT$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CUSTOMHEIGHT$6);
         }

         return var2;
      }
   }

   public boolean isSetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMHEIGHT$6) != null;
      }
   }

   public void setCustomHeight(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMHEIGHT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMHEIGHT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCustomHeight(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMHEIGHT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CUSTOMHEIGHT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMHEIGHT$6);
      }
   }

   public boolean getZeroHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ZEROHEIGHT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ZEROHEIGHT$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetZeroHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ZEROHEIGHT$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ZEROHEIGHT$8);
         }

         return var2;
      }
   }

   public boolean isSetZeroHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ZEROHEIGHT$8) != null;
      }
   }

   public void setZeroHeight(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ZEROHEIGHT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ZEROHEIGHT$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetZeroHeight(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ZEROHEIGHT$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ZEROHEIGHT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetZeroHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ZEROHEIGHT$8);
      }
   }

   public boolean getThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THICKTOP$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(THICKTOP$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(THICKTOP$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(THICKTOP$10);
         }

         return var2;
      }
   }

   public boolean isSetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THICKTOP$10) != null;
      }
   }

   public void setThickTop(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THICKTOP$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THICKTOP$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetThickTop(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(THICKTOP$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(THICKTOP$10);
         }

         var3.set(var1);
      }
   }

   public void unsetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THICKTOP$10);
      }
   }

   public boolean getThickBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THICKBOTTOM$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(THICKBOTTOM$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetThickBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(THICKBOTTOM$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(THICKBOTTOM$12);
         }

         return var2;
      }
   }

   public boolean isSetThickBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THICKBOTTOM$12) != null;
      }
   }

   public void setThickBottom(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THICKBOTTOM$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THICKBOTTOM$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetThickBottom(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(THICKBOTTOM$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(THICKBOTTOM$12);
         }

         var3.set(var1);
      }
   }

   public void unsetThickBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THICKBOTTOM$12);
      }
   }

   public short getOutlineLevelRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVELROW$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINELEVELROW$14);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetOutlineLevelRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVELROW$14);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(OUTLINELEVELROW$14);
         }

         return var2;
      }
   }

   public boolean isSetOutlineLevelRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINELEVELROW$14) != null;
      }
   }

   public void setOutlineLevelRow(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVELROW$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINELEVELROW$14);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetOutlineLevelRow(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVELROW$14);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(OUTLINELEVELROW$14);
         }

         var3.set(var1);
      }
   }

   public void unsetOutlineLevelRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINELEVELROW$14);
      }
   }

   public short getOutlineLevelCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVELCOL$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINELEVELCOL$16);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetOutlineLevelCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVELCOL$16);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(OUTLINELEVELCOL$16);
         }

         return var2;
      }
   }

   public boolean isSetOutlineLevelCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINELEVELCOL$16) != null;
      }
   }

   public void setOutlineLevelCol(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVELCOL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINELEVELCOL$16);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetOutlineLevelCol(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVELCOL$16);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(OUTLINELEVELCOL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetOutlineLevelCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINELEVELCOL$16);
      }
   }

}
