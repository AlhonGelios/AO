package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.PageSheetType;
import com.microsoft.schemas.office.visio.x2012.main.PageType;
import com.microsoft.schemas.office.visio.x2012.main.RelType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class PageTypeImpl extends XmlComplexContentImpl implements PageType {

   private static final QName PAGESHEET$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "PageSheet");
   private static final QName REL$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Rel");
   private static final QName ID$4 = new QName("", "ID");
   private static final QName NAME$6 = new QName("", "Name");
   private static final QName NAMEU$8 = new QName("", "NameU");
   private static final QName ISCUSTOMNAME$10 = new QName("", "IsCustomName");
   private static final QName ISCUSTOMNAMEU$12 = new QName("", "IsCustomNameU");
   private static final QName BACKGROUND$14 = new QName("", "Background");
   private static final QName BACKPAGE$16 = new QName("", "BackPage");
   private static final QName VIEWSCALE$18 = new QName("", "ViewScale");
   private static final QName VIEWCENTERX$20 = new QName("", "ViewCenterX");
   private static final QName VIEWCENTERY$22 = new QName("", "ViewCenterY");
   private static final QName REVIEWERID$24 = new QName("", "ReviewerID");
   private static final QName ASSOCIATEDPAGE$26 = new QName("", "AssociatedPage");


   public PageTypeImpl(SchemaType var1) {
      super(var1);
   }

   public PageSheetType getPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var2 = null;
         var2 = (PageSheetType)this.get_store().find_element_user(PAGESHEET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESHEET$0) != 0;
      }
   }

   public void setPageSheet(PageSheetType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var3 = null;
         var3 = (PageSheetType)this.get_store().find_element_user(PAGESHEET$0, 0);
         if(var3 == null) {
            var3 = (PageSheetType)this.get_store().add_element_user(PAGESHEET$0);
         }

         var3.set(var1);
      }
   }

   public PageSheetType addNewPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var2 = null;
         var2 = (PageSheetType)this.get_store().add_element_user(PAGESHEET$0);
         return var2;
      }
   }

   public void unsetPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESHEET$0, 0);
      }
   }

   public RelType getRel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var2 = null;
         var2 = (RelType)this.get_store().find_element_user(REL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setRel(RelType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var3 = null;
         var3 = (RelType)this.get_store().find_element_user(REL$2, 0);
         if(var3 == null) {
            var3 = (RelType)this.get_store().add_element_user(REL$2);
         }

         var3.set(var1);
      }
   }

   public RelType addNewRel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var2 = null;
         var2 = (RelType)this.get_store().add_element_user(REL$2);
         return var2;
      }
   }

   public long getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public void setID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$6);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$6) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$6);
      }
   }

   public String getNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAMEU$8);
         return var2;
      }
   }

   public boolean isSetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAMEU$8) != null;
      }
   }

   public void setNameU(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAMEU$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetNameU(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAMEU$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAMEU$8);
         }

         var3.set(var1);
      }
   }

   public void unsetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAMEU$8);
      }
   }

   public boolean getIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$10);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$10);
         return var2;
      }
   }

   public boolean isSetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAME$10) != null;
      }
   }

   public void setIsCustomName(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAME$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomName(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAME$10);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAME$10);
      }
   }

   public boolean getIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$12);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$12);
         return var2;
      }
   }

   public boolean isSetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAMEU$12) != null;
      }
   }

   public void setIsCustomNameU(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAMEU$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomNameU(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAMEU$12);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAMEU$12);
      }
   }

   public boolean getBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BACKGROUND$14);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BACKGROUND$14);
         return var2;
      }
   }

   public boolean isSetBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BACKGROUND$14) != null;
      }
   }

   public void setBackground(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BACKGROUND$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BACKGROUND$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBackground(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BACKGROUND$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BACKGROUND$14);
         }

         var3.set(var1);
      }
   }

   public void unsetBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BACKGROUND$14);
      }
   }

   public long getBackPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BACKPAGE$16);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetBackPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(BACKPAGE$16);
         return var2;
      }
   }

   public boolean isSetBackPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BACKPAGE$16) != null;
      }
   }

   public void setBackPage(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BACKPAGE$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BACKPAGE$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBackPage(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(BACKPAGE$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(BACKPAGE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetBackPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BACKPAGE$16);
      }
   }

   public double getViewScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VIEWSCALE$18);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetViewScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(VIEWSCALE$18);
         return var2;
      }
   }

   public boolean isSetViewScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VIEWSCALE$18) != null;
      }
   }

   public void setViewScale(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VIEWSCALE$18);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VIEWSCALE$18);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetViewScale(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(VIEWSCALE$18);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(VIEWSCALE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetViewScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VIEWSCALE$18);
      }
   }

   public double getViewCenterX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VIEWCENTERX$20);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetViewCenterX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(VIEWCENTERX$20);
         return var2;
      }
   }

   public boolean isSetViewCenterX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VIEWCENTERX$20) != null;
      }
   }

   public void setViewCenterX(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VIEWCENTERX$20);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VIEWCENTERX$20);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetViewCenterX(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(VIEWCENTERX$20);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(VIEWCENTERX$20);
         }

         var3.set(var1);
      }
   }

   public void unsetViewCenterX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VIEWCENTERX$20);
      }
   }

   public double getViewCenterY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VIEWCENTERY$22);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetViewCenterY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(VIEWCENTERY$22);
         return var2;
      }
   }

   public boolean isSetViewCenterY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VIEWCENTERY$22) != null;
      }
   }

   public void setViewCenterY(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VIEWCENTERY$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VIEWCENTERY$22);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetViewCenterY(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(VIEWCENTERY$22);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(VIEWCENTERY$22);
         }

         var3.set(var1);
      }
   }

   public void unsetViewCenterY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VIEWCENTERY$22);
      }
   }

   public long getReviewerID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REVIEWERID$24);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetReviewerID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(REVIEWERID$24);
         return var2;
      }
   }

   public boolean isSetReviewerID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REVIEWERID$24) != null;
      }
   }

   public void setReviewerID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(REVIEWERID$24);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(REVIEWERID$24);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetReviewerID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(REVIEWERID$24);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(REVIEWERID$24);
         }

         var3.set(var1);
      }
   }

   public void unsetReviewerID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REVIEWERID$24);
      }
   }

   public long getAssociatedPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASSOCIATEDPAGE$26);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetAssociatedPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ASSOCIATEDPAGE$26);
         return var2;
      }
   }

   public boolean isSetAssociatedPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASSOCIATEDPAGE$26) != null;
      }
   }

   public void setAssociatedPage(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ASSOCIATEDPAGE$26);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ASSOCIATEDPAGE$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetAssociatedPage(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ASSOCIATEDPAGE$26);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ASSOCIATEDPAGE$26);
         }

         var3.set(var1);
      }
   }

   public void unsetAssociatedPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASSOCIATEDPAGE$26);
      }
   }

}
