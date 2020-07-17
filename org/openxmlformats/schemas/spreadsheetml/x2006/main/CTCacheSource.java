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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.w3c.dom.Node;

public interface CTCacheSource extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCacheSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcachesource00dctype");


   CTWorksheetSource getWorksheetSource();

   boolean isSetWorksheetSource();

   void setWorksheetSource(CTWorksheetSource var1);

   CTWorksheetSource addNewWorksheetSource();

   void unsetWorksheetSource();

   CTConsolidation getConsolidation();

   boolean isSetConsolidation();

   void setConsolidation(CTConsolidation var1);

   CTConsolidation addNewConsolidation();

   void unsetConsolidation();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   STSourceType.Enum getType();

   STSourceType xgetType();

   void setType(STSourceType.Enum var1);

   void xsetType(STSourceType var1);

   long getConnectionId();

   XmlUnsignedInt xgetConnectionId();

   boolean isSetConnectionId();

   void setConnectionId(long var1);

   void xsetConnectionId(XmlUnsignedInt var1);

   void unsetConnectionId();


   public static final class Factory {

      public static CTCacheSource newInstance() {
         return (CTCacheSource)POIXMLTypeLoader.newInstance(CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource newInstance(XmlOptions var0) {
         return (CTCacheSource)POIXMLTypeLoader.newInstance(CTCacheSource.type, var0);
      }

      public static CTCacheSource parse(String var0) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(File var0) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(URL var0) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(InputStream var0) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(Reader var0) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(XMLStreamReader var0) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(Node var0) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static CTCacheSource parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static CTCacheSource parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCacheSource)POIXMLTypeLoader.parse(var0, CTCacheSource.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheSource.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheSource.type, var1);
      }

   }
}
