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

public interface STVerticalAlignRun extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STVerticalAlignRun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stverticalalignrun4db5type");
   STVerticalAlignRun.Enum BASELINE = STVerticalAlignRun.Enum.forString("baseline");
   STVerticalAlignRun.Enum SUPERSCRIPT = STVerticalAlignRun.Enum.forString("superscript");
   STVerticalAlignRun.Enum SUBSCRIPT = STVerticalAlignRun.Enum.forString("subscript");
   int INT_BASELINE = 1;
   int INT_SUPERSCRIPT = 2;
   int INT_SUBSCRIPT = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BASELINE = 1;
      static final int INT_SUPERSCRIPT = 2;
      static final int INT_SUBSCRIPT = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STVerticalAlignRun.Enum[]{new STVerticalAlignRun.Enum("baseline", 1), new STVerticalAlignRun.Enum("superscript", 2), new STVerticalAlignRun.Enum("subscript", 3)});
      private static final long serialVersionUID = 1L;


      public static STVerticalAlignRun.Enum forString(String var0) {
         return (STVerticalAlignRun.Enum)table.forString(var0);
      }

      public static STVerticalAlignRun.Enum forInt(int var0) {
         return (STVerticalAlignRun.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STVerticalAlignRun newValue(Object var0) {
         return (STVerticalAlignRun)STVerticalAlignRun.type.newValue(var0);
      }

      public static STVerticalAlignRun newInstance() {
         return (STVerticalAlignRun)POIXMLTypeLoader.newInstance(STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun newInstance(XmlOptions var0) {
         return (STVerticalAlignRun)POIXMLTypeLoader.newInstance(STVerticalAlignRun.type, var0);
      }

      public static STVerticalAlignRun parse(String var0) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(String var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(File var0) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(URL var0) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(InputStream var0) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(Reader var0) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(XMLStreamReader var0) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(Node var0) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(Node var0, XmlOptions var1) throws XmlException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static STVerticalAlignRun parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static STVerticalAlignRun parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STVerticalAlignRun)POIXMLTypeLoader.parse(var0, STVerticalAlignRun.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalAlignRun.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STVerticalAlignRun.type, var1);
      }

   }
}
