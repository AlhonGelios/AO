package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTChartSpaceImpl extends XmlComplexContentImpl implements CTChartSpace {

   private static final QName DATE1904$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "date1904");
   private static final QName LANG$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lang");
   private static final QName ROUNDEDCORNERS$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "roundedCorners");
   private static final QName STYLE$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "style");
   private static final QName CLRMAPOVR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "clrMapOvr");
   private static final QName PIVOTSOURCE$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pivotSource");
   private static final QName PROTECTION$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "protection");
   private static final QName CHART$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chart");
   private static final QName SPPR$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName TXPR$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
   private static final QName EXTERNALDATA$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "externalData");
   private static final QName PRINTSETTINGS$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "printSettings");
   private static final QName USERSHAPES$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "userShapes");
   private static final QName EXTLST$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTChartSpaceImpl(SchemaType var1) {
      super(var1);
   }

   public CTBoolean getDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(DATE1904$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATE1904$0) != 0;
      }
   }

   public void setDate1904(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(DATE1904$0, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(DATE1904$0);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(DATE1904$0);
         return var2;
      }
   }

   public void unsetDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATE1904$0, 0);
      }
   }

   public CTTextLanguageID getLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLanguageID var2 = null;
         var2 = (CTTextLanguageID)this.get_store().find_element_user(LANG$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LANG$2) != 0;
      }
   }

   public void setLang(CTTextLanguageID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLanguageID var3 = null;
         var3 = (CTTextLanguageID)this.get_store().find_element_user(LANG$2, 0);
         if(var3 == null) {
            var3 = (CTTextLanguageID)this.get_store().add_element_user(LANG$2);
         }

         var3.set(var1);
      }
   }

   public CTTextLanguageID addNewLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextLanguageID var2 = null;
         var2 = (CTTextLanguageID)this.get_store().add_element_user(LANG$2);
         return var2;
      }
   }

   public void unsetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LANG$2, 0);
      }
   }

   public CTBoolean getRoundedCorners() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(ROUNDEDCORNERS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRoundedCorners() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROUNDEDCORNERS$4) != 0;
      }
   }

   public void setRoundedCorners(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(ROUNDEDCORNERS$4, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(ROUNDEDCORNERS$4);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewRoundedCorners() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(ROUNDEDCORNERS$4);
         return var2;
      }
   }

   public void unsetRoundedCorners() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROUNDEDCORNERS$4, 0);
      }
   }

   public CTStyle getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var2 = null;
         var2 = (CTStyle)this.get_store().find_element_user(STYLE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLE$6) != 0;
      }
   }

   public void setStyle(CTStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var3 = null;
         var3 = (CTStyle)this.get_store().find_element_user(STYLE$6, 0);
         if(var3 == null) {
            var3 = (CTStyle)this.get_store().add_element_user(STYLE$6);
         }

         var3.set(var1);
      }
   }

   public CTStyle addNewStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var2 = null;
         var2 = (CTStyle)this.get_store().add_element_user(STYLE$6);
         return var2;
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLE$6, 0);
      }
   }

   public CTColorMapping getClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().find_element_user(CLRMAPOVR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLRMAPOVR$8) != 0;
      }
   }

   public void setClrMapOvr(CTColorMapping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var3 = null;
         var3 = (CTColorMapping)this.get_store().find_element_user(CLRMAPOVR$8, 0);
         if(var3 == null) {
            var3 = (CTColorMapping)this.get_store().add_element_user(CLRMAPOVR$8);
         }

         var3.set(var1);
      }
   }

   public CTColorMapping addNewClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().add_element_user(CLRMAPOVR$8);
         return var2;
      }
   }

   public void unsetClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLRMAPOVR$8, 0);
      }
   }

   public CTPivotSource getPivotSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSource var2 = null;
         var2 = (CTPivotSource)this.get_store().find_element_user(PIVOTSOURCE$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTSOURCE$10) != 0;
      }
   }

   public void setPivotSource(CTPivotSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSource var3 = null;
         var3 = (CTPivotSource)this.get_store().find_element_user(PIVOTSOURCE$10, 0);
         if(var3 == null) {
            var3 = (CTPivotSource)this.get_store().add_element_user(PIVOTSOURCE$10);
         }

         var3.set(var1);
      }
   }

   public CTPivotSource addNewPivotSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSource var2 = null;
         var2 = (CTPivotSource)this.get_store().add_element_user(PIVOTSOURCE$10);
         return var2;
      }
   }

   public void unsetPivotSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTSOURCE$10, 0);
      }
   }

   public CTProtection getProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtection var2 = null;
         var2 = (CTProtection)this.get_store().find_element_user(PROTECTION$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTION$12) != 0;
      }
   }

   public void setProtection(CTProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtection var3 = null;
         var3 = (CTProtection)this.get_store().find_element_user(PROTECTION$12, 0);
         if(var3 == null) {
            var3 = (CTProtection)this.get_store().add_element_user(PROTECTION$12);
         }

         var3.set(var1);
      }
   }

   public CTProtection addNewProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtection var2 = null;
         var2 = (CTProtection)this.get_store().add_element_user(PROTECTION$12);
         return var2;
      }
   }

   public void unsetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTION$12, 0);
      }
   }

   public CTChart getChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChart var2 = null;
         var2 = (CTChart)this.get_store().find_element_user(CHART$14, 0);
         return var2 == null?null:var2;
      }
   }

   public void setChart(CTChart var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChart var3 = null;
         var3 = (CTChart)this.get_store().find_element_user(CHART$14, 0);
         if(var3 == null) {
            var3 = (CTChart)this.get_store().add_element_user(CHART$14);
         }

         var3.set(var1);
      }
   }

   public CTChart addNewChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChart var2 = null;
         var2 = (CTChart)this.get_store().add_element_user(CHART$14);
         return var2;
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$16) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$16, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$16);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$16);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$16, 0);
      }
   }

   public CTTextBody getTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXPR$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXPR$18) != 0;
      }
   }

   public void setTxPr(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXPR$18, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXPR$18);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXPR$18);
         return var2;
      }
   }

   public void unsetTxPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXPR$18, 0);
      }
   }

   public CTExternalData getExternalData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalData var2 = null;
         var2 = (CTExternalData)this.get_store().find_element_user(EXTERNALDATA$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExternalData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTERNALDATA$20) != 0;
      }
   }

   public void setExternalData(CTExternalData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalData var3 = null;
         var3 = (CTExternalData)this.get_store().find_element_user(EXTERNALDATA$20, 0);
         if(var3 == null) {
            var3 = (CTExternalData)this.get_store().add_element_user(EXTERNALDATA$20);
         }

         var3.set(var1);
      }
   }

   public CTExternalData addNewExternalData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalData var2 = null;
         var2 = (CTExternalData)this.get_store().add_element_user(EXTERNALDATA$20);
         return var2;
      }
   }

   public void unsetExternalData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTERNALDATA$20, 0);
      }
   }

   public CTPrintSettings getPrintSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintSettings var2 = null;
         var2 = (CTPrintSettings)this.get_store().find_element_user(PRINTSETTINGS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTSETTINGS$22) != 0;
      }
   }

   public void setPrintSettings(CTPrintSettings var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintSettings var3 = null;
         var3 = (CTPrintSettings)this.get_store().find_element_user(PRINTSETTINGS$22, 0);
         if(var3 == null) {
            var3 = (CTPrintSettings)this.get_store().add_element_user(PRINTSETTINGS$22);
         }

         var3.set(var1);
      }
   }

   public CTPrintSettings addNewPrintSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintSettings var2 = null;
         var2 = (CTPrintSettings)this.get_store().add_element_user(PRINTSETTINGS$22);
         return var2;
      }
   }

   public void unsetPrintSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTSETTINGS$22, 0);
      }
   }

   public CTRelId getUserShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var2 = null;
         var2 = (CTRelId)this.get_store().find_element_user(USERSHAPES$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUserShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(USERSHAPES$24) != 0;
      }
   }

   public void setUserShapes(CTRelId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var3 = null;
         var3 = (CTRelId)this.get_store().find_element_user(USERSHAPES$24, 0);
         if(var3 == null) {
            var3 = (CTRelId)this.get_store().add_element_user(USERSHAPES$24);
         }

         var3.set(var1);
      }
   }

   public CTRelId addNewUserShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var2 = null;
         var2 = (CTRelId)this.get_store().add_element_user(USERSHAPES$24);
         return var2;
      }
   }

   public void unsetUserShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(USERSHAPES$24, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$26) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$26);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$26);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$26, 0);
      }
   }

}
