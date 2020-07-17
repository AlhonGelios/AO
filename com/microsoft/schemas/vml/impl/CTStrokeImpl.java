package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.office.CTStrokeChild;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.vml.CTStroke;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STFillType;
import com.microsoft.schemas.vml.STFillType$Enum;
import com.microsoft.schemas.vml.STImageAspect;
import com.microsoft.schemas.vml.STImageAspect$Enum;
import com.microsoft.schemas.vml.STStrokeArrowLength;
import com.microsoft.schemas.vml.STStrokeArrowLength$Enum;
import com.microsoft.schemas.vml.STStrokeArrowType;
import com.microsoft.schemas.vml.STStrokeArrowType$Enum;
import com.microsoft.schemas.vml.STStrokeArrowWidth;
import com.microsoft.schemas.vml.STStrokeArrowWidth$Enum;
import com.microsoft.schemas.vml.STStrokeEndCap;
import com.microsoft.schemas.vml.STStrokeEndCap$Enum;
import com.microsoft.schemas.vml.STStrokeJoinStyle;
import com.microsoft.schemas.vml.STStrokeLineStyle;
import com.microsoft.schemas.vml.STStrokeLineStyle$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import java.math.BigDecimal;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;

public class CTStrokeImpl extends XmlComplexContentImpl implements CTStroke {

   private static final QName LEFT$0 = new QName("urn:schemas-microsoft-com:office:office", "left");
   private static final QName TOP$2 = new QName("urn:schemas-microsoft-com:office:office", "top");
   private static final QName RIGHT$4 = new QName("urn:schemas-microsoft-com:office:office", "right");
   private static final QName BOTTOM$6 = new QName("urn:schemas-microsoft-com:office:office", "bottom");
   private static final QName COLUMN$8 = new QName("urn:schemas-microsoft-com:office:office", "column");
   private static final QName ID$10 = new QName("", "id");
   private static final QName ON$12 = new QName("", "on");
   private static final QName WEIGHT$14 = new QName("", "weight");
   private static final QName COLOR$16 = new QName("", "color");
   private static final QName OPACITY$18 = new QName("", "opacity");
   private static final QName LINESTYLE$20 = new QName("", "linestyle");
   private static final QName MITERLIMIT$22 = new QName("", "miterlimit");
   private static final QName JOINSTYLE$24 = new QName("", "joinstyle");
   private static final QName ENDCAP$26 = new QName("", "endcap");
   private static final QName DASHSTYLE$28 = new QName("", "dashstyle");
   private static final QName FILLTYPE$30 = new QName("", "filltype");
   private static final QName SRC$32 = new QName("", "src");
   private static final QName IMAGEASPECT$34 = new QName("", "imageaspect");
   private static final QName IMAGESIZE$36 = new QName("", "imagesize");
   private static final QName IMAGEALIGNSHAPE$38 = new QName("", "imagealignshape");
   private static final QName COLOR2$40 = new QName("", "color2");
   private static final QName STARTARROW$42 = new QName("", "startarrow");
   private static final QName STARTARROWWIDTH$44 = new QName("", "startarrowwidth");
   private static final QName STARTARROWLENGTH$46 = new QName("", "startarrowlength");
   private static final QName ENDARROW$48 = new QName("", "endarrow");
   private static final QName ENDARROWWIDTH$50 = new QName("", "endarrowwidth");
   private static final QName ENDARROWLENGTH$52 = new QName("", "endarrowlength");
   private static final QName HREF$54 = new QName("urn:schemas-microsoft-com:office:office", "href");
   private static final QName ALTHREF$56 = new QName("urn:schemas-microsoft-com:office:office", "althref");
   private static final QName TITLE$58 = new QName("urn:schemas-microsoft-com:office:office", "title");
   private static final QName FORCEDASH$60 = new QName("urn:schemas-microsoft-com:office:office", "forcedash");
   private static final QName ID2$62 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
   private static final QName INSETPEN$64 = new QName("", "insetpen");
   private static final QName RELID$66 = new QName("urn:schemas-microsoft-com:office:office", "relid");


   public CTStrokeImpl(SchemaType var1) {
      super(var1);
   }

