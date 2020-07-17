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
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideId;
import org.w3c.dom.Node;

public interface CTSlideIdListEntry extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideIdListEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslideidlistentry427dtype");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   STSlideId xgetId();

   void setId(long var1);

   void xsetId(STSlideId var1);

   String getId2();

   STRelationshipId xgetId2();

   void setId2(String var1);

   void xsetId2(STRelationshipId var1);


   public static final class Factory {

      public static CTSlideIdListEntry newInstance() {
         return (CTSlideIdListEntry)POIXMLTypeLoader.newInstance(CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry newInstance(XmlOptions var0) {
         return (CTSlideIdListEntry)POIXMLTypeLoader.newInstance(CTSlideIdListEntry.type, var0);
      }

      public static CTSlideIdListEntry parse(String var0) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(File var0) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(URL var0) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(Reader var0) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(Node var0) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static CTSlideIdListEntry parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideIdListEntry parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideIdListEntry.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideIdListEntry.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideIdListEntry.type, var1);
      }

   }
}
