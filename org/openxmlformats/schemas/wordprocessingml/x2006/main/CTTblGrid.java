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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange;
import org.w3c.dom.Node;

public interface CTTblGrid extends CTTblGridBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblGrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblgrid2eeetype");


   CTTblGridChange getTblGridChange();

   boolean isSetTblGridChange();

   void setTblGridChange(CTTblGridChange var1);

   CTTblGridChange addNewTblGridChange();

   void unsetTblGridChange();


   public static final class Factory {

      public static CTTblGrid newInstance() {
         return (CTTblGrid)POIXMLTypeLoader.newInstance(CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid newInstance(XmlOptions var0) {
         return (CTTblGrid)POIXMLTypeLoader.newInstance(CTTblGrid.type, var0);
      }

      public static CTTblGrid parse(String var0) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(File var0) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(URL var0) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(InputStream var0) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(Reader var0) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(XMLStreamReader var0) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(Node var0) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static CTTblGrid parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static CTTblGrid parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblGrid)POIXMLTypeLoader.parse(var0, CTTblGrid.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblGrid.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblGrid.type, var1);
      }

   }
}
