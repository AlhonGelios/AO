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

public interface STTheme extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttheme58b9type");
   STTheme.Enum MAJOR_EAST_ASIA = STTheme.Enum.forString("majorEastAsia");
   STTheme.Enum MAJOR_BIDI = STTheme.Enum.forString("majorBidi");
   STTheme.Enum MAJOR_ASCII = STTheme.Enum.forString("majorAscii");
   STTheme.Enum MAJOR_H_ANSI = STTheme.Enum.forString("majorHAnsi");
   STTheme.Enum MINOR_EAST_ASIA = STTheme.Enum.forString("minorEastAsia");
   STTheme.Enum MINOR_BIDI = STTheme.Enum.forString("minorBidi");
   STTheme.Enum MINOR_ASCII = STTheme.Enum.forString("minorAscii");
   STTheme.Enum MINOR_H_ANSI = STTheme.Enum.forString("minorHAnsi");
   int INT_MAJOR_EAST_ASIA = 1;
   int INT_MAJOR_BIDI = 2;
   int INT_MAJOR_ASCII = 3;
   int INT_MAJOR_H_ANSI = 4;
   int INT_MINOR_EAST_ASIA = 5;
   int INT_MINOR_BIDI = 6;
   int INT_MINOR_ASCII = 7;
   int INT_MINOR_H_ANSI = 8;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTheme newValue(Object var0) {
         return (STTheme)STTheme.type.newValue(var0);
      }

      public static STTheme newInstance() {
         return (STTheme)POIXMLTypeLoader.newInstance(STTheme.type, (XmlOptions)null);
      }

      public static STTheme newInstance(XmlOptions var0) {
         return (STTheme)POIXMLTypeLoader.newInstance(STTheme.type, var0);
      }

      public static STTheme parse(String var0) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(String var0, XmlOptions var1) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(File var0) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(URL var0) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(InputStream var0) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(Reader var0) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(XMLStreamReader var0) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(Node var0) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static STTheme parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, (XmlOptions)null);
      }

      public static STTheme parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTheme)POIXMLTypeLoader.parse(var0, STTheme.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTheme.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTheme.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_MAJOR_EAST_ASIA = 1;
      static final int INT_MAJOR_BIDI = 2;
      static final int INT_MAJOR_ASCII = 3;
      static final int INT_MAJOR_H_ANSI = 4;
      static final int INT_MINOR_EAST_ASIA = 5;
      static final int INT_MINOR_BIDI = 6;
      static final int INT_MINOR_ASCII = 7;
      static final int INT_MINOR_H_ANSI = 8;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTheme.Enum[]{new STTheme.Enum("majorEastAsia", 1), new STTheme.Enum("majorBidi", 2), new STTheme.Enum("majorAscii", 3), new STTheme.Enum("majorHAnsi", 4), new STTheme.Enum("minorEastAsia", 5), new STTheme.Enum("minorBidi", 6), new STTheme.Enum("minorAscii", 7), new STTheme.Enum("minorHAnsi", 8)});
      private static final long serialVersionUID = 1L;


      public static STTheme.Enum forString(String var0) {
         return (STTheme.Enum)table.forString(var0);
      }

      public static STTheme.Enum forInt(int var0) {
         return (STTheme.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
