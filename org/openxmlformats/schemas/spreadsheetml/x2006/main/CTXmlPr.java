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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTXmlPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTXmlPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctxmlpr2c58type");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getMapId();

   XmlUnsignedInt xgetMapId();

   void setMapId(long var1);

   void xsetMapId(XmlUnsignedInt var1);

   String getXpath();

   STXstring xgetXpath();

   void setXpath(String var1);

   void xsetXpath(STXstring var1);

   STXmlDataType.Enum getXmlDataType();

   STXmlDataType xgetXmlDataType();

   void setXmlDataType(STXmlDataType.Enum var1);

   void xsetXmlDataType(STXmlDataType var1);


   public static final class Factory {

      public static CTXmlPr newInstance() {
         return (CTXmlPr)POIXMLTypeLoader.newInstance(CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr newInstance(XmlOptions var0) {
         return (CTXmlPr)POIXMLTypeLoader.newInstance(CTXmlPr.type, var0);
      }

      public static CTXmlPr parse(String var0) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(File var0) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(URL var0) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(InputStream var0) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(Reader var0) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(XMLStreamReader var0) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(Node var0) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static CTXmlPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static CTXmlPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTXmlPr)POIXMLTypeLoader.parse(var0, CTXmlPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlPr.type, var1);
      }

   }
}
