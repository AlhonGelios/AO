package org.openxmlformats.schemas.drawingml.x2006.chart;

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

public interface STTickMark extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTickMark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttickmark69e2type");
   STTickMark.Enum CROSS = STTickMark.Enum.forString("cross");
   STTickMark.Enum IN = STTickMark.Enum.forString("in");
   STTickMark.Enum NONE = STTickMark.Enum.forString("none");
   STTickMark.Enum OUT = STTickMark.Enum.forString("out");
   int INT_CROSS = 1;
   int INT_IN = 2;
   int INT_NONE = 3;
   int INT_OUT = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTickMark newValue(Object var0) {
         return (STTickMark)STTickMark.type.newValue(var0);
      }

      public static STTickMark newInstance() {
         return (STTickMark)POIXMLTypeLoader.newInstance(STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark newInstance(XmlOptions var0) {
         return (STTickMark)POIXMLTypeLoader.newInstance(STTickMark.type, var0);
      }

      public static STTickMark parse(String var0) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(String var0, XmlOptions var1) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(File var0) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(URL var0) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(InputStream var0) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(Reader var0) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(XMLStreamReader var0) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(Node var0) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static STTickMark parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, (XmlOptions)null);
      }

      public static STTickMark parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTickMark)POIXMLTypeLoader.parse(var0, STTickMark.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTickMark.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTickMark.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CROSS = 1;
      static final int INT_IN = 2;
      static final int INT_NONE = 3;
      static final int INT_OUT = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTickMark.Enum[]{new STTickMark.Enum("cross", 1), new STTickMark.Enum("in", 2), new STTickMark.Enum("none", 3), new STTickMark.Enum("out", 4)});
      private static final long serialVersionUID = 1L;


      public static STTickMark.Enum forString(String var0) {
         return (STTickMark.Enum)table.forString(var0);
      }

      public static STTickMark.Enum forInt(int var0) {
         return (STTickMark.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
