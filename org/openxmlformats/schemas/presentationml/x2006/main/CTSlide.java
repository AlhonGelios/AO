package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;
import org.w3c.dom.Node;

public interface CTSlide extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslided7betype");


   CTCommonSlideData getCSld();

   void setCSld(CTCommonSlideData var1);

   CTCommonSlideData addNewCSld();

   CTColorMappingOverride getClrMapOvr();

   boolean isSetClrMapOvr();

   void setClrMapOvr(CTColorMappingOverride var1);

   CTColorMappingOverride addNewClrMapOvr();

   void unsetClrMapOvr();

   CTSlideTransition getTransition();

   boolean isSetTransition();

   void setTransition(CTSlideTransition var1);

   CTSlideTransition addNewTransition();

   void unsetTransition();

   CTSlideTiming getTiming();

   boolean isSetTiming();

   void setTiming(CTSlideTiming var1);

   CTSlideTiming addNewTiming();

   void unsetTiming();

   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();

   boolean getShowMasterSp();

   XmlBoolean xgetShowMasterSp();

   boolean isSetShowMasterSp();

   void setShowMasterSp(boolean var1);

   void xsetShowMasterSp(XmlBoolean var1);

   void unsetShowMasterSp();

   boolean getShowMasterPhAnim();

   XmlBoolean xgetShowMasterPhAnim();

   boolean isSetShowMasterPhAnim();

   void setShowMasterPhAnim(boolean var1);

   void xsetShowMasterPhAnim(XmlBoolean var1);

   void unsetShowMasterPhAnim();

   boolean getShow();

   XmlBoolean xgetShow();

   boolean isSetShow();

   void setShow(boolean var1);

   void xsetShow(XmlBoolean var1);

   void unsetShow();


   public static final class Factory {

      public static CTSlide newInstance() {
         return (CTSlide)POIXMLTypeLoader.newInstance(CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide newInstance(XmlOptions var0) {
         return (CTSlide)POIXMLTypeLoader.newInstance(CTSlide.type, var0);
      }

      public static CTSlide parse(String var0) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(File var0) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(URL var0) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(InputStream var0) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(Reader var0) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(XMLStreamReader var0) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(Node var0) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static CTSlide parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, (XmlOptions)null);
      }

      public static CTSlide parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlide)POIXMLTypeLoader.parse(var0, CTSlide.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlide.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlide.type, var1);
      }

   }
}
