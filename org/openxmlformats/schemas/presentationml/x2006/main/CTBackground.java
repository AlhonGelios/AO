package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;
import org.w3c.dom.Node;

public interface CTBackground extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBackground.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbackground36f7type");


   CTBackgroundProperties getBgPr();

   boolean isSetBgPr();

   void setBgPr(CTBackgroundProperties var1);

   CTBackgroundProperties addNewBgPr();

   void unsetBgPr();

   CTStyleMatrixReference getBgRef();

   boolean isSetBgRef();

   void setBgRef(CTStyleMatrixReference var1);

   CTStyleMatrixReference addNewBgRef();

   void unsetBgRef();

   STBlackWhiteMode$Enum getBwMode();

   STBlackWhiteMode xgetBwMode();

   boolean isSetBwMode();

   void setBwMode(STBlackWhiteMode$Enum var1);

   void xsetBwMode(STBlackWhiteMode var1);

   void unsetBwMode();


   public static final class Factory {

      public static CTBackground newInstance() {
         return (CTBackground)POIXMLTypeLoader.newInstance(CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground newInstance(XmlOptions var0) {
         return (CTBackground)POIXMLTypeLoader.newInstance(CTBackground.type, var0);
      }

      public static CTBackground parse(String var0) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(File var0) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(URL var0) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(InputStream var0) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(Reader var0) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(XMLStreamReader var0) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(Node var0) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static CTBackground parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, (XmlOptions)null);
      }

      public static CTBackground parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBackground)POIXMLTypeLoader.parse(var0, CTBackground.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBackground.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBackground.type, var1);
      }

   }
}
