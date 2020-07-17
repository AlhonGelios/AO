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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex;
import org.w3c.dom.Node;

public interface CTWorkbookProtection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTWorkbookProtection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctworkbookprotection56bctype");


   byte[] getWorkbookPassword();

   STUnsignedShortHex xgetWorkbookPassword();

   boolean isSetWorkbookPassword();

   void setWorkbookPassword(byte[] var1);

   void xsetWorkbookPassword(STUnsignedShortHex var1);

   void unsetWorkbookPassword();

   byte[] getRevisionsPassword();

   STUnsignedShortHex xgetRevisionsPassword();

   boolean isSetRevisionsPassword();

   void setRevisionsPassword(byte[] var1);

   void xsetRevisionsPassword(STUnsignedShortHex var1);

   void unsetRevisionsPassword();

   boolean getLockStructure();

   XmlBoolean xgetLockStructure();

   boolean isSetLockStructure();

   void setLockStructure(boolean var1);

   void xsetLockStructure(XmlBoolean var1);

   void unsetLockStructure();

   boolean getLockWindows();

   XmlBoolean xgetLockWindows();

   boolean isSetLockWindows();

   void setLockWindows(boolean var1);

   void xsetLockWindows(XmlBoolean var1);

   void unsetLockWindows();

   boolean getLockRevision();

   XmlBoolean xgetLockRevision();

   boolean isSetLockRevision();

   void setLockRevision(boolean var1);

   void xsetLockRevision(XmlBoolean var1);

   void unsetLockRevision();


   public static final class Factory {

      public static CTWorkbookProtection newInstance() {
         return (CTWorkbookProtection)POIXMLTypeLoader.newInstance(CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection newInstance(XmlOptions var0) {
         return (CTWorkbookProtection)POIXMLTypeLoader.newInstance(CTWorkbookProtection.type, var0);
      }

      public static CTWorkbookProtection parse(String var0) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(File var0) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(URL var0) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(InputStream var0) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(Reader var0) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(XMLStreamReader var0) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(Node var0) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static CTWorkbookProtection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static CTWorkbookProtection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTWorkbookProtection)POIXMLTypeLoader.parse(var0, CTWorkbookProtection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbookProtection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbookProtection.type, var1);
      }

   }
}
