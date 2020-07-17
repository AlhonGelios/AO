package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins;

public class CTPageMarginsImpl extends XmlComplexContentImpl implements CTPageMargins {

   private static final QName L$0 = new QName("", "l");
   private static final QName R$2 = new QName("", "r");
   private static final QName T$4 = new QName("", "t");
   private static final QName B$6 = new QName("", "b");
   private static final QName HEADER$8 = new QName("", "header");
   private static final QName FOOTER$10 = new QName("", "footer");


   public CTPageMarginsImpl(SchemaType var1) {
      super(var1);
   }

   public double getL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(L$0);
         return var2;
      }
   }

   public void setL(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(L$0);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetL(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(L$0);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(L$0);
         }

         var3.set(var1);
      }
   }

   public double getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$2);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(R$2);
         return var2;
      }
   }

   public void setR(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(R$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(R$2);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetR(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(R$2);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(R$2);
         }

         var3.set(var1);
      }
   }

   public double getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$4);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(T$4);
         return var2;
      }
   }

   public void setT(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(T$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(T$4);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetT(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(T$4);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(T$4);
         }

         var3.set(var1);
      }
   }

   public double getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(B$6);
         return var2;
      }
   }

   public void setB(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(B$6);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetB(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(B$6);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(B$6);
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
