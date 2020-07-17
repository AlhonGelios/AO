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

public interface STDataValidationOperator extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDataValidationOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdatavalidationoperatore0e0type");
   STDataValidationOperator.Enum BETWEEN = STDataValidationOperator.Enum.forString("between");
   STDataValidationOperator.Enum NOT_BETWEEN = STDataValidationOperator.Enum.forString("notBetween");
   STDataValidationOperator.Enum EQUAL = STDataValidationOperator.Enum.forString("equal");
   STDataValidationOperator.Enum NOT_EQUAL = STDataValidationOperator.Enum.forString("notEqual");
   STDataValidationOperator.Enum LESS_THAN = STDataValidationOperator.Enum.forString("lessThan");
   STDataValidationOperator.Enum LESS_THAN_OR_EQUAL = STDataValidationOperator.Enum.forString("lessThanOrEqual");
   STDataValidationOperator.Enum GREATER_THAN = STDataValidationOperator.Enum.forString("greaterThan");
   STDataValidationOperator.Enum GREATER_THAN_OR_EQUAL = STDataValidationOperator.Enum.forString("greaterThanOrEqual");
   int INT_BETWEEN = 1;
   int INT_NOT_BETWEEN = 2;
   int INT_EQUAL = 3;
   int INT_NOT_EQUAL = 4;
   int INT_LESS_THAN = 5;
   int INT_LESS_THAN_OR_EQUAL = 6;
   int INT_GREATER_THAN = 7;
   int INT_GREATER_THAN_OR_EQUAL = 8;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STDataValidationOperator newValue(Object var0) {
         return (STDataValidationOperator)STDataValidationOperator.type.newValue(var0);
      }

      public static STDataValidationOperator newInstance() {
         return (STDataValidationOperator)POIXMLTypeLoader.newInstance(STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator newInstance(XmlOptions var0) {
         return (STDataValidationOperator)POIXMLTypeLoader.newInstance(STDataValidationOperator.type, var0);
      }

      public static STDataValidationOperator parse(String var0) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(String var0, XmlOptions var1) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(File var0) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(URL var0) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(InputStream var0) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(Reader var0) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(XMLStreamReader var0) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(Node var0) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static STDataValidationOperator parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static STDataValidationOperator parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDataValidationOperator)POIXMLTypeLoader.parse(var0, STDataValidationOperator.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationOperator.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationOperator.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BETWEEN = 1;
      static final int INT_NOT_BETWEEN = 2;
      static final int INT_EQUAL = 3;
      static final int INT_NOT_EQUAL = 4;
      static final int INT_LESS_THAN = 5;
      static final int INT_LESS_THAN_OR_EQUAL = 6;
      static final int INT_GREATER_THAN = 7;
      static final int INT_GREATER_THAN_OR_EQUAL = 8;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDataValidationOperator.Enum[]{new STDataValidationOperator.Enum("between", 1), new STDataValidationOperator.Enum("notBetween", 2), new STDataValidationOperator.Enum("equal", 3), new STDataValidationOperator.Enum("notEqual", 4), new STDataValidationOperator.Enum("lessThan", 5), new STDataValidationOperator.Enum("lessThanOrEqual", 6), new STDataValidationOperator.Enum("greaterThan", 7), new STDataValidationOperator.Enum("greaterThanOrEqual", 8)});
      private static final long serialVersionUID = 1L;


      public static STDataValidationOperator.Enum forString(String var0) {
         return (STDataValidationOperator.Enum)table.forString(var0);
      }

      public static STDataValidationOperator.Enum forInt(int var0) {
         return (STDataValidationOperator.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
