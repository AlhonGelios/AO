package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.w3c.dom.Node;

public interface CTSdtEndPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSdtEndPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsdtendprbc6etype");


   List getRPrList();

   CTRPr[] getRPrArray();

   CTRPr getRPrArray(int var1);

   int sizeOfRPrArray();

   void setRPrArray(CTRPr[] var1);

   void setRPrArray(int var1, CTRPr var2);

   CTRPr insertNewRPr(int var1);

   CTRPr addNewRPr();

   void removeRPr(int var1);


   public static final class Factory {

      public static CTSdtEndPr newInstance() {
         return (CTSdtEndPr)POIXMLTypeLoader.newInstance(CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr newInstance(XmlOptions var0) {
         return (CTSdtEndPr)POIXMLTypeLoader.newInstance(CTSdtEndPr.type, var0);
      }

      public static CTSdtEndPr parse(String var0) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(File var0) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(URL var0) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(Reader var0) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(Node var0) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static CTSdtEndPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static CTSdtEndPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSdtEndPr)POIXMLTypeLoader.parse(var0, CTSdtEndPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtEndPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtEndPr.type, var1);
      }

   }
}
