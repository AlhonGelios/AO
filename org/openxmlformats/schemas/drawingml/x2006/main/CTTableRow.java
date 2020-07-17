package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.w3c.dom.Node;

public interface CTTableRow extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablerow4ac7type");


   List getTcList();

   CTTableCell[] getTcArray();

   CTTableCell getTcArray(int var1);

   int sizeOfTcArray();

   void setTcArray(CTTableCell[] var1);

   void setTcArray(int var1, CTTableCell var2);

   CTTableCell insertNewTc(int var1);

   CTTableCell addNewTc();

   void removeTc(int var1);

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   long getH();

   STCoordinate xgetH();

   void setH(long var1);

   void xsetH(STCoordinate var1);


   public static final class Factory {

      public static CTTableRow newInstance() {
         return (CTTableRow)POIXMLTypeLoader.newInstance(CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow newInstance(XmlOptions var0) {
         return (CTTableRow)POIXMLTypeLoader.newInstance(CTTableRow.type, var0);
      }

      public static CTTableRow parse(String var0) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(File var0) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(URL var0) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(InputStream var0) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(Reader var0) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(XMLStreamReader var0) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(Node var0) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static CTTableRow parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static CTTableRow parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableRow)POIXMLTypeLoader.parse(var0, CTTableRow.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableRow.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableRow.type, var1);
      }

   }
}
