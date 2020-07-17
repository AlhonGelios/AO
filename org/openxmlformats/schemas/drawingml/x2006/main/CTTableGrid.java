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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol;
import org.w3c.dom.Node;

public interface CTTableGrid extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableGrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablegrid69a5type");


   List getGridColList();

   CTTableCol[] getGridColArray();

   CTTableCol getGridColArray(int var1);

   int sizeOfGridColArray();

   void setGridColArray(CTTableCol[] var1);

   void setGridColArray(int var1, CTTableCol var2);

   CTTableCol insertNewGridCol(int var1);

   CTTableCol addNewGridCol();

   void removeGridCol(int var1);


   public static final class Factory {

      public static CTTableGrid newInstance() {
         return (CTTableGrid)POIXMLTypeLoader.newInstance(CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid newInstance(XmlOptions var0) {
         return (CTTableGrid)POIXMLTypeLoader.newInstance(CTTableGrid.type, var0);
      }

      public static CTTableGrid parse(String var0) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(File var0) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(URL var0) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(InputStream var0) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(Reader var0) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(XMLStreamReader var0) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(Node var0) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static CTTableGrid parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static CTTableGrid parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableGrid)POIXMLTypeLoader.parse(var0, CTTableGrid.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableGrid.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableGrid.type, var1);
      }

   }
}
