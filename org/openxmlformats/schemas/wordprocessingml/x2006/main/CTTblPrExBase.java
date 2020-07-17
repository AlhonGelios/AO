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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.w3c.dom.Node;

public interface CTTblPrExBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblPrExBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblprexbasee7eetype");


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

      public static CTTblPrExBase newInstance() {
         return (CTTblPrExBase)POIXMLTypeLoader.newInstance(CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase newInstance(XmlOptions var0) {
         return (CTTblPrExBase)POIXMLTypeLoader.newInstance(CTTblPrExBase.type, var0);
      }

      public static CTTblPrExBase parse(String var0) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(File var0) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(URL var0) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(InputStream var0) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(Reader var0) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(XMLStreamReader var0) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(Node var0) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static CTTblPrExBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static CTTblPrExBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblPrExBase)POIXMLTypeLoader.parse(var0, CTTblPrExBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrExBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrExBase.type, var1);
      }

   }
}
