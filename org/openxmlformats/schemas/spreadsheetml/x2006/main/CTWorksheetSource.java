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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTWorksheetSource extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTWorksheetSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctworksheetsourced4c8type");


   String getRef();

   STRef xgetRef();

   boolean isSetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   void unsetRef();

   String getName();

   STXstring xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   void unsetName();

   String getSheet();

   STXstring xgetSheet();

   boolean isSetSheet();

   void setSheet(String var1);

   void xsetSheet(STXstring var1);

   void unsetSheet();

   String getId();

   STRelationshipId xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);

   void unsetId();


   public static final class Factory {

      public static CTWorksheetSource newInstance() {
         return (CTWorksheetSource)POIXMLTypeLoader.newInstance(CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource newInstance(XmlOptions var0) {
         return (CTWorksheetSource)POIXMLTypeLoader.newInstance(CTWorksheetSource.type, var0);
      }

      public static CTWorksheetSource parse(String var0) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(String var0, XmlOptions var1) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(File var0) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(URL var0) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(InputStream var0) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(Reader var0) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(XMLStreamReader var0) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(Node var0) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static CTWorksheetSource parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static CTWorksheetSource parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTWorksheetSource)POIXMLTypeLoader.parse(var0, CTWorksheetSource.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorksheetSource.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorksheetSource.type, var1);
      }

   }
}
