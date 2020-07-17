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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
import org.w3c.dom.Node;

public interface CTAxDataSource extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAxDataSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctaxdatasource1440type");


   CTMultiLvlStrRef getMultiLvlStrRef();

   boolean isSetMultiLvlStrRef();

   void setMultiLvlStrRef(CTMultiLvlStrRef var1);

   CTMultiLvlStrRef addNewMultiLvlStrRef();

   void unsetMultiLvlStrRef();

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

   CTStrRef getStrRef();

   boolean isSetStrRef();

   void setStrRef(CTStrRef var1);

   CTStrRef addNewStrRef();

   void unsetStrRef();

   CTStrData getStrLit();

   boolean isSetStrLit();

   void setStrLit(CTStrData var1);

   CTStrData addNewStrLit();

   void unsetStrLit();


   public static final class Factory {

      public static CTAxDataSource newInstance() {
         return (CTAxDataSource)POIXMLTypeLoader.newInstance(CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource newInstance(XmlOptions var0) {
         return (CTAxDataSource)POIXMLTypeLoader.newInstance(CTAxDataSource.type, var0);
      }

      public static CTAxDataSource parse(String var0) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(File var0) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(URL var0) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(InputStream var0) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(Reader var0) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(XMLStreamReader var0) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(Node var0) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static CTAxDataSource parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static CTAxDataSource parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAxDataSource)POIXMLTypeLoader.parse(var0, CTAxDataSource.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAxDataSource.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAxDataSource.type, var1);
      }

   }
}
