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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.w3c.dom.Node;

public interface CTTblPrBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblPrBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblprbaseeba1type");


   CTString getTblStyle();

   boolean isSetTblStyle();

   void setTblStyle(CTString var1);

   CTString addNewTblStyle();

   void unsetTblStyle();

   CTTblPPr getTblpPr();

   boolean isSetTblpPr();

   void setTblpPr(CTTblPPr var1);

   CTTblPPr addNewTblpPr();

   void unsetTblpPr();

   CTTblOverlap getTblOverlap();

   boolean isSetTblOverlap();

   void setTblOverlap(CTTblOverlap var1);

   CTTblOverlap addNewTblOverlap();

   void unsetTblOverlap();

   CTOnOff getBidiVisual();

   boolean isSetBidiVisual();

   void setBidiVisual(CTOnOff var1);

   CTOnOff addNewBidiVisual();

   void unsetBidiVisual();

   CTDecimalNumber getTblStyleRowBandSize();

   boolean isSetTblStyleRowBandSize();

   void setTblStyleRowBandSize(CTDecimalNumber var1);

   CTDecimalNumber addNewTblStyleRowBandSize();

   void unsetTblStyleRowBandSize();

   CTDecimalNumber getTblStyleColBandSize();

   boolean isSetTblStyleColBandSize();

   void setTblStyleColBandSize(CTDecimalNumber var1);

   CTDecimalNumber addNewTblStyleColBandSize();

   void unsetTblStyleColBandSize();

   CTTblWidth getTblW();

   boolean isSetTblW();

   void setTblW(CTTblWidth var1);

   CTTblWidth addNewTblW();

   void unsetTblW();

   CTJc getJc();

   boolean isSetJc();

   void setJc(CTJc var1);

   CTJc addNewJc();

   void unsetJc();

   CTTblWidth getTblCellSpacing();

   boolean isSetTblCellSpacing();

   void setTblCellSpacing(CTTblWidth var1);

   CTTblWidth addNewTblCellSpacing();

   void unsetTblCellSpacing();

   CTTblWidth getTblInd();

   boolean isSetTblInd();

   void setTblInd(CTTblWidth var1);

   CTTblWidth addNewTblInd();

   void unsetTblInd();

   CTTblBorders getTblBorders();

   boolean isSetTblBorders();

   void setTblBorders(CTTblBorders var1);

   CTTblBorders addNewTblBorders();

   void unsetTblBorders();

   CTShd getShd();

   boolean isSetShd();

   void setShd(CTShd var1);

   CTShd addNewShd();

   void unsetShd();

   CTTblLayoutType getTblLayout();

   boolean isSetTblLayout();

   void setTblLayout(CTTblLayoutType var1);

   CTTblLayoutType addNewTblLayout();

   void unsetTblLayout();

   CTTblCellMar getTblCellMar();

   boolean isSetTblCellMar();

   void setTblCellMar(CTTblCellMar var1);

   CTTblCellMar addNewTblCellMar();

   void unsetTblCellMar();

   CTShortHexNumber getTblLook();

   boolean isSetTblLook();

   void setTblLook(CTShortHexNumber var1);

   CTShortHexNumber addNewTblLook();

   void unsetTblLook();


   public static final class Factory {

      public static CTTblPrBase newInstance() {
         return (CTTblPrBase)POIXMLTypeLoader.newInstance(CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase newInstance(XmlOptions var0) {
         return (CTTblPrBase)POIXMLTypeLoader.newInstance(CTTblPrBase.type, var0);
      }

      public static CTTblPrBase parse(String var0) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(File var0) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(URL var0) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(InputStream var0) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(Reader var0) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(XMLStreamReader var0) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(Node var0) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static CTTblPrBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static CTTblPrBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblPrBase)POIXMLTypeLoader.parse(var0, CTTblPrBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrBase.type, var1);
      }

   }
}
