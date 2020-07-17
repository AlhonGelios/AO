package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup;
import org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation;
import org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation$Enum;

public class CTPageSetupImpl extends XmlComplexContentImpl implements CTPageSetup {

   private static final QName PAPERSIZE$0 = new QName("", "paperSize");
   private static final QName FIRSTPAGENUMBER$2 = new QName("", "firstPageNumber");
   private static final QName ORIENTATION$4 = new QName("", "orientation");
   private static final QName BLACKANDWHITE$6 = new QName("", "blackAndWhite");
   private static final QName DRAFT$8 = new QName("", "draft");
   private static final QName USEFIRSTPAGENUMBER$10 = new QName("", "useFirstPageNumber");
   private static final QName HORIZONTALDPI$12 = new QName("", "horizontalDpi");
   private static final QName VERTICALDPI$14 = new QName("", "verticalDpi");
   private static final QName COPIES$16 = new QName("", "copies");


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

   public long getFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTPAGENUMBER$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTPAGENUMBER$2);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTPAGENUMBER$2);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(FIRSTPAGENUMBER$2);
         }

         return var2;
      }
   }

   public boolean isSetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTPAGENUMBER$2) != null;
      }
   }

   public void setFirstPageNumber(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTPAGENUMBER$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTPAGENUMBER$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstPageNumber(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTPAGENUMBER$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTPAGENUMBER$2);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTPAGENUMBER$2);
      }
   }

   public STPageSetupOrientation$Enum getOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIENTATION$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ORIENTATION$4);
         }

         return var2 == null?null:(STPageSetupOrientation$Enum)var2.getEnumValue();
      }
   }

   public STPageSetupOrientation xgetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPageSetupOrientation var2 = null;
         var2 = (STPageSetupOrientation)this.get_store().find_attribute_user(ORIENTATION$4);
         if(var2 == null) {
            var2 = (STPageSetupOrientation)this.get_default_attribute_value(ORIENTATION$4);
         }

         return var2;
      }
   }

   public boolean isSetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIENTATION$4) != null;
      }
   }

   public void setOrientation(STPageSetupOrientation$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ORIENTATION$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ORIENTATION$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOrientation(STPageSetupOrientation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPageSetupOrientation var3 = null;
         var3 = (STPageSetupOrientation)this.get_store().find_attribute_user(ORIENTATION$4);
         if(var3 == null) {
            var3 = (STPageSetupOrientation)this.get_store().add_attribute_user(ORIENTATION$4);
         }

         var3.set(var1);
      }
   }

   public void unsetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIENTATION$4);
      }
   }

   public boolean getBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BLACKANDWHITE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BLACKANDWHITE$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BLACKANDWHITE$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BLACKANDWHITE$6);
         }

         return var2;
      }
   }

   public boolean isSetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BLACKANDWHITE$6) != null;
      }
   }

   public void setBlackAndWhite(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BLACKANDWHITE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BLACKANDWHITE$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBlackAndWhite(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BLACKANDWHITE$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BLACKANDWHITE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetBlackAndWhite() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BLACKANDWHITE$6);
      }
   }

   public boolean getDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAFT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAFT$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAFT$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAFT$8);
         }

         return var2;
      }
   }

   public boolean isSetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAFT$8) != null;
      }
   }

   public void setDraft(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAFT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAFT$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDraft(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAFT$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAFT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetDraft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAFT$8);
      }
   }

   public boolean getUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USEFIRSTPAGENUMBER$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USEFIRSTPAGENUMBER$10);
         }

         return var2;
      }
   }

   public boolean isSetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$10) != null;
      }
   }

   public void setUseFirstPageNumber(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USEFIRSTPAGENUMBER$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUseFirstPageNumber(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USEFIRSTPAGENUMBER$10);
         }

         var3.set(var1);
      }
   }

   public void unsetUseFirstPageNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USEFIRSTPAGENUMBER$10);
      }
   }

   public int getHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALDPI$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HORIZONTALDPI$12);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(HORIZONTALDPI$12);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(HORIZONTALDPI$12);
         }

         return var2;
      }
   }

   public boolean isSetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORIZONTALDPI$12) != null;
      }
   }

   public void setHorizontalDpi(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALDPI$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HORIZONTALDPI$12);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHorizontalDpi(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(HORIZONTALDPI$12);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(HORIZONTALDPI$12);
         }

         var3.set(var1);
      }
   }

   public void unsetHorizontalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORIZONTALDPI$12);
      }
   }

   public int getVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTICALDPI$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VERTICALDPI$14);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(VERTICALDPI$14);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(VERTICALDPI$14);
         }

         return var2;
      }
   }

   public boolean isSetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTICALDPI$14) != null;
      }
   }

   public void setVerticalDpi(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERTICALDPI$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERTICALDPI$14);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetVerticalDpi(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(VERTICALDPI$14);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(VERTICALDPI$14);
         }

         var3.set(var1);
      }
   }

   public void unsetVerticalDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTICALDPI$14);
      }
   }

   public long getCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COPIES$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COPIES$16);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COPIES$16);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COPIES$16);
         }

         return var2;
      }
   }

   public boolean isSetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COPIES$16) != null;
      }
   }

   public void setCopies(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COPIES$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COPIES$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCopies(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COPIES$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COPIES$16);
         }

         var3.set(var1);
      }
   }

   public void unsetCopies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COPIES$16);
      }
   }

}
