package com.microsoft.schemas.office.excel;

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

public interface STObjectType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STObjectType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stobjecttype97a7type");
   STObjectType.Enum BUTTON = STObjectType.Enum.forString("Button");
   STObjectType.Enum CHECKBOX = STObjectType.Enum.forString("Checkbox");
   STObjectType.Enum DIALOG = STObjectType.Enum.forString("Dialog");
   STObjectType.Enum DROP = STObjectType.Enum.forString("Drop");
   STObjectType.Enum EDIT = STObjectType.Enum.forString("Edit");
   STObjectType.Enum G_BOX = STObjectType.Enum.forString("GBox");
   STObjectType.Enum LABEL = STObjectType.Enum.forString("Label");
   STObjectType.Enum LINE_A = STObjectType.Enum.forString("LineA");
   STObjectType.Enum LIST = STObjectType.Enum.forString("List");
   STObjectType.Enum MOVIE = STObjectType.Enum.forString("Movie");
   STObjectType.Enum NOTE = STObjectType.Enum.forString("Note");
   STObjectType.Enum PICT = STObjectType.Enum.forString("Pict");
   STObjectType.Enum RADIO = STObjectType.Enum.forString("Radio");
   STObjectType.Enum RECT_A = STObjectType.Enum.forString("RectA");
   STObjectType.Enum SCROLL = STObjectType.Enum.forString("Scroll");
   STObjectType.Enum SPIN = STObjectType.Enum.forString("Spin");
   STObjectType.Enum SHAPE = STObjectType.Enum.forString("Shape");
   STObjectType.Enum GROUP = STObjectType.Enum.forString("Group");
   STObjectType.Enum RECT = STObjectType.Enum.forString("Rect");
   int INT_BUTTON = 1;
   int INT_CHECKBOX = 2;
   int INT_DIALOG = 3;
   int INT_DROP = 4;
   int INT_EDIT = 5;
   int INT_G_BOX = 6;
   int INT_LABEL = 7;
   int INT_LINE_A = 8;
   int INT_LIST = 9;
   int INT_MOVIE = 10;
   int INT_NOTE = 11;
   int INT_PICT = 12;
   int INT_RADIO = 13;
   int INT_RECT_A = 14;
   int INT_SCROLL = 15;
   int INT_SPIN = 16;
   int INT_SHAPE = 17;
   int INT_GROUP = 18;
   int INT_RECT = 19;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_BUTTON = 1;
      static final int INT_CHECKBOX = 2;
      static final int INT_DIALOG = 3;
      static final int INT_DROP = 4;
      static final int INT_EDIT = 5;
      static final int INT_G_BOX = 6;
      static final int INT_LABEL = 7;
      static final int INT_LINE_A = 8;
      static final int INT_LIST = 9;
      static final int INT_MOVIE = 10;
      static final int INT_NOTE = 11;
      static final int INT_PICT = 12;
      static final int INT_RADIO = 13;
      static final int INT_RECT_A = 14;
      static final int INT_SCROLL = 15;
      static final int INT_SPIN = 16;
      static final int INT_SHAPE = 17;
      static final int INT_GROUP = 18;
      static final int INT_RECT = 19;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STObjectType.Enum[]{new STObjectType.Enum("Button", 1), new STObjectType.Enum("Checkbox", 2), new STObjectType.Enum("Dialog", 3), new STObjectType.Enum("Drop", 4), new STObjectType.Enum("Edit", 5), new STObjectType.Enum("GBox", 6), new STObjectType.Enum("Label", 7), new STObjectType.Enum("LineA", 8), new STObjectType.Enum("List", 9), new STObjectType.Enum("Movie", 10), new STObjectType.Enum("Note", 11), new STObjectType.Enum("Pict", 12), new STObjectType.Enum("Radio", 13), new STObjectType.Enum("RectA", 14), new STObjectType.Enum("Scroll", 15), new STObjectType.Enum("Spin", 16), new STObjectType.Enum("Shape", 17), new STObjectType.Enum("Group", 18), new STObjectType.Enum("Rect", 19)});
      private static final long serialVersionUID = 1L;


      public static STObjectType.Enum forString(String var0) {
         return (STObjectType.Enum)table.forString(var0);
      }

      public static STObjectType.Enum forInt(int var0) {
         return (STObjectType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STObjectType newValue(Object var0) {
         return (STObjectType)STObjectType.type.newValue(var0);
      }

      public static STObjectType newInstance() {
         return (STObjectType)POIXMLTypeLoader.newInstance(STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType newInstance(XmlOptions var0) {
         return (STObjectType)POIXMLTypeLoader.newInstance(STObjectType.type, var0);
      }

      public static STObjectType parse(String var0) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(String var0, XmlOptions var1) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(File var0) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(URL var0) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(InputStream var0) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(Reader var0) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(XMLStreamReader var0) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(Node var0) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static STObjectType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, (XmlOptions)null);
      }

      public static STObjectType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STObjectType)POIXMLTypeLoader.parse(var0, STObjectType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STObjectType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STObjectType.type, var1);
      }

   }
}
