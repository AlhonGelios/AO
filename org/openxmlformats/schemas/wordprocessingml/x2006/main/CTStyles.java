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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.w3c.dom.Node;

public interface CTStyles extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstyles8506type");


   CTDocDefaults getDocDefaults();

   boolean isSetDocDefaults();

   void setDocDefaults(CTDocDefaults var1);

   CTDocDefaults addNewDocDefaults();

   void unsetDocDefaults();

   CTLatentStyles getLatentStyles();

   boolean isSetLatentStyles();

   void setLatentStyles(CTLatentStyles var1);

   CTLatentStyles addNewLatentStyles();

   void unsetLatentStyles();

   List getStyleList();

   CTStyle[] getStyleArray();

   CTStyle getStyleArray(int var1);

   int sizeOfStyleArray();

   void setStyleArray(CTStyle[] var1);

   void setStyleArray(int var1, CTStyle var2);

   CTStyle insertNewStyle(int var1);

   CTStyle addNewStyle();

   void removeStyle(int var1);


   public static final class Factory {

      public static CTStyles newInstance() {
         return (CTStyles)POIXMLTypeLoader.newInstance(CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles newInstance(XmlOptions var0) {
         return (CTStyles)POIXMLTypeLoader.newInstance(CTStyles.type, var0);
      }

      public static CTStyles parse(String var0) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(File var0) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(URL var0) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(InputStream var0) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(Reader var0) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(XMLStreamReader var0) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(Node var0) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static CTStyles parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, (XmlOptions)null);
      }

      public static CTStyles parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStyles)POIXMLTypeLoader.parse(var0, CTStyles.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyles.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyles.type, var1);
      }

   }
}
