package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation;
import org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation$Enum;
import org.w3c.dom.Node;

public interface CTPageSetup extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPageSetup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpagesetupdb38type");


   long getPaperSize();

   XmlUnsignedInt xgetPaperSize();

   boolean isSetPaperSize();

   void setPaperSize(long var1);

   void xsetPaperSize(XmlUnsignedInt var1);

   void unsetPaperSize();

   long getFirstPageNumber();

   XmlUnsignedInt xgetFirstPageNumber();

   boolean isSetFirstPageNumber();

   void setFirstPageNumber(long var1);

   void xsetFirstPageNumber(XmlUnsignedInt var1);

   void unsetFirstPageNumber();

   STPageSetupOrientation$Enum getOrientation();

   STPageSetupOrientation xgetOrientation();

   boolean isSetOrientation();

   void setOrientation(STPageSetupOrientation$Enum var1);

   void xsetOrientation(STPageSetupOrientation var1);

   void unsetOrientation();

   boolean getBlackAndWhite();

   XmlBoolean xgetBlackAndWhite();

   boolean isSetBlackAndWhite();

   void setBlackAndWhite(boolean var1);

   void xsetBlackAndWhite(XmlBoolean var1);

   void unsetBlackAndWhite();

   boolean getDraft();

   XmlBoolean xgetDraft();

   boolean isSetDraft();

   void setDraft(boolean var1);

   void xsetDraft(XmlBoolean var1);

   void unsetDraft();

   boolean getUseFirstPageNumber();

   XmlBoolean xgetUseFirstPageNumber();

   boolean isSetUseFirstPageNumber();

   void setUseFirstPageNumber(boolean var1);

   void xsetUseFirstPageNumber(XmlBoolean var1);

   void unsetUseFirstPageNumber();

   int getHorizontalDpi();

   XmlInt xgetHorizontalDpi();

   boolean isSetHorizontalDpi();

   void setHorizontalDpi(int var1);

   void xsetHorizontalDpi(XmlInt var1);

   void unsetHorizontalDpi();

   int getVerticalDpi();

   XmlInt xgetVerticalDpi();

   boolean isSetVerticalDpi();

   void setVerticalDpi(int var1);

   void xsetVerticalDpi(XmlInt var1);

   void unsetVerticalDpi();

   long getCopies();

   XmlUnsignedInt xgetCopies();

   boolean isSetCopies();

   void setCopies(long var1);

   void xsetCopies(XmlUnsignedInt var1);

   void unsetCopies();


   public static final class Factory {

      public static CTPageSetup newInstance() {
         return (CTPageSetup)POIXMLTypeLoader.newInstance(CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup newInstance(XmlOptions var0) {
         return (CTPageSetup)POIXMLTypeLoader.newInstance(CTPageSetup.type, var0);
      }

      public static CTPageSetup parse(String var0) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(File var0) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(URL var0) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(InputStream var0) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(Reader var0) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(XMLStreamReader var0) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(Node var0) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static CTPageSetup parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static CTPageSetup parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPageSetup)POIXMLTypeLoader.parse(var0, CTPageSetup.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageSetup.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageSetup.type, var1);
      }

   }
}
