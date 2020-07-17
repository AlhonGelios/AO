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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent;
import org.w3c.dom.Node;

public interface CTTextNormalAutofit extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextNormalAutofit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextnormalautofitbbdftype");


   int getFontScale();

   STTextFontScalePercent xgetFontScale();

   boolean isSetFontScale();

   void setFontScale(int var1);

   void xsetFontScale(STTextFontScalePercent var1);

   void unsetFontScale();

   int getLnSpcReduction();

   STTextSpacingPercent xgetLnSpcReduction();

   boolean isSetLnSpcReduction();

   void setLnSpcReduction(int var1);

   void xsetLnSpcReduction(STTextSpacingPercent var1);

   void unsetLnSpcReduction();


   public static final class Factory {

      public static CTTextNormalAutofit newInstance() {
         return (CTTextNormalAutofit)POIXMLTypeLoader.newInstance(CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit newInstance(XmlOptions var0) {
         return (CTTextNormalAutofit)POIXMLTypeLoader.newInstance(CTTextNormalAutofit.type, var0);
      }

      public static CTTextNormalAutofit parse(String var0) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(File var0) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(URL var0) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(InputStream var0) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(Reader var0) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(XMLStreamReader var0) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(Node var0) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static CTTextNormalAutofit parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static CTTextNormalAutofit parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextNormalAutofit)POIXMLTypeLoader.parse(var0, CTTextNormalAutofit.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextNormalAutofit.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextNormalAutofit.type, var1);
      }

   }
}
