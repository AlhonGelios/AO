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

public interface STDataValidationType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDataValidationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdatavalidationtypeabf6type");
   STDataValidationType.Enum NONE = STDataValidationType.Enum.forString("none");
   STDataValidationType.Enum WHOLE = STDataValidationType.Enum.forString("whole");
   STDataValidationType.Enum DECIMAL = STDataValidationType.Enum.forString("decimal");
   STDataValidationType.Enum LIST = STDataValidationType.Enum.forString("list");
   STDataValidationType.Enum DATE = STDataValidationType.Enum.forString("date");
   STDataValidationType.Enum TIME = STDataValidationType.Enum.forString("time");
   STDataValidationType.Enum TEXT_LENGTH = STDataValidationType.Enum.forString("textLength");
   STDataValidationType.Enum CUSTOM = STDataValidationType.Enum.forString("custom");
   int INT_NONE = 1;
   int INT_WHOLE = 2;
   int INT_DECIMAL = 3;
   int INT_LIST = 4;
   int INT_DATE = 5;
   int INT_TIME = 6;
   int INT_TEXT_LENGTH = 7;
   int INT_CUSTOM = 8;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_WHOLE = 2;
      static final int INT_DECIMAL = 3;
      static final int INT_LIST = 4;
      static final int INT_DATE = 5;
      static final int INT_TIME = 6;
      static final int INT_TEXT_LENGTH = 7;
      static final int INT_CUSTOM = 8;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDataValidationType.Enum[]{new STDataValidationType.Enum("none", 1), new STDataValidationType.Enum("whole", 2), new STDataValidationType.Enum("decimal", 3), new STDataValidationType.Enum("list", 4), new STDataValidationType.Enum("date", 5), new STDataValidationType.Enum("time", 6), new STDataValidationType.Enum("textLength", 7), new STDataValidationType.Enum("custom", 8)});
      private static final long serialVersionUID = 1L;


      public static STDataValidationType.Enum forString(String var0) {
         return (STDataValidationType.Enum)table.forString(var0);
      }

      public static STDataValidationType.Enum forInt(int var0) {
         return (STDataValidationType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STDataValidationType newValue(Object var0) {
         return (STDataValidationType)STDataValidationType.type.newValue(var0);
      }

      public static STDataValidationType newInstance() {
         return (STDataValidationType)POIXMLTypeLoader.newInstance(STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType newInstance(XmlOptions var0) {
         return (STDataValidationType)POIXMLTypeLoader.newInstance(STDataValidationType.type, var0);
      }

      public static STDataValidationType parse(String var0) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(String var0, XmlOptions var1) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(File var0) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(URL var0) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(InputStream var0) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(Reader var0) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(XMLStreamReader var0) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(Node var0) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static STDataValidationType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static STDataValidationType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDataValidationType)POIXMLTypeLoader.parse(var0, STDataValidationType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationType.type, var1);
      }

   }
}
