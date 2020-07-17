package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTScatterChartImpl.1AxIdList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTScatterChartImpl.1SerList;

public class CTScatterChartImpl extends XmlComplexContentImpl implements CTScatterChart {

   private static final QName SCATTERSTYLE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scatterStyle");
   private static final QName VARYCOLORS$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
   private static final QName SER$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
   private static final QName DLBLS$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
   private static final QName AXID$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
   private static final QName EXTLST$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTScatterChartImpl(SchemaType var1) {
      super(var1);
   }

   public CTScatterStyle getScatterStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterStyle var2 = null;
         var2 = (CTScatterStyle)this.get_store().find_element_user(SCATTERSTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setScatterStyle(CTScatterStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterStyle var3 = null;
         var3 = (CTScatterStyle)this.get_store().find_element_user(SCATTERSTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTScatterStyle)this.get_store().add_element_user(SCATTERSTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTScatterStyle addNewScatterStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterStyle var2 = null;
         var2 = (CTScatterStyle)this.get_store().add_element_user(SCATTERSTYLE$0);
         return var2;
      }
   }

   public CTBoolean getVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(VARYCOLORS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VARYCOLORS$2) != 0;
      }
   }

   public void setVaryColors(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(VARYCOLORS$2, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(VARYCOLORS$2);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(VARYCOLORS$2);
         return var2;
      }
   }

   public void unsetVaryColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VARYCOLORS$2, 0);
      }
   }

   public List getSerList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SerList(this);
      }
   }

   public CTScatterSer[] getSerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SER$4, var2);
         CTScatterSer[] var3 = new CTScatterSer[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTScatterSer getSerArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterSer var3 = null;
         var3 = (CTScatterSer)this.get_store().find_element_user(SER$4, var1);
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
         return this.get_store().count_elements(SER$4);
      }
   }

   public void setSerArray(CTScatterSer[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SER$4);
      }
   }

   public void setSerArray(int var1, CTScatterSer var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterSer var4 = null;
         var4 = (CTScatterSer)this.get_store().find_element_user(SER$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTScatterSer insertNewSer(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterSer var3 = null;
         var3 = (CTScatterSer)this.get_store().insert_element_user(SER$4, var1);
         return var3;
      }
   }

   public CTScatterSer addNewSer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterSer var2 = null;
         var2 = (CTScatterSer)this.get_store().add_element_user(SER$4);
         return var2;
      }
   }

   public void removeSer(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SER$4, var1);
      }
   }

   public CTDLbls getDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().find_element_user(DLBLS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DLBLS$6) != 0;
      }
   }

   public void setDLbls(CTDLbls var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var3 = null;
         var3 = (CTDLbls)this.get_store().find_element_user(DLBLS$6, 0);
         if(var3 == null) {
            var3 = (CTDLbls)this.get_store().add_element_user(DLBLS$6);
         }

         var3.set(var1);
      }
   }

   public CTDLbls addNewDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().add_element_user(DLBLS$6);
         return var2;
      }
   }

   public void unsetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DLBLS$6, 0);
      }
   }

   public List getAxIdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AxIdList(this);
      }
   }

   public CTUnsignedInt[] getAxIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AXID$8, var2);
         CTUnsignedInt[] var3 = new CTUnsignedInt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTUnsignedInt getAxIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(AXID$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAxIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AXID$8);
      }
   }

   public void setAxIdArray(CTUnsignedInt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AXID$8);
      }
   }

   public void setAxIdArray(int var1, CTUnsignedInt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var4 = null;
         var4 = (CTUnsignedInt)this.get_store().find_element_user(AXID$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTUnsignedInt insertNewAxId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().insert_element_user(AXID$8, var1);
         return var3;
      }
   }

   public CTUnsignedInt addNewAxId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(AXID$8);
         return var2;
      }
   }

   public void removeAxId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AXID$8, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$10) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$10, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$10);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$10);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$10, 0);
      }
   }

}
