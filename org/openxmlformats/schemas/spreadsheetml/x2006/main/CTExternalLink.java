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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink;
import org.w3c.dom.Node;

public interface CTExternalLink extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternallink966etype");


   CTExternalBook getExternalBook();

   boolean isSetExternalBook();

   void setExternalBook(CTExternalBook var1);

   CTExternalBook addNewExternalBook();

   void unsetExternalBook();

   CTDdeLink getDdeLink();

   boolean isSetDdeLink();

   void setDdeLink(CTDdeLink var1);

   CTDdeLink addNewDdeLink();

   void unsetDdeLink();

   CTOleLink getOleLink();

   boolean isSetOleLink();

   void setOleLink(CTOleLink var1);

   CTOleLink addNewOleLink();

   void unsetOleLink();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTExternalLink newInstance() {
         return (CTExternalLink)POIXMLTypeLoader.newInstance(CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink newInstance(XmlOptions var0) {
         return (CTExternalLink)POIXMLTypeLoader.newInstance(CTExternalLink.type, var0);
      }

      public static CTExternalLink parse(String var0) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(File var0) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(URL var0) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(Reader var0) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(Node var0) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static CTExternalLink parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static CTExternalLink parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalLink)POIXMLTypeLoader.parse(var0, CTExternalLink.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalLink.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalLink.type, var1);
      }

   }
}
