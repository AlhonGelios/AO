package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells;
import org.w3c.dom.Node;

public interface SingleXmlCellsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SingleXmlCellsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("singlexmlcells33bfdoctype");


   CTSingleXmlCells getSingleXmlCells();

   void setSingleXmlCells(CTSingleXmlCells var1);

   CTSingleXmlCells addNewSingleXmlCells();


   public static final class Factory {

      public static SingleXmlCellsDocument newInstance() {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.newInstance(SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument newInstance(XmlOptions var0) {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.newInstance(SingleXmlCellsDocument.type, var0);
      }

      public static SingleXmlCellsDocument parse(String var0) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(File var0) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(URL var0) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(InputStream var0) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(Reader var0) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(XMLStreamReader var0) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(Node var0) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static SingleXmlCellsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static SingleXmlCellsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SingleXmlCellsDocument)POIXMLTypeLoader.parse(var0, SingleXmlCellsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SingleXmlCellsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SingleXmlCellsDocument.type, var1);
      }

   }
}
