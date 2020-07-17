package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STTextUnderlineType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextUnderlineType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextunderlinetype469atype");
   STTextUnderlineType.Enum NONE = STTextUnderlineType.Enum.forString("none");
   STTextUnderlineType.Enum WORDS = STTextUnderlineType.Enum.forString("words");
   STTextUnderlineType.Enum SNG = STTextUnderlineType.Enum.forString("sng");
   STTextUnderlineType.Enum DBL = STTextUnderlineType.Enum.forString("dbl");
   STTextUnderlineType.Enum HEAVY = STTextUnderlineType.Enum.forString("heavy");
   STTextUnderlineType.Enum DOTTED = STTextUnderlineType.Enum.forString("dotted");
   STTextUnderlineType.Enum DOTTED_HEAVY = STTextUnderlineType.Enum.forString("dottedHeavy");
   STTextUnderlineType.Enum DASH = STTextUnderlineType.Enum.forString("dash");
   STTextUnderlineType.Enum DASH_HEAVY = STTextUnderlineType.Enum.forString("dashHeavy");
   STTextUnderlineType.Enum DASH_LONG = STTextUnderlineType.Enum.forString("dashLong");
   STTextUnderlineType.Enum DASH_LONG_HEAVY = STTextUnderlineType.Enum.forString("dashLongHeavy");
   STTextUnderlineType.Enum DOT_DASH = STTextUnderlineType.Enum.forString("dotDash");
   STTextUnderlineType.Enum DOT_DASH_HEAVY = STTextUnderlineType.Enum.forString("dotDashHeavy");
   STTextUnderlineType.Enum DOT_DOT_DASH = STTextUnderlineType.Enum.forString("dotDotDash");
   STTextUnderlineType.Enum DOT_DOT_DASH_HEAVY = STTextUnderlineType.Enum.forString("dotDotDashHeavy");
   STTextUnderlineType.Enum WAVY = STTextUnderlineType.Enum.forString("wavy");
   STTextUnderlineType.Enum WAVY_HEAVY = STTextUnderlineType.Enum.forString("wavyHeavy");
   STTextUnderlineType.Enum WAVY_DBL = STTextUnderlineType.Enum.forString("wavyDbl");
   int INT_NONE = 1;
   int INT_WORDS = 2;
   int INT_SNG = 3;
   int INT_DBL = 4;
   int INT_HEAVY = 5;
   int INT_DOTTED = 6;
   int INT_DOTTED_HEAVY = 7;
   int INT_DASH = 8;
   int INT_DASH_HEAVY = 9;
   int INT_DASH_LONG = 10;
   int INT_DASH_LONG_HEAVY = 11;
   int INT_DOT_DASH = 12;
   int INT_DOT_DASH_HEAVY = 13;
   int INT_DOT_DOT_DASH = 14;
   int INT_DOT_DOT_DASH_HEAVY = 15;
   int INT_WAVY = 16;
   int INT_WAVY_HEAVY = 17;
   int INT_WAVY_DBL = 18;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_WORDS = 2;
      static final int INT_SNG = 3;
      static final int INT_DBL = 4;
      static final int INT_HEAVY = 5;
      static final int INT_DOTTED = 6;
      static final int INT_DOTTED_HEAVY = 7;
      static final int INT_DASH = 8;
      static final int INT_DASH_HEAVY = 9;
      static final int INT_DASH_LONG = 10;
      static final int INT_DASH_LONG_HEAVY = 11;
      static final int INT_DOT_DASH = 12;
      static final int INT_DOT_DASH_HEAVY = 13;
      static final int INT_DOT_DOT_DASH = 14;
      static final int INT_DOT_DOT_DASH_HEAVY = 15;
      static final int INT_WAVY = 16;
      static final int INT_WAVY_HEAVY = 17;
      static final int INT_WAVY_DBL = 18;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextUnderlineType.Enum[]{new STTextUnderlineType.Enum("none", 1), new STTextUnderlineType.Enum("words", 2), new STTextUnderlineType.Enum("sng", 3), new STTextUnderlineType.Enum("dbl", 4), new STTextUnderlineType.Enum("heavy", 5), new STTextUnderlineType.Enum("dotted", 6), new STTextUnderlineType.Enum("dottedHeavy", 7), new STTextUnderlineType.Enum("dash", 8), new STTextUnderlineType.Enum("dashHeavy", 9), new STTextUnderlineType.Enum("dashLong", 10), new STTextUnderlineType.Enum("dashLongHeavy", 11), new STTextUnderlineType.Enum("dotDash", 12), new STTextUnderlineType.Enum("dotDashHeavy", 13), new STTextUnderlineType.Enum("dotDotDash", 14), new STTextUnderlineType.Enum("dotDotDashHeavy", 15), new STTextUnderlineType.Enum("wavy", 16), new STTextUnderlineType.Enum("wavyHeavy", 17), new STTextUnderlineType.Enum("wavyDbl", 18)});
      private static final long serialVersionUID = 1L;


      public static STTextUnderlineType.Enum forString(String var0) {
         return (STTextUnderlineType.Enum)table.forString(var0);
      }

      public static STTextUnderlineType.Enum forInt(int var0) {
         return (STTextUnderlineType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTextUnderlineType newValue(Object var0) {
         return (STTextUnderlineType)STTextUnderlineType.type.newValue(var0);
      }

      public static STTextUnderlineType newInstance() {
         return (STTextUnderlineType)POIXMLTypeLoader.newInstance(STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType newInstance(XmlOptions var0) {
         return (STTextUnderlineType)POIXMLTypeLoader.newInstance(STTextUnderlineType.type, var0);
      }

      public static STTextUnderlineType parse(String var0) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(File var0) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(URL var0) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(InputStream var0) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(Reader var0) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(XMLStreamReader var0) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(Node var0) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static STTextUnderlineType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static STTextUnderlineType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextUnderlineType)POIXMLTypeLoader.parse(var0, STTextUnderlineType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextUnderlineType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextUnderlineType.type, var1);
      }

   }
}
