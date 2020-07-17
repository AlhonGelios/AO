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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.w3c.dom.Node;

public interface CTSst extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsst44f3type");


   List getSiList();

   CTRst[] getSiArray();

   CTRst getSiArray(int var1);

   int sizeOfSiArray();

   void setSiArray(CTRst[] var1);

   void setSiArray(int var1, CTRst var2);

   CTRst insertNewSi(int var1);

   CTRst addNewSi();

   void removeSi(int var1);

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

   long getUniqueCount();

   XmlUnsignedInt xgetUniqueCount();

   boolean isSetUniqueCount();

   void setUniqueCount(long var1);

   void xsetUniqueCount(XmlUnsignedInt var1);

   void unsetUniqueCount();


   public static final class Factory {

      public static CTSst newInstance() {
         return (CTSst)POIXMLTypeLoader.newInstance(CTSst.type, (XmlOptions)null);
      }

      public static CTSst newInstance(XmlOptions var0) {
         return (CTSst)POIXMLTypeLoader.newInstance(CTSst.type, var0);
      }

      public static CTSst parse(String var0) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(File var0) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(URL var0) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(InputStream var0) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(Reader var0) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(XMLStreamReader var0) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(Node var0) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static CTSst parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, (XmlOptions)null);
      }

      public static CTSst parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSst)POIXMLTypeLoader.parse(var0, CTSst.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSst.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSst.type, var1);
      }

   }
}
