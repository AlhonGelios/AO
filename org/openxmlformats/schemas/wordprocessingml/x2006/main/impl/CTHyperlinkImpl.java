package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1BookmarkEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1BookmarkStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CommentRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CommentRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlDelRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlDelRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlInsRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlInsRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlMoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlMoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlMoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1CustomXmlMoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1DelList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1FldSimpleList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1HyperlinkList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1InsList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveFromList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveToList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1MoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1OMathList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1OMathParaList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1PermEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1PermStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1ProofErrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1RList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1SdtList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1SmartTagList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHyperlinkImpl.1SubDocList;

public class CTHyperlinkImpl extends XmlComplexContentImpl implements CTHyperlink {

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
   private static final QName FLDSIMPLE$58 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldSimple");
   private static final QName HYPERLINK$60 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hyperlink");
   private static final QName SUBDOC$62 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "subDoc");
   private static final QName TGTFRAME$64 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tgtFrame");
   private static final QName TOOLTIP$66 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tooltip");
   private static final QName DOCLOCATION$68 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docLocation");
   private static final QName HISTORY$70 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "history");
   private static final QName ANCHOR$72 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "anchor");
   private static final QName ID$74 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTHyperlinkImpl(SchemaType var1) {
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

   public List getFldSimpleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FldSimpleList(this);
      }
   }

   public CTSimpleField[] getFldSimpleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FLDSIMPLE$58, var2);
         CTSimpleField[] var3 = new CTSimpleField[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSimpleField getFldSimpleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSimpleField var3 = null;
         var3 = (CTSimpleField)this.get_store().find_element_user(FLDSIMPLE$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFldSimpleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLDSIMPLE$58);
      }
   }

   public void setFldSimpleArray(CTSimpleField[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FLDSIMPLE$58);
      }
   }

   public void setFldSimpleArray(int var1, CTSimpleField var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSimpleField var4 = null;
         var4 = (CTSimpleField)this.get_store().find_element_user(FLDSIMPLE$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSimpleField insertNewFldSimple(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSimpleField var3 = null;
         var3 = (CTSimpleField)this.get_store().insert_element_user(FLDSIMPLE$58, var1);
         return var3;
      }
   }

   public CTSimpleField addNewFldSimple() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSimpleField var2 = null;
         var2 = (CTSimpleField)this.get_store().add_element_user(FLDSIMPLE$58);
         return var2;
      }
   }

   public void removeFldSimple(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLDSIMPLE$58, var1);
      }
   }

   public List getHyperlinkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HyperlinkList(this);
      }
   }

   public CTHyperlink[] getHyperlinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HYPERLINK$60, var2);
         CTHyperlink[] var3 = new CTHyperlink[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHyperlink getHyperlinkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HYPERLINK$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHyperlinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPERLINK$60);
      }
   }

   public void setHyperlinkArray(CTHyperlink[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HYPERLINK$60);
      }
   }

   public void setHyperlinkArray(int var1, CTHyperlink var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var4 = null;
         var4 = (CTHyperlink)this.get_store().find_element_user(HYPERLINK$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHyperlink insertNewHyperlink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().insert_element_user(HYPERLINK$60, var1);
         return var3;
      }
   }

   public CTHyperlink addNewHyperlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HYPERLINK$60);
         return var2;
      }
   }

   public void removeHyperlink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPERLINK$60, var1);
      }
   }

   public List getSubDocList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SubDocList(this);
      }
   }

   public CTRel[] getSubDocArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SUBDOC$62, var2);
         CTRel[] var3 = new CTRel[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRel getSubDocArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().find_element_user(SUBDOC$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSubDocArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUBDOC$62);
      }
   }

   public void setSubDocArray(CTRel[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SUBDOC$62);
      }
   }

   public void setSubDocArray(int var1, CTRel var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var4 = null;
         var4 = (CTRel)this.get_store().find_element_user(SUBDOC$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRel insertNewSubDoc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().insert_element_user(SUBDOC$62, var1);
         return var3;
      }
   }

   public CTRel addNewSubDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().add_element_user(SUBDOC$62);
         return var2;
      }
   }

   public void removeSubDoc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUBDOC$62, var1);
      }
   }

   public String getTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TGTFRAME$64);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(TGTFRAME$64);
         return var2;
      }
   }

   public boolean isSetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TGTFRAME$64) != null;
      }
   }

   public void setTgtFrame(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TGTFRAME$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TGTFRAME$64);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTgtFrame(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(TGTFRAME$64);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(TGTFRAME$64);
         }

         var3.set(var1);
      }
   }

   public void unsetTgtFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TGTFRAME$64);
      }
   }

   public String getTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$66);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(TOOLTIP$66);
         return var2;
      }
   }

   public boolean isSetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOOLTIP$66) != null;
      }
   }

   public void setTooltip(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOOLTIP$66);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTooltip(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(TOOLTIP$66);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(TOOLTIP$66);
         }

         var3.set(var1);
      }
   }

   public void unsetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOOLTIP$66);
      }
   }

   public String getDocLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DOCLOCATION$68);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetDocLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(DOCLOCATION$68);
         return var2;
      }
   }

   public boolean isSetDocLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DOCLOCATION$68) != null;
      }
   }

   public void setDocLocation(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DOCLOCATION$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DOCLOCATION$68);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDocLocation(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(DOCLOCATION$68);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(DOCLOCATION$68);
         }

         var3.set(var1);
      }
   }

   public void unsetDocLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DOCLOCATION$68);
      }
   }

   public STOnOff.Enum getHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HISTORY$70);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(HISTORY$70);
         return var2;
      }
   }

   public boolean isSetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HISTORY$70) != null;
      }
   }

   public void setHistory(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HISTORY$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HISTORY$70);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHistory(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(HISTORY$70);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(HISTORY$70);
         }

         var3.set(var1);
      }
   }

   public void unsetHistory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HISTORY$70);
      }
   }

   public String getAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$72);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(ANCHOR$72);
         return var2;
      }
   }

   public boolean isSetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANCHOR$72) != null;
      }
   }

   public void setAnchor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANCHOR$72);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAnchor(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(ANCHOR$72);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(ANCHOR$72);
         }

         var3.set(var1);
      }
   }

   public void unsetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANCHOR$72);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$74);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$74);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$74) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$74);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$74);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$74);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$74);
      }
   }

}
