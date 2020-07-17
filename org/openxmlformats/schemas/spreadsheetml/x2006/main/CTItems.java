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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem;
import org.w3c.dom.Node;

public interface CTItems extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctitemsecdftype");


   List getItemList();

   CTItem[] getItemArray();

   CTItem getItemArray(int var1);

   int sizeOfItemArray();

   void setItemArray(CTItem[] var1);

   void setItemArray(int var1, CTItem var2);

   CTItem insertNewItem(int var1);

   CTItem addNewItem();

   void removeItem(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTItems newInstance() {
         return (CTItems)POIXMLTypeLoader.newInstance(CTItems.type, (XmlOptions)null);
      }

      public static CTItems newInstance(XmlOptions var0) {
         return (CTItems)POIXMLTypeLoader.newInstance(CTItems.type, var0);
      }

      public static CTItems parse(String var0) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(String var0, XmlOptions var1) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(File var0) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(URL var0) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(InputStream var0) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(Reader var0) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(XMLStreamReader var0) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(Node var0) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static CTItems parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, (XmlOptions)null);
      }

      public static CTItems parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTItems)POIXMLTypeLoader.parse(var0, CTItems.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTItems.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTItems.type, var1);
      }

   }
}
