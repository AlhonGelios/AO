package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTStyleImpl.1TblStylePrList;

public class CTStyleImpl extends XmlComplexContentImpl implements CTStyle {

   private static final QName NAME$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
   private static final QName ALIASES$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "aliases");
   private static final QName BASEDON$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "basedOn");
   private static final QName NEXT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "next");
   private static final QName LINK$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "link");
   private static final QName AUTOREDEFINE$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoRedefine");
   private static final QName HIDDEN$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hidden");
   private static final QName UIPRIORITY$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiPriority");
   private static final QName SEMIHIDDEN$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "semiHidden");
   private static final QName UNHIDEWHENUSED$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "unhideWhenUsed");
   private static final QName QFORMAT$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "qFormat");
   private static final QName LOCKED$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "locked");
   private static final QName PERSONAL$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personal");
   private static final QName PERSONALCOMPOSE$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personalCompose");
   private static final QName PERSONALREPLY$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personalReply");
   private static final QName RSID$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsid");
   private static final QName PPR$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
   private static final QName RPR$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
   private static final QName TBLPR$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPr");
   private static final QName TRPR$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPr");
   private static final QName TCPR$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPr");
   private static final QName TBLSTYLEPR$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStylePr");
   private static final QName TYPE$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
   private static final QName STYLEID$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleId");
   private static final QName DEFAULT$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
   private static final QName CUSTOMSTYLE$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customStyle");


   public CTStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTString getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(NAME$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NAME$0) != 0;
      }
   }

   public void setName(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(NAME$0, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(NAME$0);
         }

         var3.set(var1);
      }
   }

   public CTString addNewName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(NAME$0);
         return var2;
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NAME$0, 0);
      }
   }

   public CTString getAliases() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(ALIASES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAliases() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALIASES$2) != 0;
      }
   }

   public void setAliases(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(ALIASES$2, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(ALIASES$2);
         }

         var3.set(var1);
      }
   }

   public CTString addNewAliases() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(ALIASES$2);
         return var2;
      }
   }

   public void unsetAliases() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALIASES$2, 0);
      }
   }

   public CTString getBasedOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(BASEDON$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBasedOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BASEDON$4) != 0;
      }
   }

   public void setBasedOn(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(BASEDON$4, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(BASEDON$4);
         }

         var3.set(var1);
      }
   }

   public CTString addNewBasedOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(BASEDON$4);
         return var2;
      }
   }

   public void unsetBasedOn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BASEDON$4, 0);
      }
   }

   public CTString getNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(NEXT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NEXT$6) != 0;
      }
   }

   public void setNext(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(NEXT$6, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(NEXT$6);
         }

         var3.set(var1);
      }
   }

   public CTString addNewNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(NEXT$6);
         return var2;
      }
   }

   public void unsetNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NEXT$6, 0);
      }
   }

   public CTString getLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(LINK$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINK$8) != 0;
      }
   }

   public void setLink(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(LINK$8, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(LINK$8);
         }

         var3.set(var1);
      }
   }

   public CTString addNewLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(LINK$8);
         return var2;
      }
   }

   public void unsetLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINK$8, 0);
      }
   }

   public CTOnOff getAutoRedefine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(AUTOREDEFINE$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoRedefine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOREDEFINE$10) != 0;
      }
   }

   public void setAutoRedefine(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(AUTOREDEFINE$10, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(AUTOREDEFINE$10);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAutoRedefine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(AUTOREDEFINE$10);
         return var2;
      }
   }

   public void unsetAutoRedefine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOREDEFINE$10, 0);
      }
   }

   public CTOnOff getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(HIDDEN$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDDEN$12) != 0;
      }
   }

   public void setHidden(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(HIDDEN$12, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(HIDDEN$12);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(HIDDEN$12);
         return var2;
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDDEN$12, 0);
      }
   }

   public CTDecimalNumber getUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(UIPRIORITY$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UIPRIORITY$14) != 0;
      }
   }

   public void setUiPriority(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(UIPRIORITY$14, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(UIPRIORITY$14);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(UIPRIORITY$14);
         return var2;
      }
   }

   public void unsetUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UIPRIORITY$14, 0);
      }
   }

   public CTOnOff getSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SEMIHIDDEN$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SEMIHIDDEN$16) != 0;
      }
   }

   public void setSemiHidden(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SEMIHIDDEN$16, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SEMIHIDDEN$16);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SEMIHIDDEN$16);
         return var2;
      }
   }

   public void unsetSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SEMIHIDDEN$16, 0);
      }
   }

   public CTOnOff getUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(UNHIDEWHENUSED$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UNHIDEWHENUSED$18) != 0;
      }
   }

   public void setUnhideWhenUsed(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(UNHIDEWHENUSED$18, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(UNHIDEWHENUSED$18);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(UNHIDEWHENUSED$18);
         return var2;
      }
   }

   public void unsetUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UNHIDEWHENUSED$18, 0);
      }
   }

   public CTOnOff getQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(QFORMAT$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(QFORMAT$20) != 0;
      }
   }

   public void setQFormat(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(QFORMAT$20, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(QFORMAT$20);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(QFORMAT$20);
         return var2;
      }
   }

   public void unsetQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(QFORMAT$20, 0);
      }
   }

   public CTOnOff getLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(LOCKED$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOCKED$22) != 0;
      }
   }

   public void setLocked(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(LOCKED$22, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(LOCKED$22);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(LOCKED$22);
         return var2;
      }
   }

   public void unsetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOCKED$22, 0);
      }
   }

   public CTOnOff getPersonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PERSONAL$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPersonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PERSONAL$24) != 0;
      }
   }

   public void setPersonal(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PERSONAL$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PERSONAL$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPersonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PERSONAL$24);
         return var2;
      }
   }

   public void unsetPersonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERSONAL$24, 0);
      }
   }

   public CTOnOff getPersonalCompose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PERSONALCOMPOSE$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPersonalCompose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PERSONALCOMPOSE$26) != 0;
      }
   }

   public void setPersonalCompose(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PERSONALCOMPOSE$26, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PERSONALCOMPOSE$26);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPersonalCompose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PERSONALCOMPOSE$26);
         return var2;
      }
   }

   public void unsetPersonalCompose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERSONALCOMPOSE$26, 0);
      }
   }

   public CTOnOff getPersonalReply() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PERSONALREPLY$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPersonalReply() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PERSONALREPLY$28) != 0;
      }
   }

   public void setPersonalReply(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PERSONALREPLY$28, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PERSONALREPLY$28);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPersonalReply() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PERSONALREPLY$28);
         return var2;
      }
   }

   public void unsetPersonalReply() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERSONALREPLY$28, 0);
      }
   }

   public CTLongHexNumber getRsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().find_element_user(RSID$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RSID$30) != 0;
      }
   }

   public void setRsid(CTLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var3 = null;
         var3 = (CTLongHexNumber)this.get_store().find_element_user(RSID$30, 0);
         if(var3 == null) {
            var3 = (CTLongHexNumber)this.get_store().add_element_user(RSID$30);
         }

         var3.set(var1);
      }
   }

   public CTLongHexNumber addNewRsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().add_element_user(RSID$30);
         return var2;
      }
   }

   public void unsetRsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RSID$30, 0);
      }
   }

   public CTPPr getPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().find_element_user(PPR$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPR$32) != 0;
      }
   }

   public void setPPr(CTPPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var3 = null;
         var3 = (CTPPr)this.get_store().find_element_user(PPR$32, 0);
         if(var3 == null) {
            var3 = (CTPPr)this.get_store().add_element_user(PPR$32);
         }

         var3.set(var1);
      }
   }

   public CTPPr addNewPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().add_element_user(PPR$32);
         return var2;
      }
   }

   public void unsetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPR$32, 0);
      }
   }

   public CTRPr getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().find_element_user(RPR$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$34) != 0;
      }
   }

   public void setRPr(CTRPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$34, 0);
         if(var3 == null) {
            var3 = (CTRPr)this.get_store().add_element_user(RPR$34);
         }

         var3.set(var1);
      }
   }

   public CTRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().add_element_user(RPR$34);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$34, 0);
      }
   }

   public CTTblPrBase getTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrBase var2 = null;
         var2 = (CTTblPrBase)this.get_store().find_element_user(TBLPR$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLPR$36) != 0;
      }
   }

   public void setTblPr(CTTblPrBase var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrBase var3 = null;
         var3 = (CTTblPrBase)this.get_store().find_element_user(TBLPR$36, 0);
         if(var3 == null) {
            var3 = (CTTblPrBase)this.get_store().add_element_user(TBLPR$36);
         }

         var3.set(var1);
      }
   }

   public CTTblPrBase addNewTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrBase var2 = null;
         var2 = (CTTblPrBase)this.get_store().add_element_user(TBLPR$36);
         return var2;
      }
   }

   public void unsetTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLPR$36, 0);
      }
   }

   public CTTrPr getTrPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPr var2 = null;
         var2 = (CTTrPr)this.get_store().find_element_user(TRPR$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTrPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRPR$38) != 0;
      }
   }

   public void setTrPr(CTTrPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPr var3 = null;
         var3 = (CTTrPr)this.get_store().find_element_user(TRPR$38, 0);
         if(var3 == null) {
            var3 = (CTTrPr)this.get_store().add_element_user(TRPR$38);
         }

         var3.set(var1);
      }
   }

   public CTTrPr addNewTrPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPr var2 = null;
         var2 = (CTTrPr)this.get_store().add_element_user(TRPR$38);
         return var2;
      }
   }

   public void unsetTrPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRPR$38, 0);
      }
   }

   public CTTcPr getTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPr var2 = null;
         var2 = (CTTcPr)this.get_store().find_element_user(TCPR$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCPR$40) != 0;
      }
   }

   public void setTcPr(CTTcPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPr var3 = null;
         var3 = (CTTcPr)this.get_store().find_element_user(TCPR$40, 0);
         if(var3 == null) {
            var3 = (CTTcPr)this.get_store().add_element_user(TCPR$40);
         }

         var3.set(var1);
      }
   }

   public CTTcPr addNewTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPr var2 = null;
         var2 = (CTTcPr)this.get_store().add_element_user(TCPR$40);
         return var2;
      }
   }

   public void unsetTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCPR$40, 0);
      }
   }

   public List getTblStylePrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TblStylePrList(this);
      }
   }

   public CTTblStylePr[] getTblStylePrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TBLSTYLEPR$42, var2);
         CTTblStylePr[] var3 = new CTTblStylePr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTblStylePr getTblStylePrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblStylePr var3 = null;
         var3 = (CTTblStylePr)this.get_store().find_element_user(TBLSTYLEPR$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTblStylePrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLSTYLEPR$42);
      }
   }

   public void setTblStylePrArray(CTTblStylePr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TBLSTYLEPR$42);
      }
   }

   public void setTblStylePrArray(int var1, CTTblStylePr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblStylePr var4 = null;
         var4 = (CTTblStylePr)this.get_store().find_element_user(TBLSTYLEPR$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTblStylePr insertNewTblStylePr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblStylePr var3 = null;
         var3 = (CTTblStylePr)this.get_store().insert_element_user(TBLSTYLEPR$42, var1);
         return var3;
      }
   }

   public CTTblStylePr addNewTblStylePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblStylePr var2 = null;
         var2 = (CTTblStylePr)this.get_store().add_element_user(TBLSTYLEPR$42);
         return var2;
      }
   }

   public void removeTblStylePr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLSTYLEPR$42, var1);
      }
   }

   public STStyleType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$44);
         return var2 == null?null:(STStyleType.Enum)var2.getEnumValue();
      }
   }

   public STStyleType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStyleType var2 = null;
         var2 = (STStyleType)this.get_store().find_attribute_user(TYPE$44);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$44) != null;
      }
   }

   public void setType(STStyleType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$44);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STStyleType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STStyleType var3 = null;
         var3 = (STStyleType)this.get_store().find_attribute_user(TYPE$44);
         if(var3 == null) {
            var3 = (STStyleType)this.get_store().add_attribute_user(TYPE$44);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$44);
      }
   }

   public String getStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLEID$46);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(STYLEID$46);
         return var2;
      }
   }

   public boolean isSetStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLEID$46) != null;
      }
   }

   public void setStyleId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLEID$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLEID$46);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyleId(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(STYLEID$46);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(STYLEID$46);
         }

         var3.set(var1);
      }
   }

   public void unsetStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLEID$46);
      }
   }

   public STOnOff.Enum getDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULT$48);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DEFAULT$48);
         return var2;
      }
   }

   public boolean isSetDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULT$48) != null;
      }
   }

   public void setDefault(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFAULT$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFAULT$48);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDefault(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DEFAULT$48);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DEFAULT$48);
         }

         var3.set(var1);
      }
   }

   public void unsetDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULT$48);
      }
   }

   public STOnOff.Enum getCustomStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMSTYLE$50);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetCustomStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(CUSTOMSTYLE$50);
         return var2;
      }
   }

   public boolean isSetCustomStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMSTYLE$50) != null;
      }
   }

   public void setCustomStyle(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMSTYLE$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMSTYLE$50);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCustomStyle(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(CUSTOMSTYLE$50);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(CUSTOMSTYLE$50);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMSTYLE$50);
      }
   }

}
