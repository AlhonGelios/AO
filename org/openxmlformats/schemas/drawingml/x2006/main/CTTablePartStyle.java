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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle;
import org.w3c.dom.Node;

public interface CTTablePartStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTablePartStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablepartstylef22btype");


   CTTableStyleTextStyle getTcTxStyle();

   boolean isSetTcTxStyle();

   void setTcTxStyle(CTTableStyleTextStyle var1);

   CTTableStyleTextStyle addNewTcTxStyle();

   void unsetTcTxStyle();

   CTTableStyleCellStyle getTcStyle();

   boolean isSetTcStyle();

   void setTcStyle(CTTableStyleCellStyle var1);

   CTTableStyleCellStyle addNewTcStyle();

   void unsetTcStyle();


   public static final class Factory {

      public static CTTablePartStyle newInstance() {
         return (CTTablePartStyle)POIXMLTypeLoader.newInstance(CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle newInstance(XmlOptions var0) {
         return (CTTablePartStyle)POIXMLTypeLoader.newInstance(CTTablePartStyle.type, var0);
      }

      public static CTTablePartStyle parse(String var0) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(File var0) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(URL var0) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(Reader var0) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(Node var0) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static CTTablePartStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static CTTablePartStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTablePartStyle)POIXMLTypeLoader.parse(var0, CTTablePartStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTablePartStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTablePartStyle.type, var1);
      }

   }
}
