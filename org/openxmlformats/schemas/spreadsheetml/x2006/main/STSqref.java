package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STSqref extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSqref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsqrefb044type");


   List getListValue();

   List xgetListValue();

   void setListValue(List var1);

   List listValue();

   List xlistValue();

   void set(List var1);


   public static final class Factory {

      public static STSqref newValue(Object var0) {
         return (STSqref)STSqref.type.newValue(var0);
      }

      public static STSqref newInstance() {
         return (STSqref)POIXMLTypeLoader.newInstance(STSqref.type, (XmlOptions)null);
      }

      public static STSqref newInstance(XmlOptions var0) {
         return (STSqref)POIXMLTypeLoader.newInstance(STSqref.type, var0);
      }

      public static STSqref parse(String var0) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(String var0, XmlOptions var1) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(File var0) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(URL var0) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(InputStream var0) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(Reader var0) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(XMLStreamReader var0) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(Node var0) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static STSqref parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, (XmlOptions)null);
      }

      public static STSqref parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSqref)POIXMLTypeLoader.parse(var0, STSqref.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSqref.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSqref.type, var1);
      }

   }
}
