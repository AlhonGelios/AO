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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf;
import org.w3c.dom.Node;

public interface CTDxfs extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDxfs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdxfsb26atype");


   List getDxfList();

   CTDxf[] getDxfArray();

   CTDxf getDxfArray(int var1);

   int sizeOfDxfArray();

   void setDxfArray(CTDxf[] var1);

   void setDxfArray(int var1, CTDxf var2);

   CTDxf insertNewDxf(int var1);

   CTDxf addNewDxf();

   void removeDxf(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTDxfs newInstance() {
         return (CTDxfs)POIXMLTypeLoader.newInstance(CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs newInstance(XmlOptions var0) {
         return (CTDxfs)POIXMLTypeLoader.newInstance(CTDxfs.type, var0);
      }

      public static CTDxfs parse(String var0) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(File var0) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(URL var0) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(InputStream var0) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(Reader var0) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(XMLStreamReader var0) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(Node var0) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static CTDxfs parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static CTDxfs parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDxfs)POIXMLTypeLoader.parse(var0, CTDxfs.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDxfs.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDxfs.type, var1);
      }

   }
}
