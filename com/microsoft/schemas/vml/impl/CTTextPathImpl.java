package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTTextPath;
import com.microsoft.schemas.vml.STTrueFalse;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTTextPathImpl extends XmlComplexContentImpl implements CTTextPath {

   private static final QName ID$0 = new QName("", "id");
   private static final QName STYLE$2 = new QName("", "style");
   private static final QName ON$4 = new QName("", "on");
   private static final QName FITSHAPE$6 = new QName("", "fitshape");
   private static final QName FITPATH$8 = new QName("", "fitpath");
   private static final QName TRIM$10 = new QName("", "trim");
   private static final QName XSCALE$12 = new QName("", "xscale");
   private static final QName STRING$14 = new QName("", "string");


   public CTTextPathImpl(SchemaType var1) {
      super(var1);
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$0) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$0);
      }
   }

   public String getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STYLE$2);
         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$2) != null;
      }
   }

   public void setStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLE$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STYLE$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STYLE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$2);
      }
   }

   public STTrueFalse.Enum getOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ON$4);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ON$4);
         return var2;
      }
   }

   public boolean isSetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ON$4) != null;
      }
   }

   public void setOn(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ON$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ON$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOn(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ON$4);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ON$4);
         }

         var3.set(var1);
      }
   }

   public void unsetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ON$4);
      }
   }

   public STTrueFalse.Enum getFitshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FITSHAPE$6);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetFitshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(FITSHAPE$6);
         return var2;
      }
   }

   public boolean isSetFitshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FITSHAPE$6) != null;
      }
   }

   public void setFitshape(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FITSHAPE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FITSHAPE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFitshape(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(FITSHAPE$6);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(FITSHAPE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetFitshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FITSHAPE$6);
      }
   }

   public STTrueFalse.Enum getFitpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FITPATH$8);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetFitpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(FITPATH$8);
         return var2;
      }
   }

   public boolean isSetFitpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FITPATH$8) != null;
      }
   }

   public void setFitpath(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FITPATH$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FITPATH$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFitpath(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(FITPATH$8);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(FITPATH$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFitpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FITPATH$8);
      }
   }

   public STTrueFalse.Enum getTrim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TRIM$10);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetTrim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(TRIM$10);
         return var2;
      }
   }

   public boolean isSetTrim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TRIM$10) != null;
      }
   }

   public void setTrim(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TRIM$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TRIM$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTrim(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(TRIM$10);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(TRIM$10);
         }

         var3.set(var1);
      }
   }

   public void unsetTrim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TRIM$10);
      }
   }

   public STTrueFalse.Enum getXscale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XSCALE$12);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetXscale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(XSCALE$12);
         return var2;
      }
   }

   public boolean isSetXscale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XSCALE$12) != null;
      }
   }

   public void setXscale(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XSCALE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XSCALE$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetXscale(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(XSCALE$12);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(XSCALE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetXscale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XSCALE$12);
      }
   }

   public String getString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STRING$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STRING$14);
         return var2;
      }
   }

   public boolean isSetString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STRING$14) != null;
      }
   }

   public void setString(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STRING$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STRING$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetString(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STRING$14);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STRING$14);
         }

         var3.set(var1);
      }
   }

   public void unsetString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STRING$14);
      }
   }

}
