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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent;
import org.w3c.dom.Node;

public interface CTTextSpacingPercent extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextSpacingPercent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextspacingpercent322atype");


   int getVal();

   STTextSpacingPercent xgetVal();

   void setVal(int var1);

   void xsetVal(STTextSpacingPercent var1);


   public static final class Factory {

      public static CTTextSpacingPercent newInstance() {
         return (CTTextSpacingPercent)POIXMLTypeLoader.newInstance(CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent newInstance(XmlOptions var0) {
         return (CTTextSpacingPercent)POIXMLTypeLoader.newInstance(CTTextSpacingPercent.type, var0);
      }

      public static CTTextSpacingPercent parse(String var0) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(File var0) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(URL var0) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(InputStream var0) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(Reader var0) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(XMLStreamReader var0) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(Node var0) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static CTTextSpacingPercent parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static CTTextSpacingPercent parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextSpacingPercent)POIXMLTypeLoader.parse(var0, CTTextSpacingPercent.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacingPercent.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacingPercent.type, var1);
      }

   }
}
