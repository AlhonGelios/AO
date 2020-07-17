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

public interface STLayoutTarget extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLayoutTarget.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlayouttarget19f1type");
   STLayoutTarget.Enum INNER = STLayoutTarget.Enum.forString("inner");
   STLayoutTarget.Enum OUTER = STLayoutTarget.Enum.forString("outer");
   int INT_INNER = 1;
   int INT_OUTER = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_INNER = 1;
      static final int INT_OUTER = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLayoutTarget.Enum[]{new STLayoutTarget.Enum("inner", 1), new STLayoutTarget.Enum("outer", 2)});
      private static final long serialVersionUID = 1L;


      public static STLayoutTarget.Enum forString(String var0) {
         return (STLayoutTarget.Enum)table.forString(var0);
      }

      public static STLayoutTarget.Enum forInt(int var0) {
         return (STLayoutTarget.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STLayoutTarget newValue(Object var0) {
         return (STLayoutTarget)STLayoutTarget.type.newValue(var0);
      }

      public static STLayoutTarget newInstance() {
         return (STLayoutTarget)POIXMLTypeLoader.newInstance(STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget newInstance(XmlOptions var0) {
         return (STLayoutTarget)POIXMLTypeLoader.newInstance(STLayoutTarget.type, var0);
      }

      public static STLayoutTarget parse(String var0) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(String var0, XmlOptions var1) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(File var0) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(URL var0) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(InputStream var0) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(Reader var0) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(XMLStreamReader var0) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(Node var0) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static STLayoutTarget parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static STLayoutTarget parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLayoutTarget)POIXMLTypeLoader.parse(var0, STLayoutTarget.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLayoutTarget.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLayoutTarget.type, var1);
      }

   }
}
