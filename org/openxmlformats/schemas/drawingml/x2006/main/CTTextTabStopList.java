package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop;
import org.w3c.dom.Node;

public interface CTTextTabStopList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextTabStopList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttexttabstoplistf539type");


   List getTabList();

   CTTextTabStop[] getTabArray();

   CTTextTabStop getTabArray(int var1);

   int sizeOfTabArray();

   void setTabArray(CTTextTabStop[] var1);

   void setTabArray(int var1, CTTextTabStop var2);

   CTTextTabStop insertNewTab(int var1);

   CTTextTabStop addNewTab();

   void removeTab(int var1);


   public static final class Factory {

      public static CTTextTabStopList newInstance() {
         return (CTTextTabStopList)POIXMLTypeLoader.newInstance(CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList newInstance(XmlOptions var0) {
         return (CTTextTabStopList)POIXMLTypeLoader.newInstance(CTTextTabStopList.type, var0);
      }

      public static CTTextTabStopList parse(String var0) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(File var0) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(URL var0) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(InputStream var0) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(Reader var0) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(XMLStreamReader var0) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(Node var0) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static CTTextTabStopList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static CTTextTabStopList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextTabStopList)POIXMLTypeLoader.parse(var0, CTTextTabStopList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextTabStopList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextTabStopList.type, var1);
      }

   }
}
