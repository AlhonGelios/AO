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

public interface STMarkerStyle extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STMarkerStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stmarkerstyle177ftype");
   STMarkerStyle.Enum CIRCLE = STMarkerStyle.Enum.forString("circle");
   STMarkerStyle.Enum DASH = STMarkerStyle.Enum.forString("dash");
   STMarkerStyle.Enum DIAMOND = STMarkerStyle.Enum.forString("diamond");
   STMarkerStyle.Enum DOT = STMarkerStyle.Enum.forString("dot");
   STMarkerStyle.Enum NONE = STMarkerStyle.Enum.forString("none");
   STMarkerStyle.Enum PICTURE = STMarkerStyle.Enum.forString("picture");
   STMarkerStyle.Enum PLUS = STMarkerStyle.Enum.forString("plus");
   STMarkerStyle.Enum SQUARE = STMarkerStyle.Enum.forString("square");
   STMarkerStyle.Enum STAR = STMarkerStyle.Enum.forString("star");
   STMarkerStyle.Enum TRIANGLE = STMarkerStyle.Enum.forString("triangle");
   STMarkerStyle.Enum X = STMarkerStyle.Enum.forString("x");
   int INT_CIRCLE = 1;
   int INT_DASH = 2;
   int INT_DIAMOND = 3;
   int INT_DOT = 4;
   int INT_NONE = 5;
   int INT_PICTURE = 6;
   int INT_PLUS = 7;
   int INT_SQUARE = 8;
   int INT_STAR = 9;
   int INT_TRIANGLE = 10;
   int INT_X = 11;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CIRCLE = 1;
      static final int INT_DASH = 2;
      static final int INT_DIAMOND = 3;
      static final int INT_DOT = 4;
      static final int INT_NONE = 5;
      static final int INT_PICTURE = 6;
      static final int INT_PLUS = 7;
      static final int INT_SQUARE = 8;
      static final int INT_STAR = 9;
      static final int INT_TRIANGLE = 10;
      static final int INT_X = 11;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STMarkerStyle.Enum[]{new STMarkerStyle.Enum("circle", 1), new STMarkerStyle.Enum("dash", 2), new STMarkerStyle.Enum("diamond", 3), new STMarkerStyle.Enum("dot", 4), new STMarkerStyle.Enum("none", 5), new STMarkerStyle.Enum("picture", 6), new STMarkerStyle.Enum("plus", 7), new STMarkerStyle.Enum("square", 8), new STMarkerStyle.Enum("star", 9), new STMarkerStyle.Enum("triangle", 10), new STMarkerStyle.Enum("x", 11)});
      private static final long serialVersionUID = 1L;


      public static STMarkerStyle.Enum forString(String var0) {
         return (STMarkerStyle.Enum)table.forString(var0);
      }

      public static STMarkerStyle.Enum forInt(int var0) {
         return (STMarkerStyle.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STMarkerStyle newValue(Object var0) {
         return (STMarkerStyle)STMarkerStyle.type.newValue(var0);
      }

      public static STMarkerStyle newInstance() {
         return (STMarkerStyle)POIXMLTypeLoader.newInstance(STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle newInstance(XmlOptions var0) {
         return (STMarkerStyle)POIXMLTypeLoader.newInstance(STMarkerStyle.type, var0);
      }

      public static STMarkerStyle parse(String var0) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(File var0) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(URL var0) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(InputStream var0) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(Reader var0) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(XMLStreamReader var0) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(Node var0) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static STMarkerStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static STMarkerStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STMarkerStyle)POIXMLTypeLoader.parse(var0, STMarkerStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STMarkerStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STMarkerStyle.type, var1);
      }

   }
}
