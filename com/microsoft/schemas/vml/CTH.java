package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.STTrueFalse;
import com.microsoft.schemas.vml.STTrueFalseBlank;
import com.microsoft.schemas.vml.STTrueFalseBlank$Enum;
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

public interface CTH extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTH.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cth4cbctype");


   String getPosition();

   XmlString xgetPosition();

   boolean isSetPosition();

   void setPosition(String var1);

   void xsetPosition(XmlString var1);

   void unsetPosition();

   String getPolar();

   XmlString xgetPolar();

   boolean isSetPolar();

   void setPolar(String var1);

   void xsetPolar(XmlString var1);

   void unsetPolar();

   String getMap();

   XmlString xgetMap();

   boolean isSetMap();

   void setMap(String var1);

   void xsetMap(XmlString var1);

   void unsetMap();

   STTrueFalse.Enum getInvx();

   STTrueFalse xgetInvx();

   boolean isSetInvx();

   void setInvx(STTrueFalse.Enum var1);

   void xsetInvx(STTrueFalse var1);

   void unsetInvx();

   STTrueFalse.Enum getInvy();

   STTrueFalse xgetInvy();

   boolean isSetInvy();

   void setInvy(STTrueFalse.Enum var1);

   void xsetInvy(STTrueFalse var1);

   void unsetInvy();

   STTrueFalseBlank$Enum getSwitch();

   STTrueFalseBlank xgetSwitch();

   boolean isSetSwitch();

   void setSwitch(STTrueFalseBlank$Enum var1);

   void xsetSwitch(STTrueFalseBlank var1);

   void unsetSwitch();

   String getXrange();

   XmlString xgetXrange();

   boolean isSetXrange();

   void setXrange(String var1);

   void xsetXrange(XmlString var1);

   void unsetXrange();

   String getYrange();

   XmlString xgetYrange();

   boolean isSetYrange();

   void setYrange(String var1);

   void xsetYrange(XmlString var1);

   void unsetYrange();

   String getRadiusrange();

   XmlString xgetRadiusrange();

   boolean isSetRadiusrange();

   void setRadiusrange(String var1);

   void xsetRadiusrange(XmlString var1);

   void unsetRadiusrange();


   public static final class Factory {

      public static CTH newInstance() {
         return (CTH)POIXMLTypeLoader.newInstance(CTH.type, (XmlOptions)null);
      }

      public static CTH newInstance(XmlOptions var0) {
         return (CTH)POIXMLTypeLoader.newInstance(CTH.type, var0);
      }

      public static CTH parse(String var0) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(String var0, XmlOptions var1) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(File var0) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(URL var0) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(InputStream var0) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(Reader var0) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(XMLStreamReader var0) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(Node var0) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static CTH parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, (XmlOptions)null);
      }

      public static CTH parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTH)POIXMLTypeLoader.parse(var0, CTH.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTH.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTH.type, var1);
      }

   }
}
