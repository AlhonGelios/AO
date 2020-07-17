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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTOutlinePr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOutlinePr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctoutlineprc483type");


   boolean getApplyStyles();

   XmlBoolean xgetApplyStyles();

   boolean isSetApplyStyles();

   void setApplyStyles(boolean var1);

   void xsetApplyStyles(XmlBoolean var1);

   void unsetApplyStyles();

   boolean getSummaryBelow();

   XmlBoolean xgetSummaryBelow();

   boolean isSetSummaryBelow();

   void setSummaryBelow(boolean var1);

   void xsetSummaryBelow(XmlBoolean var1);

   void unsetSummaryBelow();

   boolean getSummaryRight();

   XmlBoolean xgetSummaryRight();

   boolean isSetSummaryRight();

   void setSummaryRight(boolean var1);

   void xsetSummaryRight(XmlBoolean var1);

   void unsetSummaryRight();

   boolean getShowOutlineSymbols();

   XmlBoolean xgetShowOutlineSymbols();

   boolean isSetShowOutlineSymbols();

   void setShowOutlineSymbols(boolean var1);

   void xsetShowOutlineSymbols(XmlBoolean var1);

   void unsetShowOutlineSymbols();


   public static final class Factory {

      public static CTOutlinePr newInstance() {
         return (CTOutlinePr)POIXMLTypeLoader.newInstance(CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr newInstance(XmlOptions var0) {
         return (CTOutlinePr)POIXMLTypeLoader.newInstance(CTOutlinePr.type, var0);
      }

      public static CTOutlinePr parse(String var0) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(File var0) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(URL var0) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(InputStream var0) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(Reader var0) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(XMLStreamReader var0) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(Node var0) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static CTOutlinePr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static CTOutlinePr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOutlinePr)POIXMLTypeLoader.parse(var0, CTOutlinePr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOutlinePr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOutlinePr.type, var1);
      }

   }
}
