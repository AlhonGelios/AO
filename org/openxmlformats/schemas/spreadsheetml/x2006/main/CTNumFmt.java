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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTNumFmt extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumFmt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumfmt3870type");


   long getNumFmtId();

   STNumFmtId xgetNumFmtId();

   void setNumFmtId(long var1);

   void xsetNumFmtId(STNumFmtId var1);

   String getFormatCode();

   STXstring xgetFormatCode();

   void setFormatCode(String var1);

   void xsetFormatCode(STXstring var1);


   public static final class Factory {

      public static CTNumFmt newInstance() {
         return (CTNumFmt)POIXMLTypeLoader.newInstance(CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt newInstance(XmlOptions var0) {
         return (CTNumFmt)POIXMLTypeLoader.newInstance(CTNumFmt.type, var0);
      }

      public static CTNumFmt parse(String var0) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(File var0) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(URL var0) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(InputStream var0) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(Reader var0) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(XMLStreamReader var0) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(Node var0) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static CTNumFmt parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static CTNumFmt parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumFmt)POIXMLTypeLoader.parse(var0, CTNumFmt.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumFmt.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumFmt.type, var1);
      }

   }
}
