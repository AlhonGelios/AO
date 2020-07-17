package com.microsoft.schemas.office.excel;

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

public interface STTrueFalseBlank extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTrueFalseBlank.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttruefalseblanka061type");
   STTrueFalseBlank.Enum TRUE = STTrueFalseBlank.Enum.forString("True");
   STTrueFalseBlank.Enum T = STTrueFalseBlank.Enum.forString("t");
   STTrueFalseBlank.Enum FALSE = STTrueFalseBlank.Enum.forString("False");
   STTrueFalseBlank.Enum F = STTrueFalseBlank.Enum.forString("f");
   STTrueFalseBlank.Enum X = STTrueFalseBlank.Enum.forString("");
   int INT_TRUE = 1;
   int INT_T = 2;
   int INT_FALSE = 3;
   int INT_F = 4;
   int INT_X = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TRUE = 1;
      static final int INT_T = 2;
      static final int INT_FALSE = 3;
      static final int INT_F = 4;
      static final int INT_X = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTrueFalseBlank.Enum[]{new STTrueFalseBlank.Enum("True", 1), new STTrueFalseBlank.Enum("t", 2), new STTrueFalseBlank.Enum("False", 3), new STTrueFalseBlank.Enum("f", 4), new STTrueFalseBlank.Enum("", 5)});
      private static final long serialVersionUID = 1L;


      public static STTrueFalseBlank.Enum forString(String var0) {
         return (STTrueFalseBlank.Enum)table.forString(var0);
      }

      public static STTrueFalseBlank.Enum forInt(int var0) {
         return (STTrueFalseBlank.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTrueFalseBlank newValue(Object var0) {
         return (STTrueFalseBlank)STTrueFalseBlank.type.newValue(var0);
      }

      public static STTrueFalseBlank newInstance() {
         return (STTrueFalseBlank)POIXMLTypeLoader.newInstance(STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank newInstance(XmlOptions var0) {
         return (STTrueFalseBlank)POIXMLTypeLoader.newInstance(STTrueFalseBlank.type, var0);
      }

      public static STTrueFalseBlank parse(String var0) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(String var0, XmlOptions var1) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(File var0) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(URL var0) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(InputStream var0) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(Reader var0) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(XMLStreamReader var0) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(Node var0) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static STTrueFalseBlank parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static STTrueFalseBlank parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTrueFalseBlank)POIXMLTypeLoader.parse(var0, STTrueFalseBlank.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTrueFalseBlank.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTrueFalseBlank.type, var1);
      }

   }
}
