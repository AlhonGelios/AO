package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.w3c.dom.Node;

public interface CTRunTrackChange extends CTTrackChange {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRunTrackChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctruntrackchangea458type");


   List getCustomXmlList();

   CTCustomXmlRun[] getCustomXmlArray();

   CTCustomXmlRun getCustomXmlArray(int var1);

   int sizeOfCustomXmlArray();

   void setCustomXmlArray(CTCustomXmlRun[] var1);

   void setCustomXmlArray(int var1, CTCustomXmlRun var2);

   CTCustomXmlRun insertNewCustomXml(int var1);

   CTCustomXmlRun addNewCustomXml();

   void removeCustomXml(int var1);

   List getSmartTagList();

   CTSmartTagRun[] getSmartTagArray();

   CTSmartTagRun getSmartTagArray(int var1);

   int sizeOfSmartTagArray();

   void setSmartTagArray(CTSmartTagRun[] var1);

   void setSmartTagArray(int var1, CTSmartTagRun var2);

   CTSmartTagRun insertNewSmartTag(int var1);

   CTSmartTagRun addNewSmartTag();

   void removeSmartTag(int var1);

   List getSdtList();

   CTSdtRun[] getSdtArray();

   CTSdtRun getSdtArray(int var1);

   int sizeOfSdtArray();

   void setSdtArray(CTSdtRun[] var1);

   void setSdtArray(int var1, CTSdtRun var2);

   CTSdtRun insertNewSdt(int var1);

   CTSdtRun addNewSdt();

   void removeSdt(int var1);

   List getRList();

   CTR[] getRArray();

   CTR getRArray(int var1);

   int sizeOfRArray();

   void setRArray(CTR[] var1);

   void setRArray(int var1, CTR var2);

   CTR insertNewR(int var1);

   CTR addNewR();

   void removeR(int var1);

   List getProofErrList();

   CTProofErr[] getProofErrArray();

   CTProofErr getProofErrArray(int var1);

   int sizeOfProofErrArray();

   void setProofErrArray(CTProofErr[] var1);

   void setProofErrArray(int var1, CTProofErr var2);

   CTProofErr insertNewProofErr(int var1);

   CTProofErr addNewProofErr();

   void removeProofErr(int var1);

   List getPermStartList();

   CTPermStart[] getPermStartArray();

   CTPermStart getPermStartArray(int var1);

   int sizeOfPermStartArray();

   void setPermStartArray(CTPermStart[] var1);

   void setPermStartArray(int var1, CTPermStart var2);

   CTPermStart insertNewPermStart(int var1);

   CTPermStart addNewPermStart();

   void removePermStart(int var1);

   List getPermEndList();

   CTPerm[] getPermEndArray();

   CTPerm getPermEndArray(int var1);

   int sizeOfPermEndArray();

   void setPermEndArray(CTPerm[] var1);

   void setPermEndArray(int var1, CTPerm var2);

   CTPerm insertNewPermEnd(int var1);

   CTPerm addNewPermEnd();

   void removePermEnd(int var1);

   List getBookmarkStartList();

   CTBookmark[] getBookmarkStartArray();

   CTBookmark getBookmarkStartArray(int var1);

   int sizeOfBookmarkStartArray();

   void setBookmarkStartArray(CTBookmark[] var1);

   void setBookmarkStartArray(int var1, CTBookmark var2);

   CTBookmark insertNewBookmarkStart(int var1);

   CTBookmark addNewBookmarkStart();

   void removeBookmarkStart(int var1);

   List getBookmarkEndList();

   CTMarkupRange[] getBookmarkEndArray();

   CTMarkupRange getBookmarkEndArray(int var1);

   int sizeOfBookmarkEndArray();

   void setBookmarkEndArray(CTMarkupRange[] var1);

   void setBookmarkEndArray(int var1, CTMarkupRange var2);

   CTMarkupRange insertNewBookmarkEnd(int var1);

