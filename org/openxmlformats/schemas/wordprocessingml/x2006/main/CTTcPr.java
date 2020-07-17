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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner;
import org.w3c.dom.Node;

public interface CTTcPr extends CTTcPrInner {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTcPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttcpree37type");


   CTTcPrChange getTcPrChange();

   boolean isSetTcPrChange();

   void setTcPrChange(CTTcPrChange var1);

   CTTcPrChange addNewTcPrChange();

   void unsetTcPrChange();


   public static final class Factory {

      public static CTTcPr newInstance() {
         return (CTTcPr)POIXMLTypeLoader.newInstance(CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr newInstance(XmlOptions var0) {
         return (CTTcPr)POIXMLTypeLoader.newInstance(CTTcPr.type, var0);
      }

      public static CTTcPr parse(String var0) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(File var0) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(URL var0) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(InputStream var0) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(Reader var0) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(XMLStreamReader var0) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(Node var0) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static CTTcPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static CTTcPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTcPr)POIXMLTypeLoader.parse(var0, CTTcPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPr.type, var1);
      }

   }
}
