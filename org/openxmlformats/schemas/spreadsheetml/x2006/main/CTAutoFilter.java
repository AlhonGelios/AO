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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.w3c.dom.Node;

public interface CTAutoFilter extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAutoFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctautofiltera8d0type");


   List getFilterColumnList();

   CTFilterColumn[] getFilterColumnArray();

   CTFilterColumn getFilterColumnArray(int var1);

   int sizeOfFilterColumnArray();

   void setFilterColumnArray(CTFilterColumn[] var1);

   void setFilterColumnArray(int var1, CTFilterColumn var2);

   CTFilterColumn insertNewFilterColumn(int var1);

   CTFilterColumn addNewFilterColumn();

   void removeFilterColumn(int var1);

   CTSortState getSortState();

   boolean isSetSortState();

   void setSortState(CTSortState var1);

   CTSortState addNewSortState();

   void unsetSortState();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getRef();

   STRef xgetRef();

   boolean isSetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   void unsetRef();


   public static final class Factory {

      public static CTAutoFilter newInstance() {
         return (CTAutoFilter)POIXMLTypeLoader.newInstance(CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter newInstance(XmlOptions var0) {
         return (CTAutoFilter)POIXMLTypeLoader.newInstance(CTAutoFilter.type, var0);
      }

      public static CTAutoFilter parse(String var0) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(File var0) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(URL var0) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(InputStream var0) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(Reader var0) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(XMLStreamReader var0) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(Node var0) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static CTAutoFilter parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static CTAutoFilter parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAutoFilter)POIXMLTypeLoader.parse(var0, CTAutoFilter.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAutoFilter.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAutoFilter.type, var1);
      }

   }
}
