package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import com.microsoft.schemas.office.visio.x2012.main.ShapesType;
import com.microsoft.schemas.office.visio.x2012.main.impl.ShapesTypeImpl.1ShapeList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class ShapesTypeImpl extends XmlComplexContentImpl implements ShapesType {

   private static final QName SHAPE$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shape");


   public ShapesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getShapeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShapeList(this);
      }
   }

   public ShapeSheetType[] getShapeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHAPE$0, var2);
         ShapeSheetType[] var3 = new ShapeSheetType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public ShapeSheetType getShapeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapeSheetType var3 = null;
         var3 = (ShapeSheetType)this.get_store().find_element_user(SHAPE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShapeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPE$0);
      }
   }

   public void setShapeArray(ShapeSheetType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHAPE$0);
      }
   }

   public void setShapeArray(int var1, ShapeSheetType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapeSheetType var4 = null;
         var4 = (ShapeSheetType)this.get_store().find_element_user(SHAPE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public ShapeSheetType insertNewShape(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapeSheetType var3 = null;
         var3 = (ShapeSheetType)this.get_store().insert_element_user(SHAPE$0, var1);
         return var3;
      }
   }

   public ShapeSheetType addNewShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapeSheetType var2 = null;
         var2 = (ShapeSheetType)this.get_store().add_element_user(SHAPE$0);
         return var2;
      }
   }

   public void removeShape(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPE$0, var1);
      }
   }

}
