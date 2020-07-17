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
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList;
import org.w3c.dom.Node;

public interface CTCustomGeometry2D extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCustomGeometry2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcustomgeometry2dca70type");


   CTGeomGuideList getAvLst();

   boolean isSetAvLst();

   void setAvLst(CTGeomGuideList var1);

   CTGeomGuideList addNewAvLst();

   void unsetAvLst();

   CTGeomGuideList getGdLst();

   boolean isSetGdLst();

   void setGdLst(CTGeomGuideList var1);

   CTGeomGuideList addNewGdLst();

   void unsetGdLst();

   CTAdjustHandleList getAhLst();

   boolean isSetAhLst();

   void setAhLst(CTAdjustHandleList var1);

   CTAdjustHandleList addNewAhLst();

   void unsetAhLst();

   CTConnectionSiteList getCxnLst();

   boolean isSetCxnLst();

   void setCxnLst(CTConnectionSiteList var1);

   CTConnectionSiteList addNewCxnLst();

   void unsetCxnLst();

   CTGeomRect getRect();

   boolean isSetRect();

   void setRect(CTGeomRect var1);

   CTGeomRect addNewRect();

   void unsetRect();

   CTPath2DList getPathLst();

   void setPathLst(CTPath2DList var1);

   CTPath2DList addNewPathLst();


   public static final class Factory {

      public static CTCustomGeometry2D newInstance() {
         return (CTCustomGeometry2D)POIXMLTypeLoader.newInstance(CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D newInstance(XmlOptions var0) {
         return (CTCustomGeometry2D)POIXMLTypeLoader.newInstance(CTCustomGeometry2D.type, var0);
      }

      public static CTCustomGeometry2D parse(String var0) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(File var0) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(URL var0) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(InputStream var0) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(Reader var0) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(XMLStreamReader var0) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(Node var0) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static CTCustomGeometry2D parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static CTCustomGeometry2D parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCustomGeometry2D)POIXMLTypeLoader.parse(var0, CTCustomGeometry2D.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCustomGeometry2D.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCustomGeometry2D.type, var1);
      }

   }
}
