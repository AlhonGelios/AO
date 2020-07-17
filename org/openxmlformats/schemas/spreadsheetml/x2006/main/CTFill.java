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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.w3c.dom.Node;

public interface CTFill extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFill.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfill550ctype");


   CTPatternFill getPatternFill();

   boolean isSetPatternFill();

   void setPatternFill(CTPatternFill var1);

   CTPatternFill addNewPatternFill();

   void unsetPatternFill();

   CTGradientFill getGradientFill();

   boolean isSetGradientFill();

   void setGradientFill(CTGradientFill var1);

   CTGradientFill addNewGradientFill();

   void unsetGradientFill();


   public static final class Factory {

      public static CTFill newInstance() {
         return (CTFill)POIXMLTypeLoader.newInstance(CTFill.type, (XmlOptions)null);
      }

      public static CTFill newInstance(XmlOptions var0) {
         return (CTFill)POIXMLTypeLoader.newInstance(CTFill.type, var0);
      }

      public static CTFill parse(String var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(File var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(URL var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(InputStream var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(Reader var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(XMLStreamReader var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(Node var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFill.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFill.type, var1);
      }

   }
}
