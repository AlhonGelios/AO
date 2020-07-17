package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.STPanose;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface;

public class CTTextFontImpl extends XmlComplexContentImpl implements CTTextFont {

   private static final QName TYPEFACE$0 = new QName("", "typeface");
   private static final QName PANOSE$2 = new QName("", "panose");
   private static final QName PITCHFAMILY$4 = new QName("", "pitchFamily");
   private static final QName CHARSET$6 = new QName("", "charset");


   public CTTextFontImpl(SchemaType var1) {
      super(var1);
   }

   public String getTypeface() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPEFACE$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STTextTypeface xgetTypeface() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextTypeface var2 = null;
         var2 = (STTextTypeface)this.get_store().find_attribute_user(TYPEFACE$0);
         return var2;
      }
   }

   public boolean isSetTypeface() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPEFACE$0) != null;
      }
   }

   public void setTypeface(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPEFACE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPEFACE$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTypeface(STTextTypeface var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextTypeface var3 = null;
         var3 = (STTextTypeface)this.get_store().find_attribute_user(TYPEFACE$0);
         if(var3 == null) {
            var3 = (STTextTypeface)this.get_store().add_attribute_user(TYPEFACE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetTypeface() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPEFACE$0);
      }
   }

   public byte[] getPanose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PANOSE$2);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STPanose xgetPanose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPanose var2 = null;
         var2 = (STPanose)this.get_store().find_attribute_user(PANOSE$2);
         return var2;
      }
   }

   public boolean isSetPanose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PANOSE$2) != null;
      }
   }

   public void setPanose(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PANOSE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PANOSE$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetPanose(STPanose var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPanose var3 = null;
         var3 = (STPanose)this.get_store().find_attribute_user(PANOSE$2);
         if(var3 == null) {
            var3 = (STPanose)this.get_store().add_attribute_user(PANOSE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetPanose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PANOSE$2);
      }
   }

   public byte getPitchFamily() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PITCHFAMILY$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PITCHFAMILY$4);
         }

         return var2 == null?0:var2.getByteValue();
      }
   }

   public XmlByte xgetPitchFamily() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var2 = null;
         var2 = (XmlByte)this.get_store().find_attribute_user(PITCHFAMILY$4);
         if(var2 == null) {
            var2 = (XmlByte)this.get_default_attribute_value(PITCHFAMILY$4);
         }

         return var2;
      }
   }

   public boolean isSetPitchFamily() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PITCHFAMILY$4) != null;
      }
   }

   public void setPitchFamily(byte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PITCHFAMILY$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PITCHFAMILY$4);
         }

         var3.setByteValue(var1);
      }
   }

   public void xsetPitchFamily(XmlByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var3 = null;
         var3 = (XmlByte)this.get_store().find_attribute_user(PITCHFAMILY$4);
         if(var3 == null) {
            var3 = (XmlByte)this.get_store().add_attribute_user(PITCHFAMILY$4);
         }

         var3.set(var1);
      }
   }

   public void unsetPitchFamily() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PITCHFAMILY$4);
      }
   }

   public byte getCharset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHARSET$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CHARSET$6);
         }

         return var2 == null?0:var2.getByteValue();
      }
   }

   public XmlByte xgetCharset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var2 = null;
         var2 = (XmlByte)this.get_store().find_attribute_user(CHARSET$6);
         if(var2 == null) {
            var2 = (XmlByte)this.get_default_attribute_value(CHARSET$6);
         }

         return var2;
      }
   }

   public boolean isSetCharset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CHARSET$6) != null;
      }
   }

   public void setCharset(byte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CHARSET$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CHARSET$6);
         }

         var3.setByteValue(var1);
      }
   }

   public void xsetCharset(XmlByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var3 = null;
         var3 = (XmlByte)this.get_store().find_attribute_user(CHARSET$6);
         if(var3 == null) {
            var3 = (XmlByte)this.get_store().add_attribute_user(CHARSET$6);
         }

         var3.set(var1);
      }
   }

   public void unsetCharset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CHARSET$6);
      }
   }

}
