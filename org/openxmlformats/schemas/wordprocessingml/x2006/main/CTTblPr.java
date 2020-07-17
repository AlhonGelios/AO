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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange;
import org.w3c.dom.Node;

public interface CTTblPr extends CTTblPrBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblpr5b72type");


   CTTblPrChange getTblPrChange();

   boolean isSetTblPrChange();

   void setTblPrChange(CTTblPrChange var1);

   CTTblPrChange addNewTblPrChange();

   void unsetTblPrChange();


   public static final class Factory {

      public static CTTblPr newInstance() {
         return (CTTblPr)POIXMLTypeLoader.newInstance(CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr newInstance(XmlOptions var0) {
         return (CTTblPr)POIXMLTypeLoader.newInstance(CTTblPr.type, var0);
      }

      public static CTTblPr parse(String var0) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(File var0) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(URL var0) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(InputStream var0) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(Reader var0) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(XMLStreamReader var0) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(Node var0) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static CTTblPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static CTTblPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblPr)POIXMLTypeLoader.parse(var0, CTTblPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPr.type, var1);
      }

   }
}
