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
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.w3c.dom.Node;

public interface CTPath2DMoveTo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath2DMoveTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath2dmovetoa01etype");


   CTAdjPoint2D getPt();

   void setPt(CTAdjPoint2D var1);

   CTAdjPoint2D addNewPt();


   public static final class Factory {

      public static CTPath2DMoveTo newInstance() {
         return (CTPath2DMoveTo)POIXMLTypeLoader.newInstance(CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo newInstance(XmlOptions var0) {
         return (CTPath2DMoveTo)POIXMLTypeLoader.newInstance(CTPath2DMoveTo.type, var0);
      }

      public static CTPath2DMoveTo parse(String var0) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(File var0) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(URL var0) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(InputStream var0) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(Reader var0) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(XMLStreamReader var0) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(Node var0) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static CTPath2DMoveTo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static CTPath2DMoveTo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath2DMoveTo)POIXMLTypeLoader.parse(var0, CTPath2DMoveTo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DMoveTo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DMoveTo.type, var1);
      }

   }
}
