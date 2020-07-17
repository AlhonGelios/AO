package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle;

public class CTTableStyleCellStyleImpl extends XmlComplexContentImpl implements CTTableStyleCellStyle {

   private static final QName TCBDR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcBdr");
   private static final QName FILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fill");
   private static final QName FILLREF$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRef");
   private static final QName CELL3D$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cell3D");


   public CTTableStyleCellStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableCellBorderStyle getTcBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellBorderStyle var2 = null;
         var2 = (CTTableCellBorderStyle)this.get_store().find_element_user(TCBDR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCBDR$0) != 0;
      }
   }

   public void setTcBdr(CTTableCellBorderStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellBorderStyle var3 = null;
         var3 = (CTTableCellBorderStyle)this.get_store().find_element_user(TCBDR$0, 0);
         if(var3 == null) {
            var3 = (CTTableCellBorderStyle)this.get_store().add_element_user(TCBDR$0);
         }

         var3.set(var1);
      }
   }

   public CTTableCellBorderStyle addNewTcBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellBorderStyle var2 = null;
         var2 = (CTTableCellBorderStyle)this.get_store().add_element_user(TCBDR$0);
         return var2;
      }
   }

   public void unsetTcBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCBDR$0, 0);
      }
   }

   public CTFillProperties getFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillProperties var2 = null;
         var2 = (CTFillProperties)this.get_store().find_element_user(FILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILL$2) != 0;
      }
   }

   public void setFill(CTFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillProperties var3 = null;
         var3 = (CTFillProperties)this.get_store().find_element_user(FILL$2, 0);
         if(var3 == null) {
            var3 = (CTFillProperties)this.get_store().add_element_user(FILL$2);
         }

         var3.set(var1);
      }
   }

   public CTFillProperties addNewFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillProperties var2 = null;
         var2 = (CTFillProperties)this.get_store().add_element_user(FILL$2);
         return var2;
      }
   }

   public void unsetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILL$2, 0);
      }
   }

   public CTStyleMatrixReference getFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().find_element_user(FILLREF$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLREF$4) != 0;
      }
   }

   public void setFillRef(CTStyleMatrixReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var3 = null;
         var3 = (CTStyleMatrixReference)this.get_store().find_element_user(FILLREF$4, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrixReference)this.get_store().add_element_user(FILLREF$4);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrixReference addNewFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().add_element_user(FILLREF$4);
         return var2;
      }
   }

   public void unsetFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLREF$4, 0);
      }
   }

   public CTCell3D getCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var2 = null;
         var2 = (CTCell3D)this.get_store().find_element_user(CELL3D$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELL3D$6) != 0;
      }
   }

   public void setCell3D(CTCell3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var3 = null;
         var3 = (CTCell3D)this.get_store().find_element_user(CELL3D$6, 0);
         if(var3 == null) {
            var3 = (CTCell3D)this.get_store().add_element_user(CELL3D$6);
         }

         var3.set(var1);
      }
   }

   public CTCell3D addNewCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var2 = null;
         var2 = (CTCell3D)this.get_store().add_element_user(CELL3D$6);
         return var2;
      }
   }

   public void unsetCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELL3D$6, 0);
      }
   }

}
