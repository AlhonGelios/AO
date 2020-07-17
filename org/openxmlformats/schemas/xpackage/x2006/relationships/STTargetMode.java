package org.openxmlformats.schemas.xpackage.x2006.relationships;

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

public interface STTargetMode extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTargetMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("sttargetmode0e8ctype");
   STTargetMode.Enum EXTERNAL = STTargetMode.Enum.forString("External");
   STTargetMode.Enum INTERNAL = STTargetMode.Enum.forString("Internal");
   int INT_EXTERNAL = 1;
   int INT_INTERNAL = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTargetMode newValue(Object var0) {
         return (STTargetMode)STTargetMode.type.newValue(var0);
      }

      public static STTargetMode newInstance() {
         return (STTargetMode)POIXMLTypeLoader.newInstance(STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode newInstance(XmlOptions var0) {
         return (STTargetMode)POIXMLTypeLoader.newInstance(STTargetMode.type, var0);
      }

      public static STTargetMode parse(String var0) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(String var0, XmlOptions var1) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(File var0) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(URL var0) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(InputStream var0) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(Reader var0) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(XMLStreamReader var0) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(Node var0) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static STTargetMode parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static STTargetMode parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTargetMode)POIXMLTypeLoader.parse(var0, STTargetMode.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTargetMode.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTargetMode.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_EXTERNAL = 1;
      static final int INT_INTERNAL = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTargetMode.Enum[]{new STTargetMode.Enum("External", 1), new STTargetMode.Enum("Internal", 2)});
      private static final long serialVersionUID = 1L;


      public static STTargetMode.Enum forString(String var0) {
         return (STTargetMode.Enum)table.forString(var0);
      }

      public static STTargetMode.Enum forInt(int var0) {
         return (STTargetMode.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
