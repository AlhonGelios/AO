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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTBoolean extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBoolean.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbooleancc3etype");


   boolean getVal();

   XmlBoolean xgetVal();

   boolean isSetVal();

   void setVal(boolean var1);

   void xsetVal(XmlBoolean var1);

   void unsetVal();


   public static final class Factory {

      public static CTBoolean newInstance() {
         return (CTBoolean)POIXMLTypeLoader.newInstance(CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean newInstance(XmlOptions var0) {
         return (CTBoolean)POIXMLTypeLoader.newInstance(CTBoolean.type, var0);
      }

      public static CTBoolean parse(String var0) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(File var0) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(URL var0) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(InputStream var0) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(Reader var0) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(XMLStreamReader var0) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(Node var0) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static CTBoolean parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static CTBoolean parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBoolean)POIXMLTypeLoader.parse(var0, CTBoolean.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBoolean.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBoolean.type, var1);
      }

   }
}
