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

public interface STCryptProv extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCryptProv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcryptprov6ccbtype");
   STCryptProv.Enum RSA_AES = STCryptProv.Enum.forString("rsaAES");
   STCryptProv.Enum RSA_FULL = STCryptProv.Enum.forString("rsaFull");
   int INT_RSA_AES = 1;
   int INT_RSA_FULL = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_RSA_AES = 1;
      static final int INT_RSA_FULL = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCryptProv.Enum[]{new STCryptProv.Enum("rsaAES", 1), new STCryptProv.Enum("rsaFull", 2)});
      private static final long serialVersionUID = 1L;


      public static STCryptProv.Enum forString(String var0) {
         return (STCryptProv.Enum)table.forString(var0);
      }

      public static STCryptProv.Enum forInt(int var0) {
         return (STCryptProv.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCryptProv newValue(Object var0) {
         return (STCryptProv)STCryptProv.type.newValue(var0);
      }

      public static STCryptProv newInstance() {
         return (STCryptProv)POIXMLTypeLoader.newInstance(STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv newInstance(XmlOptions var0) {
         return (STCryptProv)POIXMLTypeLoader.newInstance(STCryptProv.type, var0);
      }

      public static STCryptProv parse(String var0) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(String var0, XmlOptions var1) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(File var0) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(URL var0) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(InputStream var0) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(Reader var0) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(XMLStreamReader var0) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(Node var0) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static STCryptProv parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static STCryptProv parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCryptProv)POIXMLTypeLoader.parse(var0, STCryptProv.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCryptProv.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCryptProv.type, var1);
      }

   }
}
