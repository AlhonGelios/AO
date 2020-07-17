package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.vml.CTFill;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STFillMethod;
import com.microsoft.schemas.vml.STFillMethod$Enum;
import com.microsoft.schemas.vml.STFillType;
import com.microsoft.schemas.vml.STFillType$Enum;
import com.microsoft.schemas.vml.STImageAspect;
import com.microsoft.schemas.vml.STImageAspect$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import java.math.BigDecimal;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;

public class CTFillImpl extends XmlComplexContentImpl implements CTFill {

   private static final QName FILL$0 = new QName("urn:schemas-microsoft-com:office:office", "fill");
   private static final QName ID$2 = new QName("", "id");
   private static final QName TYPE$4 = new QName("", "type");
   private static final QName ON$6 = new QName("", "on");
   private static final QName COLOR$8 = new QName("", "color");
   private static final QName OPACITY$10 = new QName("", "opacity");
   private static final QName COLOR2$12 = new QName("", "color2");
   private static final QName SRC$14 = new QName("", "src");
   private static final QName HREF$16 = new QName("urn:schemas-microsoft-com:office:office", "href");
   private static final QName ALTHREF$18 = new QName("urn:schemas-microsoft-com:office:office", "althref");
   private static final QName SIZE$20 = new QName("", "size");
   private static final QName ORIGIN$22 = new QName("", "origin");
   private static final QName POSITION$24 = new QName("", "position");
   private static final QName ASPECT$26 = new QName("", "aspect");
   private static final QName COLORS$28 = new QName("", "colors");
   private static final QName ANGLE$30 = new QName("", "angle");
   private static final QName ALIGNSHAPE$32 = new QName("", "alignshape");
   private static final QName FOCUS$34 = new QName("", "focus");
   private static final QName FOCUSSIZE$36 = new QName("", "focussize");
   private static final QName FOCUSPOSITION$38 = new QName("", "focusposition");
   private static final QName METHOD$40 = new QName("", "method");
   private static final QName DETECTMOUSECLICK$42 = new QName("urn:schemas-microsoft-com:office:office", "detectmouseclick");
   private static final QName TITLE$44 = new QName("urn:schemas-microsoft-com:office:office", "title");
   private static final QName OPACITY2$46 = new QName("urn:schemas-microsoft-com:office:office", "opacity2");
   private static final QName RECOLOR$48 = new QName("", "recolor");
   private static final QName ROTATE$50 = new QName("", "rotate");
   private static final QName ID2$52 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
   private static final QName RELID$54 = new QName("urn:schemas-microsoft-com:office:office", "relid");


   public CTFillImpl(SchemaType var1) {
      super(var1);
   }

