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

public interface STCellType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCellType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcelltypebf95type");
   STCellType.Enum B = STCellType.Enum.forString("b");
   STCellType.Enum N = STCellType.Enum.forString("n");
   STCellType.Enum E = STCellType.Enum.forString("e");
   STCellType.Enum S = STCellType.Enum.forString("s");
   STCellType.Enum STR = STCellType.Enum.forString("str");
   STCellType.Enum INLINE_STR = STCellType.Enum.forString("inlineStr");
   int INT_B = 1;
   int INT_N = 2;
   int INT_E = 3;
   int INT_S = 4;
   int INT_STR = 5;
   int INT_INLINE_STR = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_B = 1;
      static final int INT_N = 2;
      static final int INT_E = 3;
      static final int INT_S = 4;
      static final int INT_STR = 5;
      static final int INT_INLINE_STR = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCellType.Enum[]{new STCellType.Enum("b", 1), new STCellType.Enum("n", 2), new STCellType.Enum("e", 3), new STCellType.Enum("s", 4), new STCellType.Enum("str", 5), new STCellType.Enum("inlineStr", 6)});
      private static final long serialVersionUID = 1L;


      public static STCellType.Enum forString(String var0) {
         return (STCellType.Enum)table.forString(var0);
      }

      public static STCellType.Enum forInt(int var0) {
         return (STCellType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCellType newValue(Object var0) {
         return (STCellType)STCellType.type.newValue(var0);
      }

      public static STCellType newInstance() {
         return (STCellType)POIXMLTypeLoader.newInstance(STCellType.type, (XmlOptions)null);
      }

      public static STCellType newInstance(XmlOptions var0) {
         return (STCellType)POIXMLTypeLoader.newInstance(STCellType.type, var0);
      }

      public static STCellType parse(String var0) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(String var0, XmlOptions var1) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(File var0) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(URL var0) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(InputStream var0) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(Reader var0) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(XMLStreamReader var0) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(Node var0) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static STCellType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, (XmlOptions)null);
      }

      public static STCellType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCellType)POIXMLTypeLoader.parse(var0, STCellType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellType.type, var1);
      }

   }
}
