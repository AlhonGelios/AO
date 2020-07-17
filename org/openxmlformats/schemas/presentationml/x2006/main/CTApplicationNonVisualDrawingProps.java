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
import org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.w3c.dom.Node;

public interface CTApplicationNonVisualDrawingProps extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTApplicationNonVisualDrawingProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctapplicationnonvisualdrawingprops2fb6type");


   CTPlaceholder getPh();

   boolean isSetPh();

   void setPh(CTPlaceholder var1);

   CTPlaceholder addNewPh();

   void unsetPh();

   CTAudioCD getAudioCd();

   boolean isSetAudioCd();

   void setAudioCd(CTAudioCD var1);

   CTAudioCD addNewAudioCd();

   void unsetAudioCd();

   CTEmbeddedWAVAudioFile getWavAudioFile();

   boolean isSetWavAudioFile();

   void setWavAudioFile(CTEmbeddedWAVAudioFile var1);

   CTEmbeddedWAVAudioFile addNewWavAudioFile();

   void unsetWavAudioFile();

   CTAudioFile getAudioFile();

   boolean isSetAudioFile();

   void setAudioFile(CTAudioFile var1);

   CTAudioFile addNewAudioFile();

   void unsetAudioFile();

   CTVideoFile getVideoFile();

   boolean isSetVideoFile();

   void setVideoFile(CTVideoFile var1);

   CTVideoFile addNewVideoFile();

   void unsetVideoFile();

   CTQuickTimeFile getQuickTimeFile();

   boolean isSetQuickTimeFile();

   void setQuickTimeFile(CTQuickTimeFile var1);

   CTQuickTimeFile addNewQuickTimeFile();

   void unsetQuickTimeFile();

   CTCustomerDataList getCustDataLst();

   boolean isSetCustDataLst();

   void setCustDataLst(CTCustomerDataList var1);

   CTCustomerDataList addNewCustDataLst();

   void unsetCustDataLst();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getIsPhoto();

   XmlBoolean xgetIsPhoto();

   boolean isSetIsPhoto();

   void setIsPhoto(boolean var1);

   void xsetIsPhoto(XmlBoolean var1);

   void unsetIsPhoto();

   boolean getUserDrawn();

   XmlBoolean xgetUserDrawn();

   boolean isSetUserDrawn();

   void setUserDrawn(boolean var1);

   void xsetUserDrawn(XmlBoolean var1);

   void unsetUserDrawn();


   public static final class Factory {

      public static CTApplicationNonVisualDrawingProps newInstance() {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.newInstance(CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps newInstance(XmlOptions var0) {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.newInstance(CTApplicationNonVisualDrawingProps.type, var0);
      }

      public static CTApplicationNonVisualDrawingProps parse(String var0) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(String var0, XmlOptions var1) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(File var0) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(URL var0) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(InputStream var0) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(Reader var0) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(XMLStreamReader var0) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(Node var0) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static CTApplicationNonVisualDrawingProps parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTApplicationNonVisualDrawingProps parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTApplicationNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTApplicationNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTApplicationNonVisualDrawingProps.type, var1);
      }

   }
}
