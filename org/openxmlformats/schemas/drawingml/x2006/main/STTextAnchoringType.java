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

public interface STTextAnchoringType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextAnchoringType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextanchoringtyped99btype");
   STTextAnchoringType.Enum T = STTextAnchoringType.Enum.forString("t");
   STTextAnchoringType.Enum CTR = STTextAnchoringType.Enum.forString("ctr");
   STTextAnchoringType.Enum B = STTextAnchoringType.Enum.forString("b");
   STTextAnchoringType.Enum JUST = STTextAnchoringType.Enum.forString("just");
   STTextAnchoringType.Enum DIST = STTextAnchoringType.Enum.forString("dist");
   int INT_T = 1;
   int INT_CTR = 2;
   int INT_B = 3;
   int INT_JUST = 4;
   int INT_DIST = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextAnchoringType newValue(Object var0) {
         return (STTextAnchoringType)STTextAnchoringType.type.newValue(var0);
      }

      public static STTextAnchoringType newInstance() {
         return (STTextAnchoringType)POIXMLTypeLoader.newInstance(STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType newInstance(XmlOptions var0) {
         return (STTextAnchoringType)POIXMLTypeLoader.newInstance(STTextAnchoringType.type, var0);
      }

      public static STTextAnchoringType parse(String var0) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(File var0) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(URL var0) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(InputStream var0) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(Reader var0) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(XMLStreamReader var0) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(Node var0) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static STTextAnchoringType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static STTextAnchoringType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextAnchoringType)POIXMLTypeLoader.parse(var0, STTextAnchoringType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAnchoringType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAnchoringType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_T = 1;
      static final int INT_CTR = 2;
      static final int INT_B = 3;
      static final int INT_JUST = 4;
      static final int INT_DIST = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextAnchoringType.Enum[]{new STTextAnchoringType.Enum("t", 1), new STTextAnchoringType.Enum("ctr", 2), new STTextAnchoringType.Enum("b", 3), new STTextAnchoringType.Enum("just", 4), new STTextAnchoringType.Enum("dist", 5)});
      private static final long serialVersionUID = 1L;


      public static STTextAnchoringType.Enum forString(String var0) {
         return (STTextAnchoringType.Enum)table.forString(var0);
      }

      public static STTextAnchoringType.Enum forInt(int var0) {
         return (STTextAnchoringType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
