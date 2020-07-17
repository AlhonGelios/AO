package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTFirstSliceAng;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPieChartImpl.1SerList;

public class CTPieChartImpl extends XmlComplexContentImpl implements CTPieChart {

   private static final QName VARYCOLORS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
   private static final QName SER$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
   private static final QName DLBLS$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
   private static final QName FIRSTSLICEANG$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "firstSliceAng");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTPieChartImpl(SchemaType var1) {
      super(var1);
   }

   public CTBoolean getVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(VARYCOLORS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VARYCOLORS$0) != 0;
      }
   }

   public void setVaryColors(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(VARYCOLORS$0, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(VARYCOLORS$0);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(VARYCOLORS$0);
         return var2;
      }
   }

   public void unsetVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VARYCOLORS$0, 0);
      }
   }

   public List getSerList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SerList(this);
      }
   }

   public CTPieSer[] getSerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SER$2, var2);
         CTPieSer[] var3 = new CTPieSer[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPieSer getSerArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieSer var3 = null;
         var3 = (CTPieSer)this.get_store().find_element_user(SER$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SER$2);
      }
   }

   public void setSerArray(CTPieSer[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SER$2);
      }
   }

   public void setSerArray(int var1, CTPieSer var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieSer var4 = null;
         var4 = (CTPieSer)this.get_store().find_element_user(SER$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPieSer insertNewSer(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieSer var3 = null;
         var3 = (CTPieSer)this.get_store().insert_element_user(SER$2, var1);
         return var3;
      }
   }

   public CTPieSer addNewSer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieSer var2 = null;
         var2 = (CTPieSer)this.get_store().add_element_user(SER$2);
         return var2;
      }
   }

   public void removeSer(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SER$2, var1);
      }
   }

   public CTDLbls getDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().find_element_user(DLBLS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DLBLS$4) != 0;
      }
   }

   public void setDLbls(CTDLbls var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var3 = null;
         var3 = (CTDLbls)this.get_store().find_element_user(DLBLS$4, 0);
         if(var3 == null) {
            var3 = (CTDLbls)this.get_store().add_element_user(DLBLS$4);
         }

         var3.set(var1);
      }
   }

   public CTDLbls addNewDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().add_element_user(DLBLS$4);
         return var2;
      }
   }

   public void unsetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DLBLS$4, 0);
      }
   }

   public CTFirstSliceAng getFirstSliceAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFirstSliceAng var2 = null;
         var2 = (CTFirstSliceAng)this.get_store().find_element_user(FIRSTSLICEANG$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFirstSliceAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTSLICEANG$6) != 0;
      }
   }

   public void setFirstSliceAng(CTFirstSliceAng var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFirstSliceAng var3 = null;
         var3 = (CTFirstSliceAng)this.get_store().find_element_user(FIRSTSLICEANG$6, 0);
         if(var3 == null) {
            var3 = (CTFirstSliceAng)this.get_store().add_element_user(FIRSTSLICEANG$6);
         }

         var3.set(var1);
      }
   }

   public CTFirstSliceAng addNewFirstSliceAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFirstSliceAng var2 = null;
         var2 = (CTFirstSliceAng)this.get_store().add_element_user(FIRSTSLICEANG$6);
         return var2;
      }
   }

   public void unsetFirstSliceAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTSLICEANG$6, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

}
