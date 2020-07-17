package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextBodyImpl.1PList;

public class CTTextBodyImpl extends XmlComplexContentImpl implements CTTextBody {

   private static final QName BODYPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bodyPr");
   private static final QName LSTSTYLE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lstStyle");
   private static final QName P$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "p");


   public CTTextBodyImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextBodyProperties getBodyPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBodyProperties var2 = null;
         var2 = (CTTextBodyProperties)this.get_store().find_element_user(BODYPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setBodyPr(CTTextBodyProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBodyProperties var3 = null;
         var3 = (CTTextBodyProperties)this.get_store().find_element_user(BODYPR$0, 0);
         if(var3 == null) {
            var3 = (CTTextBodyProperties)this.get_store().add_element_user(BODYPR$0);
         }

         var3.set(var1);
      }
   }

   public CTTextBodyProperties addNewBodyPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBodyProperties var2 = null;
         var2 = (CTTextBodyProperties)this.get_store().add_element_user(BODYPR$0);
         return var2;
      }
   }

   public CTTextListStyle getLstStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(LSTSTYLE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLstStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LSTSTYLE$2) != 0;
      }
   }

   public void setLstStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(LSTSTYLE$2, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(LSTSTYLE$2);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewLstStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(LSTSTYLE$2);
         return var2;
      }
   }

   public void unsetLstStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LSTSTYLE$2, 0);
      }
   }

   public List getPList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PList(this);
      }
   }

   public CTTextParagraph[] getPArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(P$4, var2);
         CTTextParagraph[] var3 = new CTTextParagraph[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextParagraph getPArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraph var3 = null;
         var3 = (CTTextParagraph)this.get_store().find_element_user(P$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(P$4);
      }
   }

   public void setPArray(CTTextParagraph[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, P$4);
      }
   }

   public void setPArray(int var1, CTTextParagraph var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraph var4 = null;
         var4 = (CTTextParagraph)this.get_store().find_element_user(P$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextParagraph insertNewP(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraph var3 = null;
         var3 = (CTTextParagraph)this.get_store().insert_element_user(P$4, var1);
         return var3;
      }
   }

   public CTTextParagraph addNewP() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraph var2 = null;
         var2 = (CTTextParagraph)this.get_store().add_element_user(P$4);
         return var2;
      }
   }

   public void removeP(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(P$4, var1);
      }
   }

}
