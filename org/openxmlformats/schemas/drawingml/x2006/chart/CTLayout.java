package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout;
import org.w3c.dom.Node;

public interface CTLayout extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlayout3192type");


   CTManualLayout getManualLayout();

   boolean isSetManualLayout();

   void setManualLayout(CTManualLayout var1);

   CTManualLayout addNewManualLayout();

   void unsetManualLayout();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTLayout newInstance() {
         return (CTLayout)POIXMLTypeLoader.newInstance(CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout newInstance(XmlOptions var0) {
         return (CTLayout)POIXMLTypeLoader.newInstance(CTLayout.type, var0);
      }

      public static CTLayout parse(String var0) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(File var0) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(URL var0) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(InputStream var0) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(Reader var0) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(XMLStreamReader var0) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(Node var0) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static CTLayout parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, (XmlOptions)null);
      }

      public static CTLayout parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLayout)POIXMLTypeLoader.parse(var0, CTLayout.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLayout.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLayout.type, var1);
      }

   }
}
