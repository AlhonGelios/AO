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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.w3c.dom.Node;

public interface CTCellStyleXfs extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCellStyleXfs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcellstylexfsa81ftype");


   List getXfList();

   CTXf[] getXfArray();

   CTXf getXfArray(int var1);

   int sizeOfXfArray();

   void setXfArray(CTXf[] var1);

   void setXfArray(int var1, CTXf var2);

   CTXf insertNewXf(int var1);

   CTXf addNewXf();

   void removeXf(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTCellStyleXfs newInstance() {
         return (CTCellStyleXfs)POIXMLTypeLoader.newInstance(CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs newInstance(XmlOptions var0) {
         return (CTCellStyleXfs)POIXMLTypeLoader.newInstance(CTCellStyleXfs.type, var0);
      }

      public static CTCellStyleXfs parse(String var0) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(File var0) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(URL var0) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(InputStream var0) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(Reader var0) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(XMLStreamReader var0) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(Node var0) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static CTCellStyleXfs parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static CTCellStyleXfs parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCellStyleXfs)POIXMLTypeLoader.parse(var0, CTCellStyleXfs.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellStyleXfs.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellStyleXfs.type, var1);
      }

   }
}
