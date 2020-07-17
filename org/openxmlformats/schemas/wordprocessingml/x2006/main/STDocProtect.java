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

public interface STDocProtect extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDocProtect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdocprotect5801type");
   STDocProtect.Enum NONE = STDocProtect.Enum.forString("none");
   STDocProtect.Enum READ_ONLY = STDocProtect.Enum.forString("readOnly");
   STDocProtect.Enum COMMENTS = STDocProtect.Enum.forString("comments");
   STDocProtect.Enum TRACKED_CHANGES = STDocProtect.Enum.forString("trackedChanges");
   STDocProtect.Enum FORMS = STDocProtect.Enum.forString("forms");
   int INT_NONE = 1;
   int INT_READ_ONLY = 2;
   int INT_COMMENTS = 3;
   int INT_TRACKED_CHANGES = 4;
   int INT_FORMS = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NONE = 1;
      static final int INT_READ_ONLY = 2;
      static final int INT_COMMENTS = 3;
      static final int INT_TRACKED_CHANGES = 4;
      static final int INT_FORMS = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDocProtect.Enum[]{new STDocProtect.Enum("none", 1), new STDocProtect.Enum("readOnly", 2), new STDocProtect.Enum("comments", 3), new STDocProtect.Enum("trackedChanges", 4), new STDocProtect.Enum("forms", 5)});
      private static final long serialVersionUID = 1L;


      public static STDocProtect.Enum forString(String var0) {
         return (STDocProtect.Enum)table.forString(var0);
      }

      public static STDocProtect.Enum forInt(int var0) {
         return (STDocProtect.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STDocProtect newValue(Object var0) {
         return (STDocProtect)STDocProtect.type.newValue(var0);
      }

      public static STDocProtect newInstance() {
         return (STDocProtect)POIXMLTypeLoader.newInstance(STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect newInstance(XmlOptions var0) {
         return (STDocProtect)POIXMLTypeLoader.newInstance(STDocProtect.type, var0);
      }

      public static STDocProtect parse(String var0) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(String var0, XmlOptions var1) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(File var0) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(URL var0) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(InputStream var0) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(Reader var0) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(XMLStreamReader var0) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(Node var0) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static STDocProtect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static STDocProtect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDocProtect)POIXMLTypeLoader.parse(var0, STDocProtect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDocProtect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDocProtect.type, var1);
      }

   }
}
