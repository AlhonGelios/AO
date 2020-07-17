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

public interface STHashAlgorithm extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHashAlgorithm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("sthashalgorithm65e3type");
   STHashAlgorithm.Enum SHA_1 = STHashAlgorithm.Enum.forString("SHA1");
   STHashAlgorithm.Enum SHA_256 = STHashAlgorithm.Enum.forString("SHA256");
   STHashAlgorithm.Enum SHA_384 = STHashAlgorithm.Enum.forString("SHA384");
   STHashAlgorithm.Enum SHA_512 = STHashAlgorithm.Enum.forString("SHA512");
   STHashAlgorithm.Enum MD_5 = STHashAlgorithm.Enum.forString("MD5");
   STHashAlgorithm.Enum MD_4 = STHashAlgorithm.Enum.forString("MD4");
   STHashAlgorithm.Enum MD_2 = STHashAlgorithm.Enum.forString("MD2");
   STHashAlgorithm.Enum RIPEMD_128 = STHashAlgorithm.Enum.forString("RIPEMD-128");
   STHashAlgorithm.Enum RIPEMD_160 = STHashAlgorithm.Enum.forString("RIPEMD-160");
   STHashAlgorithm.Enum WHIRLPOOL = STHashAlgorithm.Enum.forString("WHIRLPOOL");
   int INT_SHA_1 = 1;
   int INT_SHA_256 = 2;
   int INT_SHA_384 = 3;
   int INT_SHA_512 = 4;
   int INT_MD_5 = 5;
   int INT_MD_4 = 6;
   int INT_MD_2 = 7;
   int INT_RIPEMD_128 = 8;
   int INT_RIPEMD_160 = 9;
   int INT_WHIRLPOOL = 10;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SHA_1 = 1;
      static final int INT_SHA_256 = 2;
      static final int INT_SHA_384 = 3;
      static final int INT_SHA_512 = 4;
      static final int INT_MD_5 = 5;
      static final int INT_MD_4 = 6;
      static final int INT_MD_2 = 7;
      static final int INT_RIPEMD_128 = 8;
      static final int INT_RIPEMD_160 = 9;
      static final int INT_WHIRLPOOL = 10;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHashAlgorithm.Enum[]{new STHashAlgorithm.Enum("SHA1", 1), new STHashAlgorithm.Enum("SHA256", 2), new STHashAlgorithm.Enum("SHA384", 3), new STHashAlgorithm.Enum("SHA512", 4), new STHashAlgorithm.Enum("MD5", 5), new STHashAlgorithm.Enum("MD4", 6), new STHashAlgorithm.Enum("MD2", 7), new STHashAlgorithm.Enum("RIPEMD-128", 8), new STHashAlgorithm.Enum("RIPEMD-160", 9), new STHashAlgorithm.Enum("WHIRLPOOL", 10)});
      private static final long serialVersionUID = 1L;


      public static STHashAlgorithm.Enum forString(String var0) {
         return (STHashAlgorithm.Enum)table.forString(var0);
      }

      public static STHashAlgorithm.Enum forInt(int var0) {
         return (STHashAlgorithm.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STHashAlgorithm newValue(Object var0) {
         return (STHashAlgorithm)STHashAlgorithm.type.newValue(var0);
      }

      public static STHashAlgorithm newInstance() {
         return (STHashAlgorithm)POIXMLTypeLoader.newInstance(STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm newInstance(XmlOptions var0) {
         return (STHashAlgorithm)POIXMLTypeLoader.newInstance(STHashAlgorithm.type, var0);
      }

      public static STHashAlgorithm parse(String var0) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(String var0, XmlOptions var1) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(File var0) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(URL var0) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(InputStream var0) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(Reader var0) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(XMLStreamReader var0) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(Node var0) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static STHashAlgorithm parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static STHashAlgorithm parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHashAlgorithm)POIXMLTypeLoader.parse(var0, STHashAlgorithm.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHashAlgorithm.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHashAlgorithm.type, var1);
      }

   }
}
