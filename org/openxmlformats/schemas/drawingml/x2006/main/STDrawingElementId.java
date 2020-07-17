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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STDrawingElementId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDrawingElementId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdrawingelementid75a4type");



   public static final class Factory {

      public static STDrawingElementId newValue(Object var0) {
         return (STDrawingElementId)STDrawingElementId.type.newValue(var0);
      }

      public static STDrawingElementId newInstance() {
         return (STDrawingElementId)POIXMLTypeLoader.newInstance(STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId newInstance(XmlOptions var0) {
         return (STDrawingElementId)POIXMLTypeLoader.newInstance(STDrawingElementId.type, var0);
      }

      public static STDrawingElementId parse(String var0) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(String var0, XmlOptions var1) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(File var0) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(URL var0) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(InputStream var0) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(Reader var0) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(XMLStreamReader var0) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(Node var0) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static STDrawingElementId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static STDrawingElementId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDrawingElementId)POIXMLTypeLoader.parse(var0, STDrawingElementId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDrawingElementId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDrawingElementId.type, var1);
      }

   }
}
