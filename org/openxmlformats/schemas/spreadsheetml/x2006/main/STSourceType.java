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

public interface STSourceType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsourcetype074etype");
   STSourceType.Enum WORKSHEET = STSourceType.Enum.forString("worksheet");
   STSourceType.Enum EXTERNAL = STSourceType.Enum.forString("external");
   STSourceType.Enum CONSOLIDATION = STSourceType.Enum.forString("consolidation");
   STSourceType.Enum SCENARIO = STSourceType.Enum.forString("scenario");
   int INT_WORKSHEET = 1;
   int INT_EXTERNAL = 2;
   int INT_CONSOLIDATION = 3;
   int INT_SCENARIO = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STSourceType newValue(Object var0) {
         return (STSourceType)STSourceType.type.newValue(var0);
      }

      public static STSourceType newInstance() {
         return (STSourceType)POIXMLTypeLoader.newInstance(STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType newInstance(XmlOptions var0) {
         return (STSourceType)POIXMLTypeLoader.newInstance(STSourceType.type, var0);
      }

      public static STSourceType parse(String var0) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(String var0, XmlOptions var1) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(File var0) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(URL var0) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(InputStream var0) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(Reader var0) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(XMLStreamReader var0) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(Node var0) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static STSourceType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, (XmlOptions)null);
      }

      public static STSourceType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSourceType)POIXMLTypeLoader.parse(var0, STSourceType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSourceType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSourceType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_WORKSHEET = 1;
      static final int INT_EXTERNAL = 2;
      static final int INT_CONSOLIDATION = 3;
      static final int INT_SCENARIO = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSourceType.Enum[]{new STSourceType.Enum("worksheet", 1), new STSourceType.Enum("external", 2), new STSourceType.Enum("consolidation", 3), new STSourceType.Enum("scenario", 4)});
      private static final long serialVersionUID = 1L;


      public static STSourceType.Enum forString(String var0) {
         return (STSourceType.Enum)table.forString(var0);
      }

      public static STSourceType.Enum forInt(int var0) {
         return (STSourceType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
