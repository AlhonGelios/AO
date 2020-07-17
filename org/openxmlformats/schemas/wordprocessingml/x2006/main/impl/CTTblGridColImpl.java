package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;

public class CTTblGridColImpl extends XmlComplexContentImpl implements CTTblGridCol {

   private static final QName W$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");


   public CTTblGridColImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(W$0);
         return var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(W$0) != null;
      }
   }

   public void setW(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(W$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(W$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetW(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(W$0);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(W$0);
         }

         var3.set(var1);
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(W$0);
      }
   }

}
