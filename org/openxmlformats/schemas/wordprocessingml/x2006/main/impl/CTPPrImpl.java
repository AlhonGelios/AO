package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPPrBaseImpl;

public class CTPPrImpl extends CTPPrBaseImpl implements CTPPr {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
   private static final QName SECTPR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sectPr");
   private static final QName PPRCHANGE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPrChange");


   public CTPPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTParaRPr getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPr var2 = null;
         var2 = (CTParaRPr)this.get_store().find_element_user(RPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0) != 0;
      }
   }

   public void setRPr(CTParaRPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPr var3 = null;
         var3 = (CTParaRPr)this.get_store().find_element_user(RPR$0, 0);
         if(var3 == null) {
            var3 = (CTParaRPr)this.get_store().add_element_user(RPR$0);
         }

         var3.set(var1);
      }
   }

   public CTParaRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPr var2 = null;
         var2 = (CTParaRPr)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, 0);
      }
   }

   public CTSectPr getSectPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPr var2 = null;
         var2 = (CTSectPr)this.get_store().find_element_user(SECTPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSectPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SECTPR$2) != 0;
      }
   }

   public void setSectPr(CTSectPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPr var3 = null;
         var3 = (CTSectPr)this.get_store().find_element_user(SECTPR$2, 0);
         if(var3 == null) {
            var3 = (CTSectPr)this.get_store().add_element_user(SECTPR$2);
         }

         var3.set(var1);
      }
   }

   public CTSectPr addNewSectPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPr var2 = null;
         var2 = (CTSectPr)this.get_store().add_element_user(SECTPR$2);
         return var2;
      }
   }

   public void unsetSectPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SECTPR$2, 0);
      }
   }

   public CTPPrChange getPPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrChange var2 = null;
         var2 = (CTPPrChange)this.get_store().find_element_user(PPRCHANGE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPRCHANGE$4) != 0;
      }
   }

   public void setPPrChange(CTPPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrChange var3 = null;
         var3 = (CTPPrChange)this.get_store().find_element_user(PPRCHANGE$4, 0);
         if(var3 == null) {
            var3 = (CTPPrChange)this.get_store().add_element_user(PPRCHANGE$4);
         }

         var3.set(var1);
      }
   }

   public CTPPrChange addNewPPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrChange var2 = null;
         var2 = (CTPPrChange)this.get_store().add_element_user(PPRCHANGE$4);
         return var2;
      }
   }

   public void unsetPPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPRCHANGE$4, 0);
      }
   }

}
