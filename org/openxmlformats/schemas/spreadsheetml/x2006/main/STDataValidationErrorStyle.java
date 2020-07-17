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

public interface STDataValidationErrorStyle extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDataValidationErrorStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdatavalidationerrorstyleca85type");
   STDataValidationErrorStyle.Enum STOP = STDataValidationErrorStyle.Enum.forString("stop");
   STDataValidationErrorStyle.Enum WARNING = STDataValidationErrorStyle.Enum.forString("warning");
   STDataValidationErrorStyle.Enum INFORMATION = STDataValidationErrorStyle.Enum.forString("information");
   int INT_STOP = 1;
   int INT_WARNING = 2;
   int INT_INFORMATION = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STDataValidationErrorStyle newValue(Object var0) {
         return (STDataValidationErrorStyle)STDataValidationErrorStyle.type.newValue(var0);
      }

      public static STDataValidationErrorStyle newInstance() {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.newInstance(STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle newInstance(XmlOptions var0) {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.newInstance(STDataValidationErrorStyle.type, var0);
      }

      public static STDataValidationErrorStyle parse(String var0) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(File var0) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(URL var0) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(InputStream var0) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(Reader var0) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(XMLStreamReader var0) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(Node var0) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static STDataValidationErrorStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static STDataValidationErrorStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDataValidationErrorStyle)POIXMLTypeLoader.parse(var0, STDataValidationErrorStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationErrorStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDataValidationErrorStyle.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_STOP = 1;
      static final int INT_WARNING = 2;
      static final int INT_INFORMATION = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDataValidationErrorStyle.Enum[]{new STDataValidationErrorStyle.Enum("stop", 1), new STDataValidationErrorStyle.Enum("warning", 2), new STDataValidationErrorStyle.Enum("information", 3)});
      private static final long serialVersionUID = 1L;


      public static STDataValidationErrorStyle.Enum forString(String var0) {
         return (STDataValidationErrorStyle.Enum)table.forString(var0);
      }

      public static STDataValidationErrorStyle.Enum forInt(int var0) {
         return (STDataValidationErrorStyle.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
