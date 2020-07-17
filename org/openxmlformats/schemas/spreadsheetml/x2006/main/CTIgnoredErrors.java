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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError;
import org.w3c.dom.Node;

public interface CTIgnoredErrors extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTIgnoredErrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctignorederrorsbebctype");


   List getIgnoredErrorList();

   CTIgnoredError[] getIgnoredErrorArray();

   CTIgnoredError getIgnoredErrorArray(int var1);

   int sizeOfIgnoredErrorArray();

   void setIgnoredErrorArray(CTIgnoredError[] var1);

   void setIgnoredErrorArray(int var1, CTIgnoredError var2);

   CTIgnoredError insertNewIgnoredError(int var1);

   CTIgnoredError addNewIgnoredError();

   void removeIgnoredError(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTIgnoredErrors newInstance() {
         return (CTIgnoredErrors)POIXMLTypeLoader.newInstance(CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors newInstance(XmlOptions var0) {
         return (CTIgnoredErrors)POIXMLTypeLoader.newInstance(CTIgnoredErrors.type, var0);
      }

      public static CTIgnoredErrors parse(String var0) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(String var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(File var0) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(URL var0) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(InputStream var0) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(Reader var0) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(XMLStreamReader var0) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(Node var0) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static CTIgnoredErrors parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static CTIgnoredErrors parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTIgnoredErrors)POIXMLTypeLoader.parse(var0, CTIgnoredErrors.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIgnoredErrors.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIgnoredErrors.type, var1);
      }

   }
}
