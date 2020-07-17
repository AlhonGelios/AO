package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;
import org.w3c.dom.Node;

public interface CTPositiveSize2D extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPositiveSize2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpositivesize2d0147type");


   long getCx();

   STPositiveCoordinate xgetCx();

   void setCx(long var1);

   void xsetCx(STPositiveCoordinate var1);

   long getCy();

   STPositiveCoordinate xgetCy();

   void setCy(long var1);

   void xsetCy(STPositiveCoordinate var1);


   public static final class Factory {

      public static CTPositiveSize2D newInstance() {
         return (CTPositiveSize2D)POIXMLTypeLoader.newInstance(CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D newInstance(XmlOptions var0) {
         return (CTPositiveSize2D)POIXMLTypeLoader.newInstance(CTPositiveSize2D.type, var0);
      }

      public static CTPositiveSize2D parse(String var0) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(File var0) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(URL var0) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(InputStream var0) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(Reader var0) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(XMLStreamReader var0) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(Node var0) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static CTPositiveSize2D parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static CTPositiveSize2D parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPositiveSize2D)POIXMLTypeLoader.parse(var0, CTPositiveSize2D.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPositiveSize2D.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPositiveSize2D.type, var1);
      }

   }
}
