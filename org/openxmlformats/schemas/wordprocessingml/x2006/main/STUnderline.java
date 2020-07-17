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

public interface STUnderline extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STUnderline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stunderlinef416type");
   STUnderline.Enum SINGLE = STUnderline.Enum.forString("single");
   STUnderline.Enum WORDS = STUnderline.Enum.forString("words");
   STUnderline.Enum DOUBLE = STUnderline.Enum.forString("double");
   STUnderline.Enum THICK = STUnderline.Enum.forString("thick");
   STUnderline.Enum DOTTED = STUnderline.Enum.forString("dotted");
   STUnderline.Enum DOTTED_HEAVY = STUnderline.Enum.forString("dottedHeavy");
   STUnderline.Enum DASH = STUnderline.Enum.forString("dash");
   STUnderline.Enum DASHED_HEAVY = STUnderline.Enum.forString("dashedHeavy");
   STUnderline.Enum DASH_LONG = STUnderline.Enum.forString("dashLong");
   STUnderline.Enum DASH_LONG_HEAVY = STUnderline.Enum.forString("dashLongHeavy");
   STUnderline.Enum DOT_DASH = STUnderline.Enum.forString("dotDash");
   STUnderline.Enum DASH_DOT_HEAVY = STUnderline.Enum.forString("dashDotHeavy");
   STUnderline.Enum DOT_DOT_DASH = STUnderline.Enum.forString("dotDotDash");
   STUnderline.Enum DASH_DOT_DOT_HEAVY = STUnderline.Enum.forString("dashDotDotHeavy");
   STUnderline.Enum WAVE = STUnderline.Enum.forString("wave");
   STUnderline.Enum WAVY_HEAVY = STUnderline.Enum.forString("wavyHeavy");
   STUnderline.Enum WAVY_DOUBLE = STUnderline.Enum.forString("wavyDouble");
   STUnderline.Enum NONE = STUnderline.Enum.forString("none");
   int INT_SINGLE = 1;
   int INT_WORDS = 2;
   int INT_DOUBLE = 3;
   int INT_THICK = 4;
   int INT_DOTTED = 5;
   int INT_DOTTED_HEAVY = 6;
   int INT_DASH = 7;
   int INT_DASHED_HEAVY = 8;
   int INT_DASH_LONG = 9;
   int INT_DASH_LONG_HEAVY = 10;
   int INT_DOT_DASH = 11;
   int INT_DASH_DOT_HEAVY = 12;
   int INT_DOT_DOT_DASH = 13;
   int INT_DASH_DOT_DOT_HEAVY = 14;
   int INT_WAVE = 15;
   int INT_WAVY_HEAVY = 16;
   int INT_WAVY_DOUBLE = 17;
   int INT_NONE = 18;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STUnderline newValue(Object var0) {
         return (STUnderline)STUnderline.type.newValue(var0);
      }

      public static STUnderline newInstance() {
         return (STUnderline)POIXMLTypeLoader.newInstance(STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline newInstance(XmlOptions var0) {
         return (STUnderline)POIXMLTypeLoader.newInstance(STUnderline.type, var0);
      }

      public static STUnderline parse(String var0) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(String var0, XmlOptions var1) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(File var0) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(URL var0) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(InputStream var0) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(Reader var0) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(XMLStreamReader var0) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(Node var0) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(Node var0, XmlOptions var1) throws XmlException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static STUnderline parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, (XmlOptions)null);
      }

      public static STUnderline parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STUnderline)POIXMLTypeLoader.parse(var0, STUnderline.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnderline.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnderline.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SINGLE = 1;
      static final int INT_WORDS = 2;
      static final int INT_DOUBLE = 3;
      static final int INT_THICK = 4;
      static final int INT_DOTTED = 5;
      static final int INT_DOTTED_HEAVY = 6;
      static final int INT_DASH = 7;
      static final int INT_DASHED_HEAVY = 8;
      static final int INT_DASH_LONG = 9;
      static final int INT_DASH_LONG_HEAVY = 10;
      static final int INT_DOT_DASH = 11;
      static final int INT_DASH_DOT_HEAVY = 12;
      static final int INT_DOT_DOT_DASH = 13;
      static final int INT_DASH_DOT_DOT_HEAVY = 14;
      static final int INT_WAVE = 15;
      static final int INT_WAVY_HEAVY = 16;
      static final int INT_WAVY_DOUBLE = 17;
      static final int INT_NONE = 18;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STUnderline.Enum[]{new STUnderline.Enum("single", 1), new STUnderline.Enum("words", 2), new STUnderline.Enum("double", 3), new STUnderline.Enum("thick", 4), new STUnderline.Enum("dotted", 5), new STUnderline.Enum("dottedHeavy", 6), new STUnderline.Enum("dash", 7), new STUnderline.Enum("dashedHeavy", 8), new STUnderline.Enum("dashLong", 9), new STUnderline.Enum("dashLongHeavy", 10), new STUnderline.Enum("dotDash", 11), new STUnderline.Enum("dashDotHeavy", 12), new STUnderline.Enum("dotDotDash", 13), new STUnderline.Enum("dashDotDotHeavy", 14), new STUnderline.Enum("wave", 15), new STUnderline.Enum("wavyHeavy", 16), new STUnderline.Enum("wavyDouble", 17), new STUnderline.Enum("none", 18)});
      private static final long serialVersionUID = 1L;


      public static STUnderline.Enum forString(String var0) {
         return (STUnderline.Enum)table.forString(var0);
      }

      public static STUnderline.Enum forInt(int var0) {
         return (STUnderline.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
