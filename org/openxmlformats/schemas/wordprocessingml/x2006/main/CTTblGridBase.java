package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol;
import org.w3c.dom.Node;

public interface CTTblGridBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblGridBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblgridbasea11dtype");


   List getGridColList();

   CTTblGridCol[] getGridColArray();

   CTTblGridCol getGridColArray(int var1);

   int sizeOfGridColArray();

   void setGridColArray(CTTblGridCol[] var1);

   void setGridColArray(int var1, CTTblGridCol var2);

   CTTblGridCol insertNewGridCol(int var1);

   CTTblGridCol addNewGridCol();

   void removeGridCol(int var1);


   public static final class Factory {

      public static CTTblGridBase newInstance() {
         return (CTTblGridBase)POIXMLTypeLoader.newInstance(CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase newInstance(XmlOptions var0) {
         return (CTTblGridBase)POIXMLTypeLoader.newInstance(CTTblGridBase.type, var0);
      }

      public static CTTblGridBase parse(String var0) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(File var0) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(URL var0) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(InputStream var0) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(Reader var0) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(XMLStreamReader var0) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(Node var0) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static CTTblGridBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static CTTblGridBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblGridBase)POIXMLTypeLoader.parse(var0, CTTblGridBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblGridBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblGridBase.type, var1);
      }

   }
}
