package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation;
import org.w3c.dom.Node;

public interface CTScaling extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTScaling.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctscaling1dfftype");


   CTLogBase getLogBase();

   boolean isSetLogBase();

   void setLogBase(CTLogBase var1);

   CTLogBase addNewLogBase();

   void unsetLogBase();

   CTOrientation getOrientation();

   boolean isSetOrientation();

   void setOrientation(CTOrientation var1);

   CTOrientation addNewOrientation();

   void unsetOrientation();

   CTDouble getMax();

   boolean isSetMax();

   void setMax(CTDouble var1);

   CTDouble addNewMax();

   void unsetMax();

   CTDouble getMin();

   boolean isSetMin();

   void setMin(CTDouble var1);

   CTDouble addNewMin();

   void unsetMin();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTScaling newInstance() {
         return (CTScaling)POIXMLTypeLoader.newInstance(CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling newInstance(XmlOptions var0) {
         return (CTScaling)POIXMLTypeLoader.newInstance(CTScaling.type, var0);
      }

      public static CTScaling parse(String var0) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(String var0, XmlOptions var1) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(File var0) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(URL var0) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(InputStream var0) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(Reader var0) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(XMLStreamReader var0) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(Node var0) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static CTScaling parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, (XmlOptions)null);
      }

      public static CTScaling parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTScaling)POIXMLTypeLoader.parse(var0, CTScaling.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScaling.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScaling.type, var1);
      }

   }
}
