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

public interface STCfType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCfType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcftype8016type");
   STCfType.Enum EXPRESSION = STCfType.Enum.forString("expression");
   STCfType.Enum CELL_IS = STCfType.Enum.forString("cellIs");
   STCfType.Enum COLOR_SCALE = STCfType.Enum.forString("colorScale");
   STCfType.Enum DATA_BAR = STCfType.Enum.forString("dataBar");
   STCfType.Enum ICON_SET = STCfType.Enum.forString("iconSet");
   STCfType.Enum TOP_10 = STCfType.Enum.forString("top10");
   STCfType.Enum UNIQUE_VALUES = STCfType.Enum.forString("uniqueValues");
   STCfType.Enum DUPLICATE_VALUES = STCfType.Enum.forString("duplicateValues");
   STCfType.Enum CONTAINS_TEXT = STCfType.Enum.forString("containsText");
   STCfType.Enum NOT_CONTAINS_TEXT = STCfType.Enum.forString("notContainsText");
   STCfType.Enum BEGINS_WITH = STCfType.Enum.forString("beginsWith");
   STCfType.Enum ENDS_WITH = STCfType.Enum.forString("endsWith");
   STCfType.Enum CONTAINS_BLANKS = STCfType.Enum.forString("containsBlanks");
   STCfType.Enum NOT_CONTAINS_BLANKS = STCfType.Enum.forString("notContainsBlanks");
   STCfType.Enum CONTAINS_ERRORS = STCfType.Enum.forString("containsErrors");
   STCfType.Enum NOT_CONTAINS_ERRORS = STCfType.Enum.forString("notContainsErrors");
   STCfType.Enum TIME_PERIOD = STCfType.Enum.forString("timePeriod");
   STCfType.Enum ABOVE_AVERAGE = STCfType.Enum.forString("aboveAverage");
   int INT_EXPRESSION = 1;
   int INT_CELL_IS = 2;
   int INT_COLOR_SCALE = 3;
   int INT_DATA_BAR = 4;
   int INT_ICON_SET = 5;
   int INT_TOP_10 = 6;
   int INT_UNIQUE_VALUES = 7;
   int INT_DUPLICATE_VALUES = 8;
   int INT_CONTAINS_TEXT = 9;
   int INT_NOT_CONTAINS_TEXT = 10;
   int INT_BEGINS_WITH = 11;
   int INT_ENDS_WITH = 12;
   int INT_CONTAINS_BLANKS = 13;
   int INT_NOT_CONTAINS_BLANKS = 14;
   int INT_CONTAINS_ERRORS = 15;
   int INT_NOT_CONTAINS_ERRORS = 16;
   int INT_TIME_PERIOD = 17;
   int INT_ABOVE_AVERAGE = 18;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STCfType newValue(Object var0) {
         return (STCfType)STCfType.type.newValue(var0);
      }

      public static STCfType newInstance() {
         return (STCfType)POIXMLTypeLoader.newInstance(STCfType.type, (XmlOptions)null);
      }

      public static STCfType newInstance(XmlOptions var0) {
         return (STCfType)POIXMLTypeLoader.newInstance(STCfType.type, var0);
      }

      public static STCfType parse(String var0) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(String var0, XmlOptions var1) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(File var0) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(URL var0) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(InputStream var0) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(Reader var0) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(XMLStreamReader var0) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(Node var0) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static STCfType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, (XmlOptions)null);
      }

      public static STCfType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCfType)POIXMLTypeLoader.parse(var0, STCfType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCfType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCfType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_EXPRESSION = 1;
      static final int INT_CELL_IS = 2;
      static final int INT_COLOR_SCALE = 3;
      static final int INT_DATA_BAR = 4;
      static final int INT_ICON_SET = 5;
      static final int INT_TOP_10 = 6;
      static final int INT_UNIQUE_VALUES = 7;
      static final int INT_DUPLICATE_VALUES = 8;
      static final int INT_CONTAINS_TEXT = 9;
      static final int INT_NOT_CONTAINS_TEXT = 10;
      static final int INT_BEGINS_WITH = 11;
      static final int INT_ENDS_WITH = 12;
      static final int INT_CONTAINS_BLANKS = 13;
      static final int INT_NOT_CONTAINS_BLANKS = 14;
      static final int INT_CONTAINS_ERRORS = 15;
      static final int INT_NOT_CONTAINS_ERRORS = 16;
      static final int INT_TIME_PERIOD = 17;
      static final int INT_ABOVE_AVERAGE = 18;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCfType.Enum[]{new STCfType.Enum("expression", 1), new STCfType.Enum("cellIs", 2), new STCfType.Enum("colorScale", 3), new STCfType.Enum("dataBar", 4), new STCfType.Enum("iconSet", 5), new STCfType.Enum("top10", 6), new STCfType.Enum("uniqueValues", 7), new STCfType.Enum("duplicateValues", 8), new STCfType.Enum("containsText", 9), new STCfType.Enum("notContainsText", 10), new STCfType.Enum("beginsWith", 11), new STCfType.Enum("endsWith", 12), new STCfType.Enum("containsBlanks", 13), new STCfType.Enum("notContainsBlanks", 14), new STCfType.Enum("containsErrors", 15), new STCfType.Enum("notContainsErrors", 16), new STCfType.Enum("timePeriod", 17), new STCfType.Enum("aboveAverage", 18)});
      private static final long serialVersionUID = 1L;


      public static STCfType.Enum forString(String var0) {
         return (STCfType.Enum)table.forString(var0);
      }

      public static STCfType.Enum forInt(int var0) {
         return (STCfType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
