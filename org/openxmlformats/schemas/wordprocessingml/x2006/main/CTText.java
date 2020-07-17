package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTText extends STString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttext7f5btype");


   SpaceAttribute.Space.Enum getSpace();

   SpaceAttribute.Space xgetSpace();

   boolean isSetSpace();

   void setSpace(SpaceAttribute.Space.Enum var1);

   void xsetSpace(SpaceAttribute.Space var1);

   void unsetSpace();


   public static final class Factory {

      public static CTText newInstance() {
         return (CTText)POIXMLTypeLoader.newInstance(CTText.type, (XmlOptions)null);
      }

      public static CTText newInstance(XmlOptions var0) {
         return (CTText)POIXMLTypeLoader.newInstance(CTText.type, var0);
      }

      public static CTText parse(String var0) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(String var0, XmlOptions var1) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(File var0) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(URL var0) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(InputStream var0) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(Reader var0) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(XMLStreamReader var0) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(Node var0) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static CTText parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, (XmlOptions)null);
      }

      public static CTText parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTText)POIXMLTypeLoader.parse(var0, CTText.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTText.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTText.type, var1);
      }

   }
}
