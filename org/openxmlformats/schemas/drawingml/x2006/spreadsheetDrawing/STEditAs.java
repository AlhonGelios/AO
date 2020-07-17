package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;

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

public interface STEditAs extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STEditAs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("steditasad40type");
   STEditAs.Enum TWO_CELL = STEditAs.Enum.forString("twoCell");
   STEditAs.Enum ONE_CELL = STEditAs.Enum.forString("oneCell");
   STEditAs.Enum ABSOLUTE = STEditAs.Enum.forString("absolute");
   int INT_TWO_CELL = 1;
   int INT_ONE_CELL = 2;
   int INT_ABSOLUTE = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STEditAs newValue(Object var0) {
         return (STEditAs)STEditAs.type.newValue(var0);
      }

      public static STEditAs newInstance() {
         return (STEditAs)POIXMLTypeLoader.newInstance(STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs newInstance(XmlOptions var0) {
         return (STEditAs)POIXMLTypeLoader.newInstance(STEditAs.type, var0);
      }

      public static STEditAs parse(String var0) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(String var0, XmlOptions var1) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(File var0) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(URL var0) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(InputStream var0) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(Reader var0) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(XMLStreamReader var0) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(Node var0) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(Node var0, XmlOptions var1) throws XmlException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static STEditAs parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, (XmlOptions)null);
      }

      public static STEditAs parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STEditAs)POIXMLTypeLoader.parse(var0, STEditAs.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STEditAs.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STEditAs.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TWO_CELL = 1;
      static final int INT_ONE_CELL = 2;
      static final int INT_ABSOLUTE = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STEditAs.Enum[]{new STEditAs.Enum("twoCell", 1), new STEditAs.Enum("oneCell", 2), new STEditAs.Enum("absolute", 3)});
      private static final long serialVersionUID = 1L;


      public static STEditAs.Enum forString(String var0) {
         return (STEditAs.Enum)table.forString(var0);
      }

      public static STEditAs.Enum forInt(int var0) {
         return (STEditAs.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
