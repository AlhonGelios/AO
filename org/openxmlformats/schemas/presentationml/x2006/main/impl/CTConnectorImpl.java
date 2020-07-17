package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnectorNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;

public class CTConnectorImpl extends XmlComplexContentImpl implements CTConnector {

   private static final QName NVCXNSPPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvCxnSpPr");
   private static final QName SPPR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spPr");
   private static final QName STYLE$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "style");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


   public CTConnectorImpl(SchemaType var1) {
      super(var1);
   }

   public CTConnectorNonVisual getNvCxnSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorNonVisual var2 = null;
         var2 = (CTConnectorNonVisual)this.get_store().find_element_user(NVCXNSPPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvCxnSpPr(CTConnectorNonVisual var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorNonVisual var3 = null;
         var3 = (CTConnectorNonVisual)this.get_store().find_element_user(NVCXNSPPR$0, 0);
         if(var3 == null) {
            var3 = (CTConnectorNonVisual)this.get_store().add_element_user(NVCXNSPPR$0);
         }

         var3.set(var1);
      }
   }

   public CTConnectorNonVisual addNewNvCxnSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorNonVisual var2 = null;
         var2 = (CTConnectorNonVisual)this.get_store().add_element_user(NVCXNSPPR$0);
         return var2;
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$2, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$2);
         return var2;
      }
   }

   public CTShapeStyle getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().find_element_user(STYLE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLE$4) != 0;
      }
   }

   public void setStyle(CTShapeStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var3 = null;
         var3 = (CTShapeStyle)this.get_store().find_element_user(STYLE$4, 0);
         if(var3 == null) {
            var3 = (CTShapeStyle)this.get_store().add_element_user(STYLE$4);
         }

         var3.set(var1);
      }
   }

   public CTShapeStyle addNewStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().add_element_user(STYLE$4);
         return var2;
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLE$4, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
