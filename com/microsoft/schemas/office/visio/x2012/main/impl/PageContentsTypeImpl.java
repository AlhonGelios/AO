package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.ConnectsType;
import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
import com.microsoft.schemas.office.visio.x2012.main.ShapesType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class PageContentsTypeImpl extends XmlComplexContentImpl implements PageContentsType {

   private static final QName SHAPES$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shapes");
   private static final QName CONNECTS$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Connects");


   public PageContentsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public ShapesType getShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var2 = null;
         var2 = (ShapesType)this.get_store().find_element_user(SHAPES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPES$0) != 0;
      }
   }

   public void setShapes(ShapesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var3 = null;
         var3 = (ShapesType)this.get_store().find_element_user(SHAPES$0, 0);
         if(var3 == null) {
            var3 = (ShapesType)this.get_store().add_element_user(SHAPES$0);
         }

         var3.set(var1);
      }
   }

   public ShapesType addNewShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var2 = null;
         var2 = (ShapesType)this.get_store().add_element_user(SHAPES$0);
         return var2;
      }
   }

   public void unsetShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPES$0, 0);
      }
   }

   public ConnectsType getConnects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ConnectsType var2 = null;
         var2 = (ConnectsType)this.get_store().find_element_user(CONNECTS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetConnects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONNECTS$2) != 0;
      }
   }

   public void setConnects(ConnectsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ConnectsType var3 = null;
         var3 = (ConnectsType)this.get_store().find_element_user(CONNECTS$2, 0);
         if(var3 == null) {
            var3 = (ConnectsType)this.get_store().add_element_user(CONNECTS$2);
         }

         var3.set(var1);
      }
   }

   public ConnectsType addNewConnects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ConnectsType var2 = null;
         var2 = (ConnectsType)this.get_store().add_element_user(CONNECTS$2);
         return var2;
      }
   }

   public void unsetConnects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONNECTS$2, 0);
      }
   }

}
