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

public interface STAxis extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAxis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("staxis45batype");
   STAxis.Enum AXIS_ROW = STAxis.Enum.forString("axisRow");
   STAxis.Enum AXIS_COL = STAxis.Enum.forString("axisCol");
   STAxis.Enum AXIS_PAGE = STAxis.Enum.forString("axisPage");
   STAxis.Enum AXIS_VALUES = STAxis.Enum.forString("axisValues");
   int INT_AXIS_ROW = 1;
   int INT_AXIS_COL = 2;
   int INT_AXIS_PAGE = 3;
   int INT_AXIS_VALUES = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STAxis newValue(Object var0) {
         return (STAxis)STAxis.type.newValue(var0);
      }

      public static STAxis newInstance() {
         return (STAxis)POIXMLTypeLoader.newInstance(STAxis.type, (XmlOptions)null);
      }

      public static STAxis newInstance(XmlOptions var0) {
         return (STAxis)POIXMLTypeLoader.newInstance(STAxis.type, var0);
      }

      public static STAxis parse(String var0) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(String var0, XmlOptions var1) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(File var0) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(URL var0) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(InputStream var0) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(Reader var0) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(XMLStreamReader var0) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(Node var0) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static STAxis parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, (XmlOptions)null);
      }

      public static STAxis parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAxis)POIXMLTypeLoader.parse(var0, STAxis.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAxis.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAxis.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AXIS_ROW = 1;
      static final int INT_AXIS_COL = 2;
      static final int INT_AXIS_PAGE = 3;
      static final int INT_AXIS_VALUES = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STAxis.Enum[]{new STAxis.Enum("axisRow", 1), new STAxis.Enum("axisCol", 2), new STAxis.Enum("axisPage", 3), new STAxis.Enum("axisValues", 4)});
      private static final long serialVersionUID = 1L;


      public static STAxis.Enum forString(String var0) {
         return (STAxis.Enum)table.forString(var0);
      }

      public static STAxis.Enum forInt(int var0) {
         return (STAxis.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
