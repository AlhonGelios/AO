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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTColorScheme extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColorScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolorscheme0e99type");


   CTColor getDk1();

   void setDk1(CTColor var1);

   CTColor addNewDk1();

   CTColor getLt1();

   void setLt1(CTColor var1);

   CTColor addNewLt1();

   CTColor getDk2();

   void setDk2(CTColor var1);

   CTColor addNewDk2();

   CTColor getLt2();

   void setLt2(CTColor var1);

   CTColor addNewLt2();

   CTColor getAccent1();

   void setAccent1(CTColor var1);

   CTColor addNewAccent1();

   CTColor getAccent2();

   void setAccent2(CTColor var1);

   CTColor addNewAccent2();

   CTColor getAccent3();

   void setAccent3(CTColor var1);

   CTColor addNewAccent3();

   CTColor getAccent4();

   void setAccent4(CTColor var1);

   CTColor addNewAccent4();

   CTColor getAccent5();

   void setAccent5(CTColor var1);

   CTColor addNewAccent5();

   CTColor getAccent6();

   void setAccent6(CTColor var1);

   CTColor addNewAccent6();

   CTColor getHlink();

   void setHlink(CTColor var1);

   CTColor addNewHlink();

   CTColor getFolHlink();

   void setFolHlink(CTColor var1);

   CTColor addNewFolHlink();

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

      public static CTColorScheme newInstance() {
         return (CTColorScheme)POIXMLTypeLoader.newInstance(CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme newInstance(XmlOptions var0) {
         return (CTColorScheme)POIXMLTypeLoader.newInstance(CTColorScheme.type, var0);
      }

      public static CTColorScheme parse(String var0) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(File var0) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(URL var0) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(InputStream var0) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(Reader var0) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(XMLStreamReader var0) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(Node var0) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static CTColorScheme parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static CTColorScheme parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColorScheme)POIXMLTypeLoader.parse(var0, CTColorScheme.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorScheme.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorScheme.type, var1);
      }

   }
}
