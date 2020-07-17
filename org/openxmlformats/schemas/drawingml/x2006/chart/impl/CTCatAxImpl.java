package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLblAlgn;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLblOffset;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSkip;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTCatAxImpl extends XmlComplexContentImpl implements CTCatAx {

   private static final QName AXID$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
   private static final QName SCALING$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scaling");
   private static final QName DELETE$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "delete");
   private static final QName AXPOS$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axPos");
   private static final QName MAJORGRIDLINES$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "majorGridlines");
   private static final QName MINORGRIDLINES$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minorGridlines");
   private static final QName TITLE$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "title");
   private static final QName NUMFMT$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numFmt");
   private static final QName MAJORTICKMARK$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "majorTickMark");
   private static final QName MINORTICKMARK$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minorTickMark");
   private static final QName TICKLBLPOS$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tickLblPos");
   private static final QName SPPR$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName TXPR$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
   private static final QName CROSSAX$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crossAx");
   private static final QName CROSSES$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crosses");
   private static final QName CROSSESAT$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crossesAt");
   private static final QName AUTO$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "auto");
   private static final QName LBLALGN$34 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lblAlgn");
   private static final QName LBLOFFSET$36 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lblOffset");
   private static final QName TICKLBLSKIP$38 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tickLblSkip");
   private static final QName TICKMARKSKIP$40 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tickMarkSkip");
   private static final QName NOMULTILVLLBL$42 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "noMultiLvlLbl");
   private static final QName EXTLST$44 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTCatAxImpl(SchemaType var1) {
      super(var1);
   }

   public CTUnsignedInt getAxId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(AXID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAxId(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(AXID$0, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(AXID$0);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewAxId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(AXID$0);
         return var2;
      }
   }

   public CTScaling getScaling() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScaling var2 = null;
         var2 = (CTScaling)this.get_store().find_element_user(SCALING$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setScaling(CTScaling var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScaling var3 = null;
         var3 = (CTScaling)this.get_store().find_element_user(SCALING$2, 0);
         if(var3 == null) {
            var3 = (CTScaling)this.get_store().add_element_user(SCALING$2);
         }

         var3.set(var1);
      }
   }

   public CTScaling addNewScaling() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScaling var2 = null;
         var2 = (CTScaling)this.get_store().add_element_user(SCALING$2);
         return var2;
      }
   }

   public CTBoolean getDelete() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(DELETE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDelete() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELETE$4) != 0;
      }
   }

   public void setDelete(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(DELETE$4, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(DELETE$4);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewDelete() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(DELETE$4);
         return var2;
      }
   }

   public void unsetDelete() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELETE$4, 0);
      }
   }

   public CTAxPos getAxPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxPos var2 = null;
         var2 = (CTAxPos)this.get_store().find_element_user(AXPOS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAxPos(CTAxPos var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxPos var3 = null;
         var3 = (CTAxPos)this.get_store().find_element_user(AXPOS$6, 0);
         if(var3 == null) {
            var3 = (CTAxPos)this.get_store().add_element_user(AXPOS$6);
         }

         var3.set(var1);
      }
   }

   public CTAxPos addNewAxPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAxPos var2 = null;
         var2 = (CTAxPos)this.get_store().add_element_user(AXPOS$6);
         return var2;
      }
   }

   public CTChartLines getMajorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().find_element_user(MAJORGRIDLINES$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMajorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAJORGRIDLINES$8) != 0;
      }
   }

   public void setMajorGridlines(CTChartLines var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var3 = null;
         var3 = (CTChartLines)this.get_store().find_element_user(MAJORGRIDLINES$8, 0);
         if(var3 == null) {
            var3 = (CTChartLines)this.get_store().add_element_user(MAJORGRIDLINES$8);
         }

         var3.set(var1);
      }
   }

   public CTChartLines addNewMajorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().add_element_user(MAJORGRIDLINES$8);
         return var2;
      }
   }

   public void unsetMajorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAJORGRIDLINES$8, 0);
      }
   }

   public CTChartLines getMinorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().find_element_user(MINORGRIDLINES$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMinorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MINORGRIDLINES$10) != 0;
      }
   }

   public void setMinorGridlines(CTChartLines var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var3 = null;
         var3 = (CTChartLines)this.get_store().find_element_user(MINORGRIDLINES$10, 0);
         if(var3 == null) {
            var3 = (CTChartLines)this.get_store().add_element_user(MINORGRIDLINES$10);
         }

         var3.set(var1);
      }
   }

   public CTChartLines addNewMinorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartLines var2 = null;
         var2 = (CTChartLines)this.get_store().add_element_user(MINORGRIDLINES$10);
         return var2;
      }
   }

   public void unsetMinorGridlines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MINORGRIDLINES$10, 0);
      }
   }

   public CTTitle getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var2 = null;
         var2 = (CTTitle)this.get_store().find_element_user(TITLE$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TITLE$12) != 0;
      }
   }

   public void setTitle(CTTitle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var3 = null;
         var3 = (CTTitle)this.get_store().find_element_user(TITLE$12, 0);
         if(var3 == null) {
            var3 = (CTTitle)this.get_store().add_element_user(TITLE$12);
         }

         var3.set(var1);
      }
   }

   public CTTitle addNewTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var2 = null;
         var2 = (CTTitle)this.get_store().add_element_user(TITLE$12);
         return var2;
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TITLE$12, 0);
      }
   }

   public CTNumFmt getNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMFMT$14) != 0;
      }
   }

   public void setNumFmt(CTNumFmt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var3 = null;
         var3 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$14, 0);
         if(var3 == null) {
            var3 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$14);
         }

         var3.set(var1);
      }
   }

   public CTNumFmt addNewNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$14);
         return var2;
      }
   }

   public void unsetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMFMT$14, 0);
      }
   }

   public CTTickMark getMajorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var2 = null;
         var2 = (CTTickMark)this.get_store().find_element_user(MAJORTICKMARK$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMajorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAJORTICKMARK$16) != 0;
      }
   }

   public void setMajorTickMark(CTTickMark var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var3 = null;
         var3 = (CTTickMark)this.get_store().find_element_user(MAJORTICKMARK$16, 0);
         if(var3 == null) {
            var3 = (CTTickMark)this.get_store().add_element_user(MAJORTICKMARK$16);
         }

         var3.set(var1);
      }
   }

   public CTTickMark addNewMajorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var2 = null;
         var2 = (CTTickMark)this.get_store().add_element_user(MAJORTICKMARK$16);
         return var2;
      }
   }

   public void unsetMajorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAJORTICKMARK$16, 0);
      }
   }

   public CTTickMark getMinorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var2 = null;
         var2 = (CTTickMark)this.get_store().find_element_user(MINORTICKMARK$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMinorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MINORTICKMARK$18) != 0;
      }
   }

   public void setMinorTickMark(CTTickMark var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var3 = null;
         var3 = (CTTickMark)this.get_store().find_element_user(MINORTICKMARK$18, 0);
         if(var3 == null) {
            var3 = (CTTickMark)this.get_store().add_element_user(MINORTICKMARK$18);
         }

         var3.set(var1);
      }
   }

   public CTTickMark addNewMinorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickMark var2 = null;
         var2 = (CTTickMark)this.get_store().add_element_user(MINORTICKMARK$18);
         return var2;
      }
   }

   public void unsetMinorTickMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MINORTICKMARK$18, 0);
      }
   }

   public CTTickLblPos getTickLblPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickLblPos var2 = null;
         var2 = (CTTickLblPos)this.get_store().find_element_user(TICKLBLPOS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTickLblPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TICKLBLPOS$20) != 0;
      }
   }

   public void setTickLblPos(CTTickLblPos var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickLblPos var3 = null;
         var3 = (CTTickLblPos)this.get_store().find_element_user(TICKLBLPOS$20, 0);
         if(var3 == null) {
            var3 = (CTTickLblPos)this.get_store().add_element_user(TICKLBLPOS$20);
         }

         var3.set(var1);
      }
   }

   public CTTickLblPos addNewTickLblPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTickLblPos var2 = null;
         var2 = (CTTickLblPos)this.get_store().add_element_user(TICKLBLPOS$20);
         return var2;
      }
   }

   public void unsetTickLblPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TICKLBLPOS$20, 0);
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$22) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$22, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$22);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$22);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$22, 0);
      }
   }

   public CTTextBody getTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXPR$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXPR$24) != 0;
      }
   }

   public void setTxPr(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXPR$24, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXPR$24);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXPR$24);
         return var2;
      }
   }

   public void unsetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXPR$24, 0);
      }
   }

   public CTUnsignedInt getCrossAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().find_element_user(CROSSAX$26, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCrossAx(CTUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var3 = null;
         var3 = (CTUnsignedInt)this.get_store().find_element_user(CROSSAX$26, 0);
         if(var3 == null) {
            var3 = (CTUnsignedInt)this.get_store().add_element_user(CROSSAX$26);
         }

         var3.set(var1);
      }
   }

   public CTUnsignedInt addNewCrossAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnsignedInt var2 = null;
         var2 = (CTUnsignedInt)this.get_store().add_element_user(CROSSAX$26);
         return var2;
      }
   }

   public CTCrosses getCrosses() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCrosses var2 = null;
         var2 = (CTCrosses)this.get_store().find_element_user(CROSSES$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCrosses() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CROSSES$28) != 0;
      }
   }

   public void setCrosses(CTCrosses var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCrosses var3 = null;
         var3 = (CTCrosses)this.get_store().find_element_user(CROSSES$28, 0);
         if(var3 == null) {
            var3 = (CTCrosses)this.get_store().add_element_user(CROSSES$28);
         }

         var3.set(var1);
      }
   }

   public CTCrosses addNewCrosses() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCrosses var2 = null;
         var2 = (CTCrosses)this.get_store().add_element_user(CROSSES$28);
         return var2;
      }
   }

   public void unsetCrosses() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CROSSES$28, 0);
      }
   }

   public CTDouble getCrossesAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(CROSSESAT$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCrossesAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CROSSESAT$30) != 0;
      }
   }

   public void setCrossesAt(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(CROSSESAT$30, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(CROSSESAT$30);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewCrossesAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(CROSSESAT$30);
         return var2;
      }
   }

   public void unsetCrossesAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CROSSESAT$30, 0);
      }
   }

   public CTBoolean getAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(AUTO$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTO$32) != 0;
      }
   }

   public void setAuto(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(AUTO$32, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(AUTO$32);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(AUTO$32);
         return var2;
      }
   }

   public void unsetAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTO$32, 0);
      }
   }

   public CTLblAlgn getLblAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblAlgn var2 = null;
         var2 = (CTLblAlgn)this.get_store().find_element_user(LBLALGN$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLblAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LBLALGN$34) != 0;
      }
   }

   public void setLblAlgn(CTLblAlgn var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblAlgn var3 = null;
         var3 = (CTLblAlgn)this.get_store().find_element_user(LBLALGN$34, 0);
         if(var3 == null) {
            var3 = (CTLblAlgn)this.get_store().add_element_user(LBLALGN$34);
         }

         var3.set(var1);
      }
   }

   public CTLblAlgn addNewLblAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblAlgn var2 = null;
         var2 = (CTLblAlgn)this.get_store().add_element_user(LBLALGN$34);
         return var2;
      }
   }

   public void unsetLblAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LBLALGN$34, 0);
      }
   }

   public CTLblOffset getLblOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblOffset var2 = null;
         var2 = (CTLblOffset)this.get_store().find_element_user(LBLOFFSET$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLblOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LBLOFFSET$36) != 0;
      }
   }

   public void setLblOffset(CTLblOffset var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblOffset var3 = null;
         var3 = (CTLblOffset)this.get_store().find_element_user(LBLOFFSET$36, 0);
         if(var3 == null) {
            var3 = (CTLblOffset)this.get_store().add_element_user(LBLOFFSET$36);
         }

         var3.set(var1);
      }
   }

   public CTLblOffset addNewLblOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLblOffset var2 = null;
         var2 = (CTLblOffset)this.get_store().add_element_user(LBLOFFSET$36);
         return var2;
      }
   }

   public void unsetLblOffset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LBLOFFSET$36, 0);
      }
   }

   public CTSkip getTickLblSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var2 = null;
         var2 = (CTSkip)this.get_store().find_element_user(TICKLBLSKIP$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTickLblSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TICKLBLSKIP$38) != 0;
      }
   }

   public void setTickLblSkip(CTSkip var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var3 = null;
         var3 = (CTSkip)this.get_store().find_element_user(TICKLBLSKIP$38, 0);
         if(var3 == null) {
            var3 = (CTSkip)this.get_store().add_element_user(TICKLBLSKIP$38);
         }

         var3.set(var1);
      }
   }

   public CTSkip addNewTickLblSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var2 = null;
         var2 = (CTSkip)this.get_store().add_element_user(TICKLBLSKIP$38);
         return var2;
      }
   }

   public void unsetTickLblSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TICKLBLSKIP$38, 0);
      }
   }

   public CTSkip getTickMarkSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var2 = null;
         var2 = (CTSkip)this.get_store().find_element_user(TICKMARKSKIP$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTickMarkSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TICKMARKSKIP$40) != 0;
      }
   }

   public void setTickMarkSkip(CTSkip var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var3 = null;
         var3 = (CTSkip)this.get_store().find_element_user(TICKMARKSKIP$40, 0);
         if(var3 == null) {
            var3 = (CTSkip)this.get_store().add_element_user(TICKMARKSKIP$40);
         }

         var3.set(var1);
      }
   }

   public CTSkip addNewTickMarkSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkip var2 = null;
         var2 = (CTSkip)this.get_store().add_element_user(TICKMARKSKIP$40);
         return var2;
      }
   }

   public void unsetTickMarkSkip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TICKMARKSKIP$40, 0);
      }
   }

   public CTBoolean getNoMultiLvlLbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(NOMULTILVLLBL$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoMultiLvlLbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOMULTILVLLBL$42) != 0;
      }
   }

   public void setNoMultiLvlLbl(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(NOMULTILVLLBL$42, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(NOMULTILVLLBL$42);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewNoMultiLvlLbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(NOMULTILVLLBL$42);
         return var2;
      }
   }

   public void unsetNoMultiLvlLbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOMULTILVLLBL$42, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$44) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$44, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$44);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$44);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$44, 0);
      }
   }

}
