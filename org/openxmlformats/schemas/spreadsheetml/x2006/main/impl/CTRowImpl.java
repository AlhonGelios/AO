package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTRowImpl.1CList;

public class CTRowImpl extends XmlComplexContentImpl implements CTRow {

   private static final QName C$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "c");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName R$4 = new QName("", "r");
   private static final QName SPANS$6 = new QName("", "spans");
   private static final QName S$8 = new QName("", "s");
   private static final QName CUSTOMFORMAT$10 = new QName("", "customFormat");
   private static final QName HT$12 = new QName("", "ht");
   private static final QName HIDDEN$14 = new QName("", "hidden");
   private static final QName CUSTOMHEIGHT$16 = new QName("", "customHeight");
   private static final QName OUTLINELEVEL$18 = new QName("", "outlineLevel");
   private static final QName COLLAPSED$20 = new QName("", "collapsed");
   private static final QName THICKTOP$22 = new QName("", "thickTop");
   private static final QName THICKBOT$24 = new QName("", "thickBot");
   private static final QName PH$26 = new QName("", "ph");


   public CTRowImpl(SchemaType var1) {
      super(var1);
   }

   public List getCList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CList(this);
      }
   }

   public CTCell[] getCArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(C$0, var2);
         CTCell[] var3 = new CTCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCell getCArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell var3 = null;
         var3 = (CTCell)this.get_store().find_element_user(C$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(C$0);
      }
   }

   public void setCArray(CTCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, C$0);
      }
   }

   public void setCArray(int var1, CTCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell var4 = null;
         var4 = (CTCell)this.get_store().find_element_user(C$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCell insertNewC(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell var3 = null;
         var3 = (CTCell)this.get_store().insert_element_user(C$0, var1);
         return var3;
      }
   }

   public CTCell addNewC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell var2 = null;
         var2 = (CTCell)this.get_store().add_element_user(C$0);
         return var2;
      }
   }

   public void removeC(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(C$0, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public long getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(R$4);
         return var2;
      }
   }

   public boolean isSetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(R$4) != null;
      }
   }

   public void setR(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(R$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetR(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(R$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(R$4);
         }

         var3.set(var1);
      }
   }

   public void unsetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(R$4);
      }
   }

   public List getSpans() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPANS$6);
         return var2 == null?null:var2.getListValue();
      }
   }

   public STCellSpans xgetSpans() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellSpans var2 = null;
         var2 = (STCellSpans)this.get_store().find_attribute_user(SPANS$6);
         return var2;
      }
   }

   public boolean isSetSpans() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPANS$6) != null;
      }
   }

   public void setSpans(List var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPANS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPANS$6);
         }

         var3.setListValue(var1);
      }
   }

   public void xsetSpans(STCellSpans var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellSpans var3 = null;
         var3 = (STCellSpans)this.get_store().find_attribute_user(SPANS$6);
         if(var3 == null) {
            var3 = (STCellSpans)this.get_store().add_attribute_user(SPANS$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSpans() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPANS$6);
      }
   }

   public long getS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(S$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(S$8);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(S$8);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(S$8);
         }

         return var2;
      }
   }

   public boolean isSetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(S$8) != null;
      }
   }

   public void setS(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(S$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(S$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetS(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(S$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(S$8);
         }

         var3.set(var1);
      }
   }

   public void unsetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(S$8);
      }
   }

   public boolean getCustomFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMFORMAT$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CUSTOMFORMAT$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCustomFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMFORMAT$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CUSTOMFORMAT$10);
         }

         return var2;
      }
   }

   public boolean isSetCustomFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMFORMAT$10) != null;
      }
   }

   public void setCustomFormat(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMFORMAT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMFORMAT$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCustomFormat(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMFORMAT$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CUSTOMFORMAT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMFORMAT$10);
      }
   }

   public double getHt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HT$12);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetHt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(HT$12);
         return var2;
      }
   }

   public boolean isSetHt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HT$12) != null;
      }
   }

   public void setHt(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HT$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HT$12);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetHt(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(HT$12);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(HT$12);
         }

         var3.set(var1);
      }
   }

   public void unsetHt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HT$12);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDDEN$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDDEN$14);
         }

         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$14) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$14);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$14);
      }
   }

   public boolean getCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMHEIGHT$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CUSTOMHEIGHT$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMHEIGHT$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CUSTOMHEIGHT$16);
         }

         return var2;
      }
   }

   public boolean isSetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMHEIGHT$16) != null;
      }
   }

   public void setCustomHeight(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMHEIGHT$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMHEIGHT$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCustomHeight(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMHEIGHT$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CUSTOMHEIGHT$16);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMHEIGHT$16);
      }
   }

   public short getOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVEL$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINELEVEL$18);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVEL$18);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(OUTLINELEVEL$18);
         }

         return var2;
      }
   }

   public boolean isSetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINELEVEL$18) != null;
      }
   }

   public void setOutlineLevel(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINELEVEL$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINELEVEL$18);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetOutlineLevel(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(OUTLINELEVEL$18);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(OUTLINELEVEL$18);
         }

         var3.set(var1);
      }
   }

   public void unsetOutlineLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINELEVEL$18);
      }
   }

   public boolean getCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLLAPSED$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COLLAPSED$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COLLAPSED$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COLLAPSED$20);
         }

         return var2;
      }
   }

   public boolean isSetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLLAPSED$20) != null;
      }
   }

   public void setCollapsed(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLLAPSED$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLLAPSED$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCollapsed(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COLLAPSED$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COLLAPSED$20);
         }

         var3.set(var1);
      }
   }

   public void unsetCollapsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLLAPSED$20);
      }
   }

   public boolean getThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THICKTOP$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(THICKTOP$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(THICKTOP$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(THICKTOP$22);
         }

         return var2;
      }
   }

   public boolean isSetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THICKTOP$22) != null;
      }
   }

   public void setThickTop(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THICKTOP$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THICKTOP$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetThickTop(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(THICKTOP$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(THICKTOP$22);
         }

         var3.set(var1);
      }
   }

   public void unsetThickTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THICKTOP$22);
      }
   }

   public boolean getThickBot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THICKBOT$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(THICKBOT$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetThickBot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(THICKBOT$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(THICKBOT$24);
         }

         return var2;
      }
   }

   public boolean isSetThickBot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THICKBOT$24) != null;
      }
   }

   public void setThickBot(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THICKBOT$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THICKBOT$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetThickBot(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(THICKBOT$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(THICKBOT$24);
         }

         var3.set(var1);
      }
   }

   public void unsetThickBot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THICKBOT$24);
      }
   }

   public boolean getPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PH$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PH$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PH$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PH$26);
         }

         return var2;
      }
   }

   public boolean isSetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PH$26) != null;
      }
   }

   public void setPh(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PH$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PH$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPh(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PH$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PH$26);
         }

         var3.set(var1);
      }
   }

   public void unsetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PH$26);
      }
   }

}
