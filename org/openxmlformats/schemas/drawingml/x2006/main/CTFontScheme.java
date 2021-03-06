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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTFontScheme extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFontScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfontscheme232ftype");


   CTFontCollection getMajorFont();

   void setMajorFont(CTFontCollection var1);

   CTFontCollection addNewMajorFont();

   CTFontCollection getMinorFont();

   void setMinorFont(CTFontCollection var1);

   CTFontCollection addNewMinorFont();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   XmlString xgetName();

   void setName(String var1);

   void xsetName(XmlString var1);


   public static final class Factory {

      public static CTFontScheme newInstance() {
         return (CTFontScheme)POIXMLTypeLoader.newInstance(CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme newInstance(XmlOptions var0) {
         return (CTFontScheme)POIXMLTypeLoader.newInstance(CTFontScheme.type, var0);
      }

      public static CTFontScheme parse(String var0) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(File var0) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(URL var0) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(InputStream var0) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(Reader var0) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(XMLStreamReader var0) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(Node var0) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static CTFontScheme parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static CTFontScheme parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFontScheme)POIXMLTypeLoader.parse(var0, CTFontScheme.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontScheme.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontScheme.type, var1);
      }

   }
}
