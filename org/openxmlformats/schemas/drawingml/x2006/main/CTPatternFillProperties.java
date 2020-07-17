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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal.Enum;
import org.w3c.dom.Node;

public interface CTPatternFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPatternFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpatternfillproperties3637type");


   CTColor getFgClr();

   boolean isSetFgClr();

   void setFgClr(CTColor var1);

   CTColor addNewFgClr();

   void unsetFgClr();

   CTColor getBgClr();

   boolean isSetBgClr();

   void setBgClr(CTColor var1);

   CTColor addNewBgClr();

   void unsetBgClr();

   Enum getPrst();

   STPresetPatternVal xgetPrst();

   boolean isSetPrst();

   void setPrst(Enum var1);

   void xsetPrst(STPresetPatternVal var1);

   void unsetPrst();


   public static final class Factory {

      public static CTPatternFillProperties newInstance() {
         return (CTPatternFillProperties)POIXMLTypeLoader.newInstance(CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties newInstance(XmlOptions var0) {
         return (CTPatternFillProperties)POIXMLTypeLoader.newInstance(CTPatternFillProperties.type, var0);
      }

      public static CTPatternFillProperties parse(String var0) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(File var0) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(Node var0) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static CTPatternFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static CTPatternFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPatternFillProperties)POIXMLTypeLoader.parse(var0, CTPatternFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPatternFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPatternFillProperties.type, var1);
      }

   }
}
