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

public interface STMerge extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STMerge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stmerge50aatype");
   STMerge.Enum CONTINUE = STMerge.Enum.forString("continue");
   STMerge.Enum RESTART = STMerge.Enum.forString("restart");
   int INT_CONTINUE = 1;
   int INT_RESTART = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CONTINUE = 1;
      static final int INT_RESTART = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STMerge.Enum[]{new STMerge.Enum("continue", 1), new STMerge.Enum("restart", 2)});
      private static final long serialVersionUID = 1L;


      public static STMerge.Enum forString(String var0) {
         return (STMerge.Enum)table.forString(var0);
      }

      public static STMerge.Enum forInt(int var0) {
         return (STMerge.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STMerge newValue(Object var0) {
         return (STMerge)STMerge.type.newValue(var0);
      }

      public static STMerge newInstance() {
         return (STMerge)POIXMLTypeLoader.newInstance(STMerge.type, (XmlOptions)null);
      }

      public static STMerge newInstance(XmlOptions var0) {
         return (STMerge)POIXMLTypeLoader.newInstance(STMerge.type, var0);
      }

      public static STMerge parse(String var0) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(String var0, XmlOptions var1) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(File var0) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(URL var0) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(InputStream var0) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(Reader var0) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(XMLStreamReader var0) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(Node var0) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(Node var0, XmlOptions var1) throws XmlException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static STMerge parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, (XmlOptions)null);
      }

      public static STMerge parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STMerge)POIXMLTypeLoader.parse(var0, STMerge.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STMerge.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STMerge.type, var1);
      }

   }
}
