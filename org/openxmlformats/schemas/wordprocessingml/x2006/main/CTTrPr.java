package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.w3c.dom.Node;

public interface CTTrPr extends CTTrPrBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTrPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttrpr2848type");


   CTTrackChange getIns();

   boolean isSetIns();

   void setIns(CTTrackChange var1);

   CTTrackChange addNewIns();

   void unsetIns();

   CTTrackChange getDel();

   boolean isSetDel();

   void setDel(CTTrackChange var1);

   CTTrackChange addNewDel();

   void unsetDel();

   CTTrPrChange getTrPrChange();

   boolean isSetTrPrChange();

   void setTrPrChange(CTTrPrChange var1);

   CTTrPrChange addNewTrPrChange();

   void unsetTrPrChange();


   public static final class Factory {

      public static CTTrPr newInstance() {
         return (CTTrPr)POIXMLTypeLoader.newInstance(CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr newInstance(XmlOptions var0) {
         return (CTTrPr)POIXMLTypeLoader.newInstance(CTTrPr.type, var0);
      }

      public static CTTrPr parse(String var0) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(File var0) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(URL var0) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(InputStream var0) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(Reader var0) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(XMLStreamReader var0) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(Node var0) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static CTTrPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static CTTrPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTrPr)POIXMLTypeLoader.parse(var0, CTTrPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrPr.type, var1);
      }

   }
}
