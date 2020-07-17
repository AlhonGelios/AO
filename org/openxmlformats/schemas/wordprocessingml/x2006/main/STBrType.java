package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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

public interface STBrType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBrType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stbrtypeb52etype");
   STBrType.Enum PAGE = STBrType.Enum.forString("page");
   STBrType.Enum COLUMN = STBrType.Enum.forString("column");
   STBrType.Enum TEXT_WRAPPING = STBrType.Enum.forString("textWrapping");
   int INT_PAGE = 1;
   int INT_COLUMN = 2;
   int INT_TEXT_WRAPPING = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STBrType newValue(Object var0) {
         return (STBrType)STBrType.type.newValue(var0);
      }

      public static STBrType newInstance() {
         return (STBrType)POIXMLTypeLoader.newInstance(STBrType.type, (XmlOptions)null);
      }

      public static STBrType newInstance(XmlOptions var0) {
         return (STBrType)POIXMLTypeLoader.newInstance(STBrType.type, var0);
      }

      public static STBrType parse(String var0) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(String var0, XmlOptions var1) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(File var0) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(URL var0) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(InputStream var0) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(Reader var0) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(XMLStreamReader var0) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(Node var0) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static STBrType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, (XmlOptions)null);
      }

      public static STBrType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBrType)POIXMLTypeLoader.parse(var0, STBrType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBrType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBrType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_PAGE = 1;
      static final int INT_COLUMN = 2;
      static final int INT_TEXT_WRAPPING = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STBrType.Enum[]{new STBrType.Enum("page", 1), new STBrType.Enum("column", 2), new STBrType.Enum("textWrapping", 3)});
      private static final long serialVersionUID = 1L;


      public static STBrType.Enum forString(String var0) {
         return (STBrType.Enum)table.forString(var0);
      }

      public static STBrType.Enum forInt(int var0) {
         return (STBrType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
