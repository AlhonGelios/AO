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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType$Enum;
import org.w3c.dom.Node;

public interface CTPhoneticPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPhoneticPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctphoneticpr898btype");


   long getFontId();

   STFontId xgetFontId();

   void setFontId(long var1);

   void xsetFontId(STFontId var1);

   STPhoneticType$Enum getType();

   STPhoneticType xgetType();

   boolean isSetType();

   void setType(STPhoneticType$Enum var1);

   void xsetType(STPhoneticType var1);

   void unsetType();

   STPhoneticAlignment$Enum getAlignment();

   STPhoneticAlignment xgetAlignment();

   boolean isSetAlignment();

   void setAlignment(STPhoneticAlignment$Enum var1);

   void xsetAlignment(STPhoneticAlignment var1);

   void unsetAlignment();


   public static final class Factory {

      public static CTPhoneticPr newInstance() {
         return (CTPhoneticPr)POIXMLTypeLoader.newInstance(CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr newInstance(XmlOptions var0) {
         return (CTPhoneticPr)POIXMLTypeLoader.newInstance(CTPhoneticPr.type, var0);
      }

      public static CTPhoneticPr parse(String var0) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(File var0) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(URL var0) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(InputStream var0) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(Reader var0) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(XMLStreamReader var0) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(Node var0) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static CTPhoneticPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static CTPhoneticPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPhoneticPr)POIXMLTypeLoader.parse(var0, CTPhoneticPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPhoneticPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPhoneticPr.type, var1);
      }

   }
}
