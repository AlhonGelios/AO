package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.w3c.dom.Node;

public interface CTColorScale extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColorScale.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolorscale1a70type");


   List getCfvoList();

   CTCfvo[] getCfvoArray();

   CTCfvo getCfvoArray(int var1);

   int sizeOfCfvoArray();

   void setCfvoArray(CTCfvo[] var1);

   void setCfvoArray(int var1, CTCfvo var2);

   CTCfvo insertNewCfvo(int var1);

   CTCfvo addNewCfvo();

   void removeCfvo(int var1);

   List getColorList();

   CTColor[] getColorArray();

   CTColor getColorArray(int var1);

   int sizeOfColorArray();

   void setColorArray(CTColor[] var1);

   void setColorArray(int var1, CTColor var2);

   CTColor insertNewColor(int var1);

   CTColor addNewColor();

   void removeColor(int var1);


   public static final class Factory {

      public static CTColorScale newInstance() {
         return (CTColorScale)POIXMLTypeLoader.newInstance(CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale newInstance(XmlOptions var0) {
         return (CTColorScale)POIXMLTypeLoader.newInstance(CTColorScale.type, var0);
      }

      public static CTColorScale parse(String var0) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(File var0) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(URL var0) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(InputStream var0) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(Reader var0) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(XMLStreamReader var0) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(Node var0) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static CTColorScale parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static CTColorScale parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColorScale)POIXMLTypeLoader.parse(var0, CTColorScale.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorScale.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColorScale.type, var1);
      }

   }
}
