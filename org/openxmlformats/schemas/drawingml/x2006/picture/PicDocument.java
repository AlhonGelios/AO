package org.openxmlformats.schemas.drawingml.x2006.picture;

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
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.w3c.dom.Node;

public interface PicDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PicDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pic8010doctype");


   CTPicture getPic();

   void setPic(CTPicture var1);

   CTPicture addNewPic();


   public static final class Factory {

      public static PicDocument newInstance() {
         return (PicDocument)POIXMLTypeLoader.newInstance(PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument newInstance(XmlOptions var0) {
         return (PicDocument)POIXMLTypeLoader.newInstance(PicDocument.type, var0);
      }

      public static PicDocument parse(String var0) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(File var0) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(URL var0) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(InputStream var0) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(Reader var0) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(XMLStreamReader var0) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(Node var0) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static PicDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, (XmlOptions)null);
      }

      public static PicDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PicDocument)POIXMLTypeLoader.parse(var0, PicDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PicDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PicDocument.type, var1);
      }

   }
}
