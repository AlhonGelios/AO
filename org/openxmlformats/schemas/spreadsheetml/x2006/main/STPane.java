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

public interface STPane extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPane.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpane2ac1type");
   STPane.Enum BOTTOM_RIGHT = STPane.Enum.forString("bottomRight");
   STPane.Enum TOP_RIGHT = STPane.Enum.forString("topRight");
   STPane.Enum BOTTOM_LEFT = STPane.Enum.forString("bottomLeft");
   STPane.Enum TOP_LEFT = STPane.Enum.forString("topLeft");
   int INT_BOTTOM_RIGHT = 1;
   int INT_TOP_RIGHT = 2;
   int INT_BOTTOM_LEFT = 3;
   int INT_TOP_LEFT = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STPane newValue(Object var0) {
         return (STPane)STPane.type.newValue(var0);
      }

      public static STPane newInstance() {
         return (STPane)POIXMLTypeLoader.newInstance(STPane.type, (XmlOptions)null);
      }

      public static STPane newInstance(XmlOptions var0) {
         return (STPane)POIXMLTypeLoader.newInstance(STPane.type, var0);
      }

      public static STPane parse(String var0) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(String var0, XmlOptions var1) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(File var0) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(URL var0) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(InputStream var0) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(Reader var0) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(XMLStreamReader var0) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(Node var0) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static STPane parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, (XmlOptions)null);
      }

      public static STPane parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPane)POIXMLTypeLoader.parse(var0, STPane.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPane.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPane.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BOTTOM_RIGHT = 1;
      static final int INT_TOP_RIGHT = 2;
      static final int INT_BOTTOM_LEFT = 3;
      static final int INT_TOP_LEFT = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPane.Enum[]{new STPane.Enum("bottomRight", 1), new STPane.Enum("topRight", 2), new STPane.Enum("bottomLeft", 3), new STPane.Enum("topLeft", 4)});
      private static final long serialVersionUID = 1L;


      public static STPane.Enum forString(String var0) {
         return (STPane.Enum)table.forString(var0);
      }

      public static STPane.Enum forInt(int var0) {
         return (STPane.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
