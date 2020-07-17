package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.w3c.dom.Node;

public interface CTTableCol extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableCol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablecol19edtype");


   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   long getW();

   STCoordinate xgetW();

   void setW(long var1);

   void xsetW(STCoordinate var1);


   public static final class Factory {

      public static CTTableCol newInstance() {
         return (CTTableCol)POIXMLTypeLoader.newInstance(CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol newInstance(XmlOptions var0) {
         return (CTTableCol)POIXMLTypeLoader.newInstance(CTTableCol.type, var0);
      }

      public static CTTableCol parse(String var0) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(File var0) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(URL var0) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(InputStream var0) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(Reader var0) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(XMLStreamReader var0) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(Node var0) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static CTTableCol parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static CTTableCol parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableCol)POIXMLTypeLoader.parse(var0, CTTableCol.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCol.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCol.type, var1);
      }

   }
}
