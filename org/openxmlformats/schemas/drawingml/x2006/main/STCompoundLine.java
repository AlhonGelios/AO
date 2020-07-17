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

public interface STCompoundLine extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCompoundLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcompoundline712atype");
   STCompoundLine.Enum SNG = STCompoundLine.Enum.forString("sng");
   STCompoundLine.Enum DBL = STCompoundLine.Enum.forString("dbl");
   STCompoundLine.Enum THICK_THIN = STCompoundLine.Enum.forString("thickThin");
   STCompoundLine.Enum THIN_THICK = STCompoundLine.Enum.forString("thinThick");
   STCompoundLine.Enum TRI = STCompoundLine.Enum.forString("tri");
   int INT_SNG = 1;
   int INT_DBL = 2;
   int INT_THICK_THIN = 3;
   int INT_THIN_THICK = 4;
   int INT_TRI = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STCompoundLine newValue(Object var0) {
         return (STCompoundLine)STCompoundLine.type.newValue(var0);
      }

      public static STCompoundLine newInstance() {
         return (STCompoundLine)POIXMLTypeLoader.newInstance(STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine newInstance(XmlOptions var0) {
         return (STCompoundLine)POIXMLTypeLoader.newInstance(STCompoundLine.type, var0);
      }

      public static STCompoundLine parse(String var0) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(String var0, XmlOptions var1) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(File var0) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(URL var0) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(InputStream var0) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(Reader var0) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(XMLStreamReader var0) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(Node var0) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static STCompoundLine parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static STCompoundLine parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCompoundLine)POIXMLTypeLoader.parse(var0, STCompoundLine.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCompoundLine.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCompoundLine.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SNG = 1;
      static final int INT_DBL = 2;
      static final int INT_THICK_THIN = 3;
      static final int INT_THIN_THICK = 4;
      static final int INT_TRI = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCompoundLine.Enum[]{new STCompoundLine.Enum("sng", 1), new STCompoundLine.Enum("dbl", 2), new STCompoundLine.Enum("thickThin", 3), new STCompoundLine.Enum("thinThick", 4), new STCompoundLine.Enum("tri", 5)});
      private static final long serialVersionUID = 1L;


      public static STCompoundLine.Enum forString(String var0) {
         return (STCompoundLine.Enum)table.forString(var0);
      }

      public static STCompoundLine.Enum forInt(int var0) {
         return (STCompoundLine.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
