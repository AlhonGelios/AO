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
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType;
import org.w3c.dom.Node;

public interface CTPathShadeProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPathShadeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpathshadeproperties7ccctype");


   CTRelativeRect getFillToRect();

   boolean isSetFillToRect();

   void setFillToRect(CTRelativeRect var1);

   CTRelativeRect addNewFillToRect();

   void unsetFillToRect();

   STPathShadeType.Enum getPath();

   STPathShadeType xgetPath();

   boolean isSetPath();

   void setPath(STPathShadeType.Enum var1);

   void xsetPath(STPathShadeType var1);

   void unsetPath();


   public static final class Factory {

      public static CTPathShadeProperties newInstance() {
         return (CTPathShadeProperties)POIXMLTypeLoader.newInstance(CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties newInstance(XmlOptions var0) {
         return (CTPathShadeProperties)POIXMLTypeLoader.newInstance(CTPathShadeProperties.type, var0);
      }

      public static CTPathShadeProperties parse(String var0) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(File var0) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(URL var0) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(Reader var0) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(Node var0) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static CTPathShadeProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static CTPathShadeProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPathShadeProperties)POIXMLTypeLoader.parse(var0, CTPathShadeProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPathShadeProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPathShadeProperties.type, var1);
      }

   }
}
