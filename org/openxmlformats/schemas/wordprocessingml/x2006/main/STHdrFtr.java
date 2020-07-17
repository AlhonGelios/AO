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

public interface STHdrFtr extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHdrFtr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthdrftr30catype");
   STHdrFtr.Enum EVEN = STHdrFtr.Enum.forString("even");
   STHdrFtr.Enum DEFAULT = STHdrFtr.Enum.forString("default");
   STHdrFtr.Enum FIRST = STHdrFtr.Enum.forString("first");
   int INT_EVEN = 1;
   int INT_DEFAULT = 2;
   int INT_FIRST = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_EVEN = 1;
      static final int INT_DEFAULT = 2;
      static final int INT_FIRST = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHdrFtr.Enum[]{new STHdrFtr.Enum("even", 1), new STHdrFtr.Enum("default", 2), new STHdrFtr.Enum("first", 3)});
      private static final long serialVersionUID = 1L;


      public static STHdrFtr.Enum forString(String var0) {
         return (STHdrFtr.Enum)table.forString(var0);
      }

      public static STHdrFtr.Enum forInt(int var0) {
         return (STHdrFtr.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STHdrFtr newValue(Object var0) {
         return (STHdrFtr)STHdrFtr.type.newValue(var0);
      }

      public static STHdrFtr newInstance() {
         return (STHdrFtr)POIXMLTypeLoader.newInstance(STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr newInstance(XmlOptions var0) {
         return (STHdrFtr)POIXMLTypeLoader.newInstance(STHdrFtr.type, var0);
      }

      public static STHdrFtr parse(String var0) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(String var0, XmlOptions var1) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(File var0) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(URL var0) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(InputStream var0) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(Reader var0) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(XMLStreamReader var0) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(Node var0) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static STHdrFtr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static STHdrFtr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHdrFtr)POIXMLTypeLoader.parse(var0, STHdrFtr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHdrFtr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHdrFtr.type, var1);
      }

   }
}
