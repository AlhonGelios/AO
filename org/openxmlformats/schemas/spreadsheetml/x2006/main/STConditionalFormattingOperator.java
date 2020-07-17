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

public interface STConditionalFormattingOperator extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STConditionalFormattingOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stconditionalformattingoperatora99etype");
   STConditionalFormattingOperator.Enum LESS_THAN = STConditionalFormattingOperator.Enum.forString("lessThan");
   STConditionalFormattingOperator.Enum LESS_THAN_OR_EQUAL = STConditionalFormattingOperator.Enum.forString("lessThanOrEqual");
   STConditionalFormattingOperator.Enum EQUAL = STConditionalFormattingOperator.Enum.forString("equal");
   STConditionalFormattingOperator.Enum NOT_EQUAL = STConditionalFormattingOperator.Enum.forString("notEqual");
   STConditionalFormattingOperator.Enum GREATER_THAN_OR_EQUAL = STConditionalFormattingOperator.Enum.forString("greaterThanOrEqual");
   STConditionalFormattingOperator.Enum GREATER_THAN = STConditionalFormattingOperator.Enum.forString("greaterThan");
   STConditionalFormattingOperator.Enum BETWEEN = STConditionalFormattingOperator.Enum.forString("between");
   STConditionalFormattingOperator.Enum NOT_BETWEEN = STConditionalFormattingOperator.Enum.forString("notBetween");
   STConditionalFormattingOperator.Enum CONTAINS_TEXT = STConditionalFormattingOperator.Enum.forString("containsText");
   STConditionalFormattingOperator.Enum NOT_CONTAINS = STConditionalFormattingOperator.Enum.forString("notContains");
   STConditionalFormattingOperator.Enum BEGINS_WITH = STConditionalFormattingOperator.Enum.forString("beginsWith");
   STConditionalFormattingOperator.Enum ENDS_WITH = STConditionalFormattingOperator.Enum.forString("endsWith");
   int INT_LESS_THAN = 1;
   int INT_LESS_THAN_OR_EQUAL = 2;
   int INT_EQUAL = 3;
   int INT_NOT_EQUAL = 4;
   int INT_GREATER_THAN_OR_EQUAL = 5;
   int INT_GREATER_THAN = 6;
   int INT_BETWEEN = 7;
   int INT_NOT_BETWEEN = 8;
   int INT_CONTAINS_TEXT = 9;
   int INT_NOT_CONTAINS = 10;
   int INT_BEGINS_WITH = 11;
   int INT_ENDS_WITH = 12;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STConditionalFormattingOperator newValue(Object var0) {
         return (STConditionalFormattingOperator)STConditionalFormattingOperator.type.newValue(var0);
      }

      public static STConditionalFormattingOperator newInstance() {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.newInstance(STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator newInstance(XmlOptions var0) {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.newInstance(STConditionalFormattingOperator.type, var0);
      }

      public static STConditionalFormattingOperator parse(String var0) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(String var0, XmlOptions var1) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(File var0) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(URL var0) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(InputStream var0) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(Reader var0) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(XMLStreamReader var0) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(Node var0) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(Node var0, XmlOptions var1) throws XmlException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static STConditionalFormattingOperator parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static STConditionalFormattingOperator parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STConditionalFormattingOperator)POIXMLTypeLoader.parse(var0, STConditionalFormattingOperator.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STConditionalFormattingOperator.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STConditionalFormattingOperator.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_LESS_THAN = 1;
      static final int INT_LESS_THAN_OR_EQUAL = 2;
      static final int INT_EQUAL = 3;
      static final int INT_NOT_EQUAL = 4;
      static final int INT_GREATER_THAN_OR_EQUAL = 5;
      static final int INT_GREATER_THAN = 6;
      static final int INT_BETWEEN = 7;
      static final int INT_NOT_BETWEEN = 8;
      static final int INT_CONTAINS_TEXT = 9;
      static final int INT_NOT_CONTAINS = 10;
      static final int INT_BEGINS_WITH = 11;
      static final int INT_ENDS_WITH = 12;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STConditionalFormattingOperator.Enum[]{new STConditionalFormattingOperator.Enum("lessThan", 1), new STConditionalFormattingOperator.Enum("lessThanOrEqual", 2), new STConditionalFormattingOperator.Enum("equal", 3), new STConditionalFormattingOperator.Enum("notEqual", 4), new STConditionalFormattingOperator.Enum("greaterThanOrEqual", 5), new STConditionalFormattingOperator.Enum("greaterThan", 6), new STConditionalFormattingOperator.Enum("between", 7), new STConditionalFormattingOperator.Enum("notBetween", 8), new STConditionalFormattingOperator.Enum("containsText", 9), new STConditionalFormattingOperator.Enum("notContains", 10), new STConditionalFormattingOperator.Enum("beginsWith", 11), new STConditionalFormattingOperator.Enum("endsWith", 12)});
      private static final long serialVersionUID = 1L;


      public static STConditionalFormattingOperator.Enum forString(String var0) {
         return (STConditionalFormattingOperator.Enum)table.forString(var0);
      }

      public static STConditionalFormattingOperator.Enum forInt(int var0) {
         return (STConditionalFormattingOperator.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
