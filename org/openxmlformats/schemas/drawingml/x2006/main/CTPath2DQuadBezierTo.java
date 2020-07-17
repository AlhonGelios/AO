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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.w3c.dom.Node;

public interface CTPath2DQuadBezierTo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath2DQuadBezierTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath2dquadbezierto3f53type");


   List getPtList();

   CTAdjPoint2D[] getPtArray();

   CTAdjPoint2D getPtArray(int var1);

   int sizeOfPtArray();

   void setPtArray(CTAdjPoint2D[] var1);

   void setPtArray(int var1, CTAdjPoint2D var2);

   CTAdjPoint2D insertNewPt(int var1);

   CTAdjPoint2D addNewPt();

   void removePt(int var1);


   public static final class Factory {

      public static CTPath2DQuadBezierTo newInstance() {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.newInstance(CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo newInstance(XmlOptions var0) {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.newInstance(CTPath2DQuadBezierTo.type, var0);
      }

      public static CTPath2DQuadBezierTo parse(String var0) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(File var0) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(URL var0) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(InputStream var0) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(Reader var0) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(XMLStreamReader var0) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(Node var0) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static CTPath2DQuadBezierTo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DQuadBezierTo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath2DQuadBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DQuadBezierTo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DQuadBezierTo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DQuadBezierTo.type, var1);
      }

   }
}
