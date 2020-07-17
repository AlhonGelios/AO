package org.openxmlformats.schemas.drawingml.x2006.chart;

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

public interface STAxPos extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAxPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("staxpos4379type");
   STAxPos.Enum B = STAxPos.Enum.forString("b");
   STAxPos.Enum L = STAxPos.Enum.forString("l");
   STAxPos.Enum R = STAxPos.Enum.forString("r");
   STAxPos.Enum T = STAxPos.Enum.forString("t");
   int INT_B = 1;
   int INT_L = 2;
   int INT_R = 3;
   int INT_T = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_B = 1;
      static final int INT_L = 2;
      static final int INT_R = 3;
      static final int INT_T = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STAxPos.Enum[]{new STAxPos.Enum("b", 1), new STAxPos.Enum("l", 2), new STAxPos.Enum("r", 3), new STAxPos.Enum("t", 4)});
      private static final long serialVersionUID = 1L;


      public static STAxPos.Enum forString(String var0) {
         return (STAxPos.Enum)table.forString(var0);
      }

      public static STAxPos.Enum forInt(int var0) {
         return (STAxPos.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STAxPos newValue(Object var0) {
         return (STAxPos)STAxPos.type.newValue(var0);
      }

      public static STAxPos newInstance() {
         return (STAxPos)POIXMLTypeLoader.newInstance(STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos newInstance(XmlOptions var0) {
         return (STAxPos)POIXMLTypeLoader.newInstance(STAxPos.type, var0);
      }

      public static STAxPos parse(String var0) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(String var0, XmlOptions var1) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(File var0) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(URL var0) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(InputStream var0) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(Reader var0) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(XMLStreamReader var0) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(Node var0) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static STAxPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, (XmlOptions)null);
      }

      public static STAxPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAxPos)POIXMLTypeLoader.parse(var0, STAxPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAxPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAxPos.type, var1);
      }

   }
}
