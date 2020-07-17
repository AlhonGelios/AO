package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTH;
import com.microsoft.schemas.vml.STTrueFalse;
import com.microsoft.schemas.vml.STTrueFalseBlank;
import com.microsoft.schemas.vml.STTrueFalseBlank$Enum;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTHImpl extends XmlComplexContentImpl implements CTH {

   private static final QName POSITION$0 = new QName("", "position");
   private static final QName POLAR$2 = new QName("", "polar");
   private static final QName MAP$4 = new QName("", "map");
   private static final QName INVX$6 = new QName("", "invx");
   private static final QName INVY$8 = new QName("", "invy");
   private static final QName SWITCH$10 = new QName("", "switch");
   private static final QName XRANGE$12 = new QName("", "xrange");
   private static final QName YRANGE$14 = new QName("", "yrange");
   private static final QName RADIUSRANGE$16 = new QName("", "radiusrange");


   public CTHImpl(SchemaType var1) {
      super(var1);
   }

   public String getPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POSITION$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(POSITION$0);
         return var2;
      }
   }

   public boolean isSetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(POSITION$0) != null;
      }
   }

   public void setPosition(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POSITION$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POSITION$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPosition(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(POSITION$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(POSITION$0);
         }

         var3.set(var1);
      }
   }

   public void unsetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(POSITION$0);
      }
   }

   public String getPolar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POLAR$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPolar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(POLAR$2);
         return var2;
      }
   }

   public boolean isSetPolar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(POLAR$2) != null;
      }
   }

   public void setPolar(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POLAR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POLAR$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPolar(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(POLAR$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(POLAR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetPolar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(POLAR$2);
      }
   }

   public String getMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAP$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MAP$4);
         return var2;
      }
   }

   public boolean isSetMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAP$4) != null;
      }
   }

   public void setMap(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MAP$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MAP$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMap(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MAP$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MAP$4);
         }

         var3.set(var1);
      }
   }

   public void unsetMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAP$4);
      }
   }

   public STTrueFalse.Enum getInvx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INVX$6);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetInvx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(INVX$6);
         return var2;
      }
   }

   public boolean isSetInvx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INVX$6) != null;
      }
   }

   public void setInvx(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INVX$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INVX$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInvx(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(INVX$6);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(INVX$6);
         }

         var3.set(var1);
      }
   }

   public void unsetInvx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INVX$6);
      }
   }

   public STTrueFalse.Enum getInvy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INVY$8);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetInvy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(INVY$8);
         return var2;
      }
   }

   public boolean isSetInvy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INVY$8) != null;
      }
   }

   public void setInvy(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INVY$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INVY$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInvy(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(INVY$8);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(INVY$8);
         }

         var3.set(var1);
      }
   }

   public void unsetInvy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INVY$8);
      }
   }

   public STTrueFalseBlank$Enum getSwitch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SWITCH$10);
         return var2 == null?null:(STTrueFalseBlank$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalseBlank xgetSwitch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().find_attribute_user(SWITCH$10);
         return var2;
      }
   }

   public boolean isSetSwitch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SWITCH$10) != null;
      }
   }

   public void setSwitch(STTrueFalseBlank$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SWITCH$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SWITCH$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSwitch(STTrueFalseBlank var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_attribute_user(SWITCH$10);
         if(var3 == null) {
            var3 = (STTrueFalseBlank)this.get_store().add_attribute_user(SWITCH$10);
         }

         var3.set(var1);
      }
   }

   public void unsetSwitch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SWITCH$10);
      }
   }

   public String getXrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XRANGE$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetXrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(XRANGE$12);
         return var2;
      }
   }

   public boolean isSetXrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XRANGE$12) != null;
      }
   }

   public void setXrange(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XRANGE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XRANGE$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetXrange(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(XRANGE$12);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(XRANGE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetXrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XRANGE$12);
      }
   }

   public String getYrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(YRANGE$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetYrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(YRANGE$14);
         return var2;
      }
   }

   public boolean isSetYrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(YRANGE$14) != null;
      }
   }

   public void setYrange(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(YRANGE$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(YRANGE$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetYrange(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(YRANGE$14);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(YRANGE$14);
         }

         var3.set(var1);
      }
   }

   public void unsetYrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(YRANGE$14);
      }
   }

   public String getRadiusrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RADIUSRANGE$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetRadiusrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(RADIUSRANGE$16);
         return var2;
      }
   }

   public boolean isSetRadiusrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RADIUSRANGE$16) != null;
      }
   }

   public void setRadiusrange(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RADIUSRANGE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RADIUSRANGE$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRadiusrange(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(RADIUSRANGE$16);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(RADIUSRANGE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetRadiusrange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RADIUSRANGE$16);
      }
   }

}
