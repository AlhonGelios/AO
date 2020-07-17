package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTColorScaleImpl.1CfvoList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTColorScaleImpl.1ColorList;

public class CTColorScaleImpl extends XmlComplexContentImpl implements CTColorScale {

   private static final QName CFVO$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
   private static final QName COLOR$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");


   public CTColorScaleImpl(SchemaType var1) {
      super(var1);
   }

   public List getCfvoList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CfvoList(this);
      }
   }

   public CTCfvo[] getCfvoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CFVO$0, var2);
         CTCfvo[] var3 = new CTCfvo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCfvo getCfvoArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var3 = null;
         var3 = (CTCfvo)this.get_store().find_element_user(CFVO$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCfvoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CFVO$0);
      }
   }

   public void setCfvoArray(CTCfvo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CFVO$0);
      }
   }

   public void setCfvoArray(int var1, CTCfvo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var4 = null;
         var4 = (CTCfvo)this.get_store().find_element_user(CFVO$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCfvo insertNewCfvo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var3 = null;
         var3 = (CTCfvo)this.get_store().insert_element_user(CFVO$0, var1);
         return var3;
      }
   }

   public CTCfvo addNewCfvo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var2 = null;
         var2 = (CTCfvo)this.get_store().add_element_user(CFVO$0);
         return var2;
      }
   }

   public void removeCfvo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CFVO$0, var1);
      }
   }

   public List getColorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColorList(this);
      }
   }

   public CTColor[] getColorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLOR$2, var2);
         CTColor[] var3 = new CTColor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTColor getColorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(COLOR$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLOR$2);
      }
   }

   public void setColorArray(CTColor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLOR$2);
      }
   }

   public void setColorArray(int var1, CTColor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var4 = null;
         var4 = (CTColor)this.get_store().find_element_user(COLOR$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTColor insertNewColor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().insert_element_user(COLOR$2, var1);
         return var3;
      }
   }

   public CTColor addNewColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(COLOR$2);
         return var2;
      }
   }

   public void removeColor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLOR$2, var1);
      }
   }

}
