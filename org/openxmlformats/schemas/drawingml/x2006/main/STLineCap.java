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

public interface STLineCap extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLineCap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlinecapcddftype");
   STLineCap.Enum RND = STLineCap.Enum.forString("rnd");
   STLineCap.Enum SQ = STLineCap.Enum.forString("sq");
   STLineCap.Enum FLAT = STLineCap.Enum.forString("flat");
   int INT_RND = 1;
   int INT_SQ = 2;
   int INT_FLAT = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STLineCap newValue(Object var0) {
         return (STLineCap)STLineCap.type.newValue(var0);
      }

      public static STLineCap newInstance() {
         return (STLineCap)POIXMLTypeLoader.newInstance(STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap newInstance(XmlOptions var0) {
         return (STLineCap)POIXMLTypeLoader.newInstance(STLineCap.type, var0);
      }

      public static STLineCap parse(String var0) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(String var0, XmlOptions var1) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(File var0) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(URL var0) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(InputStream var0) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(Reader var0) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(XMLStreamReader var0) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(Node var0) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static STLineCap parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, (XmlOptions)null);
      }

      public static STLineCap parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLineCap)POIXMLTypeLoader.parse(var0, STLineCap.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineCap.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineCap.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_RND = 1;
      static final int INT_SQ = 2;
      static final int INT_FLAT = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLineCap.Enum[]{new STLineCap.Enum("rnd", 1), new STLineCap.Enum("sq", 2), new STLineCap.Enum("flat", 3)});
      private static final long serialVersionUID = 1L;


      public static STLineCap.Enum forString(String var0) {
         return (STLineCap.Enum)table.forString(var0);
      }

      public static STLineCap.Enum forInt(int var0) {
         return (STLineCap.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
