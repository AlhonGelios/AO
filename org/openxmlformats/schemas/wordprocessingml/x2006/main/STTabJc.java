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

public interface STTabJc extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTabJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttabjc10f4type");
   STTabJc.Enum CLEAR = STTabJc.Enum.forString("clear");
   STTabJc.Enum LEFT = STTabJc.Enum.forString("left");
   STTabJc.Enum CENTER = STTabJc.Enum.forString("center");
   STTabJc.Enum RIGHT = STTabJc.Enum.forString("right");
   STTabJc.Enum DECIMAL = STTabJc.Enum.forString("decimal");
   STTabJc.Enum BAR = STTabJc.Enum.forString("bar");
   STTabJc.Enum NUM = STTabJc.Enum.forString("num");
   int INT_CLEAR = 1;
   int INT_LEFT = 2;
   int INT_CENTER = 3;
   int INT_RIGHT = 4;
   int INT_DECIMAL = 5;
   int INT_BAR = 6;
   int INT_NUM = 7;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTabJc newValue(Object var0) {
         return (STTabJc)STTabJc.type.newValue(var0);
      }

      public static STTabJc newInstance() {
         return (STTabJc)POIXMLTypeLoader.newInstance(STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc newInstance(XmlOptions var0) {
         return (STTabJc)POIXMLTypeLoader.newInstance(STTabJc.type, var0);
      }

      public static STTabJc parse(String var0) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(String var0, XmlOptions var1) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(File var0) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(URL var0) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(InputStream var0) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(Reader var0) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(XMLStreamReader var0) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(Node var0) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static STTabJc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, (XmlOptions)null);
      }

      public static STTabJc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTabJc)POIXMLTypeLoader.parse(var0, STTabJc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTabJc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTabJc.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CLEAR = 1;
      static final int INT_LEFT = 2;
      static final int INT_CENTER = 3;
      static final int INT_RIGHT = 4;
      static final int INT_DECIMAL = 5;
      static final int INT_BAR = 6;
      static final int INT_NUM = 7;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTabJc.Enum[]{new STTabJc.Enum("clear", 1), new STTabJc.Enum("left", 2), new STTabJc.Enum("center", 3), new STTabJc.Enum("right", 4), new STTabJc.Enum("decimal", 5), new STTabJc.Enum("bar", 6), new STTabJc.Enum("num", 7)});
      private static final long serialVersionUID = 1L;


      public static STTabJc.Enum forString(String var0) {
         return (STTabJc.Enum)table.forString(var0);
      }

      public static STTabJc.Enum forInt(int var0) {
         return (STTabJc.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
