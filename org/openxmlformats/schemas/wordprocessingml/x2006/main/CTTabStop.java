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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc;
import org.w3c.dom.Node;

public interface CTTabStop extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTabStop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttabstop5ebbtype");


   STTabJc.Enum getVal();

   STTabJc xgetVal();

   void setVal(STTabJc.Enum var1);

   void xsetVal(STTabJc var1);

   STTabTlc.Enum getLeader();

   STTabTlc xgetLeader();

   boolean isSetLeader();

   void setLeader(STTabTlc.Enum var1);

   void xsetLeader(STTabTlc var1);

   void unsetLeader();

   BigInteger getPos();

   STSignedTwipsMeasure xgetPos();

   void setPos(BigInteger var1);

   void xsetPos(STSignedTwipsMeasure var1);


   public static final class Factory {

      public static CTTabStop newInstance() {
         return (CTTabStop)POIXMLTypeLoader.newInstance(CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop newInstance(XmlOptions var0) {
         return (CTTabStop)POIXMLTypeLoader.newInstance(CTTabStop.type, var0);
      }

      public static CTTabStop parse(String var0) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(File var0) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(URL var0) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(InputStream var0) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(Reader var0) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(XMLStreamReader var0) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(Node var0) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static CTTabStop parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static CTTabStop parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTabStop)POIXMLTypeLoader.parse(var0, CTTabStop.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTabStop.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTabStop.type, var1);
      }

   }
}
