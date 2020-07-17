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

public interface STDataConsolidateFunction extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDataConsolidateFunction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdataconsolidatefunction1206type");
   STDataConsolidateFunction.Enum AVERAGE = STDataConsolidateFunction.Enum.forString("average");
   STDataConsolidateFunction.Enum COUNT = STDataConsolidateFunction.Enum.forString("count");
   STDataConsolidateFunction.Enum COUNT_NUMS = STDataConsolidateFunction.Enum.forString("countNums");
   STDataConsolidateFunction.Enum MAX = STDataConsolidateFunction.Enum.forString("max");
   STDataConsolidateFunction.Enum MIN = STDataConsolidateFunction.Enum.forString("min");
   STDataConsolidateFunction.Enum PRODUCT = STDataConsolidateFunction.Enum.forString("product");
   STDataConsolidateFunction.Enum STD_DEV = STDataConsolidateFunction.Enum.forString("stdDev");
   STDataConsolidateFunction.Enum STD_DEVP = STDataConsolidateFunction.Enum.forString("stdDevp");
   STDataConsolidateFunction.Enum SUM = STDataConsolidateFunction.Enum.forString("sum");
   STDataConsolidateFunction.Enum VAR = STDataConsolidateFunction.Enum.forString("var");
   STDataConsolidateFunction.Enum VARP = STDataConsolidateFunction.Enum.forString("varp");
   int INT_AVERAGE = 1;
   int INT_COUNT = 2;
   int INT_COUNT_NUMS = 3;
   int INT_MAX = 4;
   int INT_MIN = 5;
   int INT_PRODUCT = 6;
   int INT_STD_DEV = 7;
   int INT_STD_DEVP = 8;
   int INT_SUM = 9;
   int INT_VAR = 10;
   int INT_VARP = 11;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STDataConsolidateFunction newValue(Object var0) {
         return (STDataConsolidateFunction)STDataConsolidateFunction.type.newValue(var0);
      }

      public static STDataConsolidateFunction newInstance() {
         return (STDataConsolidateFunction)POIXMLTypeLoader.newInstance(STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction newInstance(XmlOptions var0) {
         return (STDataConsolidateFunction)POIXMLTypeLoader.newInstance(STDataConsolidateFunction.type, var0);
      }

      public static STDataConsolidateFunction parse(String var0) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(String var0, XmlOptions var1) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(File var0) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(URL var0) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(InputStream var0) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(Reader var0) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(XMLStreamReader var0) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(Node var0) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static STDataConsolidateFunction parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static STDataConsolidateFunction parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDataConsolidateFunction)POIXMLTypeLoader.parse(var0, STDataConsolidateFunction.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataConsolidateFunction.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataConsolidateFunction.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AVERAGE = 1;
      static final int INT_COUNT = 2;
      static final int INT_COUNT_NUMS = 3;
      static final int INT_MAX = 4;
      static final int INT_MIN = 5;
      static final int INT_PRODUCT = 6;
      static final int INT_STD_DEV = 7;
      static final int INT_STD_DEVP = 8;
      static final int INT_SUM = 9;
      static final int INT_VAR = 10;
      static final int INT_VARP = 11;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDataConsolidateFunction.Enum[]{new STDataConsolidateFunction.Enum("average", 1), new STDataConsolidateFunction.Enum("count", 2), new STDataConsolidateFunction.Enum("countNums", 3), new STDataConsolidateFunction.Enum("max", 4), new STDataConsolidateFunction.Enum("min", 5), new STDataConsolidateFunction.Enum("product", 6), new STDataConsolidateFunction.Enum("stdDev", 7), new STDataConsolidateFunction.Enum("stdDevp", 8), new STDataConsolidateFunction.Enum("sum", 9), new STDataConsolidateFunction.Enum("var", 10), new STDataConsolidateFunction.Enum("varp", 11)});
      private static final long serialVersionUID = 1L;


      public static STDataConsolidateFunction.Enum forString(String var0) {
         return (STDataConsolidateFunction.Enum)table.forString(var0);
      }

      public static STDataConsolidateFunction.Enum forInt(int var0) {
         return (STDataConsolidateFunction.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
