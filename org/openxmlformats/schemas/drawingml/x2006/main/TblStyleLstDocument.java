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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList;
import org.w3c.dom.Node;

public interface TblStyleLstDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TblStyleLstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("tblstylelst4997doctype");


   CTTableStyleList getTblStyleLst();

   void setTblStyleLst(CTTableStyleList var1);

   CTTableStyleList addNewTblStyleLst();


   public static final class Factory {

      public static TblStyleLstDocument newInstance() {
         return (TblStyleLstDocument)POIXMLTypeLoader.newInstance(TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument newInstance(XmlOptions var0) {
         return (TblStyleLstDocument)POIXMLTypeLoader.newInstance(TblStyleLstDocument.type, var0);
      }

      public static TblStyleLstDocument parse(String var0) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(File var0) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(URL var0) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(InputStream var0) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(Reader var0) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(XMLStreamReader var0) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(Node var0) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static TblStyleLstDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static TblStyleLstDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (TblStyleLstDocument)POIXMLTypeLoader.parse(var0, TblStyleLstDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TblStyleLstDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TblStyleLstDocument.type, var1);
      }

   }
}
