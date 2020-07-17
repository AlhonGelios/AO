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

public interface STBrClear extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBrClear.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stbrclearb1e5type");
   STBrClear.Enum NONE = STBrClear.Enum.forString("none");
   STBrClear.Enum LEFT = STBrClear.Enum.forString("left");
   STBrClear.Enum RIGHT = STBrClear.Enum.forString("right");
   STBrClear.Enum ALL = STBrClear.Enum.forString("all");
   int INT_NONE = 1;
   int INT_LEFT = 2;
   int INT_RIGHT = 3;
   int INT_ALL = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_LEFT = 2;
      static final int INT_RIGHT = 3;
      static final int INT_ALL = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STBrClear.Enum[]{new STBrClear.Enum("none", 1), new STBrClear.Enum("left", 2), new STBrClear.Enum("right", 3), new STBrClear.Enum("all", 4)});
      private static final long serialVersionUID = 1L;


      public static STBrClear.Enum forString(String var0) {
         return (STBrClear.Enum)table.forString(var0);
      }

      public static STBrClear.Enum forInt(int var0) {
         return (STBrClear.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STBrClear newValue(Object var0) {
         return (STBrClear)STBrClear.type.newValue(var0);
      }

      public static STBrClear newInstance() {
         return (STBrClear)POIXMLTypeLoader.newInstance(STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear newInstance(XmlOptions var0) {
         return (STBrClear)POIXMLTypeLoader.newInstance(STBrClear.type, var0);
      }

      public static STBrClear parse(String var0) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(String var0, XmlOptions var1) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(File var0) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(URL var0) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(InputStream var0) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(Reader var0) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(XMLStreamReader var0) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(Node var0) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static STBrClear parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, (XmlOptions)null);
      }

      public static STBrClear parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBrClear)POIXMLTypeLoader.parse(var0, STBrClear.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBrClear.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBrClear.type, var1);
      }

   }
}
