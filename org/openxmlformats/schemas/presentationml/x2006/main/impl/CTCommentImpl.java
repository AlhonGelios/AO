package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTComment;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.STIndex;

public class CTCommentImpl extends XmlComplexContentImpl implements CTComment {

   private static final QName POS$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "pos");
   private static final QName TEXT$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "text");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName AUTHORID$6 = new QName("", "authorId");
   private static final QName DT$8 = new QName("", "dt");
   private static final QName IDX$10 = new QName("", "idx");


   public CTCommentImpl(SchemaType var1) {
      super(var1);
   }

   public CTPoint2D getPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().find_element_user(POS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPos(CTPoint2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var3 = null;
         var3 = (CTPoint2D)this.get_store().find_element_user(POS$0, 0);
         if(var3 == null) {
            var3 = (CTPoint2D)this.get_store().add_element_user(POS$0);
         }

         var3.set(var1);
      }
   }

   public CTPoint2D addNewPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().add_element_user(POS$0);
         return var2;
      }
   }

   public String getText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(TEXT$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(TEXT$2, 0);
         return var2;
      }
   }

   public void setText(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TEXT$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(TEXT$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetText(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(TEXT$2, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(TEXT$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public long getAuthorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTHORID$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetAuthorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTHORID$6);
         return var2;
      }
   }

   public void setAuthorId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(AUTHORID$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(AUTHORID$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetAuthorId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTHORID$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(AUTHORID$6);
         }

         var3.set(var1);
      }
   }

   public Calendar getDt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DT$8);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetDt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_attribute_user(DT$8);
         return var2;
      }
   }

   public boolean isSetDt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DT$8) != null;
      }
   }

   public void setDt(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DT$8);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetDt(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_attribute_user(DT$8);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_attribute_user(DT$8);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetDt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DT$8);
      }
   }

   public long getIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IDX$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STIndex xgetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STIndex var2 = null;
         var2 = (STIndex)this.get_store().find_attribute_user(IDX$10);
         return var2;
      }
   }

   public void setIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(IDX$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(IDX$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIdx(STIndex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STIndex var3 = null;
         var3 = (STIndex)this.get_store().find_attribute_user(IDX$10);
         if(var3 == null) {
            var3 = (STIndex)this.get_store().add_attribute_user(IDX$10);
         }

         var3.set(var1);
      }
   }

}
