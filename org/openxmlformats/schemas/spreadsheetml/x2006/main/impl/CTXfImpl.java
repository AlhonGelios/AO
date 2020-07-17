package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;

public class CTXfImpl extends XmlComplexContentImpl implements CTXf {

   private static final QName ALIGNMENT$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "alignment");
   private static final QName PROTECTION$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protection");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName NUMFMTID$6 = new QName("", "numFmtId");
   private static final QName FONTID$8 = new QName("", "fontId");
   private static final QName FILLID$10 = new QName("", "fillId");
   private static final QName BORDERID$12 = new QName("", "borderId");
   private static final QName XFID$14 = new QName("", "xfId");
   private static final QName QUOTEPREFIX$16 = new QName("", "quotePrefix");
   private static final QName PIVOTBUTTON$18 = new QName("", "pivotButton");
   private static final QName APPLYNUMBERFORMAT$20 = new QName("", "applyNumberFormat");
   private static final QName APPLYFONT$22 = new QName("", "applyFont");
   private static final QName APPLYFILL$24 = new QName("", "applyFill");
   private static final QName APPLYBORDER$26 = new QName("", "applyBorder");
   private static final QName APPLYALIGNMENT$28 = new QName("", "applyAlignment");
   private static final QName APPLYPROTECTION$30 = new QName("", "applyProtection");


   public CTXfImpl(SchemaType var1) {
      super(var1);
   }

   public CTCellAlignment getAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var2 = null;
         var2 = (CTCellAlignment)this.get_store().find_element_user(ALIGNMENT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALIGNMENT$0) != 0;
      }
   }

   public void setAlignment(CTCellAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var3 = null;
         var3 = (CTCellAlignment)this.get_store().find_element_user(ALIGNMENT$0, 0);
         if(var3 == null) {
            var3 = (CTCellAlignment)this.get_store().add_element_user(ALIGNMENT$0);
         }

         var3.set(var1);
      }
   }

   public CTCellAlignment addNewAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var2 = null;
         var2 = (CTCellAlignment)this.get_store().add_element_user(ALIGNMENT$0);
         return var2;
      }
   }

   public void unsetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALIGNMENT$0, 0);
      }
   }

   public CTCellProtection getProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var2 = null;
         var2 = (CTCellProtection)this.get_store().find_element_user(PROTECTION$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTION$2) != 0;
      }
   }

   public void setProtection(CTCellProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var3 = null;
         var3 = (CTCellProtection)this.get_store().find_element_user(PROTECTION$2, 0);
         if(var3 == null) {
            var3 = (CTCellProtection)this.get_store().add_element_user(PROTECTION$2);
         }

         var3.set(var1);
      }
   }

   public CTCellProtection addNewProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var2 = null;
         var2 = (CTCellProtection)this.get_store().add_element_user(PROTECTION$2);
         return var2;
      }
   }

   public void unsetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTION$2, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public long getNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STNumFmtId xgetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var2 = null;
         var2 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$6);
         return var2;
      }
   }

   public boolean isSetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMFMTID$6) != null;
      }
   }

   public void setNumFmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(NUMFMTID$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetNumFmtId(STNumFmtId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var3 = null;
         var3 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$6);
         if(var3 == null) {
            var3 = (STNumFmtId)this.get_store().add_attribute_user(NUMFMTID$6);
         }

         var3.set(var1);
      }
   }

   public void unsetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMFMTID$6);
      }
   }

   public long getFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FONTID$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STFontId xgetFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontId var2 = null;
         var2 = (STFontId)this.get_store().find_attribute_user(FONTID$8);
         return var2;
      }
   }

   public boolean isSetFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FONTID$8) != null;
      }
   }

   public void setFontId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FONTID$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FONTID$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFontId(STFontId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontId var3 = null;
         var3 = (STFontId)this.get_store().find_attribute_user(FONTID$8);
         if(var3 == null) {
            var3 = (STFontId)this.get_store().add_attribute_user(FONTID$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FONTID$8);
      }
   }

   public long getFillId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLID$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STFillId xgetFillId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillId var2 = null;
         var2 = (STFillId)this.get_store().find_attribute_user(FILLID$10);
         return var2;
      }
   }

   public boolean isSetFillId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLID$10) != null;
      }
   }

   public void setFillId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FILLID$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FILLID$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFillId(STFillId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFillId var3 = null;
         var3 = (STFillId)this.get_store().find_attribute_user(FILLID$10);
         if(var3 == null) {
            var3 = (STFillId)this.get_store().add_attribute_user(FILLID$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFillId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLID$10);
      }
   }

   public long getBorderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERID$12);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STBorderId xgetBorderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorderId var2 = null;
         var2 = (STBorderId)this.get_store().find_attribute_user(BORDERID$12);
         return var2;
      }
   }

   public boolean isSetBorderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERID$12) != null;
      }
   }

   public void setBorderId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BORDERID$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BORDERID$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBorderId(STBorderId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorderId var3 = null;
         var3 = (STBorderId)this.get_store().find_attribute_user(BORDERID$12);
         if(var3 == null) {
            var3 = (STBorderId)this.get_store().add_attribute_user(BORDERID$12);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERID$12);
      }
   }

   public long getXfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XFID$14);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCellStyleXfId xgetXfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellStyleXfId var2 = null;
         var2 = (STCellStyleXfId)this.get_store().find_attribute_user(XFID$14);
         return var2;
      }
   }

   public boolean isSetXfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XFID$14) != null;
      }
   }

   public void setXfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(XFID$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(XFID$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetXfId(STCellStyleXfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellStyleXfId var3 = null;
         var3 = (STCellStyleXfId)this.get_store().find_attribute_user(XFID$14);
         if(var3 == null) {
            var3 = (STCellStyleXfId)this.get_store().add_attribute_user(XFID$14);
         }

         var3.set(var1);
      }
   }

   public void unsetXfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XFID$14);
      }
   }

   public boolean getQuotePrefix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(QUOTEPREFIX$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(QUOTEPREFIX$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetQuotePrefix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(QUOTEPREFIX$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(QUOTEPREFIX$16);
         }

         return var2;
      }
   }

   public boolean isSetQuotePrefix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(QUOTEPREFIX$16) != null;
      }
   }

   public void setQuotePrefix(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(QUOTEPREFIX$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(QUOTEPREFIX$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetQuotePrefix(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(QUOTEPREFIX$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(QUOTEPREFIX$16);
         }

         var3.set(var1);
      }
   }

   public void unsetQuotePrefix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(QUOTEPREFIX$16);
      }
   }

   public boolean getPivotButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PIVOTBUTTON$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PIVOTBUTTON$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPivotButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PIVOTBUTTON$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PIVOTBUTTON$18);
         }

         return var2;
      }
   }

   public boolean isSetPivotButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PIVOTBUTTON$18) != null;
      }
   }

   public void setPivotButton(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PIVOTBUTTON$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PIVOTBUTTON$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPivotButton(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PIVOTBUTTON$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PIVOTBUTTON$18);
         }

         var3.set(var1);
      }
   }

   public void unsetPivotButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PIVOTBUTTON$18);
      }
   }

   public boolean getApplyNumberFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyNumberFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
         return var2;
      }
   }

   public boolean isSetApplyNumberFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYNUMBERFORMAT$20) != null;
      }
   }

   public void setApplyNumberFormat(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYNUMBERFORMAT$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyNumberFormat(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYNUMBERFORMAT$20);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyNumberFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYNUMBERFORMAT$20);
      }
   }

   public boolean getApplyFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYFONT$22);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFONT$22);
         return var2;
      }
   }

   public boolean isSetApplyFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYFONT$22) != null;
      }
   }

   public void setApplyFont(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYFONT$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYFONT$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyFont(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFONT$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYFONT$22);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYFONT$22);
      }
   }

   public boolean getApplyFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYFILL$24);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFILL$24);
         return var2;
      }
   }

   public boolean isSetApplyFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYFILL$24) != null;
      }
   }

   public void setApplyFill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYFILL$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYFILL$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyFill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFILL$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYFILL$24);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYFILL$24);
      }
   }

   public boolean getApplyBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYBORDER$26);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYBORDER$26);
         return var2;
      }
   }

   public boolean isSetApplyBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYBORDER$26) != null;
      }
   }

   public void setApplyBorder(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYBORDER$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYBORDER$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyBorder(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYBORDER$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYBORDER$26);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYBORDER$26);
      }
   }

   public boolean getApplyAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYALIGNMENT$28);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYALIGNMENT$28);
         return var2;
      }
   }

   public boolean isSetApplyAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYALIGNMENT$28) != null;
      }
   }

   public void setApplyAlignment(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYALIGNMENT$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYALIGNMENT$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyAlignment(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYALIGNMENT$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYALIGNMENT$28);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYALIGNMENT$28);
      }
   }

   public boolean getApplyProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYPROTECTION$30);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYPROTECTION$30);
         return var2;
      }
   }

   public boolean isSetApplyProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYPROTECTION$30) != null;
      }
   }

   public void setApplyProtection(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYPROTECTION$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYPROTECTION$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyProtection(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYPROTECTION$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYPROTECTION$30);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYPROTECTION$30);
      }
   }

}
