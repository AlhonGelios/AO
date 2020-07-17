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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTBreak extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbreak815etype");


   long getId();

   XmlUnsignedInt xgetId();

   boolean isSetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   void unsetId();

   long getMin();

   XmlUnsignedInt xgetMin();

   boolean isSetMin();

   void setMin(long var1);

   void xsetMin(XmlUnsignedInt var1);

   void unsetMin();

   long getMax();

   XmlUnsignedInt xgetMax();

   boolean isSetMax();

   void setMax(long var1);

   void xsetMax(XmlUnsignedInt var1);

   void unsetMax();

   boolean getMan();

   XmlBoolean xgetMan();

   boolean isSetMan();

   void setMan(boolean var1);

   void xsetMan(XmlBoolean var1);

   void unsetMan();

   boolean getPt();

   XmlBoolean xgetPt();

   boolean isSetPt();

   void setPt(boolean var1);

   void xsetPt(XmlBoolean var1);

   void unsetPt();


   public static final class Factory {

      public static CTBreak newInstance() {
         return (CTBreak)POIXMLTypeLoader.newInstance(CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak newInstance(XmlOptions var0) {
         return (CTBreak)POIXMLTypeLoader.newInstance(CTBreak.type, var0);
      }

      public static CTBreak parse(String var0) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(File var0) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(URL var0) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(InputStream var0) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(Reader var0) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(XMLStreamReader var0) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(Node var0) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static CTBreak parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, (XmlOptions)null);
      }

      public static CTBreak parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBreak)POIXMLTypeLoader.parse(var0, CTBreak.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBreak.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBreak.type, var1);
      }

   }
}
