package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError$Enum;

public class CTPageSetupImpl extends XmlComplexContentImpl implements CTPageSetup {

   private static final QName PAPERSIZE$0 = new QName("", "paperSize");
   private static final QName SCALE$2 = new QName("", "scale");
   private static final QName FIRSTPAGENUMBER$4 = new QName("", "firstPageNumber");
   private static final QName FITTOWIDTH$6 = new QName("", "fitToWidth");
   private static final QName FITTOHEIGHT$8 = new QName("", "fitToHeight");
   private static final QName PAGEORDER$10 = new QName("", "pageOrder");
   private static final QName ORIENTATION$12 = new QName("", "orientation");
   private static final QName USEPRINTERDEFAULTS$14 = new QName("", "usePrinterDefaults");
   private static final QName BLACKANDWHITE$16 = new QName("", "blackAndWhite");
   private static final QName DRAFT$18 = new QName("", "draft");
   private static final QName CELLCOMMENTS$20 = new QName("", "cellComments");
   private static final QName USEFIRSTPAGENUMBER$22 = new QName("", "useFirstPageNumber");
   private static final QName ERRORS$24 = new QName("", "errors");
   private static final QName HORIZONTALDPI$26 = new QName("", "horizontalDpi");
   private static final QName VERTICALDPI$28 = new QName("", "verticalDpi");
   private static final QName COPIES$30 = new QName("", "copies");
   private static final QName ID$32 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTPageSetupImpl(SchemaType var1) {
      super(var1);
   }

