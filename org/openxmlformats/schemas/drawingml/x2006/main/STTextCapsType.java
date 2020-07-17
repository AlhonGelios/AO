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

public interface STTextCapsType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextCapsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextcapstyped233type");
   STTextCapsType.Enum NONE = STTextCapsType.Enum.forString("none");
   STTextCapsType.Enum SMALL = STTextCapsType.Enum.forString("small");
   STTextCapsType.Enum ALL = STTextCapsType.Enum.forString("all");
   int INT_NONE = 1;
   int INT_SMALL = 2;
   int INT_ALL = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_SMALL = 2;
      static final int INT_ALL = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextCapsType.Enum[]{new STTextCapsType.Enum("none", 1), new STTextCapsType.Enum("small", 2), new STTextCapsType.Enum("all", 3)});
      private static final long serialVersionUID = 1L;


      public static STTextCapsType.Enum forString(String var0) {
         return (STTextCapsType.Enum)table.forString(var0);
      }

      public static STTextCapsType.Enum forInt(int var0) {
         return (STTextCapsType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STTextCapsType newValue(Object var0) {
         return (STTextCapsType)STTextCapsType.type.newValue(var0);
      }

      public static STTextCapsType newInstance() {
         return (STTextCapsType)POIXMLTypeLoader.newInstance(STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType newInstance(XmlOptions var0) {
         return (STTextCapsType)POIXMLTypeLoader.newInstance(STTextCapsType.type, var0);
      }

      public static STTextCapsType parse(String var0) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(File var0) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(URL var0) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(InputStream var0) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(Reader var0) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(XMLStreamReader var0) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(Node var0) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static STTextCapsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static STTextCapsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextCapsType)POIXMLTypeLoader.parse(var0, STTextCapsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextCapsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextCapsType.type, var1);
      }

   }
}
