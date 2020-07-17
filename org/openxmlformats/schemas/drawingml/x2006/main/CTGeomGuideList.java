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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide;
import org.w3c.dom.Node;

public interface CTGeomGuideList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGeomGuideList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgeomguidelist364ftype");


   List getGdList();

   CTGeomGuide[] getGdArray();

   CTGeomGuide getGdArray(int var1);

   int sizeOfGdArray();

   void setGdArray(CTGeomGuide[] var1);

   void setGdArray(int var1, CTGeomGuide var2);

   CTGeomGuide insertNewGd(int var1);

   CTGeomGuide addNewGd();

   void removeGd(int var1);


   public static final class Factory {

      public static CTGeomGuideList newInstance() {
         return (CTGeomGuideList)POIXMLTypeLoader.newInstance(CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList newInstance(XmlOptions var0) {
         return (CTGeomGuideList)POIXMLTypeLoader.newInstance(CTGeomGuideList.type, var0);
      }

      public static CTGeomGuideList parse(String var0) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(File var0) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(URL var0) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(InputStream var0) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(Reader var0) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(XMLStreamReader var0) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(Node var0) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static CTGeomGuideList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static CTGeomGuideList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGeomGuideList)POIXMLTypeLoader.parse(var0, CTGeomGuideList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomGuideList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomGuideList.type, var1);
      }

   }
}
