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

public interface STIconSetType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STIconSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sticonsettype6112type");
   STIconSetType.Enum X_3_ARROWS = STIconSetType.Enum.forString("3Arrows");
   STIconSetType.Enum X_3_ARROWS_GRAY = STIconSetType.Enum.forString("3ArrowsGray");
   STIconSetType.Enum X_3_FLAGS = STIconSetType.Enum.forString("3Flags");
   STIconSetType.Enum X_3_TRAFFIC_LIGHTS_1 = STIconSetType.Enum.forString("3TrafficLights1");
   STIconSetType.Enum X_3_TRAFFIC_LIGHTS_2 = STIconSetType.Enum.forString("3TrafficLights2");
   STIconSetType.Enum X_3_SIGNS = STIconSetType.Enum.forString("3Signs");
   STIconSetType.Enum X_3_SYMBOLS = STIconSetType.Enum.forString("3Symbols");
   STIconSetType.Enum X_3_SYMBOLS_2 = STIconSetType.Enum.forString("3Symbols2");
   STIconSetType.Enum X_4_ARROWS = STIconSetType.Enum.forString("4Arrows");
   STIconSetType.Enum X_4_ARROWS_GRAY = STIconSetType.Enum.forString("4ArrowsGray");
   STIconSetType.Enum X_4_RED_TO_BLACK = STIconSetType.Enum.forString("4RedToBlack");
   STIconSetType.Enum X_4_RATING = STIconSetType.Enum.forString("4Rating");
   STIconSetType.Enum X_4_TRAFFIC_LIGHTS = STIconSetType.Enum.forString("4TrafficLights");
   STIconSetType.Enum X_5_ARROWS = STIconSetType.Enum.forString("5Arrows");
   STIconSetType.Enum X_5_ARROWS_GRAY = STIconSetType.Enum.forString("5ArrowsGray");
   STIconSetType.Enum X_5_RATING = STIconSetType.Enum.forString("5Rating");
   STIconSetType.Enum X_5_QUARTERS = STIconSetType.Enum.forString("5Quarters");
   int INT_X_3_ARROWS = 1;
   int INT_X_3_ARROWS_GRAY = 2;
   int INT_X_3_FLAGS = 3;
   int INT_X_3_TRAFFIC_LIGHTS_1 = 4;
   int INT_X_3_TRAFFIC_LIGHTS_2 = 5;
   int INT_X_3_SIGNS = 6;
   int INT_X_3_SYMBOLS = 7;
   int INT_X_3_SYMBOLS_2 = 8;
   int INT_X_4_ARROWS = 9;
   int INT_X_4_ARROWS_GRAY = 10;
   int INT_X_4_RED_TO_BLACK = 11;
   int INT_X_4_RATING = 12;
   int INT_X_4_TRAFFIC_LIGHTS = 13;
   int INT_X_5_ARROWS = 14;
   int INT_X_5_ARROWS_GRAY = 15;
   int INT_X_5_RATING = 16;
   int INT_X_5_QUARTERS = 17;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STIconSetType newValue(Object var0) {
         return (STIconSetType)STIconSetType.type.newValue(var0);
      }

      public static STIconSetType newInstance() {
         return (STIconSetType)POIXMLTypeLoader.newInstance(STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType newInstance(XmlOptions var0) {
         return (STIconSetType)POIXMLTypeLoader.newInstance(STIconSetType.type, var0);
      }

      public static STIconSetType parse(String var0) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(String var0, XmlOptions var1) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(File var0) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(URL var0) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(InputStream var0) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(Reader var0) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(XMLStreamReader var0) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(Node var0) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static STIconSetType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static STIconSetType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STIconSetType)POIXMLTypeLoader.parse(var0, STIconSetType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STIconSetType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STIconSetType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_X_3_ARROWS = 1;
      static final int INT_X_3_ARROWS_GRAY = 2;
      static final int INT_X_3_FLAGS = 3;
      static final int INT_X_3_TRAFFIC_LIGHTS_1 = 4;
      static final int INT_X_3_TRAFFIC_LIGHTS_2 = 5;
      static final int INT_X_3_SIGNS = 6;
      static final int INT_X_3_SYMBOLS = 7;
      static final int INT_X_3_SYMBOLS_2 = 8;
      static final int INT_X_4_ARROWS = 9;
      static final int INT_X_4_ARROWS_GRAY = 10;
      static final int INT_X_4_RED_TO_BLACK = 11;
      static final int INT_X_4_RATING = 12;
      static final int INT_X_4_TRAFFIC_LIGHTS = 13;
      static final int INT_X_5_ARROWS = 14;
      static final int INT_X_5_ARROWS_GRAY = 15;
      static final int INT_X_5_RATING = 16;
      static final int INT_X_5_QUARTERS = 17;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STIconSetType.Enum[]{new STIconSetType.Enum("3Arrows", 1), new STIconSetType.Enum("3ArrowsGray", 2), new STIconSetType.Enum("3Flags", 3), new STIconSetType.Enum("3TrafficLights1", 4), new STIconSetType.Enum("3TrafficLights2", 5), new STIconSetType.Enum("3Signs", 6), new STIconSetType.Enum("3Symbols", 7), new STIconSetType.Enum("3Symbols2", 8), new STIconSetType.Enum("4Arrows", 9), new STIconSetType.Enum("4ArrowsGray", 10), new STIconSetType.Enum("4RedToBlack", 11), new STIconSetType.Enum("4Rating", 12), new STIconSetType.Enum("4TrafficLights", 13), new STIconSetType.Enum("5Arrows", 14), new STIconSetType.Enum("5ArrowsGray", 15), new STIconSetType.Enum("5Rating", 16), new STIconSetType.Enum("5Quarters", 17)});
      private static final long serialVersionUID = 1L;


      public static STIconSetType.Enum forString(String var0) {
         return (STIconSetType.Enum)table.forString(var0);
      }

      public static STIconSetType.Enum forInt(int var0) {
         return (STIconSetType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
