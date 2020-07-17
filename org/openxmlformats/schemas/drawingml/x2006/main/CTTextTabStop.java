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
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType$Enum;
import org.w3c.dom.Node;

public interface CTTextTabStop extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextTabStop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttexttabstopb57btype");


   int getPos();

   STCoordinate32 xgetPos();

   boolean isSetPos();

   void setPos(int var1);

   void xsetPos(STCoordinate32 var1);

   void unsetPos();

   STTextTabAlignType$Enum getAlgn();

   STTextTabAlignType xgetAlgn();

   boolean isSetAlgn();

   void setAlgn(STTextTabAlignType$Enum var1);

   void xsetAlgn(STTextTabAlignType var1);

   void unsetAlgn();


   public static final class Factory {

      public static CTTextTabStop newInstance() {
         return (CTTextTabStop)POIXMLTypeLoader.newInstance(CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop newInstance(XmlOptions var0) {
         return (CTTextTabStop)POIXMLTypeLoader.newInstance(CTTextTabStop.type, var0);
      }

      public static CTTextTabStop parse(String var0) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(File var0) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(URL var0) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(InputStream var0) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(Reader var0) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(XMLStreamReader var0) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(Node var0) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static CTTextTabStop parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static CTTextTabStop parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextTabStop)POIXMLTypeLoader.parse(var0, CTTextTabStop.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextTabStop.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextTabStop.type, var1);
      }

   }
}
