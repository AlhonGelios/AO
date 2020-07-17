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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.w3c.dom.Node;

public interface CTFtnEdnRef extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFtnEdnRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctftnednref89eetype");


   STOnOff.Enum getCustomMarkFollows();

   STOnOff xgetCustomMarkFollows();

   boolean isSetCustomMarkFollows();

   void setCustomMarkFollows(STOnOff.Enum var1);

   void xsetCustomMarkFollows(STOnOff var1);

   void unsetCustomMarkFollows();

   BigInteger getId();

   STDecimalNumber xgetId();

   void setId(BigInteger var1);

   void xsetId(STDecimalNumber var1);


   public static final class Factory {

      public static CTFtnEdnRef newInstance() {
         return (CTFtnEdnRef)POIXMLTypeLoader.newInstance(CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef newInstance(XmlOptions var0) {
         return (CTFtnEdnRef)POIXMLTypeLoader.newInstance(CTFtnEdnRef.type, var0);
      }

      public static CTFtnEdnRef parse(String var0) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(File var0) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(URL var0) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(InputStream var0) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(Reader var0) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(XMLStreamReader var0) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(Node var0) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static CTFtnEdnRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static CTFtnEdnRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFtnEdnRef)POIXMLTypeLoader.parse(var0, CTFtnEdnRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFtnEdnRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFtnEdnRef.type, var1);
      }

   }
}
