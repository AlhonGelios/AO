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

public interface STTextWrappingType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextWrappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextwrappingtype4b4etype");
   STTextWrappingType.Enum NONE = STTextWrappingType.Enum.forString("none");
   STTextWrappingType.Enum SQUARE = STTextWrappingType.Enum.forString("square");
   int INT_NONE = 1;
   int INT_SQUARE = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_SQUARE = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextWrappingType.Enum[]{new STTextWrappingType.Enum("none", 1), new STTextWrappingType.Enum("square", 2)});
      private static final long serialVersionUID = 1L;


      public static STTextWrappingType.Enum forString(String var0) {
         return (STTextWrappingType.Enum)table.forString(var0);
      }

      public static STTextWrappingType.Enum forInt(int var0) {
         return (STTextWrappingType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTextWrappingType newValue(Object var0) {
         return (STTextWrappingType)STTextWrappingType.type.newValue(var0);
      }

      public static STTextWrappingType newInstance() {
         return (STTextWrappingType)POIXMLTypeLoader.newInstance(STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType newInstance(XmlOptions var0) {
         return (STTextWrappingType)POIXMLTypeLoader.newInstance(STTextWrappingType.type, var0);
      }

      public static STTextWrappingType parse(String var0) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(File var0) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(URL var0) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(InputStream var0) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(Reader var0) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(XMLStreamReader var0) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(Node var0) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static STTextWrappingType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static STTextWrappingType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextWrappingType)POIXMLTypeLoader.parse(var0, STTextWrappingType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextWrappingType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextWrappingType.type, var1);
      }

   }
}
