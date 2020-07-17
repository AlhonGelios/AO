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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTCellProtection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCellProtection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcellprotectionf524type");


   boolean getLocked();

   XmlBoolean xgetLocked();

   boolean isSetLocked();

   void setLocked(boolean var1);

   void xsetLocked(XmlBoolean var1);

   void unsetLocked();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();


   public static final class Factory {

      public static CTCellProtection newInstance() {
         return (CTCellProtection)POIXMLTypeLoader.newInstance(CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection newInstance(XmlOptions var0) {
         return (CTCellProtection)POIXMLTypeLoader.newInstance(CTCellProtection.type, var0);
      }

      public static CTCellProtection parse(String var0) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(File var0) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(URL var0) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(InputStream var0) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(Reader var0) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(XMLStreamReader var0) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(Node var0) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static CTCellProtection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static CTCellProtection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCellProtection)POIXMLTypeLoader.parse(var0, CTCellProtection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellProtection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellProtection.type, var1);
      }

   }
}
