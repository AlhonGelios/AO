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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;
import org.w3c.dom.Node;

public interface CTNumDataSource extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumDataSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumdatasourcef0bbtype");


   CTNumRef getNumRef();

   boolean isSetNumRef();

   void setNumRef(CTNumRef var1);

   CTNumRef addNewNumRef();

   void unsetNumRef();

   CTNumData getNumLit();

   boolean isSetNumLit();

   void setNumLit(CTNumData var1);

   CTNumData addNewNumLit();

   void unsetNumLit();


   public static final class Factory {

      public static CTNumDataSource newInstance() {
         return (CTNumDataSource)POIXMLTypeLoader.newInstance(CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource newInstance(XmlOptions var0) {
         return (CTNumDataSource)POIXMLTypeLoader.newInstance(CTNumDataSource.type, var0);
      }

      public static CTNumDataSource parse(String var0) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(File var0) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(URL var0) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(InputStream var0) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(Reader var0) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(XMLStreamReader var0) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(Node var0) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static CTNumDataSource parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static CTNumDataSource parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumDataSource)POIXMLTypeLoader.parse(var0, CTNumDataSource.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumDataSource.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumDataSource.type, var1);
      }

   }
}
