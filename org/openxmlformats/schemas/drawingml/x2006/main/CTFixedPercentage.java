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
import org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage;
import org.w3c.dom.Node;

public interface CTFixedPercentage extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFixedPercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfixedpercentagea2dftype");


   int getVal();

   STFixedPercentage xgetVal();

   void setVal(int var1);

   void xsetVal(STFixedPercentage var1);


   public static final class Factory {

      public static CTFixedPercentage newInstance() {
         return (CTFixedPercentage)POIXMLTypeLoader.newInstance(CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage newInstance(XmlOptions var0) {
         return (CTFixedPercentage)POIXMLTypeLoader.newInstance(CTFixedPercentage.type, var0);
      }

      public static CTFixedPercentage parse(String var0) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(File var0) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(URL var0) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(InputStream var0) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(Reader var0) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(XMLStreamReader var0) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(Node var0) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static CTFixedPercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static CTFixedPercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFixedPercentage)POIXMLTypeLoader.parse(var0, CTFixedPercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFixedPercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFixedPercentage.type, var1);
      }

   }
}
