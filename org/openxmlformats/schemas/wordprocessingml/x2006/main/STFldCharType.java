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

public interface STFldCharType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFldCharType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stfldchartype1eb4type");
   STFldCharType.Enum BEGIN = STFldCharType.Enum.forString("begin");
   STFldCharType.Enum SEPARATE = STFldCharType.Enum.forString("separate");
   STFldCharType.Enum END = STFldCharType.Enum.forString("end");
   int INT_BEGIN = 1;
   int INT_SEPARATE = 2;
   int INT_END = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STFldCharType newValue(Object var0) {
         return (STFldCharType)STFldCharType.type.newValue(var0);
      }

      public static STFldCharType newInstance() {
         return (STFldCharType)POIXMLTypeLoader.newInstance(STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType newInstance(XmlOptions var0) {
         return (STFldCharType)POIXMLTypeLoader.newInstance(STFldCharType.type, var0);
      }

      public static STFldCharType parse(String var0) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(String var0, XmlOptions var1) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(File var0) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(URL var0) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(InputStream var0) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(Reader var0) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(XMLStreamReader var0) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(Node var0) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static STFldCharType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static STFldCharType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFldCharType)POIXMLTypeLoader.parse(var0, STFldCharType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFldCharType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFldCharType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BEGIN = 1;
      static final int INT_SEPARATE = 2;
      static final int INT_END = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFldCharType.Enum[]{new STFldCharType.Enum("begin", 1), new STFldCharType.Enum("separate", 2), new STFldCharType.Enum("end", 3)});
      private static final long serialVersionUID = 1L;


      public static STFldCharType.Enum forString(String var0) {
         return (STFldCharType.Enum)table.forString(var0);
      }

      public static STFldCharType.Enum forInt(int var0) {
         return (STFldCharType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
