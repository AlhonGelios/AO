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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;
import org.w3c.dom.Node;

public interface CTEndnotes extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEndnotes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctendnotescee2type");


   List getEndnoteList();

   CTFtnEdn[] getEndnoteArray();

   CTFtnEdn getEndnoteArray(int var1);

   int sizeOfEndnoteArray();

   void setEndnoteArray(CTFtnEdn[] var1);

   void setEndnoteArray(int var1, CTFtnEdn var2);

   CTFtnEdn insertNewEndnote(int var1);

   CTFtnEdn addNewEndnote();

   void removeEndnote(int var1);


   public static final class Factory {

      public static CTEndnotes newInstance() {
         return (CTEndnotes)POIXMLTypeLoader.newInstance(CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes newInstance(XmlOptions var0) {
         return (CTEndnotes)POIXMLTypeLoader.newInstance(CTEndnotes.type, var0);
      }

      public static CTEndnotes parse(String var0) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(File var0) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(URL var0) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(InputStream var0) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(Reader var0) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(XMLStreamReader var0) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(Node var0) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static CTEndnotes parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static CTEndnotes parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEndnotes)POIXMLTypeLoader.parse(var0, CTEndnotes.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEndnotes.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEndnotes.type, var1);
      }

   }
}
