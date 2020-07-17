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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange;
import org.w3c.dom.Node;

public interface CTTblPrEx extends CTTblPrExBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblPrEx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblprex863ftype");


   CTTblPrExChange getTblPrExChange();

   boolean isSetTblPrExChange();

   void setTblPrExChange(CTTblPrExChange var1);

   CTTblPrExChange addNewTblPrExChange();

   void unsetTblPrExChange();


   public static final class Factory {

      public static CTTblPrEx newInstance() {
         return (CTTblPrEx)POIXMLTypeLoader.newInstance(CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx newInstance(XmlOptions var0) {
         return (CTTblPrEx)POIXMLTypeLoader.newInstance(CTTblPrEx.type, var0);
      }

      public static CTTblPrEx parse(String var0) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(File var0) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(URL var0) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(InputStream var0) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(Reader var0) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(XMLStreamReader var0) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(Node var0) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static CTTblPrEx parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static CTTblPrEx parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblPrEx)POIXMLTypeLoader.parse(var0, CTTblPrEx.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrEx.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblPrEx.type, var1);
      }

   }
}
