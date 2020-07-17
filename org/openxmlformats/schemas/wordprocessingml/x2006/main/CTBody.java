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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunk;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.w3c.dom.Node;

public interface CTBody extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBody.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbody0f06type");


   List getCustomXmlList();

   CTCustomXmlBlock[] getCustomXmlArray();

   CTCustomXmlBlock getCustomXmlArray(int var1);

   int sizeOfCustomXmlArray();

   void setCustomXmlArray(CTCustomXmlBlock[] var1);

   void setCustomXmlArray(int var1, CTCustomXmlBlock var2);

   CTCustomXmlBlock insertNewCustomXml(int var1);

   CTCustomXmlBlock addNewCustomXml();

   void removeCustomXml(int var1);

   List getSdtList();

   CTSdtBlock[] getSdtArray();

   CTSdtBlock getSdtArray(int var1);

   int sizeOfSdtArray();

   void setSdtArray(CTSdtBlock[] var1);

   void setSdtArray(int var1, CTSdtBlock var2);

   CTSdtBlock insertNewSdt(int var1);

   CTSdtBlock addNewSdt();

   void removeSdt(int var1);

   List getPList();

   CTP[] getPArray();

   CTP getPArray(int var1);

   int sizeOfPArray();

   void setPArray(CTP[] var1);

   void setPArray(int var1, CTP var2);

   CTP insertNewP(int var1);

   CTP addNewP();

   void removeP(int var1);

   List getTblList();

   CTTbl[] getTblArray();

   CTTbl getTblArray(int var1);

   int sizeOfTblArray();

   void setTblArray(CTTbl[] var1);

   void setTblArray(int var1, CTTbl var2);

   CTTbl insertNewTbl(int var1);

   CTTbl addNewTbl();

   void removeTbl(int var1);

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

   List getAltChunkList();

   CTAltChunk[] getAltChunkArray();

   CTAltChunk getAltChunkArray(int var1);

   int sizeOfAltChunkArray();

   void setAltChunkArray(CTAltChunk[] var1);

   void setAltChunkArray(int var1, CTAltChunk var2);

   CTAltChunk insertNewAltChunk(int var1);

   CTAltChunk addNewAltChunk();

   void removeAltChunk(int var1);

   CTSectPr getSectPr();

   boolean isSetSectPr();

   void setSectPr(CTSectPr var1);

   CTSectPr addNewSectPr();

   void unsetSectPr();


   public static final class Factory {

      public static CTBody newInstance() {
         return (CTBody)POIXMLTypeLoader.newInstance(CTBody.type, (XmlOptions)null);
      }

      public static CTBody newInstance(XmlOptions var0) {
         return (CTBody)POIXMLTypeLoader.newInstance(CTBody.type, var0);
      }

      public static CTBody parse(String var0) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(File var0) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(URL var0) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(InputStream var0) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(Reader var0) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(XMLStreamReader var0) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(Node var0) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static CTBody parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, (XmlOptions)null);
      }

      public static CTBody parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBody)POIXMLTypeLoader.parse(var0, CTBody.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBody.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBody.type, var1);
      }

   }
}
