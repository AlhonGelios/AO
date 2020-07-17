package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextField;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextParagraphImpl.1BrList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextParagraphImpl.1FldList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextParagraphImpl.1RList;

public class CTTextParagraphImpl extends XmlComplexContentImpl implements CTTextParagraph {

   private static final QName PPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pPr");
   private static final QName R$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "r");
   private static final QName BR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "br");
   private static final QName FLD$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fld");
   private static final QName ENDPARARPR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "endParaRPr");


   public CTTextParagraphImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextParagraphProperties getPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(PPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPR$0) != 0;
      }
   }

   public void setPPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(PPR$0, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(PPR$0);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(PPR$0);
         return var2;
      }
   }

   public void unsetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPR$0, 0);
      }
   }

   public List getRList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RList(this);
      }
   }

   public CTRegularTextRun[] getRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R$2, var2);
         CTRegularTextRun[] var3 = new CTRegularTextRun[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRegularTextRun getRArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegularTextRun var3 = null;
         var3 = (CTRegularTextRun)this.get_store().find_element_user(R$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R$2);
      }
   }

   public void setRArray(CTRegularTextRun[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R$2);
      }
   }

   public void setRArray(int var1, CTRegularTextRun var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegularTextRun var4 = null;
         var4 = (CTRegularTextRun)this.get_store().find_element_user(R$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRegularTextRun insertNewR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegularTextRun var3 = null;
         var3 = (CTRegularTextRun)this.get_store().insert_element_user(R$2, var1);
         return var3;
      }
   }

   public CTRegularTextRun addNewR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegularTextRun var2 = null;
         var2 = (CTRegularTextRun)this.get_store().add_element_user(R$2);
         return var2;
      }
   }

   public void removeR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R$2, var1);
      }
   }

   public List getBrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BrList(this);
      }
   }

   public CTTextLineBreak[] getBrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BR$4, var2);
         CTTextLineBreak[] var3 = new CTTextLineBreak[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextLineBreak getBrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLineBreak var3 = null;
         var3 = (CTTextLineBreak)this.get_store().find_element_user(BR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BR$4);
      }
   }

   public void setBrArray(CTTextLineBreak[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BR$4);
      }
   }

   public void setBrArray(int var1, CTTextLineBreak var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLineBreak var4 = null;
         var4 = (CTTextLineBreak)this.get_store().find_element_user(BR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextLineBreak insertNewBr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLineBreak var3 = null;
         var3 = (CTTextLineBreak)this.get_store().insert_element_user(BR$4, var1);
         return var3;
      }
   }

   public CTTextLineBreak addNewBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLineBreak var2 = null;
         var2 = (CTTextLineBreak)this.get_store().add_element_user(BR$4);
         return var2;
      }
   }

   public void removeBr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BR$4, var1);
      }
   }

   public List getFldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FldList(this);
      }
   }

   public CTTextField[] getFldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FLD$6, var2);
         CTTextField[] var3 = new CTTextField[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextField getFldArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextField var3 = null;
         var3 = (CTTextField)this.get_store().find_element_user(FLD$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLD$6);
      }
   }

   public void setFldArray(CTTextField[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FLD$6);
      }
   }

   public void setFldArray(int var1, CTTextField var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextField var4 = null;
         var4 = (CTTextField)this.get_store().find_element_user(FLD$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextField insertNewFld(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextField var3 = null;
         var3 = (CTTextField)this.get_store().insert_element_user(FLD$6, var1);
         return var3;
      }
   }

   public CTTextField addNewFld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextField var2 = null;
         var2 = (CTTextField)this.get_store().add_element_user(FLD$6);
         return var2;
      }
   }

   public void removeFld(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLD$6, var1);
      }
   }

   public CTTextCharacterProperties getEndParaRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().find_element_user(ENDPARARPR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEndParaRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDPARARPR$8) != 0;
      }
   }

   public void setEndParaRPr(CTTextCharacterProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var3 = null;
         var3 = (CTTextCharacterProperties)this.get_store().find_element_user(ENDPARARPR$8, 0);
         if(var3 == null) {
            var3 = (CTTextCharacterProperties)this.get_store().add_element_user(ENDPARARPR$8);
         }

         var3.set(var1);
      }
   }

   public CTTextCharacterProperties addNewEndParaRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().add_element_user(ENDPARARPR$8);
         return var2;
      }
   }

   public void unsetEndParaRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDPARARPR$8, 0);
      }
   }

}
