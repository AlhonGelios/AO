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
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual;
import org.w3c.dom.Node;

public interface CTPicture extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPicture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpicture1d48type");


   CTPictureNonVisual getNvPicPr();

   void setNvPicPr(CTPictureNonVisual var1);

   CTPictureNonVisual addNewNvPicPr();

   CTBlipFillProperties getBlipFill();

   void setBlipFill(CTBlipFillProperties var1);

   CTBlipFillProperties addNewBlipFill();

   CTShapeProperties getSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();


   public static final class Factory {

      public static CTPicture newInstance() {
         return (CTPicture)POIXMLTypeLoader.newInstance(CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture newInstance(XmlOptions var0) {
         return (CTPicture)POIXMLTypeLoader.newInstance(CTPicture.type, var0);
      }

      public static CTPicture parse(String var0) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(File var0) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(URL var0) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(InputStream var0) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(Reader var0) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(XMLStreamReader var0) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(Node var0) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static CTPicture parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, (XmlOptions)null);
      }

      public static CTPicture parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPicture)POIXMLTypeLoader.parse(var0, CTPicture.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPicture.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPicture.type, var1);
      }

   }
}
