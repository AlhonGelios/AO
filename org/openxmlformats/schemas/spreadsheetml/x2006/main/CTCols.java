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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol;
import org.w3c.dom.Node;

public interface CTCols extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCols.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcols627ctype");


   List getColList();

   CTCol[] getColArray();

   CTCol getColArray(int var1);

   int sizeOfColArray();

   void setColArray(CTCol[] var1);

   void setColArray(int var1, CTCol var2);

   CTCol insertNewCol(int var1);

   CTCol addNewCol();

   void removeCol(int var1);


   public static final class Factory {

      public static CTCols newInstance() {
         return (CTCols)POIXMLTypeLoader.newInstance(CTCols.type, (XmlOptions)null);
      }

      public static CTCols newInstance(XmlOptions var0) {
         return (CTCols)POIXMLTypeLoader.newInstance(CTCols.type, var0);
      }

      public static CTCols parse(String var0) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(File var0) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(URL var0) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(InputStream var0) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(Reader var0) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(XMLStreamReader var0) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(Node var0) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static CTCols parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, (XmlOptions)null);
      }

      public static CTCols parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCols)POIXMLTypeLoader.parse(var0, CTCols.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCols.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCols.type, var1);
      }

   }
}
