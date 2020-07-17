package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentCell;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr;
import org.w3c.dom.Node;

public interface CTSdtCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSdtCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsdtcell626dtype");


   CTSdtPr getSdtPr();

   boolean isSetSdtPr();

   void setSdtPr(CTSdtPr var1);

   CTSdtPr addNewSdtPr();

   void unsetSdtPr();

   CTSdtEndPr getSdtEndPr();

   boolean isSetSdtEndPr();

   void setSdtEndPr(CTSdtEndPr var1);

   CTSdtEndPr addNewSdtEndPr();

   void unsetSdtEndPr();

   CTSdtContentCell getSdtContent();

   boolean isSetSdtContent();

   void setSdtContent(CTSdtContentCell var1);

   CTSdtContentCell addNewSdtContent();

   void unsetSdtContent();


   public static final class Factory {

      public static CTSdtCell newInstance() {
         return (CTSdtCell)POIXMLTypeLoader.newInstance(CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell newInstance(XmlOptions var0) {
         return (CTSdtCell)POIXMLTypeLoader.newInstance(CTSdtCell.type, var0);
      }

      public static CTSdtCell parse(String var0) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(File var0) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(URL var0) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(InputStream var0) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(Reader var0) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(XMLStreamReader var0) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(Node var0) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static CTSdtCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static CTSdtCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSdtCell)POIXMLTypeLoader.parse(var0, CTSdtCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtCell.type, var1);
      }

   }
}
