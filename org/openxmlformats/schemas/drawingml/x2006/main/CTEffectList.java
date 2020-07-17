package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect;
import org.w3c.dom.Node;

public interface CTEffectList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEffectList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cteffectlist6featype");


   CTBlurEffect getBlur();

   boolean isSetBlur();

   void setBlur(CTBlurEffect var1);

   CTBlurEffect addNewBlur();

   void unsetBlur();

   CTFillOverlayEffect getFillOverlay();

   boolean isSetFillOverlay();

   void setFillOverlay(CTFillOverlayEffect var1);

   CTFillOverlayEffect addNewFillOverlay();

   void unsetFillOverlay();

   CTGlowEffect getGlow();

   boolean isSetGlow();

   void setGlow(CTGlowEffect var1);

   CTGlowEffect addNewGlow();

   void unsetGlow();

   CTInnerShadowEffect getInnerShdw();

   boolean isSetInnerShdw();

   void setInnerShdw(CTInnerShadowEffect var1);

   CTInnerShadowEffect addNewInnerShdw();

   void unsetInnerShdw();

   CTOuterShadowEffect getOuterShdw();

   boolean isSetOuterShdw();

   void setOuterShdw(CTOuterShadowEffect var1);

   CTOuterShadowEffect addNewOuterShdw();

   void unsetOuterShdw();

   CTPresetShadowEffect getPrstShdw();

   boolean isSetPrstShdw();

   void setPrstShdw(CTPresetShadowEffect var1);

   CTPresetShadowEffect addNewPrstShdw();

   void unsetPrstShdw();

   CTReflectionEffect getReflection();

   boolean isSetReflection();

   void setReflection(CTReflectionEffect var1);

   CTReflectionEffect addNewReflection();

   void unsetReflection();

   CTSoftEdgesEffect getSoftEdge();

   boolean isSetSoftEdge();

   void setSoftEdge(CTSoftEdgesEffect var1);

   CTSoftEdgesEffect addNewSoftEdge();

   void unsetSoftEdge();


   public static final class Factory {

      public static CTEffectList newInstance() {
         return (CTEffectList)POIXMLTypeLoader.newInstance(CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList newInstance(XmlOptions var0) {
         return (CTEffectList)POIXMLTypeLoader.newInstance(CTEffectList.type, var0);
      }

      public static CTEffectList parse(String var0) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(File var0) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(URL var0) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(InputStream var0) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(Reader var0) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(XMLStreamReader var0) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(Node var0) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static CTEffectList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static CTEffectList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEffectList)POIXMLTypeLoader.parse(var0, CTEffectList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectList.type, var1);
      }

   }
}
