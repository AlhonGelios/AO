package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc;

public class CTTabStopImpl extends XmlComplexContentImpl implements CTTabStop {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName LEADER$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leader");
   private static final QName POS$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pos");


   public CTTabStopImpl(SchemaType var1) {
      super(var1);
   }

   public STTabJc.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STTabJc.Enum)var2.getEnumValue();
      }
   }

   public STTabJc xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTabJc var2 = null;
         var2 = (STTabJc)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STTabJc.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVal(STTabJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTabJc var3 = null;
         var3 = (STTabJc)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STTabJc)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public STTabTlc.Enum getLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEADER$2);
         return var2 == null?null:(STTabTlc.Enum)var2.getEnumValue();
      }
   }

   public STTabTlc xgetLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTabTlc var2 = null;
         var2 = (STTabTlc)this.get_store().find_attribute_user(LEADER$2);
         return var2;
      }
   }

   public boolean isSetLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LEADER$2) != null;
      }
   }

   public void setLeader(STTabTlc.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LEADER$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LEADER$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLeader(STTabTlc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTabTlc var3 = null;
         var3 = (STTabTlc)this.get_store().find_attribute_user(LEADER$2);
         if(var3 == null) {
            var3 = (STTabTlc)this.get_store().add_attribute_user(LEADER$2);
         }

         var3.set(var1);
      }
   }

   public void unsetLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LEADER$2);
      }
   }

   public BigInteger getPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POS$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STSignedTwipsMeasure xgetPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var2 = null;
         var2 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(POS$4);
         return var2;
      }
   }

   public void setPos(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POS$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POS$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetPos(STSignedTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var3 = null;
         var3 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(POS$4);
         if(var3 == null) {
            var3 = (STSignedTwipsMeasure)this.get_store().add_attribute_user(POS$4);
         }

         var3.set(var1);
      }
   }

}
