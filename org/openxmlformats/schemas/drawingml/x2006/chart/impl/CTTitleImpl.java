package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTx;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTTitleImpl extends XmlComplexContentImpl implements CTTitle {

   private static final QName TX$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tx");
   private static final QName LAYOUT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
   private static final QName OVERLAY$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "overlay");
   private static final QName SPPR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName TXPR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
   private static final QName EXTLST$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTTitleImpl(SchemaType var1) {
      super(var1);
   }

   public CTTx getTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTx var2 = null;
         var2 = (CTTx)this.get_store().find_element_user(TX$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TX$0) != 0;
      }
   }

   public void setTx(CTTx var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTx var3 = null;
         var3 = (CTTx)this.get_store().find_element_user(TX$0, 0);
         if(var3 == null) {
            var3 = (CTTx)this.get_store().add_element_user(TX$0);
         }

         var3.set(var1);
      }
   }

   public CTTx addNewTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTx var2 = null;
         var2 = (CTTx)this.get_store().add_element_user(TX$0);
         return var2;
      }
   }

   public void unsetTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TX$0, 0);
      }
   }

   public CTLayout getLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().find_element_user(LAYOUT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LAYOUT$2) != 0;
      }
   }

   public void setLayout(CTLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var3 = null;
         var3 = (CTLayout)this.get_store().find_element_user(LAYOUT$2, 0);
         if(var3 == null) {
            var3 = (CTLayout)this.get_store().add_element_user(LAYOUT$2);
         }

         var3.set(var1);
      }
   }

   public CTLayout addNewLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().add_element_user(LAYOUT$2);
         return var2;
      }
   }

   public void unsetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LAYOUT$2, 0);
      }
   }

   public CTBoolean getOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(OVERLAY$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OVERLAY$4) != 0;
      }
   }

   public void setOverlay(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(OVERLAY$4, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(OVERLAY$4);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(OVERLAY$4);
         return var2;
      }
   }

   public void unsetOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OVERLAY$4, 0);
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$6) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$6, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$6);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$6);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$6, 0);
      }
   }

   public CTTextBody getTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXPR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXPR$8) != 0;
      }
   }

   public void setTxPr(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXPR$8, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXPR$8);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXPR$8);
         return var2;
      }
   }

   public void unsetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXPR$8, 0);
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
