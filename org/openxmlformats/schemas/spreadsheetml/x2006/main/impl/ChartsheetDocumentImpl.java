package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument;

public class ChartsheetDocumentImpl extends XmlComplexContentImpl implements ChartsheetDocument {

   private static final QName CHARTSHEET$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartsheet");


   public ChartsheetDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTChartsheet getChartsheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheet var2 = null;
         var2 = (CTChartsheet)this.get_store().find_element_user(CHARTSHEET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setChartsheet(CTChartsheet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheet var3 = null;
         var3 = (CTChartsheet)this.get_store().find_element_user(CHARTSHEET$0, 0);
         if(var3 == null) {
            var3 = (CTChartsheet)this.get_store().add_element_user(CHARTSHEET$0);
         }

         var3.set(var1);
      }
   }

   public CTChartsheet addNewChartsheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheet var2 = null;
         var2 = (CTChartsheet)this.get_store().add_element_user(CHARTSHEET$0);
         return var2;
      }
   }

}
