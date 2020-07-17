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

public interface STPaneState extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPaneState.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpanestateae58type");
   STPaneState.Enum SPLIT = STPaneState.Enum.forString("split");
   STPaneState.Enum FROZEN = STPaneState.Enum.forString("frozen");
   STPaneState.Enum FROZEN_SPLIT = STPaneState.Enum.forString("frozenSplit");
   int INT_SPLIT = 1;
   int INT_FROZEN = 2;
   int INT_FROZEN_SPLIT = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STPaneState newValue(Object var0) {
         return (STPaneState)STPaneState.type.newValue(var0);
      }

      public static STPaneState newInstance() {
         return (STPaneState)POIXMLTypeLoader.newInstance(STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState newInstance(XmlOptions var0) {
         return (STPaneState)POIXMLTypeLoader.newInstance(STPaneState.type, var0);
      }

      public static STPaneState parse(String var0) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(String var0, XmlOptions var1) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(File var0) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(URL var0) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(InputStream var0) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(Reader var0) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(XMLStreamReader var0) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(Node var0) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static STPaneState parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, (XmlOptions)null);
      }

      public static STPaneState parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPaneState)POIXMLTypeLoader.parse(var0, STPaneState.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPaneState.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPaneState.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SPLIT = 1;
      static final int INT_FROZEN = 2;
      static final int INT_FROZEN_SPLIT = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPaneState.Enum[]{new STPaneState.Enum("split", 1), new STPaneState.Enum("frozen", 2), new STPaneState.Enum("frozenSplit", 3)});
      private static final long serialVersionUID = 1L;


      public static STPaneState.Enum forString(String var0) {
         return (STPaneState.Enum)table.forString(var0);
      }

      public static STPaneState.Enum forInt(int var0) {
         return (STPaneState.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
