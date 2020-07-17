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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang;
import org.w3c.dom.Node;

public interface CTLanguage extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLanguage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlanguage7b90type");


   Object getVal();

   STLang xgetVal();

   boolean isSetVal();

   void setVal(Object var1);

   void xsetVal(STLang var1);

   void unsetVal();

   Object getEastAsia();

   STLang xgetEastAsia();

   boolean isSetEastAsia();

   void setEastAsia(Object var1);

   void xsetEastAsia(STLang var1);

   void unsetEastAsia();

   Object getBidi();

   STLang xgetBidi();

   boolean isSetBidi();

   void setBidi(Object var1);

   void xsetBidi(STLang var1);

   void unsetBidi();


   public static final class Factory {

      public static CTLanguage newInstance() {
         return (CTLanguage)POIXMLTypeLoader.newInstance(CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage newInstance(XmlOptions var0) {
         return (CTLanguage)POIXMLTypeLoader.newInstance(CTLanguage.type, var0);
      }

      public static CTLanguage parse(String var0) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(File var0) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(URL var0) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(InputStream var0) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(Reader var0) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(XMLStreamReader var0) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(Node var0) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static CTLanguage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static CTLanguage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLanguage)POIXMLTypeLoader.parse(var0, CTLanguage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLanguage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLanguage.type, var1);
      }

   }
}
