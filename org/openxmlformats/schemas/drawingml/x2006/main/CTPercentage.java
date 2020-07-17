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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.w3c.dom.Node;

public interface CTPercentage extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpercentage4e75type");


   int getVal();

   STPercentage xgetVal();

   void setVal(int var1);

   void xsetVal(STPercentage var1);


   public static final class Factory {

      public static CTPercentage newInstance() {
         return (CTPercentage)POIXMLTypeLoader.newInstance(CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage newInstance(XmlOptions var0) {
         return (CTPercentage)POIXMLTypeLoader.newInstance(CTPercentage.type, var0);
      }

      public static CTPercentage parse(String var0) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(File var0) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(URL var0) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(InputStream var0) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(Reader var0) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(XMLStreamReader var0) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(Node var0) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static CTPercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static CTPercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPercentage)POIXMLTypeLoader.parse(var0, CTPercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPercentage.type, var1);
      }

   }
}
