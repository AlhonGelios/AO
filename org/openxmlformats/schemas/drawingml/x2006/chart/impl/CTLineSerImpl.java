package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTLineSerImpl.1DPtList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTLineSerImpl.1TrendlineList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;

public class CTLineSerImpl extends XmlComplexContentImpl implements CTLineSer {

   private static final QName IDX$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "idx");
   private static final QName ORDER$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "order");
   private static final QName TX$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tx");
   private static final QName SPPR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName MARKER$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "marker");
   private static final QName DPT$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dPt");
   private static final QName DLBLS$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
   private static final QName TRENDLINE$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "trendline");
   private static final QName ERRBARS$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errBars");
   private static final QName CAT$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "cat");
   private static final QName VAL$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "val");
   private static final QName SMOOTH$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "smooth");
   private static final QName EXTLST$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTLineSerImpl(SchemaType var1) {
      super(var1);
   }

   public CTUnsignedInt getIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(IDX$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setIdx(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(IDX$0, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(IDX$0);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(IDX$0);
         return var2;
      }
   }

   public CTUnsignedInt getOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(ORDER$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setOrder(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(ORDER$2, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(ORDER$2);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewOrder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(ORDER$2);
         return var2;
      }
   }

   public CTSerTx getTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerTx var2 = null;
         var2 = (CTSerTx)this.get_store().find_element_user(TX$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TX$4) != 0;
      }
   }

   public void setTx(CTSerTx var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerTx var3 = null;
         var3 = (CTSerTx)this.get_store().find_element_user(TX$4, 0);
         if(var3 == null) {
            var3 = (CTSerTx)this.get_store().add_element_user(TX$4);
         }

         var3.set(var1);
      }
   }

   public CTSerTx addNewTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerTx var2 = null;
         var2 = (CTSerTx)this.get_store().add_element_user(TX$4);
         return var2;
      }
   }

   public void unsetTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TX$4, 0);
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

   public CTMarker getMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().find_element_user(MARKER$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MARKER$8) != 0;
      }
   }

   public void setMarker(CTMarker var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var3 = null;
         var3 = (CTMarker)this.get_store().find_element_user(MARKER$8, 0);
         if(var3 == null) {
            var3 = (CTMarker)this.get_store().add_element_user(MARKER$8);
         }

         var3.set(var1);
      }
   }

   public CTMarker addNewMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().add_element_user(MARKER$8);
         return var2;
      }
   }

   public void unsetMarker() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MARKER$8, 0);
      }
   }

   public List getDPtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DPtList(this);
      }
   }

   public CTDPt[] getDPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DPT$10, var2);
         CTDPt[] var3 = new CTDPt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDPt getDPtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDPt var3 = null;
         var3 = (CTDPt)this.get_store().find_element_user(DPT$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDPtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DPT$10);
      }
   }

   public void setDPtArray(CTDPt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DPT$10);
      }
   }

   public void setDPtArray(int var1, CTDPt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDPt var4 = null;
         var4 = (CTDPt)this.get_store().find_element_user(DPT$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDPt insertNewDPt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDPt var3 = null;
         var3 = (CTDPt)this.get_store().insert_element_user(DPT$10, var1);
         return var3;
      }
   }

   public CTDPt addNewDPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDPt var2 = null;
         var2 = (CTDPt)this.get_store().add_element_user(DPT$10);
         return var2;
      }
   }

   public void removeDPt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DPT$10, var1);
      }
   }

   public CTDLbls getDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().find_element_user(DLBLS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DLBLS$12) != 0;
      }
   }

   public void setDLbls(CTDLbls var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var3 = null;
         var3 = (CTDLbls)this.get_store().find_element_user(DLBLS$12, 0);
         if(var3 == null) {
            var3 = (CTDLbls)this.get_store().add_element_user(DLBLS$12);
         }

         var3.set(var1);
      }
   }

   public CTDLbls addNewDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDLbls var2 = null;
         var2 = (CTDLbls)this.get_store().add_element_user(DLBLS$12);
         return var2;
      }
   }

   public void unsetDLbls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DLBLS$12, 0);
      }
   }

   public List getTrendlineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TrendlineList(this);
      }
   }

   public CTTrendline[] getTrendlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TRENDLINE$14, var2);
         CTTrendline[] var3 = new CTTrendline[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrendline getTrendlineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrendline var3 = null;
         var3 = (CTTrendline)this.get_store().find_element_user(TRENDLINE$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTrendlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRENDLINE$14);
      }
   }

   public void setTrendlineArray(CTTrendline[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TRENDLINE$14);
      }
   }

   public void setTrendlineArray(int var1, CTTrendline var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrendline var4 = null;
         var4 = (CTTrendline)this.get_store().find_element_user(TRENDLINE$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTrendline insertNewTrendline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrendline var3 = null;
         var3 = (CTTrendline)this.get_store().insert_element_user(TRENDLINE$14, var1);
         return var3;
      }
   }

   public CTTrendline addNewTrendline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrendline var2 = null;
         var2 = (CTTrendline)this.get_store().add_element_user(TRENDLINE$14);
         return var2;
      }
   }

   public void removeTrendline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRENDLINE$14, var1);
      }
   }

   public CTErrBars getErrBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTErrBars var2 = null;
         var2 = (CTErrBars)this.get_store().find_element_user(ERRBARS$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetErrBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ERRBARS$16) != 0;
      }
   }

   public void setErrBars(CTErrBars var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTErrBars var3 = null;
         var3 = (CTErrBars)this.get_store().find_element_user(ERRBARS$16, 0);
         if(var3 == null) {
            var3 = (CTErrBars)this.get_store().add_element_user(ERRBARS$16);
         }

         var3.set(var1);
      }
   }

   public CTErrBars addNewErrBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTErrBars var2 = null;
         var2 = (CTErrBars)this.get_store().add_element_user(ERRBARS$16);
         return var2;
      }
   }

   public void unsetErrBars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ERRBARS$16, 0);
      }
   }

   public CTAxDataSource getCat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxDataSource var2 = null;
         var2 = (CTAxDataSource)this.get_store().find_element_user(CAT$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CAT$18) != 0;
      }
   }

   public void setCat(CTAxDataSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxDataSource var3 = null;
         var3 = (CTAxDataSource)this.get_store().find_element_user(CAT$18, 0);
         if(var3 == null) {
            var3 = (CTAxDataSource)this.get_store().add_element_user(CAT$18);
         }

         var3.set(var1);
      }
   }

   public CTAxDataSource addNewCat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxDataSource var2 = null;
         var2 = (CTAxDataSource)this.get_store().add_element_user(CAT$18);
         return var2;
      }
   }

   public void unsetCat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CAT$18, 0);
      }
   }

   public CTNumDataSource getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumDataSource var2 = null;
         var2 = (CTNumDataSource)this.get_store().find_element_user(VAL$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VAL$20) != 0;
      }
   }

   public void setVal(CTNumDataSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumDataSource var3 = null;
         var3 = (CTNumDataSource)this.get_store().find_element_user(VAL$20, 0);
         if(var3 == null) {
            var3 = (CTNumDataSource)this.get_store().add_element_user(VAL$20);
         }

         var3.set(var1);
      }
   }

   public CTNumDataSource addNewVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumDataSource var2 = null;
         var2 = (CTNumDataSource)this.get_store().add_element_user(VAL$20);
         return var2;
      }
   }

   public void unsetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VAL$20, 0);
      }
   }

   public CTBoolean getSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(SMOOTH$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMOOTH$22) != 0;
      }
   }

   public void setSmooth(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(SMOOTH$22, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(SMOOTH$22);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(SMOOTH$22);
         return var2;
      }
   }

   public void unsetSmooth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMOOTH$22, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$24) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$24, 0);
      }
   }

}
