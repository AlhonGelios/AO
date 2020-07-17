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
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry;
import org.w3c.dom.Node;

public interface CTNotesMasterIdList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNotesMasterIdList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnotesmasteridlist2853type");


   CTNotesMasterIdListEntry getNotesMasterId();

   boolean isSetNotesMasterId();

   void setNotesMasterId(CTNotesMasterIdListEntry var1);

   CTNotesMasterIdListEntry addNewNotesMasterId();

   void unsetNotesMasterId();


   public static final class Factory {

      public static CTNotesMasterIdList newInstance() {
         return (CTNotesMasterIdList)POIXMLTypeLoader.newInstance(CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList newInstance(XmlOptions var0) {
         return (CTNotesMasterIdList)POIXMLTypeLoader.newInstance(CTNotesMasterIdList.type, var0);
      }

      public static CTNotesMasterIdList parse(String var0) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(File var0) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(URL var0) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(InputStream var0) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(Reader var0) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(XMLStreamReader var0) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(Node var0) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static CTNotesMasterIdList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static CTNotesMasterIdList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNotesMasterIdList)POIXMLTypeLoader.parse(var0, CTNotesMasterIdList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMasterIdList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMasterIdList.type, var1);
      }

   }
}
