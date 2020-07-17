package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle;

public class CTTablePartStyleImpl extends XmlComplexContentImpl implements CTTablePartStyle {

   private static final QName TCTXSTYLE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcTxStyle");
   private static final QName TCSTYLE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcStyle");


   public CTTablePartStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableStyleTextStyle getTcTxStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleTextStyle var2 = null;
         var2 = (CTTableStyleTextStyle)this.get_store().find_element_user(TCTXSTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcTxStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCTXSTYLE$0) != 0;
      }
   }

   public void setTcTxStyle(CTTableStyleTextStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleTextStyle var3 = null;
         var3 = (CTTableStyleTextStyle)this.get_store().find_element_user(TCTXSTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTTableStyleTextStyle)this.get_store().add_element_user(TCTXSTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTTableStyleTextStyle addNewTcTxStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleTextStyle var2 = null;
         var2 = (CTTableStyleTextStyle)this.get_store().add_element_user(TCTXSTYLE$0);
         return var2;
      }
   }

   public void unsetTcTxStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCTXSTYLE$0, 0);
      }
   }

   public CTTableStyleCellStyle getTcStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleCellStyle var2 = null;
         var2 = (CTTableStyleCellStyle)this.get_store().find_element_user(TCSTYLE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCSTYLE$2) != 0;
      }
   }

   public void setTcStyle(CTTableStyleCellStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleCellStyle var3 = null;
         var3 = (CTTableStyleCellStyle)this.get_store().find_element_user(TCSTYLE$2, 0);
         if(var3 == null) {
            var3 = (CTTableStyleCellStyle)this.get_store().add_element_user(TCSTYLE$2);
         }

         var3.set(var1);
      }
   }

   public CTTableStyleCellStyle addNewTcStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleCellStyle var2 = null;
         var2 = (CTTableStyleCellStyle)this.get_store().add_element_user(TCSTYLE$2);
         return var2;
      }
   }

   public void unsetTcStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCSTYLE$2, 0);
      }
   }

}
