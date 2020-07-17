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

public interface STOrientation extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STOrientation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("storientationc326type");
   STOrientation.Enum MAX_MIN = STOrientation.Enum.forString("maxMin");
   STOrientation.Enum MIN_MAX = STOrientation.Enum.forString("minMax");
   int INT_MAX_MIN = 1;
   int INT_MIN_MAX = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_MAX_MIN = 1;
      static final int INT_MIN_MAX = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STOrientation.Enum[]{new STOrientation.Enum("maxMin", 1), new STOrientation.Enum("minMax", 2)});
      private static final long serialVersionUID = 1L;


      public static STOrientation.Enum forString(String var0) {
         return (STOrientation.Enum)table.forString(var0);
      }

      public static STOrientation.Enum forInt(int var0) {
         return (STOrientation.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STOrientation newValue(Object var0) {
         return (STOrientation)STOrientation.type.newValue(var0);
      }

      public static STOrientation newInstance() {
         return (STOrientation)POIXMLTypeLoader.newInstance(STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation newInstance(XmlOptions var0) {
         return (STOrientation)POIXMLTypeLoader.newInstance(STOrientation.type, var0);
      }

      public static STOrientation parse(String var0) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(String var0, XmlOptions var1) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(File var0) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(URL var0) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(InputStream var0) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(Reader var0) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(XMLStreamReader var0) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(Node var0) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(Node var0, XmlOptions var1) throws XmlException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static STOrientation parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, (XmlOptions)null);
      }

      public static STOrientation parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STOrientation)POIXMLTypeLoader.parse(var0, STOrientation.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOrientation.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOrientation.type, var1);
      }

   }
}
