package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DListImpl.1PathList;

public class CTPath2DListImpl extends XmlComplexContentImpl implements CTPath2DList {

   private static final QName PATH$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "path");


   public CTPath2DListImpl(SchemaType var1) {
      super(var1);
   }

   public List getPathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PathList(this);
      }
   }

   public CTPath2D[] getPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PATH$0, var2);
         CTPath2D[] var3 = new CTPath2D[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2D getPathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2D var3 = null;
         var3 = (CTPath2D)this.get_store().find_element_user(PATH$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATH$0);
      }
   }

   public void setPathArray(CTPath2D[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PATH$0);
      }
   }

   public void setPathArray(int var1, CTPath2D var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2D var4 = null;
         var4 = (CTPath2D)this.get_store().find_element_user(PATH$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2D insertNewPath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2D var3 = null;
         var3 = (CTPath2D)this.get_store().insert_element_user(PATH$0, var1);
         return var3;
      }
   }

   public CTPath2D addNewPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2D var2 = null;
         var2 = (CTPath2D)this.get_store().add_element_user(PATH$0);
         return var2;
      }
   }

   public void removePath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATH$0, var1);
      }
   }

}
