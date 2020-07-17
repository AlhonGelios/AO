package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.CTH;
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
import org.w3c.dom.Node;

public interface CTHandles extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHandles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthandles5c1ftype");


   List getHList();

   CTH[] getHArray();

   CTH getHArray(int var1);

   int sizeOfHArray();

   void setHArray(CTH[] var1);

   void setHArray(int var1, CTH var2);

   CTH insertNewH(int var1);

   CTH addNewH();

   void removeH(int var1);


   public static final class Factory {

      public static CTHandles newInstance() {
         return (CTHandles)POIXMLTypeLoader.newInstance(CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles newInstance(XmlOptions var0) {
         return (CTHandles)POIXMLTypeLoader.newInstance(CTHandles.type, var0);
      }

      public static CTHandles parse(String var0) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(File var0) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(URL var0) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(InputStream var0) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(Reader var0) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(XMLStreamReader var0) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(Node var0) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static CTHandles parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, (XmlOptions)null);
      }

      public static CTHandles parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHandles)POIXMLTypeLoader.parse(var0, CTHandles.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHandles.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHandles.type, var1);
      }

   }
}
