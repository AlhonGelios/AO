package com.microsoft.schemas.office.office;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STInsetMode extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STInsetMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stinsetmode3b89type");
   STInsetMode.Enum AUTO = STInsetMode.Enum.forString("auto");
   STInsetMode.Enum CUSTOM = STInsetMode.Enum.forString("custom");
   int INT_AUTO = 1;
   int INT_CUSTOM = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AUTO = 1;
      static final int INT_CUSTOM = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STInsetMode.Enum[]{new STInsetMode.Enum("auto", 1), new STInsetMode.Enum("custom", 2)});
      private static final long serialVersionUID = 1L;


      public static STInsetMode.Enum forString(String var0) {
         return (STInsetMode.Enum)table.forString(var0);
      }

      public static STInsetMode.Enum forInt(int var0) {
         return (STInsetMode.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STInsetMode newValue(Object var0) {
         return (STInsetMode)STInsetMode.type.newValue(var0);
      }

      public static STInsetMode newInstance() {
         return (STInsetMode)POIXMLTypeLoader.newInstance(STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode newInstance(XmlOptions var0) {
         return (STInsetMode)POIXMLTypeLoader.newInstance(STInsetMode.type, var0);
      }

      public static STInsetMode parse(String var0) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(String var0, XmlOptions var1) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(File var0) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(URL var0) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(InputStream var0) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(Reader var0) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(XMLStreamReader var0) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(Node var0) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(Node var0, XmlOptions var1) throws XmlException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static STInsetMode parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static STInsetMode parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STInsetMode)POIXMLTypeLoader.parse(var0, STInsetMode.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STInsetMode.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STInsetMode.type, var1);
      }

   }
}
