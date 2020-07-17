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

public interface CTXmlColumnPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTXmlColumnPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctxmlcolumnprc14etype");


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

   boolean getDenormalized();

   XmlBoolean xgetDenormalized();

   boolean isSetDenormalized();

   void setDenormalized(boolean var1);

   void xsetDenormalized(XmlBoolean var1);

   void unsetDenormalized();

   STXmlDataType.Enum getXmlDataType();

   STXmlDataType xgetXmlDataType();

   void setXmlDataType(STXmlDataType.Enum var1);

   void xsetXmlDataType(STXmlDataType var1);


   public static final class Factory {

      public static CTXmlColumnPr newInstance() {
         return (CTXmlColumnPr)POIXMLTypeLoader.newInstance(CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr newInstance(XmlOptions var0) {
         return (CTXmlColumnPr)POIXMLTypeLoader.newInstance(CTXmlColumnPr.type, var0);
      }

      public static CTXmlColumnPr parse(String var0) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(File var0) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(URL var0) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(InputStream var0) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(Reader var0) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(XMLStreamReader var0) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(Node var0) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static CTXmlColumnPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static CTXmlColumnPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTXmlColumnPr)POIXMLTypeLoader.parse(var0, CTXmlColumnPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlColumnPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlColumnPr.type, var1);
      }

   }
}
