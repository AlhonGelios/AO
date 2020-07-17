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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerSize;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.w3c.dom.Node;

public interface CTMarker extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMarker.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmarkera682type");


   CTMarkerStyle getSymbol();

   boolean isSetSymbol();

   void setSymbol(CTMarkerStyle var1);

   CTMarkerStyle addNewSymbol();

   void unsetSymbol();

   CTMarkerSize getSize();

   boolean isSetSize();

   void setSize(CTMarkerSize var1);

   CTMarkerSize addNewSize();

   void unsetSize();

   CTShapeProperties getSpPr();

   boolean isSetSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   void unsetSpPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTMarker newInstance() {
         return (CTMarker)POIXMLTypeLoader.newInstance(CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker newInstance(XmlOptions var0) {
         return (CTMarker)POIXMLTypeLoader.newInstance(CTMarker.type, var0);
      }

      public static CTMarker parse(String var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(File var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(URL var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(InputStream var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(Reader var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(XMLStreamReader var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(Node var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarker.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarker.type, var1);
      }

   }
}
