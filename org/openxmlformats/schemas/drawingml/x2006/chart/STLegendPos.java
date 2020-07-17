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

public interface STLegendPos extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLegendPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlegendposc14ftype");
   STLegendPos.Enum B = STLegendPos.Enum.forString("b");
   STLegendPos.Enum TR = STLegendPos.Enum.forString("tr");
   STLegendPos.Enum L = STLegendPos.Enum.forString("l");
   STLegendPos.Enum R = STLegendPos.Enum.forString("r");
   STLegendPos.Enum T = STLegendPos.Enum.forString("t");
   int INT_B = 1;
   int INT_TR = 2;
   int INT_L = 3;
   int INT_R = 4;
   int INT_T = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STLegendPos newValue(Object var0) {
         return (STLegendPos)STLegendPos.type.newValue(var0);
      }

      public static STLegendPos newInstance() {
         return (STLegendPos)POIXMLTypeLoader.newInstance(STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos newInstance(XmlOptions var0) {
         return (STLegendPos)POIXMLTypeLoader.newInstance(STLegendPos.type, var0);
      }

      public static STLegendPos parse(String var0) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(String var0, XmlOptions var1) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(File var0) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(URL var0) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(InputStream var0) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(Reader var0) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(XMLStreamReader var0) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(Node var0) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static STLegendPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static STLegendPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLegendPos)POIXMLTypeLoader.parse(var0, STLegendPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLegendPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLegendPos.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_B = 1;
      static final int INT_TR = 2;
      static final int INT_L = 3;
      static final int INT_R = 4;
      static final int INT_T = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLegendPos.Enum[]{new STLegendPos.Enum("b", 1), new STLegendPos.Enum("tr", 2), new STLegendPos.Enum("l", 3), new STLegendPos.Enum("r", 4), new STLegendPos.Enum("t", 5)});
      private static final long serialVersionUID = 1L;


      public static STLegendPos.Enum forString(String var0) {
         return (STLegendPos.Enum)table.forString(var0);
      }

      public static STLegendPos.Enum forInt(int var0) {
         return (STLegendPos.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
