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

public interface STFontCollectionIndex extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFontCollectionIndex.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stfontcollectionindex6766type");
   STFontCollectionIndex.Enum MAJOR = STFontCollectionIndex.Enum.forString("major");
   STFontCollectionIndex.Enum MINOR = STFontCollectionIndex.Enum.forString("minor");
   STFontCollectionIndex.Enum NONE = STFontCollectionIndex.Enum.forString("none");
   int INT_MAJOR = 1;
   int INT_MINOR = 2;
   int INT_NONE = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_MAJOR = 1;
      static final int INT_MINOR = 2;
      static final int INT_NONE = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFontCollectionIndex.Enum[]{new STFontCollectionIndex.Enum("major", 1), new STFontCollectionIndex.Enum("minor", 2), new STFontCollectionIndex.Enum("none", 3)});
      private static final long serialVersionUID = 1L;


      public static STFontCollectionIndex.Enum forString(String var0) {
         return (STFontCollectionIndex.Enum)table.forString(var0);
      }

      public static STFontCollectionIndex.Enum forInt(int var0) {
         return (STFontCollectionIndex.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STFontCollectionIndex newValue(Object var0) {
         return (STFontCollectionIndex)STFontCollectionIndex.type.newValue(var0);
      }

      public static STFontCollectionIndex newInstance() {
         return (STFontCollectionIndex)POIXMLTypeLoader.newInstance(STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex newInstance(XmlOptions var0) {
         return (STFontCollectionIndex)POIXMLTypeLoader.newInstance(STFontCollectionIndex.type, var0);
      }

      public static STFontCollectionIndex parse(String var0) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(String var0, XmlOptions var1) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(File var0) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(URL var0) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(InputStream var0) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(Reader var0) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(XMLStreamReader var0) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(Node var0) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static STFontCollectionIndex parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static STFontCollectionIndex parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFontCollectionIndex)POIXMLTypeLoader.parse(var0, STFontCollectionIndex.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontCollectionIndex.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontCollectionIndex.type, var1);
      }

   }
}
