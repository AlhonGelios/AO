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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;
import org.w3c.dom.Node;

public interface CTPresetGeometry2D extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPresetGeometry2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpresetgeometry2db1detype");


   CTGeomGuideList getAvLst();

   boolean isSetAvLst();

   void setAvLst(CTGeomGuideList var1);

   CTGeomGuideList addNewAvLst();

   void unsetAvLst();

   STShapeType.Enum getPrst();

   STShapeType xgetPrst();

   void setPrst(STShapeType.Enum var1);

   void xsetPrst(STShapeType var1);


   public static final class Factory {

      public static CTPresetGeometry2D newInstance() {
         return (CTPresetGeometry2D)POIXMLTypeLoader.newInstance(CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D newInstance(XmlOptions var0) {
         return (CTPresetGeometry2D)POIXMLTypeLoader.newInstance(CTPresetGeometry2D.type, var0);
      }

      public static CTPresetGeometry2D parse(String var0) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(File var0) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(URL var0) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(InputStream var0) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(Reader var0) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(XMLStreamReader var0) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(Node var0) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static CTPresetGeometry2D parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static CTPresetGeometry2D parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPresetGeometry2D)POIXMLTypeLoader.parse(var0, CTPresetGeometry2D.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPresetGeometry2D.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPresetGeometry2D.type, var1);
      }

   }
}
