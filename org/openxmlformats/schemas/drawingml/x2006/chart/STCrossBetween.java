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

public interface STCrossBetween extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCrossBetween.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcrossbetweenf504type");
   STCrossBetween.Enum BETWEEN = STCrossBetween.Enum.forString("between");
   STCrossBetween.Enum MID_CAT = STCrossBetween.Enum.forString("midCat");
   int INT_BETWEEN = 1;
   int INT_MID_CAT = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BETWEEN = 1;
      static final int INT_MID_CAT = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCrossBetween.Enum[]{new STCrossBetween.Enum("between", 1), new STCrossBetween.Enum("midCat", 2)});
      private static final long serialVersionUID = 1L;


      public static STCrossBetween.Enum forString(String var0) {
         return (STCrossBetween.Enum)table.forString(var0);
      }

      public static STCrossBetween.Enum forInt(int var0) {
         return (STCrossBetween.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCrossBetween newValue(Object var0) {
         return (STCrossBetween)STCrossBetween.type.newValue(var0);
      }

      public static STCrossBetween newInstance() {
         return (STCrossBetween)POIXMLTypeLoader.newInstance(STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween newInstance(XmlOptions var0) {
         return (STCrossBetween)POIXMLTypeLoader.newInstance(STCrossBetween.type, var0);
      }

      public static STCrossBetween parse(String var0) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(String var0, XmlOptions var1) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(File var0) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(URL var0) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(InputStream var0) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(Reader var0) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(XMLStreamReader var0) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(Node var0) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static STCrossBetween parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static STCrossBetween parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCrossBetween)POIXMLTypeLoader.parse(var0, STCrossBetween.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCrossBetween.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCrossBetween.type, var1);
      }

   }
}
