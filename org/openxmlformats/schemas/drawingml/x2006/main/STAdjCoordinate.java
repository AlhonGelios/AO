package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STAdjCoordinate extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAdjCoordinate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stadjcoordinated920type");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public static final class Factory {

      public static STAdjCoordinate newValue(Object var0) {
         return (STAdjCoordinate)STAdjCoordinate.type.newValue(var0);
      }

      public static STAdjCoordinate newInstance() {
         return (STAdjCoordinate)POIXMLTypeLoader.newInstance(STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate newInstance(XmlOptions var0) {
         return (STAdjCoordinate)POIXMLTypeLoader.newInstance(STAdjCoordinate.type, var0);
      }

      public static STAdjCoordinate parse(String var0) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(String var0, XmlOptions var1) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(File var0) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(URL var0) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(InputStream var0) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(Reader var0) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(XMLStreamReader var0) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(Node var0) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static STAdjCoordinate parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static STAdjCoordinate parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAdjCoordinate)POIXMLTypeLoader.parse(var0, STAdjCoordinate.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAdjCoordinate.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAdjCoordinate.type, var1);
      }

   }
}
