package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;

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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STRowID extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STRowID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("strowidf4cftype");



   public static final class Factory {

      public static STRowID newValue(Object var0) {
         return (STRowID)STRowID.type.newValue(var0);
      }

      public static STRowID newInstance() {
         return (STRowID)POIXMLTypeLoader.newInstance(STRowID.type, (XmlOptions)null);
      }

      public static STRowID newInstance(XmlOptions var0) {
         return (STRowID)POIXMLTypeLoader.newInstance(STRowID.type, var0);
      }

      public static STRowID parse(String var0) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(String var0, XmlOptions var1) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(File var0) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(URL var0) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(InputStream var0) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(Reader var0) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(XMLStreamReader var0) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(Node var0) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(Node var0, XmlOptions var1) throws XmlException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static STRowID parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, (XmlOptions)null);
      }

      public static STRowID parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STRowID)POIXMLTypeLoader.parse(var0, STRowID.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRowID.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRowID.type, var1);
      }

   }
}
