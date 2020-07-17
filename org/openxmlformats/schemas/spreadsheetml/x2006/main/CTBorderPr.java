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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle;
import org.w3c.dom.Node;

public interface CTBorderPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBorderPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctborderpre497type");


   CTColor getColor();

   boolean isSetColor();

   void setColor(CTColor var1);

   CTColor addNewColor();

   void unsetColor();

   STBorderStyle.Enum getStyle();

   STBorderStyle xgetStyle();

   boolean isSetStyle();

   void setStyle(STBorderStyle.Enum var1);

   void xsetStyle(STBorderStyle var1);

   void unsetStyle();


   public static final class Factory {

      public static CTBorderPr newInstance() {
         return (CTBorderPr)POIXMLTypeLoader.newInstance(CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr newInstance(XmlOptions var0) {
         return (CTBorderPr)POIXMLTypeLoader.newInstance(CTBorderPr.type, var0);
      }

      public static CTBorderPr parse(String var0) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(File var0) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(URL var0) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(InputStream var0) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(Reader var0) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(XMLStreamReader var0) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(Node var0) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static CTBorderPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static CTBorderPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBorderPr)POIXMLTypeLoader.parse(var0, CTBorderPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorderPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorderPr.type, var1);
      }

   }
}
