package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTOfficeArtExtensionListImpl.1ExtList;

public class CTOfficeArtExtensionListImpl extends XmlComplexContentImpl implements CTOfficeArtExtensionList {

   private static final QName EXT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ext");


   public CTOfficeArtExtensionListImpl(SchemaType var1) {
      super(var1);
   }

   public List getExtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ExtList(this);
      }
   }

   public CTOfficeArtExtension[] getExtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EXT$0, var2);
         CTOfficeArtExtension[] var3 = new CTOfficeArtExtension[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOfficeArtExtension getExtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtension var3 = null;
         var3 = (CTOfficeArtExtension)this.get_store().find_element_user(EXT$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfExtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXT$0);
      }
   }

   public void setExtArray(CTOfficeArtExtension[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EXT$0);
      }
   }

   public void setExtArray(int var1, CTOfficeArtExtension var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtension var4 = null;
         var4 = (CTOfficeArtExtension)this.get_store().find_element_user(EXT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOfficeArtExtension insertNewExt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtension var3 = null;
         var3 = (CTOfficeArtExtension)this.get_store().insert_element_user(EXT$0, var1);
         return var3;
      }
   }

   public CTOfficeArtExtension addNewExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtension var2 = null;
         var2 = (CTOfficeArtExtension)this.get_store().add_element_user(EXT$0);
         return var2;
      }
   }

   public void removeExt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXT$0, var1);
      }
   }

}
