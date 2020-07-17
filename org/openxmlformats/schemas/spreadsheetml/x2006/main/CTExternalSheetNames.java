package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName;
import org.w3c.dom.Node;

public interface CTExternalSheetNames extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalSheetNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternalsheetnames7eddtype");


   List getSheetNameList();

   CTExternalSheetName[] getSheetNameArray();

   CTExternalSheetName getSheetNameArray(int var1);

   int sizeOfSheetNameArray();

   void setSheetNameArray(CTExternalSheetName[] var1);

   void setSheetNameArray(int var1, CTExternalSheetName var2);

   CTExternalSheetName insertNewSheetName(int var1);

   CTExternalSheetName addNewSheetName();

   void removeSheetName(int var1);


   public static final class Factory {

      public static CTExternalSheetNames newInstance() {
         return (CTExternalSheetNames)POIXMLTypeLoader.newInstance(CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames newInstance(XmlOptions var0) {
         return (CTExternalSheetNames)POIXMLTypeLoader.newInstance(CTExternalSheetNames.type, var0);
      }

      public static CTExternalSheetNames parse(String var0) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(File var0) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(URL var0) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(Reader var0) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(Node var0) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static CTExternalSheetNames parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static CTExternalSheetNames parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalSheetNames)POIXMLTypeLoader.parse(var0, CTExternalSheetNames.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalSheetNames.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalSheetNames.type, var1);
      }

   }
}
