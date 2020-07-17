package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTNumDataImpl.1PtList;

public class CTNumDataImpl extends XmlComplexContentImpl implements CTNumData {

   private static final QName FORMATCODE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "formatCode");
   private static final QName PTCOUNT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ptCount");
   private static final QName PT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pt");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTNumDataImpl(SchemaType var1) {
      super(var1);
   }

   public String getFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FORMATCODE$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(FORMATCODE$0, 0);
         return var2;
      }
   }

   public boolean isSetFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMATCODE$0) != 0;
      }
   }

   public void setFormatCode(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FORMATCODE$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FORMATCODE$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormatCode(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(FORMATCODE$0, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(FORMATCODE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFormatCode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMATCODE$0, 0);
      }
   }

   public CTUnsignedInt getPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(PTCOUNT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PTCOUNT$2) != 0;
      }
   }

   public void setPtCount(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(PTCOUNT$2, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(PTCOUNT$2);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(PTCOUNT$2);
         return var2;
      }
   }

   public void unsetPtCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PTCOUNT$2, 0);
      }
   }

   public List getPtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PtList(this);
      }
   }

   public CTNumVal[] getPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PT$4, var2);
         CTNumVal[] var3 = new CTNumVal[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNumVal getPtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumVal var3 = null;
         var3 = (CTNumVal)this.get_store().find_element_user(PT$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PT$4);
      }
   }

   public void setPtArray(CTNumVal[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PT$4);
      }
   }

   public void setPtArray(int var1, CTNumVal var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumVal var4 = null;
         var4 = (CTNumVal)this.get_store().find_element_user(PT$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNumVal insertNewPt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumVal var3 = null;
         var3 = (CTNumVal)this.get_store().insert_element_user(PT$4, var1);
         return var3;
      }
   }

   public CTNumVal addNewPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumVal var2 = null;
         var2 = (CTNumVal)this.get_store().add_element_user(PT$4);
         return var2;
      }
   }

   public void removePt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PT$4, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