   CTMarkupRange addNewBookmarkEnd();

   void removeBookmarkEnd(int var1);

   List getMoveFromRangeStartList();

   CTMoveBookmark[] getMoveFromRangeStartArray();

   CTMoveBookmark getMoveFromRangeStartArray(int var1);

   int sizeOfMoveFromRangeStartArray();

   void setMoveFromRangeStartArray(CTMoveBookmark[] var1);

   void setMoveFromRangeStartArray(int var1, CTMoveBookmark var2);

   CTMoveBookmark insertNewMoveFromRangeStart(int var1);

   CTMoveBookmark addNewMoveFromRangeStart();

   void removeMoveFromRangeStart(int var1);

   List getMoveFromRangeEndList();

   CTMarkupRange[] getMoveFromRangeEndArray();

   CTMarkupRange getMoveFromRangeEndArray(int var1);

   int sizeOfMoveFromRangeEndArray();

   void setMoveFromRangeEndArray(CTMarkupRange[] var1);

   void setMoveFromRangeEndArray(int var1, CTMarkupRange var2);

   CTMarkupRange insertNewMoveFromRangeEnd(int var1);

   CTMarkupRange addNewMoveFromRangeEnd();

   void removeMoveFromRangeEnd(int var1);

   List getMoveToRangeStartList();

   CTMoveBookmark[] getMoveToRangeStartArray();

   CTMoveBookmark getMoveToRangeStartArray(int var1);

   int sizeOfMoveToRangeStartArray();

   void setMoveToRangeStartArray(CTMoveBookmark[] var1);

   void setMoveToRangeStartArray(int var1, CTMoveBookmark var2);

   CTMoveBookmark insertNewMoveToRangeStart(int var1);

   CTMoveBookmark addNewMoveToRangeStart();

   void removeMoveToRangeStart(int var1);

   List getMoveToRangeEndList();

   CTMarkupRange[] getMoveToRangeEndArray();

   CTMarkupRange getMoveToRangeEndArray(int var1);

   int sizeOfMoveToRangeEndArray();

   void setMoveToRangeEndArray(CTMarkupRange[] var1);

   void setMoveToRangeEndArray(int var1, CTMarkupRange var2);

   CTMarkupRange insertNewMoveToRangeEnd(int var1);

   CTMarkupRange addNewMoveToRangeEnd();

   void removeMoveToRangeEnd(int var1);

   List getCommentRangeStartList();

   CTMarkupRange[] getCommentRangeStartArray();

   CTMarkupRange getCommentRangeStartArray(int var1);

   int sizeOfCommentRangeStartArray();

   void setCommentRangeStartArray(CTMarkupRange[] var1);

   void setCommentRangeStartArray(int var1, CTMarkupRange var2);

   CTMarkupRange insertNewCommentRangeStart(int var1);

   CTMarkupRange addNewCommentRangeStart();

   void removeCommentRangeStart(int var1);

   List getCommentRangeEndList();

   CTMarkupRange[] getCommentRangeEndArray();

   CTMarkupRange getCommentRangeEndArray(int var1);

   int sizeOfCommentRangeEndArray();

   void setCommentRangeEndArray(CTMarkupRange[] var1);

   void setCommentRangeEndArray(int var1, CTMarkupRange var2);

   CTMarkupRange insertNewCommentRangeEnd(int var1);

   CTMarkupRange addNewCommentRangeEnd();

   void removeCommentRangeEnd(int var1);

   List getCustomXmlInsRangeStartList();

   CTTrackChange[] getCustomXmlInsRangeStartArray();

   CTTrackChange getCustomXmlInsRangeStartArray(int var1);

   int sizeOfCustomXmlInsRangeStartArray();

   void setCustomXmlInsRangeStartArray(CTTrackChange[] var1);

   void setCustomXmlInsRangeStartArray(int var1, CTTrackChange var2);

   CTTrackChange insertNewCustomXmlInsRangeStart(int var1);

