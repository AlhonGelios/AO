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
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster;
import org.w3c.dom.Node;

public interface NotesMasterDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NotesMasterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("notesmaster8840doctype");


   CTNotesMaster getNotesMaster();

   void setNotesMaster(CTNotesMaster var1);

   CTNotesMaster addNewNotesMaster();


   public static final class Factory {

      public static NotesMasterDocument newInstance() {
         return (NotesMasterDocument)POIXMLTypeLoader.newInstance(NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument newInstance(XmlOptions var0) {
         return (NotesMasterDocument)POIXMLTypeLoader.newInstance(NotesMasterDocument.type, var0);
      }

      public static NotesMasterDocument parse(String var0) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(File var0) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(URL var0) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(InputStream var0) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(Reader var0) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(XMLStreamReader var0) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(Node var0) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static NotesMasterDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static NotesMasterDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (NotesMasterDocument)POIXMLTypeLoader.parse(var0, NotesMasterDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NotesMasterDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NotesMasterDocument.type, var1);
      }

   }
}
