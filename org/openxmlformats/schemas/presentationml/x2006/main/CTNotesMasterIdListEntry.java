package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.w3c.dom.Node;

public interface CTNotesMasterIdListEntry extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNotesMasterIdListEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnotesmasteridlistentry278ftype");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTNotesMasterIdListEntry newInstance() {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.newInstance(CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry newInstance(XmlOptions var0) {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.newInstance(CTNotesMasterIdListEntry.type, var0);
      }

      public static CTNotesMasterIdListEntry parse(String var0) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(File var0) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(URL var0) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(InputStream var0) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(Reader var0) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(XMLStreamReader var0) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(Node var0) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static CTNotesMasterIdListEntry parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdListEntry parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNotesMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTNotesMasterIdListEntry.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMasterIdListEntry.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMasterIdListEntry.type, var1);
      }

   }
}
