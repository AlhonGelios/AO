package org.openxmlformats.schemas.drawingml.x2006.chart;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STLogBase extends XmlDouble {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLogBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlogbase11a1type");



   public static final class Factory {

      public static STLogBase newValue(Object var0) {
         return (STLogBase)STLogBase.type.newValue(var0);
      }

      public static STLogBase newInstance() {
         return (STLogBase)POIXMLTypeLoader.newInstance(STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase newInstance(XmlOptions var0) {
         return (STLogBase)POIXMLTypeLoader.newInstance(STLogBase.type, var0);
      }

      public static STLogBase parse(String var0) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(String var0, XmlOptions var1) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(File var0) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(URL var0) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(InputStream var0) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(Reader var0) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(XMLStreamReader var0) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(Node var0) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static STLogBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, (XmlOptions)null);
      }

      public static STLogBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLogBase)POIXMLTypeLoader.parse(var0, STLogBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLogBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLogBase.type, var1);
      }

   }
}
