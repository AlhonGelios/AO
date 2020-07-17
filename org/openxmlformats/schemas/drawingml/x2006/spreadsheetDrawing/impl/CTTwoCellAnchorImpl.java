package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs;

public class CTTwoCellAnchorImpl extends XmlComplexContentImpl implements CTTwoCellAnchor {

   private static final QName FROM$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "from");
   private static final QName TO$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "to");
   private static final QName SP$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "sp");
   private static final QName GRPSP$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSp");
   private static final QName GRAPHICFRAME$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "graphicFrame");
   private static final QName CXNSP$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cxnSp");
   private static final QName PIC$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "pic");
   private static final QName CLIENTDATA$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "clientData");
   private static final QName EDITAS$16 = new QName("", "editAs");


   public CTTwoCellAnchorImpl(SchemaType var1) {
      super(var1);
   }

   public CTMarker getFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().find_element_user(FROM$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFrom(CTMarker var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var3 = null;
         var3 = (CTMarker)this.get_store().find_element_user(FROM$0, 0);
         if(var3 == null) {
            var3 = (CTMarker)this.get_store().add_element_user(FROM$0);
         }

         var3.set(var1);
      }
   }

   public CTMarker addNewFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().add_element_user(FROM$0);
         return var2;
      }
   }

   public CTMarker getTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().find_element_user(TO$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTo(CTMarker var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var3 = null;
         var3 = (CTMarker)this.get_store().find_element_user(TO$2, 0);
         if(var3 == null) {
            var3 = (CTMarker)this.get_store().add_element_user(TO$2);
         }

         var3.set(var1);
      }
   }

   public CTMarker addNewTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarker var2 = null;
         var2 = (CTMarker)this.get_store().add_element_user(TO$2);
         return var2;
      }
   }

   public CTShape getSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var2 = null;
         var2 = (CTShape)this.get_store().find_element_user(SP$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SP$4) != 0;
      }
   }

   public void setSp(CTShape var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var3 = null;
         var3 = (CTShape)this.get_store().find_element_user(SP$4, 0);
         if(var3 == null) {
            var3 = (CTShape)this.get_store().add_element_user(SP$4);
         }

         var3.set(var1);
      }
   }

   public CTShape addNewSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var2 = null;
         var2 = (CTShape)this.get_store().add_element_user(SP$4);
         return var2;
      }
   }

   public void unsetSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SP$4, 0);
      }
   }

   public CTGroupShape getGrpSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var2 = null;
         var2 = (CTGroupShape)this.get_store().find_element_user(GRPSP$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPSP$6) != 0;
      }
   }

   public void setGrpSp(CTGroupShape var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var3 = null;
         var3 = (CTGroupShape)this.get_store().find_element_user(GRPSP$6, 0);
         if(var3 == null) {
            var3 = (CTGroupShape)this.get_store().add_element_user(GRPSP$6);
         }

         var3.set(var1);
      }
   }

   public CTGroupShape addNewGrpSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var2 = null;
         var2 = (CTGroupShape)this.get_store().add_element_user(GRPSP$6);
         return var2;
      }
   }

   public void unsetGrpSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPSP$6, 0);
      }
   }

   public CTGraphicalObjectFrame getGraphicFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var2 = null;
         var2 = (CTGraphicalObjectFrame)this.get_store().find_element_user(GRAPHICFRAME$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGraphicFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRAPHICFRAME$8) != 0;
      }
   }

   public void setGraphicFrame(CTGraphicalObjectFrame var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var3 = null;
         var3 = (CTGraphicalObjectFrame)this.get_store().find_element_user(GRAPHICFRAME$8, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObjectFrame)this.get_store().add_element_user(GRAPHICFRAME$8);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObjectFrame addNewGraphicFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrame var2 = null;
         var2 = (CTGraphicalObjectFrame)this.get_store().add_element_user(GRAPHICFRAME$8);
         return var2;
      }
   }

   public void unsetGraphicFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRAPHICFRAME$8, 0);
      }
   }

   public CTConnector getCxnSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var2 = null;
         var2 = (CTConnector)this.get_store().find_element_user(CXNSP$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCxnSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CXNSP$10) != 0;
      }
   }

   public void setCxnSp(CTConnector var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var3 = null;
         var3 = (CTConnector)this.get_store().find_element_user(CXNSP$10, 0);
         if(var3 == null) {
            var3 = (CTConnector)this.get_store().add_element_user(CXNSP$10);
         }

         var3.set(var1);
      }
   }

   public CTConnector addNewCxnSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnector var2 = null;
         var2 = (CTConnector)this.get_store().add_element_user(CXNSP$10);
         return var2;
      }
   }

   public void unsetCxnSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CXNSP$10, 0);
      }
   }

   public CTPicture getPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().find_element_user(PIC$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIC$12) != 0;
      }
   }

   public void setPic(CTPicture var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().find_element_user(PIC$12, 0);
         if(var3 == null) {
            var3 = (CTPicture)this.get_store().add_element_user(PIC$12);
         }

         var3.set(var1);
      }
   }

   public CTPicture addNewPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().add_element_user(PIC$12);
         return var2;
      }
   }

   public void unsetPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIC$12, 0);
      }
   }

   public CTAnchorClientData getClientData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorClientData var2 = null;
         var2 = (CTAnchorClientData)this.get_store().find_element_user(CLIENTDATA$14, 0);
         return var2 == null?null:var2;
      }
   }

   public void setClientData(CTAnchorClientData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorClientData var3 = null;
         var3 = (CTAnchorClientData)this.get_store().find_element_user(CLIENTDATA$14, 0);
         if(var3 == null) {
            var3 = (CTAnchorClientData)this.get_store().add_element_user(CLIENTDATA$14);
         }

         var3.set(var1);
      }
   }

   public CTAnchorClientData addNewClientData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorClientData var2 = null;
         var2 = (CTAnchorClientData)this.get_store().add_element_user(CLIENTDATA$14);
         return var2;
      }
   }

   public STEditAs.Enum getEditAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EDITAS$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EDITAS$16);
         }

         return var2 == null?null:(STEditAs.Enum)var2.getEnumValue();
      }
   }

   public STEditAs xgetEditAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEditAs var2 = null;
         var2 = (STEditAs)this.get_store().find_attribute_user(EDITAS$16);
         if(var2 == null) {
            var2 = (STEditAs)this.get_default_attribute_value(EDITAS$16);
         }

         return var2;
      }
   }

   public boolean isSetEditAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EDITAS$16) != null;
      }
   }

   public void setEditAs(STEditAs.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EDITAS$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EDITAS$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEditAs(STEditAs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEditAs var3 = null;
         var3 = (STEditAs)this.get_store().find_attribute_user(EDITAS$16);
         if(var3 == null) {
            var3 = (STEditAs)this.get_store().add_attribute_user(EDITAS$16);
         }

         var3.set(var1);
      }
   }

   public void unsetEditAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EDITAS$16);
      }
   }

}
