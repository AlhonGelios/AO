package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTMarkupImpl;

public class CTMarkupRangeImpl extends CTMarkupImpl implements CTMarkupRange {

   private static final QName DISPLACEDBYCUSTOMXML$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displacedByCustomXml");


   public CTMarkupRangeImpl(SchemaType var1) {
      super(var1);
   }

   public STDisplacedByCustomXml$Enum getDisplacedByCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$0);
         return var2 == null?null:(STDisplacedByCustomXml$Enum)var2.getEnumValue();
      }
   }

   public STDisplacedByCustomXml xgetDisplacedByCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDisplacedByCustomXml var2 = null;
         var2 = (STDisplacedByCustomXml)this.get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$0);
         return var2;
      }
   }

   public boolean isSetDisplacedByCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$0) != null;
      }
   }

   public void setDisplacedByCustomXml(STDisplacedByCustomXml$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DISPLACEDBYCUSTOMXML$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDisplacedByCustomXml(STDisplacedByCustomXml var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDisplacedByCustomXml var3 = null;
         var3 = (STDisplacedByCustomXml)this.get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$0);
         if(var3 == null) {
            var3 = (STDisplacedByCustomXml)this.get_store().add_attribute_user(DISPLACEDBYCUSTOMXML$0);
         }

         var3.set(var1);
      }
   }

   public void unsetDisplacedByCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISPLACEDBYCUSTOMXML$0);
      }
   }

}
