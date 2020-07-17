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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPoint;
import org.w3c.dom.Node;

public interface CTTextSpacingPoint extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextSpacingPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextspacingpoint6cf5type");


   int getVal();

   STTextSpacingPoint xgetVal();

   void setVal(int var1);

   void xsetVal(STTextSpacingPoint var1);


   public static final class Factory {

      public static CTTextSpacingPoint newInstance() {
         return (CTTextSpacingPoint)POIXMLTypeLoader.newInstance(CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint newInstance(XmlOptions var0) {
         return (CTTextSpacingPoint)POIXMLTypeLoader.newInstance(CTTextSpacingPoint.type, var0);
      }

      public static CTTextSpacingPoint parse(String var0) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(File var0) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(URL var0) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(InputStream var0) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(Reader var0) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(XMLStreamReader var0) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(Node var0) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static CTTextSpacingPoint parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static CTTextSpacingPoint parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextSpacingPoint)POIXMLTypeLoader.parse(var0, CTTextSpacingPoint.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacingPoint.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacingPoint.type, var1);
      }

   }
}
