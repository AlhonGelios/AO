package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextAlignment;
import org.w3c.dom.Node;

public interface CTTextAlignment extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextalignment495ctype");


   STTextAlignment.Enum getVal();

   STTextAlignment xgetVal();

   void setVal(STTextAlignment.Enum var1);

   void xsetVal(STTextAlignment var1);


   public static final class Factory {

      public static CTTextAlignment newInstance() {
         return (CTTextAlignment)POIXMLTypeLoader.newInstance(CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment newInstance(XmlOptions var0) {
         return (CTTextAlignment)POIXMLTypeLoader.newInstance(CTTextAlignment.type, var0);
      }

      public static CTTextAlignment parse(String var0) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(File var0) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(URL var0) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(InputStream var0) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(Reader var0) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(XMLStreamReader var0) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(Node var0) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static CTTextAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static CTTextAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextAlignment)POIXMLTypeLoader.parse(var0, CTTextAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextAlignment.type, var1);
      }

   }
}
