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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex;
import org.w3c.dom.Node;

public interface CTColor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolord2c2type");


   boolean getAuto();

   XmlBoolean xgetAuto();

   boolean isSetAuto();

   void setAuto(boolean var1);

   void xsetAuto(XmlBoolean var1);

   void unsetAuto();

   long getIndexed();

   XmlUnsignedInt xgetIndexed();

   boolean isSetIndexed();

   void setIndexed(long var1);

   void xsetIndexed(XmlUnsignedInt var1);

   void unsetIndexed();

   byte[] getRgb();

   STUnsignedIntHex xgetRgb();

   boolean isSetRgb();

   void setRgb(byte[] var1);

   void xsetRgb(STUnsignedIntHex var1);

   void unsetRgb();

   long getTheme();

   XmlUnsignedInt xgetTheme();

   boolean isSetTheme();

   void setTheme(long var1);

   void xsetTheme(XmlUnsignedInt var1);

   void unsetTheme();

   double getTint();

   XmlDouble xgetTint();

   boolean isSetTint();

   void setTint(double var1);

   void xsetTint(XmlDouble var1);

   void unsetTint();


   public static final class Factory {

      public static CTColor newInstance() {
         return (CTColor)POIXMLTypeLoader.newInstance(CTColor.type, (XmlOptions)null);
      }

      public static CTColor newInstance(XmlOptions var0) {
         return (CTColor)POIXMLTypeLoader.newInstance(CTColor.type, var0);
      }

      public static CTColor parse(String var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(File var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(URL var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(InputStream var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(Reader var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(XMLStreamReader var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(Node var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColor.type, var1);
      }

   }
}
