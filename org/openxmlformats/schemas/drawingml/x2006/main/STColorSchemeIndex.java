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

public interface STColorSchemeIndex extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STColorSchemeIndex.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcolorschemeindexe6f5type");
   STColorSchemeIndex.Enum DK_1 = STColorSchemeIndex.Enum.forString("dk1");
   STColorSchemeIndex.Enum LT_1 = STColorSchemeIndex.Enum.forString("lt1");
   STColorSchemeIndex.Enum DK_2 = STColorSchemeIndex.Enum.forString("dk2");
   STColorSchemeIndex.Enum LT_2 = STColorSchemeIndex.Enum.forString("lt2");
   STColorSchemeIndex.Enum ACCENT_1 = STColorSchemeIndex.Enum.forString("accent1");
   STColorSchemeIndex.Enum ACCENT_2 = STColorSchemeIndex.Enum.forString("accent2");
   STColorSchemeIndex.Enum ACCENT_3 = STColorSchemeIndex.Enum.forString("accent3");
   STColorSchemeIndex.Enum ACCENT_4 = STColorSchemeIndex.Enum.forString("accent4");
   STColorSchemeIndex.Enum ACCENT_5 = STColorSchemeIndex.Enum.forString("accent5");
   STColorSchemeIndex.Enum ACCENT_6 = STColorSchemeIndex.Enum.forString("accent6");
   STColorSchemeIndex.Enum HLINK = STColorSchemeIndex.Enum.forString("hlink");
   STColorSchemeIndex.Enum FOL_HLINK = STColorSchemeIndex.Enum.forString("folHlink");
   int INT_DK_1 = 1;
   int INT_LT_1 = 2;
   int INT_DK_2 = 3;
   int INT_LT_2 = 4;
   int INT_ACCENT_1 = 5;
   int INT_ACCENT_2 = 6;
   int INT_ACCENT_3 = 7;
   int INT_ACCENT_4 = 8;
   int INT_ACCENT_5 = 9;
   int INT_ACCENT_6 = 10;
   int INT_HLINK = 11;
   int INT_FOL_HLINK = 12;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STColorSchemeIndex newValue(Object var0) {
         return (STColorSchemeIndex)STColorSchemeIndex.type.newValue(var0);
      }

      public static STColorSchemeIndex newInstance() {
         return (STColorSchemeIndex)POIXMLTypeLoader.newInstance(STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex newInstance(XmlOptions var0) {
         return (STColorSchemeIndex)POIXMLTypeLoader.newInstance(STColorSchemeIndex.type, var0);
      }

      public static STColorSchemeIndex parse(String var0) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(String var0, XmlOptions var1) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(File var0) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(URL var0) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(InputStream var0) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(Reader var0) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(XMLStreamReader var0) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(Node var0) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(Node var0, XmlOptions var1) throws XmlException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static STColorSchemeIndex parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static STColorSchemeIndex parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STColorSchemeIndex)POIXMLTypeLoader.parse(var0, STColorSchemeIndex.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColorSchemeIndex.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColorSchemeIndex.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_DK_1 = 1;
      static final int INT_LT_1 = 2;
      static final int INT_DK_2 = 3;
      static final int INT_LT_2 = 4;
      static final int INT_ACCENT_1 = 5;
      static final int INT_ACCENT_2 = 6;
      static final int INT_ACCENT_3 = 7;
      static final int INT_ACCENT_4 = 8;
      static final int INT_ACCENT_5 = 9;
      static final int INT_ACCENT_6 = 10;
      static final int INT_HLINK = 11;
      static final int INT_FOL_HLINK = 12;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STColorSchemeIndex.Enum[]{new STColorSchemeIndex.Enum("dk1", 1), new STColorSchemeIndex.Enum("lt1", 2), new STColorSchemeIndex.Enum("dk2", 3), new STColorSchemeIndex.Enum("lt2", 4), new STColorSchemeIndex.Enum("accent1", 5), new STColorSchemeIndex.Enum("accent2", 6), new STColorSchemeIndex.Enum("accent3", 7), new STColorSchemeIndex.Enum("accent4", 8), new STColorSchemeIndex.Enum("accent5", 9), new STColorSchemeIndex.Enum("accent6", 10), new STColorSchemeIndex.Enum("hlink", 11), new STColorSchemeIndex.Enum("folHlink", 12)});
      private static final long serialVersionUID = 1L;


      public static STColorSchemeIndex.Enum forString(String var0) {
         return (STColorSchemeIndex.Enum)table.forString(var0);
      }

      public static STColorSchemeIndex.Enum forInt(int var0) {
         return (STColorSchemeIndex.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
