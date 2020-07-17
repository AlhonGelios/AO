package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignRun;
import org.w3c.dom.Node;

public interface CTVerticalAlignFontProperty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVerticalAlignFontProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctverticalalignfontproperty89f2type");


   STVerticalAlignRun.Enum getVal();

   STVerticalAlignRun xgetVal();

   void setVal(STVerticalAlignRun.Enum var1);

   void xsetVal(STVerticalAlignRun var1);


   public static final class Factory {

      public static CTVerticalAlignFontProperty newInstance() {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.newInstance(CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty newInstance(XmlOptions var0) {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.newInstance(CTVerticalAlignFontProperty.type, var0);
      }

      public static CTVerticalAlignFontProperty parse(String var0) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(File var0) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(URL var0) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(InputStream var0) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(Reader var0) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(XMLStreamReader var0) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(Node var0) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static CTVerticalAlignFontProperty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static CTVerticalAlignFontProperty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVerticalAlignFontProperty)POIXMLTypeLoader.parse(var0, CTVerticalAlignFontProperty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVerticalAlignFontProperty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVerticalAlignFontProperty.type, var1);
      }

   }
}
