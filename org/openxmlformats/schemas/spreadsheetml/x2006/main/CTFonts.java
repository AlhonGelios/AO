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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.w3c.dom.Node;

public interface CTFonts extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFonts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfonts6623type");


   List getFontList();

   CTFont[] getFontArray();

   CTFont getFontArray(int var1);

   int sizeOfFontArray();

   void setFontArray(CTFont[] var1);

   void setFontArray(int var1, CTFont var2);

   CTFont insertNewFont(int var1);

   CTFont addNewFont();

   void removeFont(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTFonts newInstance() {
         return (CTFonts)POIXMLTypeLoader.newInstance(CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts newInstance(XmlOptions var0) {
         return (CTFonts)POIXMLTypeLoader.newInstance(CTFonts.type, var0);
      }

      public static CTFonts parse(String var0) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(File var0) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(URL var0) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(InputStream var0) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(Reader var0) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(XMLStreamReader var0) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(Node var0) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static CTFonts parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, (XmlOptions)null);
      }

      public static CTFonts parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFonts)POIXMLTypeLoader.parse(var0, CTFonts.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFonts.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFonts.type, var1);
      }

   }
}
