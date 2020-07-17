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

public interface STPageOrder extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPageOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpageorderd2cetype");
   STPageOrder.Enum DOWN_THEN_OVER = STPageOrder.Enum.forString("downThenOver");
   STPageOrder.Enum OVER_THEN_DOWN = STPageOrder.Enum.forString("overThenDown");
   int INT_DOWN_THEN_OVER = 1;
   int INT_OVER_THEN_DOWN = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STPageOrder newValue(Object var0) {
         return (STPageOrder)STPageOrder.type.newValue(var0);
      }

      public static STPageOrder newInstance() {
         return (STPageOrder)POIXMLTypeLoader.newInstance(STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder newInstance(XmlOptions var0) {
         return (STPageOrder)POIXMLTypeLoader.newInstance(STPageOrder.type, var0);
      }

      public static STPageOrder parse(String var0) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(String var0, XmlOptions var1) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(File var0) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(URL var0) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(InputStream var0) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(Reader var0) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(XMLStreamReader var0) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(Node var0) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static STPageOrder parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static STPageOrder parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPageOrder)POIXMLTypeLoader.parse(var0, STPageOrder.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPageOrder.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPageOrder.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_DOWN_THEN_OVER = 1;
      static final int INT_OVER_THEN_DOWN = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPageOrder.Enum[]{new STPageOrder.Enum("downThenOver", 1), new STPageOrder.Enum("overThenDown", 2)});
      private static final long serialVersionUID = 1L;


      public static STPageOrder.Enum forString(String var0) {
         return (STPageOrder.Enum)table.forString(var0);
      }

      public static STPageOrder.Enum forInt(int var0) {
         return (STPageOrder.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
