package org.openxmlformats.schemas.drawingml.x2006.main;

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

public interface STTextVertOverflowType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextVertOverflowType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextvertoverflowtype2725type");
   STTextVertOverflowType.Enum OVERFLOW = STTextVertOverflowType.Enum.forString("overflow");
   STTextVertOverflowType.Enum ELLIPSIS = STTextVertOverflowType.Enum.forString("ellipsis");
   STTextVertOverflowType.Enum CLIP = STTextVertOverflowType.Enum.forString("clip");
   int INT_OVERFLOW = 1;
   int INT_ELLIPSIS = 2;
   int INT_CLIP = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextVertOverflowType newValue(Object var0) {
         return (STTextVertOverflowType)STTextVertOverflowType.type.newValue(var0);
      }

      public static STTextVertOverflowType newInstance() {
         return (STTextVertOverflowType)POIXMLTypeLoader.newInstance(STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType newInstance(XmlOptions var0) {
         return (STTextVertOverflowType)POIXMLTypeLoader.newInstance(STTextVertOverflowType.type, var0);
      }

      public static STTextVertOverflowType parse(String var0) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(File var0) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(URL var0) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(InputStream var0) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(Reader var0) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(XMLStreamReader var0) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(Node var0) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static STTextVertOverflowType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static STTextVertOverflowType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextVertOverflowType)POIXMLTypeLoader.parse(var0, STTextVertOverflowType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextVertOverflowType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextVertOverflowType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_OVERFLOW = 1;
      static final int INT_ELLIPSIS = 2;
      static final int INT_CLIP = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextVertOverflowType.Enum[]{new STTextVertOverflowType.Enum("overflow", 1), new STTextVertOverflowType.Enum("ellipsis", 2), new STTextVertOverflowType.Enum("clip", 3)});
      private static final long serialVersionUID = 1L;


      public static STTextVertOverflowType.Enum forString(String var0) {
         return (STTextVertOverflowType.Enum)table.forString(var0);
      }

      public static STTextVertOverflowType.Enum forInt(int var0) {
         return (STTextVertOverflowType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
