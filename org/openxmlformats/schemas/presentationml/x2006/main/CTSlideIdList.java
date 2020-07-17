package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry;
import org.w3c.dom.Node;

public interface CTSlideIdList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideIdList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslideidlist70a5type");


   List getSldIdList();

   CTSlideIdListEntry[] getSldIdArray();

   CTSlideIdListEntry getSldIdArray(int var1);

   int sizeOfSldIdArray();

   void setSldIdArray(CTSlideIdListEntry[] var1);

   void setSldIdArray(int var1, CTSlideIdListEntry var2);

   CTSlideIdListEntry insertNewSldId(int var1);

   CTSlideIdListEntry addNewSldId();

   void removeSldId(int var1);


   public static final class Factory {

      public static CTSlideIdList newInstance() {
         return (CTSlideIdList)POIXMLTypeLoader.newInstance(CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList newInstance(XmlOptions var0) {
         return (CTSlideIdList)POIXMLTypeLoader.newInstance(CTSlideIdList.type, var0);
      }

      public static CTSlideIdList parse(String var0) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(File var0) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(URL var0) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(Reader var0) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(Node var0) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static CTSlideIdList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static CTSlideIdList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideIdList)POIXMLTypeLoader.parse(var0, CTSlideIdList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideIdList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideIdList.type, var1);
      }

   }
}
