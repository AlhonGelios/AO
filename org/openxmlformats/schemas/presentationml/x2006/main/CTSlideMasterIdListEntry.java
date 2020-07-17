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
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideMasterId;
import org.w3c.dom.Node;

public interface CTSlideMasterIdListEntry extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideMasterIdListEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidemasteridlistentryae7ftype");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   STSlideMasterId xgetId();

   boolean isSetId();

   void setId(long var1);

   void xsetId(STSlideMasterId var1);

   void unsetId();

   String getId2();

   STRelationshipId xgetId2();

   void setId2(String var1);

   void xsetId2(STRelationshipId var1);


   public static final class Factory {

      public static CTSlideMasterIdListEntry newInstance() {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.newInstance(CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry newInstance(XmlOptions var0) {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.newInstance(CTSlideMasterIdListEntry.type, var0);
      }

      public static CTSlideMasterIdListEntry parse(String var0) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(File var0) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(URL var0) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(Reader var0) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(Node var0) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static CTSlideMasterIdListEntry parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static CTSlideMasterIdListEntry parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideMasterIdListEntry)POIXMLTypeLoader.parse(var0, CTSlideMasterIdListEntry.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterIdListEntry.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterIdListEntry.type, var1);
      }

   }
}
