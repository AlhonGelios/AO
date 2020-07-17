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

public interface STTextAlignType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextAlignType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextaligntypebc93type");
   STTextAlignType.Enum L = STTextAlignType.Enum.forString("l");
   STTextAlignType.Enum CTR = STTextAlignType.Enum.forString("ctr");
   STTextAlignType.Enum R = STTextAlignType.Enum.forString("r");
   STTextAlignType.Enum JUST = STTextAlignType.Enum.forString("just");
   STTextAlignType.Enum JUST_LOW = STTextAlignType.Enum.forString("justLow");
   STTextAlignType.Enum DIST = STTextAlignType.Enum.forString("dist");
   STTextAlignType.Enum THAI_DIST = STTextAlignType.Enum.forString("thaiDist");
   int INT_L = 1;
   int INT_CTR = 2;
   int INT_R = 3;
   int INT_JUST = 4;
   int INT_JUST_LOW = 5;
   int INT_DIST = 6;
   int INT_THAI_DIST = 7;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_L = 1;
      static final int INT_CTR = 2;
      static final int INT_R = 3;
      static final int INT_JUST = 4;
      static final int INT_JUST_LOW = 5;
      static final int INT_DIST = 6;
      static final int INT_THAI_DIST = 7;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextAlignType.Enum[]{new STTextAlignType.Enum("l", 1), new STTextAlignType.Enum("ctr", 2), new STTextAlignType.Enum("r", 3), new STTextAlignType.Enum("just", 4), new STTextAlignType.Enum("justLow", 5), new STTextAlignType.Enum("dist", 6), new STTextAlignType.Enum("thaiDist", 7)});
      private static final long serialVersionUID = 1L;


      public static STTextAlignType.Enum forString(String var0) {
         return (STTextAlignType.Enum)table.forString(var0);
      }

      public static STTextAlignType.Enum forInt(int var0) {
         return (STTextAlignType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTextAlignType newValue(Object var0) {
         return (STTextAlignType)STTextAlignType.type.newValue(var0);
      }

      public static STTextAlignType newInstance() {
         return (STTextAlignType)POIXMLTypeLoader.newInstance(STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType newInstance(XmlOptions var0) {
         return (STTextAlignType)POIXMLTypeLoader.newInstance(STTextAlignType.type, var0);
      }

      public static STTextAlignType parse(String var0) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(File var0) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(URL var0) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(InputStream var0) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(Reader var0) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(XMLStreamReader var0) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(Node var0) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static STTextAlignType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static STTextAlignType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextAlignType)POIXMLTypeLoader.parse(var0, STTextAlignType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAlignType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAlignType.type, var1);
      }

   }
}
