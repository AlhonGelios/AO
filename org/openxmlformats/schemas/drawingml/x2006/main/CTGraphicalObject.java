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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.w3c.dom.Node;

public interface CTGraphicalObject extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGraphicalObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgraphicalobject1ce3type");


   CTGraphicalObjectData getGraphicData();

   void setGraphicData(CTGraphicalObjectData var1);

   CTGraphicalObjectData addNewGraphicData();


   public static final class Factory {

      public static CTGraphicalObject newInstance() {
         return (CTGraphicalObject)POIXMLTypeLoader.newInstance(CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject newInstance(XmlOptions var0) {
         return (CTGraphicalObject)POIXMLTypeLoader.newInstance(CTGraphicalObject.type, var0);
      }

      public static CTGraphicalObject parse(String var0) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(File var0) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(URL var0) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(InputStream var0) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(Reader var0) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(XMLStreamReader var0) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(Node var0) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static CTGraphicalObject parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static CTGraphicalObject parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGraphicalObject)POIXMLTypeLoader.parse(var0, CTGraphicalObject.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObject.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObject.type, var1);
      }

   }
}
