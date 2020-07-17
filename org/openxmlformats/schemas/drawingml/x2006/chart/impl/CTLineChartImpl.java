package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTLineChartImpl.1AxIdList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTLineChartImpl.1SerList;

public class CTLineChartImpl extends XmlComplexContentImpl implements CTLineChart {

   private static final QName GROUPING$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "grouping");
   private static final QName VARYCOLORS$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
   private static final QName SER$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
   private static final QName DLBLS$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
   private static final QName DROPLINES$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dropLines");
   private static final QName HILOWLINES$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "hiLowLines");
   private static final QName UPDOWNBARS$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "upDownBars");
   private static final QName MARKER$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "marker");
   private static final QName SMOOTH$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "smooth");
   private static final QName AXID$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTLineChartImpl(SchemaType var1) {
      super(var1);
   }

   public CTGrouping getGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrouping var2 = null;
         var2 = (CTGrouping)this.get_store().find_element_user(GROUPING$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGrouping(CTGrouping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrouping var3 = null;
         var3 = (CTGrouping)this.get_store().find_element_user(GROUPING$0, 0);
         if(var3 == null) {
            var3 = (CTGrouping)this.get_store().add_element_user(GROUPING$0);
         }

         var3.set(var1);
      }
   }

   public CTGrouping addNewGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrouping var2 = null;
         var2 = (CTGrouping)this.get_store().add_element_user(GROUPING$0);
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

   public CTLineSer[] getSerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SER$4, var2);
         CTLineSer[] var3 = new CTLineSer[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLineSer getSerArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineSer var3 = null;
         var3 = (CTLineSer)this.get_store().find_element_user(SER$4, var1);
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

   public void setSerArray(CTLineSer[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SER$4);
      }
   }

   public void setSerArray(int var1, CTLineSer var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineSer var4 = null;
         var4 = (CTLineSer)this.get_store().find_element_user(SER$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLineSer insertNewSer(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineSer var3 = null;
         var3 = (CTLineSer)this.get_store().insert_element_user(SER$4, var1);
         return var3;
      }
   }

   public CTLineSer addNewSer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineSer var2 = null;
         var2 = (CTLineSer)this.get_store().add_element_user(SER$4);
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

   public CTChartLines getDropLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().find_element_user(DROPLINES$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDropLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DROPLINES$8) != 0;
      }
   }

   public void setDropLines(CTChartLines var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var3 = null;
         var3 = (CTChartLines)this.get_store().find_element_user(DROPLINES$8, 0);
         if(var3 == null) {
            var3 = (CTChartLines)this.get_store().add_element_user(DROPLINES$8);
         }

         var3.set(var1);
      }
   }

   public CTChartLines addNewDropLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().add_element_user(DROPLINES$8);
         return var2;
      }
   }

   public void unsetDropLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DROPLINES$8, 0);
      }
   }

   public CTChartLines getHiLowLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().find_element_user(HILOWLINES$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHiLowLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HILOWLINES$10) != 0;
      }
   }

   public void setHiLowLines(CTChartLines var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var3 = null;
         var3 = (CTChartLines)this.get_store().find_element_user(HILOWLINES$10, 0);
         if(var3 == null) {
            var3 = (CTChartLines)this.get_store().add_element_user(HILOWLINES$10);
         }

         var3.set(var1);
      }
   }

   public CTChartLines addNewHiLowLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().add_element_user(HILOWLINES$10);
         return var2;
      }
   }

   public void unsetHiLowLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HILOWLINES$10, 0);
      }
   }

   public CTUpDownBars getUpDownBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUpDownBars var2 = null;
         var2 = (CTUpDownBars)this.get_store().find_element_user(UPDOWNBARS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUpDownBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UPDOWNBARS$12) != 0;
      }
   }

   public void setUpDownBars(CTUpDownBars var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUpDownBars var3 = null;
         var3 = (CTUpDownBars)this.get_store().find_element_user(UPDOWNBARS$12, 0);
         if(var3 == null) {
            var3 = (CTUpDownBars)this.get_store().add_element_user(UPDOWNBARS$12);
         }

         var3.set(var1);
      }
   }

   public CTUpDownBars addNewUpDownBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUpDownBars var2 = null;
         var2 = (CTUpDownBars)this.get_store().add_element_user(UPDOWNBARS$12);
         return var2;
      }
   }

   public void unsetUpDownBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UPDOWNBARS$12, 0);
      }
   }

   public CTBoolean getMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(MARKER$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MARKER$14) != 0;
      }
   }

   public void setMarker(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(MARKER$14, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(MARKER$14);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(MARKER$14);
         return var2;
      }
   }

   public void unsetMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MARKER$14, 0);
      }
   }

   public CTBoolean getSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(SMOOTH$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMOOTH$16) != 0;
      }
   }

   public void setSmooth(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(SMOOTH$16, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(SMOOTH$16);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(SMOOTH$16);
         return var2;
      }
   }

   public void unsetSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMOOTH$16, 0);
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
         this.get_store().find_all_element_users(AXID$18, var2);
         CTUnsignedInt[] var3 = new CTUnsignedInt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTUnsignedInt getAxIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(AXID$18, var1);
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
         return this.get_store().count_elements(AXID$18);
      }
   }

   public void setAxIdArray(CTUnsignedInt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AXID$18);
      }
   }

   public void setAxIdArray(int var1, CTUnsignedInt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var4 = null;
         var4 = (CTUnsignedInt)this.get_store().find_element_user(AXID$18, var1);
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
         var3 = (CTUnsignedInt)this.get_store().insert_element_user(AXID$18, var1);
         return var3;
      }
   }

   public CTUnsignedInt addNewAxId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(AXID$18);
         return var2;
      }
   }

   public void removeAxId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AXID$18, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$20, 0);
      }
   }

}
