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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.w3c.dom.Node;

public interface CTNumRef extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumref062ftype");


   String getF();

   XmlString xgetF();

   void setF(String var1);

   void xsetF(XmlString var1);

   CTNumData getNumCache();

   boolean isSetNumCache();

   void setNumCache(CTNumData var1);

   CTNumData addNewNumCache();

   void unsetNumCache();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNumRef newInstance() {
         return (CTNumRef)POIXMLTypeLoader.newInstance(CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef newInstance(XmlOptions var0) {
         return (CTNumRef)POIXMLTypeLoader.newInstance(CTNumRef.type, var0);
      }

      public static CTNumRef parse(String var0) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(File var0) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(URL var0) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(InputStream var0) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(Reader var0) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(XMLStreamReader var0) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(Node var0) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static CTNumRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static CTNumRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumRef)POIXMLTypeLoader.parse(var0, CTNumRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumRef.type, var1);
      }

   }
}
