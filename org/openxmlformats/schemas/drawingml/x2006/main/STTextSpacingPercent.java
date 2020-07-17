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
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.w3c.dom.Node;

public interface STTextSpacingPercent extends STPercentage {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextSpacingPercent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextspacingpercentde3atype");



   public static final class Factory {

      public static STTextSpacingPercent newValue(Object var0) {
         return (STTextSpacingPercent)STTextSpacingPercent.type.newValue(var0);
      }

      public static STTextSpacingPercent newInstance() {
         return (STTextSpacingPercent)POIXMLTypeLoader.newInstance(STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent newInstance(XmlOptions var0) {
         return (STTextSpacingPercent)POIXMLTypeLoader.newInstance(STTextSpacingPercent.type, var0);
      }

      public static STTextSpacingPercent parse(String var0) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(File var0) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(URL var0) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(InputStream var0) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(Reader var0) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(XMLStreamReader var0) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(Node var0) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static STTextSpacingPercent parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static STTextSpacingPercent parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextSpacingPercent)POIXMLTypeLoader.parse(var0, STTextSpacingPercent.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextSpacingPercent.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextSpacingPercent.type, var1);
      }

   }
}