   CTTrackChange addNewCustomXmlInsRangeStart();

   void removeCustomXmlInsRangeStart(int var1);

   List getCustomXmlInsRangeEndList();

   CTMarkup[] getCustomXmlInsRangeEndArray();

   CTMarkup getCustomXmlInsRangeEndArray(int var1);

   int sizeOfCustomXmlInsRangeEndArray();

   void setCustomXmlInsRangeEndArray(CTMarkup[] var1);

   void setCustomXmlInsRangeEndArray(int var1, CTMarkup var2);

   CTMarkup insertNewCustomXmlInsRangeEnd(int var1);

   CTMarkup addNewCustomXmlInsRangeEnd();

   void removeCustomXmlInsRangeEnd(int var1);

   List getCustomXmlDelRangeStartList();

   CTTrackChange[] getCustomXmlDelRangeStartArray();

   CTTrackChange getCustomXmlDelRangeStartArray(int var1);

   int sizeOfCustomXmlDelRangeStartArray();

   void setCustomXmlDelRangeStartArray(CTTrackChange[] var1);

   void setCustomXmlDelRangeStartArray(int var1, CTTrackChange var2);

   CTTrackChange insertNewCustomXmlDelRangeStart(int var1);

   CTTrackChange addNewCustomXmlDelRangeStart();

   void removeCustomXmlDelRangeStart(int var1);

   List getCustomXmlDelRangeEndList();

   CTMarkup[] getCustomXmlDelRangeEndArray();

   CTMarkup getCustomXmlDelRangeEndArray(int var1);

   int sizeOfCustomXmlDelRangeEndArray();

   void setCustomXmlDelRangeEndArray(CTMarkup[] var1);

   void setCustomXmlDelRangeEndArray(int var1, CTMarkup var2);

   CTMarkup insertNewCustomXmlDelRangeEnd(int var1);

   CTMarkup addNewCustomXmlDelRangeEnd();

   void removeCustomXmlDelRangeEnd(int var1);

   List getCustomXmlMoveFromRangeStartList();

   CTTrackChange[] getCustomXmlMoveFromRangeStartArray();

   CTTrackChange getCustomXmlMoveFromRangeStartArray(int var1);

   int sizeOfCustomXmlMoveFromRangeStartArray();

   void setCustomXmlMoveFromRangeStartArray(CTTrackChange[] var1);

   void setCustomXmlMoveFromRangeStartArray(int var1, CTTrackChange var2);

   CTTrackChange insertNewCustomXmlMoveFromRangeStart(int var1);

   CTTrackChange addNewCustomXmlMoveFromRangeStart();

   void removeCustomXmlMoveFromRangeStart(int var1);

   List getCustomXmlMoveFromRangeEndList();

   CTMarkup[] getCustomXmlMoveFromRangeEndArray();

   CTMarkup getCustomXmlMoveFromRangeEndArray(int var1);

   int sizeOfCustomXmlMoveFromRangeEndArray();

   void setCustomXmlMoveFromRangeEndArray(CTMarkup[] var1);

   void setCustomXmlMoveFromRangeEndArray(int var1, CTMarkup var2);

   CTMarkup insertNewCustomXmlMoveFromRangeEnd(int var1);

   CTMarkup addNewCustomXmlMoveFromRangeEnd();

   void removeCustomXmlMoveFromRangeEnd(int var1);

   List getCustomXmlMoveToRangeStartList();

   CTTrackChange[] getCustomXmlMoveToRangeStartArray();

   CTTrackChange getCustomXmlMoveToRangeStartArray(int var1);

   int sizeOfCustomXmlMoveToRangeStartArray();

   void setCustomXmlMoveToRangeStartArray(CTTrackChange[] var1);

   void setCustomXmlMoveToRangeStartArray(int var1, CTTrackChange var2);

   CTTrackChange insertNewCustomXmlMoveToRangeStart(int var1);

