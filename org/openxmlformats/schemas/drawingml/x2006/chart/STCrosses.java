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

public interface STCrosses extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCrosses.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcrosses3cc8type");
   STCrosses.Enum AUTO_ZERO = STCrosses.Enum.forString("autoZero");
   STCrosses.Enum MAX = STCrosses.Enum.forString("max");
   STCrosses.Enum MIN = STCrosses.Enum.forString("min");
   int INT_AUTO_ZERO = 1;
   int INT_MAX = 2;
   int INT_MIN = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STCrosses newValue(Object var0) {
         return (STCrosses)STCrosses.type.newValue(var0);
      }

      public static STCrosses newInstance() {
         return (STCrosses)POIXMLTypeLoader.newInstance(STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses newInstance(XmlOptions var0) {
         return (STCrosses)POIXMLTypeLoader.newInstance(STCrosses.type, var0);
      }

      public static STCrosses parse(String var0) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(String var0, XmlOptions var1) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(File var0) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(URL var0) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(InputStream var0) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(Reader var0) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(XMLStreamReader var0) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(Node var0) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static STCrosses parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, (XmlOptions)null);
      }

      public static STCrosses parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCrosses)POIXMLTypeLoader.parse(var0, STCrosses.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCrosses.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCrosses.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AUTO_ZERO = 1;
      static final int INT_MAX = 2;
      static final int INT_MIN = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCrosses.Enum[]{new STCrosses.Enum("autoZero", 1), new STCrosses.Enum("max", 2), new STCrosses.Enum("min", 3)});
      private static final long serialVersionUID = 1L;


      public static STCrosses.Enum forString(String var0) {
         return (STCrosses.Enum)table.forString(var0);
      }

      public static STCrosses.Enum forInt(int var0) {
         return (STCrosses.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
