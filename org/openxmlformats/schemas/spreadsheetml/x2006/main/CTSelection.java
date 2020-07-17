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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.w3c.dom.Node;

public interface CTSelection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSelection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctselectionca2btype");


   STPane.Enum getPane();

   STPane xgetPane();

   boolean isSetPane();

   void setPane(STPane.Enum var1);

   void xsetPane(STPane var1);

   void unsetPane();

   String getActiveCell();

   STCellRef xgetActiveCell();

   boolean isSetActiveCell();

   void setActiveCell(String var1);

   void xsetActiveCell(STCellRef var1);

   void unsetActiveCell();

   long getActiveCellId();

   XmlUnsignedInt xgetActiveCellId();

   boolean isSetActiveCellId();

   void setActiveCellId(long var1);

   void xsetActiveCellId(XmlUnsignedInt var1);

   void unsetActiveCellId();

   List getSqref();

   STSqref xgetSqref();

   boolean isSetSqref();

   void setSqref(List var1);

   void xsetSqref(STSqref var1);

   void unsetSqref();


   public static final class Factory {

      public static CTSelection newInstance() {
         return (CTSelection)POIXMLTypeLoader.newInstance(CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection newInstance(XmlOptions var0) {
         return (CTSelection)POIXMLTypeLoader.newInstance(CTSelection.type, var0);
      }

      public static CTSelection parse(String var0) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(File var0) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(URL var0) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(InputStream var0) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(Reader var0) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(XMLStreamReader var0) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(Node var0) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static CTSelection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, (XmlOptions)null);
      }

      public static CTSelection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSelection)POIXMLTypeLoader.parse(var0, CTSelection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSelection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSelection.type, var1);
      }

   }
}
