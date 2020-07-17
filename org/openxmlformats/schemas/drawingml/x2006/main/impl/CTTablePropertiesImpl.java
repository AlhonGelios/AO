package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;

public class CTTablePropertiesImpl extends XmlComplexContentImpl implements CTTableProperties {

   private static final QName NOFILL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
   private static final QName EFFECTLST$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
   private static final QName EFFECTDAG$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
   private static final QName TABLESTYLE$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tableStyle");
   private static final QName TABLESTYLEID$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tableStyleId");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName RTL$22 = new QName("", "rtl");
   private static final QName FIRSTROW$24 = new QName("", "firstRow");
   private static final QName FIRSTCOL$26 = new QName("", "firstCol");
   private static final QName LASTROW$28 = new QName("", "lastRow");
   private static final QName LASTCOL$30 = new QName("", "lastCol");
   private static final QName BANDROW$32 = new QName("", "bandRow");
   private static final QName BANDCOL$34 = new QName("", "bandCol");


   public CTTablePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$0) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$0);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$0);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$0, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$2) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$2);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$2);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$2, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$4) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$4);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$4);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$4, 0);
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$6) != 0;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$6, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$6);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$6);
         return var2;
      }
   }

   public void unsetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$6, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$8) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$8, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$8);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$8);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$8, 0);
      }
   }

   public CTGroupFillProperties getGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$10) != 0;
      }
   }

   public void setGrpFill(CTGroupFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$10, 0);
         if(var3 == null) {
            var3 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$10);
         }

         var3.set(var1);
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$10);
         return var2;
      }
   }

   public void unsetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$10, 0);
      }
   }

   public CTEffectList getEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTLST$12) != 0;
      }
   }

   public void setEffectLst(CTEffectList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var3 = null;
         var3 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$12, 0);
         if(var3 == null) {
            var3 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$12);
         }

         var3.set(var1);
      }
   }

   public CTEffectList addNewEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$12);
         return var2;
      }
   }

   public void unsetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTLST$12, 0);
      }
   }

   public CTEffectContainer getEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTDAG$14) != 0;
      }
   }

   public void setEffectDag(CTEffectContainer var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var3 = null;
         var3 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$14, 0);
         if(var3 == null) {
            var3 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$14);
         }

         var3.set(var1);
      }
   }

   public CTEffectContainer addNewEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$14);
         return var2;
      }
   }

   public void unsetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTDAG$14, 0);
      }
   }

   public CTTableStyle getTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var2 = null;
         var2 = (CTTableStyle)this.get_store().find_element_user(TABLESTYLE$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLESTYLE$16) != 0;
      }
   }

   public void setTableStyle(CTTableStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var3 = null;
         var3 = (CTTableStyle)this.get_store().find_element_user(TABLESTYLE$16, 0);
         if(var3 == null) {
            var3 = (CTTableStyle)this.get_store().add_element_user(TABLESTYLE$16);
         }

         var3.set(var1);
      }
   }

   public CTTableStyle addNewTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var2 = null;
         var2 = (CTTableStyle)this.get_store().add_element_user(TABLESTYLE$16);
         return var2;
      }
   }

   public void unsetTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLESTYLE$16, 0);
      }
   }

   public String getTableStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(TABLESTYLEID$18, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGuid xgetTableStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var2 = null;
         var2 = (STGuid)this.get_store().find_element_user(TABLESTYLEID$18, 0);
         return var2;
      }
   }

   public boolean isSetTableStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLESTYLEID$18) != 0;
      }
   }

   public void setTableStyleId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TABLESTYLEID$18, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(TABLESTYLEID$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTableStyleId(STGuid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var3 = null;
         var3 = (STGuid)this.get_store().find_element_user(TABLESTYLEID$18, 0);
         if(var3 == null) {
            var3 = (STGuid)this.get_store().add_element_user(TABLESTYLEID$18);
         }

         var3.set(var1);
      }
   }

   public void unsetTableStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLESTYLEID$18, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$20, 0);
      }
   }

   public boolean getRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RTL$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(RTL$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(RTL$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(RTL$22);
         }

         return var2;
      }
   }

   public boolean isSetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RTL$22) != null;
      }
   }

   public void setRtl(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RTL$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RTL$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRtl(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(RTL$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(RTL$22);
         }

         var3.set(var1);
      }
   }

   public void unsetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RTL$22);
      }
   }

   public boolean getFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTROW$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTROW$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FIRSTROW$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FIRSTROW$24);
         }

         return var2;
      }
   }

   public boolean isSetFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTROW$24) != null;
      }
   }

   public void setFirstRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIRSTROW$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIRSTROW$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFirstRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FIRSTROW$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FIRSTROW$24);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTROW$24);
      }
   }

   public boolean getFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTCOL$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTCOL$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FIRSTCOL$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FIRSTCOL$26);
         }

         return var2;
      }
   }

   public boolean isSetFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTCOL$26) != null;
      }
   }

   public void setFirstCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIRSTCOL$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIRSTCOL$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFirstCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FIRSTCOL$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FIRSTCOL$26);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTCOL$26);
      }
   }

   public boolean getLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LASTROW$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LASTROW$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LASTROW$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LASTROW$28);
         }

         return var2;
      }
   }

   public boolean isSetLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LASTROW$28) != null;
      }
   }

   public void setLastRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LASTROW$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LASTROW$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLastRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LASTROW$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LASTROW$28);
         }

         var3.set(var1);
      }
   }

   public void unsetLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LASTROW$28);
      }
   }

   public boolean getLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LASTCOL$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LASTCOL$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LASTCOL$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LASTCOL$30);
         }

         return var2;
      }
   }

   public boolean isSetLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LASTCOL$30) != null;
      }
   }

   public void setLastCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LASTCOL$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LASTCOL$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLastCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LASTCOL$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LASTCOL$30);
         }

         var3.set(var1);
      }
   }

   public void unsetLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LASTCOL$30);
      }
   }

   public boolean getBandRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BANDROW$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BANDROW$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBandRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BANDROW$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BANDROW$32);
         }

         return var2;
      }
   }

   public boolean isSetBandRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BANDROW$32) != null;
      }
   }

   public void setBandRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BANDROW$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BANDROW$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBandRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BANDROW$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BANDROW$32);
         }

         var3.set(var1);
      }
   }

   public void unsetBandRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BANDROW$32);
      }
   }

   public boolean getBandCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BANDCOL$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BANDCOL$34);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBandCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BANDCOL$34);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BANDCOL$34);
         }

         return var2;
      }
   }

   public boolean isSetBandCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BANDCOL$34) != null;
      }
   }

   public void setBandCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BANDCOL$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BANDCOL$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBandCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BANDCOL$34);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BANDCOL$34);
         }

         var3.set(var1);
      }
   }

   public void unsetBandCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BANDCOL$34);
      }
   }

}
