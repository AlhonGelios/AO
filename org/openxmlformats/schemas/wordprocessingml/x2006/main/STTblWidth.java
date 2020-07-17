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

public interface STTblWidth extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTblWidth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttblwidth3a30type");
   STTblWidth.Enum NIL = STTblWidth.Enum.forString("nil");
   STTblWidth.Enum PCT = STTblWidth.Enum.forString("pct");
   STTblWidth.Enum DXA = STTblWidth.Enum.forString("dxa");
   STTblWidth.Enum AUTO = STTblWidth.Enum.forString("auto");
   int INT_NIL = 1;
   int INT_PCT = 2;
   int INT_DXA = 3;
   int INT_AUTO = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTblWidth newValue(Object var0) {
         return (STTblWidth)STTblWidth.type.newValue(var0);
      }

      public static STTblWidth newInstance() {
         return (STTblWidth)POIXMLTypeLoader.newInstance(STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth newInstance(XmlOptions var0) {
         return (STTblWidth)POIXMLTypeLoader.newInstance(STTblWidth.type, var0);
      }

      public static STTblWidth parse(String var0) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(String var0, XmlOptions var1) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(File var0) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(URL var0) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(InputStream var0) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(Reader var0) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(XMLStreamReader var0) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(Node var0) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static STTblWidth parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static STTblWidth parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTblWidth)POIXMLTypeLoader.parse(var0, STTblWidth.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTblWidth.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTblWidth.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NIL = 1;
      static final int INT_PCT = 2;
      static final int INT_DXA = 3;
      static final int INT_AUTO = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTblWidth.Enum[]{new STTblWidth.Enum("nil", 1), new STTblWidth.Enum("pct", 2), new STTblWidth.Enum("dxa", 3), new STTblWidth.Enum("auto", 4)});
      private static final long serialVersionUID = 1L;


      public static STTblWidth.Enum forString(String var0) {
         return (STTblWidth.Enum)table.forString(var0);
      }

      public static STTblWidth.Enum forInt(int var0) {
         return (STTblWidth.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
