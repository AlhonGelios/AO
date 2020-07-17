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

public interface STTextHorzOverflowType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextHorzOverflowType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttexthorzoverflowtype6003type");
   STTextHorzOverflowType.Enum OVERFLOW = STTextHorzOverflowType.Enum.forString("overflow");
   STTextHorzOverflowType.Enum CLIP = STTextHorzOverflowType.Enum.forString("clip");
   int INT_OVERFLOW = 1;
   int INT_CLIP = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextHorzOverflowType newValue(Object var0) {
         return (STTextHorzOverflowType)STTextHorzOverflowType.type.newValue(var0);
      }

      public static STTextHorzOverflowType newInstance() {
         return (STTextHorzOverflowType)POIXMLTypeLoader.newInstance(STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType newInstance(XmlOptions var0) {
         return (STTextHorzOverflowType)POIXMLTypeLoader.newInstance(STTextHorzOverflowType.type, var0);
      }

      public static STTextHorzOverflowType parse(String var0) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(File var0) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(URL var0) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(InputStream var0) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(Reader var0) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(XMLStreamReader var0) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(Node var0) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static STTextHorzOverflowType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static STTextHorzOverflowType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextHorzOverflowType)POIXMLTypeLoader.parse(var0, STTextHorzOverflowType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextHorzOverflowType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextHorzOverflowType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_OVERFLOW = 1;
      static final int INT_CLIP = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextHorzOverflowType.Enum[]{new STTextHorzOverflowType.Enum("overflow", 1), new STTextHorzOverflowType.Enum("clip", 2)});
      private static final long serialVersionUID = 1L;


      public static STTextHorzOverflowType.Enum forString(String var0) {
         return (STTextHorzOverflowType.Enum)table.forString(var0);
      }

      public static STTextHorzOverflowType.Enum forInt(int var0) {
         return (STTextHorzOverflowType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
