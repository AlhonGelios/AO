package com.microsoft.schemas.office.office;

import com.microsoft.schemas.vml.STExt;
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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTIdMap extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTIdMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctidmap63fatype");


   STExt.Enum getExt();

   STExt xgetExt();

   boolean isSetExt();

   void setExt(STExt.Enum var1);

   void xsetExt(STExt var1);

   void unsetExt();

   String getData();

   XmlString xgetData();

   boolean isSetData();

   void setData(String var1);

   void xsetData(XmlString var1);

   void unsetData();


   public static final class Factory {

      public static CTIdMap newInstance() {
         return (CTIdMap)POIXMLTypeLoader.newInstance(CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap newInstance(XmlOptions var0) {
         return (CTIdMap)POIXMLTypeLoader.newInstance(CTIdMap.type, var0);
      }

      public static CTIdMap parse(String var0) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(String var0, XmlOptions var1) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(File var0) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(URL var0) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(InputStream var0) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(Reader var0) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(XMLStreamReader var0) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(Node var0) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static CTIdMap parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static CTIdMap parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTIdMap)POIXMLTypeLoader.parse(var0, CTIdMap.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIdMap.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIdMap.type, var1);
      }

   }
}
