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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt;
import org.w3c.dom.Node;

public interface CTNumFmts extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumFmts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumfmtsb58btype");


   List getNumFmtList();

   CTNumFmt[] getNumFmtArray();

   CTNumFmt getNumFmtArray(int var1);

   int sizeOfNumFmtArray();

   void setNumFmtArray(CTNumFmt[] var1);

   void setNumFmtArray(int var1, CTNumFmt var2);

   CTNumFmt insertNewNumFmt(int var1);

   CTNumFmt addNewNumFmt();

   void removeNumFmt(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTNumFmts newInstance() {
         return (CTNumFmts)POIXMLTypeLoader.newInstance(CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts newInstance(XmlOptions var0) {
         return (CTNumFmts)POIXMLTypeLoader.newInstance(CTNumFmts.type, var0);
      }

      public static CTNumFmts parse(String var0) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(File var0) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(URL var0) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(InputStream var0) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(Reader var0) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(XMLStreamReader var0) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(Node var0) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static CTNumFmts parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static CTNumFmts parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumFmts)POIXMLTypeLoader.parse(var0, CTNumFmts.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumFmts.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumFmts.type, var1);
      }

   }
}
