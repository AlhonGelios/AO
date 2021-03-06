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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;
import org.w3c.dom.Node;

public interface CTSheetData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetdata8408type");


   List getRowList();

   CTRow[] getRowArray();

   CTRow getRowArray(int var1);

   int sizeOfRowArray();

   void setRowArray(CTRow[] var1);

   void setRowArray(int var1, CTRow var2);

   CTRow insertNewRow(int var1);

   CTRow addNewRow();

   void removeRow(int var1);


   public static final class Factory {

      public static CTSheetData newInstance() {
         return (CTSheetData)POIXMLTypeLoader.newInstance(CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData newInstance(XmlOptions var0) {
         return (CTSheetData)POIXMLTypeLoader.newInstance(CTSheetData.type, var0);
      }

      public static CTSheetData parse(String var0) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(File var0) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(URL var0) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(Reader var0) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(Node var0) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static CTSheetData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static CTSheetData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetData)POIXMLTypeLoader.parse(var0, CTSheetData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetData.type, var1);
      }

   }
}
