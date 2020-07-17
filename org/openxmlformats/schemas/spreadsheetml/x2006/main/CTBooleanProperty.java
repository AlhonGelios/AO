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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTBooleanProperty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBooleanProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbooleanproperty1f3ctype");


   boolean getVal();

   XmlBoolean xgetVal();

   boolean isSetVal();

   void setVal(boolean var1);

   void xsetVal(XmlBoolean var1);

   void unsetVal();


   public static final class Factory {

      public static CTBooleanProperty newInstance() {
         return (CTBooleanProperty)POIXMLTypeLoader.newInstance(CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty newInstance(XmlOptions var0) {
         return (CTBooleanProperty)POIXMLTypeLoader.newInstance(CTBooleanProperty.type, var0);
      }

      public static CTBooleanProperty parse(String var0) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(File var0) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(URL var0) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(InputStream var0) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(Reader var0) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(XMLStreamReader var0) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(Node var0) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static CTBooleanProperty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static CTBooleanProperty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBooleanProperty)POIXMLTypeLoader.parse(var0, CTBooleanProperty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBooleanProperty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBooleanProperty.type, var1);
      }

   }
}
