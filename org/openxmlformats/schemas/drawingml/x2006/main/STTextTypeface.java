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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STTextTypeface extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextTypeface.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttexttypefacea80ftype");



   public static final class Factory {

      public static STTextTypeface newValue(Object var0) {
         return (STTextTypeface)STTextTypeface.type.newValue(var0);
      }

      public static STTextTypeface newInstance() {
         return (STTextTypeface)POIXMLTypeLoader.newInstance(STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface newInstance(XmlOptions var0) {
         return (STTextTypeface)POIXMLTypeLoader.newInstance(STTextTypeface.type, var0);
      }

      public static STTextTypeface parse(String var0) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(File var0) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(URL var0) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(InputStream var0) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(Reader var0) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(XMLStreamReader var0) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(Node var0) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static STTextTypeface parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static STTextTypeface parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextTypeface)POIXMLTypeLoader.parse(var0, STTextTypeface.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextTypeface.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextTypeface.type, var1);
      }

   }
}
