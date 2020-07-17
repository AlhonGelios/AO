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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;
import org.w3c.dom.Node;

public interface CTNumData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumdata4f16type");


   String getFormatCode();

   STXstring xgetFormatCode();

   boolean isSetFormatCode();

   void setFormatCode(String var1);

   void xsetFormatCode(STXstring var1);

   void unsetFormatCode();

   CTUnsignedInt getPtCount();

   boolean isSetPtCount();

   void setPtCount(CTUnsignedInt var1);

   CTUnsignedInt addNewPtCount();

   void unsetPtCount();

   List getPtList();

   CTNumVal[] getPtArray();

   CTNumVal getPtArray(int var1);

   int sizeOfPtArray();

   void setPtArray(CTNumVal[] var1);

   void setPtArray(int var1, CTNumVal var2);

   CTNumVal insertNewPt(int var1);

   CTNumVal addNewPt();

   void removePt(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNumData newInstance() {
         return (CTNumData)POIXMLTypeLoader.newInstance(CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData newInstance(XmlOptions var0) {
         return (CTNumData)POIXMLTypeLoader.newInstance(CTNumData.type, var0);
      }

      public static CTNumData parse(String var0) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(File var0) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(URL var0) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(InputStream var0) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(Reader var0) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(XMLStreamReader var0) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(Node var0) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static CTNumData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, (XmlOptions)null);
      }

      public static CTNumData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumData)POIXMLTypeLoader.parse(var0, CTNumData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumData.type, var1);
      }

   }
}
