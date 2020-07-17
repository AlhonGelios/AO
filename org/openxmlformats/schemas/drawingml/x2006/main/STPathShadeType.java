package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STPathShadeType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPathShadeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpathshadetype93c3type");
   STPathShadeType.Enum SHAPE = STPathShadeType.Enum.forString("shape");
   STPathShadeType.Enum CIRCLE = STPathShadeType.Enum.forString("circle");
   STPathShadeType.Enum RECT = STPathShadeType.Enum.forString("rect");
   int INT_SHAPE = 1;
   int INT_CIRCLE = 2;
   int INT_RECT = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SHAPE = 1;
      static final int INT_CIRCLE = 2;
      static final int INT_RECT = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPathShadeType.Enum[]{new STPathShadeType.Enum("shape", 1), new STPathShadeType.Enum("circle", 2), new STPathShadeType.Enum("rect", 3)});
      private static final long serialVersionUID = 1L;


      public static STPathShadeType.Enum forString(String var0) {
         return (STPathShadeType.Enum)table.forString(var0);
      }

      public static STPathShadeType.Enum forInt(int var0) {
         return (STPathShadeType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STPathShadeType newValue(Object var0) {
         return (STPathShadeType)STPathShadeType.type.newValue(var0);
      }

      public static STPathShadeType newInstance() {
         return (STPathShadeType)POIXMLTypeLoader.newInstance(STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType newInstance(XmlOptions var0) {
         return (STPathShadeType)POIXMLTypeLoader.newInstance(STPathShadeType.type, var0);
      }

      public static STPathShadeType parse(String var0) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(String var0, XmlOptions var1) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(File var0) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(URL var0) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(InputStream var0) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(Reader var0) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(XMLStreamReader var0) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(Node var0) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static STPathShadeType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static STPathShadeType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPathShadeType)POIXMLTypeLoader.parse(var0, STPathShadeType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPathShadeType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPathShadeType.type, var1);
      }

   }
}
