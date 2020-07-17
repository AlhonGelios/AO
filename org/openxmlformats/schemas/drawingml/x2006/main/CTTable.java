package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow;
import org.w3c.dom.Node;

public interface CTTable extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttable5f3ftype");


   CTTableProperties getTblPr();

   boolean isSetTblPr();

   void setTblPr(CTTableProperties var1);

   CTTableProperties addNewTblPr();

   void unsetTblPr();

   CTTableGrid getTblGrid();

   void setTblGrid(CTTableGrid var1);

   CTTableGrid addNewTblGrid();

   List getTrList();

   CTTableRow[] getTrArray();

   CTTableRow getTrArray(int var1);

   int sizeOfTrArray();

   void setTrArray(CTTableRow[] var1);

   void setTrArray(int var1, CTTableRow var2);

   CTTableRow insertNewTr(int var1);

   CTTableRow addNewTr();

   void removeTr(int var1);


   public static final class Factory {

      public static CTTable newInstance() {
         return (CTTable)POIXMLTypeLoader.newInstance(CTTable.type, (XmlOptions)null);
      }

      public static CTTable newInstance(XmlOptions var0) {
         return (CTTable)POIXMLTypeLoader.newInstance(CTTable.type, var0);
      }

      public static CTTable parse(String var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(File var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(URL var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(InputStream var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(Reader var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(XMLStreamReader var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(Node var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTable.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTable.type, var1);
      }

   }
}
