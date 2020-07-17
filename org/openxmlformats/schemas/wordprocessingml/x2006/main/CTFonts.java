package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme;
import org.w3c.dom.Node;

public interface CTFonts extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFonts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfonts124etype");


   STHint$Enum getHint();

   STHint xgetHint();

   boolean isSetHint();

   void setHint(STHint$Enum var1);

   void xsetHint(STHint var1);

   void unsetHint();

   String getAscii();

   STString xgetAscii();

   boolean isSetAscii();

   void setAscii(String var1);

   void xsetAscii(STString var1);

   void unsetAscii();

   String getHAnsi();

   STString xgetHAnsi();

   boolean isSetHAnsi();

   void setHAnsi(String var1);

   void xsetHAnsi(STString var1);

   void unsetHAnsi();

   String getEastAsia();

   STString xgetEastAsia();

   boolean isSetEastAsia();

   void setEastAsia(String var1);

   void xsetEastAsia(STString var1);

   void unsetEastAsia();

   String getCs();

   STString xgetCs();

   boolean isSetCs();

   void setCs(String var1);

   void xsetCs(STString var1);

   void unsetCs();

   STTheme.Enum getAsciiTheme();

   STTheme xgetAsciiTheme();

   boolean isSetAsciiTheme();

   void setAsciiTheme(STTheme.Enum var1);

   void xsetAsciiTheme(STTheme var1);

   void unsetAsciiTheme();

   STTheme.Enum getHAnsiTheme();

   STTheme xgetHAnsiTheme();

   boolean isSetHAnsiTheme();

   void setHAnsiTheme(STTheme.Enum var1);

   void xsetHAnsiTheme(STTheme var1);

   void unsetHAnsiTheme();

   STTheme.Enum getEastAsiaTheme();

   STTheme xgetEastAsiaTheme();

   boolean isSetEastAsiaTheme();

   void setEastAsiaTheme(STTheme.Enum var1);

   void xsetEastAsiaTheme(STTheme var1);

   void unsetEastAsiaTheme();

   STTheme.Enum getCstheme();

   STTheme xgetCstheme();

   boolean isSetCstheme();

   void setCstheme(STTheme.Enum var1);

   void xsetCstheme(STTheme var1);

   void unsetCstheme();


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
