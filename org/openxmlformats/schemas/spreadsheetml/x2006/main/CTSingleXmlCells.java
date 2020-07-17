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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell;
import org.w3c.dom.Node;

public interface CTSingleXmlCells extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSingleXmlCells.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsinglexmlcells5a6btype");


   List getSingleXmlCellList();

   CTSingleXmlCell[] getSingleXmlCellArray();

   CTSingleXmlCell getSingleXmlCellArray(int var1);

   int sizeOfSingleXmlCellArray();

   void setSingleXmlCellArray(CTSingleXmlCell[] var1);

   void setSingleXmlCellArray(int var1, CTSingleXmlCell var2);

   CTSingleXmlCell insertNewSingleXmlCell(int var1);

   CTSingleXmlCell addNewSingleXmlCell();

   void removeSingleXmlCell(int var1);


   public static final class Factory {

      public static CTSingleXmlCells newInstance() {
         return (CTSingleXmlCells)POIXMLTypeLoader.newInstance(CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells newInstance(XmlOptions var0) {
         return (CTSingleXmlCells)POIXMLTypeLoader.newInstance(CTSingleXmlCells.type, var0);
      }

      public static CTSingleXmlCells parse(String var0) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(File var0) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(URL var0) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(InputStream var0) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(Reader var0) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(XMLStreamReader var0) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(Node var0) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static CTSingleXmlCells parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static CTSingleXmlCells parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSingleXmlCells)POIXMLTypeLoader.parse(var0, CTSingleXmlCells.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSingleXmlCells.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSingleXmlCells.type, var1);
      }

   }
}
