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
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide;
import org.w3c.dom.Node;

public interface NotesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NotesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("notes4a02doctype");


   CTNotesSlide getNotes();

   void setNotes(CTNotesSlide var1);

   CTNotesSlide addNewNotes();


   public static final class Factory {

      public static NotesDocument newInstance() {
         return (NotesDocument)POIXMLTypeLoader.newInstance(NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument newInstance(XmlOptions var0) {
         return (NotesDocument)POIXMLTypeLoader.newInstance(NotesDocument.type, var0);
      }

      public static NotesDocument parse(String var0) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(File var0) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(URL var0) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(InputStream var0) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(Reader var0) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(XMLStreamReader var0) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(Node var0) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static NotesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static NotesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (NotesDocument)POIXMLTypeLoader.parse(var0, NotesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NotesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NotesDocument.type, var1);
      }

   }
}
