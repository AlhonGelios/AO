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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex;
import org.w3c.dom.Node;

public interface CTColorMapping extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColorMapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolormapping5bc6type");


   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   STColorSchemeIndex.Enum getBg1();

   STColorSchemeIndex xgetBg1();

   void setBg1(STColorSchemeIndex.Enum var1);

   void xsetBg1(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getTx1();

   STColorSchemeIndex xgetTx1();

   void setTx1(STColorSchemeIndex.Enum var1);

   void xsetTx1(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getBg2();

   STColorSchemeIndex xgetBg2();

   void setBg2(STColorSchemeIndex.Enum var1);

   void xsetBg2(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getTx2();

   STColorSchemeIndex xgetTx2();

   void setTx2(STColorSchemeIndex.Enum var1);

   void xsetTx2(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent1();

   STColorSchemeIndex xgetAccent1();

   void setAccent1(STColorSchemeIndex.Enum var1);

   void xsetAccent1(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent2();

   STColorSchemeIndex xgetAccent2();

   void setAccent2(STColorSchemeIndex.Enum var1);

   void xsetAccent2(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent3();

   STColorSchemeIndex xgetAccent3();

   void setAccent3(STColorSchemeIndex.Enum var1);

   void xsetAccent3(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent4();

   STColorSchemeIndex xgetAccent4();

   void setAccent4(STColorSchemeIndex.Enum var1);

   void xsetAccent4(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent5();

   STColorSchemeIndex xgetAccent5();

   void setAccent5(STColorSchemeIndex.Enum var1);

   void xsetAccent5(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getAccent6();

   STColorSchemeIndex xgetAccent6();

   void setAccent6(STColorSchemeIndex.Enum var1);

   void xsetAccent6(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getHlink();

   STColorSchemeIndex xgetHlink();

   void setHlink(STColorSchemeIndex.Enum var1);

   void xsetHlink(STColorSchemeIndex var1);

   STColorSchemeIndex.Enum getFolHlink();

   STColorSchemeIndex xgetFolHlink();

   void setFolHlink(STColorSchemeIndex.Enum var1);

   void xsetFolHlink(STColorSchemeIndex var1);


   public static final class Factory {

      public static CTColorMapping newInstance() {
         return (CTColorMapping)POIXMLTypeLoader.newInstance(CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping newInstance(XmlOptions var0) {
         return (CTColorMapping)POIXMLTypeLoader.newInstance(CTColorMapping.type, var0);
      }

      public static CTColorMapping parse(String var0) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(File var0) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(URL var0) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(InputStream var0) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(Reader var0) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(XMLStreamReader var0) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(Node var0) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static CTColorMapping parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static CTColorMapping parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColorMapping)POIXMLTypeLoader.parse(var0, CTColorMapping.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorMapping.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorMapping.type, var1);
      }

   }
}
