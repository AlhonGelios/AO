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
import org.openxmlformats.schemas.drawingml.x2006.chart.STLayoutTarget;
import org.w3c.dom.Node;

public interface CTLayoutTarget extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLayoutTarget.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlayouttarget1001type");


   STLayoutTarget.Enum getVal();

   STLayoutTarget xgetVal();

   boolean isSetVal();

   void setVal(STLayoutTarget.Enum var1);

   void xsetVal(STLayoutTarget var1);

   void unsetVal();


   public static final class Factory {

      public static CTLayoutTarget newInstance() {
         return (CTLayoutTarget)POIXMLTypeLoader.newInstance(CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget newInstance(XmlOptions var0) {
         return (CTLayoutTarget)POIXMLTypeLoader.newInstance(CTLayoutTarget.type, var0);
      }

      public static CTLayoutTarget parse(String var0) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(File var0) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(URL var0) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(InputStream var0) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(Reader var0) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(XMLStreamReader var0) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(Node var0) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static CTLayoutTarget parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static CTLayoutTarget parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLayoutTarget)POIXMLTypeLoader.parse(var0, CTLayoutTarget.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLayoutTarget.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLayoutTarget.type, var1);
      }

   }
}
