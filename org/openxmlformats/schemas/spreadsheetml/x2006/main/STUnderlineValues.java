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

public interface STUnderlineValues extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STUnderlineValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stunderlinevaluesb6ddtype");
   STUnderlineValues.Enum SINGLE = STUnderlineValues.Enum.forString("single");
   STUnderlineValues.Enum DOUBLE = STUnderlineValues.Enum.forString("double");
   STUnderlineValues.Enum SINGLE_ACCOUNTING = STUnderlineValues.Enum.forString("singleAccounting");
   STUnderlineValues.Enum DOUBLE_ACCOUNTING = STUnderlineValues.Enum.forString("doubleAccounting");
   STUnderlineValues.Enum NONE = STUnderlineValues.Enum.forString("none");
   int INT_SINGLE = 1;
   int INT_DOUBLE = 2;
   int INT_SINGLE_ACCOUNTING = 3;
   int INT_DOUBLE_ACCOUNTING = 4;
   int INT_NONE = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STUnderlineValues newValue(Object var0) {
         return (STUnderlineValues)STUnderlineValues.type.newValue(var0);
      }

      public static STUnderlineValues newInstance() {
         return (STUnderlineValues)POIXMLTypeLoader.newInstance(STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues newInstance(XmlOptions var0) {
         return (STUnderlineValues)POIXMLTypeLoader.newInstance(STUnderlineValues.type, var0);
      }

      public static STUnderlineValues parse(String var0) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(String var0, XmlOptions var1) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(File var0) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(URL var0) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(InputStream var0) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(Reader var0) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(XMLStreamReader var0) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(Node var0) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(Node var0, XmlOptions var1) throws XmlException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static STUnderlineValues parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static STUnderlineValues parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STUnderlineValues)POIXMLTypeLoader.parse(var0, STUnderlineValues.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnderlineValues.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnderlineValues.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SINGLE = 1;
      static final int INT_DOUBLE = 2;
      static final int INT_SINGLE_ACCOUNTING = 3;
      static final int INT_DOUBLE_ACCOUNTING = 4;
      static final int INT_NONE = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STUnderlineValues.Enum[]{new STUnderlineValues.Enum("single", 1), new STUnderlineValues.Enum("double", 2), new STUnderlineValues.Enum("singleAccounting", 3), new STUnderlineValues.Enum("doubleAccounting", 4), new STUnderlineValues.Enum("none", 5)});
      private static final long serialVersionUID = 1L;


      public static STUnderlineValues.Enum forString(String var0) {
         return (STUnderlineValues.Enum)table.forString(var0);
      }

      public static STUnderlineValues.Enum forInt(int var0) {
         return (STUnderlineValues.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
