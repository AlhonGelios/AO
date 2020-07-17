package org.openxmlformats.schemas.xpackage.x2006.digitalSignature;

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
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue;
import org.w3c.dom.Node;

public interface CTSignatureTime extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSignatureTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctsignaturetime461dtype");


   String getFormat();

   STFormat xgetFormat();

   void setFormat(String var1);

   void xsetFormat(STFormat var1);

   String getValue();

   STValue xgetValue();

   void setValue(String var1);

   void xsetValue(STValue var1);


   public static final class Factory {

      public static CTSignatureTime newInstance() {
         return (CTSignatureTime)POIXMLTypeLoader.newInstance(CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime newInstance(XmlOptions var0) {
         return (CTSignatureTime)POIXMLTypeLoader.newInstance(CTSignatureTime.type, var0);
      }

      public static CTSignatureTime parse(String var0) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(File var0) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(URL var0) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(InputStream var0) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(Reader var0) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(XMLStreamReader var0) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(Node var0) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static CTSignatureTime parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static CTSignatureTime parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSignatureTime)POIXMLTypeLoader.parse(var0, CTSignatureTime.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignatureTime.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignatureTime.type, var1);
      }

   }
}
