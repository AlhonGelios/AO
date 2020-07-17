package org.w3.x2000.x09.xmldsig.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.TransformType;
import org.w3.x2000.x09.xmldsig.impl.TransformTypeImpl.1XPathList;
import org.w3.x2000.x09.xmldsig.impl.TransformTypeImpl.2XPathList;

public class TransformTypeImpl extends XmlComplexContentImpl implements TransformType {

   private static final QName XPATH$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
   private static final QName ALGORITHM$2 = new QName("", "Algorithm");


   public TransformTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getXPathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1XPathList(this);
      }
   }

   public String[] getXPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(XPATH$0, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getXPathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(XPATH$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetXPathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2XPathList(this);
      }
   }

   public XmlString[] xgetXPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(XPATH$0, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetXPathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(XPATH$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfXPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XPATH$0);
      }
   }

   public void setXPathArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, XPATH$0);
      }
   }

   public void setXPathArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(XPATH$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetXPathArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, XPATH$0);
      }
   }

   public void xsetXPathArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(XPATH$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertXPath(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(XPATH$0, var1);
         var4.setStringValue(var2);
      }
   }

   public void addXPath(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(XPATH$0);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewXPath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(XPATH$0, var1);
         return var3;
      }
   }

   public XmlString addNewXPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(XPATH$0);
         return var2;
      }
   }

   public void removeXPath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XPATH$0, var1);
      }
   }

   public String getAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGORITHM$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(ALGORITHM$2);
         return var2;
      }
   }

   public void setAlgorithm(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGORITHM$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGORITHM$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlgorithm(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(ALGORITHM$2);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(ALGORITHM$2);
         }

         var3.set(var1);
      }
   }

}
