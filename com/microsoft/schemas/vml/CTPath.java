package com.microsoft.schemas.vml;

import com.microsoft.schemas.office.office.STConnectType;
import com.microsoft.schemas.vml.STTrueFalse;
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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTPath extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath5963type");


   String getId();

   XmlString xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlString var1);

   void unsetId();

   String getV();

   XmlString xgetV();

   boolean isSetV();

   void setV(String var1);

   void xsetV(XmlString var1);

   void unsetV();

   String getLimo();

   XmlString xgetLimo();

   boolean isSetLimo();

   void setLimo(String var1);

   void xsetLimo(XmlString var1);

   void unsetLimo();

   String getTextboxrect();

   XmlString xgetTextboxrect();

   boolean isSetTextboxrect();

   void setTextboxrect(String var1);

   void xsetTextboxrect(XmlString var1);

   void unsetTextboxrect();

   STTrueFalse.Enum getFillok();

   STTrueFalse xgetFillok();

   boolean isSetFillok();

   void setFillok(STTrueFalse.Enum var1);

   void xsetFillok(STTrueFalse var1);

   void unsetFillok();

   STTrueFalse.Enum getStrokeok();

   STTrueFalse xgetStrokeok();

   boolean isSetStrokeok();

   void setStrokeok(STTrueFalse.Enum var1);

   void xsetStrokeok(STTrueFalse var1);

   void unsetStrokeok();

   STTrueFalse.Enum getShadowok();

   STTrueFalse xgetShadowok();

   boolean isSetShadowok();

   void setShadowok(STTrueFalse.Enum var1);

   void xsetShadowok(STTrueFalse var1);

   void unsetShadowok();

   STTrueFalse.Enum getArrowok();

   STTrueFalse xgetArrowok();

   boolean isSetArrowok();

   void setArrowok(STTrueFalse.Enum var1);

   void xsetArrowok(STTrueFalse var1);

   void unsetArrowok();

   STTrueFalse.Enum getGradientshapeok();

   STTrueFalse xgetGradientshapeok();

   boolean isSetGradientshapeok();

   void setGradientshapeok(STTrueFalse.Enum var1);

   void xsetGradientshapeok(STTrueFalse var1);

   void unsetGradientshapeok();

   STTrueFalse.Enum getTextpathok();

   STTrueFalse xgetTextpathok();

   boolean isSetTextpathok();

   void setTextpathok(STTrueFalse.Enum var1);

   void xsetTextpathok(STTrueFalse var1);

   void unsetTextpathok();

   STTrueFalse.Enum getInsetpenok();

   STTrueFalse xgetInsetpenok();

   boolean isSetInsetpenok();

   void setInsetpenok(STTrueFalse.Enum var1);

   void xsetInsetpenok(STTrueFalse var1);

   void unsetInsetpenok();

   STConnectType.Enum getConnecttype();

   STConnectType xgetConnecttype();

   boolean isSetConnecttype();

   void setConnecttype(STConnectType.Enum var1);

   void xsetConnecttype(STConnectType var1);

   void unsetConnecttype();

   String getConnectlocs();

   XmlString xgetConnectlocs();

   boolean isSetConnectlocs();

   void setConnectlocs(String var1);

   void xsetConnectlocs(XmlString var1);

   void unsetConnectlocs();

   String getConnectangles();

   XmlString xgetConnectangles();

   boolean isSetConnectangles();

   void setConnectangles(String var1);

   void xsetConnectangles(XmlString var1);

   void unsetConnectangles();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getExtrusionok();

   com.microsoft.schemas.office.office.STTrueFalse xgetExtrusionok();

   boolean isSetExtrusionok();

   void setExtrusionok(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetExtrusionok(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetExtrusionok();


   public static final class Factory {

      public static CTPath newInstance() {
         return (CTPath)POIXMLTypeLoader.newInstance(CTPath.type, (XmlOptions)null);
      }

      public static CTPath newInstance(XmlOptions var0) {
         return (CTPath)POIXMLTypeLoader.newInstance(CTPath.type, var0);
      }

      public static CTPath parse(String var0) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(File var0) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(URL var0) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(InputStream var0) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(Reader var0) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(XMLStreamReader var0) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(Node var0) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static CTPath parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, (XmlOptions)null);
      }

      public static CTPath parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath)POIXMLTypeLoader.parse(var0, CTPath.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath.type, var1);
      }

   }
}
