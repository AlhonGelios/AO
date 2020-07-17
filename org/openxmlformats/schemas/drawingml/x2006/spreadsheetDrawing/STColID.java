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

public interface STColID extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STColID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcolidb7f5type");



   public static final class Factory {

      public static STColID newValue(Object var0) {
         return (STColID)STColID.type.newValue(var0);
      }

      public static STColID newInstance() {
         return (STColID)POIXMLTypeLoader.newInstance(STColID.type, (XmlOptions)null);
      }

      public static STColID newInstance(XmlOptions var0) {
         return (STColID)POIXMLTypeLoader.newInstance(STColID.type, var0);
      }

      public static STColID parse(String var0) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(String var0, XmlOptions var1) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(File var0) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(URL var0) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(InputStream var0) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(Reader var0) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(XMLStreamReader var0) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(Node var0) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(Node var0, XmlOptions var1) throws XmlException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static STColID parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, (XmlOptions)null);
      }

      public static STColID parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STColID)POIXMLTypeLoader.parse(var0, STColID.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColID.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColID.type, var1);
      }

   }
}
