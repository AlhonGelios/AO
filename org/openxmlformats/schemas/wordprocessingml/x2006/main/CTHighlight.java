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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;
import org.w3c.dom.Node;

public interface CTHighlight extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHighlight.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthighlight071etype");


   STHighlightColor.Enum getVal();

   STHighlightColor xgetVal();

   void setVal(STHighlightColor.Enum var1);

   void xsetVal(STHighlightColor var1);


   public static final class Factory {

      public static CTHighlight newInstance() {
         return (CTHighlight)POIXMLTypeLoader.newInstance(CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight newInstance(XmlOptions var0) {
         return (CTHighlight)POIXMLTypeLoader.newInstance(CTHighlight.type, var0);
      }

      public static CTHighlight parse(String var0) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(File var0) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(URL var0) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(InputStream var0) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(Reader var0) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(XMLStreamReader var0) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(Node var0) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static CTHighlight parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static CTHighlight parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHighlight)POIXMLTypeLoader.parse(var0, CTHighlight.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHighlight.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHighlight.type, var1);
      }

   }
}
