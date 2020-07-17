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

public interface STAlgType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAlgType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stalgtype156ctype");
   STAlgType.Enum TYPE_ANY = STAlgType.Enum.forString("typeAny");
   int INT_TYPE_ANY = 1;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TYPE_ANY = 1;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STAlgType.Enum[]{new STAlgType.Enum("typeAny", 1)});
      private static final long serialVersionUID = 1L;


      public static STAlgType.Enum forString(String var0) {
         return (STAlgType.Enum)table.forString(var0);
      }

      public static STAlgType.Enum forInt(int var0) {
         return (STAlgType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STAlgType newValue(Object var0) {
         return (STAlgType)STAlgType.type.newValue(var0);
      }

      public static STAlgType newInstance() {
         return (STAlgType)POIXMLTypeLoader.newInstance(STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType newInstance(XmlOptions var0) {
         return (STAlgType)POIXMLTypeLoader.newInstance(STAlgType.type, var0);
      }

      public static STAlgType parse(String var0) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(String var0, XmlOptions var1) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(File var0) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(URL var0) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(InputStream var0) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(Reader var0) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(XMLStreamReader var0) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(Node var0) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static STAlgType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, (XmlOptions)null);
      }

      public static STAlgType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAlgType)POIXMLTypeLoader.parse(var0, STAlgType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAlgType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAlgType.type, var1);
      }

   }
}
