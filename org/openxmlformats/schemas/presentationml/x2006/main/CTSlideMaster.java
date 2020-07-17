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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;
import org.w3c.dom.Node;

public interface CTSlideMaster extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideMaster.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidemasterd8fctype");


   CTCommonSlideData getCSld();

   void setCSld(CTCommonSlideData var1);

   CTCommonSlideData addNewCSld();

   CTColorMapping getClrMap();

   void setClrMap(CTColorMapping var1);

   CTColorMapping addNewClrMap();

   CTSlideLayoutIdList getSldLayoutIdLst();

   boolean isSetSldLayoutIdLst();

   void setSldLayoutIdLst(CTSlideLayoutIdList var1);

   CTSlideLayoutIdList addNewSldLayoutIdLst();

   void unsetSldLayoutIdLst();

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

   CTSlideMasterTextStyles getTxStyles();

   boolean isSetTxStyles();

   void setTxStyles(CTSlideMasterTextStyles var1);

   CTSlideMasterTextStyles addNewTxStyles();

   void unsetTxStyles();

   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();

   boolean getPreserve();

   XmlBoolean xgetPreserve();

   boolean isSetPreserve();

   void setPreserve(boolean var1);

   void xsetPreserve(XmlBoolean var1);

   void unsetPreserve();


   public static final class Factory {

      public static CTSlideMaster newInstance() {
         return (CTSlideMaster)POIXMLTypeLoader.newInstance(CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster newInstance(XmlOptions var0) {
         return (CTSlideMaster)POIXMLTypeLoader.newInstance(CTSlideMaster.type, var0);
      }

      public static CTSlideMaster parse(String var0) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(File var0) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(URL var0) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(Reader var0) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(Node var0) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static CTSlideMaster parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static CTSlideMaster parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideMaster)POIXMLTypeLoader.parse(var0, CTSlideMaster.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMaster.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMaster.type, var1);
      }

   }
}
