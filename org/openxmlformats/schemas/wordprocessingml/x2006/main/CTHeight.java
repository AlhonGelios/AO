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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;
import org.w3c.dom.Node;

public interface CTHeight extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHeight.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctheighta2e1type");


   BigInteger getVal();

   STTwipsMeasure xgetVal();

   boolean isSetVal();

   void setVal(BigInteger var1);

   void xsetVal(STTwipsMeasure var1);

   void unsetVal();

   STHeightRule$Enum getHRule();

   STHeightRule xgetHRule();

   boolean isSetHRule();

   void setHRule(STHeightRule$Enum var1);

   void xsetHRule(STHeightRule var1);

   void unsetHRule();


   public static final class Factory {

      public static CTHeight newInstance() {
         return (CTHeight)POIXMLTypeLoader.newInstance(CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight newInstance(XmlOptions var0) {
         return (CTHeight)POIXMLTypeLoader.newInstance(CTHeight.type, var0);
      }

      public static CTHeight parse(String var0) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(File var0) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(URL var0) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(InputStream var0) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(Reader var0) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(XMLStreamReader var0) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(Node var0) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static CTHeight parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, (XmlOptions)null);
      }

      public static CTHeight parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHeight)POIXMLTypeLoader.parse(var0, CTHeight.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHeight.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHeight.type, var1);
      }

   }
}
