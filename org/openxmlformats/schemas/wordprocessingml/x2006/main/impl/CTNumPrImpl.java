package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering;

public class CTNumPrImpl extends XmlComplexContentImpl implements CTNumPr {

   private static final QName ILVL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");
   private static final QName NUMID$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numId");
   private static final QName NUMBERINGCHANGE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numberingChange");
   private static final QName INS$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");


   public CTNumPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTDecimalNumber getIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(ILVL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ILVL$0) != 0;
      }
   }

   public void setIlvl(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(ILVL$0, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(ILVL$0);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(ILVL$0);
         return var2;
      }
   }

   public void unsetIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ILVL$0, 0);
      }
   }

   public CTDecimalNumber getNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(NUMID$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMID$2) != 0;
      }
   }

   public void setNumId(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(NUMID$2, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(NUMID$2);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(NUMID$2);
         return var2;
      }
   }

   public void unsetNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMID$2, 0);
      }
   }

   public CTTrackChangeNumbering getNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var2 = null;
         var2 = (CTTrackChangeNumbering)this.get_store().find_element_user(NUMBERINGCHANGE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMBERINGCHANGE$4) != 0;
      }
   }

   public void setNumberingChange(CTTrackChangeNumbering var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var3 = null;
         var3 = (CTTrackChangeNumbering)this.get_store().find_element_user(NUMBERINGCHANGE$4, 0);
         if(var3 == null) {
            var3 = (CTTrackChangeNumbering)this.get_store().add_element_user(NUMBERINGCHANGE$4);
         }

         var3.set(var1);
      }
   }

   public CTTrackChangeNumbering addNewNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var2 = null;
         var2 = (CTTrackChangeNumbering)this.get_store().add_element_user(NUMBERINGCHANGE$4);
         return var2;
      }
   }

   public void unsetNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMBERINGCHANGE$4, 0);
      }
   }

   public CTTrackChange getIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(INS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INS$6) != 0;
      }
   }

   public void setIns(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(INS$6, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(INS$6);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(INS$6);
         return var2;
      }
   }

   public void unsetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INS$6, 0);
      }
   }

}
