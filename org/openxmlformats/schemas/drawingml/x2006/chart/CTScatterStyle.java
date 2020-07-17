package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.STScatterStyle;
import org.w3c.dom.Node;

public interface CTScatterStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTScatterStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctscatterstyle94c9type");


   STScatterStyle.Enum getVal();

   STScatterStyle xgetVal();

   boolean isSetVal();

   void setVal(STScatterStyle.Enum var1);

   void xsetVal(STScatterStyle var1);

   void unsetVal();


   public static final class Factory {

      public static CTScatterStyle newInstance() {
         return (CTScatterStyle)POIXMLTypeLoader.newInstance(CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle newInstance(XmlOptions var0) {
         return (CTScatterStyle)POIXMLTypeLoader.newInstance(CTScatterStyle.type, var0);
      }

      public static CTScatterStyle parse(String var0) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(File var0) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(URL var0) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(Reader var0) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(Node var0) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static CTScatterStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static CTScatterStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTScatterStyle)POIXMLTypeLoader.parse(var0, CTScatterStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScatterStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScatterStyle.type, var1);
      }

   }
}
