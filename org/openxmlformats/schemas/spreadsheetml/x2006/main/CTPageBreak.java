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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak;
import org.w3c.dom.Node;

public interface CTPageBreak extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPageBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpagebreakeb4ftype");


   List getBrkList();

   CTBreak[] getBrkArray();

   CTBreak getBrkArray(int var1);

   int sizeOfBrkArray();

   void setBrkArray(CTBreak[] var1);

   void setBrkArray(int var1, CTBreak var2);

   CTBreak insertNewBrk(int var1);

   CTBreak addNewBrk();

   void removeBrk(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();

   long getManualBreakCount();

   XmlUnsignedInt xgetManualBreakCount();

   boolean isSetManualBreakCount();

   void setManualBreakCount(long var1);

   void xsetManualBreakCount(XmlUnsignedInt var1);

   void unsetManualBreakCount();


   public static final class Factory {

      public static CTPageBreak newInstance() {
         return (CTPageBreak)POIXMLTypeLoader.newInstance(CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak newInstance(XmlOptions var0) {
         return (CTPageBreak)POIXMLTypeLoader.newInstance(CTPageBreak.type, var0);
      }

      public static CTPageBreak parse(String var0) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(File var0) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(URL var0) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(InputStream var0) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(Reader var0) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(XMLStreamReader var0) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(Node var0) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static CTPageBreak parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static CTPageBreak parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPageBreak)POIXMLTypeLoader.parse(var0, CTPageBreak.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageBreak.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageBreak.type, var1);
      }

   }
}