   public com.microsoft.schemas.office.office.CTFill getFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.CTFill var2 = null;
         var2 = (com.microsoft.schemas.office.office.CTFill)this.get_store().find_element_user(FILL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILL$0) != 0;
      }
   }

   public void setFill(com.microsoft.schemas.office.office.CTFill var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.CTFill var3 = null;
         var3 = (com.microsoft.schemas.office.office.CTFill)this.get_store().find_element_user(FILL$0, 0);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.CTFill)this.get_store().add_element_user(FILL$0);
         }

         var3.set(var1);
      }
   }

   public com.microsoft.schemas.office.office.CTFill addNewFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.CTFill var2 = null;
         var2 = (com.microsoft.schemas.office.office.CTFill)this.get_store().add_element_user(FILL$0);
         return var2;
      }
   }

   public void unsetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILL$0, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$2) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$2);
      }
   }

   public STFillType$Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         return var2 == null?null:(STFillType$Enum)var2.getEnumValue();
      }
   }

   public STFillType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillType var2 = null;
         var2 = (STFillType)this.get_store().find_attribute_user(TYPE$4);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$4) != null;
      }
   }

   public void setType(STFillType$Enum var1) {
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

   public void xsetType(STFillType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillType var3 = null;
         var3 = (STFillType)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (STFillType)this.get_store().add_attribute_user(TYPE$4);
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

   public STTrueFalse.Enum getOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ON$6);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ON$6);
         return var2;
      }
   }

   public boolean isSetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ON$6) != null;
      }
   }

   public void setOn(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ON$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ON$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOn(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ON$6);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ON$6);
         }

         var3.set(var1);
      }
   }

   public void unsetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ON$6);
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

   public String getColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(COLOR2$12);
         return var2;
      }
   }

   public boolean isSetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR2$12) != null;
      }
   }

   public void setColor2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR2$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColor2(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(COLOR2$12);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(COLOR2$12);
         }

         var3.set(var1);
      }
   }

   public void unsetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR2$12);
      }
   }

   public String getSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SRC$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SRC$14);
         return var2;
      }
   }

   public boolean isSetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SRC$14) != null;
      }
   }

   public void setSrc(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SRC$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SRC$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSrc(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SRC$14);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SRC$14);
         }

         var3.set(var1);
      }
   }

   public void unsetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SRC$14);
      }
   }

   public String getHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HREF$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(HREF$16);
         return var2;
      }
   }

   public boolean isSetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HREF$16) != null;
      }
   }

   public void setHref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HREF$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HREF$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(HREF$16);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(HREF$16);
         }

         var3.set(var1);
      }
   }

   public void unsetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HREF$16);
      }
   }

   public String getAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALTHREF$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ALTHREF$18);
         return var2;
      }
   }

   public boolean isSetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALTHREF$18) != null;
      }
   }

   public void setAlthref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALTHREF$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALTHREF$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlthref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ALTHREF$18);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ALTHREF$18);
         }

         var3.set(var1);
      }
   }

   public void unsetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALTHREF$18);
      }
   }

   public String getSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SIZE$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SIZE$20);
         return var2;
      }
   }

   public boolean isSetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SIZE$20) != null;
      }
   }

   public void setSize(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SIZE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SIZE$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSize(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SIZE$20);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SIZE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SIZE$20);
      }
   }

   public String getOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIGIN$22);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ORIGIN$22);
         return var2;
      }
   }

   public boolean isSetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIGIN$22) != null;
      }
   }

   public void setOrigin(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ORIGIN$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ORIGIN$22);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOrigin(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ORIGIN$22);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ORIGIN$22);
         }

         var3.set(var1);
      }
   }

   public void unsetOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIGIN$22);
      }
   }

   public String getPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POSITION$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(POSITION$24);
         return var2;
      }
   }

   public boolean isSetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(POSITION$24) != null;
      }
   }

   public void setPosition(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POSITION$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POSITION$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPosition(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(POSITION$24);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(POSITION$24);
         }

         var3.set(var1);
      }
   }

   public void unsetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(POSITION$24);
      }
   }

   public STImageAspect$Enum getAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASPECT$26);
         return var2 == null?null:(STImageAspect$Enum)var2.getEnumValue();
      }
   }

   public STImageAspect xgetAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STImageAspect var2 = null;
         var2 = (STImageAspect)this.get_store().find_attribute_user(ASPECT$26);
         return var2;
      }
   }

   public boolean isSetAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASPECT$26) != null;
      }
   }

   public void setAspect(STImageAspect$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ASPECT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ASPECT$26);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAspect(STImageAspect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STImageAspect var3 = null;
         var3 = (STImageAspect)this.get_store().find_attribute_user(ASPECT$26);
         if(var3 == null) {
            var3 = (STImageAspect)this.get_store().add_attribute_user(ASPECT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASPECT$26);
      }
   }

   public String getColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLORS$28);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(COLORS$28);
         return var2;
      }
   }

   public boolean isSetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLORS$28) != null;
      }
   }

   public void setColors(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLORS$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLORS$28);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColors(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(COLORS$28);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(COLORS$28);
         }

         var3.set(var1);
      }
   }

   public void unsetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLORS$28);
      }
   }

   public BigDecimal getAngle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANGLE$30);
         return var2 == null?null:var2.getBigDecimalValue();
      }
   }

   public XmlDecimal xgetAngle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var2 = null;
         var2 = (XmlDecimal)this.get_store().find_attribute_user(ANGLE$30);
         return var2;
      }
   }

   public boolean isSetAngle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANGLE$30) != null;
      }
   }

   public void setAngle(BigDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANGLE$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANGLE$30);
         }

         var3.setBigDecimalValue(var1);
      }
   }

   public void xsetAngle(XmlDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var3 = null;
         var3 = (XmlDecimal)this.get_store().find_attribute_user(ANGLE$30);
         if(var3 == null) {
            var3 = (XmlDecimal)this.get_store().add_attribute_user(ANGLE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetAngle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANGLE$30);
      }
   }

   public STTrueFalse.Enum getAlignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALIGNSHAPE$32);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetAlignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ALIGNSHAPE$32);
         return var2;
      }
   }

   public boolean isSetAlignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALIGNSHAPE$32) != null;
      }
   }

   public void setAlignshape(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALIGNSHAPE$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALIGNSHAPE$32);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlignshape(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ALIGNSHAPE$32);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ALIGNSHAPE$32);
         }

         var3.set(var1);
      }
   }

   public void unsetAlignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALIGNSHAPE$32);
      }
   }

   public String getFocus() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FOCUS$34);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetFocus() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(FOCUS$34);
         return var2;
      }
   }

   public boolean isSetFocus() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FOCUS$34) != null;
      }
   }

   public void setFocus(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FOCUS$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FOCUS$34);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFocus(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(FOCUS$34);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(FOCUS$34);
         }

         var3.set(var1);
      }
   }

   public void unsetFocus() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FOCUS$34);
      }
   }

   public String getFocussize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FOCUSSIZE$36);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetFocussize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(FOCUSSIZE$36);
         return var2;
      }
   }

   public boolean isSetFocussize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FOCUSSIZE$36) != null;
      }
   }

   public void setFocussize(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FOCUSSIZE$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FOCUSSIZE$36);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFocussize(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(FOCUSSIZE$36);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(FOCUSSIZE$36);
         }

         var3.set(var1);
      }
   }

   public void unsetFocussize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FOCUSSIZE$36);
      }
   }

   public String getFocusposition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FOCUSPOSITION$38);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetFocusposition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(FOCUSPOSITION$38);
         return var2;
      }
   }

   public boolean isSetFocusposition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FOCUSPOSITION$38) != null;
      }
   }

   public void setFocusposition(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FOCUSPOSITION$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FOCUSPOSITION$38);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFocusposition(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(FOCUSPOSITION$38);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(FOCUSPOSITION$38);
         }

         var3.set(var1);
      }
   }

   public void unsetFocusposition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FOCUSPOSITION$38);
      }
   }

   public STFillMethod$Enum getMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(METHOD$40);
         return var2 == null?null:(STFillMethod$Enum)var2.getEnumValue();
      }
   }

   public STFillMethod xgetMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillMethod var2 = null;
         var2 = (STFillMethod)this.get_store().find_attribute_user(METHOD$40);
         return var2;
      }
   }

   public boolean isSetMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(METHOD$40) != null;
      }
   }

   public void setMethod(STFillMethod$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(METHOD$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(METHOD$40);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetMethod(STFillMethod var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillMethod var3 = null;
         var3 = (STFillMethod)this.get_store().find_attribute_user(METHOD$40);
         if(var3 == null) {
            var3 = (STFillMethod)this.get_store().add_attribute_user(METHOD$40);
         }

         var3.set(var1);
      }
   }

   public void unsetMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(METHOD$40);
      }
   }

   public STTrueFalse$Enum getDetectmouseclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DETECTMOUSECLICK$42);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetDetectmouseclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DETECTMOUSECLICK$42);
         return var2;
      }
   }

   public boolean isSetDetectmouseclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DETECTMOUSECLICK$42) != null;
      }
   }

   public void setDetectmouseclick(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DETECTMOUSECLICK$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DETECTMOUSECLICK$42);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDetectmouseclick(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DETECTMOUSECLICK$42);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(DETECTMOUSECLICK$42);
         }

         var3.set(var1);
      }
   }

   public void unsetDetectmouseclick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DETECTMOUSECLICK$42);
      }
   }

   public String getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TITLE$44);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TITLE$44);
         return var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TITLE$44) != null;
      }
   }

   public void setTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TITLE$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TITLE$44);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTitle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TITLE$44);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TITLE$44);
         }

         var3.set(var1);
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TITLE$44);
      }
   }

   public String getOpacity2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPACITY2$46);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOpacity2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OPACITY2$46);
         return var2;
      }
   }

   public boolean isSetOpacity2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPACITY2$46) != null;
      }
   }

   public void setOpacity2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPACITY2$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPACITY2$46);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOpacity2(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OPACITY2$46);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OPACITY2$46);
         }

         var3.set(var1);
      }
   }

   public void unsetOpacity2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPACITY2$46);
      }
   }

   public STTrueFalse.Enum getRecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RECOLOR$48);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetRecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(RECOLOR$48);
         return var2;
      }
   }

   public boolean isSetRecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RECOLOR$48) != null;
      }
   }

   public void setRecolor(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RECOLOR$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RECOLOR$48);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetRecolor(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(RECOLOR$48);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(RECOLOR$48);
         }

         var3.set(var1);
      }
   }

   public void unsetRecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RECOLOR$48);
      }
   }

   public STTrueFalse.Enum getRotate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROTATE$50);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetRotate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ROTATE$50);
         return var2;
      }
   }

   public boolean isSetRotate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROTATE$50) != null;
      }
   }

   public void setRotate(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROTATE$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROTATE$50);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetRotate(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ROTATE$50);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ROTATE$50);
         }

         var3.set(var1);
      }
   }

   public void unsetRotate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROTATE$50);
      }
   }

   public String getId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID2$52);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID2$52);
         return var2;
      }
   }

   public boolean isSetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID2$52) != null;
      }
   }

   public void setId2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID2$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID2$52);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId2(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID2$52);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID2$52);
         }

         var3.set(var1);
      }
   }

   public void unsetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID2$52);
      }
   }

   public String getRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RELID$54);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public com.microsoft.schemas.office.office.STRelationshipId xgetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STRelationshipId var2 = null;
         var2 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().find_attribute_user(RELID$54);
         return var2;
      }
   }

   public boolean isSetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RELID$54) != null;
      }
   }

   public void setRelid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RELID$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RELID$54);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRelid(com.microsoft.schemas.office.office.STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STRelationshipId var3 = null;
         var3 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().find_attribute_user(RELID$54);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().add_attribute_user(RELID$54);
         }

         var3.set(var1);
      }
   }

   public void unsetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RELID$54);
      }
   }

}
