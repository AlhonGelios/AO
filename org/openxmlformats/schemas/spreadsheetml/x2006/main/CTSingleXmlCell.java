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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlCellPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.w3c.dom.Node;

public interface CTSingleXmlCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSingleXmlCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsinglexmlcell7790type");


   CTXmlCellPr getXmlCellPr();

   void setXmlCellPr(CTXmlCellPr var1);

   CTXmlCellPr addNewXmlCellPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   XmlUnsignedInt xgetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   String getR();

   STCellRef xgetR();

   void setR(String var1);

   void xsetR(STCellRef var1);

   long getConnectionId();

   XmlUnsignedInt xgetConnectionId();

   void setConnectionId(long var1);

   void xsetConnectionId(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTSingleXmlCell newInstance() {
         return (CTSingleXmlCell)POIXMLTypeLoader.newInstance(CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell newInstance(XmlOptions var0) {
         return (CTSingleXmlCell)POIXMLTypeLoader.newInstance(CTSingleXmlCell.type, var0);
      }

      public static CTSingleXmlCell parse(String var0) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(File var0) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(URL var0) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(InputStream var0) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(Reader var0) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(XMLStreamReader var0) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(Node var0) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static CTSingleXmlCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static CTSingleXmlCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSingleXmlCell)POIXMLTypeLoader.parse(var0, CTSingleXmlCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSingleXmlCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSingleXmlCell.type, var1);
      }

   }
}
