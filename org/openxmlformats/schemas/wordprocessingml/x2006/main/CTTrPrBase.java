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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.w3c.dom.Node;

public interface CTTrPrBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTrPrBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttrprbase5d77type");


   List getCnfStyleList();

   CTCnf[] getCnfStyleArray();

   CTCnf getCnfStyleArray(int var1);

   int sizeOfCnfStyleArray();

   void setCnfStyleArray(CTCnf[] var1);

   void setCnfStyleArray(int var1, CTCnf var2);

   CTCnf insertNewCnfStyle(int var1);

   CTCnf addNewCnfStyle();

   void removeCnfStyle(int var1);

   List getDivIdList();

   CTDecimalNumber[] getDivIdArray();

   CTDecimalNumber getDivIdArray(int var1);

   int sizeOfDivIdArray();

   void setDivIdArray(CTDecimalNumber[] var1);

   void setDivIdArray(int var1, CTDecimalNumber var2);

   CTDecimalNumber insertNewDivId(int var1);

   CTDecimalNumber addNewDivId();

   void removeDivId(int var1);

   List getGridBeforeList();

   CTDecimalNumber[] getGridBeforeArray();

   CTDecimalNumber getGridBeforeArray(int var1);

   int sizeOfGridBeforeArray();

   void setGridBeforeArray(CTDecimalNumber[] var1);

   void setGridBeforeArray(int var1, CTDecimalNumber var2);

   CTDecimalNumber insertNewGridBefore(int var1);

   CTDecimalNumber addNewGridBefore();

   void removeGridBefore(int var1);

   List getGridAfterList();

   CTDecimalNumber[] getGridAfterArray();

   CTDecimalNumber getGridAfterArray(int var1);

   int sizeOfGridAfterArray();

   void setGridAfterArray(CTDecimalNumber[] var1);

   void setGridAfterArray(int var1, CTDecimalNumber var2);

   CTDecimalNumber insertNewGridAfter(int var1);

   CTDecimalNumber addNewGridAfter();

   void removeGridAfter(int var1);

   List getWBeforeList();

   CTTblWidth[] getWBeforeArray();

   CTTblWidth getWBeforeArray(int var1);

   int sizeOfWBeforeArray();

   void setWBeforeArray(CTTblWidth[] var1);

   void setWBeforeArray(int var1, CTTblWidth var2);

   CTTblWidth insertNewWBefore(int var1);

   CTTblWidth addNewWBefore();

   void removeWBefore(int var1);

   List getWAfterList();

   CTTblWidth[] getWAfterArray();

   CTTblWidth getWAfterArray(int var1);

   int sizeOfWAfterArray();

   void setWAfterArray(CTTblWidth[] var1);

   void setWAfterArray(int var1, CTTblWidth var2);

   CTTblWidth insertNewWAfter(int var1);

   CTTblWidth addNewWAfter();

   void removeWAfter(int var1);

   List getCantSplitList();

   CTOnOff[] getCantSplitArray();

   CTOnOff getCantSplitArray(int var1);

   int sizeOfCantSplitArray();

   void setCantSplitArray(CTOnOff[] var1);

   void setCantSplitArray(int var1, CTOnOff var2);

   CTOnOff insertNewCantSplit(int var1);

   CTOnOff addNewCantSplit();

   void removeCantSplit(int var1);

   List getTrHeightList();

   CTHeight[] getTrHeightArray();

   CTHeight getTrHeightArray(int var1);

   int sizeOfTrHeightArray();

   void setTrHeightArray(CTHeight[] var1);

   void setTrHeightArray(int var1, CTHeight var2);

   CTHeight insertNewTrHeight(int var1);

   CTHeight addNewTrHeight();

   void removeTrHeight(int var1);

   List getTblHeaderList();

   CTOnOff[] getTblHeaderArray();

   CTOnOff getTblHeaderArray(int var1);

   int sizeOfTblHeaderArray();

   void setTblHeaderArray(CTOnOff[] var1);

   void setTblHeaderArray(int var1, CTOnOff var2);

   CTOnOff insertNewTblHeader(int var1);

   CTOnOff addNewTblHeader();

   void removeTblHeader(int var1);

   List getTblCellSpacingList();

   CTTblWidth[] getTblCellSpacingArray();

   CTTblWidth getTblCellSpacingArray(int var1);

   int sizeOfTblCellSpacingArray();

   void setTblCellSpacingArray(CTTblWidth[] var1);

   void setTblCellSpacingArray(int var1, CTTblWidth var2);

   CTTblWidth insertNewTblCellSpacing(int var1);

   CTTblWidth addNewTblCellSpacing();

   void removeTblCellSpacing(int var1);

   List getJcList();

   CTJc[] getJcArray();

   CTJc getJcArray(int var1);

   int sizeOfJcArray();

   void setJcArray(CTJc[] var1);

   void setJcArray(int var1, CTJc var2);

   CTJc insertNewJc(int var1);

   CTJc addNewJc();

   void removeJc(int var1);

   List getHiddenList();

   CTOnOff[] getHiddenArray();

   CTOnOff getHiddenArray(int var1);

   int sizeOfHiddenArray();

   void setHiddenArray(CTOnOff[] var1);

   void setHiddenArray(int var1, CTOnOff var2);

   CTOnOff insertNewHidden(int var1);

   CTOnOff addNewHidden();

   void removeHidden(int var1);


   public static final class Factory {

      public static CTTrPrBase newInstance() {
         return (CTTrPrBase)POIXMLTypeLoader.newInstance(CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase newInstance(XmlOptions var0) {
         return (CTTrPrBase)POIXMLTypeLoader.newInstance(CTTrPrBase.type, var0);
      }

      public static CTTrPrBase parse(String var0) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(File var0) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(URL var0) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(InputStream var0) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(Reader var0) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(XMLStreamReader var0) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(Node var0) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static CTTrPrBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static CTTrPrBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTrPrBase)POIXMLTypeLoader.parse(var0, CTTrPrBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrPrBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrPrBase.type, var1);
      }

   }
}
