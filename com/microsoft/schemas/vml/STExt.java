package com.microsoft.schemas.vml;

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

public interface STExt extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STExt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stext2fe5type");
   STExt.Enum VIEW = STExt.Enum.forString("view");
   STExt.Enum EDIT = STExt.Enum.forString("edit");
   STExt.Enum BACKWARD_COMPATIBLE = STExt.Enum.forString("backwardCompatible");
   int INT_VIEW = 1;
   int INT_EDIT = 2;
   int INT_BACKWARD_COMPATIBLE = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_VIEW = 1;
      static final int INT_EDIT = 2;
      static final int INT_BACKWARD_COMPATIBLE = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STExt.Enum[]{new STExt.Enum("view", 1), new STExt.Enum("edit", 2), new STExt.Enum("backwardCompatible", 3)});
      private static final long serialVersionUID = 1L;


      public static STExt.Enum forString(String var0) {
         return (STExt.Enum)table.forString(var0);
      }

      public static STExt.Enum forInt(int var0) {
         return (STExt.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STExt newValue(Object var0) {
         return (STExt)STExt.type.newValue(var0);
      }

      public static STExt newInstance() {
         return (STExt)POIXMLTypeLoader.newInstance(STExt.type, (XmlOptions)null);
      }

      public static STExt newInstance(XmlOptions var0) {
         return (STExt)POIXMLTypeLoader.newInstance(STExt.type, var0);
      }

      public static STExt parse(String var0) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(String var0, XmlOptions var1) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(File var0) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(URL var0) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(InputStream var0) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(Reader var0) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(XMLStreamReader var0) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(Node var0) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(Node var0, XmlOptions var1) throws XmlException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static STExt parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, (XmlOptions)null);
      }

      public static STExt parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STExt)POIXMLTypeLoader.parse(var0, STExt.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STExt.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STExt.type, var1);
      }

   }
}
