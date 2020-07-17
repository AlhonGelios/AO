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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues;
import org.w3c.dom.Node;

public interface CTUnderlineProperty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTUnderlineProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctunderlineproperty8e20type");


   STUnderlineValues.Enum getVal();

   STUnderlineValues xgetVal();

   boolean isSetVal();

   void setVal(STUnderlineValues.Enum var1);

   void xsetVal(STUnderlineValues var1);

   void unsetVal();


   public static final class Factory {

      public static CTUnderlineProperty newInstance() {
         return (CTUnderlineProperty)POIXMLTypeLoader.newInstance(CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty newInstance(XmlOptions var0) {
         return (CTUnderlineProperty)POIXMLTypeLoader.newInstance(CTUnderlineProperty.type, var0);
      }

      public static CTUnderlineProperty parse(String var0) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(File var0) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(URL var0) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(InputStream var0) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(Reader var0) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(XMLStreamReader var0) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(Node var0) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static CTUnderlineProperty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static CTUnderlineProperty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTUnderlineProperty)POIXMLTypeLoader.parse(var0, CTUnderlineProperty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnderlineProperty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnderlineProperty.type, var1);
      }

   }
}
