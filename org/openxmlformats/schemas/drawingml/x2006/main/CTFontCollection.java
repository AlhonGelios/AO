package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.w3c.dom.Node;

public interface CTFontCollection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFontCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfontcollectiondd68type");


   CTTextFont getLatin();

   void setLatin(CTTextFont var1);

   CTTextFont addNewLatin();

   CTTextFont getEa();

   void setEa(CTTextFont var1);

   CTTextFont addNewEa();

   CTTextFont getCs();

   void setCs(CTTextFont var1);

   CTTextFont addNewCs();

   List getFontList();

   CTSupplementalFont[] getFontArray();

   CTSupplementalFont getFontArray(int var1);

   int sizeOfFontArray();

   void setFontArray(CTSupplementalFont[] var1);

   void setFontArray(int var1, CTSupplementalFont var2);

   CTSupplementalFont insertNewFont(int var1);

   CTSupplementalFont addNewFont();

   void removeFont(int var1);

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTFontCollection newInstance() {
         return (CTFontCollection)POIXMLTypeLoader.newInstance(CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection newInstance(XmlOptions var0) {
         return (CTFontCollection)POIXMLTypeLoader.newInstance(CTFontCollection.type, var0);
      }

      public static CTFontCollection parse(String var0) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(File var0) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(URL var0) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(InputStream var0) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(Reader var0) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(XMLStreamReader var0) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(Node var0) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static CTFontCollection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static CTFontCollection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFontCollection)POIXMLTypeLoader.parse(var0, CTFontCollection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontCollection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontCollection.type, var1);
      }

   }
}
