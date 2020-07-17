package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo$Enum;

public class CTPTabImpl extends XmlComplexContentImpl implements CTPTab {

   private static final QName ALIGNMENT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alignment");
   private static final QName RELATIVETO$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "relativeTo");
   private static final QName LEADER$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leader");


   public CTPTabImpl(SchemaType var1) {
      super(var1);
   }

   public STPTabAlignment$Enum getAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALIGNMENT$0);
         return var2 == null?null:(STPTabAlignment$Enum)var2.getEnumValue();
      }
   }

   public STPTabAlignment xgetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabAlignment var2 = null;
         var2 = (STPTabAlignment)this.get_store().find_attribute_user(ALIGNMENT$0);
         return var2;
      }
   }

   public void setAlignment(STPTabAlignment$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALIGNMENT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALIGNMENT$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlignment(STPTabAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabAlignment var3 = null;
         var3 = (STPTabAlignment)this.get_store().find_attribute_user(ALIGNMENT$0);
         if(var3 == null) {
            var3 = (STPTabAlignment)this.get_store().add_attribute_user(ALIGNMENT$0);
         }

         var3.set(var1);
      }
   }

   public STPTabRelativeTo$Enum getRelativeTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RELATIVETO$2);
         return var2 == null?null:(STPTabRelativeTo$Enum)var2.getEnumValue();
      }
   }

   public STPTabRelativeTo xgetRelativeTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabRelativeTo var2 = null;
         var2 = (STPTabRelativeTo)this.get_store().find_attribute_user(RELATIVETO$2);
         return var2;
      }
   }

   public void setRelativeTo(STPTabRelativeTo$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RELATIVETO$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RELATIVETO$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetRelativeTo(STPTabRelativeTo var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabRelativeTo var3 = null;
         var3 = (STPTabRelativeTo)this.get_store().find_attribute_user(RELATIVETO$2);
         if(var3 == null) {
            var3 = (STPTabRelativeTo)this.get_store().add_attribute_user(RELATIVETO$2);
         }

         var3.set(var1);
      }
   }

   public STPTabLeader$Enum getLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEADER$4);
         return var2 == null?null:(STPTabLeader$Enum)var2.getEnumValue();
      }
   }

   public STPTabLeader xgetLeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabLeader var2 = null;
         var2 = (STPTabLeader)this.get_store().find_attribute_user(LEADER$4);
         return var2;
      }
   }

   public void setLeader(STPTabLeader$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LEADER$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LEADER$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLeader(STPTabLeader var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPTabLeader var3 = null;
         var3 = (STPTabLeader)this.get_store().find_attribute_user(LEADER$4);
         if(var3 == null) {
            var3 = (STPTabLeader)this.get_store().add_attribute_user(LEADER$4);
         }

         var3.set(var1);
      }
   }

}
