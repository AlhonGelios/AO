package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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

public interface STCalcMode extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCalcMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcalcmode5e71type");
   STCalcMode.Enum MANUAL = STCalcMode.Enum.forString("manual");
   STCalcMode.Enum AUTO = STCalcMode.Enum.forString("auto");
   STCalcMode.Enum AUTO_NO_TABLE = STCalcMode.Enum.forString("autoNoTable");
   int INT_MANUAL = 1;
   int INT_AUTO = 2;
   int INT_AUTO_NO_TABLE = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STCalcMode newValue(Object var0) {
         return (STCalcMode)STCalcMode.type.newValue(var0);
      }

      public static STCalcMode newInstance() {
         return (STCalcMode)POIXMLTypeLoader.newInstance(STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode newInstance(XmlOptions var0) {
         return (STCalcMode)POIXMLTypeLoader.newInstance(STCalcMode.type, var0);
      }

      public static STCalcMode parse(String var0) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(String var0, XmlOptions var1) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(File var0) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(URL var0) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(InputStream var0) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(Reader var0) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(XMLStreamReader var0) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(Node var0) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static STCalcMode parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static STCalcMode parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCalcMode)POIXMLTypeLoader.parse(var0, STCalcMode.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCalcMode.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCalcMode.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_MANUAL = 1;
      static final int INT_AUTO = 2;
      static final int INT_AUTO_NO_TABLE = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCalcMode.Enum[]{new STCalcMode.Enum("manual", 1), new STCalcMode.Enum("auto", 2), new STCalcMode.Enum("autoNoTable", 3)});
      private static final long serialVersionUID = 1L;


      public static STCalcMode.Enum forString(String var0) {
         return (STCalcMode.Enum)table.forString(var0);
      }

      public static STCalcMode.Enum forInt(int var0) {
         return (STCalcMode.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
