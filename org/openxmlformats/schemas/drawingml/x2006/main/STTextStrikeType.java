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

public interface STTextStrikeType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextStrikeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextstriketype4744type");
   STTextStrikeType.Enum NO_STRIKE = STTextStrikeType.Enum.forString("noStrike");
   STTextStrikeType.Enum SNG_STRIKE = STTextStrikeType.Enum.forString("sngStrike");
   STTextStrikeType.Enum DBL_STRIKE = STTextStrikeType.Enum.forString("dblStrike");
   int INT_NO_STRIKE = 1;
   int INT_SNG_STRIKE = 2;
   int INT_DBL_STRIKE = 3;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextStrikeType newValue(Object var0) {
         return (STTextStrikeType)STTextStrikeType.type.newValue(var0);
      }

      public static STTextStrikeType newInstance() {
         return (STTextStrikeType)POIXMLTypeLoader.newInstance(STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType newInstance(XmlOptions var0) {
         return (STTextStrikeType)POIXMLTypeLoader.newInstance(STTextStrikeType.type, var0);
      }

      public static STTextStrikeType parse(String var0) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(File var0) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(URL var0) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(InputStream var0) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(Reader var0) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(XMLStreamReader var0) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(Node var0) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static STTextStrikeType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static STTextStrikeType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextStrikeType)POIXMLTypeLoader.parse(var0, STTextStrikeType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextStrikeType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextStrikeType.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NO_STRIKE = 1;
      static final int INT_SNG_STRIKE = 2;
      static final int INT_DBL_STRIKE = 3;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextStrikeType.Enum[]{new STTextStrikeType.Enum("noStrike", 1), new STTextStrikeType.Enum("sngStrike", 2), new STTextStrikeType.Enum("dblStrike", 3)});
      private static final long serialVersionUID = 1L;


      public static STTextStrikeType.Enum forString(String var0) {
         return (STTextStrikeType.Enum)table.forString(var0);
      }

      public static STTextStrikeType.Enum forInt(int var0) {
         return (STTextStrikeType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
