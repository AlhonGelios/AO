package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
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
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode$Enum;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;
import org.w3c.dom.Node;

public interface CTPath2D extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath2d73d2type");


   List getCloseList();

   CTPath2DClose[] getCloseArray();

   CTPath2DClose getCloseArray(int var1);

   int sizeOfCloseArray();

   void setCloseArray(CTPath2DClose[] var1);

   void setCloseArray(int var1, CTPath2DClose var2);

   CTPath2DClose insertNewClose(int var1);

   CTPath2DClose addNewClose();

   void removeClose(int var1);

   List getMoveToList();

   CTPath2DMoveTo[] getMoveToArray();

   CTPath2DMoveTo getMoveToArray(int var1);

   int sizeOfMoveToArray();

   void setMoveToArray(CTPath2DMoveTo[] var1);

   void setMoveToArray(int var1, CTPath2DMoveTo var2);

   CTPath2DMoveTo insertNewMoveTo(int var1);

   CTPath2DMoveTo addNewMoveTo();

   void removeMoveTo(int var1);

   List getLnToList();

   CTPath2DLineTo[] getLnToArray();

   CTPath2DLineTo getLnToArray(int var1);

   int sizeOfLnToArray();

   void setLnToArray(CTPath2DLineTo[] var1);

   void setLnToArray(int var1, CTPath2DLineTo var2);

   CTPath2DLineTo insertNewLnTo(int var1);

   CTPath2DLineTo addNewLnTo();

   void removeLnTo(int var1);

   List getArcToList();

   CTPath2DArcTo[] getArcToArray();

   CTPath2DArcTo getArcToArray(int var1);

   int sizeOfArcToArray();

   void setArcToArray(CTPath2DArcTo[] var1);

   void setArcToArray(int var1, CTPath2DArcTo var2);

   CTPath2DArcTo insertNewArcTo(int var1);

   CTPath2DArcTo addNewArcTo();

   void removeArcTo(int var1);

   List getQuadBezToList();

   CTPath2DQuadBezierTo[] getQuadBezToArray();

   CTPath2DQuadBezierTo getQuadBezToArray(int var1);

   int sizeOfQuadBezToArray();

   void setQuadBezToArray(CTPath2DQuadBezierTo[] var1);

   void setQuadBezToArray(int var1, CTPath2DQuadBezierTo var2);

   CTPath2DQuadBezierTo insertNewQuadBezTo(int var1);

   CTPath2DQuadBezierTo addNewQuadBezTo();

   void removeQuadBezTo(int var1);

   List getCubicBezToList();

   CTPath2DCubicBezierTo[] getCubicBezToArray();

   CTPath2DCubicBezierTo getCubicBezToArray(int var1);

   int sizeOfCubicBezToArray();

   void setCubicBezToArray(CTPath2DCubicBezierTo[] var1);

   void setCubicBezToArray(int var1, CTPath2DCubicBezierTo var2);

   CTPath2DCubicBezierTo insertNewCubicBezTo(int var1);

   CTPath2DCubicBezierTo addNewCubicBezTo();

   void removeCubicBezTo(int var1);

   long getW();

   STPositiveCoordinate xgetW();

   boolean isSetW();

   void setW(long var1);

   void xsetW(STPositiveCoordinate var1);

   void unsetW();

   long getH();

   STPositiveCoordinate xgetH();

   boolean isSetH();

   void setH(long var1);

   void xsetH(STPositiveCoordinate var1);

   void unsetH();

   STPathFillMode$Enum getFill();

   STPathFillMode xgetFill();

   boolean isSetFill();

   void setFill(STPathFillMode$Enum var1);

   void xsetFill(STPathFillMode var1);

   void unsetFill();

   boolean getStroke();

   XmlBoolean xgetStroke();

   boolean isSetStroke();

   void setStroke(boolean var1);

   void xsetStroke(XmlBoolean var1);

   void unsetStroke();

   boolean getExtrusionOk();

   XmlBoolean xgetExtrusionOk();

   boolean isSetExtrusionOk();

   void setExtrusionOk(boolean var1);

   void xsetExtrusionOk(XmlBoolean var1);

   void unsetExtrusionOk();


   public static final class Factory {

      public static CTPath2D newInstance() {
         return (CTPath2D)POIXMLTypeLoader.newInstance(CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D newInstance(XmlOptions var0) {
         return (CTPath2D)POIXMLTypeLoader.newInstance(CTPath2D.type, var0);
      }

      public static CTPath2D parse(String var0) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(File var0) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(URL var0) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(InputStream var0) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(Reader var0) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(XMLStreamReader var0) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(Node var0) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static CTPath2D parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static CTPath2D parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath2D)POIXMLTypeLoader.parse(var0, CTPath2D.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2D.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2D.type, var1);
      }

   }
}
