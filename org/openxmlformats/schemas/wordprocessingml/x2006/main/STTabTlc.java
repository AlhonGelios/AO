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

public interface STTabTlc extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTabTlc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttabtlc6f42type");
   STTabTlc.Enum NONE = STTabTlc.Enum.forString("none");
   STTabTlc.Enum DOT = STTabTlc.Enum.forString("dot");
   STTabTlc.Enum HYPHEN = STTabTlc.Enum.forString("hyphen");
   STTabTlc.Enum UNDERSCORE = STTabTlc.Enum.forString("underscore");
   STTabTlc.Enum HEAVY = STTabTlc.Enum.forString("heavy");
   STTabTlc.Enum MIDDLE_DOT = STTabTlc.Enum.forString("middleDot");
   int INT_NONE = 1;
   int INT_DOT = 2;
   int INT_HYPHEN = 3;
   int INT_UNDERSCORE = 4;
   int INT_HEAVY = 5;
   int INT_MIDDLE_DOT = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_DOT = 2;
      static final int INT_HYPHEN = 3;
      static final int INT_UNDERSCORE = 4;
      static final int INT_HEAVY = 5;
      static final int INT_MIDDLE_DOT = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTabTlc.Enum[]{new STTabTlc.Enum("none", 1), new STTabTlc.Enum("dot", 2), new STTabTlc.Enum("hyphen", 3), new STTabTlc.Enum("underscore", 4), new STTabTlc.Enum("heavy", 5), new STTabTlc.Enum("middleDot", 6)});
      private static final long serialVersionUID = 1L;


      public static STTabTlc.Enum forString(String var0) {
         return (STTabTlc.Enum)table.forString(var0);
      }

      public static STTabTlc.Enum forInt(int var0) {
         return (STTabTlc.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTabTlc newValue(Object var0) {
         return (STTabTlc)STTabTlc.type.newValue(var0);
      }

      public static STTabTlc newInstance() {
         return (STTabTlc)POIXMLTypeLoader.newInstance(STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc newInstance(XmlOptions var0) {
         return (STTabTlc)POIXMLTypeLoader.newInstance(STTabTlc.type, var0);
      }

      public static STTabTlc parse(String var0) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(String var0, XmlOptions var1) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(File var0) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(URL var0) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(InputStream var0) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(Reader var0) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(XMLStreamReader var0) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(Node var0) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static STTabTlc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static STTabTlc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTabTlc)POIXMLTypeLoader.parse(var0, STTabTlc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTabTlc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTabTlc.type, var1);
      }

   }
}
