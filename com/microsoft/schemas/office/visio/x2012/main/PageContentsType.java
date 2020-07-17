package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.ConnectsType;
import com.microsoft.schemas.office.visio.x2012.main.ShapesType;
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
import org.w3c.dom.Node;

public interface PageContentsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PageContentsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pagecontentstypea5d0type");


   ShapesType getShapes();

   boolean isSetShapes();

   void setShapes(ShapesType var1);

   ShapesType addNewShapes();

   void unsetShapes();

   ConnectsType getConnects();

   boolean isSetConnects();

   void setConnects(ConnectsType var1);

   ConnectsType addNewConnects();

   void unsetConnects();


   public static final class Factory {

      public static PageContentsType newInstance() {
         return (PageContentsType)POIXMLTypeLoader.newInstance(PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType newInstance(XmlOptions var0) {
         return (PageContentsType)POIXMLTypeLoader.newInstance(PageContentsType.type, var0);
      }

      public static PageContentsType parse(String var0) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(String var0, XmlOptions var1) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(File var0) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(URL var0) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(InputStream var0) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(Reader var0) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(XMLStreamReader var0) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(Node var0) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static PageContentsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static PageContentsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PageContentsType)POIXMLTypeLoader.parse(var0, PageContentsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageContentsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageContentsType.type, var1);
      }

   }
}
