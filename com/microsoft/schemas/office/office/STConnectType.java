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

public interface STConnectType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STConnectType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stconnecttype97adtype");
   STConnectType.Enum NONE = STConnectType.Enum.forString("none");
   STConnectType.Enum RECT = STConnectType.Enum.forString("rect");
   STConnectType.Enum SEGMENTS = STConnectType.Enum.forString("segments");
   STConnectType.Enum CUSTOM = STConnectType.Enum.forString("custom");
   int INT_NONE = 1;
   int INT_RECT = 2;
   int INT_SEGMENTS = 3;
   int INT_CUSTOM = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_RECT = 2;
      static final int INT_SEGMENTS = 3;
      static final int INT_CUSTOM = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STConnectType.Enum[]{new STConnectType.Enum("none", 1), new STConnectType.Enum("rect", 2), new STConnectType.Enum("segments", 3), new STConnectType.Enum("custom", 4)});
      private static final long serialVersionUID = 1L;


      public static STConnectType.Enum forString(String var0) {
         return (STConnectType.Enum)table.forString(var0);
      }

      public static STConnectType.Enum forInt(int var0) {
         return (STConnectType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STConnectType newValue(Object var0) {
         return (STConnectType)STConnectType.type.newValue(var0);
      }

      public static STConnectType newInstance() {
         return (STConnectType)POIXMLTypeLoader.newInstance(STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType newInstance(XmlOptions var0) {
         return (STConnectType)POIXMLTypeLoader.newInstance(STConnectType.type, var0);
      }

      public static STConnectType parse(String var0) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(String var0, XmlOptions var1) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(File var0) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(URL var0) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(InputStream var0) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(Reader var0) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(XMLStreamReader var0) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(Node var0) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static STConnectType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, (XmlOptions)null);
      }

      public static STConnectType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STConnectType)POIXMLTypeLoader.parse(var0, STConnectType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STConnectType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STConnectType.type, var1);
      }

   }
}
