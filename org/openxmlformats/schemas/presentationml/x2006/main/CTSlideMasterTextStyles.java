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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.w3c.dom.Node;

public interface CTSlideMasterTextStyles extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideMasterTextStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidemastertextstylesb48dtype");


   CTTextListStyle getTitleStyle();

   boolean isSetTitleStyle();

   void setTitleStyle(CTTextListStyle var1);

   CTTextListStyle addNewTitleStyle();

   void unsetTitleStyle();

   CTTextListStyle getBodyStyle();

   boolean isSetBodyStyle();

   void setBodyStyle(CTTextListStyle var1);

   CTTextListStyle addNewBodyStyle();

   void unsetBodyStyle();

   CTTextListStyle getOtherStyle();

   boolean isSetOtherStyle();

   void setOtherStyle(CTTextListStyle var1);

   CTTextListStyle addNewOtherStyle();

   void unsetOtherStyle();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTSlideMasterTextStyles newInstance() {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.newInstance(CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles newInstance(XmlOptions var0) {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.newInstance(CTSlideMasterTextStyles.type, var0);
      }

      public static CTSlideMasterTextStyles parse(String var0) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(File var0) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(URL var0) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(Reader var0) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(Node var0) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static CTSlideMasterTextStyles parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static CTSlideMasterTextStyles parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideMasterTextStyles)POIXMLTypeLoader.parse(var0, CTSlideMasterTextStyles.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterTextStyles.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideMasterTextStyles.type, var1);
      }

   }
}
