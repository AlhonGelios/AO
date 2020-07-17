package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment;

public class CTCellAlignmentImpl extends XmlComplexContentImpl implements CTCellAlignment {

   private static final QName HORIZONTAL$0 = new QName("", "horizontal");
   private static final QName VERTICAL$2 = new QName("", "vertical");
   private static final QName TEXTROTATION$4 = new QName("", "textRotation");
   private static final QName WRAPTEXT$6 = new QName("", "wrapText");
   private static final QName INDENT$8 = new QName("", "indent");
   private static final QName RELATIVEINDENT$10 = new QName("", "relativeIndent");
   private static final QName JUSTIFYLASTLINE$12 = new QName("", "justifyLastLine");
   private static final QName SHRINKTOFIT$14 = new QName("", "shrinkToFit");
   private static final QName READINGORDER$16 = new QName("", "readingOrder");


   public CTCellAlignmentImpl(SchemaType var1) {
      super(var1);
   }

   public STHorizontalAlignment.Enum getHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTAL$0);
         return var2 == null?null:(STHorizontalAlignment.Enum)var2.getEnumValue();
      }
   }

   public STHorizontalAlignment xgetHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHorizontalAlignment var2 = null;
         var2 = (STHorizontalAlignment)this.get_store().find_attribute_user(HORIZONTAL$0);
         return var2;
      }
   }

   public boolean isSetHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORIZONTAL$0) != null;
      }
   }

   public void setHorizontal(STHorizontalAlignment.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HORIZONTAL$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHorizontal(STHorizontalAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHorizontalAlignment var3 = null;
         var3 = (STHorizontalAlignment)this.get_store().find_attribute_user(HORIZONTAL$0);
         if(var3 == null) {
            var3 = (STHorizontalAlignment)this.get_store().add_attribute_user(HORIZONTAL$0);
         }

         var3.set(var1);
      }
   }

   public void unsetHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORIZONTAL$0);
      }
   }

   public STVerticalAlignment.Enum getVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTICAL$2);
         return var2 == null?null:(STVerticalAlignment.Enum)var2.getEnumValue();
      }
   }

   public STVerticalAlignment xgetVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVerticalAlignment var2 = null;
         var2 = (STVerticalAlignment)this.get_store().find_attribute_user(VERTICAL$2);
         return var2;
      }
   }

   public boolean isSetVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTICAL$2) != null;
      }
   }

   public void setVertical(STVerticalAlignment.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERTICAL$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERTICAL$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVertical(STVerticalAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVerticalAlignment var3 = null;
         var3 = (STVerticalAlignment)this.get_store().find_attribute_user(VERTICAL$2);
         if(var3 == null) {
            var3 = (STVerticalAlignment)this.get_store().add_attribute_user(VERTICAL$2);
         }

         var3.set(var1);
      }
   }

   public void unsetVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTICAL$2);
      }
   }

   public long getTextRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXTROTATION$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTextRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(TEXTROTATION$4);
         return var2;
      }
   }

   public boolean isSetTextRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXTROTATION$4) != null;
      }
   }

   public void setTextRotation(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TEXTROTATION$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TEXTROTATION$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTextRotation(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(TEXTROTATION$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(TEXTROTATION$4);
         }

         var3.set(var1);
      }
   }

   public void unsetTextRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXTROTATION$4);
      }
   }

   public boolean getWrapText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WRAPTEXT$6);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetWrapText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(WRAPTEXT$6);
         return var2;
      }
   }

   public boolean isSetWrapText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WRAPTEXT$6) != null;
      }
   }

   public void setWrapText(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WRAPTEXT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WRAPTEXT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetWrapText(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(WRAPTEXT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(WRAPTEXT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetWrapText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WRAPTEXT$6);
      }
   }

   public long getIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INDENT$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDENT$8);
         return var2;
      }
   }

   public boolean isSetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INDENT$8) != null;
      }
   }

   public void setIndent(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(INDENT$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(INDENT$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIndent(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDENT$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(INDENT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INDENT$8);
      }
   }

   public int getRelativeIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RELATIVEINDENT$10);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetRelativeIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(RELATIVEINDENT$10);
         return var2;
      }
   }

   public boolean isSetRelativeIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RELATIVEINDENT$10) != null;
      }
   }

   public void setRelativeIndent(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RELATIVEINDENT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RELATIVEINDENT$10);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRelativeIndent(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(RELATIVEINDENT$10);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(RELATIVEINDENT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetRelativeIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RELATIVEINDENT$10);
      }
   }

   public boolean getJustifyLastLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(JUSTIFYLASTLINE$12);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetJustifyLastLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(JUSTIFYLASTLINE$12);
         return var2;
      }
   }

   public boolean isSetJustifyLastLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(JUSTIFYLASTLINE$12) != null;
      }
   }

   public void setJustifyLastLine(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(JUSTIFYLASTLINE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(JUSTIFYLASTLINE$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetJustifyLastLine(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(JUSTIFYLASTLINE$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(JUSTIFYLASTLINE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetJustifyLastLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(JUSTIFYLASTLINE$12);
      }
   }

   public boolean getShrinkToFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHRINKTOFIT$14);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShrinkToFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHRINKTOFIT$14);
         return var2;
      }
   }

   public boolean isSetShrinkToFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHRINKTOFIT$14) != null;
      }
   }

   public void setShrinkToFit(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHRINKTOFIT$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHRINKTOFIT$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShrinkToFit(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHRINKTOFIT$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHRINKTOFIT$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShrinkToFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHRINKTOFIT$14);
      }
   }

   public long getReadingOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(READINGORDER$16);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetReadingOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(READINGORDER$16);
         return var2;
      }
   }

   public boolean isSetReadingOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(READINGORDER$16) != null;
      }
   }

   public void setReadingOrder(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(READINGORDER$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(READINGORDER$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetReadingOrder(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(READINGORDER$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(READINGORDER$16);
         }

         var3.set(var1);
      }
   }

   public void unsetReadingOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(READINGORDER$16);
      }
   }

}
