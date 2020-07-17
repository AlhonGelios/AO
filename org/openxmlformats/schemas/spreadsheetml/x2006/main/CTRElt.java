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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTRElt extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRElt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrelt6464type");


   CTRPrElt getRPr();

   boolean isSetRPr();

   void setRPr(CTRPrElt var1);

   CTRPrElt addNewRPr();

   void unsetRPr();

   String getT();

   STXstring xgetT();

   void setT(String var1);

   void xsetT(STXstring var1);


   public static final class Factory {

      public static CTRElt newInstance() {
         return (CTRElt)POIXMLTypeLoader.newInstance(CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt newInstance(XmlOptions var0) {
         return (CTRElt)POIXMLTypeLoader.newInstance(CTRElt.type, var0);
      }

      public static CTRElt parse(String var0) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(File var0) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(URL var0) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(InputStream var0) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(Reader var0) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(XMLStreamReader var0) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(Node var0) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static CTRElt parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, (XmlOptions)null);
      }

      public static CTRElt parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRElt)POIXMLTypeLoader.parse(var0, CTRElt.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRElt.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRElt.type, var1);
      }

   }
}
