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
import org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula;
import org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName;
import org.w3c.dom.Node;

public interface CTGeomGuide extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGeomGuide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgeomguidef191type");


   String getName();

   STGeomGuideName xgetName();

   void setName(String var1);

   void xsetName(STGeomGuideName var1);

   String getFmla();

   STGeomGuideFormula xgetFmla();

   void setFmla(String var1);

   void xsetFmla(STGeomGuideFormula var1);


   public static final class Factory {

      public static CTGeomGuide newInstance() {
         return (CTGeomGuide)POIXMLTypeLoader.newInstance(CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide newInstance(XmlOptions var0) {
         return (CTGeomGuide)POIXMLTypeLoader.newInstance(CTGeomGuide.type, var0);
      }

      public static CTGeomGuide parse(String var0) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(File var0) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(URL var0) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(InputStream var0) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(Reader var0) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(XMLStreamReader var0) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(Node var0) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static CTGeomGuide parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static CTGeomGuide parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGeomGuide)POIXMLTypeLoader.parse(var0, CTGeomGuide.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomGuide.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGeomGuide.type, var1);
      }

   }
}
