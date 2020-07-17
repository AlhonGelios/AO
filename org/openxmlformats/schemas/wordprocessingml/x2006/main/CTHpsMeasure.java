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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHpsMeasure;
import org.w3c.dom.Node;

public interface CTHpsMeasure extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHpsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthpsmeasure3795type");


   BigInteger getVal();

   STHpsMeasure xgetVal();

   void setVal(BigInteger var1);

   void xsetVal(STHpsMeasure var1);


   public static final class Factory {

      public static CTHpsMeasure newInstance() {
         return (CTHpsMeasure)POIXMLTypeLoader.newInstance(CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure newInstance(XmlOptions var0) {
         return (CTHpsMeasure)POIXMLTypeLoader.newInstance(CTHpsMeasure.type, var0);
      }

      public static CTHpsMeasure parse(String var0) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(File var0) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(URL var0) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(Reader var0) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(Node var0) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static CTHpsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static CTHpsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHpsMeasure)POIXMLTypeLoader.parse(var0, CTHpsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHpsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHpsMeasure.type, var1);
      }

   }
}
