package com.microsoft.schemas.vml;

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

public interface STStrokeJoinStyle extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STStrokeJoinStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ststrokejoinstyle3c13type");
   STStrokeJoinStyle.Enum ROUND = STStrokeJoinStyle.Enum.forString("round");
   STStrokeJoinStyle.Enum BEVEL = STStrokeJoinStyle.Enum.forString("bevel");
   STStrokeJoinStyle.Enum MITER = STStrokeJoinStyle.Enum.forString("miter");
   int INT_ROUND = 1;
   int INT_BEVEL = 2;
   int INT_MITER = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STStrokeJoinStyle newValue(Object var0) {
         return (STStrokeJoinStyle)STStrokeJoinStyle.type.newValue(var0);
      }

      public static STStrokeJoinStyle newInstance() {
         return (STStrokeJoinStyle)POIXMLTypeLoader.newInstance(STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle newInstance(XmlOptions var0) {
         return (STStrokeJoinStyle)POIXMLTypeLoader.newInstance(STStrokeJoinStyle.type, var0);
      }

      public static STStrokeJoinStyle parse(String var0) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(File var0) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(URL var0) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(InputStream var0) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(Reader var0) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(XMLStreamReader var0) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(Node var0) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static STStrokeJoinStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static STStrokeJoinStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STStrokeJoinStyle)POIXMLTypeLoader.parse(var0, STStrokeJoinStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STStrokeJoinStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STStrokeJoinStyle.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_ROUND = 1;
      static final int INT_BEVEL = 2;
      static final int INT_MITER = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeJoinStyle.Enum[]{new STStrokeJoinStyle.Enum("round", 1), new STStrokeJoinStyle.Enum("bevel", 2), new STStrokeJoinStyle.Enum("miter", 3)});
      private static final long serialVersionUID = 1L;


      public static STStrokeJoinStyle.Enum forString(String var0) {
         return (STStrokeJoinStyle.Enum)table.forString(var0);
      }

      public static STStrokeJoinStyle.Enum forInt(int var0) {
         return (STStrokeJoinStyle.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
