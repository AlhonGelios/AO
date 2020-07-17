package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTAcc;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTBar;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBox;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTBox;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTD;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArr;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTF;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTFunc;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChr;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLow;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUpp;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTM;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTNary;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTPhant;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTRad;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTSPre;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTSSub;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSup;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTSSup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1AccList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1BarList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1BookmarkEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1BookmarkStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1BorderBoxList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1BoxList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CommentRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CommentRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlDelRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlDelRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlInsRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlInsRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlMoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlMoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlMoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1CustomXmlMoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1DList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1DelList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1EqArrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1FList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1FuncList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1GroupChrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1InsList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1LimLowList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1LimUppList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveFromList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveToList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1MoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1NaryList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1OMathList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1OMathParaList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1PermEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1PermStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1PhantList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1ProofErrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1R2List;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1RList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1RadList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SPreList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SSubList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SSubSupList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SSupList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SdtList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRunTrackChangeImpl.1SmartTagList;

public class CTRunTrackChangeImpl extends CTTrackChangeImpl implements CTRunTrackChange {

   private static final QName CUSTOMXML$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXml");
   private static final QName SMARTTAG$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smartTag");
   private static final QName SDT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdt");
   private static final QName R$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "r");
   private static final QName PROOFERR$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofErr");
   private static final QName PERMSTART$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permStart");
   private static final QName PERMEND$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permEnd");
   private static final QName BOOKMARKSTART$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkStart");
   private static final QName BOOKMARKEND$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkEnd");
   private static final QName MOVEFROMRANGESTART$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeStart");
   private static final QName MOVEFROMRANGEEND$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeEnd");
   private static final QName MOVETORANGESTART$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeStart");
   private static final QName MOVETORANGEEND$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeEnd");
   private static final QName COMMENTRANGESTART$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeStart");
   private static final QName COMMENTRANGEEND$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeEnd");
   private static final QName CUSTOMXMLINSRANGESTART$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeStart");
   private static final QName CUSTOMXMLINSRANGEEND$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeEnd");
   private static final QName CUSTOMXMLDELRANGESTART$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeStart");
   private static final QName CUSTOMXMLDELRANGEEND$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeEnd");
   private static final QName CUSTOMXMLMOVEFROMRANGESTART$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeStart");
   private static final QName CUSTOMXMLMOVEFROMRANGEEND$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeEnd");
   private static final QName CUSTOMXMLMOVETORANGESTART$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeStart");
   private static final QName CUSTOMXMLMOVETORANGEEND$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeEnd");
   private static final QName INS$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
   private static final QName DEL$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
   private static final QName MOVEFROM$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
   private static final QName MOVETO$52 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
   private static final QName OMATHPARA$54 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathPara");
   private static final QName OMATH$56 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");
   private static final QName ACC$58 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "acc");
   private static final QName BAR$60 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "bar");
   private static final QName BOX$62 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "box");
   private static final QName BORDERBOX$64 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "borderBox");
   private static final QName D$66 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "d");
   private static final QName EQARR$68 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "eqArr");
   private static final QName F$70 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "f");
   private static final QName FUNC$72 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "func");
   private static final QName GROUPCHR$74 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "groupChr");
   private static final QName LIMLOW$76 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "limLow");
   private static final QName LIMUPP$78 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "limUpp");
   private static final QName M$80 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "m");
   private static final QName NARY$82 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "nary");
   private static final QName PHANT$84 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "phant");
   private static final QName RAD$86 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rad");
   private static final QName SPRE$88 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sPre");
   private static final QName SSUB$90 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSub");
   private static final QName SSUBSUP$92 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSubSup");
   private static final QName SSUP$94 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSup");
   private static final QName R2$96 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "r");


   public CTRunTrackChangeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCustomXmlList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlList(this);
      }
   }

   public CTCustomXmlRun[] getCustomXmlArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXML$0, var2);
         CTCustomXmlRun[] var3 = new CTCustomXmlRun[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCustomXmlRun getCustomXmlArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlRun var3 = null;
         var3 = (CTCustomXmlRun)this.get_store().find_element_user(CUSTOMXML$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXML$0);
      }
   }

   public void setCustomXmlArray(CTCustomXmlRun[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXML$0);
      }
   }

   public void setCustomXmlArray(int var1, CTCustomXmlRun var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlRun var4 = null;
         var4 = (CTCustomXmlRun)this.get_store().find_element_user(CUSTOMXML$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCustomXmlRun insertNewCustomXml(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlRun var3 = null;
         var3 = (CTCustomXmlRun)this.get_store().insert_element_user(CUSTOMXML$0, var1);
         return var3;
      }
   }

   public CTCustomXmlRun addNewCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlRun var2 = null;
         var2 = (CTCustomXmlRun)this.get_store().add_element_user(CUSTOMXML$0);
         return var2;
      }
   }

   public void removeCustomXml(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXML$0, var1);
      }
   }

   public List getSmartTagList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SmartTagList(this);
      }
   }

   public CTSmartTagRun[] getSmartTagArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SMARTTAG$2, var2);
         CTSmartTagRun[] var3 = new CTSmartTagRun[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSmartTagRun getSmartTagArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagRun var3 = null;
         var3 = (CTSmartTagRun)this.get_store().find_element_user(SMARTTAG$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSmartTagArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAG$2);
      }
   }

   public void setSmartTagArray(CTSmartTagRun[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SMARTTAG$2);
      }
   }

   public void setSmartTagArray(int var1, CTSmartTagRun var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagRun var4 = null;
         var4 = (CTSmartTagRun)this.get_store().find_element_user(SMARTTAG$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSmartTagRun insertNewSmartTag(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagRun var3 = null;
         var3 = (CTSmartTagRun)this.get_store().insert_element_user(SMARTTAG$2, var1);
         return var3;
      }
   }

   public CTSmartTagRun addNewSmartTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagRun var2 = null;
         var2 = (CTSmartTagRun)this.get_store().add_element_user(SMARTTAG$2);
         return var2;
      }
   }

   public void removeSmartTag(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAG$2, var1);
      }
   }

   public List getSdtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SdtList(this);
      }
   }

   public CTSdtRun[] getSdtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SDT$4, var2);
         CTSdtRun[] var3 = new CTSdtRun[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtRun getSdtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtRun var3 = null;
         var3 = (CTSdtRun)this.get_store().find_element_user(SDT$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSdtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SDT$4);
      }
   }

   public void setSdtArray(CTSdtRun[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SDT$4);
      }
   }

   public void setSdtArray(int var1, CTSdtRun var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtRun var4 = null;
         var4 = (CTSdtRun)this.get_store().find_element_user(SDT$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtRun insertNewSdt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtRun var3 = null;
         var3 = (CTSdtRun)this.get_store().insert_element_user(SDT$4, var1);
         return var3;
      }
   }

   public CTSdtRun addNewSdt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtRun var2 = null;
         var2 = (CTSdtRun)this.get_store().add_element_user(SDT$4);
         return var2;
      }
   }

   public void removeSdt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SDT$4, var1);
      }
   }

   public List getRList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RList(this);
      }
   }

   public CTR[] getRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R$6, var2);
         CTR[] var3 = new CTR[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTR getRArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTR var3 = null;
         var3 = (CTR)this.get_store().find_element_user(R$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R$6);
      }
   }

   public void setRArray(CTR[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R$6);
      }
   }

   public void setRArray(int var1, CTR var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTR var4 = null;
         var4 = (CTR)this.get_store().find_element_user(R$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTR insertNewR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTR var3 = null;
         var3 = (CTR)this.get_store().insert_element_user(R$6, var1);
         return var3;
      }
   }

   public CTR addNewR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTR var2 = null;
         var2 = (CTR)this.get_store().add_element_user(R$6);
         return var2;
      }
   }

   public void removeR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R$6, var1);
      }
   }

   public List getProofErrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ProofErrList(this);
      }
   }

   public CTProofErr[] getProofErrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PROOFERR$8, var2);
         CTProofErr[] var3 = new CTProofErr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTProofErr getProofErrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var3 = null;
         var3 = (CTProofErr)this.get_store().find_element_user(PROOFERR$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfProofErrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROOFERR$8);
      }
   }

   public void setProofErrArray(CTProofErr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PROOFERR$8);
      }
   }

   public void setProofErrArray(int var1, CTProofErr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var4 = null;
         var4 = (CTProofErr)this.get_store().find_element_user(PROOFERR$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTProofErr insertNewProofErr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var3 = null;
         var3 = (CTProofErr)this.get_store().insert_element_user(PROOFERR$8, var1);
         return var3;
      }
   }

   public CTProofErr addNewProofErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var2 = null;
         var2 = (CTProofErr)this.get_store().add_element_user(PROOFERR$8);
         return var2;
      }
   }

   public void removeProofErr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROOFERR$8, var1);
      }
   }

   public List getPermStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PermStartList(this);
      }
   }

   public CTPermStart[] getPermStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PERMSTART$10, var2);
         CTPermStart[] var3 = new CTPermStart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPermStart getPermStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var3 = null;
         var3 = (CTPermStart)this.get_store().find_element_user(PERMSTART$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPermStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PERMSTART$10);
      }
   }

   public void setPermStartArray(CTPermStart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PERMSTART$10);
      }
   }

   public void setPermStartArray(int var1, CTPermStart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var4 = null;
         var4 = (CTPermStart)this.get_store().find_element_user(PERMSTART$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPermStart insertNewPermStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var3 = null;
         var3 = (CTPermStart)this.get_store().insert_element_user(PERMSTART$10, var1);
         return var3;
      }
   }

   public CTPermStart addNewPermStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var2 = null;
         var2 = (CTPermStart)this.get_store().add_element_user(PERMSTART$10);
         return var2;
      }
   }

   public void removePermStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERMSTART$10, var1);
      }
   }

   public List getPermEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PermEndList(this);
      }
   }

   public CTPerm[] getPermEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PERMEND$12, var2);
         CTPerm[] var3 = new CTPerm[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPerm getPermEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var3 = null;
         var3 = (CTPerm)this.get_store().find_element_user(PERMEND$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPermEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PERMEND$12);
      }
   }

   public void setPermEndArray(CTPerm[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PERMEND$12);
      }
   }

   public void setPermEndArray(int var1, CTPerm var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var4 = null;
         var4 = (CTPerm)this.get_store().find_element_user(PERMEND$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPerm insertNewPermEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var3 = null;
         var3 = (CTPerm)this.get_store().insert_element_user(PERMEND$12, var1);
         return var3;
      }
   }

   public CTPerm addNewPermEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var2 = null;
         var2 = (CTPerm)this.get_store().add_element_user(PERMEND$12);
         return var2;
      }
   }

   public void removePermEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERMEND$12, var1);
      }
   }

   public List getBookmarkStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BookmarkStartList(this);
      }
   }

   public CTBookmark[] getBookmarkStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BOOKMARKSTART$14, var2);
         CTBookmark[] var3 = new CTBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBookmark getBookmarkStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var3 = null;
         var3 = (CTBookmark)this.get_store().find_element_user(BOOKMARKSTART$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBookmarkStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKMARKSTART$14);
      }
   }

   public void setBookmarkStartArray(CTBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOKMARKSTART$14);
      }
   }

   public void setBookmarkStartArray(int var1, CTBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var4 = null;
         var4 = (CTBookmark)this.get_store().find_element_user(BOOKMARKSTART$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBookmark insertNewBookmarkStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var3 = null;
         var3 = (CTBookmark)this.get_store().insert_element_user(BOOKMARKSTART$14, var1);
         return var3;
      }
   }

   public CTBookmark addNewBookmarkStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var2 = null;
         var2 = (CTBookmark)this.get_store().add_element_user(BOOKMARKSTART$14);
         return var2;
      }
   }

   public void removeBookmarkStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKMARKSTART$14, var1);
      }
   }

   public List getBookmarkEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BookmarkEndList(this);
      }
   }

   public CTMarkupRange[] getBookmarkEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BOOKMARKEND$16, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getBookmarkEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(BOOKMARKEND$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBookmarkEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKMARKEND$16);
      }
   }

   public void setBookmarkEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOKMARKEND$16);
      }
   }

   public void setBookmarkEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(BOOKMARKEND$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkupRange insertNewBookmarkEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().insert_element_user(BOOKMARKEND$16, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewBookmarkEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(BOOKMARKEND$16);
         return var2;
      }
   }

   public void removeBookmarkEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKMARKEND$16, var1);
      }
   }

   public List getMoveFromRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveFromRangeStartList(this);
      }
   }

   public CTMoveBookmark[] getMoveFromRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVEFROMRANGESTART$18, var2);
         CTMoveBookmark[] var3 = new CTMoveBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMoveBookmark getMoveFromRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().find_element_user(MOVEFROMRANGESTART$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveFromRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVEFROMRANGESTART$18);
      }
   }

   public void setMoveFromRangeStartArray(CTMoveBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROMRANGESTART$18);
      }
   }

   public void setMoveFromRangeStartArray(int var1, CTMoveBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var4 = null;
         var4 = (CTMoveBookmark)this.get_store().find_element_user(MOVEFROMRANGESTART$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMoveBookmark insertNewMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().insert_element_user(MOVEFROMRANGESTART$18, var1);
         return var3;
      }
   }

   public CTMoveBookmark addNewMoveFromRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var2 = null;
         var2 = (CTMoveBookmark)this.get_store().add_element_user(MOVEFROMRANGESTART$18);
         return var2;
      }
   }

   public void removeMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROMRANGESTART$18, var1);
      }
   }

   public List getMoveFromRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveFromRangeEndList(this);
      }
   }

   public CTMarkupRange[] getMoveFromRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVEFROMRANGEEND$20, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getMoveFromRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(MOVEFROMRANGEEND$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveFromRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVEFROMRANGEEND$20);
      }
   }

   public void setMoveFromRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROMRANGEEND$20);
      }
   }

   public void setMoveFromRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(MOVEFROMRANGEEND$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkupRange insertNewMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().insert_element_user(MOVEFROMRANGEEND$20, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewMoveFromRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(MOVEFROMRANGEEND$20);
         return var2;
      }
   }

   public void removeMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROMRANGEEND$20, var1);
      }
   }

   public List getMoveToRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveToRangeStartList(this);
      }
   }

   public CTMoveBookmark[] getMoveToRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVETORANGESTART$22, var2);
         CTMoveBookmark[] var3 = new CTMoveBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMoveBookmark getMoveToRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().find_element_user(MOVETORANGESTART$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveToRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVETORANGESTART$22);
      }
   }

   public void setMoveToRangeStartArray(CTMoveBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETORANGESTART$22);
      }
   }

   public void setMoveToRangeStartArray(int var1, CTMoveBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var4 = null;
         var4 = (CTMoveBookmark)this.get_store().find_element_user(MOVETORANGESTART$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMoveBookmark insertNewMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().insert_element_user(MOVETORANGESTART$22, var1);
         return var3;
      }
   }

   public CTMoveBookmark addNewMoveToRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var2 = null;
         var2 = (CTMoveBookmark)this.get_store().add_element_user(MOVETORANGESTART$22);
         return var2;
      }
   }

   public void removeMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETORANGESTART$22, var1);
      }
   }

   public List getMoveToRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveToRangeEndList(this);
      }
   }

   public CTMarkupRange[] getMoveToRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVETORANGEEND$24, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getMoveToRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(MOVETORANGEEND$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveToRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVETORANGEEND$24);
      }
   }

   public void setMoveToRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETORANGEEND$24);
      }
   }

   public void setMoveToRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(MOVETORANGEEND$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkupRange insertNewMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().insert_element_user(MOVETORANGEEND$24, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewMoveToRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(MOVETORANGEEND$24);
         return var2;
      }
   }

   public void removeMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETORANGEEND$24, var1);
      }
   }

   public List getCommentRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CommentRangeStartList(this);
      }
   }

   public CTMarkupRange[] getCommentRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMMENTRANGESTART$26, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getCommentRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGESTART$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCommentRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMMENTRANGESTART$26);
      }
   }

   public void setCommentRangeStartArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENTRANGESTART$26);
      }
   }

   public void setCommentRangeStartArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGESTART$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkupRange insertNewCommentRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().insert_element_user(COMMENTRANGESTART$26, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewCommentRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(COMMENTRANGESTART$26);
         return var2;
      }
   }

   public void removeCommentRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENTRANGESTART$26, var1);
      }
   }

   public List getCommentRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CommentRangeEndList(this);
      }
   }

   public CTMarkupRange[] getCommentRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMMENTRANGEEND$28, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getCommentRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGEEND$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCommentRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMMENTRANGEEND$28);
      }
   }

   public void setCommentRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENTRANGEEND$28);
      }
   }

   public void setCommentRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGEEND$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkupRange insertNewCommentRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().insert_element_user(COMMENTRANGEEND$28, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewCommentRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(COMMENTRANGEEND$28);
         return var2;
      }
   }

   public void removeCommentRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENTRANGEEND$28, var1);
      }
   }

   public List getCustomXmlInsRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlInsRangeStartList(this);
      }
   }

   public CTTrackChange[] getCustomXmlInsRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLINSRANGESTART$30, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlInsRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLINSRANGESTART$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlInsRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLINSRANGESTART$30);
      }
   }

   public void setCustomXmlInsRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLINSRANGESTART$30);
      }
   }

   public void setCustomXmlInsRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLINSRANGESTART$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTrackChange insertNewCustomXmlInsRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLINSRANGESTART$30, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlInsRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLINSRANGESTART$30);
         return var2;
      }
   }

   public void removeCustomXmlInsRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLINSRANGESTART$30, var1);
      }
   }

   public List getCustomXmlInsRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlInsRangeEndList(this);
      }
   }

   public CTMarkup[] getCustomXmlInsRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLINSRANGEEND$32, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlInsRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLINSRANGEEND$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlInsRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLINSRANGEEND$32);
      }
   }

   public void setCustomXmlInsRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLINSRANGEEND$32);
      }
   }

   public void setCustomXmlInsRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLINSRANGEEND$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkup insertNewCustomXmlInsRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLINSRANGEEND$32, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlInsRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLINSRANGEEND$32);
         return var2;
      }
   }

   public void removeCustomXmlInsRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLINSRANGEEND$32, var1);
      }
   }

   public List getCustomXmlDelRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlDelRangeStartList(this);
      }
   }

   public CTTrackChange[] getCustomXmlDelRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLDELRANGESTART$34, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlDelRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLDELRANGESTART$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlDelRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLDELRANGESTART$34);
      }
   }

   public void setCustomXmlDelRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLDELRANGESTART$34);
      }
   }

   public void setCustomXmlDelRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLDELRANGESTART$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTrackChange insertNewCustomXmlDelRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLDELRANGESTART$34, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlDelRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLDELRANGESTART$34);
         return var2;
      }
   }

   public void removeCustomXmlDelRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLDELRANGESTART$34, var1);
      }
   }

   public List getCustomXmlDelRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlDelRangeEndList(this);
      }
   }

   public CTMarkup[] getCustomXmlDelRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLDELRANGEEND$36, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlDelRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLDELRANGEEND$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlDelRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLDELRANGEEND$36);
      }
   }

   public void setCustomXmlDelRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLDELRANGEEND$36);
      }
   }

   public void setCustomXmlDelRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLDELRANGEEND$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkup insertNewCustomXmlDelRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLDELRANGEEND$36, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlDelRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLDELRANGEEND$36);
         return var2;
      }
   }

   public void removeCustomXmlDelRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLDELRANGEEND$36, var1);
      }
   }

   public List getCustomXmlMoveFromRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlMoveFromRangeStartList(this);
      }
   }

   public CTTrackChange[] getCustomXmlMoveFromRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGESTART$38, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlMoveFromRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlMoveFromRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLMOVEFROMRANGESTART$38);
      }
   }

   public void setCustomXmlMoveFromRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVEFROMRANGESTART$38);
      }
   }

   public void setCustomXmlMoveFromRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTrackChange insertNewCustomXmlMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGESTART$38, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlMoveFromRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLMOVEFROMRANGESTART$38);
         return var2;
      }
   }

   public void removeCustomXmlMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVEFROMRANGESTART$38, var1);
      }
   }

   public List getCustomXmlMoveFromRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlMoveFromRangeEndList(this);
      }
   }

   public CTMarkup[] getCustomXmlMoveFromRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGEEND$40, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlMoveFromRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlMoveFromRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLMOVEFROMRANGEEND$40);
      }
   }

   public void setCustomXmlMoveFromRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVEFROMRANGEEND$40);
      }
   }

   public void setCustomXmlMoveFromRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkup insertNewCustomXmlMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGEEND$40, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlMoveFromRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLMOVEFROMRANGEEND$40);
         return var2;
      }
   }

   public void removeCustomXmlMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVEFROMRANGEEND$40, var1);
      }
   }

   public List getCustomXmlMoveToRangeStartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlMoveToRangeStartList(this);
      }
   }

   public CTTrackChange[] getCustomXmlMoveToRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLMOVETORANGESTART$42, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlMoveToRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlMoveToRangeStartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLMOVETORANGESTART$42);
      }
   }

   public void setCustomXmlMoveToRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVETORANGESTART$42);
      }
   }

   public void setCustomXmlMoveToRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTrackChange insertNewCustomXmlMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLMOVETORANGESTART$42, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlMoveToRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLMOVETORANGESTART$42);
         return var2;
      }
   }

   public void removeCustomXmlMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVETORANGESTART$42, var1);
      }
   }

   public List getCustomXmlMoveToRangeEndList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlMoveToRangeEndList(this);
      }
   }

   public CTMarkup[] getCustomXmlMoveToRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXMLMOVETORANGEEND$44, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlMoveToRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCustomXmlMoveToRangeEndArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMXMLMOVETORANGEEND$44);
      }
   }

   public void setCustomXmlMoveToRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVETORANGEEND$44);
      }
   }

   public void setCustomXmlMoveToRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkup insertNewCustomXmlMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLMOVETORANGEEND$44, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlMoveToRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLMOVETORANGEEND$44);
         return var2;
      }
   }

   public void removeCustomXmlMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVETORANGEEND$44, var1);
      }
   }

   public List getInsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InsList(this);
      }
   }

   public CTRunTrackChange[] getInsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INS$46, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getInsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(INS$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INS$46);
      }
   }

   public void setInsArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INS$46);
      }
   }

   public void setInsArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(INS$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRunTrackChange insertNewIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(INS$46, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(INS$46);
         return var2;
      }
   }

   public void removeIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INS$46, var1);
      }
   }

   public List getDelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DelList(this);
      }
   }

   public CTRunTrackChange[] getDelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEL$48, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getDelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(DEL$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEL$48);
      }
   }

   public void setDelArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEL$48);
      }
   }

   public void setDelArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(DEL$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRunTrackChange insertNewDel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(DEL$48, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(DEL$48);
         return var2;
      }
   }

   public void removeDel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEL$48, var1);
      }
   }

   public List getMoveFromList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveFromList(this);
      }
   }

   public CTRunTrackChange[] getMoveFromArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVEFROM$50, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getMoveFromArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(MOVEFROM$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveFromArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVEFROM$50);
      }
   }

   public void setMoveFromArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROM$50);
      }
   }

   public void setMoveFromArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(MOVEFROM$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRunTrackChange insertNewMoveFrom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(MOVEFROM$50, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(MOVEFROM$50);
         return var2;
      }
   }

   public void removeMoveFrom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROM$50, var1);
      }
   }

   public List getMoveToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveToList(this);
      }
   }

   public CTRunTrackChange[] getMoveToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVETO$52, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getMoveToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(MOVETO$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVETO$52);
      }
   }

   public void setMoveToArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETO$52);
      }
   }

   public void setMoveToArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(MOVETO$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRunTrackChange insertNewMoveTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(MOVETO$52, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(MOVETO$52);
         return var2;
      }
   }

   public void removeMoveTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETO$52, var1);
      }
   }

   public List getOMathParaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OMathParaList(this);
      }
   }

   public CTOMathPara[] getOMathParaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OMATHPARA$54, var2);
         CTOMathPara[] var3 = new CTOMathPara[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOMathPara getOMathParaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var3 = null;
         var3 = (CTOMathPara)this.get_store().find_element_user(OMATHPARA$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOMathParaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OMATHPARA$54);
      }
   }

   public void setOMathParaArray(CTOMathPara[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OMATHPARA$54);
      }
   }

   public void setOMathParaArray(int var1, CTOMathPara var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var4 = null;
         var4 = (CTOMathPara)this.get_store().find_element_user(OMATHPARA$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOMathPara insertNewOMathPara(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var3 = null;
         var3 = (CTOMathPara)this.get_store().insert_element_user(OMATHPARA$54, var1);
         return var3;
      }
   }

   public CTOMathPara addNewOMathPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var2 = null;
         var2 = (CTOMathPara)this.get_store().add_element_user(OMATHPARA$54);
         return var2;
      }
   }

   public void removeOMathPara(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OMATHPARA$54, var1);
      }
   }

   public List getOMathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OMathList(this);
      }
   }

   public CTOMath[] getOMathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OMATH$56, var2);
         CTOMath[] var3 = new CTOMath[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOMath getOMathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var3 = null;
         var3 = (CTOMath)this.get_store().find_element_user(OMATH$56, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOMathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OMATH$56);
      }
   }

   public void setOMathArray(CTOMath[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OMATH$56);
      }
   }

   public void setOMathArray(int var1, CTOMath var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var4 = null;
         var4 = (CTOMath)this.get_store().find_element_user(OMATH$56, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOMath insertNewOMath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var3 = null;
         var3 = (CTOMath)this.get_store().insert_element_user(OMATH$56, var1);
         return var3;
      }
   }

   public CTOMath addNewOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var2 = null;
         var2 = (CTOMath)this.get_store().add_element_user(OMATH$56);
         return var2;
      }
   }

   public void removeOMath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OMATH$56, var1);
      }
   }

   public List getAccList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AccList(this);
      }
   }

   public CTAcc[] getAccArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACC$58, var2);
         CTAcc[] var3 = new CTAcc[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAcc getAccArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAcc var3 = null;
         var3 = (CTAcc)this.get_store().find_element_user(ACC$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAccArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ACC$58);
      }
   }

   public void setAccArray(CTAcc[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACC$58);
      }
   }

   public void setAccArray(int var1, CTAcc var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAcc var4 = null;
         var4 = (CTAcc)this.get_store().find_element_user(ACC$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAcc insertNewAcc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAcc var3 = null;
         var3 = (CTAcc)this.get_store().insert_element_user(ACC$58, var1);
         return var3;
      }
   }

   public CTAcc addNewAcc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAcc var2 = null;
         var2 = (CTAcc)this.get_store().add_element_user(ACC$58);
         return var2;
      }
   }

   public void removeAcc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ACC$58, var1);
      }
   }

   public List getBarList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BarList(this);
      }
   }

   public CTBar[] getBarArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BAR$60, var2);
         CTBar[] var3 = new CTBar[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBar getBarArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar var3 = null;
         var3 = (CTBar)this.get_store().find_element_user(BAR$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBarArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAR$60);
      }
   }

   public void setBarArray(CTBar[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BAR$60);
      }
   }

   public void setBarArray(int var1, CTBar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar var4 = null;
         var4 = (CTBar)this.get_store().find_element_user(BAR$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBar insertNewBar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar var3 = null;
         var3 = (CTBar)this.get_store().insert_element_user(BAR$60, var1);
         return var3;
      }
   }

   public CTBar addNewBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar var2 = null;
         var2 = (CTBar)this.get_store().add_element_user(BAR$60);
         return var2;
      }
   }

   public void removeBar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAR$60, var1);
      }
   }

   public List getBoxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BoxList(this);
      }
   }

   public CTBox[] getBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BOX$62, var2);
         CTBox[] var3 = new CTBox[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBox getBoxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBox var3 = null;
         var3 = (CTBox)this.get_store().find_element_user(BOX$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOX$62);
      }
   }

   public void setBoxArray(CTBox[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOX$62);
      }
   }

   public void setBoxArray(int var1, CTBox var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBox var4 = null;
         var4 = (CTBox)this.get_store().find_element_user(BOX$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBox insertNewBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBox var3 = null;
         var3 = (CTBox)this.get_store().insert_element_user(BOX$62, var1);
         return var3;
      }
   }

   public CTBox addNewBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBox var2 = null;
         var2 = (CTBox)this.get_store().add_element_user(BOX$62);
         return var2;
      }
   }

   public void removeBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOX$62, var1);
      }
   }

   public List getBorderBoxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BorderBoxList(this);
      }
   }

   public CTBorderBox[] getBorderBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BORDERBOX$64, var2);
         CTBorderBox[] var3 = new CTBorderBox[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBorderBox getBorderBoxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderBox var3 = null;
         var3 = (CTBorderBox)this.get_store().find_element_user(BORDERBOX$64, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBorderBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERBOX$64);
      }
   }

   public void setBorderBoxArray(CTBorderBox[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BORDERBOX$64);
      }
   }

   public void setBorderBoxArray(int var1, CTBorderBox var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderBox var4 = null;
         var4 = (CTBorderBox)this.get_store().find_element_user(BORDERBOX$64, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBorderBox insertNewBorderBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderBox var3 = null;
         var3 = (CTBorderBox)this.get_store().insert_element_user(BORDERBOX$64, var1);
         return var3;
      }
   }

   public CTBorderBox addNewBorderBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderBox var2 = null;
         var2 = (CTBorderBox)this.get_store().add_element_user(BORDERBOX$64);
         return var2;
      }
   }

   public void removeBorderBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERBOX$64, var1);
      }
   }

   public List getDList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DList(this);
      }
   }

   public CTD[] getDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(D$66, var2);
         CTD[] var3 = new CTD[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTD getDArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTD var3 = null;
         var3 = (CTD)this.get_store().find_element_user(D$66, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(D$66);
      }
   }

   public void setDArray(CTD[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, D$66);
      }
   }

   public void setDArray(int var1, CTD var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTD var4 = null;
         var4 = (CTD)this.get_store().find_element_user(D$66, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTD insertNewD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTD var3 = null;
         var3 = (CTD)this.get_store().insert_element_user(D$66, var1);
         return var3;
      }
   }

   public CTD addNewD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTD var2 = null;
         var2 = (CTD)this.get_store().add_element_user(D$66);
         return var2;
      }
   }

   public void removeD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(D$66, var1);
      }
   }

   public List getEqArrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EqArrList(this);
      }
   }

   public CTEqArr[] getEqArrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EQARR$68, var2);
         CTEqArr[] var3 = new CTEqArr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEqArr getEqArrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEqArr var3 = null;
         var3 = (CTEqArr)this.get_store().find_element_user(EQARR$68, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEqArrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EQARR$68);
      }
   }

   public void setEqArrArray(CTEqArr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EQARR$68);
      }
   }

   public void setEqArrArray(int var1, CTEqArr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEqArr var4 = null;
         var4 = (CTEqArr)this.get_store().find_element_user(EQARR$68, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEqArr insertNewEqArr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEqArr var3 = null;
         var3 = (CTEqArr)this.get_store().insert_element_user(EQARR$68, var1);
         return var3;
      }
   }

   public CTEqArr addNewEqArr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEqArr var2 = null;
         var2 = (CTEqArr)this.get_store().add_element_user(EQARR$68);
         return var2;
      }
   }

   public void removeEqArr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EQARR$68, var1);
      }
   }

   public List getFList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FList(this);
      }
   }

   public CTF[] getFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(F$70, var2);
         CTF[] var3 = new CTF[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTF getFArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var3 = null;
         var3 = (CTF)this.get_store().find_element_user(F$70, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(F$70);
      }
   }

   public void setFArray(CTF[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, F$70);
      }
   }

   public void setFArray(int var1, CTF var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var4 = null;
         var4 = (CTF)this.get_store().find_element_user(F$70, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTF insertNewF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var3 = null;
         var3 = (CTF)this.get_store().insert_element_user(F$70, var1);
         return var3;
      }
   }

   public CTF addNewF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var2 = null;
         var2 = (CTF)this.get_store().add_element_user(F$70);
         return var2;
      }
   }

   public void removeF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(F$70, var1);
      }
   }

   public List getFuncList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FuncList(this);
      }
   }

   public CTFunc[] getFuncArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FUNC$72, var2);
         CTFunc[] var3 = new CTFunc[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFunc getFuncArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunc var3 = null;
         var3 = (CTFunc)this.get_store().find_element_user(FUNC$72, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFuncArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FUNC$72);
      }
   }

   public void setFuncArray(CTFunc[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FUNC$72);
      }
   }

   public void setFuncArray(int var1, CTFunc var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunc var4 = null;
         var4 = (CTFunc)this.get_store().find_element_user(FUNC$72, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFunc insertNewFunc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunc var3 = null;
         var3 = (CTFunc)this.get_store().insert_element_user(FUNC$72, var1);
         return var3;
      }
   }

   public CTFunc addNewFunc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunc var2 = null;
         var2 = (CTFunc)this.get_store().add_element_user(FUNC$72);
         return var2;
      }
   }

   public void removeFunc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FUNC$72, var1);
      }
   }

   public List getGroupChrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GroupChrList(this);
      }
   }

   public CTGroupChr[] getGroupChrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GROUPCHR$74, var2);
         CTGroupChr[] var3 = new CTGroupChr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGroupChr getGroupChrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupChr var3 = null;
         var3 = (CTGroupChr)this.get_store().find_element_user(GROUPCHR$74, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGroupChrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GROUPCHR$74);
      }
   }

   public void setGroupChrArray(CTGroupChr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GROUPCHR$74);
      }
   }

   public void setGroupChrArray(int var1, CTGroupChr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupChr var4 = null;
         var4 = (CTGroupChr)this.get_store().find_element_user(GROUPCHR$74, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGroupChr insertNewGroupChr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupChr var3 = null;
         var3 = (CTGroupChr)this.get_store().insert_element_user(GROUPCHR$74, var1);
         return var3;
      }
   }

   public CTGroupChr addNewGroupChr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupChr var2 = null;
         var2 = (CTGroupChr)this.get_store().add_element_user(GROUPCHR$74);
         return var2;
      }
   }

   public void removeGroupChr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GROUPCHR$74, var1);
      }
   }

   public List getLimLowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LimLowList(this);
      }
   }

   public CTLimLow[] getLimLowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LIMLOW$76, var2);
         CTLimLow[] var3 = new CTLimLow[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLimLow getLimLowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimLow var3 = null;
         var3 = (CTLimLow)this.get_store().find_element_user(LIMLOW$76, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLimLowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LIMLOW$76);
      }
   }

   public void setLimLowArray(CTLimLow[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LIMLOW$76);
      }
   }

   public void setLimLowArray(int var1, CTLimLow var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimLow var4 = null;
         var4 = (CTLimLow)this.get_store().find_element_user(LIMLOW$76, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLimLow insertNewLimLow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimLow var3 = null;
         var3 = (CTLimLow)this.get_store().insert_element_user(LIMLOW$76, var1);
         return var3;
      }
   }

   public CTLimLow addNewLimLow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimLow var2 = null;
         var2 = (CTLimLow)this.get_store().add_element_user(LIMLOW$76);
         return var2;
      }
   }

   public void removeLimLow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LIMLOW$76, var1);
      }
   }

   public List getLimUppList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LimUppList(this);
      }
   }

   public CTLimUpp[] getLimUppArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LIMUPP$78, var2);
         CTLimUpp[] var3 = new CTLimUpp[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLimUpp getLimUppArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimUpp var3 = null;
         var3 = (CTLimUpp)this.get_store().find_element_user(LIMUPP$78, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLimUppArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LIMUPP$78);
      }
   }

   public void setLimUppArray(CTLimUpp[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LIMUPP$78);
      }
   }

   public void setLimUppArray(int var1, CTLimUpp var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimUpp var4 = null;
         var4 = (CTLimUpp)this.get_store().find_element_user(LIMUPP$78, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLimUpp insertNewLimUpp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimUpp var3 = null;
         var3 = (CTLimUpp)this.get_store().insert_element_user(LIMUPP$78, var1);
         return var3;
      }
   }

   public CTLimUpp addNewLimUpp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLimUpp var2 = null;
         var2 = (CTLimUpp)this.get_store().add_element_user(LIMUPP$78);
         return var2;
      }
   }

   public void removeLimUpp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LIMUPP$78, var1);
      }
   }

   public List getMList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MList(this);
      }
   }

   public CTM[] getMArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(M$80, var2);
         CTM[] var3 = new CTM[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTM getMArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTM var3 = null;
         var3 = (CTM)this.get_store().find_element_user(M$80, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(M$80);
      }
   }

   public void setMArray(CTM[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, M$80);
      }
   }

   public void setMArray(int var1, CTM var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTM var4 = null;
         var4 = (CTM)this.get_store().find_element_user(M$80, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTM insertNewM(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTM var3 = null;
         var3 = (CTM)this.get_store().insert_element_user(M$80, var1);
         return var3;
      }
   }

   public CTM addNewM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTM var2 = null;
         var2 = (CTM)this.get_store().add_element_user(M$80);
         return var2;
      }
   }

   public void removeM(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(M$80, var1);
      }
   }

   public List getNaryList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NaryList(this);
      }
   }

   public CTNary[] getNaryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NARY$82, var2);
         CTNary[] var3 = new CTNary[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNary getNaryArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNary var3 = null;
         var3 = (CTNary)this.get_store().find_element_user(NARY$82, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNaryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NARY$82);
      }
   }

   public void setNaryArray(CTNary[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NARY$82);
      }
   }

   public void setNaryArray(int var1, CTNary var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNary var4 = null;
         var4 = (CTNary)this.get_store().find_element_user(NARY$82, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNary insertNewNary(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNary var3 = null;
         var3 = (CTNary)this.get_store().insert_element_user(NARY$82, var1);
         return var3;
      }
   }

   public CTNary addNewNary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNary var2 = null;
         var2 = (CTNary)this.get_store().add_element_user(NARY$82);
         return var2;
      }
   }

   public void removeNary(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NARY$82, var1);
      }
   }

   public List getPhantList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PhantList(this);
      }
   }

   public CTPhant[] getPhantArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PHANT$84, var2);
         CTPhant[] var3 = new CTPhant[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPhant getPhantArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhant var3 = null;
         var3 = (CTPhant)this.get_store().find_element_user(PHANT$84, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPhantArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PHANT$84);
      }
   }

   public void setPhantArray(CTPhant[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PHANT$84);
      }
   }

   public void setPhantArray(int var1, CTPhant var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhant var4 = null;
         var4 = (CTPhant)this.get_store().find_element_user(PHANT$84, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPhant insertNewPhant(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhant var3 = null;
         var3 = (CTPhant)this.get_store().insert_element_user(PHANT$84, var1);
         return var3;
      }
   }

   public CTPhant addNewPhant() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhant var2 = null;
         var2 = (CTPhant)this.get_store().add_element_user(PHANT$84);
         return var2;
      }
   }

   public void removePhant(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PHANT$84, var1);
      }
   }

   public List getRadList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RadList(this);
      }
   }

   public CTRad[] getRadArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RAD$86, var2);
         CTRad[] var3 = new CTRad[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRad getRadArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRad var3 = null;
         var3 = (CTRad)this.get_store().find_element_user(RAD$86, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRadArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RAD$86);
      }
   }

   public void setRadArray(CTRad[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RAD$86);
      }
   }

   public void setRadArray(int var1, CTRad var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRad var4 = null;
         var4 = (CTRad)this.get_store().find_element_user(RAD$86, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRad insertNewRad(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRad var3 = null;
         var3 = (CTRad)this.get_store().insert_element_user(RAD$86, var1);
         return var3;
      }
   }

   public CTRad addNewRad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRad var2 = null;
         var2 = (CTRad)this.get_store().add_element_user(RAD$86);
         return var2;
      }
   }

   public void removeRad(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RAD$86, var1);
      }
   }

   public List getSPreList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SPreList(this);
      }
   }

   public CTSPre[] getSPreArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SPRE$88, var2);
         CTSPre[] var3 = new CTSPre[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSPre getSPreArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSPre var3 = null;
         var3 = (CTSPre)this.get_store().find_element_user(SPRE$88, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSPreArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPRE$88);
      }
   }

   public void setSPreArray(CTSPre[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SPRE$88);
      }
   }

   public void setSPreArray(int var1, CTSPre var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSPre var4 = null;
         var4 = (CTSPre)this.get_store().find_element_user(SPRE$88, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSPre insertNewSPre(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSPre var3 = null;
         var3 = (CTSPre)this.get_store().insert_element_user(SPRE$88, var1);
         return var3;
      }
   }

   public CTSPre addNewSPre() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSPre var2 = null;
         var2 = (CTSPre)this.get_store().add_element_user(SPRE$88);
         return var2;
      }
   }

   public void removeSPre(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPRE$88, var1);
      }
   }

   public List getSSubList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SSubList(this);
      }
   }

   public CTSSub[] getSSubArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SSUB$90, var2);
         CTSSub[] var3 = new CTSSub[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSSub getSSubArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSub var3 = null;
         var3 = (CTSSub)this.get_store().find_element_user(SSUB$90, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSSubArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SSUB$90);
      }
   }

   public void setSSubArray(CTSSub[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SSUB$90);
      }
   }

   public void setSSubArray(int var1, CTSSub var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSub var4 = null;
         var4 = (CTSSub)this.get_store().find_element_user(SSUB$90, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSSub insertNewSSub(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSub var3 = null;
         var3 = (CTSSub)this.get_store().insert_element_user(SSUB$90, var1);
         return var3;
      }
   }

   public CTSSub addNewSSub() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSub var2 = null;
         var2 = (CTSSub)this.get_store().add_element_user(SSUB$90);
         return var2;
      }
   }

   public void removeSSub(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SSUB$90, var1);
      }
   }

   public List getSSubSupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SSubSupList(this);
      }
   }

   public CTSSubSup[] getSSubSupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SSUBSUP$92, var2);
         CTSSubSup[] var3 = new CTSSubSup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSSubSup getSSubSupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSubSup var3 = null;
         var3 = (CTSSubSup)this.get_store().find_element_user(SSUBSUP$92, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSSubSupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SSUBSUP$92);
      }
   }

   public void setSSubSupArray(CTSSubSup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SSUBSUP$92);
      }
   }

   public void setSSubSupArray(int var1, CTSSubSup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSubSup var4 = null;
         var4 = (CTSSubSup)this.get_store().find_element_user(SSUBSUP$92, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSSubSup insertNewSSubSup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSubSup var3 = null;
         var3 = (CTSSubSup)this.get_store().insert_element_user(SSUBSUP$92, var1);
         return var3;
      }
   }

   public CTSSubSup addNewSSubSup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSubSup var2 = null;
         var2 = (CTSSubSup)this.get_store().add_element_user(SSUBSUP$92);
         return var2;
      }
   }

   public void removeSSubSup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SSUBSUP$92, var1);
      }
   }

   public List getSSupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SSupList(this);
      }
   }

   public CTSSup[] getSSupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SSUP$94, var2);
         CTSSup[] var3 = new CTSSup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSSup getSSupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSup var3 = null;
         var3 = (CTSSup)this.get_store().find_element_user(SSUP$94, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSSupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SSUP$94);
      }
   }

   public void setSSupArray(CTSSup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SSUP$94);
      }
   }

   public void setSSupArray(int var1, CTSSup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSup var4 = null;
         var4 = (CTSSup)this.get_store().find_element_user(SSUP$94, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSSup insertNewSSup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSup var3 = null;
         var3 = (CTSSup)this.get_store().insert_element_user(SSUP$94, var1);
         return var3;
      }
   }

   public CTSSup addNewSSup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSSup var2 = null;
         var2 = (CTSSup)this.get_store().add_element_user(SSUP$94);
         return var2;
      }
   }

   public void removeSSup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SSUP$94, var1);
      }
   }

   public List getR2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1R2List(this);
      }
   }

   public org.openxmlformats.schemas.officeDocument.x2006.math.CTR[] getR2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R2$96, var2);
         org.openxmlformats.schemas.officeDocument.x2006.math.CTR[] var3 = new org.openxmlformats.schemas.officeDocument.x2006.math.CTR[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public org.openxmlformats.schemas.officeDocument.x2006.math.CTR getR2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         org.openxmlformats.schemas.officeDocument.x2006.math.CTR var3 = null;
         var3 = (org.openxmlformats.schemas.officeDocument.x2006.math.CTR)this.get_store().find_element_user(R2$96, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfR2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R2$96);
      }
   }

   public void setR2Array(org.openxmlformats.schemas.officeDocument.x2006.math.CTR[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R2$96);
      }
   }

   public void setR2Array(int var1, org.openxmlformats.schemas.officeDocument.x2006.math.CTR var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         org.openxmlformats.schemas.officeDocument.x2006.math.CTR var4 = null;
         var4 = (org.openxmlformats.schemas.officeDocument.x2006.math.CTR)this.get_store().find_element_user(R2$96, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public org.openxmlformats.schemas.officeDocument.x2006.math.CTR insertNewR2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         org.openxmlformats.schemas.officeDocument.x2006.math.CTR var3 = null;
         var3 = (org.openxmlformats.schemas.officeDocument.x2006.math.CTR)this.get_store().insert_element_user(R2$96, var1);
         return var3;
      }
   }

   public org.openxmlformats.schemas.officeDocument.x2006.math.CTR addNewR2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         org.openxmlformats.schemas.officeDocument.x2006.math.CTR var2 = null;
         var2 = (org.openxmlformats.schemas.officeDocument.x2006.math.CTR)this.get_store().add_element_user(R2$96);
         return var2;
      }
   }

   public void removeR2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R2$96, var1);
      }
   }

}
