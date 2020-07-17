package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument;

public class MapInfoDocumentImpl extends XmlComplexContentImpl implements MapInfoDocument {

   private static final QName MAPINFO$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "MapInfo");


   public MapInfoDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTMapInfo getMapInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMapInfo var2 = null;
         var2 = (CTMapInfo)this.get_store().find_element_user(MAPINFO$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setMapInfo(CTMapInfo var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMapInfo var3 = null;
         var3 = (CTMapInfo)this.get_store().find_element_user(MAPINFO$0, 0);
         if(var3 == null) {
            var3 = (CTMapInfo)this.get_store().add_element_user(MAPINFO$0);
         }

         var3.set(var1);
      }
   }

   public CTMapInfo addNewMapInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMapInfo var2 = null;
         var2 = (CTMapInfo)this.get_store().add_element_user(MAPINFO$0);
         return var2;
      }
   }

}
