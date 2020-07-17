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
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.w3c.dom.Node;

public interface CTFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfillproperties2371type");


   CTNoFillProperties getNoFill();

   boolean isSetNoFill();

   void setNoFill(CTNoFillProperties var1);

   CTNoFillProperties addNewNoFill();

   void unsetNoFill();

   CTSolidColorFillProperties getSolidFill();

   boolean isSetSolidFill();

   void setSolidFill(CTSolidColorFillProperties var1);

   CTSolidColorFillProperties addNewSolidFill();

   void unsetSolidFill();

   CTGradientFillProperties getGradFill();

   boolean isSetGradFill();

   void setGradFill(CTGradientFillProperties var1);

   CTGradientFillProperties addNewGradFill();

   void unsetGradFill();

   CTBlipFillProperties getBlipFill();

   boolean isSetBlipFill();

   void setBlipFill(CTBlipFillProperties var1);

   CTBlipFillProperties addNewBlipFill();

   void unsetBlipFill();

   CTPatternFillProperties getPattFill();

   boolean isSetPattFill();

   void setPattFill(CTPatternFillProperties var1);

   CTPatternFillProperties addNewPattFill();

   void unsetPattFill();

   CTGroupFillProperties getGrpFill();

   boolean isSetGrpFill();

   void setGrpFill(CTGroupFillProperties var1);

   CTGroupFillProperties addNewGrpFill();

   void unsetGrpFill();


   public static final class Factory {

      public static CTFillProperties newInstance() {
         return (CTFillProperties)POIXMLTypeLoader.newInstance(CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties newInstance(XmlOptions var0) {
         return (CTFillProperties)POIXMLTypeLoader.newInstance(CTFillProperties.type, var0);
      }

      public static CTFillProperties parse(String var0) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(File var0) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(Node var0) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static CTFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static CTFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFillProperties)POIXMLTypeLoader.parse(var0, CTFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFillProperties.type, var1);
      }

   }
}
