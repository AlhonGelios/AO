package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlCell;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtCell;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentCell;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1BookmarkEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1BookmarkStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CommentRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CommentRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlDelRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlDelRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlInsRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlInsRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlMoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlMoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlMoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1CustomXmlMoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1DelList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1InsList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveFromList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveFromRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveFromRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveToList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveToRangeEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1MoveToRangeStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1OMathList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1OMathParaList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1PermEndList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1PermStartList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1ProofErrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1SdtList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtContentCellImpl.1TcList;

public class CTSdtContentCellImpl extends XmlComplexContentImpl implements CTSdtContentCell {

   private static final QName TC$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tc");
   private static final QName CUSTOMXML$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXml");
   private static final QName SDT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdt");
   private static final QName PROOFERR$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofErr");
   private static final QName PERMSTART$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permStart");
   private static final QName PERMEND$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permEnd");
   private static final QName BOOKMARKSTART$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkStart");
   private static final QName BOOKMARKEND$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkEnd");
   private static final QName MOVEFROMRANGESTART$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeStart");
   private static final QName MOVEFROMRANGEEND$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeEnd");
   private static final QName MOVETORANGESTART$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeStart");
   private static final QName MOVETORANGEEND$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeEnd");
   private static final QName COMMENTRANGESTART$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeStart");
   private static final QName COMMENTRANGEEND$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeEnd");
   private static final QName CUSTOMXMLINSRANGESTART$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeStart");
   private static final QName CUSTOMXMLINSRANGEEND$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeEnd");
   private static final QName CUSTOMXMLDELRANGESTART$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeStart");
   private static final QName CUSTOMXMLDELRANGEEND$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeEnd");
   private static final QName CUSTOMXMLMOVEFROMRANGESTART$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeStart");
   private static final QName CUSTOMXMLMOVEFROMRANGEEND$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeEnd");
   private static final QName CUSTOMXMLMOVETORANGESTART$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeStart");
   private static final QName CUSTOMXMLMOVETORANGEEND$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeEnd");
   private static final QName INS$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
   private static final QName DEL$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
   private static final QName MOVEFROM$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
   private static final QName MOVETO$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
   private static final QName OMATHPARA$52 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathPara");
   private static final QName OMATH$54 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");


   public CTSdtContentCellImpl(SchemaType var1) {
      super(var1);
   }

