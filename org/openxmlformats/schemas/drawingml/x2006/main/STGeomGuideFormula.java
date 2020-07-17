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

public interface STGeomGuideFormula extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STGeomGuideFormula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stgeomguideformula4b51type");



   public static final class Factory {

      public static STGeomGuideFormula newValue(Object var0) {
         return (STGeomGuideFormula)STGeomGuideFormula.type.newValue(var0);
      }

      public static STGeomGuideFormula newInstance() {
         return (STGeomGuideFormula)POIXMLTypeLoader.newInstance(STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula newInstance(XmlOptions var0) {
         return (STGeomGuideFormula)POIXMLTypeLoader.newInstance(STGeomGuideFormula.type, var0);
      }

      public static STGeomGuideFormula parse(String var0) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(String var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(File var0) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(URL var0) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(InputStream var0) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(Reader var0) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(XMLStreamReader var0) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(Node var0) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(Node var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static STGeomGuideFormula parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static STGeomGuideFormula parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STGeomGuideFormula)POIXMLTypeLoader.parse(var0, STGeomGuideFormula.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGeomGuideFormula.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGeomGuideFormula.type, var1);
      }

   }
}
