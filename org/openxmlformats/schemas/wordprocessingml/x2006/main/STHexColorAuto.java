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

public interface STHexColorAuto extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHexColorAuto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthexcolorauto3ce1type");
   STHexColorAuto.Enum AUTO = STHexColorAuto.Enum.forString("auto");
   int INT_AUTO = 1;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_AUTO = 1;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHexColorAuto.Enum[]{new STHexColorAuto.Enum("auto", 1)});
      private static final long serialVersionUID = 1L;


      public static STHexColorAuto.Enum forString(String var0) {
         return (STHexColorAuto.Enum)table.forString(var0);
      }

      public static STHexColorAuto.Enum forInt(int var0) {
         return (STHexColorAuto.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STHexColorAuto newValue(Object var0) {
         return (STHexColorAuto)STHexColorAuto.type.newValue(var0);
      }

      public static STHexColorAuto newInstance() {
         return (STHexColorAuto)POIXMLTypeLoader.newInstance(STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto newInstance(XmlOptions var0) {
         return (STHexColorAuto)POIXMLTypeLoader.newInstance(STHexColorAuto.type, var0);
      }

      public static STHexColorAuto parse(String var0) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(String var0, XmlOptions var1) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(File var0) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(URL var0) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(InputStream var0) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(Reader var0) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(XMLStreamReader var0) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(Node var0) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static STHexColorAuto parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static STHexColorAuto parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHexColorAuto)POIXMLTypeLoader.parse(var0, STHexColorAuto.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexColorAuto.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexColorAuto.type, var1);
      }

   }
}
