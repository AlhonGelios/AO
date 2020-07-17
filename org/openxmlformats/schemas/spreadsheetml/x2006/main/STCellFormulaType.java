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

public interface STCellFormulaType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCellFormulaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcellformulatypee2cdtype");
   STCellFormulaType.Enum NORMAL = STCellFormulaType.Enum.forString("normal");
   STCellFormulaType.Enum ARRAY = STCellFormulaType.Enum.forString("array");
   STCellFormulaType.Enum DATA_TABLE = STCellFormulaType.Enum.forString("dataTable");
   STCellFormulaType.Enum SHARED = STCellFormulaType.Enum.forString("shared");
   int INT_NORMAL = 1;
   int INT_ARRAY = 2;
   int INT_DATA_TABLE = 3;
   int INT_SHARED = 4;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NORMAL = 1;
      static final int INT_ARRAY = 2;
      static final int INT_DATA_TABLE = 3;
      static final int INT_SHARED = 4;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STCellFormulaType.Enum[]{new STCellFormulaType.Enum("normal", 1), new STCellFormulaType.Enum("array", 2), new STCellFormulaType.Enum("dataTable", 3), new STCellFormulaType.Enum("shared", 4)});
      private static final long serialVersionUID = 1L;


      public static STCellFormulaType.Enum forString(String var0) {
         return (STCellFormulaType.Enum)table.forString(var0);
      }

      public static STCellFormulaType.Enum forInt(int var0) {
         return (STCellFormulaType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STCellFormulaType newValue(Object var0) {
         return (STCellFormulaType)STCellFormulaType.type.newValue(var0);
      }

      public static STCellFormulaType newInstance() {
         return (STCellFormulaType)POIXMLTypeLoader.newInstance(STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType newInstance(XmlOptions var0) {
         return (STCellFormulaType)POIXMLTypeLoader.newInstance(STCellFormulaType.type, var0);
      }

      public static STCellFormulaType parse(String var0) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(String var0, XmlOptions var1) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(File var0) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(URL var0) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(InputStream var0) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(Reader var0) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(XMLStreamReader var0) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(Node var0) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static STCellFormulaType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static STCellFormulaType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCellFormulaType)POIXMLTypeLoader.parse(var0, STCellFormulaType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellFormulaType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellFormulaType.type, var1);
      }

   }
}
