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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTx;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.w3c.dom.Node;

public interface CTTitle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTitle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttitleb54etype");


   CTTx getTx();

   boolean isSetTx();

   void setTx(CTTx var1);

   CTTx addNewTx();

   void unsetTx();

   CTLayout getLayout();

   boolean isSetLayout();

   void setLayout(CTLayout var1);

   CTLayout addNewLayout();

   void unsetLayout();

   CTBoolean getOverlay();

   boolean isSetOverlay();

   void setOverlay(CTBoolean var1);

   CTBoolean addNewOverlay();

   void unsetOverlay();

   CTShapeProperties getSpPr();

   boolean isSetSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   void unsetSpPr();

   CTTextBody getTxPr();

   boolean isSetTxPr();

   void setTxPr(CTTextBody var1);

   CTTextBody addNewTxPr();

   void unsetTxPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTTitle newInstance() {
         return (CTTitle)POIXMLTypeLoader.newInstance(CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle newInstance(XmlOptions var0) {
         return (CTTitle)POIXMLTypeLoader.newInstance(CTTitle.type, var0);
      }

      public static CTTitle parse(String var0) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(File var0) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(URL var0) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(InputStream var0) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(Reader var0) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(XMLStreamReader var0) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(Node var0) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static CTTitle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, (XmlOptions)null);
      }

      public static CTTitle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTitle)POIXMLTypeLoader.parse(var0, CTTitle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTitle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTitle.type, var1);
      }

   }
}