   CTTrackChange addNewCustomXmlMoveToRangeStart();

   void removeCustomXmlMoveToRangeStart(int var1);

   List getCustomXmlMoveToRangeEndList();

   CTMarkup[] getCustomXmlMoveToRangeEndArray();

   CTMarkup getCustomXmlMoveToRangeEndArray(int var1);

   int sizeOfCustomXmlMoveToRangeEndArray();

   void setCustomXmlMoveToRangeEndArray(CTMarkup[] var1);

   void setCustomXmlMoveToRangeEndArray(int var1, CTMarkup var2);

   CTMarkup insertNewCustomXmlMoveToRangeEnd(int var1);

   CTMarkup addNewCustomXmlMoveToRangeEnd();

   void removeCustomXmlMoveToRangeEnd(int var1);

   List getInsList();

   CTRunTrackChange[] getInsArray();

   CTRunTrackChange getInsArray(int var1);

   int sizeOfInsArray();

   void setInsArray(CTRunTrackChange[] var1);

   void setInsArray(int var1, CTRunTrackChange var2);

   CTRunTrackChange insertNewIns(int var1);

   CTRunTrackChange addNewIns();

   void removeIns(int var1);

   List getDelList();

   CTRunTrackChange[] getDelArray();

   CTRunTrackChange getDelArray(int var1);

   int sizeOfDelArray();

   void setDelArray(CTRunTrackChange[] var1);

   void setDelArray(int var1, CTRunTrackChange var2);

   CTRunTrackChange insertNewDel(int var1);

   CTRunTrackChange addNewDel();

   void removeDel(int var1);

   List getMoveFromList();

   CTRunTrackChange[] getMoveFromArray();

   CTRunTrackChange getMoveFromArray(int var1);

   int sizeOfMoveFromArray();

   void setMoveFromArray(CTRunTrackChange[] var1);

   void setMoveFromArray(int var1, CTRunTrackChange var2);

   CTRunTrackChange insertNewMoveFrom(int var1);

   CTRunTrackChange addNewMoveFrom();

   void removeMoveFrom(int var1);

   List getMoveToList();

   CTRunTrackChange[] getMoveToArray();

   CTRunTrackChange getMoveToArray(int var1);

   int sizeOfMoveToArray();

   void setMoveToArray(CTRunTrackChange[] var1);

   void setMoveToArray(int var1, CTRunTrackChange var2);

   CTRunTrackChange insertNewMoveTo(int var1);

   CTRunTrackChange addNewMoveTo();

   void removeMoveTo(int var1);

   List getOMathParaList();

   CTOMathPara[] getOMathParaArray();

   CTOMathPara getOMathParaArray(int var1);

   int sizeOfOMathParaArray();

   void setOMathParaArray(CTOMathPara[] var1);

   void setOMathParaArray(int var1, CTOMathPara var2);

   CTOMathPara insertNewOMathPara(int var1);

   CTOMathPara addNewOMathPara();

   void removeOMathPara(int var1);

   List getOMathList();

   CTOMath[] getOMathArray();

   CTOMath getOMathArray(int var1);

   int sizeOfOMathArray();

   void setOMathArray(CTOMath[] var1);

   void setOMathArray(int var1, CTOMath var2);

   CTOMath insertNewOMath(int var1);

   CTOMath addNewOMath();

   void removeOMath(int var1);

   List getAccList();

   CTAcc[] getAccArray();

   CTAcc getAccArray(int var1);

   int sizeOfAccArray();

   void setAccArray(CTAcc[] var1);

   void setAccArray(int var1, CTAcc var2);

   CTAcc insertNewAcc(int var1);

   CTAcc addNewAcc();

   void removeAcc(int var1);

   List getBarList();

   CTBar[] getBarArray();

   CTBar getBarArray(int var1);

   int sizeOfBarArray();

   void setBarArray(CTBar[] var1);

   void setBarArray(int var1, CTBar var2);

