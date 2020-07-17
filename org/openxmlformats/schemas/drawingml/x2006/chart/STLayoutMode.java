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

public interface STLayoutMode extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLayoutMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlayoutmode19dftype");
   STLayoutMode.Enum EDGE = STLayoutMode.Enum.forString("edge");
   STLayoutMode.Enum FACTOR = STLayoutMode.Enum.forString("factor");
   int INT_EDGE = 1;
   int INT_FACTOR = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STLayoutMode newValue(Object var0) {
         return (STLayoutMode)STLayoutMode.type.newValue(var0);
      }

      public static STLayoutMode newInstance() {
         return (STLayoutMode)POIXMLTypeLoader.newInstance(STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode newInstance(XmlOptions var0) {
         return (STLayoutMode)POIXMLTypeLoader.newInstance(STLayoutMode.type, var0);
      }

      public static STLayoutMode parse(String var0) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(String var0, XmlOptions var1) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(File var0) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(URL var0) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(InputStream var0) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(Reader var0) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(XMLStreamReader var0) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(Node var0) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static STLayoutMode parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static STLayoutMode parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLayoutMode)POIXMLTypeLoader.parse(var0, STLayoutMode.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLayoutMode.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLayoutMode.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_EDGE = 1;
      static final int INT_FACTOR = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLayoutMode.Enum[]{new STLayoutMode.Enum("edge", 1), new STLayoutMode.Enum("factor", 2)});
      private static final long serialVersionUID = 1L;


      public static STLayoutMode.Enum forString(String var0) {
         return (STLayoutMode.Enum)table.forString(var0);
      }

      public static STLayoutMode.Enum forInt(int var0) {
         return (STLayoutMode.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
