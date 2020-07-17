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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara;
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
import org.w3c.dom.Node;

public interface CTSdtContentRun extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSdtContentRun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsdtcontentruna0fdtype");


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

   List getFldSimpleList();

   CTSimpleField[] getFldSimpleArray();

   CTSimpleField getFldSimpleArray(int var1);

   int sizeOfFldSimpleArray();

   void setFldSimpleArray(CTSimpleField[] var1);

   void setFldSimpleArray(int var1, CTSimpleField var2);

   CTSimpleField insertNewFldSimple(int var1);

   CTSimpleField addNewFldSimple();

   void removeFldSimple(int var1);

   List getHyperlinkList();

   CTHyperlink[] getHyperlinkArray();

   CTHyperlink getHyperlinkArray(int var1);

   int sizeOfHyperlinkArray();

   void setHyperlinkArray(CTHyperlink[] var1);

   void setHyperlinkArray(int var1, CTHyperlink var2);

   CTHyperlink insertNewHyperlink(int var1);

   CTHyperlink addNewHyperlink();

   void removeHyperlink(int var1);

   List getSubDocList();

   CTRel[] getSubDocArray();

   CTRel getSubDocArray(int var1);

   int sizeOfSubDocArray();

   void setSubDocArray(CTRel[] var1);

   void setSubDocArray(int var1, CTRel var2);

   CTRel insertNewSubDoc(int var1);

   CTRel addNewSubDoc();

   void removeSubDoc(int var1);


   public static final class Factory {

      public static CTSdtContentRun newInstance() {
         return (CTSdtContentRun)POIXMLTypeLoader.newInstance(CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun newInstance(XmlOptions var0) {
         return (CTSdtContentRun)POIXMLTypeLoader.newInstance(CTSdtContentRun.type, var0);
      }

      public static CTSdtContentRun parse(String var0) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(File var0) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(URL var0) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(InputStream var0) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(Reader var0) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(XMLStreamReader var0) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(Node var0) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static CTSdtContentRun parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static CTSdtContentRun parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSdtContentRun)POIXMLTypeLoader.parse(var0, CTSdtContentRun.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtContentRun.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtContentRun.type, var1);
      }

   }
}
