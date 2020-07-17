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

public interface STJc extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stjc977ftype");
   STJc.Enum LEFT = STJc.Enum.forString("left");
   STJc.Enum CENTER = STJc.Enum.forString("center");
   STJc.Enum RIGHT = STJc.Enum.forString("right");
   STJc.Enum BOTH = STJc.Enum.forString("both");
   STJc.Enum MEDIUM_KASHIDA = STJc.Enum.forString("mediumKashida");
   STJc.Enum DISTRIBUTE = STJc.Enum.forString("distribute");
   STJc.Enum NUM_TAB = STJc.Enum.forString("numTab");
   STJc.Enum HIGH_KASHIDA = STJc.Enum.forString("highKashida");
   STJc.Enum LOW_KASHIDA = STJc.Enum.forString("lowKashida");
   STJc.Enum THAI_DISTRIBUTE = STJc.Enum.forString("thaiDistribute");
   int INT_LEFT = 1;
   int INT_CENTER = 2;
   int INT_RIGHT = 3;
   int INT_BOTH = 4;
   int INT_MEDIUM_KASHIDA = 5;
   int INT_DISTRIBUTE = 6;
   int INT_NUM_TAB = 7;
   int INT_HIGH_KASHIDA = 8;
   int INT_LOW_KASHIDA = 9;
   int INT_THAI_DISTRIBUTE = 10;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STJc newValue(Object var0) {
         return (STJc)STJc.type.newValue(var0);
      }

      public static STJc newInstance() {
         return (STJc)POIXMLTypeLoader.newInstance(STJc.type, (XmlOptions)null);
      }

      public static STJc newInstance(XmlOptions var0) {
         return (STJc)POIXMLTypeLoader.newInstance(STJc.type, var0);
      }

      public static STJc parse(String var0) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(String var0, XmlOptions var1) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(File var0) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(URL var0) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(InputStream var0) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(Reader var0) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(XMLStreamReader var0) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(Node var0) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(Node var0, XmlOptions var1) throws XmlException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static STJc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, (XmlOptions)null);
      }

      public static STJc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STJc)POIXMLTypeLoader.parse(var0, STJc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STJc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STJc.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_LEFT = 1;
      static final int INT_CENTER = 2;
      static final int INT_RIGHT = 3;
      static final int INT_BOTH = 4;
      static final int INT_MEDIUM_KASHIDA = 5;
      static final int INT_DISTRIBUTE = 6;
      static final int INT_NUM_TAB = 7;
      static final int INT_HIGH_KASHIDA = 8;
      static final int INT_LOW_KASHIDA = 9;
      static final int INT_THAI_DISTRIBUTE = 10;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STJc.Enum[]{new STJc.Enum("left", 1), new STJc.Enum("center", 2), new STJc.Enum("right", 3), new STJc.Enum("both", 4), new STJc.Enum("mediumKashida", 5), new STJc.Enum("distribute", 6), new STJc.Enum("numTab", 7), new STJc.Enum("highKashida", 8), new STJc.Enum("lowKashida", 9), new STJc.Enum("thaiDistribute", 10)});
      private static final long serialVersionUID = 1L;


      public static STJc.Enum forString(String var0) {
         return (STJc.Enum)table.forString(var0);
      }

      public static STJc.Enum forInt(int var0) {
         return (STJc.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
