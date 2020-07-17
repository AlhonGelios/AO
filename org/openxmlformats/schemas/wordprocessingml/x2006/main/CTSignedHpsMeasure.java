package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedHpsMeasure;
import org.w3c.dom.Node;

public interface CTSignedHpsMeasure extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSignedHpsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsignedhpsmeasure3099type");


   BigInteger getVal();

   STSignedHpsMeasure xgetVal();

   void setVal(BigInteger var1);

   void xsetVal(STSignedHpsMeasure var1);


   public static final class Factory {

      public static CTSignedHpsMeasure newInstance() {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.newInstance(CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure newInstance(XmlOptions var0) {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.newInstance(CTSignedHpsMeasure.type, var0);
      }

      public static CTSignedHpsMeasure parse(String var0) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(File var0) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(URL var0) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(Reader var0) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(Node var0) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static CTSignedHpsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static CTSignedHpsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSignedHpsMeasure)POIXMLTypeLoader.parse(var0, CTSignedHpsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignedHpsMeasure.type, var1);
      }

   }
}
