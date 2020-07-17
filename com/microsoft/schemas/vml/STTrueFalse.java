package com.microsoft.schemas.vml;

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

public interface STTrueFalse extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTrueFalse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttruefalse4ab9type");
   STTrueFalse.Enum T = STTrueFalse.Enum.forString("t");
   STTrueFalse.Enum F = STTrueFalse.Enum.forString("f");
   STTrueFalse.Enum TRUE = STTrueFalse.Enum.forString("true");
   STTrueFalse.Enum FALSE = STTrueFalse.Enum.forString("false");
   int INT_T = 1;
   int INT_F = 2;
   int INT_TRUE = 3;
   int INT_FALSE = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTrueFalse newValue(Object var0) {
         return (STTrueFalse)STTrueFalse.type.newValue(var0);
      }

      public static STTrueFalse newInstance() {
         return (STTrueFalse)POIXMLTypeLoader.newInstance(STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse newInstance(XmlOptions var0) {
         return (STTrueFalse)POIXMLTypeLoader.newInstance(STTrueFalse.type, var0);
      }

      public static STTrueFalse parse(String var0) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(String var0, XmlOptions var1) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(File var0) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(URL var0) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(InputStream var0) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(Reader var0) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(XMLStreamReader var0) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(Node var0) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static STTrueFalse parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static STTrueFalse parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTrueFalse)POIXMLTypeLoader.parse(var0, STTrueFalse.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTrueFalse.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTrueFalse.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_T = 1;
      static final int INT_F = 2;
      static final int INT_TRUE = 3;
      static final int INT_FALSE = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTrueFalse.Enum[]{new STTrueFalse.Enum("t", 1), new STTrueFalse.Enum("f", 2), new STTrueFalse.Enum("true", 3), new STTrueFalse.Enum("false", 4)});
      private static final long serialVersionUID = 1L;


      public static STTrueFalse.Enum forString(String var0) {
         return (STTrueFalse.Enum)table.forString(var0);
      }

      public static STTrueFalse.Enum forInt(int var0) {
         return (STTrueFalse.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
