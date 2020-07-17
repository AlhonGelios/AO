package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;

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
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID;
import org.w3c.dom.Node;

public interface CTMarker extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMarker.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmarkeree8etype");


   int getCol();

   STColID xgetCol();

   void setCol(int var1);

   void xsetCol(STColID var1);

   long getColOff();

   STCoordinate xgetColOff();

   void setColOff(long var1);

   void xsetColOff(STCoordinate var1);

   int getRow();

   STRowID xgetRow();

   void setRow(int var1);

   void xsetRow(STRowID var1);

   long getRowOff();

   STCoordinate xgetRowOff();

   void setRowOff(long var1);

   void xsetRowOff(STCoordinate var1);


   public static final class Factory {

      public static CTMarker newInstance() {
         return (CTMarker)POIXMLTypeLoader.newInstance(CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker newInstance(XmlOptions var0) {
         return (CTMarker)POIXMLTypeLoader.newInstance(CTMarker.type, var0);
      }

      public static CTMarker parse(String var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(File var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(URL var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(InputStream var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(Reader var0) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(XMLStreamReader var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(Node var0) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static CTMarker parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, (XmlOptions)null);
      }

      public static CTMarker parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMarker)POIXMLTypeLoader.parse(var0, CTMarker.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarker.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarker.type, var1);
      }

   }
}
