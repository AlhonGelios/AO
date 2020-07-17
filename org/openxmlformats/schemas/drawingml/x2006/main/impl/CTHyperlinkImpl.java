package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;

public class CTHyperlinkImpl extends XmlComplexContentImpl implements CTHyperlink {

   private static final QName SND$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "snd");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName ID$4 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
   private static final QName INVALIDURL$6 = new QName("", "invalidUrl");
   private static final QName ACTION$8 = new QName("", "action");
   private static final QName TGTFRAME$10 = new QName("", "tgtFrame");
   private static final QName TOOLTIP$12 = new QName("", "tooltip");
   private static final QName HISTORY$14 = new QName("", "history");
   private static final QName HIGHLIGHTCLICK$16 = new QName("", "highlightClick");
   private static final QName ENDSND$18 = new QName("", "endSnd");


   public CTHyperlinkImpl(SchemaType var1) {
      super(var1);
   }

   public CTEmbeddedWAVAudioFile getSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var2 = null;
         var2 = (CTEmbeddedWAVAudioFile)this.get_store().find_element_user(SND$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SND$0) != 0;
      }
   }

   public void setSnd(CTEmbeddedWAVAudioFile var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var3 = null;
         var3 = (CTEmbeddedWAVAudioFile)this.get_store().find_element_user(SND$0, 0);
         if(var3 == null) {
            var3 = (CTEmbeddedWAVAudioFile)this.get_store().add_element_user(SND$0);
         }

         var3.set(var1);
      }
   }

   public CTEmbeddedWAVAudioFile addNewSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var2 = null;
         var2 = (CTEmbeddedWAVAudioFile)this.get_store().add_element_user(SND$0);
         return var2;
      }
   }

   public void unsetSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SND$0, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$4) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$4);
      }
   }

   public String getInvalidUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INVALIDURL$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INVALIDURL$6);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetInvalidUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(INVALIDURL$6);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(INVALIDURL$6);
         }

         return var2;
      }
   }

   public boolean isSetInvalidUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INVALIDURL$6) != null;
      }
   }

   public void setInvalidUrl(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INVALIDURL$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INVALIDURL$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetInvalidUrl(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(INVALIDURL$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(INVALIDURL$6);
         }

         var3.set(var1);
      }
   }

   public void unsetInvalidUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INVALIDURL$6);
      }
   }

   public String getAction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACTION$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ACTION$8);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ACTION$8);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(ACTION$8);
         }

         return var2;
      }
   }

   public boolean isSetAction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACTION$8) != null;
      }
   }

   public void setAction(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACTION$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACTION$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAction(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ACTION$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ACTION$8);
         }

         var3.set(var1);
      }
   }

   public void unsetAction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACTION$8);
      }
   }

   public String getTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TGTFRAME$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TGTFRAME$10);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TGTFRAME$10);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(TGTFRAME$10);
         }

         return var2;
      }
   }

   public boolean isSetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TGTFRAME$10) != null;
      }
   }

   public void setTgtFrame(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TGTFRAME$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TGTFRAME$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTgtFrame(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TGTFRAME$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TGTFRAME$10);
         }

         var3.set(var1);
      }
   }

   public void unsetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TGTFRAME$10);
      }
   }

   public String getTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TOOLTIP$12);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TOOLTIP$12);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(TOOLTIP$12);
         }

         return var2;
      }
   }

   public boolean isSetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOOLTIP$12) != null;
      }
   }

   public void setTooltip(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOOLTIP$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTooltip(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TOOLTIP$12);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TOOLTIP$12);
         }

         var3.set(var1);
      }
   }

   public void unsetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOOLTIP$12);
      }
   }

   public boolean getHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HISTORY$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HISTORY$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HISTORY$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HISTORY$14);
         }

         return var2;
      }
   }

   public boolean isSetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HISTORY$14) != null;
      }
   }

   public void setHistory(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HISTORY$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HISTORY$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHistory(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HISTORY$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HISTORY$14);
         }

         var3.set(var1);
      }
   }

   public void unsetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HISTORY$14);
      }
   }

   public boolean getHighlightClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIGHLIGHTCLICK$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIGHLIGHTCLICK$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHighlightClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIGHLIGHTCLICK$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIGHLIGHTCLICK$16);
         }

         return var2;
      }
   }

   public boolean isSetHighlightClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIGHLIGHTCLICK$16) != null;
      }
   }

   public void setHighlightClick(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIGHLIGHTCLICK$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIGHLIGHTCLICK$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHighlightClick(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIGHLIGHTCLICK$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIGHLIGHTCLICK$16);
         }

         var3.set(var1);
      }
   }

   public void unsetHighlightClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIGHLIGHTCLICK$16);
      }
   }

   public boolean getEndSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENDSND$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENDSND$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEndSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENDSND$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENDSND$18);
         }

         return var2;
      }
   }

   public boolean isSetEndSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENDSND$18) != null;
      }
   }

   public void setEndSnd(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENDSND$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENDSND$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEndSnd(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENDSND$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENDSND$18);
         }

         var3.set(var1);
      }
   }

   public void unsetEndSnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENDSND$18);
      }
   }

}
