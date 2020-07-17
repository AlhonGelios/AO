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

public interface STStyleType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ststyletypec2b7type");
   STStyleType.Enum PARAGRAPH = STStyleType.Enum.forString("paragraph");
   STStyleType.Enum CHARACTER = STStyleType.Enum.forString("character");
   STStyleType.Enum TABLE = STStyleType.Enum.forString("table");
   STStyleType.Enum NUMBERING = STStyleType.Enum.forString("numbering");
   int INT_PARAGRAPH = 1;
   int INT_CHARACTER = 2;
   int INT_TABLE = 3;
   int INT_NUMBERING = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STStyleType newValue(Object var0) {
         return (STStyleType)STStyleType.type.newValue(var0);
      }

      public static STStyleType newInstance() {
         return (STStyleType)POIXMLTypeLoader.newInstance(STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType newInstance(XmlOptions var0) {
         return (STStyleType)POIXMLTypeLoader.newInstance(STStyleType.type, var0);
      }

      public static STStyleType parse(String var0) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(String var0, XmlOptions var1) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(File var0) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(URL var0) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(InputStream var0) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(Reader var0) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(XMLStreamReader var0) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(Node var0) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static STStyleType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, (XmlOptions)null);
      }

      public static STStyleType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STStyleType)POIXMLTypeLoader.parse(var0, STStyleType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STStyleType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STStyleType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_PARAGRAPH = 1;
      static final int INT_CHARACTER = 2;
      static final int INT_TABLE = 3;
      static final int INT_NUMBERING = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStyleType.Enum[]{new STStyleType.Enum("paragraph", 1), new STStyleType.Enum("character", 2), new STStyleType.Enum("table", 3), new STStyleType.Enum("numbering", 4)});
      private static final long serialVersionUID = 1L;


      public static STStyleType.Enum forString(String var0) {
         return (STStyleType.Enum)table.forString(var0);
      }

      public static STStyleType.Enum forInt(int var0) {
         return (STStyleType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
