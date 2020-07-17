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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.w3c.dom.Node;

public interface CTLocation extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlocationc23etype");


   String getRef();

   STRef xgetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   long getFirstHeaderRow();

   XmlUnsignedInt xgetFirstHeaderRow();

   void setFirstHeaderRow(long var1);

   void xsetFirstHeaderRow(XmlUnsignedInt var1);

   long getFirstDataRow();

   XmlUnsignedInt xgetFirstDataRow();

   void setFirstDataRow(long var1);

   void xsetFirstDataRow(XmlUnsignedInt var1);

   long getFirstDataCol();

   XmlUnsignedInt xgetFirstDataCol();

   void setFirstDataCol(long var1);

   void xsetFirstDataCol(XmlUnsignedInt var1);

   long getRowPageCount();

   XmlUnsignedInt xgetRowPageCount();

   boolean isSetRowPageCount();

   void setRowPageCount(long var1);

   void xsetRowPageCount(XmlUnsignedInt var1);

   void unsetRowPageCount();

   long getColPageCount();

   XmlUnsignedInt xgetColPageCount();

   boolean isSetColPageCount();

   void setColPageCount(long var1);

   void xsetColPageCount(XmlUnsignedInt var1);

   void unsetColPageCount();


   public static final class Factory {

      public static CTLocation newInstance() {
         return (CTLocation)POIXMLTypeLoader.newInstance(CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation newInstance(XmlOptions var0) {
         return (CTLocation)POIXMLTypeLoader.newInstance(CTLocation.type, var0);
      }

      public static CTLocation parse(String var0) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(File var0) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(URL var0) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(InputStream var0) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(Reader var0) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(XMLStreamReader var0) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(Node var0) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static CTLocation parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, (XmlOptions)null);
      }

      public static CTLocation parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLocation)POIXMLTypeLoader.parse(var0, CTLocation.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLocation.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLocation.type, var1);
      }

   }
}
