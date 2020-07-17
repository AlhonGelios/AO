package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTShadow;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STShadowType;
import com.microsoft.schemas.vml.STShadowType$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTShadowImpl extends XmlComplexContentImpl implements CTShadow {

   private static final QName ID$0 = new QName("", "id");
   private static final QName ON$2 = new QName("", "on");
   private static final QName TYPE$4 = new QName("", "type");
   private static final QName OBSCURED$6 = new QName("", "obscured");
   private static final QName COLOR$8 = new QName("", "color");
   private static final QName OPACITY$10 = new QName("", "opacity");
   private static final QName OFFSET$12 = new QName("", "offset");
   private static final QName COLOR2$14 = new QName("", "color2");
   private static final QName OFFSET2$16 = new QName("", "offset2");
   private static final QName ORIGIN$18 = new QName("", "origin");
   private static final QName MATRIX$20 = new QName("", "matrix");


   public CTShadowImpl(SchemaType var1) {
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

   public STTrueFalse.Enum getOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ON$2);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ON$2);
         return var2;
      }
   }

   public boolean isSetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ON$2) != null;
      }
   }

   public void setOn(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ON$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ON$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOn(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ON$2);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ON$2);
         }

         var3.set(var1);
      }
   }

   public void unsetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ON$2);
      }
   }

   public STShadowType$Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         return var2 == null?null:(STShadowType$Enum)var2.getEnumValue();
      }
   }

   public STShadowType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShadowType var2 = null;
         var2 = (STShadowType)this.get_store().find_attribute_user(TYPE$4);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$4) != null;
      }
   }

   public void setType(STShadowType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STShadowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShadowType var3 = null;
         var3 = (STShadowType)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (STShadowType)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$4);
      }
   }

   public STTrueFalse.Enum getObscured() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OBSCURED$6);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetObscured() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(OBSCURED$6);
         return var2;
      }
   }

   public boolean isSetObscured() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OBSCURED$6) != null;
      }
   }

   public void setObscured(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OBSCURED$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OBSCURED$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetObscured(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(OBSCURED$6);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(OBSCURED$6);
         }

         var3.set(var1);
      }
   }

   public void unsetObscured() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OBSCURED$6);
      }
   }

   public String getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(COLOR$8);
         return var2;
      }
   }

   public boolean isSetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR$8) != null;
      }
   }

   public void setColor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColor(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(COLOR$8);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(COLOR$8);
         }

         var3.set(var1);
      }
   }

   public void unsetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR$8);
      }
   }

   public String getOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OPACITY$10);
         return var2;
      }
   }

   public boolean isSetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPACITY$10) != null;
      }
   }

   public void setOpacity(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPACITY$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOpacity(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OPACITY$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OPACITY$10);
         }

         var3.set(var1);
      }
   }

   public void unsetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPACITY$10);
      }
   }

   public String getOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OFFSET$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OFFSET$12);
         return var2;
      }
   }

   public boolean isSetOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OFFSET$12) != null;
      }
   }

   public void setOffset(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OFFSET$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OFFSET$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOffset(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OFFSET$12);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OFFSET$12);
         }

         var3.set(var1);
      }
   }

   public void unsetOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OFFSET$12);
      }
   }

   public String getColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(COLOR2$14);
         return var2;
      }
   }

   public boolean isSetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR2$14) != null;
      }
   }

   public void setColor2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR2$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColor2(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(COLOR2$14);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(COLOR2$14);
         }

         var3.set(var1);
      }
   }

   public void unsetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR2$14);
      }
   }

   public String getOffset2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OFFSET2$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOffset2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OFFSET2$16);
         return var2;
      }
   }

   public boolean isSetOffset2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OFFSET2$16) != null;
      }
   }

   public void setOffset2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OFFSET2$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OFFSET2$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOffset2(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OFFSET2$16);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OFFSET2$16);
         }

         var3.set(var1);
      }
   }

   public void unsetOffset2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OFFSET2$16);
      }
   }

   public String getOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIGIN$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ORIGIN$18);
         return var2;
      }
   }

   public boolean isSetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIGIN$18) != null;
      }
   }

   public void setOrigin(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ORIGIN$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ORIGIN$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOrigin(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ORIGIN$18);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ORIGIN$18);
         }

         var3.set(var1);
      }
   }

   public void unsetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIGIN$18);
      }
   }

   public String getMatrix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MATRIX$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMatrix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MATRIX$20);
         return var2;
      }
   }

   public boolean isSetMatrix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MATRIX$20) != null;
      }
   }

   public void setMatrix(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MATRIX$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MATRIX$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMatrix(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MATRIX$20);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MATRIX$20);
         }

         var3.set(var1);
      }
   }

   public void unsetMatrix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MATRIX$20);
      }
   }

}
