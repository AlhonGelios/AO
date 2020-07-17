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

public interface STSchemeColorVal extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSchemeColorVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stschemecolorval722etype");
   STSchemeColorVal.Enum BG_1 = STSchemeColorVal.Enum.forString("bg1");
   STSchemeColorVal.Enum TX_1 = STSchemeColorVal.Enum.forString("tx1");
   STSchemeColorVal.Enum BG_2 = STSchemeColorVal.Enum.forString("bg2");
   STSchemeColorVal.Enum TX_2 = STSchemeColorVal.Enum.forString("tx2");
   STSchemeColorVal.Enum ACCENT_1 = STSchemeColorVal.Enum.forString("accent1");
   STSchemeColorVal.Enum ACCENT_2 = STSchemeColorVal.Enum.forString("accent2");
   STSchemeColorVal.Enum ACCENT_3 = STSchemeColorVal.Enum.forString("accent3");
   STSchemeColorVal.Enum ACCENT_4 = STSchemeColorVal.Enum.forString("accent4");
   STSchemeColorVal.Enum ACCENT_5 = STSchemeColorVal.Enum.forString("accent5");
   STSchemeColorVal.Enum ACCENT_6 = STSchemeColorVal.Enum.forString("accent6");
   STSchemeColorVal.Enum HLINK = STSchemeColorVal.Enum.forString("hlink");
   STSchemeColorVal.Enum FOL_HLINK = STSchemeColorVal.Enum.forString("folHlink");
   STSchemeColorVal.Enum PH_CLR = STSchemeColorVal.Enum.forString("phClr");
   STSchemeColorVal.Enum DK_1 = STSchemeColorVal.Enum.forString("dk1");
   STSchemeColorVal.Enum LT_1 = STSchemeColorVal.Enum.forString("lt1");
   STSchemeColorVal.Enum DK_2 = STSchemeColorVal.Enum.forString("dk2");
   STSchemeColorVal.Enum LT_2 = STSchemeColorVal.Enum.forString("lt2");
   int INT_BG_1 = 1;
   int INT_TX_1 = 2;
   int INT_BG_2 = 3;
   int INT_TX_2 = 4;
   int INT_ACCENT_1 = 5;
   int INT_ACCENT_2 = 6;
   int INT_ACCENT_3 = 7;
   int INT_ACCENT_4 = 8;
   int INT_ACCENT_5 = 9;
   int INT_ACCENT_6 = 10;
   int INT_HLINK = 11;
   int INT_FOL_HLINK = 12;
   int INT_PH_CLR = 13;
   int INT_DK_1 = 14;
   int INT_LT_1 = 15;
   int INT_DK_2 = 16;
   int INT_LT_2 = 17;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STSchemeColorVal newValue(Object var0) {
         return (STSchemeColorVal)STSchemeColorVal.type.newValue(var0);
      }

      public static STSchemeColorVal newInstance() {
         return (STSchemeColorVal)POIXMLTypeLoader.newInstance(STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal newInstance(XmlOptions var0) {
         return (STSchemeColorVal)POIXMLTypeLoader.newInstance(STSchemeColorVal.type, var0);
      }

      public static STSchemeColorVal parse(String var0) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(String var0, XmlOptions var1) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(File var0) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(URL var0) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(InputStream var0) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(Reader var0) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(XMLStreamReader var0) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(Node var0) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static STSchemeColorVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static STSchemeColorVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSchemeColorVal)POIXMLTypeLoader.parse(var0, STSchemeColorVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSchemeColorVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSchemeColorVal.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BG_1 = 1;
      static final int INT_TX_1 = 2;
      static final int INT_BG_2 = 3;
      static final int INT_TX_2 = 4;
      static final int INT_ACCENT_1 = 5;
      static final int INT_ACCENT_2 = 6;
      static final int INT_ACCENT_3 = 7;
      static final int INT_ACCENT_4 = 8;
      static final int INT_ACCENT_5 = 9;
      static final int INT_ACCENT_6 = 10;
      static final int INT_HLINK = 11;
      static final int INT_FOL_HLINK = 12;
      static final int INT_PH_CLR = 13;
      static final int INT_DK_1 = 14;
      static final int INT_LT_1 = 15;
      static final int INT_DK_2 = 16;
      static final int INT_LT_2 = 17;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSchemeColorVal.Enum[]{new STSchemeColorVal.Enum("bg1", 1), new STSchemeColorVal.Enum("tx1", 2), new STSchemeColorVal.Enum("bg2", 3), new STSchemeColorVal.Enum("tx2", 4), new STSchemeColorVal.Enum("accent1", 5), new STSchemeColorVal.Enum("accent2", 6), new STSchemeColorVal.Enum("accent3", 7), new STSchemeColorVal.Enum("accent4", 8), new STSchemeColorVal.Enum("accent5", 9), new STSchemeColorVal.Enum("accent6", 10), new STSchemeColorVal.Enum("hlink", 11), new STSchemeColorVal.Enum("folHlink", 12), new STSchemeColorVal.Enum("phClr", 13), new STSchemeColorVal.Enum("dk1", 14), new STSchemeColorVal.Enum("lt1", 15), new STSchemeColorVal.Enum("dk2", 16), new STSchemeColorVal.Enum("lt2", 17)});
      private static final long serialVersionUID = 1L;


      public static STSchemeColorVal.Enum forString(String var0) {
         return (STSchemeColorVal.Enum)table.forString(var0);
      }

      public static STSchemeColorVal.Enum forInt(int var0) {
         return (STSchemeColorVal.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
