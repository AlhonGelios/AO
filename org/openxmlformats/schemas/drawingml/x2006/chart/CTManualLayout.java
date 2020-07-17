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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget;
import org.w3c.dom.Node;

public interface CTManualLayout extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTManualLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmanuallayout872ctype");


   CTLayoutTarget getLayoutTarget();

   boolean isSetLayoutTarget();

   void setLayoutTarget(CTLayoutTarget var1);

   CTLayoutTarget addNewLayoutTarget();

   void unsetLayoutTarget();

   CTLayoutMode getXMode();

   boolean isSetXMode();

   void setXMode(CTLayoutMode var1);

   CTLayoutMode addNewXMode();

   void unsetXMode();

   CTLayoutMode getYMode();

   boolean isSetYMode();

   void setYMode(CTLayoutMode var1);

   CTLayoutMode addNewYMode();

   void unsetYMode();

   CTLayoutMode getWMode();

   boolean isSetWMode();

   void setWMode(CTLayoutMode var1);

   CTLayoutMode addNewWMode();

   void unsetWMode();

   CTLayoutMode getHMode();

   boolean isSetHMode();

   void setHMode(CTLayoutMode var1);

   CTLayoutMode addNewHMode();

   void unsetHMode();

   CTDouble getX();

   boolean isSetX();

   void setX(CTDouble var1);

   CTDouble addNewX();

   void unsetX();

   CTDouble getY();

   boolean isSetY();

   void setY(CTDouble var1);

   CTDouble addNewY();

   void unsetY();

   CTDouble getW();

   boolean isSetW();

   void setW(CTDouble var1);

   CTDouble addNewW();

   void unsetW();

   CTDouble getH();

   boolean isSetH();

   void setH(CTDouble var1);

   CTDouble addNewH();

   void unsetH();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTManualLayout newInstance() {
         return (CTManualLayout)POIXMLTypeLoader.newInstance(CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout newInstance(XmlOptions var0) {
         return (CTManualLayout)POIXMLTypeLoader.newInstance(CTManualLayout.type, var0);
      }

      public static CTManualLayout parse(String var0) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(String var0, XmlOptions var1) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(File var0) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(URL var0) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(InputStream var0) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(Reader var0) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(XMLStreamReader var0) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(Node var0) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static CTManualLayout parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static CTManualLayout parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTManualLayout)POIXMLTypeLoader.parse(var0, CTManualLayout.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTManualLayout.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTManualLayout.type, var1);
      }

   }
}
