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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData;
import org.w3c.dom.Node;

public interface CTStrRef extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStrRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstrref5d1atype");


   String getF();

   XmlString xgetF();

   void setF(String var1);

   void xsetF(XmlString var1);

   CTStrData getStrCache();

   boolean isSetStrCache();

   void setStrCache(CTStrData var1);

   CTStrData addNewStrCache();

   void unsetStrCache();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTStrRef newInstance() {
         return (CTStrRef)POIXMLTypeLoader.newInstance(CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef newInstance(XmlOptions var0) {
         return (CTStrRef)POIXMLTypeLoader.newInstance(CTStrRef.type, var0);
      }

      public static CTStrRef parse(String var0) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(File var0) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(URL var0) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(InputStream var0) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(Reader var0) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(XMLStreamReader var0) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(Node var0) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static CTStrRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static CTStrRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStrRef)POIXMLTypeLoader.parse(var0, CTStrRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrRef.type, var1);
      }

   }
}
