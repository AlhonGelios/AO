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

public interface STLineSpacingRule extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLineSpacingRule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlinespacingrule6237type");
   STLineSpacingRule.Enum AUTO = STLineSpacingRule.Enum.forString("auto");
   STLineSpacingRule.Enum EXACT = STLineSpacingRule.Enum.forString("exact");
   STLineSpacingRule.Enum AT_LEAST = STLineSpacingRule.Enum.forString("atLeast");
   int INT_AUTO = 1;
   int INT_EXACT = 2;
   int INT_AT_LEAST = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AUTO = 1;
      static final int INT_EXACT = 2;
      static final int INT_AT_LEAST = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLineSpacingRule.Enum[]{new STLineSpacingRule.Enum("auto", 1), new STLineSpacingRule.Enum("exact", 2), new STLineSpacingRule.Enum("atLeast", 3)});
      private static final long serialVersionUID = 1L;


      public static STLineSpacingRule.Enum forString(String var0) {
         return (STLineSpacingRule.Enum)table.forString(var0);
      }

      public static STLineSpacingRule.Enum forInt(int var0) {
         return (STLineSpacingRule.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STLineSpacingRule newValue(Object var0) {
         return (STLineSpacingRule)STLineSpacingRule.type.newValue(var0);
      }

      public static STLineSpacingRule newInstance() {
         return (STLineSpacingRule)POIXMLTypeLoader.newInstance(STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule newInstance(XmlOptions var0) {
         return (STLineSpacingRule)POIXMLTypeLoader.newInstance(STLineSpacingRule.type, var0);
      }

      public static STLineSpacingRule parse(String var0) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(String var0, XmlOptions var1) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(File var0) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(URL var0) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(InputStream var0) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(Reader var0) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(XMLStreamReader var0) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(Node var0) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static STLineSpacingRule parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static STLineSpacingRule parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLineSpacingRule)POIXMLTypeLoader.parse(var0, STLineSpacingRule.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineSpacingRule.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineSpacingRule.type, var1);
      }

   }
}
