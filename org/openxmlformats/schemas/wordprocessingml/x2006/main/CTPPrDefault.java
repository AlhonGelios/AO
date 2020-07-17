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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.w3c.dom.Node;

public interface CTPPrDefault extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPPrDefault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpprdefaultf839type");


   CTPPr getPPr();

   boolean isSetPPr();

   void setPPr(CTPPr var1);

   CTPPr addNewPPr();

   void unsetPPr();


   public static final class Factory {

      public static CTPPrDefault newInstance() {
         return (CTPPrDefault)POIXMLTypeLoader.newInstance(CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault newInstance(XmlOptions var0) {
         return (CTPPrDefault)POIXMLTypeLoader.newInstance(CTPPrDefault.type, var0);
      }

      public static CTPPrDefault parse(String var0) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(File var0) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(URL var0) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(InputStream var0) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(Reader var0) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(XMLStreamReader var0) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(Node var0) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static CTPPrDefault parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static CTPPrDefault parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPPrDefault)POIXMLTypeLoader.parse(var0, CTPPrDefault.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPrDefault.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPrDefault.type, var1);
      }

   }
}
