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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField;
import org.w3c.dom.Node;

public interface CTCacheFields extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCacheFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcachefieldsf5fatype");


   List getCacheFieldList();

   CTCacheField[] getCacheFieldArray();

   CTCacheField getCacheFieldArray(int var1);

   int sizeOfCacheFieldArray();

   void setCacheFieldArray(CTCacheField[] var1);

   void setCacheFieldArray(int var1, CTCacheField var2);

   CTCacheField insertNewCacheField(int var1);

   CTCacheField addNewCacheField();

   void removeCacheField(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTCacheFields newInstance() {
         return (CTCacheFields)POIXMLTypeLoader.newInstance(CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields newInstance(XmlOptions var0) {
         return (CTCacheFields)POIXMLTypeLoader.newInstance(CTCacheFields.type, var0);
      }

      public static CTCacheFields parse(String var0) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(File var0) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(URL var0) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(InputStream var0) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(Reader var0) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(XMLStreamReader var0) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(Node var0) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static CTCacheFields parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static CTCacheFields parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCacheFields)POIXMLTypeLoader.parse(var0, CTCacheFields.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheFields.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheFields.type, var1);
      }

   }
}
