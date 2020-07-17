package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.w3c.dom.Node;

public interface CTStrData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStrData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstrdatad58btype");


   CTUnsignedInt getPtCount();

   boolean isSetPtCount();

   void setPtCount(CTUnsignedInt var1);

   CTUnsignedInt addNewPtCount();

   void unsetPtCount();

   List getPtList();

   CTStrVal[] getPtArray();

   CTStrVal getPtArray(int var1);

   int sizeOfPtArray();

   void setPtArray(CTStrVal[] var1);

   void setPtArray(int var1, CTStrVal var2);

   CTStrVal insertNewPt(int var1);

   CTStrVal addNewPt();

   void removePt(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTStrData newInstance() {
         return (CTStrData)POIXMLTypeLoader.newInstance(CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData newInstance(XmlOptions var0) {
         return (CTStrData)POIXMLTypeLoader.newInstance(CTStrData.type, var0);
      }

      public static CTStrData parse(String var0) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(File var0) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(URL var0) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(InputStream var0) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(Reader var0) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(XMLStreamReader var0) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(Node var0) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static CTStrData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, (XmlOptions)null);
      }

      public static CTStrData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStrData)POIXMLTypeLoader.parse(var0, CTStrData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrData.type, var1);
      }

   }
}