   public long getPaperSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PAPERSIZE$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PAPERSIZE$0);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetPaperSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(PAPERSIZE$0);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(PAPERSIZE$0);
         }

         return var2;
      }
   }

   public boolean isSetPaperSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PAPERSIZE$0) != null;
      }
   }

   public void setPaperSize(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(PAPERSIZE$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(PAPERSIZE$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetPaperSize(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(PAPERSIZE$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(PAPERSIZE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetPaperSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PAPERSIZE$0);
      }
   }

   public long getScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SCALE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SCALE$2);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SCALE$2);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(SCALE$2);
         }

         return var2;
      }
   }

   public boolean isSetScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SCALE$2) != null;
      }
   }

   public void setScale(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SCALE$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SCALE$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetScale(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SCALE$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SCALE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SCALE$2);
      }
   }

   public long getFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTPAGENUMBER$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTPAGENUMBER$4);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTPAGENUMBER$4);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(FIRSTPAGENUMBER$4);
         }

         return var2;
      }
   }

   public boolean isSetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTPAGENUMBER$4) != null;
      }
   }

   public void setFirstPageNumber(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTPAGENUMBER$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTPAGENUMBER$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstPageNumber(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTPAGENUMBER$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTPAGENUMBER$4);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTPAGENUMBER$4);
      }
   }

   public long getFitToWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FITTOWIDTH$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FITTOWIDTH$6);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFitToWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FITTOWIDTH$6);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(FITTOWIDTH$6);
         }

         return var2;
      }
   }

   public boolean isSetFitToWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FITTOWIDTH$6) != null;
      }
   }

   public void setFitToWidth(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FITTOWIDTH$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FITTOWIDTH$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFitToWidth(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FITTOWIDTH$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FITTOWIDTH$6);
         }

         var3.set(var1);
      }
   }

   public void unsetFitToWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FITTOWIDTH$6);
      }
   }

   public long getFitToHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FITTOHEIGHT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FITTOHEIGHT$8);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFitToHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FITTOHEIGHT$8);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(FITTOHEIGHT$8);
         }

         return var2;
      }
   }

   public boolean isSetFitToHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FITTOHEIGHT$8) != null;
      }
   }

   public void setFitToHeight(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FITTOHEIGHT$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FITTOHEIGHT$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFitToHeight(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FITTOHEIGHT$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FITTOHEIGHT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFitToHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FITTOHEIGHT$8);
      }
   }

   public STPageOrder.Enum getPageOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PAGEORDER$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PAGEORDER$10);
         }

         return var2 == null?null:(STPageOrder.Enum)var2.getEnumValue();
      }
   }

   public STPageOrder xgetPageOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPageOrder var2 = null;
         var2 = (STPageOrder)this.get_store().find_attribute_user(PAGEORDER$10);
         if(var2 == null) {
            var2 = (STPageOrder)this.get_default_attribute_value(PAGEORDER$10);
         }

         return var2;
      }
   }

   public boolean isSetPageOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PAGEORDER$10) != null;
      }
   }

   public void setPageOrder(STPageOrder.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PAGEORDER$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PAGEORDER$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPageOrder(STPageOrder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPageOrder var3 = null;
         var3 = (STPageOrder)this.get_store().find_attribute_user(PAGEORDER$10);
         if(var3 == null) {
            var3 = (STPageOrder)this.get_store().add_attribute_user(PAGEORDER$10);
         }

         var3.set(var1);
      }
   }

   public void unsetPageOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PAGEORDER$10);
      }
   }

   public STOrientation.Enum getOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIENTATION$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ORIENTATION$12);
         }

         return var2 == null?null:(STOrientation.Enum)var2.getEnumValue();
      }
   }

   public STOrientation xgetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOrientation var2 = null;
         var2 = (STOrientation)this.get_store().find_attribute_user(ORIENTATION$12);
         if(var2 == null) {
            var2 = (STOrientation)this.get_default_attribute_value(ORIENTATION$12);
         }

         return var2;
      }
   }

   public boolean isSetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIENTATION$12) != null;
      }
   }

   public void setOrientation(STOrientation.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ORIENTATION$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ORIENTATION$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOrientation(STOrientation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOrientation var3 = null;
         var3 = (STOrientation)this.get_store().find_attribute_user(ORIENTATION$12);
         if(var3 == null) {
            var3 = (STOrientation)this.get_store().add_attribute_user(ORIENTATION$12);
         }

         var3.set(var1);
      }
   }

   public void unsetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIENTATION$12);
      }
   }

   public boolean getUsePrinterDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USEPRINTERDEFAULTS$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUsePrinterDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USEPRINTERDEFAULTS$14);
         }

         return var2;
      }
   }

   public boolean isSetUsePrinterDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USEPRINTERDEFAULTS$14) != null;
      }
   }

   public void setUsePrinterDefaults(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USEPRINTERDEFAULTS$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUsePrinterDefaults(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USEPRINTERDEFAULTS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetUsePrinterDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USEPRINTERDEFAULTS$14);
      }
   }

   public boolean getBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BLACKANDWHITE$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BLACKANDWHITE$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BLACKANDWHITE$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BLACKANDWHITE$16);
         }

         return var2;
      }
   }

   public boolean isSetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BLACKANDWHITE$16) != null;
      }
   }

   public void setBlackAndWhite(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BLACKANDWHITE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BLACKANDWHITE$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBlackAndWhite(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BLACKANDWHITE$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BLACKANDWHITE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BLACKANDWHITE$16);
      }
   }

   public boolean getDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAFT$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAFT$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAFT$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAFT$18);
         }

         return var2;
      }
   }

   public boolean isSetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAFT$18) != null;
      }
   }

   public void setDraft(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAFT$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAFT$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDraft(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAFT$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAFT$18);
         }

         var3.set(var1);
      }
   }

   public void unsetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAFT$18);
      }
   }

   public STCellComments.Enum getCellComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CELLCOMMENTS$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CELLCOMMENTS$20);
         }

         return var2 == null?null:(STCellComments.Enum)var2.getEnumValue();
      }
   }

   public STCellComments xgetCellComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellComments var2 = null;
         var2 = (STCellComments)this.get_store().find_attribute_user(CELLCOMMENTS$20);
         if(var2 == null) {
            var2 = (STCellComments)this.get_default_attribute_value(CELLCOMMENTS$20);
         }

         return var2;
      }
   }

   public boolean isSetCellComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CELLCOMMENTS$20) != null;
      }
   }

   public void setCellComments(STCellComments.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CELLCOMMENTS$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CELLCOMMENTS$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCellComments(STCellComments var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellComments var3 = null;
         var3 = (STCellComments)this.get_store().find_attribute_user(CELLCOMMENTS$20);
         if(var3 == null) {
            var3 = (STCellComments)this.get_store().add_attribute_user(CELLCOMMENTS$20);
         }

         var3.set(var1);
      }
   }

   public void unsetCellComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CELLCOMMENTS$20);
      }
   }

   public boolean getUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USEFIRSTPAGENUMBER$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USEFIRSTPAGENUMBER$22);
         }

         return var2;
      }
   }

   public boolean isSetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$22) != null;
      }
   }

   public void setUseFirstPageNumber(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USEFIRSTPAGENUMBER$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUseFirstPageNumber(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USEFIRSTPAGENUMBER$22);
         }

         var3.set(var1);
      }
   }

   public void unsetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USEFIRSTPAGENUMBER$22);
      }
   }

   public STPrintError$Enum getErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERRORS$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ERRORS$24);
         }

         return var2 == null?null:(STPrintError$Enum)var2.getEnumValue();
      }
   }

   public STPrintError xgetErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPrintError var2 = null;
         var2 = (STPrintError)this.get_store().find_attribute_user(ERRORS$24);
         if(var2 == null) {
            var2 = (STPrintError)this.get_default_attribute_value(ERRORS$24);
         }

         return var2;
      }
   }

   public boolean isSetErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERRORS$24) != null;
      }
   }

   public void setErrors(STPrintError$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERRORS$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERRORS$24);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetErrors(STPrintError var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPrintError var3 = null;
         var3 = (STPrintError)this.get_store().find_attribute_user(ERRORS$24);
         if(var3 == null) {
            var3 = (STPrintError)this.get_store().add_attribute_user(ERRORS$24);
         }

         var3.set(var1);
      }
   }

   public void unsetErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERRORS$24);
      }
   }

   public long getHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALDPI$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HORIZONTALDPI$26);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(HORIZONTALDPI$26);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(HORIZONTALDPI$26);
         }

         return var2;
      }
   }

   public boolean isSetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORIZONTALDPI$26) != null;
      }
   }

   public void setHorizontalDpi(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALDPI$26);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HORIZONTALDPI$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetHorizontalDpi(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(HORIZONTALDPI$26);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(HORIZONTALDPI$26);
         }

         var3.set(var1);
      }
   }

   public void unsetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORIZONTALDPI$26);
      }
   }

   public long getVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTICALDPI$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VERTICALDPI$28);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(VERTICALDPI$28);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(VERTICALDPI$28);
         }

         return var2;
      }
   }

   public boolean isSetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTICALDPI$28) != null;
      }
   }

   public void setVerticalDpi(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VERTICALDPI$28);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VERTICALDPI$28);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetVerticalDpi(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(VERTICALDPI$28);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(VERTICALDPI$28);
         }

         var3.set(var1);
      }
   }

   public void unsetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTICALDPI$28);
      }
   }

   public long getCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COPIES$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COPIES$30);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COPIES$30);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COPIES$30);
         }

         return var2;
      }
   }

   public boolean isSetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COPIES$30) != null;
      }
   }

   public void setCopies(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COPIES$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COPIES$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCopies(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COPIES$30);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COPIES$30);
         }

         var3.set(var1);
      }
   }

   public void unsetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COPIES$30);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$32);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$32);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$32) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$32);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$32);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$32);
      }
   }

}
