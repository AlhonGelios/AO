package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState;
import org.w3c.dom.Node;

public interface CTPane extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPane.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpaneaab1type");


   double getXSplit();

   XmlDouble xgetXSplit();

   boolean isSetXSplit();

   void setXSplit(double var1);

   void xsetXSplit(XmlDouble var1);

   void unsetXSplit();

   double getYSplit();

   XmlDouble xgetYSplit();

   boolean isSetYSplit();

   void setYSplit(double var1);

   void xsetYSplit(XmlDouble var1);

   void unsetYSplit();

   String getTopLeftCell();

   STCellRef xgetTopLeftCell();

   boolean isSetTopLeftCell();

   void setTopLeftCell(String var1);

   void xsetTopLeftCell(STCellRef var1);

   void unsetTopLeftCell();

   STPane.Enum getActivePane();

   STPane xgetActivePane();

   boolean isSetActivePane();

   void setActivePane(STPane.Enum var1);

   void xsetActivePane(STPane var1);

   void unsetActivePane();

   STPaneState.Enum getState();

   STPaneState xgetState();

   boolean isSetState();

   void setState(STPaneState.Enum var1);

   void xsetState(STPaneState var1);

   void unsetState();


   public static final class Factory {

      public static CTPane newInstance() {
         return (CTPane)POIXMLTypeLoader.newInstance(CTPane.type, (XmlOptions)null);
      }

      public static CTPane newInstance(XmlOptions var0) {
         return (CTPane)POIXMLTypeLoader.newInstance(CTPane.type, var0);
      }

      public static CTPane parse(String var0) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(File var0) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(URL var0) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(InputStream var0) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(Reader var0) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(XMLStreamReader var0) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(Node var0) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static CTPane parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, (XmlOptions)null);
      }

      public static CTPane parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPane)POIXMLTypeLoader.parse(var0, CTPane.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPane.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPane.type, var1);
      }

   }
}
