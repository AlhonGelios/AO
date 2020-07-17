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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.w3c.dom.Node;

public interface CTFills extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFills.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfills2c6ftype");


   List getFillList();

   CTFill[] getFillArray();

   CTFill getFillArray(int var1);

   int sizeOfFillArray();

   void setFillArray(CTFill[] var1);

   void setFillArray(int var1, CTFill var2);

   CTFill insertNewFill(int var1);

   CTFill addNewFill();

   void removeFill(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTFills newInstance() {
         return (CTFills)POIXMLTypeLoader.newInstance(CTFills.type, (XmlOptions)null);
      }

      public static CTFills newInstance(XmlOptions var0) {
         return (CTFills)POIXMLTypeLoader.newInstance(CTFills.type, var0);
      }

      public static CTFills parse(String var0) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(File var0) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(URL var0) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(InputStream var0) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(Reader var0) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(XMLStreamReader var0) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(Node var0) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static CTFills parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, (XmlOptions)null);
      }

      public static CTFills parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFills)POIXMLTypeLoader.parse(var0, CTFills.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFills.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFills.type, var1);
      }

   }
}
