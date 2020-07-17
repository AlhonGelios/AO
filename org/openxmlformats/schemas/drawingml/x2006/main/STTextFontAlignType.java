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

public interface STTextFontAlignType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextFontAlignType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextfontaligntypecb44type");
   STTextFontAlignType.Enum AUTO = STTextFontAlignType.Enum.forString("auto");
   STTextFontAlignType.Enum T = STTextFontAlignType.Enum.forString("t");
   STTextFontAlignType.Enum CTR = STTextFontAlignType.Enum.forString("ctr");
   STTextFontAlignType.Enum BASE = STTextFontAlignType.Enum.forString("base");
   STTextFontAlignType.Enum B = STTextFontAlignType.Enum.forString("b");
   int INT_AUTO = 1;
   int INT_T = 2;
   int INT_CTR = 3;
   int INT_BASE = 4;
   int INT_B = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextFontAlignType newValue(Object var0) {
         return (STTextFontAlignType)STTextFontAlignType.type.newValue(var0);
      }

      public static STTextFontAlignType newInstance() {
         return (STTextFontAlignType)POIXMLTypeLoader.newInstance(STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType newInstance(XmlOptions var0) {
         return (STTextFontAlignType)POIXMLTypeLoader.newInstance(STTextFontAlignType.type, var0);
      }

      public static STTextFontAlignType parse(String var0) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(File var0) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(URL var0) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(InputStream var0) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(Reader var0) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(XMLStreamReader var0) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(Node var0) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static STTextFontAlignType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static STTextFontAlignType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextFontAlignType)POIXMLTypeLoader.parse(var0, STTextFontAlignType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontAlignType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontAlignType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AUTO = 1;
      static final int INT_T = 2;
      static final int INT_CTR = 3;
      static final int INT_BASE = 4;
      static final int INT_B = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextFontAlignType.Enum[]{new STTextFontAlignType.Enum("auto", 1), new STTextFontAlignType.Enum("t", 2), new STTextFontAlignType.Enum("ctr", 3), new STTextFontAlignType.Enum("base", 4), new STTextFontAlignType.Enum("b", 5)});
      private static final long serialVersionUID = 1L;


      public static STTextFontAlignType.Enum forString(String var0) {
         return (STTextFontAlignType.Enum)table.forString(var0);
      }

      public static STTextFontAlignType.Enum forInt(int var0) {
         return (STTextFontAlignType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
