package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.w3c.dom.Node;

public interface CTTextShapeAutofit extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextShapeAutofit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextshapeautofita009type");



   public static final class Factory {

      public static CTTextShapeAutofit newInstance() {
         return (CTTextShapeAutofit)POIXMLTypeLoader.newInstance(CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit newInstance(XmlOptions var0) {
         return (CTTextShapeAutofit)POIXMLTypeLoader.newInstance(CTTextShapeAutofit.type, var0);
      }

      public static CTTextShapeAutofit parse(String var0) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(File var0) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(URL var0) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(InputStream var0) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(Reader var0) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(XMLStreamReader var0) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(Node var0) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static CTTextShapeAutofit parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static CTTextShapeAutofit parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextShapeAutofit)POIXMLTypeLoader.parse(var0, CTTextShapeAutofit.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextShapeAutofit.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextShapeAutofit.type, var1);
      }

   }
}
