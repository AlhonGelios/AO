package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;

public class CTHighlightImpl extends XmlComplexContentImpl implements CTHighlight {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");


   public CTHighlightImpl(SchemaType var1) {
      super(var1);
   }

   public STHighlightColor.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STHighlightColor.Enum)var2.getEnumValue();
      }
   }

   public STHighlightColor xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHighlightColor var2 = null;
         var2 = (STHighlightColor)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STHighlightColor.Enum var1) {
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

   public void xsetVal(STHighlightColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHighlightColor var3 = null;
         var3 = (STHighlightColor)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STHighlightColor)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
