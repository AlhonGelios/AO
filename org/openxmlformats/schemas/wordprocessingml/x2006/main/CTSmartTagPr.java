package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr;
import org.w3c.dom.Node;

public interface CTSmartTagPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSmartTagPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsmarttagprf715type");


   List getAttrList();

   CTAttr[] getAttrArray();

   CTAttr getAttrArray(int var1);

   int sizeOfAttrArray();

   void setAttrArray(CTAttr[] var1);

   void setAttrArray(int var1, CTAttr var2);

   CTAttr insertNewAttr(int var1);

   CTAttr addNewAttr();

   void removeAttr(int var1);


   public static final class Factory {

      public static CTSmartTagPr newInstance() {
         return (CTSmartTagPr)POIXMLTypeLoader.newInstance(CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr newInstance(XmlOptions var0) {
         return (CTSmartTagPr)POIXMLTypeLoader.newInstance(CTSmartTagPr.type, var0);
      }

      public static CTSmartTagPr parse(String var0) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(File var0) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(URL var0) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(Reader var0) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(Node var0) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static CTSmartTagPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static CTSmartTagPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSmartTagPr)POIXMLTypeLoader.parse(var0, CTSmartTagPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSmartTagPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSmartTagPr.type, var1);
      }

   }
}
