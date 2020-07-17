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

public interface STBorderStyle extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBorderStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stborderstylec774type");
   STBorderStyle.Enum NONE = STBorderStyle.Enum.forString("none");
   STBorderStyle.Enum THIN = STBorderStyle.Enum.forString("thin");
   STBorderStyle.Enum MEDIUM = STBorderStyle.Enum.forString("medium");
   STBorderStyle.Enum DASHED = STBorderStyle.Enum.forString("dashed");
   STBorderStyle.Enum DOTTED = STBorderStyle.Enum.forString("dotted");
   STBorderStyle.Enum THICK = STBorderStyle.Enum.forString("thick");
   STBorderStyle.Enum DOUBLE = STBorderStyle.Enum.forString("double");
   STBorderStyle.Enum HAIR = STBorderStyle.Enum.forString("hair");
   STBorderStyle.Enum MEDIUM_DASHED = STBorderStyle.Enum.forString("mediumDashed");
   STBorderStyle.Enum DASH_DOT = STBorderStyle.Enum.forString("dashDot");
   STBorderStyle.Enum MEDIUM_DASH_DOT = STBorderStyle.Enum.forString("mediumDashDot");
   STBorderStyle.Enum DASH_DOT_DOT = STBorderStyle.Enum.forString("dashDotDot");
   STBorderStyle.Enum MEDIUM_DASH_DOT_DOT = STBorderStyle.Enum.forString("mediumDashDotDot");
   STBorderStyle.Enum SLANT_DASH_DOT = STBorderStyle.Enum.forString("slantDashDot");
   int INT_NONE = 1;
   int INT_THIN = 2;
   int INT_MEDIUM = 3;
   int INT_DASHED = 4;
   int INT_DOTTED = 5;
   int INT_THICK = 6;
   int INT_DOUBLE = 7;
   int INT_HAIR = 8;
   int INT_MEDIUM_DASHED = 9;
   int INT_DASH_DOT = 10;
   int INT_MEDIUM_DASH_DOT = 11;
   int INT_DASH_DOT_DOT = 12;
   int INT_MEDIUM_DASH_DOT_DOT = 13;
   int INT_SLANT_DASH_DOT = 14;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_THIN = 2;
      static final int INT_MEDIUM = 3;
      static final int INT_DASHED = 4;
      static final int INT_DOTTED = 5;
      static final int INT_THICK = 6;
      static final int INT_DOUBLE = 7;
      static final int INT_HAIR = 8;
      static final int INT_MEDIUM_DASHED = 9;
      static final int INT_DASH_DOT = 10;
      static final int INT_MEDIUM_DASH_DOT = 11;
      static final int INT_DASH_DOT_DOT = 12;
      static final int INT_MEDIUM_DASH_DOT_DOT = 13;
      static final int INT_SLANT_DASH_DOT = 14;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STBorderStyle.Enum[]{new STBorderStyle.Enum("none", 1), new STBorderStyle.Enum("thin", 2), new STBorderStyle.Enum("medium", 3), new STBorderStyle.Enum("dashed", 4), new STBorderStyle.Enum("dotted", 5), new STBorderStyle.Enum("thick", 6), new STBorderStyle.Enum("double", 7), new STBorderStyle.Enum("hair", 8), new STBorderStyle.Enum("mediumDashed", 9), new STBorderStyle.Enum("dashDot", 10), new STBorderStyle.Enum("mediumDashDot", 11), new STBorderStyle.Enum("dashDotDot", 12), new STBorderStyle.Enum("mediumDashDotDot", 13), new STBorderStyle.Enum("slantDashDot", 14)});
      private static final long serialVersionUID = 1L;


      public static STBorderStyle.Enum forString(String var0) {
         return (STBorderStyle.Enum)table.forString(var0);
      }

      public static STBorderStyle.Enum forInt(int var0) {
         return (STBorderStyle.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STBorderStyle newValue(Object var0) {
         return (STBorderStyle)STBorderStyle.type.newValue(var0);
      }

      public static STBorderStyle newInstance() {
         return (STBorderStyle)POIXMLTypeLoader.newInstance(STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle newInstance(XmlOptions var0) {
         return (STBorderStyle)POIXMLTypeLoader.newInstance(STBorderStyle.type, var0);
      }

      public static STBorderStyle parse(String var0) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(File var0) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(URL var0) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(InputStream var0) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(Reader var0) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(XMLStreamReader var0) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(Node var0) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static STBorderStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static STBorderStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBorderStyle)POIXMLTypeLoader.parse(var0, STBorderStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorderStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorderStyle.type, var1);
      }

   }
}
