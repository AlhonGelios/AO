package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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

public interface STVerticalJc extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STVerticalJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stverticaljc3629type");
   STVerticalJc.Enum TOP = STVerticalJc.Enum.forString("top");
   STVerticalJc.Enum CENTER = STVerticalJc.Enum.forString("center");
   STVerticalJc.Enum BOTH = STVerticalJc.Enum.forString("both");
   STVerticalJc.Enum BOTTOM = STVerticalJc.Enum.forString("bottom");
   int INT_TOP = 1;
   int INT_CENTER = 2;
   int INT_BOTH = 3;
   int INT_BOTTOM = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STVerticalJc newValue(Object var0) {
         return (STVerticalJc)STVerticalJc.type.newValue(var0);
      }

      public static STVerticalJc newInstance() {
         return (STVerticalJc)POIXMLTypeLoader.newInstance(STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc newInstance(XmlOptions var0) {
         return (STVerticalJc)POIXMLTypeLoader.newInstance(STVerticalJc.type, var0);
      }

      public static STVerticalJc parse(String var0) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(String var0, XmlOptions var1) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(File var0) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(URL var0) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(InputStream var0) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(Reader var0) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(XMLStreamReader var0) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(Node var0) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(Node var0, XmlOptions var1) throws XmlException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static STVerticalJc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static STVerticalJc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STVerticalJc)POIXMLTypeLoader.parse(var0, STVerticalJc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalJc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalJc.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TOP = 1;
      static final int INT_CENTER = 2;
      static final int INT_BOTH = 3;
      static final int INT_BOTTOM = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STVerticalJc.Enum[]{new STVerticalJc.Enum("top", 1), new STVerticalJc.Enum("center", 2), new STVerticalJc.Enum("both", 3), new STVerticalJc.Enum("bottom", 4)});
      private static final long serialVersionUID = 1L;


      public static STVerticalJc.Enum forString(String var0) {
         return (STVerticalJc.Enum)table.forString(var0);
      }

      public static STVerticalJc.Enum forInt(int var0) {
         return (STVerticalJc.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
