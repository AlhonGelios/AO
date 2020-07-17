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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord;
import org.w3c.dom.Node;

public interface CTPivotCacheRecords extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotCacheRecords.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotcacherecords5be1type");


   List getRList();

   CTRecord[] getRArray();

   CTRecord getRArray(int var1);

   int sizeOfRArray();

   void setRArray(CTRecord[] var1);

   void setRArray(int var1, CTRecord var2);

   CTRecord insertNewR(int var1);

   CTRecord addNewR();

   void removeR(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTPivotCacheRecords newInstance() {
         return (CTPivotCacheRecords)POIXMLTypeLoader.newInstance(CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords newInstance(XmlOptions var0) {
         return (CTPivotCacheRecords)POIXMLTypeLoader.newInstance(CTPivotCacheRecords.type, var0);
      }

      public static CTPivotCacheRecords parse(String var0) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(File var0) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(URL var0) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(Reader var0) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(Node var0) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static CTPivotCacheRecords parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static CTPivotCacheRecords parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotCacheRecords)POIXMLTypeLoader.parse(var0, CTPivotCacheRecords.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCacheRecords.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCacheRecords.type, var1);
      }

   }
}