   CTBar insertNewBar(int var1);

   CTBar addNewBar();

   void removeBar(int var1);

   List getBoxList();

   CTBox[] getBoxArray();

   CTBox getBoxArray(int var1);

   int sizeOfBoxArray();

   void setBoxArray(CTBox[] var1);

   void setBoxArray(int var1, CTBox var2);

   CTBox insertNewBox(int var1);

   CTBox addNewBox();

   void removeBox(int var1);

   List getBorderBoxList();

   CTBorderBox[] getBorderBoxArray();

   CTBorderBox getBorderBoxArray(int var1);

   int sizeOfBorderBoxArray();

   void setBorderBoxArray(CTBorderBox[] var1);

   void setBorderBoxArray(int var1, CTBorderBox var2);

   CTBorderBox insertNewBorderBox(int var1);

   CTBorderBox addNewBorderBox();

   void removeBorderBox(int var1);

   List getDList();

   CTD[] getDArray();

   CTD getDArray(int var1);

   int sizeOfDArray();

   void setDArray(CTD[] var1);

   void setDArray(int var1, CTD var2);

   CTD insertNewD(int var1);

   CTD addNewD();

   void removeD(int var1);

   List getEqArrList();

   CTEqArr[] getEqArrArray();

   CTEqArr getEqArrArray(int var1);

   int sizeOfEqArrArray();

   void setEqArrArray(CTEqArr[] var1);

   void setEqArrArray(int var1, CTEqArr var2);

   CTEqArr insertNewEqArr(int var1);

   CTEqArr addNewEqArr();

   void removeEqArr(int var1);

   List getFList();

   CTF[] getFArray();

   CTF getFArray(int var1);

   int sizeOfFArray();

   void setFArray(CTF[] var1);

   void setFArray(int var1, CTF var2);

   CTF insertNewF(int var1);

   CTF addNewF();

   void removeF(int var1);

   List getFuncList();

   CTFunc[] getFuncArray();

   CTFunc getFuncArray(int var1);

   int sizeOfFuncArray();

   void setFuncArray(CTFunc[] var1);

   void setFuncArray(int var1, CTFunc var2);

   CTFunc insertNewFunc(int var1);

   CTFunc addNewFunc();

   void removeFunc(int var1);

   List getGroupChrList();

   CTGroupChr[] getGroupChrArray();

   CTGroupChr getGroupChrArray(int var1);

   int sizeOfGroupChrArray();

   void setGroupChrArray(CTGroupChr[] var1);

   void setGroupChrArray(int var1, CTGroupChr var2);

   CTGroupChr insertNewGroupChr(int var1);

   CTGroupChr addNewGroupChr();

   void removeGroupChr(int var1);

   List getLimLowList();

   CTLimLow[] getLimLowArray();

   CTLimLow getLimLowArray(int var1);

   int sizeOfLimLowArray();

   void setLimLowArray(CTLimLow[] var1);

   void setLimLowArray(int var1, CTLimLow var2);

   CTLimLow insertNewLimLow(int var1);

   CTLimLow addNewLimLow();

   void removeLimLow(int var1);

   List getLimUppList();

   CTLimUpp[] getLimUppArray();

   CTLimUpp getLimUppArray(int var1);

   int sizeOfLimUppArray();

   void setLimUppArray(CTLimUpp[] var1);

   void setLimUppArray(int var1, CTLimUpp var2);

   CTLimUpp insertNewLimUpp(int var1);

   CTLimUpp addNewLimUpp();

   void removeLimUpp(int var1);

   List getMList();

   CTM[] getMArray();

   CTM getMArray(int var1);

   int sizeOfMArray();

   void setMArray(CTM[] var1);

   void setMArray(int var1, CTM var2);

   CTM insertNewM(int var1);

   CTM addNewM();

   void removeM(int var1);

   List getNaryList();

   CTNary[] getNaryArray();

   CTNary getNaryArray(int var1);

