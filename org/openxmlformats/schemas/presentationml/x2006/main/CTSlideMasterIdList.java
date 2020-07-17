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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;
import org.w3c.dom.Node;

public interface CTSlideMasterIdList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideMasterIdList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidemasteridlist0b63type");


   List getSldMasterIdList();

   CTSlideMasterIdListEntry[] getSldMasterIdArray();

   CTSlideMasterIdListEntry getSldMasterIdArray(int var1);

   int sizeOfSldMasterIdArray();

   void setSldMasterIdArray(CTSlideMasterIdListEntry[] var1);

   void setSldMasterIdArray(int var1, CTSlideMasterIdListEntry var2);

   CTSlideMasterIdListEntry insertNewSldMasterId(int var1);

   CTSlideMasterIdListEntry addNewSldMasterId();

   void removeSldMasterId(int var1);


   public static final class Factory {

      public static CTSlideMasterIdList newInstance() {
         return (CTSlideMasterIdList)POIXMLTypeLoader.newInstance(CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList newInstance(XmlOptions var0) {
         return (CTSlideMasterIdList)POIXMLTypeLoader.newInstance(CTSlideMasterIdList.type, var0);
      }

      public static CTSlideMasterIdList parse(String var0) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(File var0) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(URL var0) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(Reader var0) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(Node var0) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static CTSlideMasterIdList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideMasterIdList)POIXMLTypeLoader.parse(var0, CTSlideMasterIdList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterIdList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterIdList.type, var1);
      }

   }
}
