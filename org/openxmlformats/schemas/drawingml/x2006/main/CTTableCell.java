package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.w3c.dom.Node;

public interface CTTableCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablecell3ac1type");


   CTTextBody getTxBody();

   boolean isSetTxBody();

   void setTxBody(CTTextBody var1);

   CTTextBody addNewTxBody();

   void unsetTxBody();

   CTTableCellProperties getTcPr();

   boolean isSetTcPr();

   void setTcPr(CTTableCellProperties var1);

   CTTableCellProperties addNewTcPr();

   void unsetTcPr();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   int getRowSpan();

   XmlInt xgetRowSpan();

   boolean isSetRowSpan();

   void setRowSpan(int var1);

   void xsetRowSpan(XmlInt var1);

   void unsetRowSpan();

   int getGridSpan();

   XmlInt xgetGridSpan();

   boolean isSetGridSpan();

   void setGridSpan(int var1);

   void xsetGridSpan(XmlInt var1);

   void unsetGridSpan();

   boolean getHMerge();

   XmlBoolean xgetHMerge();

   boolean isSetHMerge();

   void setHMerge(boolean var1);

   void xsetHMerge(XmlBoolean var1);

   void unsetHMerge();

   boolean getVMerge();

   XmlBoolean xgetVMerge();

   boolean isSetVMerge();

   void setVMerge(boolean var1);

   void xsetVMerge(XmlBoolean var1);

   void unsetVMerge();


   public static final class Factory {

      public static CTTableCell newInstance() {
         return (CTTableCell)POIXMLTypeLoader.newInstance(CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell newInstance(XmlOptions var0) {
         return (CTTableCell)POIXMLTypeLoader.newInstance(CTTableCell.type, var0);
      }

      public static CTTableCell parse(String var0) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(File var0) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(URL var0) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(InputStream var0) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(Reader var0) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(XMLStreamReader var0) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(Node var0) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static CTTableCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static CTTableCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableCell)POIXMLTypeLoader.parse(var0, CTTableCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCell.type, var1);
      }

   }
}
