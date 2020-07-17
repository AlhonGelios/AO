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

public interface STTextVerticalType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextVerticalType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextverticaltyped988type");
   STTextVerticalType.Enum HORZ = STTextVerticalType.Enum.forString("horz");
   STTextVerticalType.Enum VERT = STTextVerticalType.Enum.forString("vert");
   STTextVerticalType.Enum VERT_270 = STTextVerticalType.Enum.forString("vert270");
   STTextVerticalType.Enum WORD_ART_VERT = STTextVerticalType.Enum.forString("wordArtVert");
   STTextVerticalType.Enum EA_VERT = STTextVerticalType.Enum.forString("eaVert");
   STTextVerticalType.Enum MONGOLIAN_VERT = STTextVerticalType.Enum.forString("mongolianVert");
   STTextVerticalType.Enum WORD_ART_VERT_RTL = STTextVerticalType.Enum.forString("wordArtVertRtl");
   int INT_HORZ = 1;
   int INT_VERT = 2;
   int INT_VERT_270 = 3;
   int INT_WORD_ART_VERT = 4;
   int INT_EA_VERT = 5;
   int INT_MONGOLIAN_VERT = 6;
   int INT_WORD_ART_VERT_RTL = 7;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextVerticalType newValue(Object var0) {
         return (STTextVerticalType)STTextVerticalType.type.newValue(var0);
      }

      public static STTextVerticalType newInstance() {
         return (STTextVerticalType)POIXMLTypeLoader.newInstance(STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType newInstance(XmlOptions var0) {
         return (STTextVerticalType)POIXMLTypeLoader.newInstance(STTextVerticalType.type, var0);
      }

      public static STTextVerticalType parse(String var0) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(File var0) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(URL var0) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(InputStream var0) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(Reader var0) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(XMLStreamReader var0) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(Node var0) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static STTextVerticalType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static STTextVerticalType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextVerticalType)POIXMLTypeLoader.parse(var0, STTextVerticalType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextVerticalType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextVerticalType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_HORZ = 1;
      static final int INT_VERT = 2;
      static final int INT_VERT_270 = 3;
      static final int INT_WORD_ART_VERT = 4;
      static final int INT_EA_VERT = 5;
      static final int INT_MONGOLIAN_VERT = 6;
      static final int INT_WORD_ART_VERT_RTL = 7;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextVerticalType.Enum[]{new STTextVerticalType.Enum("horz", 1), new STTextVerticalType.Enum("vert", 2), new STTextVerticalType.Enum("vert270", 3), new STTextVerticalType.Enum("wordArtVert", 4), new STTextVerticalType.Enum("eaVert", 5), new STTextVerticalType.Enum("mongolianVert", 6), new STTextVerticalType.Enum("wordArtVertRtl", 7)});
      private static final long serialVersionUID = 1L;


      public static STTextVerticalType.Enum forString(String var0) {
         return (STTextVerticalType.Enum)table.forString(var0);
      }

      public static STTextVerticalType.Enum forInt(int var0) {
         return (STTextVerticalType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