   public List getTcList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TcList(this);
      }
   }

   public CTTc[] getTcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TC$0, var2);
         CTTc[] var3 = new CTTc[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTc getTcArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTc var3 = null;
         var3 = (CTTc)this.get_store().find_element_user(TC$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TC$0);
      }
   }

   public void setTcArray(CTTc[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TC$0);
      }
   }

   public void setTcArray(int var1, CTTc var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTc var4 = null;
         var4 = (CTTc)this.get_store().find_element_user(TC$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTc insertNewTc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTc var3 = null;
         var3 = (CTTc)this.get_store().insert_element_user(TC$0, var1);
         return var3;
      }
   }

   public CTTc addNewTc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTc var2 = null;
         var2 = (CTTc)this.get_store().add_element_user(TC$0);
         return var2;
      }
   }

   public void removeTc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TC$0, var1);
      }
   }

   public List getCustomXmlList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CustomXmlList(this);
      }
   }

   public CTCustomXmlCell[] getCustomXmlArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUSTOMXML$2, var2);
         CTCustomXmlCell[] var3 = new CTCustomXmlCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCustomXmlCell getCustomXmlArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlCell var3 = null;
         var3 = (CTCustomXmlCell)this.get_store().find_element_user(CUSTOMXML$2, var1);
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
         return this.get_store().count_elements(CUSTOMXML$2);
      }
   }

   public void setCustomXmlArray(CTCustomXmlCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXML$2);
      }
   }

   public void setCustomXmlArray(int var1, CTCustomXmlCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlCell var4 = null;
         var4 = (CTCustomXmlCell)this.get_store().find_element_user(CUSTOMXML$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCustomXmlCell insertNewCustomXml(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlCell var3 = null;
         var3 = (CTCustomXmlCell)this.get_store().insert_element_user(CUSTOMXML$2, var1);
         return var3;
      }
   }

   public CTCustomXmlCell addNewCustomXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomXmlCell var2 = null;
         var2 = (CTCustomXmlCell)this.get_store().add_element_user(CUSTOMXML$2);
         return var2;
      }
   }

   public void removeCustomXml(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXML$2, var1);
      }
   }

   public List getSdtList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SdtList(this);
      }
   }

   public CTSdtCell[] getSdtArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SDT$4, var2);
         CTSdtCell[] var3 = new CTSdtCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtCell getSdtArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtCell var3 = null;
         var3 = (CTSdtCell)this.get_store().find_element_user(SDT$4, var1);
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

   public void setSdtArray(CTSdtCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SDT$4);
      }
   }

   public void setSdtArray(int var1, CTSdtCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtCell var4 = null;
         var4 = (CTSdtCell)this.get_store().find_element_user(SDT$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtCell insertNewSdt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtCell var3 = null;
         var3 = (CTSdtCell)this.get_store().insert_element_user(SDT$4, var1);
         return var3;
      }
   }

   public CTSdtCell addNewSdt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtCell var2 = null;
         var2 = (CTSdtCell)this.get_store().add_element_user(SDT$4);
         return var2;
      }
   }

   public void removeSdt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SDT$4, var1);
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
         this.get_store().find_all_element_users(PROOFERR$6, var2);
         CTProofErr[] var3 = new CTProofErr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTProofErr getProofErrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var3 = null;
         var3 = (CTProofErr)this.get_store().find_element_user(PROOFERR$6, var1);
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
         return this.get_store().count_elements(PROOFERR$6);
      }
   }

   public void setProofErrArray(CTProofErr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PROOFERR$6);
      }
   }

   public void setProofErrArray(int var1, CTProofErr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var4 = null;
         var4 = (CTProofErr)this.get_store().find_element_user(PROOFERR$6, var1);
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
         var3 = (CTProofErr)this.get_store().insert_element_user(PROOFERR$6, var1);
         return var3;
      }
   }

   public CTProofErr addNewProofErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProofErr var2 = null;
         var2 = (CTProofErr)this.get_store().add_element_user(PROOFERR$6);
         return var2;
      }
   }

   public void removeProofErr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROOFERR$6, var1);
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
         this.get_store().find_all_element_users(PERMSTART$8, var2);
         CTPermStart[] var3 = new CTPermStart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPermStart getPermStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var3 = null;
         var3 = (CTPermStart)this.get_store().find_element_user(PERMSTART$8, var1);
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
         return this.get_store().count_elements(PERMSTART$8);
      }
   }

   public void setPermStartArray(CTPermStart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PERMSTART$8);
      }
   }

   public void setPermStartArray(int var1, CTPermStart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var4 = null;
         var4 = (CTPermStart)this.get_store().find_element_user(PERMSTART$8, var1);
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
         var3 = (CTPermStart)this.get_store().insert_element_user(PERMSTART$8, var1);
         return var3;
      }
   }

   public CTPermStart addNewPermStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPermStart var2 = null;
         var2 = (CTPermStart)this.get_store().add_element_user(PERMSTART$8);
         return var2;
      }
   }

   public void removePermStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERMSTART$8, var1);
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
         this.get_store().find_all_element_users(PERMEND$10, var2);
         CTPerm[] var3 = new CTPerm[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPerm getPermEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var3 = null;
         var3 = (CTPerm)this.get_store().find_element_user(PERMEND$10, var1);
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
         return this.get_store().count_elements(PERMEND$10);
      }
   }

   public void setPermEndArray(CTPerm[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PERMEND$10);
      }
   }

   public void setPermEndArray(int var1, CTPerm var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var4 = null;
         var4 = (CTPerm)this.get_store().find_element_user(PERMEND$10, var1);
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
         var3 = (CTPerm)this.get_store().insert_element_user(PERMEND$10, var1);
         return var3;
      }
   }

   public CTPerm addNewPermEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPerm var2 = null;
         var2 = (CTPerm)this.get_store().add_element_user(PERMEND$10);
         return var2;
      }
   }

   public void removePermEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PERMEND$10, var1);
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
         this.get_store().find_all_element_users(BOOKMARKSTART$12, var2);
         CTBookmark[] var3 = new CTBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBookmark getBookmarkStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var3 = null;
         var3 = (CTBookmark)this.get_store().find_element_user(BOOKMARKSTART$12, var1);
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
         return this.get_store().count_elements(BOOKMARKSTART$12);
      }
   }

   public void setBookmarkStartArray(CTBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOKMARKSTART$12);
      }
   }

   public void setBookmarkStartArray(int var1, CTBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var4 = null;
         var4 = (CTBookmark)this.get_store().find_element_user(BOOKMARKSTART$12, var1);
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
         var3 = (CTBookmark)this.get_store().insert_element_user(BOOKMARKSTART$12, var1);
         return var3;
      }
   }

   public CTBookmark addNewBookmarkStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookmark var2 = null;
         var2 = (CTBookmark)this.get_store().add_element_user(BOOKMARKSTART$12);
         return var2;
      }
   }

   public void removeBookmarkStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKMARKSTART$12, var1);
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
         this.get_store().find_all_element_users(BOOKMARKEND$14, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getBookmarkEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(BOOKMARKEND$14, var1);
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
         return this.get_store().count_elements(BOOKMARKEND$14);
      }
   }

   public void setBookmarkEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOKMARKEND$14);
      }
   }

   public void setBookmarkEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(BOOKMARKEND$14, var1);
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
         var3 = (CTMarkupRange)this.get_store().insert_element_user(BOOKMARKEND$14, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewBookmarkEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(BOOKMARKEND$14);
         return var2;
      }
   }

   public void removeBookmarkEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKMARKEND$14, var1);
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
         this.get_store().find_all_element_users(MOVEFROMRANGESTART$16, var2);
         CTMoveBookmark[] var3 = new CTMoveBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMoveBookmark getMoveFromRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().find_element_user(MOVEFROMRANGESTART$16, var1);
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
         return this.get_store().count_elements(MOVEFROMRANGESTART$16);
      }
   }

   public void setMoveFromRangeStartArray(CTMoveBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROMRANGESTART$16);
      }
   }

   public void setMoveFromRangeStartArray(int var1, CTMoveBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var4 = null;
         var4 = (CTMoveBookmark)this.get_store().find_element_user(MOVEFROMRANGESTART$16, var1);
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
         var3 = (CTMoveBookmark)this.get_store().insert_element_user(MOVEFROMRANGESTART$16, var1);
         return var3;
      }
   }

   public CTMoveBookmark addNewMoveFromRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var2 = null;
         var2 = (CTMoveBookmark)this.get_store().add_element_user(MOVEFROMRANGESTART$16);
         return var2;
      }
   }

   public void removeMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROMRANGESTART$16, var1);
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
         this.get_store().find_all_element_users(MOVEFROMRANGEEND$18, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getMoveFromRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(MOVEFROMRANGEEND$18, var1);
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
         return this.get_store().count_elements(MOVEFROMRANGEEND$18);
      }
   }

   public void setMoveFromRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROMRANGEEND$18);
      }
   }

   public void setMoveFromRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(MOVEFROMRANGEEND$18, var1);
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
         var3 = (CTMarkupRange)this.get_store().insert_element_user(MOVEFROMRANGEEND$18, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewMoveFromRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(MOVEFROMRANGEEND$18);
         return var2;
      }
   }

   public void removeMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROMRANGEEND$18, var1);
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
         this.get_store().find_all_element_users(MOVETORANGESTART$20, var2);
         CTMoveBookmark[] var3 = new CTMoveBookmark[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMoveBookmark getMoveToRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var3 = null;
         var3 = (CTMoveBookmark)this.get_store().find_element_user(MOVETORANGESTART$20, var1);
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
         return this.get_store().count_elements(MOVETORANGESTART$20);
      }
   }

   public void setMoveToRangeStartArray(CTMoveBookmark[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETORANGESTART$20);
      }
   }

   public void setMoveToRangeStartArray(int var1, CTMoveBookmark var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var4 = null;
         var4 = (CTMoveBookmark)this.get_store().find_element_user(MOVETORANGESTART$20, var1);
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
         var3 = (CTMoveBookmark)this.get_store().insert_element_user(MOVETORANGESTART$20, var1);
         return var3;
      }
   }

   public CTMoveBookmark addNewMoveToRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMoveBookmark var2 = null;
         var2 = (CTMoveBookmark)this.get_store().add_element_user(MOVETORANGESTART$20);
         return var2;
      }
   }

   public void removeMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETORANGESTART$20, var1);
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
         this.get_store().find_all_element_users(MOVETORANGEEND$22, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getMoveToRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(MOVETORANGEEND$22, var1);
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
         return this.get_store().count_elements(MOVETORANGEEND$22);
      }
   }

   public void setMoveToRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETORANGEEND$22);
      }
   }

   public void setMoveToRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(MOVETORANGEEND$22, var1);
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
         var3 = (CTMarkupRange)this.get_store().insert_element_user(MOVETORANGEEND$22, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewMoveToRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(MOVETORANGEEND$22);
         return var2;
      }
   }

   public void removeMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETORANGEEND$22, var1);
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
         this.get_store().find_all_element_users(COMMENTRANGESTART$24, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getCommentRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGESTART$24, var1);
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
         return this.get_store().count_elements(COMMENTRANGESTART$24);
      }
   }

   public void setCommentRangeStartArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENTRANGESTART$24);
      }
   }

   public void setCommentRangeStartArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGESTART$24, var1);
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
         var3 = (CTMarkupRange)this.get_store().insert_element_user(COMMENTRANGESTART$24, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewCommentRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(COMMENTRANGESTART$24);
         return var2;
      }
   }

   public void removeCommentRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENTRANGESTART$24, var1);
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
         this.get_store().find_all_element_users(COMMENTRANGEEND$26, var2);
         CTMarkupRange[] var3 = new CTMarkupRange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkupRange getCommentRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var3 = null;
         var3 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGEEND$26, var1);
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
         return this.get_store().count_elements(COMMENTRANGEEND$26);
      }
   }

   public void setCommentRangeEndArray(CTMarkupRange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENTRANGEEND$26);
      }
   }

   public void setCommentRangeEndArray(int var1, CTMarkupRange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var4 = null;
         var4 = (CTMarkupRange)this.get_store().find_element_user(COMMENTRANGEEND$26, var1);
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
         var3 = (CTMarkupRange)this.get_store().insert_element_user(COMMENTRANGEEND$26, var1);
         return var3;
      }
   }

   public CTMarkupRange addNewCommentRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkupRange var2 = null;
         var2 = (CTMarkupRange)this.get_store().add_element_user(COMMENTRANGEEND$26);
         return var2;
      }
   }

   public void removeCommentRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENTRANGEEND$26, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLINSRANGESTART$28, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlInsRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLINSRANGESTART$28, var1);
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
         return this.get_store().count_elements(CUSTOMXMLINSRANGESTART$28);
      }
   }

   public void setCustomXmlInsRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLINSRANGESTART$28);
      }
   }

   public void setCustomXmlInsRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLINSRANGESTART$28, var1);
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
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLINSRANGESTART$28, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlInsRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLINSRANGESTART$28);
         return var2;
      }
   }

   public void removeCustomXmlInsRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLINSRANGESTART$28, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLINSRANGEEND$30, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlInsRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLINSRANGEEND$30, var1);
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
         return this.get_store().count_elements(CUSTOMXMLINSRANGEEND$30);
      }
   }

   public void setCustomXmlInsRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLINSRANGEEND$30);
      }
   }

   public void setCustomXmlInsRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLINSRANGEEND$30, var1);
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
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLINSRANGEEND$30, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlInsRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLINSRANGEEND$30);
         return var2;
      }
   }

   public void removeCustomXmlInsRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLINSRANGEEND$30, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLDELRANGESTART$32, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlDelRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLDELRANGESTART$32, var1);
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
         return this.get_store().count_elements(CUSTOMXMLDELRANGESTART$32);
      }
   }

   public void setCustomXmlDelRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLDELRANGESTART$32);
      }
   }

   public void setCustomXmlDelRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLDELRANGESTART$32, var1);
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
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLDELRANGESTART$32, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlDelRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLDELRANGESTART$32);
         return var2;
      }
   }

   public void removeCustomXmlDelRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLDELRANGESTART$32, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLDELRANGEEND$34, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlDelRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLDELRANGEEND$34, var1);
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
         return this.get_store().count_elements(CUSTOMXMLDELRANGEEND$34);
      }
   }

   public void setCustomXmlDelRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLDELRANGEEND$34);
      }
   }

   public void setCustomXmlDelRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLDELRANGEEND$34, var1);
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
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLDELRANGEEND$34, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlDelRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLDELRANGEEND$34);
         return var2;
      }
   }

   public void removeCustomXmlDelRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLDELRANGEEND$34, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGESTART$36, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlMoveFromRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$36, var1);
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
         return this.get_store().count_elements(CUSTOMXMLMOVEFROMRANGESTART$36);
      }
   }

   public void setCustomXmlMoveFromRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVEFROMRANGESTART$36);
      }
   }

   public void setCustomXmlMoveFromRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$36, var1);
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
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGESTART$36, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlMoveFromRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLMOVEFROMRANGESTART$36);
         return var2;
      }
   }

   public void removeCustomXmlMoveFromRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVEFROMRANGESTART$36, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGEEND$38, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlMoveFromRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$38, var1);
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
         return this.get_store().count_elements(CUSTOMXMLMOVEFROMRANGEEND$38);
      }
   }

   public void setCustomXmlMoveFromRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVEFROMRANGEEND$38);
      }
   }

   public void setCustomXmlMoveFromRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$38, var1);
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
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGEEND$38, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlMoveFromRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLMOVEFROMRANGEEND$38);
         return var2;
      }
   }

   public void removeCustomXmlMoveFromRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVEFROMRANGEEND$38, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLMOVETORANGESTART$40, var2);
         CTTrackChange[] var3 = new CTTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTrackChange getCustomXmlMoveToRangeStartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$40, var1);
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
         return this.get_store().count_elements(CUSTOMXMLMOVETORANGESTART$40);
      }
   }

   public void setCustomXmlMoveToRangeStartArray(CTTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVETORANGESTART$40);
      }
   }

   public void setCustomXmlMoveToRangeStartArray(int var1, CTTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var4 = null;
         var4 = (CTTrackChange)this.get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$40, var1);
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
         var3 = (CTTrackChange)this.get_store().insert_element_user(CUSTOMXMLMOVETORANGESTART$40, var1);
         return var3;
      }
   }

   public CTTrackChange addNewCustomXmlMoveToRangeStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CUSTOMXMLMOVETORANGESTART$40);
         return var2;
      }
   }

   public void removeCustomXmlMoveToRangeStart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVETORANGESTART$40, var1);
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
         this.get_store().find_all_element_users(CUSTOMXMLMOVETORANGEEND$42, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCustomXmlMoveToRangeEndArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$42, var1);
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
         return this.get_store().count_elements(CUSTOMXMLMOVETORANGEEND$42);
      }
   }

   public void setCustomXmlMoveToRangeEndArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUSTOMXMLMOVETORANGEEND$42);
      }
   }

   public void setCustomXmlMoveToRangeEndArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$42, var1);
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
         var3 = (CTMarkup)this.get_store().insert_element_user(CUSTOMXMLMOVETORANGEEND$42, var1);
         return var3;
      }
   }

   public CTMarkup addNewCustomXmlMoveToRangeEnd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(CUSTOMXMLMOVETORANGEEND$42);
         return var2;
      }
   }

   public void removeCustomXmlMoveToRangeEnd(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMXMLMOVETORANGEEND$42, var1);
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
         this.get_store().find_all_element_users(INS$44, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getInsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(INS$44, var1);
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
         return this.get_store().count_elements(INS$44);
      }
   }

   public void setInsArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INS$44);
      }
   }

   public void setInsArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(INS$44, var1);
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
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(INS$44, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(INS$44);
         return var2;
      }
   }

   public void removeIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INS$44, var1);
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
         this.get_store().find_all_element_users(DEL$46, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getDelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(DEL$46, var1);
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
         return this.get_store().count_elements(DEL$46);
      }
   }

   public void setDelArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEL$46);
      }
   }

   public void setDelArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(DEL$46, var1);
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
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(DEL$46, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(DEL$46);
         return var2;
      }
   }

   public void removeDel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEL$46, var1);
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
         this.get_store().find_all_element_users(MOVEFROM$48, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getMoveFromArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(MOVEFROM$48, var1);
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
         return this.get_store().count_elements(MOVEFROM$48);
      }
   }

   public void setMoveFromArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEFROM$48);
      }
   }

   public void setMoveFromArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(MOVEFROM$48, var1);
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
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(MOVEFROM$48, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(MOVEFROM$48);
         return var2;
      }
   }

   public void removeMoveFrom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROM$48, var1);
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
         this.get_store().find_all_element_users(MOVETO$50, var2);
         CTRunTrackChange[] var3 = new CTRunTrackChange[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRunTrackChange getMoveToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var3 = null;
         var3 = (CTRunTrackChange)this.get_store().find_element_user(MOVETO$50, var1);
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
         return this.get_store().count_elements(MOVETO$50);
      }
   }

   public void setMoveToArray(CTRunTrackChange[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETO$50);
      }
   }

   public void setMoveToArray(int var1, CTRunTrackChange var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var4 = null;
         var4 = (CTRunTrackChange)this.get_store().find_element_user(MOVETO$50, var1);
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
         var3 = (CTRunTrackChange)this.get_store().insert_element_user(MOVETO$50, var1);
         return var3;
      }
   }

   public CTRunTrackChange addNewMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRunTrackChange var2 = null;
         var2 = (CTRunTrackChange)this.get_store().add_element_user(MOVETO$50);
         return var2;
      }
   }

   public void removeMoveTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETO$50, var1);
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
         this.get_store().find_all_element_users(OMATHPARA$52, var2);
         CTOMathPara[] var3 = new CTOMathPara[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOMathPara getOMathParaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var3 = null;
         var3 = (CTOMathPara)this.get_store().find_element_user(OMATHPARA$52, var1);
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
         return this.get_store().count_elements(OMATHPARA$52);
      }
   }

   public void setOMathParaArray(CTOMathPara[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OMATHPARA$52);
      }
   }

   public void setOMathParaArray(int var1, CTOMathPara var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var4 = null;
         var4 = (CTOMathPara)this.get_store().find_element_user(OMATHPARA$52, var1);
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
         var3 = (CTOMathPara)this.get_store().insert_element_user(OMATHPARA$52, var1);
         return var3;
      }
   }

   public CTOMathPara addNewOMathPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMathPara var2 = null;
         var2 = (CTOMathPara)this.get_store().add_element_user(OMATHPARA$52);
         return var2;
      }
   }

   public void removeOMathPara(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OMATHPARA$52, var1);
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
         this.get_store().find_all_element_users(OMATH$54, var2);
         CTOMath[] var3 = new CTOMath[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOMath getOMathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var3 = null;
         var3 = (CTOMath)this.get_store().find_element_user(OMATH$54, var1);
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
         return this.get_store().count_elements(OMATH$54);
      }
   }

   public void setOMathArray(CTOMath[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OMATH$54);
      }
   }

   public void setOMathArray(int var1, CTOMath var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var4 = null;
         var4 = (CTOMath)this.get_store().find_element_user(OMATH$54, var1);
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
         var3 = (CTOMath)this.get_store().insert_element_user(OMATH$54, var1);
         return var3;
      }
   }

   public CTOMath addNewOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOMath var2 = null;
         var2 = (CTOMath)this.get_store().add_element_user(OMATH$54);
         return var2;
      }
   }

   public void removeOMath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OMATH$54, var1);
      }
   }

}
