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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPictureBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;
import org.w3c.dom.Node;

public interface CTObject extends CTPictureBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctobject47c9type");


   CTControl getControl();

   boolean isSetControl();

   void setControl(CTControl var1);

   CTControl addNewControl();

   void unsetControl();

   BigInteger getDxaOrig();

   STTwipsMeasure xgetDxaOrig();

   boolean isSetDxaOrig();

   void setDxaOrig(BigInteger var1);

   void xsetDxaOrig(STTwipsMeasure var1);

   void unsetDxaOrig();

   BigInteger getDyaOrig();

   STTwipsMeasure xgetDyaOrig();

   boolean isSetDyaOrig();

   void setDyaOrig(BigInteger var1);

   void xsetDyaOrig(STTwipsMeasure var1);

   void unsetDyaOrig();


   public static final class Factory {

      public static CTObject newInstance() {
         return (CTObject)POIXMLTypeLoader.newInstance(CTObject.type, (XmlOptions)null);
      }

      public static CTObject newInstance(XmlOptions var0) {
         return (CTObject)POIXMLTypeLoader.newInstance(CTObject.type, var0);
      }

      public static CTObject parse(String var0) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(String var0, XmlOptions var1) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(File var0) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(URL var0) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(InputStream var0) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(Reader var0) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(XMLStreamReader var0) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(Node var0) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static CTObject parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, (XmlOptions)null);
      }

      public static CTObject parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTObject)POIXMLTypeLoader.parse(var0, CTObject.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTObject.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTObject.type, var1);
      }

   }
}
