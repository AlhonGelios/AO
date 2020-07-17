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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.w3c.dom.Node;

public interface CTTcPrBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTcPrBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttcprbase93e6type");


   CTCnf getCnfStyle();

   boolean isSetCnfStyle();

   void setCnfStyle(CTCnf var1);

   CTCnf addNewCnfStyle();

   void unsetCnfStyle();

   CTTblWidth getTcW();

   boolean isSetTcW();

   void setTcW(CTTblWidth var1);

   CTTblWidth addNewTcW();

   void unsetTcW();

   CTDecimalNumber getGridSpan();

   boolean isSetGridSpan();

   void setGridSpan(CTDecimalNumber var1);

   CTDecimalNumber addNewGridSpan();

   void unsetGridSpan();

   CTHMerge getHMerge();

   boolean isSetHMerge();

   void setHMerge(CTHMerge var1);

   CTHMerge addNewHMerge();

   void unsetHMerge();

   CTVMerge getVMerge();

   boolean isSetVMerge();

   void setVMerge(CTVMerge var1);

   CTVMerge addNewVMerge();

   void unsetVMerge();

   CTTcBorders getTcBorders();

   boolean isSetTcBorders();

   void setTcBorders(CTTcBorders var1);

   CTTcBorders addNewTcBorders();

   void unsetTcBorders();

   CTShd getShd();

   boolean isSetShd();

   void setShd(CTShd var1);

   CTShd addNewShd();

   void unsetShd();

   CTOnOff getNoWrap();

   boolean isSetNoWrap();

   void setNoWrap(CTOnOff var1);

   CTOnOff addNewNoWrap();

   void unsetNoWrap();

   CTTcMar getTcMar();

   boolean isSetTcMar();

   void setTcMar(CTTcMar var1);

   CTTcMar addNewTcMar();

   void unsetTcMar();

   CTTextDirection getTextDirection();

   boolean isSetTextDirection();

   void setTextDirection(CTTextDirection var1);

   CTTextDirection addNewTextDirection();

   void unsetTextDirection();

   CTOnOff getTcFitText();

   boolean isSetTcFitText();

   void setTcFitText(CTOnOff var1);

   CTOnOff addNewTcFitText();

   void unsetTcFitText();

   CTVerticalJc getVAlign();

   boolean isSetVAlign();

   void setVAlign(CTVerticalJc var1);

   CTVerticalJc addNewVAlign();

   void unsetVAlign();

   CTOnOff getHideMark();

   boolean isSetHideMark();

   void setHideMark(CTOnOff var1);

   CTOnOff addNewHideMark();

   void unsetHideMark();


   public static final class Factory {

      public static CTTcPrBase newInstance() {
         return (CTTcPrBase)POIXMLTypeLoader.newInstance(CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase newInstance(XmlOptions var0) {
         return (CTTcPrBase)POIXMLTypeLoader.newInstance(CTTcPrBase.type, var0);
      }

      public static CTTcPrBase parse(String var0) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(File var0) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(URL var0) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(InputStream var0) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(Reader var0) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(XMLStreamReader var0) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(Node var0) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static CTTcPrBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static CTTcPrBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTcPrBase)POIXMLTypeLoader.parse(var0, CTTcPrBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPrBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPrBase.type, var1);
      }

   }
}
