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
import org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage;
import org.w3c.dom.Node;

public interface CTPositivePercentage extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPositivePercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpositivepercentage2f8etype");


   int getVal();

   STPositivePercentage xgetVal();

   void setVal(int var1);

   void xsetVal(STPositivePercentage var1);


   public static final class Factory {

      public static CTPositivePercentage newInstance() {
         return (CTPositivePercentage)POIXMLTypeLoader.newInstance(CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage newInstance(XmlOptions var0) {
         return (CTPositivePercentage)POIXMLTypeLoader.newInstance(CTPositivePercentage.type, var0);
      }

      public static CTPositivePercentage parse(String var0) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(File var0) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(URL var0) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(InputStream var0) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(Reader var0) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(XMLStreamReader var0) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(Node var0) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static CTPositivePercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static CTPositivePercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPositivePercentage)POIXMLTypeLoader.parse(var0, CTPositivePercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPositivePercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPositivePercentage.type, var1);
      }

   }
}
