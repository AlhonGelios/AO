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

public interface STTickLblPos extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTickLblPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stticklblposc551type");
   STTickLblPos.Enum HIGH = STTickLblPos.Enum.forString("high");
   STTickLblPos.Enum LOW = STTickLblPos.Enum.forString("low");
   STTickLblPos.Enum NEXT_TO = STTickLblPos.Enum.forString("nextTo");
   STTickLblPos.Enum NONE = STTickLblPos.Enum.forString("none");
   int INT_HIGH = 1;
   int INT_LOW = 2;
   int INT_NEXT_TO = 3;
   int INT_NONE = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_HIGH = 1;
      static final int INT_LOW = 2;
      static final int INT_NEXT_TO = 3;
      static final int INT_NONE = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTickLblPos.Enum[]{new STTickLblPos.Enum("high", 1), new STTickLblPos.Enum("low", 2), new STTickLblPos.Enum("nextTo", 3), new STTickLblPos.Enum("none", 4)});
      private static final long serialVersionUID = 1L;


      public static STTickLblPos.Enum forString(String var0) {
         return (STTickLblPos.Enum)table.forString(var0);
      }

      public static STTickLblPos.Enum forInt(int var0) {
         return (STTickLblPos.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTickLblPos newValue(Object var0) {
         return (STTickLblPos)STTickLblPos.type.newValue(var0);
      }

      public static STTickLblPos newInstance() {
         return (STTickLblPos)POIXMLTypeLoader.newInstance(STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos newInstance(XmlOptions var0) {
         return (STTickLblPos)POIXMLTypeLoader.newInstance(STTickLblPos.type, var0);
      }

      public static STTickLblPos parse(String var0) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(String var0, XmlOptions var1) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(File var0) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(URL var0) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(InputStream var0) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(Reader var0) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(XMLStreamReader var0) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(Node var0) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static STTickLblPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static STTickLblPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTickLblPos)POIXMLTypeLoader.parse(var0, STTickLblPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTickLblPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTickLblPos.type, var1);
      }

   }
}
