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
import org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage;
import org.w3c.dom.Node;

public interface CTAlphaModulateFixedEffect extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAlphaModulateFixedEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctalphamodulatefixedeffect9769type");


   int getAmt();

   STPositivePercentage xgetAmt();

   boolean isSetAmt();

   void setAmt(int var1);

   void xsetAmt(STPositivePercentage var1);

   void unsetAmt();


   public static final class Factory {

      public static CTAlphaModulateFixedEffect newInstance() {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.newInstance(CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect newInstance(XmlOptions var0) {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.newInstance(CTAlphaModulateFixedEffect.type, var0);
      }

      public static CTAlphaModulateFixedEffect parse(String var0) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(File var0) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(URL var0) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(InputStream var0) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(Reader var0) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(XMLStreamReader var0) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(Node var0) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static CTAlphaModulateFixedEffect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static CTAlphaModulateFixedEffect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAlphaModulateFixedEffect)POIXMLTypeLoader.parse(var0, CTAlphaModulateFixedEffect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAlphaModulateFixedEffect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAlphaModulateFixedEffect.type, var1);
      }

   }
}
