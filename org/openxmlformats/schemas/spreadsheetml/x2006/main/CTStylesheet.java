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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles;
import org.w3c.dom.Node;

public interface CTStylesheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStylesheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstylesheet4257type");


   CTNumFmts getNumFmts();

   boolean isSetNumFmts();

   void setNumFmts(CTNumFmts var1);

   CTNumFmts addNewNumFmts();

   void unsetNumFmts();

   CTFonts getFonts();

   boolean isSetFonts();

   void setFonts(CTFonts var1);

   CTFonts addNewFonts();

   void unsetFonts();

   CTFills getFills();

   boolean isSetFills();

   void setFills(CTFills var1);

   CTFills addNewFills();

   void unsetFills();

   CTBorders getBorders();

   boolean isSetBorders();

   void setBorders(CTBorders var1);

   CTBorders addNewBorders();

   void unsetBorders();

   CTCellStyleXfs getCellStyleXfs();

   boolean isSetCellStyleXfs();

   void setCellStyleXfs(CTCellStyleXfs var1);

   CTCellStyleXfs addNewCellStyleXfs();

   void unsetCellStyleXfs();

   CTCellXfs getCellXfs();

   boolean isSetCellXfs();

   void setCellXfs(CTCellXfs var1);

   CTCellXfs addNewCellXfs();

   void unsetCellXfs();

   CTCellStyles getCellStyles();

   boolean isSetCellStyles();

   void setCellStyles(CTCellStyles var1);

   CTCellStyles addNewCellStyles();

   void unsetCellStyles();

   CTDxfs getDxfs();

   boolean isSetDxfs();

   void setDxfs(CTDxfs var1);

   CTDxfs addNewDxfs();

   void unsetDxfs();

   CTTableStyles getTableStyles();

   boolean isSetTableStyles();

   void setTableStyles(CTTableStyles var1);

   CTTableStyles addNewTableStyles();

   void unsetTableStyles();

   CTColors getColors();

   boolean isSetColors();

   void setColors(CTColors var1);

   CTColors addNewColors();

   void unsetColors();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTStylesheet newInstance() {
         return (CTStylesheet)POIXMLTypeLoader.newInstance(CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet newInstance(XmlOptions var0) {
         return (CTStylesheet)POIXMLTypeLoader.newInstance(CTStylesheet.type, var0);
      }

      public static CTStylesheet parse(String var0) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(File var0) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(URL var0) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(InputStream var0) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(Reader var0) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(XMLStreamReader var0) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(Node var0) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static CTStylesheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static CTStylesheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStylesheet)POIXMLTypeLoader.parse(var0, CTStylesheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStylesheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStylesheet.type, var1);
      }

   }
}
