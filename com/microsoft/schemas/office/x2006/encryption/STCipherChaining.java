package com.microsoft.schemas.office.x2006.encryption;

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

public interface STCipherChaining extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCipherChaining.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stcipherchaining1e98type");
   STCipherChaining.Enum CHAINING_MODE_CBC = STCipherChaining.Enum.forString("ChainingModeCBC");
   STCipherChaining.Enum CHAINING_MODE_CFB = STCipherChaining.Enum.forString("ChainingModeCFB");
   int INT_CHAINING_MODE_CBC = 1;
   int INT_CHAINING_MODE_CFB = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CHAINING_MODE_CBC = 1;
      static final int INT_CHAINING_MODE_CFB = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCipherChaining.Enum[]{new STCipherChaining.Enum("ChainingModeCBC", 1), new STCipherChaining.Enum("ChainingModeCFB", 2)});
      private static final long serialVersionUID = 1L;


      public static STCipherChaining.Enum forString(String var0) {
         return (STCipherChaining.Enum)table.forString(var0);
      }

      public static STCipherChaining.Enum forInt(int var0) {
         return (STCipherChaining.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCipherChaining newValue(Object var0) {
         return (STCipherChaining)STCipherChaining.type.newValue(var0);
      }

      public static STCipherChaining newInstance() {
         return (STCipherChaining)POIXMLTypeLoader.newInstance(STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining newInstance(XmlOptions var0) {
         return (STCipherChaining)POIXMLTypeLoader.newInstance(STCipherChaining.type, var0);
      }

      public static STCipherChaining parse(String var0) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(String var0, XmlOptions var1) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(File var0) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(URL var0) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(InputStream var0) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(Reader var0) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(XMLStreamReader var0) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(Node var0) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static STCipherChaining parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static STCipherChaining parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCipherChaining)POIXMLTypeLoader.parse(var0, STCipherChaining.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCipherChaining.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCipherChaining.type, var1);
      }

   }
}
