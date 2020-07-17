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
import org.w3c.dom.Node;

public interface CTNotesSlide extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNotesSlide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnotesslideab75type");


   CTCommonSlideData getCSld();

   void setCSld(CTCommonSlideData var1);

   CTCommonSlideData addNewCSld();

   CTColorMappingOverride getClrMapOvr();

   boolean isSetClrMapOvr();

   void setClrMapOvr(CTColorMappingOverride var1);

   CTColorMappingOverride addNewClrMapOvr();

   void unsetClrMapOvr();

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


   public static final class Factory {

      public static CTNotesSlide newInstance() {
         return (CTNotesSlide)POIXMLTypeLoader.newInstance(CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide newInstance(XmlOptions var0) {
         return (CTNotesSlide)POIXMLTypeLoader.newInstance(CTNotesSlide.type, var0);
      }

      public static CTNotesSlide parse(String var0) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(File var0) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(URL var0) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(InputStream var0) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(Reader var0) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(XMLStreamReader var0) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(Node var0) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static CTNotesSlide parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static CTNotesSlide parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNotesSlide)POIXMLTypeLoader.parse(var0, CTNotesSlide.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesSlide.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNotesSlide.type, var1);
      }

   }
}
