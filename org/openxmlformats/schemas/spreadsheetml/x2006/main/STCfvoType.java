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

public interface STCfvoType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCfvoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcfvotypeeb0ftype");
   STCfvoType.Enum NUM = STCfvoType.Enum.forString("num");
   STCfvoType.Enum PERCENT = STCfvoType.Enum.forString("percent");
   STCfvoType.Enum MAX = STCfvoType.Enum.forString("max");
   STCfvoType.Enum MIN = STCfvoType.Enum.forString("min");
   STCfvoType.Enum FORMULA = STCfvoType.Enum.forString("formula");
   STCfvoType.Enum PERCENTILE = STCfvoType.Enum.forString("percentile");
   int INT_NUM = 1;
   int INT_PERCENT = 2;
   int INT_MAX = 3;
   int INT_MIN = 4;
   int INT_FORMULA = 5;
   int INT_PERCENTILE = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NUM = 1;
      static final int INT_PERCENT = 2;
      static final int INT_MAX = 3;
      static final int INT_MIN = 4;
      static final int INT_FORMULA = 5;
      static final int INT_PERCENTILE = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCfvoType.Enum[]{new STCfvoType.Enum("num", 1), new STCfvoType.Enum("percent", 2), new STCfvoType.Enum("max", 3), new STCfvoType.Enum("min", 4), new STCfvoType.Enum("formula", 5), new STCfvoType.Enum("percentile", 6)});
      private static final long serialVersionUID = 1L;


      public static STCfvoType.Enum forString(String var0) {
         return (STCfvoType.Enum)table.forString(var0);
      }

      public static STCfvoType.Enum forInt(int var0) {
         return (STCfvoType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCfvoType newValue(Object var0) {
         return (STCfvoType)STCfvoType.type.newValue(var0);
      }

      public static STCfvoType newInstance() {
         return (STCfvoType)POIXMLTypeLoader.newInstance(STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType newInstance(XmlOptions var0) {
         return (STCfvoType)POIXMLTypeLoader.newInstance(STCfvoType.type, var0);
      }

      public static STCfvoType parse(String var0) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(String var0, XmlOptions var1) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(File var0) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(URL var0) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(InputStream var0) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(Reader var0) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(XMLStreamReader var0) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(Node var0) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static STCfvoType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static STCfvoType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCfvoType)POIXMLTypeLoader.parse(var0, STCfvoType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCfvoType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCfvoType.type, var1);
      }

   }
}
