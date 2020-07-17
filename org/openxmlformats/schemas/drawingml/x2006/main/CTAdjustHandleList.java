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
import org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle;
import org.w3c.dom.Node;

public interface CTAdjustHandleList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAdjustHandleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctadjusthandlelistfdb0type");


   List getAhXYList();

   CTXYAdjustHandle[] getAhXYArray();

   CTXYAdjustHandle getAhXYArray(int var1);

   int sizeOfAhXYArray();

   void setAhXYArray(CTXYAdjustHandle[] var1);

   void setAhXYArray(int var1, CTXYAdjustHandle var2);

   CTXYAdjustHandle insertNewAhXY(int var1);

   CTXYAdjustHandle addNewAhXY();

   void removeAhXY(int var1);

   List getAhPolarList();

   CTPolarAdjustHandle[] getAhPolarArray();

   CTPolarAdjustHandle getAhPolarArray(int var1);

   int sizeOfAhPolarArray();

   void setAhPolarArray(CTPolarAdjustHandle[] var1);

   void setAhPolarArray(int var1, CTPolarAdjustHandle var2);

   CTPolarAdjustHandle insertNewAhPolar(int var1);

   CTPolarAdjustHandle addNewAhPolar();

   void removeAhPolar(int var1);


   public static final class Factory {

      public static CTAdjustHandleList newInstance() {
         return (CTAdjustHandleList)POIXMLTypeLoader.newInstance(CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList newInstance(XmlOptions var0) {
         return (CTAdjustHandleList)POIXMLTypeLoader.newInstance(CTAdjustHandleList.type, var0);
      }

      public static CTAdjustHandleList parse(String var0) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(File var0) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(URL var0) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(InputStream var0) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(Reader var0) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(XMLStreamReader var0) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(Node var0) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static CTAdjustHandleList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static CTAdjustHandleList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAdjustHandleList)POIXMLTypeLoader.parse(var0, CTAdjustHandleList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAdjustHandleList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAdjustHandleList.type, var1);
      }

   }
}
