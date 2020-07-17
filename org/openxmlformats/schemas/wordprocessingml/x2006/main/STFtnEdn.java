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

public interface STFtnEdn extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFtnEdn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stftnednd4c9type");
   STFtnEdn.Enum NORMAL = STFtnEdn.Enum.forString("normal");
   STFtnEdn.Enum SEPARATOR = STFtnEdn.Enum.forString("separator");
   STFtnEdn.Enum CONTINUATION_SEPARATOR = STFtnEdn.Enum.forString("continuationSeparator");
   STFtnEdn.Enum CONTINUATION_NOTICE = STFtnEdn.Enum.forString("continuationNotice");
   int INT_NORMAL = 1;
   int INT_SEPARATOR = 2;
   int INT_CONTINUATION_SEPARATOR = 3;
   int INT_CONTINUATION_NOTICE = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NORMAL = 1;
      static final int INT_SEPARATOR = 2;
      static final int INT_CONTINUATION_SEPARATOR = 3;
      static final int INT_CONTINUATION_NOTICE = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFtnEdn.Enum[]{new STFtnEdn.Enum("normal", 1), new STFtnEdn.Enum("separator", 2), new STFtnEdn.Enum("continuationSeparator", 3), new STFtnEdn.Enum("continuationNotice", 4)});
      private static final long serialVersionUID = 1L;


      public static STFtnEdn.Enum forString(String var0) {
         return (STFtnEdn.Enum)table.forString(var0);
      }

      public static STFtnEdn.Enum forInt(int var0) {
         return (STFtnEdn.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STFtnEdn newValue(Object var0) {
         return (STFtnEdn)STFtnEdn.type.newValue(var0);
      }

      public static STFtnEdn newInstance() {
         return (STFtnEdn)POIXMLTypeLoader.newInstance(STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn newInstance(XmlOptions var0) {
         return (STFtnEdn)POIXMLTypeLoader.newInstance(STFtnEdn.type, var0);
      }

      public static STFtnEdn parse(String var0) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(String var0, XmlOptions var1) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(File var0) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(URL var0) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(InputStream var0) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(Reader var0) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(XMLStreamReader var0) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(Node var0) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static STFtnEdn parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static STFtnEdn parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFtnEdn)POIXMLTypeLoader.parse(var0, STFtnEdn.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFtnEdn.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFtnEdn.type, var1);
      }

   }
}
