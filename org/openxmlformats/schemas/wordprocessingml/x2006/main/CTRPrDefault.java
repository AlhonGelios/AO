package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.w3c.dom.Node;

public interface CTRPrDefault extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRPrDefault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrprdefault5ebbtype");


   CTRPr getRPr();

   boolean isSetRPr();

   void setRPr(CTRPr var1);

   CTRPr addNewRPr();

   void unsetRPr();


   public static final class Factory {

      public static CTRPrDefault newInstance() {
         return (CTRPrDefault)POIXMLTypeLoader.newInstance(CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault newInstance(XmlOptions var0) {
         return (CTRPrDefault)POIXMLTypeLoader.newInstance(CTRPrDefault.type, var0);
      }

      public static CTRPrDefault parse(String var0) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(File var0) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(URL var0) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(InputStream var0) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(Reader var0) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(XMLStreamReader var0) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(Node var0) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static CTRPrDefault parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static CTRPrDefault parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRPrDefault)POIXMLTypeLoader.parse(var0, CTRPrDefault.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRPrDefault.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRPrDefault.type, var1);
      }

   }
}
