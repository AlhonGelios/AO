package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineCap;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth;
import org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment;

public class CTLinePropertiesImpl extends XmlComplexContentImpl implements CTLineProperties {

   private static final QName NOFILL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName PATTFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName PRSTDASH$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstDash");
   private static final QName CUSTDASH$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custDash");
   private static final QName ROUND$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "round");
   private static final QName BEVEL$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bevel");
   private static final QName MITER$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "miter");
   private static final QName HEADEND$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "headEnd");
   private static final QName TAILEND$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tailEnd");
   private static final QName EXTLST$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName W$24 = new QName("", "w");
   private static final QName CAP$26 = new QName("", "cap");
   private static final QName CMPD$28 = new QName("", "cmpd");
   private static final QName ALGN$30 = new QName("", "algn");


   public CTLinePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$0) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$0, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$0);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$0);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$0, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$2) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$2, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$2);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$2);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$2, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$4) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$4, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$4);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$4);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$4, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$6) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$6, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$6);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$6);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$6, 0);
      }
   }

   public CTPresetLineDashProperties getPrstDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetLineDashProperties var2 = null;
         var2 = (CTPresetLineDashProperties)this.get_store().find_element_user(PRSTDASH$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTDASH$8) != 0;
      }
   }

   public void setPrstDash(CTPresetLineDashProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetLineDashProperties var3 = null;
         var3 = (CTPresetLineDashProperties)this.get_store().find_element_user(PRSTDASH$8, 0);
         if(var3 == null) {
            var3 = (CTPresetLineDashProperties)this.get_store().add_element_user(PRSTDASH$8);
         }

         var3.set(var1);
      }
   }

   public CTPresetLineDashProperties addNewPrstDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetLineDashProperties var2 = null;
         var2 = (CTPresetLineDashProperties)this.get_store().add_element_user(PRSTDASH$8);
         return var2;
      }
   }

   public void unsetPrstDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTDASH$8, 0);
      }
   }

   public CTDashStopList getCustDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDashStopList var2 = null;
         var2 = (CTDashStopList)this.get_store().find_element_user(CUSTDASH$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTDASH$10) != 0;
      }
   }

   public void setCustDash(CTDashStopList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDashStopList var3 = null;
         var3 = (CTDashStopList)this.get_store().find_element_user(CUSTDASH$10, 0);
         if(var3 == null) {
            var3 = (CTDashStopList)this.get_store().add_element_user(CUSTDASH$10);
         }

         var3.set(var1);
      }
   }

   public CTDashStopList addNewCustDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDashStopList var2 = null;
         var2 = (CTDashStopList)this.get_store().add_element_user(CUSTDASH$10);
         return var2;
      }
   }

   public void unsetCustDash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTDASH$10, 0);
      }
   }

   public CTLineJoinRound getRound() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinRound var2 = null;
         var2 = (CTLineJoinRound)this.get_store().find_element_user(ROUND$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRound() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROUND$12) != 0;
      }
   }

   public void setRound(CTLineJoinRound var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinRound var3 = null;
         var3 = (CTLineJoinRound)this.get_store().find_element_user(ROUND$12, 0);
         if(var3 == null) {
            var3 = (CTLineJoinRound)this.get_store().add_element_user(ROUND$12);
         }

         var3.set(var1);
      }
   }

   public CTLineJoinRound addNewRound() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinRound var2 = null;
         var2 = (CTLineJoinRound)this.get_store().add_element_user(ROUND$12);
         return var2;
      }
   }

   public void unsetRound() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROUND$12, 0);
      }
   }

   public CTLineJoinBevel getBevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinBevel var2 = null;
         var2 = (CTLineJoinBevel)this.get_store().find_element_user(BEVEL$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BEVEL$14) != 0;
      }
   }

   public void setBevel(CTLineJoinBevel var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinBevel var3 = null;
         var3 = (CTLineJoinBevel)this.get_store().find_element_user(BEVEL$14, 0);
         if(var3 == null) {
            var3 = (CTLineJoinBevel)this.get_store().add_element_user(BEVEL$14);
         }

         var3.set(var1);
      }
   }

   public CTLineJoinBevel addNewBevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinBevel var2 = null;
         var2 = (CTLineJoinBevel)this.get_store().add_element_user(BEVEL$14);
         return var2;
      }
   }

   public void unsetBevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BEVEL$14, 0);
      }
   }

   public CTLineJoinMiterProperties getMiter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinMiterProperties var2 = null;
         var2 = (CTLineJoinMiterProperties)this.get_store().find_element_user(MITER$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMiter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MITER$16) != 0;
      }
   }

   public void setMiter(CTLineJoinMiterProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinMiterProperties var3 = null;
         var3 = (CTLineJoinMiterProperties)this.get_store().find_element_user(MITER$16, 0);
         if(var3 == null) {
            var3 = (CTLineJoinMiterProperties)this.get_store().add_element_user(MITER$16);
         }

         var3.set(var1);
      }
   }

   public CTLineJoinMiterProperties addNewMiter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineJoinMiterProperties var2 = null;
         var2 = (CTLineJoinMiterProperties)this.get_store().add_element_user(MITER$16);
         return var2;
      }
   }

   public void unsetMiter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MITER$16, 0);
      }
   }

   public CTLineEndProperties getHeadEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var2 = null;
         var2 = (CTLineEndProperties)this.get_store().find_element_user(HEADEND$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeadEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADEND$18) != 0;
      }
   }

   public void setHeadEnd(CTLineEndProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var3 = null;
         var3 = (CTLineEndProperties)this.get_store().find_element_user(HEADEND$18, 0);
         if(var3 == null) {
            var3 = (CTLineEndProperties)this.get_store().add_element_user(HEADEND$18);
         }

         var3.set(var1);
      }
   }

   public CTLineEndProperties addNewHeadEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var2 = null;
         var2 = (CTLineEndProperties)this.get_store().add_element_user(HEADEND$18);
         return var2;
      }
   }

   public void unsetHeadEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADEND$18, 0);
      }
   }

   public CTLineEndProperties getTailEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var2 = null;
         var2 = (CTLineEndProperties)this.get_store().find_element_user(TAILEND$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTailEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TAILEND$20) != 0;
      }
   }

   public void setTailEnd(CTLineEndProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var3 = null;
         var3 = (CTLineEndProperties)this.get_store().find_element_user(TAILEND$20, 0);
         if(var3 == null) {
            var3 = (CTLineEndProperties)this.get_store().add_element_user(TAILEND$20);
         }

         var3.set(var1);
      }
   }

   public CTLineEndProperties addNewTailEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineEndProperties var2 = null;
         var2 = (CTLineEndProperties)this.get_store().add_element_user(TAILEND$20);
         return var2;
      }
   }

   public void unsetTailEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TAILEND$20, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$22) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$22, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$22);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$22);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$22, 0);
      }
   }

   public int getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$24);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STLineWidth xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineWidth var2 = null;
         var2 = (STLineWidth)this.get_store().find_attribute_user(W$24);
         return var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(W$24) != null;
      }
   }

   public void setW(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(W$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(W$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetW(STLineWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineWidth var3 = null;
         var3 = (STLineWidth)this.get_store().find_attribute_user(W$24);
         if(var3 == null) {
            var3 = (STLineWidth)this.get_store().add_attribute_user(W$24);
         }

         var3.set(var1);
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(W$24);
      }
   }

   public STLineCap.Enum getCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CAP$26);
         return var2 == null?null:(STLineCap.Enum)var2.getEnumValue();
      }
   }

   public STLineCap xgetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineCap var2 = null;
         var2 = (STLineCap)this.get_store().find_attribute_user(CAP$26);
         return var2;
      }
   }

   public boolean isSetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CAP$26) != null;
      }
   }

   public void setCap(STLineCap.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CAP$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CAP$26);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCap(STLineCap var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineCap var3 = null;
         var3 = (STLineCap)this.get_store().find_attribute_user(CAP$26);
         if(var3 == null) {
            var3 = (STLineCap)this.get_store().add_attribute_user(CAP$26);
         }

         var3.set(var1);
      }
   }

   public void unsetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CAP$26);
      }
   }

   public STCompoundLine.Enum getCmpd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CMPD$28);
         return var2 == null?null:(STCompoundLine.Enum)var2.getEnumValue();
      }
   }

   public STCompoundLine xgetCmpd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCompoundLine var2 = null;
         var2 = (STCompoundLine)this.get_store().find_attribute_user(CMPD$28);
         return var2;
      }
   }

   public boolean isSetCmpd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CMPD$28) != null;
      }
   }

   public void setCmpd(STCompoundLine.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CMPD$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CMPD$28);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCmpd(STCompoundLine var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCompoundLine var3 = null;
         var3 = (STCompoundLine)this.get_store().find_attribute_user(CMPD$28);
         if(var3 == null) {
            var3 = (STCompoundLine)this.get_store().add_attribute_user(CMPD$28);
         }

         var3.set(var1);
      }
   }

   public void unsetCmpd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CMPD$28);
      }
   }

   public STPenAlignment.Enum getAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGN$30);
         return var2 == null?null:(STPenAlignment.Enum)var2.getEnumValue();
      }
   }

   public STPenAlignment xgetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPenAlignment var2 = null;
         var2 = (STPenAlignment)this.get_store().find_attribute_user(ALGN$30);
         return var2;
      }
   }

   public boolean isSetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGN$30) != null;
      }
   }

   public void setAlgn(STPenAlignment.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGN$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGN$30);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlgn(STPenAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPenAlignment var3 = null;
         var3 = (STPenAlignment)this.get_store().find_attribute_user(ALGN$30);
         if(var3 == null) {
            var3 = (STPenAlignment)this.get_store().add_attribute_user(ALGN$30);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGN$30);
      }
   }

}