   int sizeOfNaryArray();

   void setNaryArray(CTNary[] var1);

   void setNaryArray(int var1, CTNary var2);

   CTNary insertNewNary(int var1);

   CTNary addNewNary();

   void removeNary(int var1);

   List getPhantList();

   CTPhant[] getPhantArray();

   CTPhant getPhantArray(int var1);

   int sizeOfPhantArray();

   void setPhantArray(CTPhant[] var1);

   void setPhantArray(int var1, CTPhant var2);

   CTPhant insertNewPhant(int var1);

   CTPhant addNewPhant();

   void removePhant(int var1);

   List getRadList();

   CTRad[] getRadArray();

   CTRad getRadArray(int var1);

   int sizeOfRadArray();

   void setRadArray(CTRad[] var1);

   void setRadArray(int var1, CTRad var2);

   CTRad insertNewRad(int var1);

   CTRad addNewRad();

   void removeRad(int var1);

   List getSPreList();

   CTSPre[] getSPreArray();

   CTSPre getSPreArray(int var1);

   int sizeOfSPreArray();

   void setSPreArray(CTSPre[] var1);

   void setSPreArray(int var1, CTSPre var2);

   CTSPre insertNewSPre(int var1);

   CTSPre addNewSPre();

   void removeSPre(int var1);

   List getSSubList();

   CTSSub[] getSSubArray();

   CTSSub getSSubArray(int var1);

   int sizeOfSSubArray();

   void setSSubArray(CTSSub[] var1);

   void setSSubArray(int var1, CTSSub var2);

   CTSSub insertNewSSub(int var1);

   CTSSub addNewSSub();

   void removeSSub(int var1);

   List getSSubSupList();

   CTSSubSup[] getSSubSupArray();

   CTSSubSup getSSubSupArray(int var1);

   int sizeOfSSubSupArray();

   void setSSubSupArray(CTSSubSup[] var1);

   void setSSubSupArray(int var1, CTSSubSup var2);

   CTSSubSup insertNewSSubSup(int var1);

   CTSSubSup addNewSSubSup();

   void removeSSubSup(int var1);

   List getSSupList();

   CTSSup[] getSSupArray();

   CTSSup getSSupArray(int var1);

   int sizeOfSSupArray();

   void setSSupArray(CTSSup[] var1);

   void setSSupArray(int var1, CTSSup var2);

   CTSSup insertNewSSup(int var1);

   CTSSup addNewSSup();

   void removeSSup(int var1);

   List getR2List();

   org.openxmlformats.schemas.officeDocument.x2006.math.CTR[] getR2Array();

   org.openxmlformats.schemas.officeDocument.x2006.math.CTR getR2Array(int var1);

   int sizeOfR2Array();

   void setR2Array(org.openxmlformats.schemas.officeDocument.x2006.math.CTR[] var1);

   void setR2Array(int var1, org.openxmlformats.schemas.officeDocument.x2006.math.CTR var2);

   org.openxmlformats.schemas.officeDocument.x2006.math.CTR insertNewR2(int var1);

   org.openxmlformats.schemas.officeDocument.x2006.math.CTR addNewR2();

   void removeR2(int var1);


   public static final class Factory {

      public static CTRunTrackChange newInstance() {
         return (CTRunTrackChange)POIXMLTypeLoader.newInstance(CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange newInstance(XmlOptions var0) {
         return (CTRunTrackChange)POIXMLTypeLoader.newInstance(CTRunTrackChange.type, var0);
      }

      public static CTRunTrackChange parse(String var0) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(File var0) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(URL var0) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(InputStream var0) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(Reader var0) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(XMLStreamReader var0) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(Node var0) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static CTRunTrackChange parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static CTRunTrackChange parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRunTrackChange)POIXMLTypeLoader.parse(var0, CTRunTrackChange.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRunTrackChange.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRunTrackChange.type, var1);
      }

   }
}
