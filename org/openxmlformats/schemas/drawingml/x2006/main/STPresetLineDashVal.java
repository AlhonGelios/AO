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

public interface STPresetLineDashVal extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPresetLineDashVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpresetlinedashval159dtype");
   STPresetLineDashVal.Enum SOLID = STPresetLineDashVal.Enum.forString("solid");
   STPresetLineDashVal.Enum DOT = STPresetLineDashVal.Enum.forString("dot");
   STPresetLineDashVal.Enum DASH = STPresetLineDashVal.Enum.forString("dash");
   STPresetLineDashVal.Enum LG_DASH = STPresetLineDashVal.Enum.forString("lgDash");
   STPresetLineDashVal.Enum DASH_DOT = STPresetLineDashVal.Enum.forString("dashDot");
   STPresetLineDashVal.Enum LG_DASH_DOT = STPresetLineDashVal.Enum.forString("lgDashDot");
   STPresetLineDashVal.Enum LG_DASH_DOT_DOT = STPresetLineDashVal.Enum.forString("lgDashDotDot");
   STPresetLineDashVal.Enum SYS_DASH = STPresetLineDashVal.Enum.forString("sysDash");
   STPresetLineDashVal.Enum SYS_DOT = STPresetLineDashVal.Enum.forString("sysDot");
   STPresetLineDashVal.Enum SYS_DASH_DOT = STPresetLineDashVal.Enum.forString("sysDashDot");
   STPresetLineDashVal.Enum SYS_DASH_DOT_DOT = STPresetLineDashVal.Enum.forString("sysDashDotDot");
   int INT_SOLID = 1;
   int INT_DOT = 2;
   int INT_DASH = 3;
   int INT_LG_DASH = 4;
   int INT_DASH_DOT = 5;
   int INT_LG_DASH_DOT = 6;
   int INT_LG_DASH_DOT_DOT = 7;
   int INT_SYS_DASH = 8;
   int INT_SYS_DOT = 9;
   int INT_SYS_DASH_DOT = 10;
   int INT_SYS_DASH_DOT_DOT = 11;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SOLID = 1;
      static final int INT_DOT = 2;
      static final int INT_DASH = 3;
      static final int INT_LG_DASH = 4;
      static final int INT_DASH_DOT = 5;
      static final int INT_LG_DASH_DOT = 6;
      static final int INT_LG_DASH_DOT_DOT = 7;
      static final int INT_SYS_DASH = 8;
      static final int INT_SYS_DOT = 9;
      static final int INT_SYS_DASH_DOT = 10;
      static final int INT_SYS_DASH_DOT_DOT = 11;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPresetLineDashVal.Enum[]{new STPresetLineDashVal.Enum("solid", 1), new STPresetLineDashVal.Enum("dot", 2), new STPresetLineDashVal.Enum("dash", 3), new STPresetLineDashVal.Enum("lgDash", 4), new STPresetLineDashVal.Enum("dashDot", 5), new STPresetLineDashVal.Enum("lgDashDot", 6), new STPresetLineDashVal.Enum("lgDashDotDot", 7), new STPresetLineDashVal.Enum("sysDash", 8), new STPresetLineDashVal.Enum("sysDot", 9), new STPresetLineDashVal.Enum("sysDashDot", 10), new STPresetLineDashVal.Enum("sysDashDotDot", 11)});
      private static final long serialVersionUID = 1L;


      public static STPresetLineDashVal.Enum forString(String var0) {
         return (STPresetLineDashVal.Enum)table.forString(var0);
      }

      public static STPresetLineDashVal.Enum forInt(int var0) {
         return (STPresetLineDashVal.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STPresetLineDashVal newValue(Object var0) {
         return (STPresetLineDashVal)STPresetLineDashVal.type.newValue(var0);
      }

      public static STPresetLineDashVal newInstance() {
         return (STPresetLineDashVal)POIXMLTypeLoader.newInstance(STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal newInstance(XmlOptions var0) {
         return (STPresetLineDashVal)POIXMLTypeLoader.newInstance(STPresetLineDashVal.type, var0);
      }

      public static STPresetLineDashVal parse(String var0) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(String var0, XmlOptions var1) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(File var0) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(URL var0) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(InputStream var0) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(Reader var0) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(XMLStreamReader var0) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(Node var0) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static STPresetLineDashVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static STPresetLineDashVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPresetLineDashVal)POIXMLTypeLoader.parse(var0, STPresetLineDashVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPresetLineDashVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPresetLineDashVal.type, var1);
      }

   }
}
