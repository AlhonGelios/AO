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

public interface STTextLanguageID extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextLanguageID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextlanguageid806btype");



   public static final class Factory {

      public static STTextLanguageID newValue(Object var0) {
         return (STTextLanguageID)STTextLanguageID.type.newValue(var0);
      }

      public static STTextLanguageID newInstance() {
         return (STTextLanguageID)POIXMLTypeLoader.newInstance(STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID newInstance(XmlOptions var0) {
         return (STTextLanguageID)POIXMLTypeLoader.newInstance(STTextLanguageID.type, var0);
      }

      public static STTextLanguageID parse(String var0) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(File var0) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(URL var0) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(InputStream var0) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(Reader var0) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(XMLStreamReader var0) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(Node var0) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static STTextLanguageID parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static STTextLanguageID parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextLanguageID)POIXMLTypeLoader.parse(var0, STTextLanguageID.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextLanguageID.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextLanguageID.type, var1);
      }

   }
}
