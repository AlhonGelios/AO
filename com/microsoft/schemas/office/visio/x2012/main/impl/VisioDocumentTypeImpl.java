package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.ColorsType;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType;
import com.microsoft.schemas.office.visio.x2012.main.EventListType;
import com.microsoft.schemas.office.visio.x2012.main.FaceNamesType;
import com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType;
import com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType;
import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class VisioDocumentTypeImpl extends XmlComplexContentImpl implements VisioDocumentType {

   private static final QName DOCUMENTSETTINGS$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "DocumentSettings");
   private static final QName COLORS$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Colors");
   private static final QName FACENAMES$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "FaceNames");
   private static final QName STYLESHEETS$6 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "StyleSheets");
   private static final QName DOCUMENTSHEET$8 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "DocumentSheet");
   private static final QName EVENTLIST$10 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "EventList");
   private static final QName HEADERFOOTER$12 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderFooter");
   private static final QName PUBLISHSETTINGS$14 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "PublishSettings");


   public VisioDocumentTypeImpl(SchemaType var1) {
      super(var1);
   }

   public DocumentSettingsType getDocumentSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSettingsType var2 = null;
         var2 = (DocumentSettingsType)this.get_store().find_element_user(DOCUMENTSETTINGS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocumentSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCUMENTSETTINGS$0) != 0;
      }
   }

   public void setDocumentSettings(DocumentSettingsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSettingsType var3 = null;
         var3 = (DocumentSettingsType)this.get_store().find_element_user(DOCUMENTSETTINGS$0, 0);
         if(var3 == null) {
            var3 = (DocumentSettingsType)this.get_store().add_element_user(DOCUMENTSETTINGS$0);
         }

         var3.set(var1);
      }
   }

   public DocumentSettingsType addNewDocumentSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSettingsType var2 = null;
         var2 = (DocumentSettingsType)this.get_store().add_element_user(DOCUMENTSETTINGS$0);
         return var2;
      }
   }

   public void unsetDocumentSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCUMENTSETTINGS$0, 0);
      }
   }

   public ColorsType getColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ColorsType var2 = null;
         var2 = (ColorsType)this.get_store().find_element_user(COLORS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLORS$2) != 0;
      }
   }

   public void setColors(ColorsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ColorsType var3 = null;
         var3 = (ColorsType)this.get_store().find_element_user(COLORS$2, 0);
         if(var3 == null) {
            var3 = (ColorsType)this.get_store().add_element_user(COLORS$2);
         }

         var3.set(var1);
      }
   }

   public ColorsType addNewColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ColorsType var2 = null;
         var2 = (ColorsType)this.get_store().add_element_user(COLORS$2);
         return var2;
      }
   }

   public void unsetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLORS$2, 0);
      }
   }

   public FaceNamesType getFaceNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FaceNamesType var2 = null;
         var2 = (FaceNamesType)this.get_store().find_element_user(FACENAMES$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFaceNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FACENAMES$4) != 0;
      }
   }

   public void setFaceNames(FaceNamesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FaceNamesType var3 = null;
         var3 = (FaceNamesType)this.get_store().find_element_user(FACENAMES$4, 0);
         if(var3 == null) {
            var3 = (FaceNamesType)this.get_store().add_element_user(FACENAMES$4);
         }

         var3.set(var1);
      }
   }

   public FaceNamesType addNewFaceNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FaceNamesType var2 = null;
         var2 = (FaceNamesType)this.get_store().add_element_user(FACENAMES$4);
         return var2;
      }
   }

   public void unsetFaceNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FACENAMES$4, 0);
      }
   }

   public StyleSheetsType getStyleSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetsType var2 = null;
         var2 = (StyleSheetsType)this.get_store().find_element_user(STYLESHEETS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyleSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLESHEETS$6) != 0;
      }
   }

   public void setStyleSheets(StyleSheetsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetsType var3 = null;
         var3 = (StyleSheetsType)this.get_store().find_element_user(STYLESHEETS$6, 0);
         if(var3 == null) {
            var3 = (StyleSheetsType)this.get_store().add_element_user(STYLESHEETS$6);
         }

         var3.set(var1);
      }
   }

   public StyleSheetsType addNewStyleSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetsType var2 = null;
         var2 = (StyleSheetsType)this.get_store().add_element_user(STYLESHEETS$6);
         return var2;
      }
   }

   public void unsetStyleSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLESHEETS$6, 0);
      }
   }

   public DocumentSheetType getDocumentSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSheetType var2 = null;
         var2 = (DocumentSheetType)this.get_store().find_element_user(DOCUMENTSHEET$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocumentSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCUMENTSHEET$8) != 0;
      }
   }

   public void setDocumentSheet(DocumentSheetType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSheetType var3 = null;
         var3 = (DocumentSheetType)this.get_store().find_element_user(DOCUMENTSHEET$8, 0);
         if(var3 == null) {
            var3 = (DocumentSheetType)this.get_store().add_element_user(DOCUMENTSHEET$8);
         }

         var3.set(var1);
      }
   }

   public DocumentSheetType addNewDocumentSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DocumentSheetType var2 = null;
         var2 = (DocumentSheetType)this.get_store().add_element_user(DOCUMENTSHEET$8);
         return var2;
      }
   }

   public void unsetDocumentSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCUMENTSHEET$8, 0);
      }
   }

   public EventListType getEventList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EventListType var2 = null;
         var2 = (EventListType)this.get_store().find_element_user(EVENTLIST$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEventList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EVENTLIST$10) != 0;
      }
   }

   public void setEventList(EventListType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EventListType var3 = null;
         var3 = (EventListType)this.get_store().find_element_user(EVENTLIST$10, 0);
         if(var3 == null) {
            var3 = (EventListType)this.get_store().add_element_user(EVENTLIST$10);
         }

         var3.set(var1);
      }
   }

   public EventListType addNewEventList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EventListType var2 = null;
         var2 = (EventListType)this.get_store().add_element_user(EVENTLIST$10);
         return var2;
      }
   }

   public void unsetEventList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EVENTLIST$10, 0);
      }
   }

   public HeaderFooterType getHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         HeaderFooterType var2 = null;
         var2 = (HeaderFooterType)this.get_store().find_element_user(HEADERFOOTER$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERFOOTER$12) != 0;
      }
   }

   public void setHeaderFooter(HeaderFooterType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         HeaderFooterType var3 = null;
         var3 = (HeaderFooterType)this.get_store().find_element_user(HEADERFOOTER$12, 0);
         if(var3 == null) {
            var3 = (HeaderFooterType)this.get_store().add_element_user(HEADERFOOTER$12);
         }

         var3.set(var1);
      }
   }

   public HeaderFooterType addNewHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         HeaderFooterType var2 = null;
         var2 = (HeaderFooterType)this.get_store().add_element_user(HEADERFOOTER$12);
         return var2;
      }
   }

   public void unsetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERFOOTER$12, 0);
      }
   }

   public PublishSettingsType getPublishSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PublishSettingsType var2 = null;
         var2 = (PublishSettingsType)this.get_store().find_element_user(PUBLISHSETTINGS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPublishSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PUBLISHSETTINGS$14) != 0;
      }
   }

   public void setPublishSettings(PublishSettingsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PublishSettingsType var3 = null;
         var3 = (PublishSettingsType)this.get_store().find_element_user(PUBLISHSETTINGS$14, 0);
         if(var3 == null) {
            var3 = (PublishSettingsType)this.get_store().add_element_user(PUBLISHSETTINGS$14);
         }

         var3.set(var1);
      }
   }

   public PublishSettingsType addNewPublishSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PublishSettingsType var2 = null;
         var2 = (PublishSettingsType)this.get_store().add_element_user(PUBLISHSETTINGS$14);
         return var2;
      }
   }

   public void unsetPublishSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PUBLISHSETTINGS$14, 0);
      }
   }

}
