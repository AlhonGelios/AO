package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STWrapDistance extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STWrapDistance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stwrapdistanceea50type");



   public static final class Factory {

      public static STWrapDistance newValue(Object var0) {
         return (STWrapDistance)STWrapDistance.type.newValue(var0);
      }

      public static STWrapDistance newInstance() {
         return (STWrapDistance)POIXMLTypeLoader.newInstance(STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance newInstance(XmlOptions var0) {
         return (STWrapDistance)POIXMLTypeLoader.newInstance(STWrapDistance.type, var0);
      }

      public static STWrapDistance parse(String var0) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(String var0, XmlOptions var1) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(File var0) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(URL var0) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(InputStream var0) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(Reader var0) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(XMLStreamReader var0) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(Node var0) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(Node var0, XmlOptions var1) throws XmlException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static STWrapDistance parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static STWrapDistance parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STWrapDistance)POIXMLTypeLoader.parse(var0, STWrapDistance.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STWrapDistance.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STWrapDistance.type, var1);
      }

   }
}
