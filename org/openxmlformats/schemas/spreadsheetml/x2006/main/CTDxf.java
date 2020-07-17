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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt;
import org.w3c.dom.Node;

public interface CTDxf extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDxf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdxfa3b1type");


   CTFont getFont();

   boolean isSetFont();

   void setFont(CTFont var1);

   CTFont addNewFont();

   void unsetFont();

   CTNumFmt getNumFmt();

   boolean isSetNumFmt();

   void setNumFmt(CTNumFmt var1);

   CTNumFmt addNewNumFmt();

   void unsetNumFmt();

   CTFill getFill();

   boolean isSetFill();

   void setFill(CTFill var1);

   CTFill addNewFill();

   void unsetFill();

   CTCellAlignment getAlignment();

   boolean isSetAlignment();

   void setAlignment(CTCellAlignment var1);

   CTCellAlignment addNewAlignment();

   void unsetAlignment();

   CTBorder getBorder();

   boolean isSetBorder();

   void setBorder(CTBorder var1);

   CTBorder addNewBorder();

   void unsetBorder();

   CTCellProtection getProtection();

   boolean isSetProtection();

   void setProtection(CTCellProtection var1);

   CTCellProtection addNewProtection();

   void unsetProtection();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTDxf newInstance() {
         return (CTDxf)POIXMLTypeLoader.newInstance(CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf newInstance(XmlOptions var0) {
         return (CTDxf)POIXMLTypeLoader.newInstance(CTDxf.type, var0);
      }

      public static CTDxf parse(String var0) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(File var0) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(URL var0) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(InputStream var0) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(Reader var0) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(XMLStreamReader var0) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(Node var0) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static CTDxf parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, (XmlOptions)null);
      }

      public static CTDxf parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDxf)POIXMLTypeLoader.parse(var0, CTDxf.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDxf.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDxf.type, var1);
      }

   }
}
