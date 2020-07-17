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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STAngle;
import org.w3c.dom.Node;

public interface CTGroupTransform2D extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroupTransform2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgrouptransform2d411atype");


   CTPoint2D getOff();

   boolean isSetOff();

   void setOff(CTPoint2D var1);

   CTPoint2D addNewOff();

   void unsetOff();

   CTPositiveSize2D getExt();

   boolean isSetExt();

   void setExt(CTPositiveSize2D var1);

   CTPositiveSize2D addNewExt();

   void unsetExt();

   CTPoint2D getChOff();

   boolean isSetChOff();

   void setChOff(CTPoint2D var1);

   CTPoint2D addNewChOff();

   void unsetChOff();

   CTPositiveSize2D getChExt();

   boolean isSetChExt();

   void setChExt(CTPositiveSize2D var1);

   CTPositiveSize2D addNewChExt();

   void unsetChExt();

   int getRot();

   STAngle xgetRot();

   boolean isSetRot();

   void setRot(int var1);

   void xsetRot(STAngle var1);

   void unsetRot();

   boolean getFlipH();

   XmlBoolean xgetFlipH();

   boolean isSetFlipH();

   void setFlipH(boolean var1);

   void xsetFlipH(XmlBoolean var1);

   void unsetFlipH();

   boolean getFlipV();

   XmlBoolean xgetFlipV();

   boolean isSetFlipV();

   void setFlipV(boolean var1);

   void xsetFlipV(XmlBoolean var1);

   void unsetFlipV();


   public static final class Factory {

      public static CTGroupTransform2D newInstance() {
         return (CTGroupTransform2D)POIXMLTypeLoader.newInstance(CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D newInstance(XmlOptions var0) {
         return (CTGroupTransform2D)POIXMLTypeLoader.newInstance(CTGroupTransform2D.type, var0);
      }

      public static CTGroupTransform2D parse(String var0) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(File var0) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(URL var0) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(InputStream var0) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(Reader var0) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(XMLStreamReader var0) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(Node var0) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static CTGroupTransform2D parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static CTGroupTransform2D parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroupTransform2D)POIXMLTypeLoader.parse(var0, CTGroupTransform2D.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupTransform2D.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupTransform2D.type, var1);
      }

   }
}
