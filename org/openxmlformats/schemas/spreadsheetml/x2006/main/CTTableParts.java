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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart;
import org.w3c.dom.Node;

public interface CTTableParts extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableParts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablepartsf6bbtype");


   List getTablePartList();

   CTTablePart[] getTablePartArray();

   CTTablePart getTablePartArray(int var1);

   int sizeOfTablePartArray();

   void setTablePartArray(CTTablePart[] var1);

   void setTablePartArray(int var1, CTTablePart var2);

   CTTablePart insertNewTablePart(int var1);

   CTTablePart addNewTablePart();

   void removeTablePart(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTTableParts newInstance() {
         return (CTTableParts)POIXMLTypeLoader.newInstance(CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts newInstance(XmlOptions var0) {
         return (CTTableParts)POIXMLTypeLoader.newInstance(CTTableParts.type, var0);
      }

      public static CTTableParts parse(String var0) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(File var0) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(URL var0) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(InputStream var0) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(Reader var0) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(XMLStreamReader var0) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(Node var0) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static CTTableParts parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static CTTableParts parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableParts)POIXMLTypeLoader.parse(var0, CTTableParts.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableParts.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableParts.type, var1);
      }

   }
}
