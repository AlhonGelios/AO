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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.w3c.dom.Node;

public interface CTR extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctr8120type");


   CTRPr getRPr();

   boolean isSetRPr();

   void setRPr(CTRPr var1);

   CTRPr addNewRPr();

   void unsetRPr();

   List getBrList();

   CTBr[] getBrArray();

   CTBr getBrArray(int var1);

   int sizeOfBrArray();

   void setBrArray(CTBr[] var1);

   void setBrArray(int var1, CTBr var2);

   CTBr insertNewBr(int var1);

   CTBr addNewBr();

   void removeBr(int var1);

   List getTList();

   CTText[] getTArray();

   CTText getTArray(int var1);

   int sizeOfTArray();

   void setTArray(CTText[] var1);

   void setTArray(int var1, CTText var2);

   CTText insertNewT(int var1);

   CTText addNewT();

   void removeT(int var1);

   List getDelTextList();

   CTText[] getDelTextArray();

   CTText getDelTextArray(int var1);

   int sizeOfDelTextArray();

   void setDelTextArray(CTText[] var1);

   void setDelTextArray(int var1, CTText var2);

   CTText insertNewDelText(int var1);

   CTText addNewDelText();

   void removeDelText(int var1);

   List getInstrTextList();

   CTText[] getInstrTextArray();

   CTText getInstrTextArray(int var1);

   int sizeOfInstrTextArray();

   void setInstrTextArray(CTText[] var1);

   void setInstrTextArray(int var1, CTText var2);

   CTText insertNewInstrText(int var1);

   CTText addNewInstrText();

   void removeInstrText(int var1);

   List getDelInstrTextList();

   CTText[] getDelInstrTextArray();

   CTText getDelInstrTextArray(int var1);

   int sizeOfDelInstrTextArray();

   void setDelInstrTextArray(CTText[] var1);

   void setDelInstrTextArray(int var1, CTText var2);

   CTText insertNewDelInstrText(int var1);

   CTText addNewDelInstrText();

   void removeDelInstrText(int var1);

   List getNoBreakHyphenList();

   CTEmpty[] getNoBreakHyphenArray();

   CTEmpty getNoBreakHyphenArray(int var1);

   int sizeOfNoBreakHyphenArray();

   void setNoBreakHyphenArray(CTEmpty[] var1);

   void setNoBreakHyphenArray(int var1, CTEmpty var2);

   CTEmpty insertNewNoBreakHyphen(int var1);

   CTEmpty addNewNoBreakHyphen();

   void removeNoBreakHyphen(int var1);

   List getSoftHyphenList();

   CTEmpty[] getSoftHyphenArray();

   CTEmpty getSoftHyphenArray(int var1);

   int sizeOfSoftHyphenArray();

   void setSoftHyphenArray(CTEmpty[] var1);

   void setSoftHyphenArray(int var1, CTEmpty var2);

   CTEmpty insertNewSoftHyphen(int var1);

   CTEmpty addNewSoftHyphen();

   void removeSoftHyphen(int var1);

   List getDayShortList();

   CTEmpty[] getDayShortArray();

   CTEmpty getDayShortArray(int var1);

   int sizeOfDayShortArray();

   void setDayShortArray(CTEmpty[] var1);

   void setDayShortArray(int var1, CTEmpty var2);

   CTEmpty insertNewDayShort(int var1);

   CTEmpty addNewDayShort();

   void removeDayShort(int var1);

   List getMonthShortList();

   CTEmpty[] getMonthShortArray();

   CTEmpty getMonthShortArray(int var1);

   int sizeOfMonthShortArray();

   void setMonthShortArray(CTEmpty[] var1);

   void setMonthShortArray(int var1, CTEmpty var2);

   CTEmpty insertNewMonthShort(int var1);

   CTEmpty addNewMonthShort();

   void removeMonthShort(int var1);

   List getYearShortList();

   CTEmpty[] getYearShortArray();

   CTEmpty getYearShortArray(int var1);

   int sizeOfYearShortArray();

   void setYearShortArray(CTEmpty[] var1);

   void setYearShortArray(int var1, CTEmpty var2);

   CTEmpty insertNewYearShort(int var1);

   CTEmpty addNewYearShort();

   void removeYearShort(int var1);

   List getDayLongList();

   CTEmpty[] getDayLongArray();

   CTEmpty getDayLongArray(int var1);

   int sizeOfDayLongArray();

   void setDayLongArray(CTEmpty[] var1);

   void setDayLongArray(int var1, CTEmpty var2);

   CTEmpty insertNewDayLong(int var1);

   CTEmpty addNewDayLong();

   void removeDayLong(int var1);

   List getMonthLongList();

   CTEmpty[] getMonthLongArray();

   CTEmpty getMonthLongArray(int var1);

   int sizeOfMonthLongArray();

   void setMonthLongArray(CTEmpty[] var1);

   void setMonthLongArray(int var1, CTEmpty var2);

   CTEmpty insertNewMonthLong(int var1);

   CTEmpty addNewMonthLong();

   void removeMonthLong(int var1);

   List getYearLongList();

   CTEmpty[] getYearLongArray();

   CTEmpty getYearLongArray(int var1);

   int sizeOfYearLongArray();

   void setYearLongArray(CTEmpty[] var1);

   void setYearLongArray(int var1, CTEmpty var2);

   CTEmpty insertNewYearLong(int var1);

   CTEmpty addNewYearLong();

   void removeYearLong(int var1);

   List getAnnotationRefList();

   CTEmpty[] getAnnotationRefArray();

   CTEmpty getAnnotationRefArray(int var1);

   int sizeOfAnnotationRefArray();

   void setAnnotationRefArray(CTEmpty[] var1);

   void setAnnotationRefArray(int var1, CTEmpty var2);

   CTEmpty insertNewAnnotationRef(int var1);

   CTEmpty addNewAnnotationRef();

   void removeAnnotationRef(int var1);

   List getFootnoteRefList();

   CTEmpty[] getFootnoteRefArray();

   CTEmpty getFootnoteRefArray(int var1);

   int sizeOfFootnoteRefArray();

   void setFootnoteRefArray(CTEmpty[] var1);

   void setFootnoteRefArray(int var1, CTEmpty var2);

   CTEmpty insertNewFootnoteRef(int var1);

   CTEmpty addNewFootnoteRef();

   void removeFootnoteRef(int var1);

   List getEndnoteRefList();

   CTEmpty[] getEndnoteRefArray();

   CTEmpty getEndnoteRefArray(int var1);

   int sizeOfEndnoteRefArray();

   void setEndnoteRefArray(CTEmpty[] var1);

   void setEndnoteRefArray(int var1, CTEmpty var2);

   CTEmpty insertNewEndnoteRef(int var1);

   CTEmpty addNewEndnoteRef();

   void removeEndnoteRef(int var1);

   List getSeparatorList();

   CTEmpty[] getSeparatorArray();

   CTEmpty getSeparatorArray(int var1);

   int sizeOfSeparatorArray();

   void setSeparatorArray(CTEmpty[] var1);

   void setSeparatorArray(int var1, CTEmpty var2);

   CTEmpty insertNewSeparator(int var1);

   CTEmpty addNewSeparator();

   void removeSeparator(int var1);

   List getContinuationSeparatorList();

   CTEmpty[] getContinuationSeparatorArray();

   CTEmpty getContinuationSeparatorArray(int var1);

   int sizeOfContinuationSeparatorArray();

   void setContinuationSeparatorArray(CTEmpty[] var1);

   void setContinuationSeparatorArray(int var1, CTEmpty var2);

   CTEmpty insertNewContinuationSeparator(int var1);

   CTEmpty addNewContinuationSeparator();

   void removeContinuationSeparator(int var1);

   List getSymList();

   CTSym[] getSymArray();

   CTSym getSymArray(int var1);

   int sizeOfSymArray();

   void setSymArray(CTSym[] var1);

   void setSymArray(int var1, CTSym var2);

   CTSym insertNewSym(int var1);

   CTSym addNewSym();

   void removeSym(int var1);

   List getPgNumList();

   CTEmpty[] getPgNumArray();

   CTEmpty getPgNumArray(int var1);

   int sizeOfPgNumArray();

   void setPgNumArray(CTEmpty[] var1);

   void setPgNumArray(int var1, CTEmpty var2);

   CTEmpty insertNewPgNum(int var1);

   CTEmpty addNewPgNum();

   void removePgNum(int var1);

   List getCrList();

   CTEmpty[] getCrArray();

   CTEmpty getCrArray(int var1);

   int sizeOfCrArray();

   void setCrArray(CTEmpty[] var1);

   void setCrArray(int var1, CTEmpty var2);

   CTEmpty insertNewCr(int var1);

   CTEmpty addNewCr();

   void removeCr(int var1);

   List getTabList();

   CTEmpty[] getTabArray();

   CTEmpty getTabArray(int var1);

   int sizeOfTabArray();

   void setTabArray(CTEmpty[] var1);

   void setTabArray(int var1, CTEmpty var2);

   CTEmpty insertNewTab(int var1);

   CTEmpty addNewTab();

   void removeTab(int var1);

   List getObjectList();

   CTObject[] getObjectArray();

   CTObject getObjectArray(int var1);

   int sizeOfObjectArray();

   void setObjectArray(CTObject[] var1);

   void setObjectArray(int var1, CTObject var2);

   CTObject insertNewObject(int var1);

   CTObject addNewObject();

   void removeObject(int var1);

   List getPictList();

   CTPicture[] getPictArray();

   CTPicture getPictArray(int var1);

   int sizeOfPictArray();

   void setPictArray(CTPicture[] var1);

   void setPictArray(int var1, CTPicture var2);

   CTPicture insertNewPict(int var1);

   CTPicture addNewPict();

   void removePict(int var1);

   List getFldCharList();

   CTFldChar[] getFldCharArray();

   CTFldChar getFldCharArray(int var1);

   int sizeOfFldCharArray();

   void setFldCharArray(CTFldChar[] var1);

   void setFldCharArray(int var1, CTFldChar var2);

   CTFldChar insertNewFldChar(int var1);

   CTFldChar addNewFldChar();

   void removeFldChar(int var1);

   List getRubyList();

   CTRuby[] getRubyArray();

   CTRuby getRubyArray(int var1);

   int sizeOfRubyArray();

   void setRubyArray(CTRuby[] var1);

   void setRubyArray(int var1, CTRuby var2);

   CTRuby insertNewRuby(int var1);

   CTRuby addNewRuby();

   void removeRuby(int var1);

   List getFootnoteReferenceList();

   CTFtnEdnRef[] getFootnoteReferenceArray();

   CTFtnEdnRef getFootnoteReferenceArray(int var1);

   int sizeOfFootnoteReferenceArray();

   void setFootnoteReferenceArray(CTFtnEdnRef[] var1);

   void setFootnoteReferenceArray(int var1, CTFtnEdnRef var2);

   CTFtnEdnRef insertNewFootnoteReference(int var1);

   CTFtnEdnRef addNewFootnoteReference();

   void removeFootnoteReference(int var1);

   List getEndnoteReferenceList();

   CTFtnEdnRef[] getEndnoteReferenceArray();

   CTFtnEdnRef getEndnoteReferenceArray(int var1);

   int sizeOfEndnoteReferenceArray();

   void setEndnoteReferenceArray(CTFtnEdnRef[] var1);

   void setEndnoteReferenceArray(int var1, CTFtnEdnRef var2);

   CTFtnEdnRef insertNewEndnoteReference(int var1);

   CTFtnEdnRef addNewEndnoteReference();

   void removeEndnoteReference(int var1);

   List getCommentReferenceList();

   CTMarkup[] getCommentReferenceArray();

   CTMarkup getCommentReferenceArray(int var1);

   int sizeOfCommentReferenceArray();

   void setCommentReferenceArray(CTMarkup[] var1);

   void setCommentReferenceArray(int var1, CTMarkup var2);

   CTMarkup insertNewCommentReference(int var1);

   CTMarkup addNewCommentReference();

   void removeCommentReference(int var1);

   List getDrawingList();

   CTDrawing[] getDrawingArray();

   CTDrawing getDrawingArray(int var1);

   int sizeOfDrawingArray();

   void setDrawingArray(CTDrawing[] var1);

   void setDrawingArray(int var1, CTDrawing var2);

   CTDrawing insertNewDrawing(int var1);

   CTDrawing addNewDrawing();

   void removeDrawing(int var1);

   List getPtabList();

   CTPTab[] getPtabArray();

   CTPTab getPtabArray(int var1);

   int sizeOfPtabArray();

   void setPtabArray(CTPTab[] var1);

   void setPtabArray(int var1, CTPTab var2);

   CTPTab insertNewPtab(int var1);

   CTPTab addNewPtab();

   void removePtab(int var1);

   List getLastRenderedPageBreakList();

   CTEmpty[] getLastRenderedPageBreakArray();

   CTEmpty getLastRenderedPageBreakArray(int var1);

   int sizeOfLastRenderedPageBreakArray();

   void setLastRenderedPageBreakArray(CTEmpty[] var1);

   void setLastRenderedPageBreakArray(int var1, CTEmpty var2);

   CTEmpty insertNewLastRenderedPageBreak(int var1);

   CTEmpty addNewLastRenderedPageBreak();

   void removeLastRenderedPageBreak(int var1);

   byte[] getRsidRPr();

   STLongHexNumber xgetRsidRPr();

   boolean isSetRsidRPr();

   void setRsidRPr(byte[] var1);

   void xsetRsidRPr(STLongHexNumber var1);

   void unsetRsidRPr();

   byte[] getRsidDel();

   STLongHexNumber xgetRsidDel();

   boolean isSetRsidDel();

   void setRsidDel(byte[] var1);

   void xsetRsidDel(STLongHexNumber var1);

   void unsetRsidDel();

   byte[] getRsidR();

   STLongHexNumber xgetRsidR();

   boolean isSetRsidR();

   void setRsidR(byte[] var1);

   void xsetRsidR(STLongHexNumber var1);

   void unsetRsidR();


   public static final class Factory {

      public static CTR newInstance() {
         return (CTR)POIXMLTypeLoader.newInstance(CTR.type, (XmlOptions)null);
      }

      public static CTR newInstance(XmlOptions var0) {
         return (CTR)POIXMLTypeLoader.newInstance(CTR.type, var0);
      }

      public static CTR parse(String var0) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(String var0, XmlOptions var1) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(File var0) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(URL var0) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(InputStream var0) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(Reader var0) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(XMLStreamReader var0) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(Node var0) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static CTR parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, (XmlOptions)null);
      }

      public static CTR parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTR)POIXMLTypeLoader.parse(var0, CTR.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTR.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTR.type, var1);
      }

   }
}
