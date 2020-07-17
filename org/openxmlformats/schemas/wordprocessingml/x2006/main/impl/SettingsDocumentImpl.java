package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument;

public class SettingsDocumentImpl extends XmlComplexContentImpl implements SettingsDocument {

   private static final QName SETTINGS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "settings");


   public SettingsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSettings getSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSettings var2 = null;
         var2 = (CTSettings)this.get_store().find_element_user(SETTINGS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSettings(CTSettings var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSettings var3 = null;
         var3 = (CTSettings)this.get_store().find_element_user(SETTINGS$0, 0);
         if(var3 == null) {
            var3 = (CTSettings)this.get_store().add_element_user(SETTINGS$0);
         }

         var3.set(var1);
      }
   }

   public CTSettings addNewSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSettings var2 = null;
         var2 = (CTSettings)this.get_store().add_element_user(SETTINGS$0);
         return var2;
      }
   }

}
