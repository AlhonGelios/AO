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

public interface STLineEndType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLineEndType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlineendtype8902type");
   STLineEndType.Enum NONE = STLineEndType.Enum.forString("none");
   STLineEndType.Enum TRIANGLE = STLineEndType.Enum.forString("triangle");
   STLineEndType.Enum STEALTH = STLineEndType.Enum.forString("stealth");
   STLineEndType.Enum DIAMOND = STLineEndType.Enum.forString("diamond");
   STLineEndType.Enum OVAL = STLineEndType.Enum.forString("oval");
   STLineEndType.Enum ARROW = STLineEndType.Enum.forString("arrow");
   int INT_NONE = 1;
   int INT_TRIANGLE = 2;
   int INT_STEALTH = 3;
   int INT_DIAMOND = 4;
   int INT_OVAL = 5;
   int INT_ARROW = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STLineEndType newValue(Object var0) {
         return (STLineEndType)STLineEndType.type.newValue(var0);
      }

      public static STLineEndType newInstance() {
         return (STLineEndType)POIXMLTypeLoader.newInstance(STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType newInstance(XmlOptions var0) {
         return (STLineEndType)POIXMLTypeLoader.newInstance(STLineEndType.type, var0);
      }

      public static STLineEndType parse(String var0) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(String var0, XmlOptions var1) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(File var0) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(URL var0) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(InputStream var0) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(Reader var0) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(XMLStreamReader var0) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(Node var0) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static STLineEndType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static STLineEndType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLineEndType)POIXMLTypeLoader.parse(var0, STLineEndType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineEndType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineEndType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_TRIANGLE = 2;
      static final int INT_STEALTH = 3;
      static final int INT_DIAMOND = 4;
      static final int INT_OVAL = 5;
      static final int INT_ARROW = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLineEndType.Enum[]{new STLineEndType.Enum("none", 1), new STLineEndType.Enum("triangle", 2), new STLineEndType.Enum("stealth", 3), new STLineEndType.Enum("diamond", 4), new STLineEndType.Enum("oval", 5), new STLineEndType.Enum("arrow", 6)});
      private static final long serialVersionUID = 1L;


      public static STLineEndType.Enum forString(String var0) {
         return (STLineEndType.Enum)table.forString(var0);
      }

      public static STLineEndType.Enum forInt(int var0) {
         return (STLineEndType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
