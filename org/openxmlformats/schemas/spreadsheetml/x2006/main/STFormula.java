package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface STFormula extends STXstring {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFormula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stformula7e35type");



   public static final class Factory {

      public static STFormula newValue(Object var0) {
         return (STFormula)STFormula.type.newValue(var0);
      }

      public static STFormula newInstance() {
         return (STFormula)POIXMLTypeLoader.newInstance(STFormula.type, (XmlOptions)null);
      }

      public static STFormula newInstance(XmlOptions var0) {
         return (STFormula)POIXMLTypeLoader.newInstance(STFormula.type, var0);
      }

      public static STFormula parse(String var0) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(String var0, XmlOptions var1) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(File var0) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(URL var0) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(InputStream var0) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(Reader var0) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(XMLStreamReader var0) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(Node var0) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static STFormula parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, (XmlOptions)null);
      }

      public static STFormula parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFormula)POIXMLTypeLoader.parse(var0, STFormula.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFormula.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFormula.type, var1);
      }

   }
}
