package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol;

public class CTColImpl extends XmlComplexContentImpl implements CTCol {

   private static final QName MIN$0 = new QName("", "min");
   private static final QName MAX$2 = new QName("", "max");
   private static final QName WIDTH$4 = new QName("", "width");
   private static final QName STYLE$6 = new QName("", "style");
   private static final QName HIDDEN$8 = new QName("", "hidden");
   private static final QName BESTFIT$10 = new QName("", "bestFit");
   private static final QName CUSTOMWIDTH$12 = new QName("", "customWidth");
   private static final QName PHONETIC$14 = new QName("", "phonetic");
   private static final QName OUTLINELEVEL$16 = new QName("", "outlineLevel");
   private static final QName COLLAPSED$18 = new QName("", "collapsed");


   public CTColImpl(SchemaType var1) {
      super(var1);
   }

   public long getMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MIN$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MIN$0);
         return var2;
      }
   }

   public void setMin(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MIN$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MIN$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMin(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MIN$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MIN$0);
         }

         var3.set(var1);
      }
   }

   public long getMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAX$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAX$2);
         return var2;
      }
   }

   public void setMax(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAX$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAX$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMax(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAX$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MAX$2);
         }

         var3.set(var1);
      }
   }

   public double getWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WIDTH$4);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(WIDTH$4);
         return var2;
      }
   }

   public boolean isSetWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WIDTH$4) != null;
      }
   }

   public void setWidth(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(WIDTH$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(WIDTH$4);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetWidth(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(WIDTH$4);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(WIDTH$4);
         }

         var3.set(var1);
      }
   }

   public void unsetWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WIDTH$4);
      }
   }

   public long getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STYLE$6);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(STYLE$6);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(STYLE$6);
         }

         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$6) != null;
      }
   }

   public void setStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(STYLE$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(STYLE$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(STYLE$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(STYLE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$6);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDDEN$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDDEN$8);
         }

         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$8) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$8);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$8);
      }
   }

   public boolean getBestFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BESTFIT$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BESTFIT$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBestFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BESTFIT$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BESTFIT$10);
         }

         return var2;
      }
   }

   public boolean isSetBestFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BESTFIT$10) != null;
      }
   }

   public void setBestFit(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BESTFIT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BESTFIT$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBestFit(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BESTFIT$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BESTFIT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetBestFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BESTFIT$10);
      }
   }

   public boolean getCustomWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMWIDTH$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CUSTOMWIDTH$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCustomWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMWIDTH$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CUSTOMWIDTH$12);
         }

         return var2;
      }
   }

   public boolean isSetCustomWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMWIDTH$12) != null;
      }
   }

   public void setCustomWidth(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMWIDTH$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMWIDTH$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCustomWidth(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMWIDTH$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CUSTOMWIDTH$12);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMWIDTH$12);
      }
   }

   public boolean getPhonetic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PHONETIC$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PHONETIC$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPhonetic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PHONETIC$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PHONETIC$14);
         }

         return var2;
      }
   }

   public boolean isSetPhonetic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PHONETIC$14) != null;
      }
   }

   public void setPhonetic(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PHONETIC$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PHONETIC$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPhonetic(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PHONETIC$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PHONETIC$14);
         }

         var3.set(var1);
      }
   }

   public void unsetPhonetic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PHONETIC$14);
      }
   }

   public short getOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVEL$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINELEVEL$16);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVEL$16);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(OUTLINELEVEL$16);
         }

         return var2;
      }
   }

   public boolean isSetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINELEVEL$16) != null;
      }
   }

   public void setOutlineLevel(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVEL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINELEVEL$16);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetOutlineLevel(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVEL$16);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(OUTLINELEVEL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINELEVEL$16);
      }
   }

   public boolean getCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLLAPSED$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COLLAPSED$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COLLAPSED$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COLLAPSED$18);
         }

         return var2;
      }
   }

   public boolean isSetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLLAPSED$18) != null;
      }
   }

   public void setCollapsed(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLLAPSED$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLLAPSED$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCollapsed(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COLLAPSED$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COLLAPSED$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLLAPSED$18);
      }
   }

}
