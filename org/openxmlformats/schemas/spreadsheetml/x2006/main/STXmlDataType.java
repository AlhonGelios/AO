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

public interface STXmlDataType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STXmlDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stxmldatatyped64atype");
   STXmlDataType.Enum STRING = STXmlDataType.Enum.forString("string");
   STXmlDataType.Enum NORMALIZED_STRING = STXmlDataType.Enum.forString("normalizedString");
   STXmlDataType.Enum TOKEN = STXmlDataType.Enum.forString("token");
   STXmlDataType.Enum BYTE = STXmlDataType.Enum.forString("byte");
   STXmlDataType.Enum UNSIGNED_BYTE = STXmlDataType.Enum.forString("unsignedByte");
   STXmlDataType.Enum BASE_64_BINARY = STXmlDataType.Enum.forString("base64Binary");
   STXmlDataType.Enum HEX_BINARY = STXmlDataType.Enum.forString("hexBinary");
   STXmlDataType.Enum INTEGER = STXmlDataType.Enum.forString("integer");
   STXmlDataType.Enum POSITIVE_INTEGER = STXmlDataType.Enum.forString("positiveInteger");
   STXmlDataType.Enum NEGATIVE_INTEGER = STXmlDataType.Enum.forString("negativeInteger");
   STXmlDataType.Enum NON_POSITIVE_INTEGER = STXmlDataType.Enum.forString("nonPositiveInteger");
   STXmlDataType.Enum NON_NEGATIVE_INTEGER = STXmlDataType.Enum.forString("nonNegativeInteger");
   STXmlDataType.Enum INT = STXmlDataType.Enum.forString("int");
   STXmlDataType.Enum UNSIGNED_INT = STXmlDataType.Enum.forString("unsignedInt");
   STXmlDataType.Enum LONG = STXmlDataType.Enum.forString("long");
   STXmlDataType.Enum UNSIGNED_LONG = STXmlDataType.Enum.forString("unsignedLong");
   STXmlDataType.Enum SHORT = STXmlDataType.Enum.forString("short");
   STXmlDataType.Enum UNSIGNED_SHORT = STXmlDataType.Enum.forString("unsignedShort");
   STXmlDataType.Enum DECIMAL = STXmlDataType.Enum.forString("decimal");
   STXmlDataType.Enum FLOAT = STXmlDataType.Enum.forString("float");
   STXmlDataType.Enum DOUBLE = STXmlDataType.Enum.forString("double");
   STXmlDataType.Enum BOOLEAN = STXmlDataType.Enum.forString("boolean");
   STXmlDataType.Enum TIME = STXmlDataType.Enum.forString("time");
   STXmlDataType.Enum DATE_TIME = STXmlDataType.Enum.forString("dateTime");
   STXmlDataType.Enum DURATION = STXmlDataType.Enum.forString("duration");
   STXmlDataType.Enum DATE = STXmlDataType.Enum.forString("date");
   STXmlDataType.Enum G_MONTH = STXmlDataType.Enum.forString("gMonth");
   STXmlDataType.Enum G_YEAR = STXmlDataType.Enum.forString("gYear");
   STXmlDataType.Enum G_YEAR_MONTH = STXmlDataType.Enum.forString("gYearMonth");
   STXmlDataType.Enum G_DAY = STXmlDataType.Enum.forString("gDay");
   STXmlDataType.Enum G_MONTH_DAY = STXmlDataType.Enum.forString("gMonthDay");
   STXmlDataType.Enum NAME = STXmlDataType.Enum.forString("Name");
   STXmlDataType.Enum Q_NAME = STXmlDataType.Enum.forString("QName");
   STXmlDataType.Enum NC_NAME = STXmlDataType.Enum.forString("NCName");
   STXmlDataType.Enum ANY_URI = STXmlDataType.Enum.forString("anyURI");
   STXmlDataType.Enum LANGUAGE = STXmlDataType.Enum.forString("language");
   STXmlDataType.Enum ID = STXmlDataType.Enum.forString("ID");
   STXmlDataType.Enum IDREF = STXmlDataType.Enum.forString("IDREF");
   STXmlDataType.Enum IDREFS = STXmlDataType.Enum.forString("IDREFS");
   STXmlDataType.Enum ENTITY = STXmlDataType.Enum.forString("ENTITY");
   STXmlDataType.Enum ENTITIES = STXmlDataType.Enum.forString("ENTITIES");
   STXmlDataType.Enum NOTATION = STXmlDataType.Enum.forString("NOTATION");
   STXmlDataType.Enum NMTOKEN = STXmlDataType.Enum.forString("NMTOKEN");
   STXmlDataType.Enum NMTOKENS = STXmlDataType.Enum.forString("NMTOKENS");
   STXmlDataType.Enum ANY_TYPE = STXmlDataType.Enum.forString("anyType");
   int INT_STRING = 1;
   int INT_NORMALIZED_STRING = 2;
   int INT_TOKEN = 3;
   int INT_BYTE = 4;
   int INT_UNSIGNED_BYTE = 5;
   int INT_BASE_64_BINARY = 6;
   int INT_HEX_BINARY = 7;
   int INT_INTEGER = 8;
   int INT_POSITIVE_INTEGER = 9;
   int INT_NEGATIVE_INTEGER = 10;
   int INT_NON_POSITIVE_INTEGER = 11;
   int INT_NON_NEGATIVE_INTEGER = 12;
   int INT_INT = 13;
   int INT_UNSIGNED_INT = 14;
   int INT_LONG = 15;
   int INT_UNSIGNED_LONG = 16;
   int INT_SHORT = 17;
   int INT_UNSIGNED_SHORT = 18;
   int INT_DECIMAL = 19;
   int INT_FLOAT = 20;
   int INT_DOUBLE = 21;
   int INT_BOOLEAN = 22;
   int INT_TIME = 23;
   int INT_DATE_TIME = 24;
   int INT_DURATION = 25;
   int INT_DATE = 26;
   int INT_G_MONTH = 27;
   int INT_G_YEAR = 28;
   int INT_G_YEAR_MONTH = 29;
   int INT_G_DAY = 30;
   int INT_G_MONTH_DAY = 31;
   int INT_NAME = 32;
   int INT_Q_NAME = 33;
   int INT_NC_NAME = 34;
   int INT_ANY_URI = 35;
   int INT_LANGUAGE = 36;
   int INT_ID = 37;
   int INT_IDREF = 38;
   int INT_IDREFS = 39;
   int INT_ENTITY = 40;
   int INT_ENTITIES = 41;
   int INT_NOTATION = 42;
   int INT_NMTOKEN = 43;
   int INT_NMTOKENS = 44;
   int INT_ANY_TYPE = 45;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_STRING = 1;
      static final int INT_NORMALIZED_STRING = 2;
      static final int INT_TOKEN = 3;
      static final int INT_BYTE = 4;
      static final int INT_UNSIGNED_BYTE = 5;
      static final int INT_BASE_64_BINARY = 6;
      static final int INT_HEX_BINARY = 7;
      static final int INT_INTEGER = 8;
      static final int INT_POSITIVE_INTEGER = 9;
      static final int INT_NEGATIVE_INTEGER = 10;
      static final int INT_NON_POSITIVE_INTEGER = 11;
      static final int INT_NON_NEGATIVE_INTEGER = 12;
      static final int INT_INT = 13;
      static final int INT_UNSIGNED_INT = 14;
      static final int INT_LONG = 15;
      static final int INT_UNSIGNED_LONG = 16;
      static final int INT_SHORT = 17;
      static final int INT_UNSIGNED_SHORT = 18;
      static final int INT_DECIMAL = 19;
      static final int INT_FLOAT = 20;
      static final int INT_DOUBLE = 21;
      static final int INT_BOOLEAN = 22;
      static final int INT_TIME = 23;
      static final int INT_DATE_TIME = 24;
      static final int INT_DURATION = 25;
      static final int INT_DATE = 26;
      static final int INT_G_MONTH = 27;
      static final int INT_G_YEAR = 28;
      static final int INT_G_YEAR_MONTH = 29;
      static final int INT_G_DAY = 30;
      static final int INT_G_MONTH_DAY = 31;
      static final int INT_NAME = 32;
      static final int INT_Q_NAME = 33;
      static final int INT_NC_NAME = 34;
      static final int INT_ANY_URI = 35;
      static final int INT_LANGUAGE = 36;
      static final int INT_ID = 37;
      static final int INT_IDREF = 38;
      static final int INT_IDREFS = 39;
      static final int INT_ENTITY = 40;
      static final int INT_ENTITIES = 41;
      static final int INT_NOTATION = 42;
      static final int INT_NMTOKEN = 43;
      static final int INT_NMTOKENS = 44;
      static final int INT_ANY_TYPE = 45;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STXmlDataType.Enum[]{new STXmlDataType.Enum("string", 1), new STXmlDataType.Enum("normalizedString", 2), new STXmlDataType.Enum("token", 3), new STXmlDataType.Enum("byte", 4), new STXmlDataType.Enum("unsignedByte", 5), new STXmlDataType.Enum("base64Binary", 6), new STXmlDataType.Enum("hexBinary", 7), new STXmlDataType.Enum("integer", 8), new STXmlDataType.Enum("positiveInteger", 9), new STXmlDataType.Enum("negativeInteger", 10), new STXmlDataType.Enum("nonPositiveInteger", 11), new STXmlDataType.Enum("nonNegativeInteger", 12), new STXmlDataType.Enum("int", 13), new STXmlDataType.Enum("unsignedInt", 14), new STXmlDataType.Enum("long", 15), new STXmlDataType.Enum("unsignedLong", 16), new STXmlDataType.Enum("short", 17), new STXmlDataType.Enum("unsignedShort", 18), new STXmlDataType.Enum("decimal", 19), new STXmlDataType.Enum("float", 20), new STXmlDataType.Enum("double", 21), new STXmlDataType.Enum("boolean", 22), new STXmlDataType.Enum("time", 23), new STXmlDataType.Enum("dateTime", 24), new STXmlDataType.Enum("duration", 25), new STXmlDataType.Enum("date", 26), new STXmlDataType.Enum("gMonth", 27), new STXmlDataType.Enum("gYear", 28), new STXmlDataType.Enum("gYearMonth", 29), new STXmlDataType.Enum("gDay", 30), new STXmlDataType.Enum("gMonthDay", 31), new STXmlDataType.Enum("Name", 32), new STXmlDataType.Enum("QName", 33), new STXmlDataType.Enum("NCName", 34), new STXmlDataType.Enum("anyURI", 35), new STXmlDataType.Enum("language", 36), new STXmlDataType.Enum("ID", 37), new STXmlDataType.Enum("IDREF", 38), new STXmlDataType.Enum("IDREFS", 39), new STXmlDataType.Enum("ENTITY", 40), new STXmlDataType.Enum("ENTITIES", 41), new STXmlDataType.Enum("NOTATION", 42), new STXmlDataType.Enum("NMTOKEN", 43), new STXmlDataType.Enum("NMTOKENS", 44), new STXmlDataType.Enum("anyType", 45)});
      private static final long serialVersionUID = 1L;


      public static STXmlDataType.Enum forString(String var0) {
         return (STXmlDataType.Enum)table.forString(var0);
      }

      public static STXmlDataType.Enum forInt(int var0) {
         return (STXmlDataType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STXmlDataType newValue(Object var0) {
         return (STXmlDataType)STXmlDataType.type.newValue(var0);
      }

      public static STXmlDataType newInstance() {
         return (STXmlDataType)POIXMLTypeLoader.newInstance(STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType newInstance(XmlOptions var0) {
         return (STXmlDataType)POIXMLTypeLoader.newInstance(STXmlDataType.type, var0);
      }

      public static STXmlDataType parse(String var0) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(String var0, XmlOptions var1) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(File var0) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(URL var0) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(InputStream var0) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(Reader var0) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(XMLStreamReader var0) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(Node var0) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static STXmlDataType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static STXmlDataType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STXmlDataType)POIXMLTypeLoader.parse(var0, STXmlDataType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STXmlDataType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STXmlDataType.type, var1);
      }

   }
}
