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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView;
import org.w3c.dom.Node;

public interface CTBookViews extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBookViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbookviewsb864type");


   List getWorkbookViewList();

   CTBookView[] getWorkbookViewArray();

   CTBookView getWorkbookViewArray(int var1);

   int sizeOfWorkbookViewArray();

   void setWorkbookViewArray(CTBookView[] var1);

   void setWorkbookViewArray(int var1, CTBookView var2);

   CTBookView insertNewWorkbookView(int var1);

   CTBookView addNewWorkbookView();

   void removeWorkbookView(int var1);


   public static final class Factory {

      public static CTBookViews newInstance() {
         return (CTBookViews)POIXMLTypeLoader.newInstance(CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews newInstance(XmlOptions var0) {
         return (CTBookViews)POIXMLTypeLoader.newInstance(CTBookViews.type, var0);
      }

      public static CTBookViews parse(String var0) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(File var0) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(URL var0) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(InputStream var0) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(Reader var0) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(XMLStreamReader var0) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(Node var0) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static CTBookViews parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static CTBookViews parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBookViews)POIXMLTypeLoader.parse(var0, CTBookViews.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookViews.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookViews.type, var1);
      }

   }
}
