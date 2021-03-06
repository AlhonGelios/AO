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

public interface CTPath2DCubicBezierTo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath2DCubicBezierTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath2dcubicbezierto5a1etype");


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

      public static CTPath2DCubicBezierTo newInstance() {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.newInstance(CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo newInstance(XmlOptions var0) {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.newInstance(CTPath2DCubicBezierTo.type, var0);
      }

      public static CTPath2DCubicBezierTo parse(String var0) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(File var0) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(URL var0) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(InputStream var0) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(Reader var0) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(XMLStreamReader var0) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(Node var0) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static CTPath2DCubicBezierTo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static CTPath2DCubicBezierTo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath2DCubicBezierTo)POIXMLTypeLoader.parse(var0, CTPath2DCubicBezierTo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DCubicBezierTo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DCubicBezierTo.type, var1);
      }

   }
}
