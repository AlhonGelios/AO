package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink;
import org.w3c.dom.Node;

public interface CTHyperlinks extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHyperlinks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthyperlinks6416type");


   List getHyperlinkList();

   CTHyperlink[] getHyperlinkArray();

   CTHyperlink getHyperlinkArray(int var1);

   int sizeOfHyperlinkArray();

   void setHyperlinkArray(CTHyperlink[] var1);

   void setHyperlinkArray(int var1, CTHyperlink var2);

   CTHyperlink insertNewHyperlink(int var1);

   CTHyperlink addNewHyperlink();

   void removeHyperlink(int var1);


   public static final class Factory {

      public static CTHyperlinks newInstance() {
         return (CTHyperlinks)POIXMLTypeLoader.newInstance(CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks newInstance(XmlOptions var0) {
         return (CTHyperlinks)POIXMLTypeLoader.newInstance(CTHyperlinks.type, var0);
      }

      public static CTHyperlinks parse(String var0) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(File var0) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(URL var0) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(InputStream var0) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(Reader var0) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(XMLStreamReader var0) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(Node var0) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static CTHyperlinks parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static CTHyperlinks parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHyperlinks)POIXMLTypeLoader.parse(var0, CTHyperlinks.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHyperlinks.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHyperlinks.type, var1);
      }

   }
}
