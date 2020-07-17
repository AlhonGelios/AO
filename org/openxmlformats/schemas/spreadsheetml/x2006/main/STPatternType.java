package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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

public interface STPatternType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPatternType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpatterntype7939type");
   STPatternType.Enum NONE = STPatternType.Enum.forString("none");
   STPatternType.Enum SOLID = STPatternType.Enum.forString("solid");
   STPatternType.Enum MEDIUM_GRAY = STPatternType.Enum.forString("mediumGray");
   STPatternType.Enum DARK_GRAY = STPatternType.Enum.forString("darkGray");
   STPatternType.Enum LIGHT_GRAY = STPatternType.Enum.forString("lightGray");
   STPatternType.Enum DARK_HORIZONTAL = STPatternType.Enum.forString("darkHorizontal");
   STPatternType.Enum DARK_VERTICAL = STPatternType.Enum.forString("darkVertical");
   STPatternType.Enum DARK_DOWN = STPatternType.Enum.forString("darkDown");
   STPatternType.Enum DARK_UP = STPatternType.Enum.forString("darkUp");
   STPatternType.Enum DARK_GRID = STPatternType.Enum.forString("darkGrid");
   STPatternType.Enum DARK_TRELLIS = STPatternType.Enum.forString("darkTrellis");
   STPatternType.Enum LIGHT_HORIZONTAL = STPatternType.Enum.forString("lightHorizontal");
   STPatternType.Enum LIGHT_VERTICAL = STPatternType.Enum.forString("lightVertical");
   STPatternType.Enum LIGHT_DOWN = STPatternType.Enum.forString("lightDown");
   STPatternType.Enum LIGHT_UP = STPatternType.Enum.forString("lightUp");
   STPatternType.Enum LIGHT_GRID = STPatternType.Enum.forString("lightGrid");
   STPatternType.Enum LIGHT_TRELLIS = STPatternType.Enum.forString("lightTrellis");
   STPatternType.Enum GRAY_125 = STPatternType.Enum.forString("gray125");
   STPatternType.Enum GRAY_0625 = STPatternType.Enum.forString("gray0625");
   int INT_NONE = 1;
   int INT_SOLID = 2;
   int INT_MEDIUM_GRAY = 3;
   int INT_DARK_GRAY = 4;
   int INT_LIGHT_GRAY = 5;
   int INT_DARK_HORIZONTAL = 6;
   int INT_DARK_VERTICAL = 7;
   int INT_DARK_DOWN = 8;
   int INT_DARK_UP = 9;
   int INT_DARK_GRID = 10;
   int INT_DARK_TRELLIS = 11;
   int INT_LIGHT_HORIZONTAL = 12;
   int INT_LIGHT_VERTICAL = 13;
   int INT_LIGHT_DOWN = 14;
   int INT_LIGHT_UP = 15;
   int INT_LIGHT_GRID = 16;
   int INT_LIGHT_TRELLIS = 17;
   int INT_GRAY_125 = 18;
   int INT_GRAY_0625 = 19;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STPatternType newValue(Object var0) {
         return (STPatternType)STPatternType.type.newValue(var0);
      }

      public static STPatternType newInstance() {
         return (STPatternType)POIXMLTypeLoader.newInstance(STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType newInstance(XmlOptions var0) {
         return (STPatternType)POIXMLTypeLoader.newInstance(STPatternType.type, var0);
      }

      public static STPatternType parse(String var0) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(String var0, XmlOptions var1) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(File var0) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(URL var0) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(InputStream var0) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(Reader var0) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(XMLStreamReader var0) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(Node var0) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static STPatternType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, (XmlOptions)null);
      }

      public static STPatternType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPatternType)POIXMLTypeLoader.parse(var0, STPatternType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPatternType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPatternType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_SOLID = 2;
      static final int INT_MEDIUM_GRAY = 3;
      static final int INT_DARK_GRAY = 4;
      static final int INT_LIGHT_GRAY = 5;
      static final int INT_DARK_HORIZONTAL = 6;
      static final int INT_DARK_VERTICAL = 7;
      static final int INT_DARK_DOWN = 8;
      static final int INT_DARK_UP = 9;
      static final int INT_DARK_GRID = 10;
      static final int INT_DARK_TRELLIS = 11;
      static final int INT_LIGHT_HORIZONTAL = 12;
      static final int INT_LIGHT_VERTICAL = 13;
      static final int INT_LIGHT_DOWN = 14;
      static final int INT_LIGHT_UP = 15;
      static final int INT_LIGHT_GRID = 16;
      static final int INT_LIGHT_TRELLIS = 17;
      static final int INT_GRAY_125 = 18;
      static final int INT_GRAY_0625 = 19;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPatternType.Enum[]{new STPatternType.Enum("none", 1), new STPatternType.Enum("solid", 2), new STPatternType.Enum("mediumGray", 3), new STPatternType.Enum("darkGray", 4), new STPatternType.Enum("lightGray", 5), new STPatternType.Enum("darkHorizontal", 6), new STPatternType.Enum("darkVertical", 7), new STPatternType.Enum("darkDown", 8), new STPatternType.Enum("darkUp", 9), new STPatternType.Enum("darkGrid", 10), new STPatternType.Enum("darkTrellis", 11), new STPatternType.Enum("lightHorizontal", 12), new STPatternType.Enum("lightVertical", 13), new STPatternType.Enum("lightDown", 14), new STPatternType.Enum("lightUp", 15), new STPatternType.Enum("lightGrid", 16), new STPatternType.Enum("lightTrellis", 17), new STPatternType.Enum("gray125", 18), new STPatternType.Enum("gray0625", 19)});
      private static final long serialVersionUID = 1L;


      public static STPatternType.Enum forString(String var0) {
         return (STPatternType.Enum)table.forString(var0);
      }

      public static STPatternType.Enum forInt(int var0) {
         return (STPatternType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
