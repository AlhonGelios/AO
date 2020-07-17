package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;

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
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.w3c.dom.Node;

public interface CTDrawing extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDrawing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdrawing2748type");


   List getTwoCellAnchorList();

   CTTwoCellAnchor[] getTwoCellAnchorArray();

   CTTwoCellAnchor getTwoCellAnchorArray(int var1);

   int sizeOfTwoCellAnchorArray();

   void setTwoCellAnchorArray(CTTwoCellAnchor[] var1);

   void setTwoCellAnchorArray(int var1, CTTwoCellAnchor var2);

   CTTwoCellAnchor insertNewTwoCellAnchor(int var1);

   CTTwoCellAnchor addNewTwoCellAnchor();

   void removeTwoCellAnchor(int var1);

   List getOneCellAnchorList();

   CTOneCellAnchor[] getOneCellAnchorArray();

   CTOneCellAnchor getOneCellAnchorArray(int var1);

   int sizeOfOneCellAnchorArray();

   void setOneCellAnchorArray(CTOneCellAnchor[] var1);

   void setOneCellAnchorArray(int var1, CTOneCellAnchor var2);

   CTOneCellAnchor insertNewOneCellAnchor(int var1);

   CTOneCellAnchor addNewOneCellAnchor();

   void removeOneCellAnchor(int var1);

   List getAbsoluteAnchorList();

   CTAbsoluteAnchor[] getAbsoluteAnchorArray();

   CTAbsoluteAnchor getAbsoluteAnchorArray(int var1);

   int sizeOfAbsoluteAnchorArray();

   void setAbsoluteAnchorArray(CTAbsoluteAnchor[] var1);

   void setAbsoluteAnchorArray(int var1, CTAbsoluteAnchor var2);

   CTAbsoluteAnchor insertNewAbsoluteAnchor(int var1);

   CTAbsoluteAnchor addNewAbsoluteAnchor();

   void removeAbsoluteAnchor(int var1);


   public static final class Factory {

      public static CTDrawing newInstance() {
         return (CTDrawing)POIXMLTypeLoader.newInstance(CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing newInstance(XmlOptions var0) {
         return (CTDrawing)POIXMLTypeLoader.newInstance(CTDrawing.type, var0);
      }

      public static CTDrawing parse(String var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(File var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(URL var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(InputStream var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(Reader var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(XMLStreamReader var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(Node var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDrawing.type, var1);
      }

   }
}
