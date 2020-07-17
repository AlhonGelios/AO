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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames;
import org.w3c.dom.Node;

public interface CTExternalBook extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalBook.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternalbookc89dtype");


   CTExternalSheetNames getSheetNames();

   boolean isSetSheetNames();

   void setSheetNames(CTExternalSheetNames var1);

   CTExternalSheetNames addNewSheetNames();

   void unsetSheetNames();

   CTExternalDefinedNames getDefinedNames();

   boolean isSetDefinedNames();

   void setDefinedNames(CTExternalDefinedNames var1);

   CTExternalDefinedNames addNewDefinedNames();

   void unsetDefinedNames();

   CTExternalSheetDataSet getSheetDataSet();

   boolean isSetSheetDataSet();

   void setSheetDataSet(CTExternalSheetDataSet var1);

   CTExternalSheetDataSet addNewSheetDataSet();

   void unsetSheetDataSet();

   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTExternalBook newInstance() {
         return (CTExternalBook)POIXMLTypeLoader.newInstance(CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook newInstance(XmlOptions var0) {
         return (CTExternalBook)POIXMLTypeLoader.newInstance(CTExternalBook.type, var0);
      }

      public static CTExternalBook parse(String var0) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(File var0) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(URL var0) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(Reader var0) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(Node var0) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static CTExternalBook parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static CTExternalBook parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalBook)POIXMLTypeLoader.parse(var0, CTExternalBook.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalBook.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalBook.type, var1);
      }

   }
}
