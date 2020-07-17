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

public interface STOnOff extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STOnOff.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stonofffcd2type");
   STOnOff.Enum TRUE = STOnOff.Enum.forString("true");
   STOnOff.Enum FALSE = STOnOff.Enum.forString("false");
   STOnOff.Enum ON = STOnOff.Enum.forString("on");
   STOnOff.Enum OFF = STOnOff.Enum.forString("off");
   STOnOff.Enum X_0 = STOnOff.Enum.forString("0");
   STOnOff.Enum X_1 = STOnOff.Enum.forString("1");
   int INT_TRUE = 1;
   int INT_FALSE = 2;
   int INT_ON = 3;
   int INT_OFF = 4;
   int INT_X_0 = 5;
   int INT_X_1 = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STOnOff newValue(Object var0) {
         return (STOnOff)STOnOff.type.newValue(var0);
      }

      public static STOnOff newInstance() {
         return (STOnOff)POIXMLTypeLoader.newInstance(STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff newInstance(XmlOptions var0) {
         return (STOnOff)POIXMLTypeLoader.newInstance(STOnOff.type, var0);
      }

      public static STOnOff parse(String var0) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(String var0, XmlOptions var1) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(File var0) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(URL var0) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(InputStream var0) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(Reader var0) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(XMLStreamReader var0) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(Node var0) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(Node var0, XmlOptions var1) throws XmlException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static STOnOff parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, (XmlOptions)null);
      }

      public static STOnOff parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STOnOff)POIXMLTypeLoader.parse(var0, STOnOff.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOnOff.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STOnOff.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TRUE = 1;
      static final int INT_FALSE = 2;
      static final int INT_ON = 3;
      static final int INT_OFF = 4;
      static final int INT_X_0 = 5;
      static final int INT_X_1 = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STOnOff.Enum[]{new STOnOff.Enum("true", 1), new STOnOff.Enum("false", 2), new STOnOff.Enum("on", 3), new STOnOff.Enum("off", 4), new STOnOff.Enum("0", 5), new STOnOff.Enum("1", 6)});
      private static final long serialVersionUID = 1L;


      public static STOnOff.Enum forString(String var0) {
         return (STOnOff.Enum)table.forString(var0);
      }

      public static STOnOff.Enum forInt(int var0) {
         return (STOnOff.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
