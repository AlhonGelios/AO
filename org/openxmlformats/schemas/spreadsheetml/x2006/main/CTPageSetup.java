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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError$Enum;
import org.w3c.dom.Node;

public interface CTPageSetup extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPageSetup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpagesetup534dtype");


   long getPaperSize();

   XmlUnsignedInt xgetPaperSize();

   boolean isSetPaperSize();

   void setPaperSize(long var1);

   void xsetPaperSize(XmlUnsignedInt var1);

   void unsetPaperSize();

   long getScale();

   XmlUnsignedInt xgetScale();

   boolean isSetScale();

   void setScale(long var1);

   void xsetScale(XmlUnsignedInt var1);

   void unsetScale();

   long getFirstPageNumber();

   XmlUnsignedInt xgetFirstPageNumber();

   boolean isSetFirstPageNumber();

   void setFirstPageNumber(long var1);

   void xsetFirstPageNumber(XmlUnsignedInt var1);

   void unsetFirstPageNumber();

   long getFitToWidth();

   XmlUnsignedInt xgetFitToWidth();

   boolean isSetFitToWidth();

   void setFitToWidth(long var1);

   void xsetFitToWidth(XmlUnsignedInt var1);

   void unsetFitToWidth();

   long getFitToHeight();

   XmlUnsignedInt xgetFitToHeight();

   boolean isSetFitToHeight();

   void setFitToHeight(long var1);

   void xsetFitToHeight(XmlUnsignedInt var1);

   void unsetFitToHeight();

   STPageOrder.Enum getPageOrder();

   STPageOrder xgetPageOrder();

   boolean isSetPageOrder();

   void setPageOrder(STPageOrder.Enum var1);

   void xsetPageOrder(STPageOrder var1);

   void unsetPageOrder();

   STOrientation.Enum getOrientation();

   STOrientation xgetOrientation();

   boolean isSetOrientation();

   void setOrientation(STOrientation.Enum var1);

   void xsetOrientation(STOrientation var1);

   void unsetOrientation();

   boolean getUsePrinterDefaults();

   XmlBoolean xgetUsePrinterDefaults();

   boolean isSetUsePrinterDefaults();

   void setUsePrinterDefaults(boolean var1);

   void xsetUsePrinterDefaults(XmlBoolean var1);

   void unsetUsePrinterDefaults();

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

   STCellComments.Enum getCellComments();

   STCellComments xgetCellComments();

   boolean isSetCellComments();

   void setCellComments(STCellComments.Enum var1);

   void xsetCellComments(STCellComments var1);

   void unsetCellComments();

   boolean getUseFirstPageNumber();

   XmlBoolean xgetUseFirstPageNumber();

   boolean isSetUseFirstPageNumber();

   void setUseFirstPageNumber(boolean var1);

   void xsetUseFirstPageNumber(XmlBoolean var1);

   void unsetUseFirstPageNumber();

   STPrintError$Enum getErrors();

   STPrintError xgetErrors();

   boolean isSetErrors();

   void setErrors(STPrintError$Enum var1);

   void xsetErrors(STPrintError var1);

   void unsetErrors();

   long getHorizontalDpi();

   XmlUnsignedInt xgetHorizontalDpi();

   boolean isSetHorizontalDpi();

   void setHorizontalDpi(long var1);

   void xsetHorizontalDpi(XmlUnsignedInt var1);

   void unsetHorizontalDpi();

   long getVerticalDpi();

   XmlUnsignedInt xgetVerticalDpi();

   boolean isSetVerticalDpi();

   void setVerticalDpi(long var1);

   void xsetVerticalDpi(XmlUnsignedInt var1);

   void unsetVerticalDpi();

   long getCopies();

   XmlUnsignedInt xgetCopies();

   boolean isSetCopies();

   void setCopies(long var1);

   void xsetCopies(XmlUnsignedInt var1);

   void unsetCopies();

   String getId();

   STRelationshipId xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);

   void unsetId();


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
