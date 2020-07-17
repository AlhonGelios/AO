package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STPanose;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface;
import org.w3c.dom.Node;

public interface CTTextFont extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextFont.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextfont92b7type");


   String getTypeface();

   STTextTypeface xgetTypeface();

   boolean isSetTypeface();

   void setTypeface(String var1);

   void xsetTypeface(STTextTypeface var1);

   void unsetTypeface();

   byte[] getPanose();

   STPanose xgetPanose();

   boolean isSetPanose();

   void setPanose(byte[] var1);

   void xsetPanose(STPanose var1);

   void unsetPanose();

   byte getPitchFamily();

   XmlByte xgetPitchFamily();

   boolean isSetPitchFamily();

   void setPitchFamily(byte var1);

   void xsetPitchFamily(XmlByte var1);

   void unsetPitchFamily();

   byte getCharset();

   XmlByte xgetCharset();

   boolean isSetCharset();

   void setCharset(byte var1);

   void xsetCharset(XmlByte var1);

   void unsetCharset();


   public static final class Factory {

      public static CTTextFont newInstance() {
         return (CTTextFont)POIXMLTypeLoader.newInstance(CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont newInstance(XmlOptions var0) {
         return (CTTextFont)POIXMLTypeLoader.newInstance(CTTextFont.type, var0);
      }

      public static CTTextFont parse(String var0) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(File var0) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(URL var0) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(InputStream var0) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(Reader var0) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(XMLStreamReader var0) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(Node var0) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static CTTextFont parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static CTTextFont parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextFont)POIXMLTypeLoader.parse(var0, CTTextFont.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextFont.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextFont.type, var1);
      }

   }
}
