package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTExternalSheetName extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalSheetName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternalsheetnamefcdetype");


   String getVal();

   STXstring xgetVal();

   boolean isSetVal();

   void setVal(String var1);

   void xsetVal(STXstring var1);

   void unsetVal();


   public static final class Factory {

      public static CTExternalSheetName newInstance() {
         return (CTExternalSheetName)POIXMLTypeLoader.newInstance(CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName newInstance(XmlOptions var0) {
         return (CTExternalSheetName)POIXMLTypeLoader.newInstance(CTExternalSheetName.type, var0);
      }

      public static CTExternalSheetName parse(String var0) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(File var0) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(URL var0) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(Reader var0) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(Node var0) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static CTExternalSheetName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static CTExternalSheetName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalSheetName)POIXMLTypeLoader.parse(var0, CTExternalSheetName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalSheetName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalSheetName.type, var1);
      }

   }
}
