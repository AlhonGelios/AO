package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHpsMeasure;

public class CTHpsMeasureImpl extends XmlComplexContentImpl implements CTHpsMeasure {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");


   public CTHpsMeasureImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STHpsMeasure xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHpsMeasure var2 = null;
         var2 = (STHpsMeasure)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetVal(STHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHpsMeasure var3 = null;
         var3 = (STHpsMeasure)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STHpsMeasure)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
