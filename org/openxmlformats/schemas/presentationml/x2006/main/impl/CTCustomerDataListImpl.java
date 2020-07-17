package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData;
import org.openxmlformats.schemas.presentationml.x2006.main.impl.CTCustomerDataListImpl.1CustDataList;

public class CTCustomerDataListImpl extends XmlComplexContentImpl implements CTCustomerDataList {

   private static final QName CUSTDATA$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custData");
   private static final QName TAGS$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tags");


   public CTCustomerDataListImpl(SchemaType var1) {
      super(var1);
   }

   public List getCustDataList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustDataList(this);
      }
   }

   public CTCustomerData[] getCustDataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTDATA$0, var2);
         CTCustomerData[] var3 = new CTCustomerData[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCustomerData getCustDataArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerData var3 = null;
         var3 = (CTCustomerData)this.get_store().find_element_user(CUSTDATA$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustDataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTDATA$0);
      }
   }

   public void setCustDataArray(CTCustomerData[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTDATA$0);
      }
   }

   public void setCustDataArray(int var1, CTCustomerData var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerData var4 = null;
         var4 = (CTCustomerData)this.get_store().find_element_user(CUSTDATA$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCustomerData insertNewCustData(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerData var3 = null;
         var3 = (CTCustomerData)this.get_store().insert_element_user(CUSTDATA$0, var1);
         return var3;
      }
   }

   public CTCustomerData addNewCustData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerData var2 = null;
         var2 = (CTCustomerData)this.get_store().add_element_user(CUSTDATA$0);
         return var2;
      }
   }

   public void removeCustData(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTDATA$0, var1);
      }
   }

   public CTTagsData getTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTagsData var2 = null;
         var2 = (CTTagsData)this.get_store().find_element_user(TAGS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TAGS$2) != 0;
      }
   }

   public void setTags(CTTagsData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTagsData var3 = null;
         var3 = (CTTagsData)this.get_store().find_element_user(TAGS$2, 0);
         if(var3 == null) {
            var3 = (CTTagsData)this.get_store().add_element_user(TAGS$2);
         }

         var3.set(var1);
      }
   }

   public CTTagsData addNewTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTagsData var2 = null;
         var2 = (CTTagsData)this.get_store().add_element_user(TAGS$2);
         return var2;
      }
   }

   public void unsetTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TAGS$2, 0);
      }
   }

}
