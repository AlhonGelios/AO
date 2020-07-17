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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.w3c.dom.Node;

public interface STTextIndent extends STCoordinate32 {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextIndent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextindent16e4type");



   public static final class Factory {

      public static STTextIndent newValue(Object var0) {
         return (STTextIndent)STTextIndent.type.newValue(var0);
      }

      public static STTextIndent newInstance() {
         return (STTextIndent)POIXMLTypeLoader.newInstance(STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent newInstance(XmlOptions var0) {
         return (STTextIndent)POIXMLTypeLoader.newInstance(STTextIndent.type, var0);
      }

      public static STTextIndent parse(String var0) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(File var0) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(URL var0) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(InputStream var0) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(Reader var0) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(XMLStreamReader var0) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(Node var0) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static STTextIndent parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static STTextIndent parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextIndent)POIXMLTypeLoader.parse(var0, STTextIndent.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextIndent.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextIndent.type, var1);
      }

   }
}
