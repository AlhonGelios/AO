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

public interface STItemType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stitemtype6186type");
   STItemType.Enum DATA = STItemType.Enum.forString("data");
   STItemType.Enum DEFAULT = STItemType.Enum.forString("default");
   STItemType.Enum SUM = STItemType.Enum.forString("sum");
   STItemType.Enum COUNT_A = STItemType.Enum.forString("countA");
   STItemType.Enum AVG = STItemType.Enum.forString("avg");
   STItemType.Enum MAX = STItemType.Enum.forString("max");
   STItemType.Enum MIN = STItemType.Enum.forString("min");
   STItemType.Enum PRODUCT = STItemType.Enum.forString("product");
   STItemType.Enum COUNT = STItemType.Enum.forString("count");
   STItemType.Enum STD_DEV = STItemType.Enum.forString("stdDev");
   STItemType.Enum STD_DEV_P = STItemType.Enum.forString("stdDevP");
   STItemType.Enum VAR = STItemType.Enum.forString("var");
   STItemType.Enum VAR_P = STItemType.Enum.forString("varP");
   STItemType.Enum GRAND = STItemType.Enum.forString("grand");
   STItemType.Enum BLANK = STItemType.Enum.forString("blank");
   int INT_DATA = 1;
   int INT_DEFAULT = 2;
   int INT_SUM = 3;
   int INT_COUNT_A = 4;
   int INT_AVG = 5;
   int INT_MAX = 6;
   int INT_MIN = 7;
   int INT_PRODUCT = 8;
   int INT_COUNT = 9;
   int INT_STD_DEV = 10;
   int INT_STD_DEV_P = 11;
   int INT_VAR = 12;
   int INT_VAR_P = 13;
   int INT_GRAND = 14;
   int INT_BLANK = 15;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_DATA = 1;
      static final int INT_DEFAULT = 2;
      static final int INT_SUM = 3;
      static final int INT_COUNT_A = 4;
      static final int INT_AVG = 5;
      static final int INT_MAX = 6;
      static final int INT_MIN = 7;
      static final int INT_PRODUCT = 8;
      static final int INT_COUNT = 9;
      static final int INT_STD_DEV = 10;
      static final int INT_STD_DEV_P = 11;
      static final int INT_VAR = 12;
      static final int INT_VAR_P = 13;
      static final int INT_GRAND = 14;
      static final int INT_BLANK = 15;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STItemType.Enum[]{new STItemType.Enum("data", 1), new STItemType.Enum("default", 2), new STItemType.Enum("sum", 3), new STItemType.Enum("countA", 4), new STItemType.Enum("avg", 5), new STItemType.Enum("max", 6), new STItemType.Enum("min", 7), new STItemType.Enum("product", 8), new STItemType.Enum("count", 9), new STItemType.Enum("stdDev", 10), new STItemType.Enum("stdDevP", 11), new STItemType.Enum("var", 12), new STItemType.Enum("varP", 13), new STItemType.Enum("grand", 14), new STItemType.Enum("blank", 15)});
      private static final long serialVersionUID = 1L;


      public static STItemType.Enum forString(String var0) {
         return (STItemType.Enum)table.forString(var0);
      }

      public static STItemType.Enum forInt(int var0) {
         return (STItemType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STItemType newValue(Object var0) {
         return (STItemType)STItemType.type.newValue(var0);
      }

      public static STItemType newInstance() {
         return (STItemType)POIXMLTypeLoader.newInstance(STItemType.type, (XmlOptions)null);
      }

      public static STItemType newInstance(XmlOptions var0) {
         return (STItemType)POIXMLTypeLoader.newInstance(STItemType.type, var0);
      }

      public static STItemType parse(String var0) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(String var0, XmlOptions var1) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(File var0) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(URL var0) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(InputStream var0) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(Reader var0) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(XMLStreamReader var0) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(Node var0) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static STItemType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, (XmlOptions)null);
      }

      public static STItemType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STItemType)POIXMLTypeLoader.parse(var0, STItemType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STItemType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STItemType.type, var1);
      }

   }
}
