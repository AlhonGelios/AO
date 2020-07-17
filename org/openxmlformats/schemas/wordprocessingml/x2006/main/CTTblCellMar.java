package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.w3c.dom.Node;

public interface CTTblCellMar extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblCellMar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblcellmar66eatype");


   CTTblWidth getTop();

   boolean isSetTop();

   void setTop(CTTblWidth var1);

   CTTblWidth addNewTop();

   void unsetTop();

   CTTblWidth getLeft();

   boolean isSetLeft();

   void setLeft(CTTblWidth var1);

   CTTblWidth addNewLeft();

   void unsetLeft();

   CTTblWidth getBottom();

   boolean isSetBottom();

   void setBottom(CTTblWidth var1);

   CTTblWidth addNewBottom();

   void unsetBottom();

   CTTblWidth getRight();

   boolean isSetRight();

   void setRight(CTTblWidth var1);

   CTTblWidth addNewRight();

   void unsetRight();


   public static final class Factory {

      public static CTTblCellMar newInstance() {
         return (CTTblCellMar)POIXMLTypeLoader.newInstance(CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar newInstance(XmlOptions var0) {
         return (CTTblCellMar)POIXMLTypeLoader.newInstance(CTTblCellMar.type, var0);
      }

      public static CTTblCellMar parse(String var0) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(File var0) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(URL var0) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(InputStream var0) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(Reader var0) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(XMLStreamReader var0) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(Node var0) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static CTTblCellMar parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static CTTblCellMar parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblCellMar)POIXMLTypeLoader.parse(var0, CTTblCellMar.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblCellMar.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblCellMar.type, var1);
      }

   }
}
