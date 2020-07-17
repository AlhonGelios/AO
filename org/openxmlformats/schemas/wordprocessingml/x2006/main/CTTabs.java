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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.w3c.dom.Node;

public interface CTTabs extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTabs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttabsa2aatype");


   List getTabList();

   CTTabStop[] getTabArray();

   CTTabStop getTabArray(int var1);

   int sizeOfTabArray();

   void setTabArray(CTTabStop[] var1);

   void setTabArray(int var1, CTTabStop var2);

   CTTabStop insertNewTab(int var1);

   CTTabStop addNewTab();

   void removeTab(int var1);


   public static final class Factory {

      public static CTTabs newInstance() {
         return (CTTabs)POIXMLTypeLoader.newInstance(CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs newInstance(XmlOptions var0) {
         return (CTTabs)POIXMLTypeLoader.newInstance(CTTabs.type, var0);
      }

      public static CTTabs parse(String var0) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(File var0) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(URL var0) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(InputStream var0) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(Reader var0) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(XMLStreamReader var0) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(Node var0) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static CTTabs parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, (XmlOptions)null);
      }

      public static CTTabs parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTabs)POIXMLTypeLoader.parse(var0, CTTabs.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTabs.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTabs.type, var1);
      }

   }
}
