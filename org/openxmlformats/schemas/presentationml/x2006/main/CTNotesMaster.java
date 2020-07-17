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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.w3c.dom.Node;

public interface CTNotesMaster extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNotesMaster.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnotesmaster69ectype");


   CTCommonSlideData getCSld();

   void setCSld(CTCommonSlideData var1);

   CTCommonSlideData addNewCSld();

   CTColorMapping getClrMap();

   void setClrMap(CTColorMapping var1);

   CTColorMapping addNewClrMap();

   CTHeaderFooter getHf();

   boolean isSetHf();

   void setHf(CTHeaderFooter var1);

   CTHeaderFooter addNewHf();

   void unsetHf();

   CTTextListStyle getNotesStyle();

   boolean isSetNotesStyle();

   void setNotesStyle(CTTextListStyle var1);

   CTTextListStyle addNewNotesStyle();

   void unsetNotesStyle();

   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNotesMaster newInstance() {
         return (CTNotesMaster)POIXMLTypeLoader.newInstance(CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster newInstance(XmlOptions var0) {
         return (CTNotesMaster)POIXMLTypeLoader.newInstance(CTNotesMaster.type, var0);
      }

      public static CTNotesMaster parse(String var0) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(File var0) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(URL var0) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(InputStream var0) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(Reader var0) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(XMLStreamReader var0) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(Node var0) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static CTNotesMaster parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static CTNotesMaster parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNotesMaster)POIXMLTypeLoader.parse(var0, CTNotesMaster.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMaster.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesMaster.type, var1);
      }

   }
}
