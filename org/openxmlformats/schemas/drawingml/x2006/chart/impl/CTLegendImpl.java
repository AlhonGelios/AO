package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTLegendImpl.1LegendEntryList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTLegendImpl extends XmlComplexContentImpl implements CTLegend {

   private static final QName LEGENDPOS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legendPos");
   private static final QName LEGENDENTRY$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legendEntry");
   private static final QName LAYOUT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
   private static final QName OVERLAY$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "overlay");
   private static final QName SPPR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName TXPR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
   private static final QName EXTLST$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTLegendImpl(SchemaType var1) {
      super(var1);
   }

   public CTLegendPos getLegendPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendPos var2 = null;
         var2 = (CTLegendPos)this.get_store().find_element_user(LEGENDPOS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegendPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGENDPOS$0) != 0;
      }
   }

   public void setLegendPos(CTLegendPos var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendPos var3 = null;
         var3 = (CTLegendPos)this.get_store().find_element_user(LEGENDPOS$0, 0);
         if(var3 == null) {
            var3 = (CTLegendPos)this.get_store().add_element_user(LEGENDPOS$0);
         }

         var3.set(var1);
      }
   }

   public CTLegendPos addNewLegendPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendPos var2 = null;
         var2 = (CTLegendPos)this.get_store().add_element_user(LEGENDPOS$0);
         return var2;
      }
   }

   public void unsetLegendPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGENDPOS$0, 0);
      }
   }

   public List getLegendEntryList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LegendEntryList(this);
      }
   }

   public CTLegendEntry[] getLegendEntryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LEGENDENTRY$2, var2);
         CTLegendEntry[] var3 = new CTLegendEntry[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLegendEntry getLegendEntryArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendEntry var3 = null;
         var3 = (CTLegendEntry)this.get_store().find_element_user(LEGENDENTRY$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLegendEntryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGENDENTRY$2);
      }
   }

   public void setLegendEntryArray(CTLegendEntry[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LEGENDENTRY$2);
      }
   }

   public void setLegendEntryArray(int var1, CTLegendEntry var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendEntry var4 = null;
         var4 = (CTLegendEntry)this.get_store().find_element_user(LEGENDENTRY$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLegendEntry insertNewLegendEntry(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendEntry var3 = null;
         var3 = (CTLegendEntry)this.get_store().insert_element_user(LEGENDENTRY$2, var1);
         return var3;
      }
   }

   public CTLegendEntry addNewLegendEntry() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegendEntry var2 = null;
         var2 = (CTLegendEntry)this.get_store().add_element_user(LEGENDENTRY$2);
         return var2;
      }
   }

   public void removeLegendEntry(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGENDENTRY$2, var1);
      }
   }

   public CTLayout getLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().find_element_user(LAYOUT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LAYOUT$4) != 0;
      }
   }

   public void setLayout(CTLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var3 = null;
         var3 = (CTLayout)this.get_store().find_element_user(LAYOUT$4, 0);
         if(var3 == null) {
            var3 = (CTLayout)this.get_store().add_element_user(LAYOUT$4);
         }

         var3.set(var1);
      }
   }

   public CTLayout addNewLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().add_element_user(LAYOUT$4);
         return var2;
      }
   }

   public void unsetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LAYOUT$4, 0);
      }
   }

   public CTBoolean getOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(OVERLAY$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OVERLAY$6) != 0;
      }
   }

   public void setOverlay(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(OVERLAY$6, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(OVERLAY$6);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(OVERLAY$6);
         return var2;
      }
   }

   public void unsetOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OVERLAY$6, 0);
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$8) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$8, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$8);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$8);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$8, 0);
      }
   }

   public CTTextBody getTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXPR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXPR$10) != 0;
      }
   }

   public void setTxPr(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXPR$10, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXPR$10);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXPR$10);
         return var2;
      }
   }

   public void unsetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXPR$10, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$12) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$12, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$12);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$12);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$12, 0);
      }
   }

}
