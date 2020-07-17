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

public interface STVerticalAlignment extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STVerticalAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stverticalalignmentd35ctype");
   STVerticalAlignment.Enum TOP = STVerticalAlignment.Enum.forString("top");
   STVerticalAlignment.Enum CENTER = STVerticalAlignment.Enum.forString("center");
   STVerticalAlignment.Enum BOTTOM = STVerticalAlignment.Enum.forString("bottom");
   STVerticalAlignment.Enum JUSTIFY = STVerticalAlignment.Enum.forString("justify");
   STVerticalAlignment.Enum DISTRIBUTED = STVerticalAlignment.Enum.forString("distributed");
   int INT_TOP = 1;
   int INT_CENTER = 2;
   int INT_BOTTOM = 3;
   int INT_JUSTIFY = 4;
   int INT_DISTRIBUTED = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STVerticalAlignment newValue(Object var0) {
         return (STVerticalAlignment)STVerticalAlignment.type.newValue(var0);
      }

      public static STVerticalAlignment newInstance() {
         return (STVerticalAlignment)POIXMLTypeLoader.newInstance(STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment newInstance(XmlOptions var0) {
         return (STVerticalAlignment)POIXMLTypeLoader.newInstance(STVerticalAlignment.type, var0);
      }

      public static STVerticalAlignment parse(String var0) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(File var0) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(URL var0) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(InputStream var0) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(Reader var0) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(XMLStreamReader var0) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(Node var0) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static STVerticalAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static STVerticalAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STVerticalAlignment)POIXMLTypeLoader.parse(var0, STVerticalAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalAlignment.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TOP = 1;
      static final int INT_CENTER = 2;
      static final int INT_BOTTOM = 3;
      static final int INT_JUSTIFY = 4;
      static final int INT_DISTRIBUTED = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STVerticalAlignment.Enum[]{new STVerticalAlignment.Enum("top", 1), new STVerticalAlignment.Enum("center", 2), new STVerticalAlignment.Enum("bottom", 3), new STVerticalAlignment.Enum("justify", 4), new STVerticalAlignment.Enum("distributed", 5)});
      private static final long serialVersionUID = 1L;


      public static STVerticalAlignment.Enum forString(String var0) {
         return (STVerticalAlignment.Enum)table.forString(var0);
      }

      public static STVerticalAlignment.Enum forInt(int var0) {
         return (STVerticalAlignment.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
