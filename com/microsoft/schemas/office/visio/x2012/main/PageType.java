package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.PageSheetType;
import com.microsoft.schemas.office.visio.x2012.main.RelType;
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
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface PageType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pagetype2fcatype");


   PageSheetType getPageSheet();

   boolean isSetPageSheet();

   void setPageSheet(PageSheetType var1);

   PageSheetType addNewPageSheet();

   void unsetPageSheet();

   RelType getRel();

   void setRel(RelType var1);

   RelType addNewRel();

   long getID();

   XmlUnsignedInt xgetID();

   void setID(long var1);

   void xsetID(XmlUnsignedInt var1);

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   String getNameU();

   XmlString xgetNameU();

   boolean isSetNameU();

   void setNameU(String var1);

   void xsetNameU(XmlString var1);

   void unsetNameU();

   boolean getIsCustomName();

   XmlBoolean xgetIsCustomName();

   boolean isSetIsCustomName();

   void setIsCustomName(boolean var1);

   void xsetIsCustomName(XmlBoolean var1);

   void unsetIsCustomName();

   boolean getIsCustomNameU();

   XmlBoolean xgetIsCustomNameU();

   boolean isSetIsCustomNameU();

   void setIsCustomNameU(boolean var1);

   void xsetIsCustomNameU(XmlBoolean var1);

   void unsetIsCustomNameU();

   boolean getBackground();

   XmlBoolean xgetBackground();

   boolean isSetBackground();

   void setBackground(boolean var1);

   void xsetBackground(XmlBoolean var1);

   void unsetBackground();

   long getBackPage();

   XmlUnsignedInt xgetBackPage();

   boolean isSetBackPage();

   void setBackPage(long var1);

   void xsetBackPage(XmlUnsignedInt var1);

   void unsetBackPage();

   double getViewScale();

   XmlDouble xgetViewScale();

   boolean isSetViewScale();

   void setViewScale(double var1);

   void xsetViewScale(XmlDouble var1);

   void unsetViewScale();

   double getViewCenterX();

   XmlDouble xgetViewCenterX();

   boolean isSetViewCenterX();

   void setViewCenterX(double var1);

   void xsetViewCenterX(XmlDouble var1);

   void unsetViewCenterX();

   double getViewCenterY();

   XmlDouble xgetViewCenterY();

   boolean isSetViewCenterY();

   void setViewCenterY(double var1);

   void xsetViewCenterY(XmlDouble var1);

   void unsetViewCenterY();

   long getReviewerID();

   XmlUnsignedInt xgetReviewerID();

   boolean isSetReviewerID();

   void setReviewerID(long var1);

   void xsetReviewerID(XmlUnsignedInt var1);

   void unsetReviewerID();

   long getAssociatedPage();

   XmlUnsignedInt xgetAssociatedPage();

   boolean isSetAssociatedPage();

   void setAssociatedPage(long var1);

   void xsetAssociatedPage(XmlUnsignedInt var1);

   void unsetAssociatedPage();


   public static final class Factory {

      public static PageType newInstance() {
         return (PageType)POIXMLTypeLoader.newInstance(PageType.type, (XmlOptions)null);
      }

      public static PageType newInstance(XmlOptions var0) {
         return (PageType)POIXMLTypeLoader.newInstance(PageType.type, var0);
      }

      public static PageType parse(String var0) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(String var0, XmlOptions var1) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(File var0) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(URL var0) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(InputStream var0) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(Reader var0) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(XMLStreamReader var0) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(Node var0) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(Node var0, XmlOptions var1) throws XmlException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static PageType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, (XmlOptions)null);
      }

      public static PageType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PageType)POIXMLTypeLoader.parse(var0, PageType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageType.type, var1);
      }

   }
}
