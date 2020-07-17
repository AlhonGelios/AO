package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.w3c.dom.Node;

public interface CTPictureNonVisual extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPictureNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpicturenonvisualb236type");


   CTNonVisualDrawingProps getCNvPr();

   void setCNvPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewCNvPr();

   CTNonVisualPictureProperties getCNvPicPr();

   void setCNvPicPr(CTNonVisualPictureProperties var1);

   CTNonVisualPictureProperties addNewCNvPicPr();

   CTApplicationNonVisualDrawingProps getNvPr();

   void setNvPr(CTApplicationNonVisualDrawingProps var1);

   CTApplicationNonVisualDrawingProps addNewNvPr();


   public static final class Factory {

      public static CTPictureNonVisual newInstance() {
         return (CTPictureNonVisual)POIXMLTypeLoader.newInstance(CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual newInstance(XmlOptions var0) {
         return (CTPictureNonVisual)POIXMLTypeLoader.newInstance(CTPictureNonVisual.type, var0);
      }

      public static CTPictureNonVisual parse(String var0) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(File var0) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(URL var0) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(InputStream var0) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(Reader var0) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(XMLStreamReader var0) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(Node var0) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static CTPictureNonVisual parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static CTPictureNonVisual parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPictureNonVisual)POIXMLTypeLoader.parse(var0, CTPictureNonVisual.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureNonVisual.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureNonVisual.type, var1);
      }

   }
}
