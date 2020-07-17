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
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData;
import org.w3c.dom.Node;

public interface CTCustomerDataList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCustomerDataList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcustomerdatalist8b7ftype");


   List getCustDataList();

   CTCustomerData[] getCustDataArray();

   CTCustomerData getCustDataArray(int var1);

   int sizeOfCustDataArray();

   void setCustDataArray(CTCustomerData[] var1);

   void setCustDataArray(int var1, CTCustomerData var2);

   CTCustomerData insertNewCustData(int var1);

   CTCustomerData addNewCustData();

   void removeCustData(int var1);

   CTTagsData getTags();

   boolean isSetTags();

   void setTags(CTTagsData var1);

   CTTagsData addNewTags();

   void unsetTags();


   public static final class Factory {

      public static CTCustomerDataList newInstance() {
         return (CTCustomerDataList)POIXMLTypeLoader.newInstance(CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList newInstance(XmlOptions var0) {
         return (CTCustomerDataList)POIXMLTypeLoader.newInstance(CTCustomerDataList.type, var0);
      }

      public static CTCustomerDataList parse(String var0) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(File var0) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(URL var0) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(InputStream var0) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(Reader var0) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(XMLStreamReader var0) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(Node var0) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static CTCustomerDataList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static CTCustomerDataList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCustomerDataList)POIXMLTypeLoader.parse(var0, CTCustomerDataList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCustomerDataList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCustomerDataList.type, var1);
      }

   }
}
