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

public interface STPenAlignment extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPenAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpenalignmentd775type");
   STPenAlignment.Enum CTR = STPenAlignment.Enum.forString("ctr");
   STPenAlignment.Enum IN = STPenAlignment.Enum.forString("in");
   int INT_CTR = 1;
   int INT_IN = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_CTR = 1;
      static final int INT_IN = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPenAlignment.Enum[]{new STPenAlignment.Enum("ctr", 1), new STPenAlignment.Enum("in", 2)});
      private static final long serialVersionUID = 1L;


      public static STPenAlignment.Enum forString(String var0) {
         return (STPenAlignment.Enum)table.forString(var0);
      }

      public static STPenAlignment.Enum forInt(int var0) {
         return (STPenAlignment.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STPenAlignment newValue(Object var0) {
         return (STPenAlignment)STPenAlignment.type.newValue(var0);
      }

      public static STPenAlignment newInstance() {
         return (STPenAlignment)POIXMLTypeLoader.newInstance(STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment newInstance(XmlOptions var0) {
         return (STPenAlignment)POIXMLTypeLoader.newInstance(STPenAlignment.type, var0);
      }

      public static STPenAlignment parse(String var0) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(File var0) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(URL var0) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(InputStream var0) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(Reader var0) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(XMLStreamReader var0) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(Node var0) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static STPenAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static STPenAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPenAlignment)POIXMLTypeLoader.parse(var0, STPenAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPenAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPenAlignment.type, var1);
      }

   }
}
