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

public interface STTextFontScalePercent extends STPercentage {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextFontScalePercent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextfontscalepercente6c2type");



   public static final class Factory {

      public static STTextFontScalePercent newValue(Object var0) {
         return (STTextFontScalePercent)STTextFontScalePercent.type.newValue(var0);
      }

      public static STTextFontScalePercent newInstance() {
         return (STTextFontScalePercent)POIXMLTypeLoader.newInstance(STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent newInstance(XmlOptions var0) {
         return (STTextFontScalePercent)POIXMLTypeLoader.newInstance(STTextFontScalePercent.type, var0);
      }

      public static STTextFontScalePercent parse(String var0) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(File var0) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(URL var0) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(InputStream var0) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(Reader var0) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(XMLStreamReader var0) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(Node var0) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static STTextFontScalePercent parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static STTextFontScalePercent parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextFontScalePercent)POIXMLTypeLoader.parse(var0, STTextFontScalePercent.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontScalePercent.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontScalePercent.type, var1);
      }

   }
}
