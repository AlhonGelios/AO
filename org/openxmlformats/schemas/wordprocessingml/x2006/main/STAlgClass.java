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

public interface STAlgClass extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAlgClass.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stalgclass061ctype");
   STAlgClass.Enum HASH = STAlgClass.Enum.forString("hash");
   int INT_HASH = 1;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_HASH = 1;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STAlgClass.Enum[]{new STAlgClass.Enum("hash", 1)});
      private static final long serialVersionUID = 1L;


      public static STAlgClass.Enum forString(String var0) {
         return (STAlgClass.Enum)table.forString(var0);
      }

      public static STAlgClass.Enum forInt(int var0) {
         return (STAlgClass.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STAlgClass newValue(Object var0) {
         return (STAlgClass)STAlgClass.type.newValue(var0);
      }

      public static STAlgClass newInstance() {
         return (STAlgClass)POIXMLTypeLoader.newInstance(STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass newInstance(XmlOptions var0) {
         return (STAlgClass)POIXMLTypeLoader.newInstance(STAlgClass.type, var0);
      }

      public static STAlgClass parse(String var0) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(String var0, XmlOptions var1) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(File var0) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(URL var0) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(InputStream var0) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(Reader var0) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(XMLStreamReader var0) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(Node var0) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static STAlgClass parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static STAlgClass parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAlgClass)POIXMLTypeLoader.parse(var0, STAlgClass.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAlgClass.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAlgClass.type, var1);
      }

   }
}
