package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextboxTightWrap;
import org.w3c.dom.Node;

public interface CTPPrBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPPrBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpprbasebaeftype");


   CTString getPStyle();

   boolean isSetPStyle();

   void setPStyle(CTString var1);

   CTString addNewPStyle();

   void unsetPStyle();

   CTOnOff getKeepNext();

   boolean isSetKeepNext();

   void setKeepNext(CTOnOff var1);

   CTOnOff addNewKeepNext();

   void unsetKeepNext();

   CTOnOff getKeepLines();

   boolean isSetKeepLines();

   void setKeepLines(CTOnOff var1);

   CTOnOff addNewKeepLines();

   void unsetKeepLines();

   CTOnOff getPageBreakBefore();

   boolean isSetPageBreakBefore();

   void setPageBreakBefore(CTOnOff var1);

   CTOnOff addNewPageBreakBefore();

   void unsetPageBreakBefore();

   CTFramePr getFramePr();

   boolean isSetFramePr();

   void setFramePr(CTFramePr var1);

   CTFramePr addNewFramePr();

   void unsetFramePr();

   CTOnOff getWidowControl();

   boolean isSetWidowControl();

   void setWidowControl(CTOnOff var1);

   CTOnOff addNewWidowControl();

   void unsetWidowControl();

   CTNumPr getNumPr();

   boolean isSetNumPr();

   void setNumPr(CTNumPr var1);

   CTNumPr addNewNumPr();

   void unsetNumPr();

   CTOnOff getSuppressLineNumbers();

   boolean isSetSuppressLineNumbers();

   void setSuppressLineNumbers(CTOnOff var1);

   CTOnOff addNewSuppressLineNumbers();

   void unsetSuppressLineNumbers();

   CTPBdr getPBdr();

   boolean isSetPBdr();

   void setPBdr(CTPBdr var1);

   CTPBdr addNewPBdr();

   void unsetPBdr();

   CTShd getShd();

   boolean isSetShd();

   void setShd(CTShd var1);

   CTShd addNewShd();

   void unsetShd();

   CTTabs getTabs();

   boolean isSetTabs();

   void setTabs(CTTabs var1);

   CTTabs addNewTabs();

   void unsetTabs();

   CTOnOff getSuppressAutoHyphens();

   boolean isSetSuppressAutoHyphens();

   void setSuppressAutoHyphens(CTOnOff var1);

   CTOnOff addNewSuppressAutoHyphens();

   void unsetSuppressAutoHyphens();

   CTOnOff getKinsoku();

   boolean isSetKinsoku();

   void setKinsoku(CTOnOff var1);

   CTOnOff addNewKinsoku();

   void unsetKinsoku();

   CTOnOff getWordWrap();

   boolean isSetWordWrap();

   void setWordWrap(CTOnOff var1);

   CTOnOff addNewWordWrap();

   void unsetWordWrap();

   CTOnOff getOverflowPunct();

   boolean isSetOverflowPunct();

   void setOverflowPunct(CTOnOff var1);

   CTOnOff addNewOverflowPunct();

   void unsetOverflowPunct();

   CTOnOff getTopLinePunct();

   boolean isSetTopLinePunct();

   void setTopLinePunct(CTOnOff var1);

   CTOnOff addNewTopLinePunct();

   void unsetTopLinePunct();

   CTOnOff getAutoSpaceDE();

   boolean isSetAutoSpaceDE();

   void setAutoSpaceDE(CTOnOff var1);

   CTOnOff addNewAutoSpaceDE();

   void unsetAutoSpaceDE();

   CTOnOff getAutoSpaceDN();

   boolean isSetAutoSpaceDN();

   void setAutoSpaceDN(CTOnOff var1);

   CTOnOff addNewAutoSpaceDN();

   void unsetAutoSpaceDN();

   CTOnOff getBidi();

   boolean isSetBidi();

   void setBidi(CTOnOff var1);

   CTOnOff addNewBidi();

   void unsetBidi();

   CTOnOff getAdjustRightInd();

   boolean isSetAdjustRightInd();

   void setAdjustRightInd(CTOnOff var1);

   CTOnOff addNewAdjustRightInd();

   void unsetAdjustRightInd();

   CTOnOff getSnapToGrid();

   boolean isSetSnapToGrid();

   void setSnapToGrid(CTOnOff var1);

   CTOnOff addNewSnapToGrid();

   void unsetSnapToGrid();

   CTSpacing getSpacing();

   boolean isSetSpacing();

   void setSpacing(CTSpacing var1);

   CTSpacing addNewSpacing();

   void unsetSpacing();

   CTInd getInd();

   boolean isSetInd();

   void setInd(CTInd var1);

   CTInd addNewInd();

   void unsetInd();

   CTOnOff getContextualSpacing();

   boolean isSetContextualSpacing();

   void setContextualSpacing(CTOnOff var1);

   CTOnOff addNewContextualSpacing();

   void unsetContextualSpacing();

   CTOnOff getMirrorIndents();

   boolean isSetMirrorIndents();

   void setMirrorIndents(CTOnOff var1);

   CTOnOff addNewMirrorIndents();

   void unsetMirrorIndents();

   CTOnOff getSuppressOverlap();

   boolean isSetSuppressOverlap();

   void setSuppressOverlap(CTOnOff var1);

   CTOnOff addNewSuppressOverlap();

   void unsetSuppressOverlap();

   CTJc getJc();

   boolean isSetJc();

   void setJc(CTJc var1);

   CTJc addNewJc();

   void unsetJc();

   CTTextDirection getTextDirection();

   boolean isSetTextDirection();

   void setTextDirection(CTTextDirection var1);

   CTTextDirection addNewTextDirection();

   void unsetTextDirection();

   CTTextAlignment getTextAlignment();

   boolean isSetTextAlignment();

   void setTextAlignment(CTTextAlignment var1);

   CTTextAlignment addNewTextAlignment();

   void unsetTextAlignment();

   CTTextboxTightWrap getTextboxTightWrap();

   boolean isSetTextboxTightWrap();

   void setTextboxTightWrap(CTTextboxTightWrap var1);

   CTTextboxTightWrap addNewTextboxTightWrap();

   void unsetTextboxTightWrap();

   CTDecimalNumber getOutlineLvl();

   boolean isSetOutlineLvl();

   void setOutlineLvl(CTDecimalNumber var1);

   CTDecimalNumber addNewOutlineLvl();

   void unsetOutlineLvl();

   CTDecimalNumber getDivId();

   boolean isSetDivId();

   void setDivId(CTDecimalNumber var1);

   CTDecimalNumber addNewDivId();

   void unsetDivId();

   CTCnf getCnfStyle();

   boolean isSetCnfStyle();

   void setCnfStyle(CTCnf var1);

   CTCnf addNewCnfStyle();

   void unsetCnfStyle();


   public static final class Factory {

      public static CTPPrBase newInstance() {
         return (CTPPrBase)POIXMLTypeLoader.newInstance(CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase newInstance(XmlOptions var0) {
         return (CTPPrBase)POIXMLTypeLoader.newInstance(CTPPrBase.type, var0);
      }

      public static CTPPrBase parse(String var0) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(File var0) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(URL var0) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(InputStream var0) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(Reader var0) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(XMLStreamReader var0) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(Node var0) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static CTPPrBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static CTPPrBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPPrBase)POIXMLTypeLoader.parse(var0, CTPPrBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPrBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPrBase.type, var1);
      }

   }
}
