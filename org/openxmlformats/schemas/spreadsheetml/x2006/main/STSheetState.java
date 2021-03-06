package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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

public interface STSheetState extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSheetState.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsheetstate158btype");
   STSheetState.Enum VISIBLE = STSheetState.Enum.forString("visible");
   STSheetState.Enum HIDDEN = STSheetState.Enum.forString("hidden");
   STSheetState.Enum VERY_HIDDEN = STSheetState.Enum.forString("veryHidden");
   int INT_VISIBLE = 1;
   int INT_HIDDEN = 2;
   int INT_VERY_HIDDEN = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STSheetState newValue(Object var0) {
         return (STSheetState)STSheetState.type.newValue(var0);
      }

      public static STSheetState newInstance() {
         return (STSheetState)POIXMLTypeLoader.newInstance(STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState newInstance(XmlOptions var0) {
         return (STSheetState)POIXMLTypeLoader.newInstance(STSheetState.type, var0);
      }

      public static STSheetState parse(String var0) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(String var0, XmlOptions var1) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(File var0) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(URL var0) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(InputStream var0) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(Reader var0) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(XMLStreamReader var0) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(Node var0) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static STSheetState parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, (XmlOptions)null);
      }

      public static STSheetState parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSheetState)POIXMLTypeLoader.parse(var0, STSheetState.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSheetState.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSheetState.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_VISIBLE = 1;
      static final int INT_HIDDEN = 2;
      static final int INT_VERY_HIDDEN = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSheetState.Enum[]{new STSheetState.Enum("visible", 1), new STSheetState.Enum("hidden", 2), new STSheetState.Enum("veryHidden", 3)});
      private static final long serialVersionUID = 1L;


      public static STSheetState.Enum forString(String var0) {
         return (STSheetState.Enum)table.forString(var0);
      }

      public static STSheetState.Enum forInt(int var0) {
         return (STSheetState.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
