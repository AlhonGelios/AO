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
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;
import org.w3c.dom.Node;

public interface CTGeomRect extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGeomRect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgeomrect53dbtype");


   Object getL();

   STAdjCoordinate xgetL();

   void setL(Object var1);

   void xsetL(STAdjCoordinate var1);

   Object getT();

   STAdjCoordinate xgetT();

   void setT(Object var1);

   void xsetT(STAdjCoordinate var1);

   Object getR();

   STAdjCoordinate xgetR();

   void setR(Object var1);

   void xsetR(STAdjCoordinate var1);

   Object getB();

   STAdjCoordinate xgetB();

   void setB(Object var1);

   void xsetB(STAdjCoordinate var1);


   public static final class Factory {

      public static CTGeomRect newInstance() {
         return (CTGeomRect)POIXMLTypeLoader.newInstance(CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect newInstance(XmlOptions var0) {
         return (CTGeomRect)POIXMLTypeLoader.newInstance(CTGeomRect.type, var0);
      }

      public static CTGeomRect parse(String var0) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(File var0) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(URL var0) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(InputStream var0) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(Reader var0) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(XMLStreamReader var0) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(Node var0) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static CTGeomRect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static CTGeomRect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGeomRect)POIXMLTypeLoader.parse(var0, CTGeomRect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomRect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomRect.type, var1);
      }

   }
}
