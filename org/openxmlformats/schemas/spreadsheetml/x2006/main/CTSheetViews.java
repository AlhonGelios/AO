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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView;
import org.w3c.dom.Node;

public interface CTSheetViews extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetviewsb918type");


   List getSheetViewList();

   CTSheetView[] getSheetViewArray();

   CTSheetView getSheetViewArray(int var1);

   int sizeOfSheetViewArray();

   void setSheetViewArray(CTSheetView[] var1);

   void setSheetViewArray(int var1, CTSheetView var2);

   CTSheetView insertNewSheetView(int var1);

   CTSheetView addNewSheetView();

   void removeSheetView(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTSheetViews newInstance() {
         return (CTSheetViews)POIXMLTypeLoader.newInstance(CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews newInstance(XmlOptions var0) {
         return (CTSheetViews)POIXMLTypeLoader.newInstance(CTSheetViews.type, var0);
      }

      public static CTSheetViews parse(String var0) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(File var0) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(URL var0) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(Reader var0) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(Node var0) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static CTSheetViews parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static CTSheetViews parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetViews)POIXMLTypeLoader.parse(var0, CTSheetViews.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetViews.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetViews.type, var1);
      }

   }
}
