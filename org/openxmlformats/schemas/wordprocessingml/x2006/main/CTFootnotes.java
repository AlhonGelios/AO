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

public interface CTFootnotes extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFootnotes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfootnotes691ftype");


   List getFootnoteList();

   CTFtnEdn[] getFootnoteArray();

   CTFtnEdn getFootnoteArray(int var1);

   int sizeOfFootnoteArray();

   void setFootnoteArray(CTFtnEdn[] var1);

   void setFootnoteArray(int var1, CTFtnEdn var2);

   CTFtnEdn insertNewFootnote(int var1);

   CTFtnEdn addNewFootnote();

   void removeFootnote(int var1);


   public static final class Factory {

      public static CTFootnotes newInstance() {
         return (CTFootnotes)POIXMLTypeLoader.newInstance(CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes newInstance(XmlOptions var0) {
         return (CTFootnotes)POIXMLTypeLoader.newInstance(CTFootnotes.type, var0);
      }

      public static CTFootnotes parse(String var0) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(File var0) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(URL var0) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(InputStream var0) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(Reader var0) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(XMLStreamReader var0) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(Node var0) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static CTFootnotes parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static CTFootnotes parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFootnotes)POIXMLTypeLoader.parse(var0, CTFootnotes.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFootnotes.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFootnotes.type, var1);
      }

   }
}
