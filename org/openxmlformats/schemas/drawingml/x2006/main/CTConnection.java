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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId;
import org.w3c.dom.Node;

public interface CTConnection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTConnection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctconnection7fb9type");


   long getId();

   STDrawingElementId xgetId();

   void setId(long var1);

   void xsetId(STDrawingElementId var1);

   long getIdx();

   XmlUnsignedInt xgetIdx();

   void setIdx(long var1);

   void xsetIdx(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTConnection newInstance() {
         return (CTConnection)POIXMLTypeLoader.newInstance(CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection newInstance(XmlOptions var0) {
         return (CTConnection)POIXMLTypeLoader.newInstance(CTConnection.type, var0);
      }

      public static CTConnection parse(String var0) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(File var0) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(URL var0) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(InputStream var0) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(Reader var0) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(XMLStreamReader var0) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(Node var0) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static CTConnection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, (XmlOptions)null);
      }

      public static CTConnection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTConnection)POIXMLTypeLoader.parse(var0, CTConnection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnection.type, var1);
      }

   }
}
