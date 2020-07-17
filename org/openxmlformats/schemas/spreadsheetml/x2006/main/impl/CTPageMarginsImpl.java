package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins;

public class CTPageMarginsImpl extends XmlComplexContentImpl implements CTPageMargins {

   private static final QName LEFT$0 = new QName("", "left");
   private static final QName RIGHT$2 = new QName("", "right");
   private static final QName TOP$4 = new QName("", "top");
   private static final QName BOTTOM$6 = new QName("", "bottom");
   private static final QName HEADER$8 = new QName("", "header");
   private static final QName FOOTER$10 = new QName("", "footer");


   public CTPageMarginsImpl(SchemaType var1) {
      super(var1);
   }

   public double getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEFT$0);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(LEFT$0);
         return var2;
      }
   }

   public void setLeft(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(LEFT$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(LEFT$0);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetLeft(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(LEFT$0);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(LEFT$0);
         }

         var3.set(var1);
      }
   }

   public double getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RIGHT$2);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(RIGHT$2);
         return var2;
      }
   }

   public void setRight(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(RIGHT$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(RIGHT$2);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetRight(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(RIGHT$2);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(RIGHT$2);
         }

         var3.set(var1);
      }
   }

   public double getTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOP$4);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(TOP$4);
         return var2;
      }
   }

   public void setTop(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOP$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOP$4);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetTop(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(TOP$4);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(TOP$4);
         }

         var3.set(var1);
      }
   }

   public double getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BOTTOM$6);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(BOTTOM$6);
         return var2;
      }
   }

   public void setBottom(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BOTTOM$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BOTTOM$6);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetBottom(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(BOTTOM$6);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(BOTTOM$6);
         }

         var3.set(var1);
      }
   }

   public double getHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADER$8);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(HEADER$8);
         return var2;
      }
   }

   public void setHeader(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HEADER$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HEADER$8);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetHeader(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(HEADER$8);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(HEADER$8);
         }

         var3.set(var1);
      }
   }

   public double getFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FOOTER$10);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(FOOTER$10);
         return var2;
      }
   }

   public void setFooter(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FOOTER$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FOOTER$10);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetFooter(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(FOOTER$10);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(FOOTER$10);
         }

         var3.set(var1);
      }
   }

}
