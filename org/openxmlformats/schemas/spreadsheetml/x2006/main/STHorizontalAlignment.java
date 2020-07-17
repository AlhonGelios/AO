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

public interface STHorizontalAlignment extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHorizontalAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthorizontalalignmentf92etype");
   STHorizontalAlignment.Enum GENERAL = STHorizontalAlignment.Enum.forString("general");
   STHorizontalAlignment.Enum LEFT = STHorizontalAlignment.Enum.forString("left");
   STHorizontalAlignment.Enum CENTER = STHorizontalAlignment.Enum.forString("center");
   STHorizontalAlignment.Enum RIGHT = STHorizontalAlignment.Enum.forString("right");
   STHorizontalAlignment.Enum FILL = STHorizontalAlignment.Enum.forString("fill");
   STHorizontalAlignment.Enum JUSTIFY = STHorizontalAlignment.Enum.forString("justify");
   STHorizontalAlignment.Enum CENTER_CONTINUOUS = STHorizontalAlignment.Enum.forString("centerContinuous");
   STHorizontalAlignment.Enum DISTRIBUTED = STHorizontalAlignment.Enum.forString("distributed");
   int INT_GENERAL = 1;
   int INT_LEFT = 2;
   int INT_CENTER = 3;
   int INT_RIGHT = 4;
   int INT_FILL = 5;
   int INT_JUSTIFY = 6;
   int INT_CENTER_CONTINUOUS = 7;
   int INT_DISTRIBUTED = 8;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_GENERAL = 1;
      static final int INT_LEFT = 2;
      static final int INT_CENTER = 3;
      static final int INT_RIGHT = 4;
      static final int INT_FILL = 5;
      static final int INT_JUSTIFY = 6;
      static final int INT_CENTER_CONTINUOUS = 7;
      static final int INT_DISTRIBUTED = 8;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHorizontalAlignment.Enum[]{new STHorizontalAlignment.Enum("general", 1), new STHorizontalAlignment.Enum("left", 2), new STHorizontalAlignment.Enum("center", 3), new STHorizontalAlignment.Enum("right", 4), new STHorizontalAlignment.Enum("fill", 5), new STHorizontalAlignment.Enum("justify", 6), new STHorizontalAlignment.Enum("centerContinuous", 7), new STHorizontalAlignment.Enum("distributed", 8)});
      private static final long serialVersionUID = 1L;


      public static STHorizontalAlignment.Enum forString(String var0) {
         return (STHorizontalAlignment.Enum)table.forString(var0);
      }

      public static STHorizontalAlignment.Enum forInt(int var0) {
         return (STHorizontalAlignment.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STHorizontalAlignment newValue(Object var0) {
         return (STHorizontalAlignment)STHorizontalAlignment.type.newValue(var0);
      }

      public static STHorizontalAlignment newInstance() {
         return (STHorizontalAlignment)POIXMLTypeLoader.newInstance(STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment newInstance(XmlOptions var0) {
         return (STHorizontalAlignment)POIXMLTypeLoader.newInstance(STHorizontalAlignment.type, var0);
      }

      public static STHorizontalAlignment parse(String var0) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(File var0) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(URL var0) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(InputStream var0) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(Reader var0) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(XMLStreamReader var0) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(Node var0) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static STHorizontalAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static STHorizontalAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHorizontalAlignment)POIXMLTypeLoader.parse(var0, STHorizontalAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHorizontalAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHorizontalAlignment.type, var1);
      }

   }
}
