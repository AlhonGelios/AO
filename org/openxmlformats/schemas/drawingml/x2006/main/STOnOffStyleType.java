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

public interface STOnOffStyleType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STOnOffStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stonoffstyletype4606type");
   STOnOffStyleType.Enum ON = STOnOffStyleType.Enum.forString("on");
   STOnOffStyleType.Enum OFF = STOnOffStyleType.Enum.forString("off");
   STOnOffStyleType.Enum DEF = STOnOffStyleType.Enum.forString("def");
   int INT_ON = 1;
   int INT_OFF = 2;
   int INT_DEF = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_ON = 1;
      static final int INT_OFF = 2;
      static final int INT_DEF = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STOnOffStyleType.Enum[]{new STOnOffStyleType.Enum("on", 1), new STOnOffStyleType.Enum("off", 2), new STOnOffStyleType.Enum("def", 3)});
      private static final long serialVersionUID = 1L;


      public static STOnOffStyleType.Enum forString(String var0) {
         return (STOnOffStyleType.Enum)table.forString(var0);
      }

      public static STOnOffStyleType.Enum forInt(int var0) {
         return (STOnOffStyleType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STOnOffStyleType newValue(Object var0) {
         return (STOnOffStyleType)STOnOffStyleType.type.newValue(var0);
      }

      public static STOnOffStyleType newInstance() {
         return (STOnOffStyleType)POIXMLTypeLoader.newInstance(STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType newInstance(XmlOptions var0) {
         return (STOnOffStyleType)POIXMLTypeLoader.newInstance(STOnOffStyleType.type, var0);
      }

      public static STOnOffStyleType parse(String var0) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(String var0, XmlOptions var1) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(File var0) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(URL var0) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(InputStream var0) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(Reader var0) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(XMLStreamReader var0) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(Node var0) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static STOnOffStyleType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static STOnOffStyleType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STOnOffStyleType)POIXMLTypeLoader.parse(var0, STOnOffStyleType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOnOffStyleType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOnOffStyleType.type, var1);
      }

   }
}
