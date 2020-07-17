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

public interface STLineEndLength extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLineEndLength.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlineendlength3f2etype");
   STLineEndLength.Enum SM = STLineEndLength.Enum.forString("sm");
   STLineEndLength.Enum MED = STLineEndLength.Enum.forString("med");
   STLineEndLength.Enum LG = STLineEndLength.Enum.forString("lg");
   int INT_SM = 1;
   int INT_MED = 2;
   int INT_LG = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STLineEndLength newValue(Object var0) {
         return (STLineEndLength)STLineEndLength.type.newValue(var0);
      }

      public static STLineEndLength newInstance() {
         return (STLineEndLength)POIXMLTypeLoader.newInstance(STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength newInstance(XmlOptions var0) {
         return (STLineEndLength)POIXMLTypeLoader.newInstance(STLineEndLength.type, var0);
      }

      public static STLineEndLength parse(String var0) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(String var0, XmlOptions var1) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(File var0) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(URL var0) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(InputStream var0) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(Reader var0) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(XMLStreamReader var0) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(Node var0) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static STLineEndLength parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static STLineEndLength parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLineEndLength)POIXMLTypeLoader.parse(var0, STLineEndLength.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineEndLength.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineEndLength.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SM = 1;
      static final int INT_MED = 2;
      static final int INT_LG = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STLineEndLength.Enum[]{new STLineEndLength.Enum("sm", 1), new STLineEndLength.Enum("med", 2), new STLineEndLength.Enum("lg", 3)});
      private static final long serialVersionUID = 1L;


      public static STLineEndLength.Enum forString(String var0) {
         return (STLineEndLength.Enum)table.forString(var0);
      }

      public static STLineEndLength.Enum forInt(int var0) {
         return (STLineEndLength.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
