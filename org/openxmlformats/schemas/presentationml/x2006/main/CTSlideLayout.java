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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType;
import org.w3c.dom.Node;

public interface CTSlideLayout extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidelayouteb34type");


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

   CTHeaderFooter getHf();

   boolean isSetHf();

   void setHf(CTHeaderFooter var1);

   CTHeaderFooter addNewHf();

   void unsetHf();

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

   String getMatchingName();

   XmlString xgetMatchingName();

   boolean isSetMatchingName();

   void setMatchingName(String var1);

   void xsetMatchingName(XmlString var1);

   void unsetMatchingName();

   STSlideLayoutType.Enum getType();

   STSlideLayoutType xgetType();

   boolean isSetType();

   void setType(STSlideLayoutType.Enum var1);

   void xsetType(STSlideLayoutType var1);

   void unsetType();

   boolean getPreserve();

   XmlBoolean xgetPreserve();

   boolean isSetPreserve();

   void setPreserve(boolean var1);

   void xsetPreserve(XmlBoolean var1);

   void unsetPreserve();

   boolean getUserDrawn();

   XmlBoolean xgetUserDrawn();

   boolean isSetUserDrawn();

   void setUserDrawn(boolean var1);

   void xsetUserDrawn(XmlBoolean var1);

   void unsetUserDrawn();


   public static final class Factory {

      public static CTSlideLayout newInstance() {
         return (CTSlideLayout)POIXMLTypeLoader.newInstance(CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout newInstance(XmlOptions var0) {
         return (CTSlideLayout)POIXMLTypeLoader.newInstance(CTSlideLayout.type, var0);
      }

      public static CTSlideLayout parse(String var0) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(File var0) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(URL var0) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(Reader var0) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(Node var0) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static CTSlideLayout parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static CTSlideLayout parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideLayout)POIXMLTypeLoader.parse(var0, CTSlideLayout.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideLayout.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideLayout.type, var1);
      }

   }
}
