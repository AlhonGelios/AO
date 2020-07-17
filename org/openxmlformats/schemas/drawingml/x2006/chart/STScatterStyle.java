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

public interface STScatterStyle extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STScatterStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stscatterstyle9eb9type");
   STScatterStyle.Enum NONE = STScatterStyle.Enum.forString("none");
   STScatterStyle.Enum LINE = STScatterStyle.Enum.forString("line");
   STScatterStyle.Enum LINE_MARKER = STScatterStyle.Enum.forString("lineMarker");
   STScatterStyle.Enum MARKER = STScatterStyle.Enum.forString("marker");
   STScatterStyle.Enum SMOOTH = STScatterStyle.Enum.forString("smooth");
   STScatterStyle.Enum SMOOTH_MARKER = STScatterStyle.Enum.forString("smoothMarker");
   int INT_NONE = 1;
   int INT_LINE = 2;
   int INT_LINE_MARKER = 3;
   int INT_MARKER = 4;
   int INT_SMOOTH = 5;
   int INT_SMOOTH_MARKER = 6;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_LINE = 2;
      static final int INT_LINE_MARKER = 3;
      static final int INT_MARKER = 4;
      static final int INT_SMOOTH = 5;
      static final int INT_SMOOTH_MARKER = 6;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STScatterStyle.Enum[]{new STScatterStyle.Enum("none", 1), new STScatterStyle.Enum("line", 2), new STScatterStyle.Enum("lineMarker", 3), new STScatterStyle.Enum("marker", 4), new STScatterStyle.Enum("smooth", 5), new STScatterStyle.Enum("smoothMarker", 6)});
      private static final long serialVersionUID = 1L;


      public static STScatterStyle.Enum forString(String var0) {
         return (STScatterStyle.Enum)table.forString(var0);
      }

      public static STScatterStyle.Enum forInt(int var0) {
         return (STScatterStyle.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STScatterStyle newValue(Object var0) {
         return (STScatterStyle)STScatterStyle.type.newValue(var0);
      }

      public static STScatterStyle newInstance() {
         return (STScatterStyle)POIXMLTypeLoader.newInstance(STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle newInstance(XmlOptions var0) {
         return (STScatterStyle)POIXMLTypeLoader.newInstance(STScatterStyle.type, var0);
      }

      public static STScatterStyle parse(String var0) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(File var0) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(URL var0) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(InputStream var0) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(Reader var0) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(XMLStreamReader var0) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(Node var0) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static STScatterStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static STScatterStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STScatterStyle)POIXMLTypeLoader.parse(var0, STScatterStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STScatterStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STScatterStyle.type, var1);
      }

   }
}
