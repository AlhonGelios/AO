package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace;
import org.openxmlformats.schemas.drawingml.x2006.chart.ChartSpaceDocument;

public class ChartSpaceDocumentImpl extends XmlComplexContentImpl implements ChartSpaceDocument {

   private static final QName CHARTSPACE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chartSpace");


   public ChartSpaceDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTChartSpace getChartSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartSpace var2 = null;
         var2 = (CTChartSpace)this.get_store().find_element_user(CHARTSPACE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setChartSpace(CTChartSpace var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartSpace var3 = null;
         var3 = (CTChartSpace)this.get_store().find_element_user(CHARTSPACE$0, 0);
         if(var3 == null) {
            var3 = (CTChartSpace)this.get_store().add_element_user(CHARTSPACE$0);
         }

         var3.set(var1);
      }
   }

   public CTChartSpace addNewChartSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartSpace var2 = null;
         var2 = (CTChartSpace)this.get_store().add_element_user(CHARTSPACE$0);
         return var2;
      }
   }

}
