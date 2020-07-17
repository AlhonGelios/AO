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

public interface STCipherAlgorithm extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCipherAlgorithm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stcipheralgorithme346type");
   STCipherAlgorithm.Enum AES = STCipherAlgorithm.Enum.forString("AES");
   STCipherAlgorithm.Enum RC_2 = STCipherAlgorithm.Enum.forString("RC2");
   STCipherAlgorithm.Enum RC_4 = STCipherAlgorithm.Enum.forString("RC4");
   STCipherAlgorithm.Enum DES = STCipherAlgorithm.Enum.forString("DES");
   STCipherAlgorithm.Enum DESX = STCipherAlgorithm.Enum.forString("DESX");
   STCipherAlgorithm.Enum X_3_DES = STCipherAlgorithm.Enum.forString("3DES");
   STCipherAlgorithm.Enum X_3_DES_112 = STCipherAlgorithm.Enum.forString("3DES_112");
   int INT_AES = 1;
   int INT_RC_2 = 2;
   int INT_RC_4 = 3;
   int INT_DES = 4;
   int INT_DESX = 5;
   int INT_X_3_DES = 6;
   int INT_X_3_DES_112 = 7;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AES = 1;
      static final int INT_RC_2 = 2;
      static final int INT_RC_4 = 3;
      static final int INT_DES = 4;
      static final int INT_DESX = 5;
      static final int INT_X_3_DES = 6;
      static final int INT_X_3_DES_112 = 7;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCipherAlgorithm.Enum[]{new STCipherAlgorithm.Enum("AES", 1), new STCipherAlgorithm.Enum("RC2", 2), new STCipherAlgorithm.Enum("RC4", 3), new STCipherAlgorithm.Enum("DES", 4), new STCipherAlgorithm.Enum("DESX", 5), new STCipherAlgorithm.Enum("3DES", 6), new STCipherAlgorithm.Enum("3DES_112", 7)});
      private static final long serialVersionUID = 1L;


      public static STCipherAlgorithm.Enum forString(String var0) {
         return (STCipherAlgorithm.Enum)table.forString(var0);
      }

      public static STCipherAlgorithm.Enum forInt(int var0) {
         return (STCipherAlgorithm.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCipherAlgorithm newValue(Object var0) {
         return (STCipherAlgorithm)STCipherAlgorithm.type.newValue(var0);
      }

      public static STCipherAlgorithm newInstance() {
         return (STCipherAlgorithm)POIXMLTypeLoader.newInstance(STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm newInstance(XmlOptions var0) {
         return (STCipherAlgorithm)POIXMLTypeLoader.newInstance(STCipherAlgorithm.type, var0);
      }

      public static STCipherAlgorithm parse(String var0) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(String var0, XmlOptions var1) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(File var0) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(URL var0) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(InputStream var0) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(Reader var0) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(XMLStreamReader var0) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(Node var0) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static STCipherAlgorithm parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static STCipherAlgorithm parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCipherAlgorithm)POIXMLTypeLoader.parse(var0, STCipherAlgorithm.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCipherAlgorithm.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCipherAlgorithm.type, var1);
      }

   }
}
