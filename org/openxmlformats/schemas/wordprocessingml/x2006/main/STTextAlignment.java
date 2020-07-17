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

public interface STTextAlignment extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextalignment316ctype");
   STTextAlignment.Enum TOP = STTextAlignment.Enum.forString("top");
   STTextAlignment.Enum CENTER = STTextAlignment.Enum.forString("center");
   STTextAlignment.Enum BASELINE = STTextAlignment.Enum.forString("baseline");
   STTextAlignment.Enum BOTTOM = STTextAlignment.Enum.forString("bottom");
   STTextAlignment.Enum AUTO = STTextAlignment.Enum.forString("auto");
   int INT_TOP = 1;
   int INT_CENTER = 2;
   int INT_BASELINE = 3;
   int INT_BOTTOM = 4;
   int INT_AUTO = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextAlignment newValue(Object var0) {
         return (STTextAlignment)STTextAlignment.type.newValue(var0);
      }

      public static STTextAlignment newInstance() {
         return (STTextAlignment)POIXMLTypeLoader.newInstance(STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment newInstance(XmlOptions var0) {
         return (STTextAlignment)POIXMLTypeLoader.newInstance(STTextAlignment.type, var0);
      }

      public static STTextAlignment parse(String var0) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(File var0) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(URL var0) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(InputStream var0) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(Reader var0) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(XMLStreamReader var0) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(Node var0) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static STTextAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static STTextAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextAlignment)POIXMLTypeLoader.parse(var0, STTextAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAlignment.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TOP = 1;
      static final int INT_CENTER = 2;
      static final int INT_BASELINE = 3;
      static final int INT_BOTTOM = 4;
      static final int INT_AUTO = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextAlignment.Enum[]{new STTextAlignment.Enum("top", 1), new STTextAlignment.Enum("center", 2), new STTextAlignment.Enum("baseline", 3), new STTextAlignment.Enum("bottom", 4), new STTextAlignment.Enum("auto", 5)});
      private static final long serialVersionUID = 1L;


      public static STTextAlignment.Enum forString(String var0) {
         return (STTextAlignment.Enum)table.forString(var0);
      }

      public static STTextAlignment.Enum forInt(int var0) {
         return (STTextAlignment.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
