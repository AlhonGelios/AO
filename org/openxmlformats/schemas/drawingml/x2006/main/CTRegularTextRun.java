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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.w3c.dom.Node;

public interface CTRegularTextRun extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRegularTextRun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctregulartextrun7e3dtype");


   CTTextCharacterProperties getRPr();

   boolean isSetRPr();

   void setRPr(CTTextCharacterProperties var1);

   CTTextCharacterProperties addNewRPr();

   void unsetRPr();

   String getT();

   XmlString xgetT();

   void setT(String var1);

   void xsetT(XmlString var1);


   public static final class Factory {

      public static CTRegularTextRun newInstance() {
         return (CTRegularTextRun)POIXMLTypeLoader.newInstance(CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun newInstance(XmlOptions var0) {
         return (CTRegularTextRun)POIXMLTypeLoader.newInstance(CTRegularTextRun.type, var0);
      }

      public static CTRegularTextRun parse(String var0) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(File var0) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(URL var0) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(InputStream var0) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(Reader var0) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(XMLStreamReader var0) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(Node var0) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static CTRegularTextRun parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static CTRegularTextRun parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRegularTextRun)POIXMLTypeLoader.parse(var0, CTRegularTextRun.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRegularTextRun.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRegularTextRun.type, var1);
      }

   }
}