   public CTStrokeChild getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().find_element_user(LEFT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEFT$0) != 0;
      }
   }

   public void setLeft(CTStrokeChild var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var3 = null;
         var3 = (CTStrokeChild)this.get_store().find_element_user(LEFT$0, 0);
         if(var3 == null) {
            var3 = (CTStrokeChild)this.get_store().add_element_user(LEFT$0);
         }

         var3.set(var1);
      }
   }

   public CTStrokeChild addNewLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().add_element_user(LEFT$0);
         return var2;
      }
   }

   public void unsetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEFT$0, 0);
      }
   }

   public CTStrokeChild getTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().find_element_user(TOP$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOP$2) != 0;
      }
   }

   public void setTop(CTStrokeChild var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var3 = null;
         var3 = (CTStrokeChild)this.get_store().find_element_user(TOP$2, 0);
         if(var3 == null) {
            var3 = (CTStrokeChild)this.get_store().add_element_user(TOP$2);
         }

         var3.set(var1);
      }
   }

   public CTStrokeChild addNewTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().add_element_user(TOP$2);
         return var2;
      }
   }

   public void unsetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOP$2, 0);
      }
   }

   public CTStrokeChild getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().find_element_user(RIGHT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RIGHT$4) != 0;
      }
   }

   public void setRight(CTStrokeChild var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var3 = null;
         var3 = (CTStrokeChild)this.get_store().find_element_user(RIGHT$4, 0);
         if(var3 == null) {
            var3 = (CTStrokeChild)this.get_store().add_element_user(RIGHT$4);
         }

         var3.set(var1);
      }
   }

   public CTStrokeChild addNewRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().add_element_user(RIGHT$4);
         return var2;
      }
   }

   public void unsetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RIGHT$4, 0);
      }
   }

   public CTStrokeChild getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().find_element_user(BOTTOM$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOTTOM$6) != 0;
      }
   }

   public void setBottom(CTStrokeChild var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var3 = null;
         var3 = (CTStrokeChild)this.get_store().find_element_user(BOTTOM$6, 0);
         if(var3 == null) {
            var3 = (CTStrokeChild)this.get_store().add_element_user(BOTTOM$6);
         }

         var3.set(var1);
      }
   }

   public CTStrokeChild addNewBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().add_element_user(BOTTOM$6);
         return var2;
      }
   }

   public void unsetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOTTOM$6, 0);
      }
   }

   public CTStrokeChild getColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().find_element_user(COLUMN$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLUMN$8) != 0;
      }
   }

   public void setColumn(CTStrokeChild var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var3 = null;
         var3 = (CTStrokeChild)this.get_store().find_element_user(COLUMN$8, 0);
         if(var3 == null) {
            var3 = (CTStrokeChild)this.get_store().add_element_user(COLUMN$8);
         }

         var3.set(var1);
      }
   }

   public CTStrokeChild addNewColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrokeChild var2 = null;
         var2 = (CTStrokeChild)this.get_store().add_element_user(COLUMN$8);
         return var2;
      }
   }

   public void unsetColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLUMN$8, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$10);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$10) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$10);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$10);
      }
   }

   public STTrueFalse.Enum getOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ON$12);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ON$12);
         return var2;
      }
   }

   public boolean isSetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ON$12) != null;
      }
   }

   public void setOn(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ON$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ON$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOn(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ON$12);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ON$12);
         }

         var3.set(var1);
      }
   }

   public void unsetOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ON$12);
      }
   }

   public String getWeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WEIGHT$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetWeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(WEIGHT$14);
         return var2;
      }
   }

   public boolean isSetWeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WEIGHT$14) != null;
      }
   }

   public void setWeight(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WEIGHT$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WEIGHT$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetWeight(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(WEIGHT$14);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(WEIGHT$14);
         }

         var3.set(var1);
      }
   }

   public void unsetWeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WEIGHT$14);
      }
   }

   public String getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(COLOR$16);
         return var2;
      }
   }

   public boolean isSetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR$16) != null;
      }
   }

   public void setColor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColor(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(COLOR$16);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(COLOR$16);
         }

         var3.set(var1);
      }
   }

   public void unsetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR$16);
      }
   }

   public String getOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OPACITY$18);
         return var2;
      }
   }

   public boolean isSetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPACITY$18) != null;
      }
   }

   public void setOpacity(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPACITY$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOpacity(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OPACITY$18);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OPACITY$18);
         }

         var3.set(var1);
      }
   }

   public void unsetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPACITY$18);
      }
   }

   public STStrokeLineStyle$Enum getLinestyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINESTYLE$20);
         return var2 == null?null:(STStrokeLineStyle$Enum)var2.getEnumValue();
      }
   }

   public STStrokeLineStyle xgetLinestyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeLineStyle var2 = null;
         var2 = (STStrokeLineStyle)this.get_store().find_attribute_user(LINESTYLE$20);
         return var2;
      }
   }

   public boolean isSetLinestyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINESTYLE$20) != null;
      }
   }

   public void setLinestyle(STStrokeLineStyle$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINESTYLE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINESTYLE$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLinestyle(STStrokeLineStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeLineStyle var3 = null;
         var3 = (STStrokeLineStyle)this.get_store().find_attribute_user(LINESTYLE$20);
         if(var3 == null) {
            var3 = (STStrokeLineStyle)this.get_store().add_attribute_user(LINESTYLE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetLinestyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINESTYLE$20);
      }
   }

   public BigDecimal getMiterlimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MITERLIMIT$22);
         return var2 == null?null:var2.getBigDecimalValue();
      }
   }

   public XmlDecimal xgetMiterlimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var2 = null;
         var2 = (XmlDecimal)this.get_store().find_attribute_user(MITERLIMIT$22);
         return var2;
      }
   }

   public boolean isSetMiterlimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MITERLIMIT$22) != null;
      }
   }

   public void setMiterlimit(BigDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MITERLIMIT$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MITERLIMIT$22);
         }

         var3.setBigDecimalValue(var1);
      }
   }

   public void xsetMiterlimit(XmlDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var3 = null;
         var3 = (XmlDecimal)this.get_store().find_attribute_user(MITERLIMIT$22);
         if(var3 == null) {
            var3 = (XmlDecimal)this.get_store().add_attribute_user(MITERLIMIT$22);
         }

         var3.set(var1);
      }
   }

   public void unsetMiterlimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MITERLIMIT$22);
      }
   }

   public STStrokeJoinStyle.Enum getJoinstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(JOINSTYLE$24);
         return var2 == null?null:(STStrokeJoinStyle.Enum)var2.getEnumValue();
      }
   }

   public STStrokeJoinStyle xgetJoinstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeJoinStyle var2 = null;
         var2 = (STStrokeJoinStyle)this.get_store().find_attribute_user(JOINSTYLE$24);
         return var2;
      }
   }

   public boolean isSetJoinstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(JOINSTYLE$24) != null;
      }
   }

   public void setJoinstyle(STStrokeJoinStyle.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(JOINSTYLE$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(JOINSTYLE$24);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetJoinstyle(STStrokeJoinStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeJoinStyle var3 = null;
         var3 = (STStrokeJoinStyle)this.get_store().find_attribute_user(JOINSTYLE$24);
         if(var3 == null) {
            var3 = (STStrokeJoinStyle)this.get_store().add_attribute_user(JOINSTYLE$24);
         }

         var3.set(var1);
      }
   }

   public void unsetJoinstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(JOINSTYLE$24);
      }
   }

   public STStrokeEndCap$Enum getEndcap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENDCAP$26);
         return var2 == null?null:(STStrokeEndCap$Enum)var2.getEnumValue();
      }
   }

   public STStrokeEndCap xgetEndcap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeEndCap var2 = null;
         var2 = (STStrokeEndCap)this.get_store().find_attribute_user(ENDCAP$26);
         return var2;
      }
   }

   public boolean isSetEndcap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENDCAP$26) != null;
      }
   }

   public void setEndcap(STStrokeEndCap$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENDCAP$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENDCAP$26);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEndcap(STStrokeEndCap var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeEndCap var3 = null;
         var3 = (STStrokeEndCap)this.get_store().find_attribute_user(ENDCAP$26);
         if(var3 == null) {
            var3 = (STStrokeEndCap)this.get_store().add_attribute_user(ENDCAP$26);
         }

         var3.set(var1);
      }
   }

   public void unsetEndcap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENDCAP$26);
      }
   }

   public String getDashstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DASHSTYLE$28);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetDashstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(DASHSTYLE$28);
         return var2;
      }
   }

   public boolean isSetDashstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DASHSTYLE$28) != null;
      }
   }

   public void setDashstyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DASHSTYLE$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DASHSTYLE$28);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDashstyle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(DASHSTYLE$28);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(DASHSTYLE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetDashstyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DASHSTYLE$28);
      }
   }

   public STFillType$Enum getFilltype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLTYPE$30);
         return var2 == null?null:(STFillType$Enum)var2.getEnumValue();
      }
   }

   public STFillType xgetFilltype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillType var2 = null;
         var2 = (STFillType)this.get_store().find_attribute_user(FILLTYPE$30);
         return var2;
      }
   }

   public boolean isSetFilltype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLTYPE$30) != null;
      }
   }

   public void setFilltype(STFillType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLTYPE$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLTYPE$30);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFilltype(STFillType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillType var3 = null;
         var3 = (STFillType)this.get_store().find_attribute_user(FILLTYPE$30);
         if(var3 == null) {
            var3 = (STFillType)this.get_store().add_attribute_user(FILLTYPE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetFilltype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLTYPE$30);
      }
   }

   public String getSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SRC$32);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SRC$32);
         return var2;
      }
   }

   public boolean isSetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SRC$32) != null;
      }
   }

   public void setSrc(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SRC$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SRC$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSrc(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SRC$32);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SRC$32);
         }

         var3.set(var1);
      }
   }

   public void unsetSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SRC$32);
      }
   }

   public STImageAspect$Enum getImageaspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IMAGEASPECT$34);
         return var2 == null?null:(STImageAspect$Enum)var2.getEnumValue();
      }
   }

   public STImageAspect xgetImageaspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STImageAspect var2 = null;
         var2 = (STImageAspect)this.get_store().find_attribute_user(IMAGEASPECT$34);
         return var2;
      }
   }

   public boolean isSetImageaspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IMAGEASPECT$34) != null;
      }
   }

   public void setImageaspect(STImageAspect$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(IMAGEASPECT$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(IMAGEASPECT$34);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetImageaspect(STImageAspect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STImageAspect var3 = null;
         var3 = (STImageAspect)this.get_store().find_attribute_user(IMAGEASPECT$34);
         if(var3 == null) {
            var3 = (STImageAspect)this.get_store().add_attribute_user(IMAGEASPECT$34);
         }

         var3.set(var1);
      }
   }

   public void unsetImageaspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IMAGEASPECT$34);
      }
   }

   public String getImagesize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IMAGESIZE$36);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetImagesize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(IMAGESIZE$36);
         return var2;
      }
   }

   public boolean isSetImagesize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IMAGESIZE$36) != null;
      }
   }

   public void setImagesize(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(IMAGESIZE$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(IMAGESIZE$36);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetImagesize(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(IMAGESIZE$36);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(IMAGESIZE$36);
         }

         var3.set(var1);
      }
   }

   public void unsetImagesize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IMAGESIZE$36);
      }
   }

   public STTrueFalse.Enum getImagealignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetImagealignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
         return var2;
      }
   }

   public boolean isSetImagealignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IMAGEALIGNSHAPE$38) != null;
      }
   }

   public void setImagealignshape(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(IMAGEALIGNSHAPE$38);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetImagealignshape(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(IMAGEALIGNSHAPE$38);
         }

         var3.set(var1);
      }
   }

   public void unsetImagealignshape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IMAGEALIGNSHAPE$38);
      }
   }

   public String getColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$40);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(COLOR2$40);
         return var2;
      }
   }

   public boolean isSetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR2$40) != null;
      }
   }

   public void setColor2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR2$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR2$40);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColor2(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(COLOR2$40);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(COLOR2$40);
         }

         var3.set(var1);
      }
   }

   public void unsetColor2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR2$40);
      }
   }

   public STStrokeArrowType$Enum getStartarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STARTARROW$42);
         return var2 == null?null:(STStrokeArrowType$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowType xgetStartarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowType var2 = null;
         var2 = (STStrokeArrowType)this.get_store().find_attribute_user(STARTARROW$42);
         return var2;
      }
   }

   public boolean isSetStartarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STARTARROW$42) != null;
      }
   }

   public void setStartarrow(STStrokeArrowType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STARTARROW$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STARTARROW$42);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStartarrow(STStrokeArrowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowType var3 = null;
         var3 = (STStrokeArrowType)this.get_store().find_attribute_user(STARTARROW$42);
         if(var3 == null) {
            var3 = (STStrokeArrowType)this.get_store().add_attribute_user(STARTARROW$42);
         }

         var3.set(var1);
      }
   }

   public void unsetStartarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STARTARROW$42);
      }
   }

   public STStrokeArrowWidth$Enum getStartarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STARTARROWWIDTH$44);
         return var2 == null?null:(STStrokeArrowWidth$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowWidth xgetStartarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowWidth var2 = null;
         var2 = (STStrokeArrowWidth)this.get_store().find_attribute_user(STARTARROWWIDTH$44);
         return var2;
      }
   }

   public boolean isSetStartarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STARTARROWWIDTH$44) != null;
      }
   }

   public void setStartarrowwidth(STStrokeArrowWidth$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STARTARROWWIDTH$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STARTARROWWIDTH$44);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStartarrowwidth(STStrokeArrowWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowWidth var3 = null;
         var3 = (STStrokeArrowWidth)this.get_store().find_attribute_user(STARTARROWWIDTH$44);
         if(var3 == null) {
            var3 = (STStrokeArrowWidth)this.get_store().add_attribute_user(STARTARROWWIDTH$44);
         }

         var3.set(var1);
      }
   }

   public void unsetStartarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STARTARROWWIDTH$44);
      }
   }

   public STStrokeArrowLength$Enum getStartarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STARTARROWLENGTH$46);
         return var2 == null?null:(STStrokeArrowLength$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowLength xgetStartarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowLength var2 = null;
         var2 = (STStrokeArrowLength)this.get_store().find_attribute_user(STARTARROWLENGTH$46);
         return var2;
      }
   }

   public boolean isSetStartarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STARTARROWLENGTH$46) != null;
      }
   }

   public void setStartarrowlength(STStrokeArrowLength$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STARTARROWLENGTH$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STARTARROWLENGTH$46);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStartarrowlength(STStrokeArrowLength var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowLength var3 = null;
         var3 = (STStrokeArrowLength)this.get_store().find_attribute_user(STARTARROWLENGTH$46);
         if(var3 == null) {
            var3 = (STStrokeArrowLength)this.get_store().add_attribute_user(STARTARROWLENGTH$46);
         }

         var3.set(var1);
      }
   }

   public void unsetStartarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STARTARROWLENGTH$46);
      }
   }

   public STStrokeArrowType$Enum getEndarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENDARROW$48);
         return var2 == null?null:(STStrokeArrowType$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowType xgetEndarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowType var2 = null;
         var2 = (STStrokeArrowType)this.get_store().find_attribute_user(ENDARROW$48);
         return var2;
      }
   }

   public boolean isSetEndarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENDARROW$48) != null;
      }
   }

   public void setEndarrow(STStrokeArrowType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENDARROW$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENDARROW$48);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEndarrow(STStrokeArrowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowType var3 = null;
         var3 = (STStrokeArrowType)this.get_store().find_attribute_user(ENDARROW$48);
         if(var3 == null) {
            var3 = (STStrokeArrowType)this.get_store().add_attribute_user(ENDARROW$48);
         }

         var3.set(var1);
      }
   }

   public void unsetEndarrow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENDARROW$48);
      }
   }

   public STStrokeArrowWidth$Enum getEndarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENDARROWWIDTH$50);
         return var2 == null?null:(STStrokeArrowWidth$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowWidth xgetEndarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowWidth var2 = null;
         var2 = (STStrokeArrowWidth)this.get_store().find_attribute_user(ENDARROWWIDTH$50);
         return var2;
      }
   }

   public boolean isSetEndarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENDARROWWIDTH$50) != null;
      }
   }

   public void setEndarrowwidth(STStrokeArrowWidth$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENDARROWWIDTH$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENDARROWWIDTH$50);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEndarrowwidth(STStrokeArrowWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowWidth var3 = null;
         var3 = (STStrokeArrowWidth)this.get_store().find_attribute_user(ENDARROWWIDTH$50);
         if(var3 == null) {
            var3 = (STStrokeArrowWidth)this.get_store().add_attribute_user(ENDARROWWIDTH$50);
         }

         var3.set(var1);
      }
   }

   public void unsetEndarrowwidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENDARROWWIDTH$50);
      }
   }

   public STStrokeArrowLength$Enum getEndarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENDARROWLENGTH$52);
         return var2 == null?null:(STStrokeArrowLength$Enum)var2.getEnumValue();
      }
   }

   public STStrokeArrowLength xgetEndarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowLength var2 = null;
         var2 = (STStrokeArrowLength)this.get_store().find_attribute_user(ENDARROWLENGTH$52);
         return var2;
      }
   }

   public boolean isSetEndarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENDARROWLENGTH$52) != null;
      }
   }

   public void setEndarrowlength(STStrokeArrowLength$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENDARROWLENGTH$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENDARROWLENGTH$52);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEndarrowlength(STStrokeArrowLength var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStrokeArrowLength var3 = null;
         var3 = (STStrokeArrowLength)this.get_store().find_attribute_user(ENDARROWLENGTH$52);
         if(var3 == null) {
            var3 = (STStrokeArrowLength)this.get_store().add_attribute_user(ENDARROWLENGTH$52);
         }

         var3.set(var1);
      }
   }

   public void unsetEndarrowlength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENDARROWLENGTH$52);
      }
   }

   public String getHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HREF$54);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(HREF$54);
         return var2;
      }
   }

   public boolean isSetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HREF$54) != null;
      }
   }

   public void setHref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HREF$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HREF$54);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(HREF$54);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(HREF$54);
         }

         var3.set(var1);
      }
   }

   public void unsetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HREF$54);
      }
   }

   public String getAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALTHREF$56);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ALTHREF$56);
         return var2;
      }
   }

   public boolean isSetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALTHREF$56) != null;
      }
   }

   public void setAlthref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALTHREF$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALTHREF$56);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlthref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ALTHREF$56);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ALTHREF$56);
         }

         var3.set(var1);
      }
   }

   public void unsetAlthref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALTHREF$56);
      }
   }

   public String getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TITLE$58);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TITLE$58);
         return var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TITLE$58) != null;
      }
   }

   public void setTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TITLE$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TITLE$58);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTitle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TITLE$58);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TITLE$58);
         }

         var3.set(var1);
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TITLE$58);
      }
   }

   public STTrueFalse$Enum getForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORCEDASH$60);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(FORCEDASH$60);
         return var2;
      }
   }

   public boolean isSetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORCEDASH$60) != null;
      }
   }

   public void setForcedash(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORCEDASH$60);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORCEDASH$60);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetForcedash(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(FORCEDASH$60);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(FORCEDASH$60);
         }

         var3.set(var1);
      }
   }

   public void unsetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORCEDASH$60);
      }
   }

   public String getId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID2$62);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID2$62);
         return var2;
      }
   }

   public boolean isSetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID2$62) != null;
      }
   }

   public void setId2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID2$62);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID2$62);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId2(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID2$62);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID2$62);
         }

         var3.set(var1);
      }
   }

   public void unsetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID2$62);
      }
   }

   public STTrueFalse.Enum getInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETPEN$64);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(INSETPEN$64);
         return var2;
      }
   }

   public boolean isSetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETPEN$64) != null;
      }
   }

   public void setInsetpen(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETPEN$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETPEN$64);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetpen(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(INSETPEN$64);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(INSETPEN$64);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETPEN$64);
      }
   }

   public String getRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RELID$66);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public com.microsoft.schemas.office.office.STRelationshipId xgetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STRelationshipId var2 = null;
         var2 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().find_attribute_user(RELID$66);
         return var2;
      }
   }

   public boolean isSetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RELID$66) != null;
      }
   }

   public void setRelid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RELID$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RELID$66);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRelid(com.microsoft.schemas.office.office.STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STRelationshipId var3 = null;
         var3 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().find_attribute_user(RELID$66);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STRelationshipId)this.get_store().add_attribute_user(RELID$66);
         }

         var3.set(var1);
      }
   }

   public void unsetRelid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RELID$66);
      }
   }

}
