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

public interface STFontScheme extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFontScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stfontschemef36dtype");
   STFontScheme.Enum NONE = STFontScheme.Enum.forString("none");
   STFontScheme.Enum MAJOR = STFontScheme.Enum.forString("major");
   STFontScheme.Enum MINOR = STFontScheme.Enum.forString("minor");
   int INT_NONE = 1;
   int INT_MAJOR = 2;
   int INT_MINOR = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_MAJOR = 2;
      static final int INT_MINOR = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFontScheme.Enum[]{new STFontScheme.Enum("none", 1), new STFontScheme.Enum("major", 2), new STFontScheme.Enum("minor", 3)});
      private static final long serialVersionUID = 1L;


      public static STFontScheme.Enum forString(String var0) {
         return (STFontScheme.Enum)table.forString(var0);
      }

      public static STFontScheme.Enum forInt(int var0) {
         return (STFontScheme.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STFontScheme newValue(Object var0) {
         return (STFontScheme)STFontScheme.type.newValue(var0);
      }

      public static STFontScheme newInstance() {
         return (STFontScheme)POIXMLTypeLoader.newInstance(STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme newInstance(XmlOptions var0) {
         return (STFontScheme)POIXMLTypeLoader.newInstance(STFontScheme.type, var0);
      }

      public static STFontScheme parse(String var0) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(String var0, XmlOptions var1) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(File var0) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(URL var0) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(InputStream var0) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(Reader var0) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(XMLStreamReader var0) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(Node var0) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static STFontScheme parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static STFontScheme parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFontScheme)POIXMLTypeLoader.parse(var0, STFontScheme.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontScheme.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontScheme.type, var1);
      }

   }
}
