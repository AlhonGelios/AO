package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.w3c.dom.Node;

public interface CTTableColumns extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableColumns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablecolumnsebb8type");


   List getTableColumnList();

   CTTableColumn[] getTableColumnArray();

   CTTableColumn getTableColumnArray(int var1);

   int sizeOfTableColumnArray();

   void setTableColumnArray(CTTableColumn[] var1);

   void setTableColumnArray(int var1, CTTableColumn var2);

   CTTableColumn insertNewTableColumn(int var1);

   CTTableColumn addNewTableColumn();

   void removeTableColumn(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTTableColumns newInstance() {
         return (CTTableColumns)POIXMLTypeLoader.newInstance(CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns newInstance(XmlOptions var0) {
         return (CTTableColumns)POIXMLTypeLoader.newInstance(CTTableColumns.type, var0);
      }

      public static CTTableColumns parse(String var0) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(File var0) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(URL var0) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(InputStream var0) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(Reader var0) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(XMLStreamReader var0) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(Node var0) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static CTTableColumns parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static CTTableColumns parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableColumns)POIXMLTypeLoader.parse(var0, CTTableColumns.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableColumns.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableColumns.type, var1);
      }

   }
}
