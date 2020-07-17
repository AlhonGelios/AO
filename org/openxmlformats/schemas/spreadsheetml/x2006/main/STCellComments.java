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

public interface STCellComments extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCellComments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcellcomments7e4ftype");
   STCellComments.Enum NONE = STCellComments.Enum.forString("none");
   STCellComments.Enum AS_DISPLAYED = STCellComments.Enum.forString("asDisplayed");
   STCellComments.Enum AT_END = STCellComments.Enum.forString("atEnd");
   int INT_NONE = 1;
   int INT_AS_DISPLAYED = 2;
   int INT_AT_END = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STCellComments newValue(Object var0) {
         return (STCellComments)STCellComments.type.newValue(var0);
      }

      public static STCellComments newInstance() {
         return (STCellComments)POIXMLTypeLoader.newInstance(STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments newInstance(XmlOptions var0) {
         return (STCellComments)POIXMLTypeLoader.newInstance(STCellComments.type, var0);
      }

      public static STCellComments parse(String var0) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(String var0, XmlOptions var1) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(File var0) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(URL var0) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(InputStream var0) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(Reader var0) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(XMLStreamReader var0) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(Node var0) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static STCellComments parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, (XmlOptions)null);
      }

      public static STCellComments parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCellComments)POIXMLTypeLoader.parse(var0, STCellComments.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellComments.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellComments.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_AS_DISPLAYED = 2;
      static final int INT_AT_END = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCellComments.Enum[]{new STCellComments.Enum("none", 1), new STCellComments.Enum("asDisplayed", 2), new STCellComments.Enum("atEnd", 3)});
      private static final long serialVersionUID = 1L;


      public static STCellComments.Enum forString(String var0) {
         return (STCellComments.Enum)table.forString(var0);
      }

      public static STCellComments.Enum forInt(int var0) {
         return (STCellComments.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
