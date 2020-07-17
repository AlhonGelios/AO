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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;
import org.w3c.dom.Node;

public interface CTInd extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctind4b93type");


   BigInteger getLeft();

   STSignedTwipsMeasure xgetLeft();

   boolean isSetLeft();

   void setLeft(BigInteger var1);

   void xsetLeft(STSignedTwipsMeasure var1);

   void unsetLeft();

   BigInteger getLeftChars();

   STDecimalNumber xgetLeftChars();

   boolean isSetLeftChars();

   void setLeftChars(BigInteger var1);

   void xsetLeftChars(STDecimalNumber var1);

   void unsetLeftChars();

   BigInteger getRight();

   STSignedTwipsMeasure xgetRight();

   boolean isSetRight();

   void setRight(BigInteger var1);

   void xsetRight(STSignedTwipsMeasure var1);

   void unsetRight();

   BigInteger getRightChars();

   STDecimalNumber xgetRightChars();

   boolean isSetRightChars();

   void setRightChars(BigInteger var1);

   void xsetRightChars(STDecimalNumber var1);

   void unsetRightChars();

   BigInteger getHanging();

   STTwipsMeasure xgetHanging();

   boolean isSetHanging();

   void setHanging(BigInteger var1);

   void xsetHanging(STTwipsMeasure var1);

   void unsetHanging();

   BigInteger getHangingChars();

   STDecimalNumber xgetHangingChars();

   boolean isSetHangingChars();

   void setHangingChars(BigInteger var1);

   void xsetHangingChars(STDecimalNumber var1);

   void unsetHangingChars();

   BigInteger getFirstLine();

   STTwipsMeasure xgetFirstLine();

   boolean isSetFirstLine();

   void setFirstLine(BigInteger var1);

   void xsetFirstLine(STTwipsMeasure var1);

   void unsetFirstLine();

   BigInteger getFirstLineChars();

   STDecimalNumber xgetFirstLineChars();

   boolean isSetFirstLineChars();

   void setFirstLineChars(BigInteger var1);

   void xsetFirstLineChars(STDecimalNumber var1);

   void unsetFirstLineChars();


   public static final class Factory {

      public static CTInd newInstance() {
         return (CTInd)POIXMLTypeLoader.newInstance(CTInd.type, (XmlOptions)null);
      }

      public static CTInd newInstance(XmlOptions var0) {
         return (CTInd)POIXMLTypeLoader.newInstance(CTInd.type, var0);
      }

      public static CTInd parse(String var0) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(String var0, XmlOptions var1) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(File var0) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(URL var0) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(InputStream var0) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(Reader var0) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(XMLStreamReader var0) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(Node var0) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static CTInd parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, (XmlOptions)null);
      }

      public static CTInd parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTInd)POIXMLTypeLoader.parse(var0, CTInd.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTInd.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTInd.type, var1);
      }

   }
}
