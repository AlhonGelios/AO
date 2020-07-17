package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList;
import org.w3c.dom.Node;

public interface CmLstDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CmLstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cmlst3880doctype");


   CTCommentList getCmLst();

   void setCmLst(CTCommentList var1);

   CTCommentList addNewCmLst();


   public static final class Factory {

      public static CmLstDocument newInstance() {
         return (CmLstDocument)POIXMLTypeLoader.newInstance(CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument newInstance(XmlOptions var0) {
         return (CmLstDocument)POIXMLTypeLoader.newInstance(CmLstDocument.type, var0);
      }

      public static CmLstDocument parse(String var0) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(File var0) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(URL var0) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(InputStream var0) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(Reader var0) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(XMLStreamReader var0) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(Node var0) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static CmLstDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static CmLstDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CmLstDocument)POIXMLTypeLoader.parse(var0, CmLstDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CmLstDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CmLstDocument.type, var1);
      }

   }
}
