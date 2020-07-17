package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.office.STConnectType;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.STTrueFalse;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTPathImpl extends XmlComplexContentImpl implements CTPath {

   private static final QName ID$0 = new QName("", "id");
   private static final QName V$2 = new QName("", "v");
   private static final QName LIMO$4 = new QName("", "limo");
   private static final QName TEXTBOXRECT$6 = new QName("", "textboxrect");
   private static final QName FILLOK$8 = new QName("", "fillok");
   private static final QName STROKEOK$10 = new QName("", "strokeok");
   private static final QName SHADOWOK$12 = new QName("", "shadowok");
   private static final QName ARROWOK$14 = new QName("", "arrowok");
   private static final QName GRADIENTSHAPEOK$16 = new QName("", "gradientshapeok");
   private static final QName TEXTPATHOK$18 = new QName("", "textpathok");
   private static final QName INSETPENOK$20 = new QName("", "insetpenok");
   private static final QName CONNECTTYPE$22 = new QName("urn:schemas-microsoft-com:office:office", "connecttype");
   private static final QName CONNECTLOCS$24 = new QName("urn:schemas-microsoft-com:office:office", "connectlocs");
   private static final QName CONNECTANGLES$26 = new QName("urn:schemas-microsoft-com:office:office", "connectangles");
   private static final QName EXTRUSIONOK$28 = new QName("urn:schemas-microsoft-com:office:office", "extrusionok");


   public CTPathImpl(SchemaType var1) {
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

   public String getV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(V$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(V$2);
         return var2;
      }
   }

   public boolean isSetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(V$2) != null;
      }
   }

   public void setV(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(V$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(V$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetV(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(V$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(V$2);
         }

         var3.set(var1);
      }
   }

   public void unsetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(V$2);
      }
   }

   public String getLimo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LIMO$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetLimo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(LIMO$4);
         return var2;
      }
   }

   public boolean isSetLimo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LIMO$4) != null;
      }
   }

   public void setLimo(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LIMO$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LIMO$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLimo(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(LIMO$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(LIMO$4);
         }

         var3.set(var1);
      }
   }

   public void unsetLimo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LIMO$4);
      }
   }

   public String getTextboxrect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXTBOXRECT$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTextboxrect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TEXTBOXRECT$6);
         return var2;
      }
   }

   public boolean isSetTextboxrect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXTBOXRECT$6) != null;
      }
   }

   public void setTextboxrect(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TEXTBOXRECT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TEXTBOXRECT$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTextboxrect(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TEXTBOXRECT$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TEXTBOXRECT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetTextboxrect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXTBOXRECT$6);
      }
   }

   public STTrueFalse.Enum getFillok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLOK$8);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetFillok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(FILLOK$8);
         return var2;
      }
   }

   public boolean isSetFillok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLOK$8) != null;
      }
   }

   public void setFillok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLOK$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLOK$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFillok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(FILLOK$8);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(FILLOK$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFillok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLOK$8);
      }
   }

   public STTrueFalse.Enum getStrokeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STROKEOK$10);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetStrokeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(STROKEOK$10);
         return var2;
      }
   }

   public boolean isSetStrokeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STROKEOK$10) != null;
      }
   }

   public void setStrokeok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STROKEOK$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STROKEOK$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStrokeok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(STROKEOK$10);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(STROKEOK$10);
         }

         var3.set(var1);
      }
   }

   public void unsetStrokeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STROKEOK$10);
      }
   }

   public STTrueFalse.Enum getShadowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHADOWOK$12);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetShadowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(SHADOWOK$12);
         return var2;
      }
   }

   public boolean isSetShadowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHADOWOK$12) != null;
      }
   }

   public void setShadowok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHADOWOK$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHADOWOK$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetShadowok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(SHADOWOK$12);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(SHADOWOK$12);
         }

         var3.set(var1);
      }
   }

   public void unsetShadowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHADOWOK$12);
      }
   }

   public STTrueFalse.Enum getArrowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ARROWOK$14);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetArrowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ARROWOK$14);
         return var2;
      }
   }

   public boolean isSetArrowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ARROWOK$14) != null;
      }
   }

   public void setArrowok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ARROWOK$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ARROWOK$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetArrowok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ARROWOK$14);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ARROWOK$14);
         }

         var3.set(var1);
      }
   }

   public void unsetArrowok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ARROWOK$14);
      }
   }

   public STTrueFalse.Enum getGradientshapeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRADIENTSHAPEOK$16);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetGradientshapeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(GRADIENTSHAPEOK$16);
         return var2;
      }
   }

   public boolean isSetGradientshapeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRADIENTSHAPEOK$16) != null;
      }
   }

   public void setGradientshapeok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRADIENTSHAPEOK$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRADIENTSHAPEOK$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetGradientshapeok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(GRADIENTSHAPEOK$16);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(GRADIENTSHAPEOK$16);
         }

         var3.set(var1);
      }
   }

   public void unsetGradientshapeok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRADIENTSHAPEOK$16);
      }
   }

   public STTrueFalse.Enum getTextpathok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXTPATHOK$18);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetTextpathok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(TEXTPATHOK$18);
         return var2;
      }
   }

   public boolean isSetTextpathok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXTPATHOK$18) != null;
      }
   }

   public void setTextpathok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TEXTPATHOK$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TEXTPATHOK$18);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTextpathok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(TEXTPATHOK$18);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(TEXTPATHOK$18);
         }

         var3.set(var1);
      }
   }

   public void unsetTextpathok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXTPATHOK$18);
      }
   }

   public STTrueFalse.Enum getInsetpenok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETPENOK$20);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetInsetpenok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(INSETPENOK$20);
         return var2;
      }
   }

   public boolean isSetInsetpenok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETPENOK$20) != null;
      }
   }

   public void setInsetpenok(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETPENOK$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETPENOK$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetpenok(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(INSETPENOK$20);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(INSETPENOK$20);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetpenok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETPENOK$20);
      }
   }

   public STConnectType.Enum getConnecttype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTTYPE$22);
         return var2 == null?null:(STConnectType.Enum)var2.getEnumValue();
      }
   }

   public STConnectType xgetConnecttype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConnectType var2 = null;
         var2 = (STConnectType)this.get_store().find_attribute_user(CONNECTTYPE$22);
         return var2;
      }
   }

   public boolean isSetConnecttype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTTYPE$22) != null;
      }
   }

   public void setConnecttype(STConnectType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONNECTTYPE$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONNECTTYPE$22);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetConnecttype(STConnectType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConnectType var3 = null;
         var3 = (STConnectType)this.get_store().find_attribute_user(CONNECTTYPE$22);
         if(var3 == null) {
            var3 = (STConnectType)this.get_store().add_attribute_user(CONNECTTYPE$22);
         }

         var3.set(var1);
      }
   }

   public void unsetConnecttype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTTYPE$22);
      }
   }

   public String getConnectlocs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTLOCS$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetConnectlocs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CONNECTLOCS$24);
         return var2;
      }
   }

   public boolean isSetConnectlocs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTLOCS$24) != null;
      }
   }

   public void setConnectlocs(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONNECTLOCS$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONNECTLOCS$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetConnectlocs(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CONNECTLOCS$24);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CONNECTLOCS$24);
         }

         var3.set(var1);
      }
   }

   public void unsetConnectlocs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTLOCS$24);
      }
   }

   public String getConnectangles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTANGLES$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetConnectangles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CONNECTANGLES$26);
         return var2;
      }
   }

   public boolean isSetConnectangles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTANGLES$26) != null;
      }
   }

   public void setConnectangles(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONNECTANGLES$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONNECTANGLES$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetConnectangles(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CONNECTANGLES$26);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CONNECTANGLES$26);
         }

         var3.set(var1);
      }
   }

   public void unsetConnectangles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTANGLES$26);
      }
   }

   public STTrueFalse$Enum getExtrusionok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EXTRUSIONOK$28);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetExtrusionok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(EXTRUSIONOK$28);
         return var2;
      }
   }

   public boolean isSetExtrusionok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EXTRUSIONOK$28) != null;
      }
   }

   public void setExtrusionok(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EXTRUSIONOK$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EXTRUSIONOK$28);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetExtrusionok(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(EXTRUSIONOK$28);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(EXTRUSIONOK$28);
         }

         var3.set(var1);
      }
   }

   public void unsetExtrusionok() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EXTRUSIONOK$28);
      }
   }

}
