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

public interface STHighlightColor extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHighlightColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthighlightcolora8e9type");
   STHighlightColor.Enum BLACK = STHighlightColor.Enum.forString("black");
   STHighlightColor.Enum BLUE = STHighlightColor.Enum.forString("blue");
   STHighlightColor.Enum CYAN = STHighlightColor.Enum.forString("cyan");
   STHighlightColor.Enum GREEN = STHighlightColor.Enum.forString("green");
   STHighlightColor.Enum MAGENTA = STHighlightColor.Enum.forString("magenta");
   STHighlightColor.Enum RED = STHighlightColor.Enum.forString("red");
   STHighlightColor.Enum YELLOW = STHighlightColor.Enum.forString("yellow");
   STHighlightColor.Enum WHITE = STHighlightColor.Enum.forString("white");
   STHighlightColor.Enum DARK_BLUE = STHighlightColor.Enum.forString("darkBlue");
   STHighlightColor.Enum DARK_CYAN = STHighlightColor.Enum.forString("darkCyan");
   STHighlightColor.Enum DARK_GREEN = STHighlightColor.Enum.forString("darkGreen");
   STHighlightColor.Enum DARK_MAGENTA = STHighlightColor.Enum.forString("darkMagenta");
   STHighlightColor.Enum DARK_RED = STHighlightColor.Enum.forString("darkRed");
   STHighlightColor.Enum DARK_YELLOW = STHighlightColor.Enum.forString("darkYellow");
   STHighlightColor.Enum DARK_GRAY = STHighlightColor.Enum.forString("darkGray");
   STHighlightColor.Enum LIGHT_GRAY = STHighlightColor.Enum.forString("lightGray");
   STHighlightColor.Enum NONE = STHighlightColor.Enum.forString("none");
   int INT_BLACK = 1;
   int INT_BLUE = 2;
   int INT_CYAN = 3;
   int INT_GREEN = 4;
   int INT_MAGENTA = 5;
   int INT_RED = 6;
   int INT_YELLOW = 7;
   int INT_WHITE = 8;
   int INT_DARK_BLUE = 9;
   int INT_DARK_CYAN = 10;
   int INT_DARK_GREEN = 11;
   int INT_DARK_MAGENTA = 12;
   int INT_DARK_RED = 13;
   int INT_DARK_YELLOW = 14;
   int INT_DARK_GRAY = 15;
   int INT_LIGHT_GRAY = 16;
   int INT_NONE = 17;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STHighlightColor newValue(Object var0) {
         return (STHighlightColor)STHighlightColor.type.newValue(var0);
      }

      public static STHighlightColor newInstance() {
         return (STHighlightColor)POIXMLTypeLoader.newInstance(STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor newInstance(XmlOptions var0) {
         return (STHighlightColor)POIXMLTypeLoader.newInstance(STHighlightColor.type, var0);
      }

      public static STHighlightColor parse(String var0) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(String var0, XmlOptions var1) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(File var0) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(URL var0) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(InputStream var0) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(Reader var0) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(XMLStreamReader var0) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(Node var0) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static STHighlightColor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static STHighlightColor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHighlightColor)POIXMLTypeLoader.parse(var0, STHighlightColor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHighlightColor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHighlightColor.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BLACK = 1;
      static final int INT_BLUE = 2;
      static final int INT_CYAN = 3;
      static final int INT_GREEN = 4;
      static final int INT_MAGENTA = 5;
      static final int INT_RED = 6;
      static final int INT_YELLOW = 7;
      static final int INT_WHITE = 8;
      static final int INT_DARK_BLUE = 9;
      static final int INT_DARK_CYAN = 10;
      static final int INT_DARK_GREEN = 11;
      static final int INT_DARK_MAGENTA = 12;
      static final int INT_DARK_RED = 13;
      static final int INT_DARK_YELLOW = 14;
      static final int INT_DARK_GRAY = 15;
      static final int INT_LIGHT_GRAY = 16;
      static final int INT_NONE = 17;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHighlightColor.Enum[]{new STHighlightColor.Enum("black", 1), new STHighlightColor.Enum("blue", 2), new STHighlightColor.Enum("cyan", 3), new STHighlightColor.Enum("green", 4), new STHighlightColor.Enum("magenta", 5), new STHighlightColor.Enum("red", 6), new STHighlightColor.Enum("yellow", 7), new STHighlightColor.Enum("white", 8), new STHighlightColor.Enum("darkBlue", 9), new STHighlightColor.Enum("darkCyan", 10), new STHighlightColor.Enum("darkGreen", 11), new STHighlightColor.Enum("darkMagenta", 12), new STHighlightColor.Enum("darkRed", 13), new STHighlightColor.Enum("darkYellow", 14), new STHighlightColor.Enum("darkGray", 15), new STHighlightColor.Enum("lightGray", 16), new STHighlightColor.Enum("none", 17)});
      private static final long serialVersionUID = 1L;


      public static STHighlightColor.Enum forString(String var0) {
         return (STHighlightColor.Enum)table.forString(var0);
      }

      public static STHighlightColor.Enum forInt(int var0) {
         return (STHighlightColor.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
